package model

class Mailingaddress {

    Country country
    String street
    String city
    String area
    String province
    String zipcode

    String toString (){
        String result=""
        if (street!=null && !street.isEmpty()) result+=street + ", "
        if (city!=null && !city.isEmpty()) result+=city + ", "
        if (province!=null && !province.isEmpty()) result+=province + ", "
        result+=country.name
        return result
    }

    static mapping = {

    }

    static constraints = {

        street (nullable:true, size:3..50)
        city (nullable:false, size:3..30)
        area (nullable:true)
        province (nullable:true)
        zipcode (nullable:true, size:5..7)
    }
}
