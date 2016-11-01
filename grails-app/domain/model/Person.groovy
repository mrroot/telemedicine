package model

import admin.User

class Person {

    // Base class for storing most of personal information

    String first_name
    String middle_name
    String last_name
    Date date_of_birth
    Gender gender
    Date date_filled
    Date last_updated
    String shortname
    String officialID
    String localID
    String mainContact
    String secondaryContact
    String email
    Mailingaddress mailingaddress
    String comments
    User securityUser

    String toString() {
        shortname
    }

    static mapping = {

    }

    static constraints = {
        first_name(size: 2..30, blank: false)
        middle_name(size: 3..50, nullable: true)
        last_name(size: 2..30, blank: false)
        date_of_birth(nullable: true)
        gender(default: '121103')
        date_filled(nullable: true)
        last_updated(nullable: true)
        shortname(nullable: true)
        localID(nullable: true)
        mainContact(nullable: true)
        secondaryContact(nullable: true)
        email(email: true, nullable: true)
        mailingaddress(nullable: true)
        comments(nullable: true)
    }



    def genShortName() {
        if (date_of_birth && first_name && last_name) {
            // Make name look nice
            first_name = first_name.toLowerCase().capitalize()
            middle_name = middle_name.toLowerCase().capitalize()
            last_name = last_name.toLowerCase().capitalize()
            // Generate unique patient ID and store it
        }

        def String minitial = ""
        if (middle_name) {minitial = middle_name[0].capitalize() + "."}
        //Generate short name and store it in database
        shortname = last_name.capitalize() + " " + first_name[0].capitalize() + "." + minitial
    }

    def beforeInsert() { // Autofills some fields with generated values

        if (gender == null) {gender = Gender.findByValue('121103')}
        genShortName()
        date_filled = new Date()
    }

    def beforeUpdate() {
        genShortName()

    }


}