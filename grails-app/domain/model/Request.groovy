package model

class Request {

    Patient owner
    Act act
    RequestType requestType
    Complain complain
    Date dtCreated
    String comments

    static constraints = {
    }
}
