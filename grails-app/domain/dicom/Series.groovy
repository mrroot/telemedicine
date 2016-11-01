package dicom

class Series {
    String series_iuid
    String series_no
    String modality
    String body_part
    String laterality
    String series_desc
    String institution
    String station_name
    String department
    String perf_physician
    Integer num_instances
    String src_aet
    Date created_time

    static constraints = {
    }
    static hasMany = [instances: Instance]
    def Study study
    static belongsTo = [Study]
}
