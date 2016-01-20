package ck.solo

class RubType {

    String name

    static hasMany = [rubbishes : Rubbish]

    static constraints = {
        name blank: false
    }

    @Override
    public String toString() {
        name
    }
}
