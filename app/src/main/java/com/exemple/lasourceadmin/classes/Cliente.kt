package com.exemple.lasourceadmin.classes

class Cliente(var nome: String,
              var clienteDesde: Int,
              var telefone: Int,
              var endereco: String,
              var pedidosMes: Double,
              var nPedidosMes: Int,
              var pedidosTotal: Double,
              var nPedidosTotal: Int,
              var pedidos: MutableList<Venda>,
              var favorito: Produto)