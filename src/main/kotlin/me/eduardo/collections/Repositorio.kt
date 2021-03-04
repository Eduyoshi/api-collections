package me.eduardo.collections

class Repositorio<t> {
    private val map = mutableMapOf<String, t>()

    fun create(id: String, value: t){
        map[id] = value
    }

    fun remove(id:String) = map.remove(id)

    fun findById(id:String) = map[id]

    fun findAll() = map.values
}