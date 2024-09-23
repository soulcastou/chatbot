@startuml
skinparam ClassAttributeIconSize 0
class Cliente {
    - nombre: String
    - email: String

}

class Producto {
    - nombreProducto String 
    - precio double 
}

class Pedido {
    - Cliente cliente
    - Producto producto
    - int cantidad
    + double calcularTotal()
}

Cliente "1" -- "0..*" Pedido 
Producto "0..*" -- "1" Pedido 



class "juan:cliente" {
    nombre = "Juan Pérez"
    email = "juan.perez@mail.com"
}

class "laura:cliente" {
    nombre= "Laura Gómez"
    email= "laura.gomez@mail.com"
}

class "producto1:Producto"{
    nombreProducto = "laptop"
    precio = 1200

}

class "producto2:Producto"{
    nombreProducto = "smartphone"
    precio = 800

}

class "pedido1:Pedido"{
    producto = producto1
    cantidad = 1
}

class "pedido2:Pedido"{
    producto = producto2
    cantidad = 2
}
"juan:cliente"  "1" -- "1" "pedido1:Pedido"
"pedido1:Pedido" "1" -- "1" "producto1:Producto"


"laura:cliente" "1" -- "1" "pedido2:Pedido"
"pedido2:Pedido" "1" -- "1" "producto2:Producto"

@enduml
