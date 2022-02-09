class Medico {
    var crm: String? = null
        get() = if(field.isNullOrEmpty()) "CRM não informado" else field
        set(value) {
            field = if(value?.length == 6) value else null
        }
    var endereco: Endereco? = null

}