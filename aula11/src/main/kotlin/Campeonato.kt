class Campeonato(
    private val ano: Short
) {
    private var times = mutableListOf<Time>()

    fun cadastrarTime(time: Time): Boolean = if (times.size < 20) times.add(time) else false

    fun buscarTimePorNome(nome:String):Time?{
        if(nome.isEmpty()) return null

        return times.first { t -> t.nome.equals(nome,true) }
    }

    fun editarTime(objTime: Time){
        val time = buscarTimePorNome(objTime.nome)
        if(time != null)
            times[times.indexOf(time)] = objTime
    }

    fun listarTimesPorDivisao(divisao: Divisao) = times.filter { t -> t.divisao == divisao }

    fun listarTodosOsTimes() = times

    fun removerTime(nome: String):Boolean{
        val time = buscarTimePorNome(nome)
        if(time != null)
            return times.remove(time)
        return false
    }
}