class Internacao {
    var medicoResponsavel: Medico? = null
        get() = if(field == null) Medico() else field
        set(value) {
            if(value != null){
                field = value
            }
        }
    var paciente:Paciente? = null
        get() = if(field == null) Paciente() else field
        set(value) {
            if(value != null){
                field = value
            }
        }
}