package model

class Country {
    String sname
    String description

    static constraints = {
        name (size:3..30, blank:false)
        description (blank:true)
        // flag (nullable:true)
    }
}
