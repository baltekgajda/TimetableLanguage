package main.lexerParser;

import main.exceptions.MultipleVariableDeclarationException;
import main.exceptions.TTException;
import main.exceptions.VariableUndeclaredException;
import main.lexerParser.gen.ttBaseVisitor;
import main.lexerParser.gen.ttParser;
import main.TTFunctions;

import java.util.ArrayList;
import java.util.HashMap;

public class TTVisitor extends ttBaseVisitor<Variable> {

    private final HashMap<String, Variable> variablesHashMap;
    private final HashMap<String, ArrayList<String>> timetablesHashMap;
    private final TTFunctions ttFunctions;

    public TTVisitor() {
        variablesHashMap = new HashMap<>();
        timetablesHashMap = new HashMap<>();
        ttFunctions = new TTFunctions();

        timetablesHashMap.put("a",new ArrayList<>());
        timetablesHashMap.put("b",new ArrayList<>());
        timetablesHashMap.put("c",new ArrayList<>());
        timetablesHashMap.put("d",new ArrayList<>());
    }

    @Override
    public Variable visitScript(ttParser.ScriptContext ctx)
    {
        for (int i = 0; i < ctx.statement().size(); i++)
            visitStatement(ctx.statement(i));
        return null;
    }

    @Override
    public Variable visitStatement(ttParser.StatementContext ctx) {
        if (ctx.if_statement() != null) return visitIf_statement(ctx.if_statement());
        if (ctx.while_statement() != null) return visitWhile_statement(ctx.while_statement());
        if (ctx.for_loop() != null) return visitFor_loop(ctx.for_loop());
        if (ctx.declaration_statement() != null) return visitDeclaration_statement(ctx.declaration_statement());
        if (ctx.assignement_statement() != null) return visitAssignement_statement(ctx.assignement_statement());
        if (ctx.timetable_statements() != null) return visitTimetable_statements(ctx.timetable_statements());
        if (ctx.print_statement() != null) return visitPrint_statement(ctx.print_statement());
        return null;
    }

    @Override
    public Variable visitIf_statement(ttParser.If_statementContext ctx)
    {
            if(visitCondition(ctx.condition()).getValue().equals("true"))
                visitInstructions(ctx.instructions(0));
            else if (ctx.ELSE() != null)
                visitInstructions(ctx.instructions(1));
        return null;
    }

    @Override
    public Variable visitWhile_statement(ttParser.While_statementContext ctx)
    {
        while(visitCondition(ctx.condition()).getValue().equals("true")) {
            visitInstructions(ctx.instructions());
        }
        return null;
    }

    @Override
    public Variable visitFor_loop(ttParser.For_loopContext ctx)
    {
        if(variablesHashMap.containsKey(ctx.VARIABLE_NAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARIABLE_NAME(0).getText() +
                    " is already declared.");

        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME(1).getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(1).getText() +
                    " is not declared.");

        if(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getType()!=Type.TIMETABLE_DATA)
            throw new TTException("Loop variable: " + ctx.VARIABLE_NAME(1).getText() +
                    " is of wrong type (should be TimetableData)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME(1).getText());

        visitList_tt_statement(ctx.list_tt_statement());
        ArrayList<String> timetables = timetablesHashMap.get(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue());
        for(int i=0;i<timetables.size();i++)
        {
            variablesHashMap.put(ctx.VARIABLE_NAME(0).getText(),new Variable(Type.TIMETABLE,ctx.VARIABLE_NAME(0).getText(),timetables.get(i)));
            visitInstructions(ctx.instructions());
            variablesHashMap.remove(ctx.VARIABLE_NAME(0).getText());
        }
        return null;
    }

    @Override
    public Variable visitDeclaration_statement(ttParser.Declaration_statementContext ctx)
    {
        if (ctx.type_declaration() != null) return visitType_declaration(ctx.type_declaration());
        if (ctx.string_declaration() != null) return visitString_declaration(ctx.string_declaration());
        if (ctx.int_declaration() != null) return visitInt_declaration(ctx.int_declaration());
        if (ctx.timetable_declaration() != null) return visitTimetable_declaration(ctx.timetable_declaration());
        if (ctx.timetable_data_declaration() != null) return visitTimetable_data_declaration(ctx.timetable_data_declaration());
        return null;
    }

    @Override
    public Variable visitAssignement_statement(ttParser.Assignement_statementContext ctx)
    {
        if (ctx.type_assignment() != null) return visitType_assignment(ctx.type_assignment());
        if (ctx.string_assignment() != null) return visitString_assignment(ctx.string_assignment());
        if (ctx.int_assignment() != null) return visitInt_assignment(ctx.int_assignment());
        if (ctx.timetable_assignment() != null) return visitTimetable_assignment(ctx.timetable_assignment());
        if (ctx.timetable_data_assignment() != null) return visitTimetable_data_assignment(ctx.timetable_data_assignment());
        return null;
    }

    @Override
    public Variable visitTimetable_statements(ttParser.Timetable_statementsContext ctx)
    {
        if (ctx.gen_timetable() != null) return visitGen_timetable(ctx.gen_timetable());
        if (ctx.print_tt_statistics() != null) return visitPrint_tt_statistics(ctx.print_tt_statistics());
        if (ctx.generate_PDF() != null) return visitGenerate_PDF(ctx.generate_PDF());
        if (ctx.print_tt_data_statistics() != null) return visitPrint_tt_data_statistics(ctx.print_tt_data_statistics());
        return null;
    }

    @Override
    public Variable visitPrint_statement(ttParser.Print_statementContext ctx)
    {
        String result="";
        for(int i=0;i<ctx.print_types().size();i++)
        {
            Variable variable = visitPrint_types(ctx.print_types(i));
            if(variable.getType()==Type.INTEGER)
                result+=variable.getValue();
            else
                result += variable.getValue().replace("\"","");

        }

        ttFunctions.print(result);
        return null;
    }

    @Override
    public Variable visitPrint_types(ttParser.Print_typesContext ctx)
    {
        if(ctx.VARIABLE_NAME()!=null) {
            if (!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
                throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                        " is not declared.");

            if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType() == Type.TIMETABLE
                    || variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType() == Type.TIMETABLE_DATA)
                throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                        " is of wrong type (should be Integer or String)");

            if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue() == null)
                throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

                return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
        } else if(ctx.STRING()!=null)
            return new Variable(Type.STRING,null,ctx.STRING().getText());
        else return visitReturn_statement(ctx.return_statement());
    }

    @Override
    public Variable visitPrint_tt_statistics(ttParser.Print_tt_statisticsContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is of wrong type (should be Timetable)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

        String result = variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue();
        ttFunctions.printTT(result);
        return null;
    }

    @Override
    public Variable visitPrint_tt_data_statistics(ttParser.Print_tt_data_statisticsContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE_DATA)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is of wrong type (should be TimetableData)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

        String result = variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue();
        ttFunctions.printTTData(result);
        return null;
    }

    @Override
    public Variable visitGenerate_PDF(ttParser.Generate_PDFContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is of wrong type (should be Timetable)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

        ttFunctions.generatePDF(variablesHashMap.get(ctx.VARIABLE_NAME().getText()));
        return null;
    }

    @Override
    public Variable visitList_tt_statement(ttParser.List_tt_statementContext ctx)
    {
        ttFunctions.listTT();
        return null;
    }

    @Override
    public Variable visitOpen_timetable_data(ttParser.Open_timetable_dataContext ctx)
    {
        String name = ctx.STRING().getText();
        name = name.replace("\"","");
        if(timetablesHashMap.containsKey(name))
            return new Variable(Type.TIMETABLE_DATA,null,name);
        else
            return new Variable(Type.TIMETABLE_DATA,null,null);
    }

    @Override
    public Variable visitGen_timetable(ttParser.Gen_timetableContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE_DATA)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is of wrong type (should be TimetableData)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

        String ttDataName = variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue();
        String ttName = ttFunctions.generateTimetable(ttDataName,timetablesHashMap.get(ttDataName).size());
        timetablesHashMap.get(ttDataName).add(ttName);
        return new Variable(Type.TIMETABLE,null,ttName);
    }

    @Override
    public Variable visitReturn_statement(ttParser.Return_statementContext ctx)
    {
        if (ctx.get_fitness() != null) return visitGet_fitness(ctx.get_fitness());
        if (ctx.get_classroom_count() != null) return visitGet_classroom_count(ctx.get_classroom_count());
        return null;
    }

    @Override
    public Variable visitGet_fitness(ttParser.Get_fitnessContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is of wrong type (should be Timetable)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

        int fitness = ttFunctions.getFitness();
        return new Variable(null,null,String.valueOf(fitness));
    }

    @Override
    public Variable visitGet_classroom_count(ttParser.Get_classroom_countContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if (variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE_DATA)
            throw new TTException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is of wrong type (should be TimetableData)");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME().getText());

        int count = ttFunctions.getClassroomCount(ctx.VARIABLE_NAME().getText());
        return new Variable(Type.INTEGER,null,String.valueOf(count));
    }

    @Override
    public Variable visitType_declaration(ttParser.Type_declarationContext ctx)
    {
        if(variablesHashMap.containsKey(ctx.VARIABLE_NAME(0).getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARIABLE_NAME(0).getText() +
                    " is already declared.");

        if(ctx.ASSIGNMENT()!=null)
        {
            if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME(1).getText()))
                throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(1).getText() +
                        " is not declared.");

            if (variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getType() != visitType(ctx.type()).getType())
                throw new TTException("Variable: " + ctx.VARIABLE_NAME(1).getText() +
                        " is of wrong type");

            if (variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue()==null)
                throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME(1).getText());

            variablesHashMap.put(ctx.VARIABLE_NAME(0).getText(),
                    new Variable(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getType(), ctx.VARIABLE_NAME(0).getText(),variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue()));
            return variablesHashMap.get(ctx.VARIABLE_NAME(0).getText());
        } else {
            variablesHashMap.put(ctx.VARIABLE_NAME(0).getText(),
                    new Variable(visitType(ctx.type()).getType(), ctx.VARIABLE_NAME(0).getText(), null));
            return variablesHashMap.get(ctx.VARIABLE_NAME(0).getText());
        }
    }

    @Override
    public Variable visitString_declaration(ttParser.String_declarationContext ctx)
    {
        if(variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is already declared.");

        variablesHashMap.put(ctx.VARIABLE_NAME().getText(),
                new Variable(Type.STRING,ctx.VARIABLE_NAME().getText(),ctx.STRING().getText()));
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitInt_declaration(ttParser.Int_declarationContext ctx)
    {
        if(variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is already declared.");

        String value = null;
        if (ctx.mathExpression() != null)
            value = visitMathExpression(ctx.mathExpression()).getValue();
        else if (ctx.return_statement() != null)
            value = visitReturn_statement(ctx.return_statement()).getValue();
        else if(ctx.INTEGER()!=null)
            value=ctx.INTEGER().getText();

        variablesHashMap.put(ctx.VARIABLE_NAME().getText(),
                new Variable(Type.INTEGER,ctx.VARIABLE_NAME().getText(),value));
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitTimetable_data_declaration(ttParser.Timetable_data_declarationContext ctx)
    {
        if(variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is already declared.");

        Variable variable = visitOpen_timetable_data(ctx.open_timetable_data());
        variable.setVariableName(ctx.VARIABLE_NAME().getText());
        ttFunctions.openTimetableData(variable);
        variablesHashMap.put(ctx.VARIABLE_NAME().getText(), variable);
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitTimetable_declaration(ttParser.Timetable_declarationContext ctx)
    {
        if(variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new MultipleVariableDeclarationException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is already declared.");

        Variable variable = visitGen_timetable(ctx.gen_timetable());
        variable.setVariableName(ctx.VARIABLE_NAME().getText());
        variablesHashMap.put(ctx.VARIABLE_NAME().getText(), variable);
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitType_assignment(ttParser.Type_assignmentContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME(0).getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(0).getText() +
                    " is not declared.");

        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME(1).getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(1).getText() +
                    " is not declared.");

        if(variablesHashMap.get(ctx.VARIABLE_NAME(0).getText()).getType()!=variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getType())
            throw new TTException("Types mismatch while trying to assign");

        if(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue()==null)
            throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME(1).getText());

        variablesHashMap.get(ctx.VARIABLE_NAME(0).getText()).setValue(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue());
        return variablesHashMap.get(ctx.VARIABLE_NAME(0).getText());
    }

    @Override
    public Variable visitString_assignment(ttParser.String_assignmentContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.STRING)
            throw new TTException("Types mismatch while trying to assign");

        variablesHashMap.get(ctx.VARIABLE_NAME().getText()).setValue(ctx.STRING().getText());
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitInt_assignment(ttParser.Int_assignmentContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.INTEGER)
            throw new TTException("Types mismatch while trying to assign");

        int result=0;
        if (ctx.mathExpression() != null)
            result=Integer.parseInt(visitMathExpression(ctx.mathExpression()).getValue());
        if (ctx.return_statement() != null)
            result=Integer.parseInt(visitReturn_statement(ctx.return_statement()).getValue());

        variablesHashMap.get(ctx.VARIABLE_NAME().getText()).setValue(String.valueOf(result));
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitTimetable_data_assignment(ttParser.Timetable_data_assignmentContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE_DATA)
            throw new TTException("Types mismatch while trying to assign");

        Variable variable = visitOpen_timetable_data(ctx.open_timetable_data());
        variablesHashMap.get(ctx.VARIABLE_NAME().getText()).setValue(variable.getValue());
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitTimetable_assignment(ttParser.Timetable_assignmentContext ctx)
    {
        if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME().getText()))
            throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME().getText() +
                    " is not declared.");

        if(variablesHashMap.get(ctx.VARIABLE_NAME().getText()).getType()!=Type.TIMETABLE)
            throw new TTException("Types mismatch while trying to assign");

        Variable variable = visitGen_timetable(ctx.gen_timetable());
        variablesHashMap.get(ctx.VARIABLE_NAME().getText()).setValue(variable.getValue());
        return variablesHashMap.get(ctx.VARIABLE_NAME().getText());
    }

    @Override
    public Variable visitType(ttParser.TypeContext ctx)
    {
        if (ctx.timetable_type() != null) return visitTimetable_type(ctx.timetable_type());
        if (ctx.timetable_data_type() != null) return visitTimetable_data_type(ctx.timetable_data_type());
        if (ctx.int_type() != null) return visitInt_type(ctx.int_type());
        if (ctx.string_type() != null) return visitString_type(ctx.string_type());
        return null;
    }

    @Override
    public Variable visitTimetable_type(ttParser.Timetable_typeContext ctx)
    {
        return new Variable(Type.TIMETABLE,null,null);
    }

    @Override
    public Variable visitTimetable_data_type(ttParser.Timetable_data_typeContext ctx)
    {
        return new Variable(Type.TIMETABLE_DATA,null,null);
    }

    @Override
    public Variable visitInt_type(ttParser.Int_typeContext ctx)
    {
        return new Variable(Type.INTEGER,null,null);
    }

    @Override
    public Variable visitString_type(ttParser.String_typeContext ctx)
    {
        return new Variable(Type.STRING,null,null);
    }

    @Override
    public Variable visitInstructions(ttParser.InstructionsContext ctx)
    {
        for(int i=0; i<ctx.statement().size();i++)
            visitStatement(ctx.statement(i));
        return null;
    }

    @Override
    public Variable visitCondition(ttParser.ConditionContext ctx)
    {
        return visitAlternative(ctx.alternative());
    }

    @Override
    public Variable visitAlternative(ttParser.AlternativeContext ctx)
    {
        for(int i=0; i<ctx.conjunction().size();i++)
            if(visitConjunction(ctx.conjunction(i)).getValue().equals("true"))
                return new Variable(null,null,"true");

        return new Variable(null,null,"false");
    }

    @Override
    public Variable visitConjunction(ttParser.ConjunctionContext ctx)
    {
        for(int i=0; i<ctx.comparison().size();i++)
            if(visitComparison(ctx.comparison(i)).getValue().equals("false"))
                return new Variable(null,null,"false");
        return new Variable(null,null,"true");
    }

    @Override
    public Variable visitComparison(ttParser.ComparisonContext ctx)
    {
        for(int i=0; i<ctx.VARIABLE_NAME().size();i++)
        {
            if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME(i).getText()))
                throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(i).getText() +
                        " is not declared.");

            if (variablesHashMap.get(ctx.VARIABLE_NAME(i).getText()).getType() != Type.INTEGER)
                throw new TTException("Variable: " + ctx.VARIABLE_NAME(i).getText() +
                        " is of wrong type (Should be Integer)");

            if(variablesHashMap.get(ctx.VARIABLE_NAME(i).getText()).getValue()==null)
                throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME(i).getText());
        }

        Integer first=null, second=null;
        if(ctx.VARIABLE_NAME(0)!=null)
            first=Integer.parseInt(variablesHashMap.get(ctx.VARIABLE_NAME(0).getText()).getValue());
        if(ctx.INTEGER(0)!=null)
        {
            if(first==null)
                first=Integer.parseInt(ctx.INTEGER(0).getText());
            else
                second=Integer.parseInt(ctx.INTEGER(0).getText());
        }
        if(ctx.mathExpression(0)!=null) {
            if (first == null)
                first = Integer.parseInt(visitMathExpression(ctx.mathExpression(0)).getValue());
            else
                second = Integer.parseInt(visitMathExpression(ctx.mathExpression(0)).getValue());
        }
        if(ctx.return_statement(0)!=null)
        {
            if(first==null)
                first = Integer.parseInt(visitReturn_statement(ctx.return_statement(0)).getValue());
            else
                second= Integer.parseInt(visitReturn_statement(ctx.return_statement(0)).getValue());
        }

        if(ctx.VARIABLE_NAME(1)!=null)
            second=Integer.parseInt(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue());
        else if(ctx.INTEGER(1)!=null)
            second=Integer.parseInt(ctx.INTEGER(1).getText());
        else if(ctx.mathExpression(1)!=null)
            second = Integer.parseInt(visitMathExpression(ctx.mathExpression(1)).getValue());
        else if(ctx.return_statement(1)!=null)
            second = Integer.parseInt(visitReturn_statement(ctx.return_statement(1)).getValue());

        Variable trueVariable = new Variable(null,null,"true");
        switch (ctx.COMPARISON().getText()) {
            case "==":
                if(first==second)
                    return trueVariable;
                break;
            case "!=":
                if(first!=second)
                    return trueVariable;
                break;
            case "<":
                if(first<second)
                    return trueVariable;
                break;
            case ">":
                if(first>second)
                    return trueVariable;
                break;
            case "<=":
                if(first<=second)
                    return trueVariable;
                break;
            case ">=":
                if(first>=second)
                    return trueVariable;
                break;
        }
        return new Variable(null,null,"false");
    }

    @Override
    public Variable visitMathExpression(ttParser.MathExpressionContext ctx)
    {
        for(int i=0; i<ctx.VARIABLE_NAME().size();i++)
        {
            if(!variablesHashMap.containsKey(ctx.VARIABLE_NAME(i).getText()))
                throw new VariableUndeclaredException("Variable: " + ctx.VARIABLE_NAME(i).getText() +
                        " is not declared.");

            if (variablesHashMap.get(ctx.VARIABLE_NAME(i).getText()).getType() != Type.INTEGER)
                throw new TTException("Variable: " + ctx.VARIABLE_NAME(i).getText() +
                        " is of wrong type (Should be Integer)");

            if(variablesHashMap.get(ctx.VARIABLE_NAME(i).getText()).getValue()==null)
                throw new NullPointerException("Null variable: " + ctx.VARIABLE_NAME(i).getText());
        }

        Integer first=null, second=null;
        if(ctx.VARIABLE_NAME(0)!=null)
            first=Integer.parseInt(variablesHashMap.get(ctx.VARIABLE_NAME(0).getText()).getValue());
        if(ctx.INTEGER(0)!=null)
        {
            if(first==null)
                first=Integer.parseInt(ctx.INTEGER(0).getText());
            else
                second=Integer.parseInt(ctx.INTEGER(0).getText());
        }
        if(ctx.mathExpression(0)!=null) {
            if (first == null)
                first = Integer.parseInt(visitMathExpression(ctx.mathExpression(0)).getValue());
            else
                second = Integer.parseInt(visitMathExpression(ctx.mathExpression(0)).getValue());
        }
        if(ctx.return_statement(0)!=null)
        {
            if(first==null)
                first = Integer.parseInt(visitReturn_statement(ctx.return_statement(0)).getValue());
            else
                second= Integer.parseInt(visitReturn_statement(ctx.return_statement(0)).getValue());
        }

        if(ctx.VARIABLE_NAME(1)!=null)
            second=Integer.parseInt(variablesHashMap.get(ctx.VARIABLE_NAME(1).getText()).getValue());
        else if(ctx.INTEGER(1)!=null)
            second=Integer.parseInt(ctx.INTEGER(1).getText());
        else if(ctx.mathExpression(1)!=null)
            second = Integer.parseInt(visitMathExpression(ctx.mathExpression(1)).getValue());
        else if(ctx.return_statement(1)!=null)
            second = Integer.parseInt(visitReturn_statement(ctx.return_statement(1)).getValue());

        int result=0;
        if(ctx.PLUS()!=null)
            result=first+second;
        else if(ctx.MINUS()!=null)
            result=first-second;
        else if(ctx.MULTIPLY()!=null)
            result=first*second;
        else if(ctx.DIVIDE()!=null)
            result=first/second;
        return new Variable(null,null,String.valueOf(result));
    }

}

