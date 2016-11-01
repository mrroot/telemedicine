package model

class Observation {

    Patient patient
    Request request
    ObservationType observationType
    Act act
    String observationText

    Physician performer

    static constraints = {
    }
}
