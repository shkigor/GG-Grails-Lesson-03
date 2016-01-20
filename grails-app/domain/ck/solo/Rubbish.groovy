package ck.solo

class Rubbish {

    String rubbishUrl
    String title
    String description
    Date dateCreated

    static belongsTo = [rubtype : RubType]

    static constraints = {
        rubbishUrl unique: true, url: true, nullable: false
        title nullable: true
        description maxSize: 1024, nullable: true
        rubtype()
    }
}
