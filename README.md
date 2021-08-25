# Informatorio2021-Ecommerce
## Spring Rest
###### API Rest para un E-commerce ➡️ Tienda de calzados

Se desea crear una API para un E-Commerce (el rubro es a elección.
Indumentaria, Juguetes, etc). En esta primera entrega de la API se desea
almacenar las entidades:

### **Entidades:**
- **Usuario:** 
  - _Atributos:_ Nombre, Apellido, Dirección, Fecha de Alta (creación)
- **Producto:**
  - _Atributos:_ Nombre, Descripción, precio unitario, código de 
inventario (no es el id, pero es único) y categoría (depende del
rubro que elijan).
- **Carrito:**
  - _Atributos:_ Fecha de creación, usuario y productos relacionados.
Además de estado (en curso o cerrado. Solo puede haber 1
carrito en curso por usuario)
  - _Observación:_ Recuerden que se debe normalizar la línea/detalle
de carrito.

### **Operaciones:**
- CRUD Usuarios - Id para el commit **CART-0001**
- CRUD Productos - Id para el commit **CART-0002**
- CRUD Carrito - Id para el commit **CART-0003**
  - Agregar Productos - Id para el commit **CART-0006**
  - Eliminar Productos - - Id para el commit **CART-0007**
- Buscar Productos:
  - Todos los productos que tengan un nombre que comience con
un string dado - Id para el commit **CART-0004**
  - Todos los productos de una categoría dada - Id para el commit
**CART-0005**
  
