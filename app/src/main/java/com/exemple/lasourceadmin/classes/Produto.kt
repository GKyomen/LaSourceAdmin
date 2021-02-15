package com.exemple.lasourceadmin.classes

class Produto(nome: String, validade: Int, var valor: Double, var receita: MutableList<Ingrediente>) : Item(nome, validade)