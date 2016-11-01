package model


class Gender {

    // Base class to describe gender types (also needed for HL7 messaging and modality worklists)

/*	Dicom sex designation
	M Male Male sex
	F Female Female sex
	U Unknown Sex Unknown Sex
	MP Male Pseudohermaphrodite
	FP Female Pseudohermaphrodite
	H  Hermaphrodite Hermaphrodite
	MC Male sex changed to Female sex
	FC Female sex changed to Male sex
	121104 Ambiguous sex Ambiguous sex
	121032 Sex of subject for clinical purposes
	121102 Other sex Other sex
	121103 Undetermined sex (temporarily)
*/

//	Byte[] pict
    String value
    String name // In local language
    String description

    static constraints = {
        value (size:1..8, blank:false, unique:true, inList:['M','F','O','U', 'MP','FP','H','MC','FC','121104',
                                                            '121032', '121102','121103'])
        name (size: 3..20, blank:false)
        description (nullable:true)
    }

}
