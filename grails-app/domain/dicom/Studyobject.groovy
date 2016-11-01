package dicom

import model.Patient

class Studyobject {

    Patient patient

    String pat_name // This is from DICOM tags, so may differ from our records
    String pat_birthdate
    String pat_sex
    Date created_time


    static constraints = {
    }

    static hasMany = [studies: Study]

}
