package model

class Messages {

    Request perRequest
    String sender
    String recepient
    String subject
    String messageText
    String signature
    ActionState currentState
    Date dtCreated
    Date dtSent

    static constraints = {
    }
}
