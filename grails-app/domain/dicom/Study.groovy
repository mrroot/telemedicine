package dicom

import model.Patient

class Study {

    String study_iuid
    String study_id
    Date study_datetime
    String accession_no
    String ref_physician
    String study_desc
    Integer num_series
    Integer num_instances
    Date checked_time

    static constraints = {
    }
    static hasMany = [series: Series]
    static belongsTo = [Studyobject]

}
