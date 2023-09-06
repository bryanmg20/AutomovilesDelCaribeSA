# AutomovilesDelCaribeSA
Laboratorio 1 estructura de datos
Caso de estudio
La empresa Automóviles del Caribe S. A. es una empresa comercializadora de autos y necesita crear un programa que le permita llevar los registros de sus empleados y las comisiones que ganan al final del mes, por lo cual han contratado a su equipo de trabajo para realizar este servicio. La situación actual de la empresa es la siguiente:
-	Los datos de sus empleados (Nombre, cédula, cargo, teléfono de contacto, fecha de ingreso, salario fijo mensual y salario más comisiones) se encuentran en un archivo de texto llamado Empleados, sin ningún orden específico.
-	Cada vez que un empleado realiza una venta de un auto, se registra este dato en un archivo llamado Ventas con la siguiente información: Nombre del vendedor, cédula, tipo de auto (marca), código del auto y monto de la venta.
Restricciones operativas
Considerar las siguientes restricciones en el diseño de su programa:
-	La cantidad mínima de empleados es de 20.
-	La cantidad mínima de tipos de autos es de 5.
-	En el archivo de ventas se pueden encontrar varias veces el mismo vendedor y varias veces el mismo tipo de auto. Sin embargo, el código del auto es único.
-	Se puede iniciar el programa con el archivo de Empleados ya creado, pero el archivo de Ventas debe ser generado por el programa.

Requerimientos funcionales
Desarrollar un programa a través del cual el usuario (administrador de la empresa) pueda hacer las siguientes operaciones:
1.	Agregar un nuevo registro en el archivo de Empleados.
2.	Eliminar un registro en el archivo de Empleados.
3.	Ordenar el archivo de Empleados por Nombre o por salario.
4.	Agregar un nuevo registro en el archivo de Ventas.
5.	Eliminar un registro en el archivo de Ventas. 
6.	Mostrar en pantalla una relación entre los tipos de autos, la cantidad vendida y el valor total. 
7.	Actualizar el campo salario más comisiones en el archivo de Empleados, teniendo en cuenta que si realizó una venta superior a $30 millones en el mes, recibirá un 2% de comisiones sobre la venta total.

Requerimientos no funcionales
Para tener un mejor uso del programa que usted ha creado, se deben cumplir con los siguientes requerimientos de calidad:
1.	El desarrollo debe incluir una interfaz gráfica donde se presente un menú al usuario para que pueda escoger la operación que desea realizar. 
2.	Tener un manejo adecuado de errores cuando se presenten los siguientes casos: “archivo no encontrado”, “archivo con registros errados” y los que usted considere. No ingresar un registro si contiene algún error: por ejemplo, una cédula mal digitada, un saldo negativo o un campo vacío. 
3.	Validaciones. En los casos que se quiera agregar un nuevo registro, se debe validar que el empleado (o el código del auto en el caso del archivo de Ventas) no exista en los registros actuales. Mostrar un mensaje al usuario que advierta que ya existe ese registro. En los casos que se quiera eliminar un registro, se debe verificar que el registro existe en el archivo.
4.	Código comentado adecuadamente sobre los procedimientos y estructuras utilizadas.

