package main.lexerParser;

import main.exceptions.TTException;


public class Variable implements Comparable<Variable> {

    private Type type;
    private String variableName;
    private String value;

    public Variable(Type type, String variableName, String value) {
        this.type = type;
        this.variableName = variableName;
        this.value = value;
    }

    @Override
    public int compareTo(Variable v) {
        if (!this.getType().equals(v.getType()))
            throw new TTException("Variables have to be the same type");
        if (this.getVariableName().equals(v.getVariableName()) || this.getValue().equals(v.getValue()))
            return 0;
        if (this.getType().equals(Type.INTEGER)) {
            return Integer.compare(Integer.valueOf(this.getVariableName()), Integer.valueOf(v.getVariableName()));
        } else {
            return -1;
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}