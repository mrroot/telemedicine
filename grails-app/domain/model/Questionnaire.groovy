package model

class Questionnaire {

    static hasMany = [questionnaireItems: QuestionnaireItem]
    QuestionnaireGroup questionnaireGroup
    String name
    String description

    static constraints = {
    }
}
