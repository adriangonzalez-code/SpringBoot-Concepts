# Spring Boot

## POO Fundamentals

### Herencia

Es un mecanismo mediante el cual una clase (denominada clase hija o subclase) hereda atributos y métodos de otra clase (llamada clase padre o superclase). Esto permite reutilizar código, facilitando la creación de nuevas clases que extienden la funcionalidad de las existentes sin tener que reescribirlas.

### Polimorfismo

El polimorfismo es la capacidad de un objeto de tomar diferentes formas o comportamientos en función del contexto en el que se utilice. En POO, esto se logra mediante la sobrescritura de métodos en clases hijas, lo que permite que un objeto de una clase hija se trate como un objeto de su clase padre. Esto permite escribir código más flexible y reutilizable. En otras palabras, permite que diferentes clases tengan métodos con el mismo nombre pero con comportamientos diferentes.

En POO, este concepto se aplica principalmente de dos formas:

1.  **Sobrescritura (Method Overriding):** Es el polimorfismo en **tiempo de ejecución**. Permite que una subclase proporcione una implementación específica de un método que ya está definido en su clase padre. Es fundamental para que un objeto de una clase hija se comporte de manera única aun siendo tratado como un tipo de la clase padre.
2.  **Sobrecarga (Method Overloading):** Es el polimorfismo en **tiempo de compilación**. Permite definir múltiples métodos con el mismo nombre dentro de una clase, siempre que sus parámetros sean distintos (en número o tipo).

En resumen, la sobrescritura cambia el comportamiento de un método heredado, mientras que la sobrecarga ofrece múltiples formas de invocar un mismo comportamiento con diferentes datos.

### Encapsulamiento

El encapsulamiento es la práctica de ocultar los detalles internos de una clase y exponer solo una interfaz pública para interactuar con ella. Esto se logra mediante el uso de modificadores de acceso (public, private, protected) y propiedades (getters y setters). El encapsulamiento permite proteger los datos de una clase de ser modificados de manera inadecuada y facilita la evolución del código sin afectar a las partes que lo utilizan.
