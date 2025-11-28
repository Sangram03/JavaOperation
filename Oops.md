Here are **all the OOP (Object-Oriented Programming) concepts** you need to know — from **basic to advanced** — explained clearly with examples (Java-focused since you learn Java).

---

# ✅ **TOTAL OOPS CONCEPTS (Complete List)**

## **1️⃣ Class**

A class is a blueprint/template for creating objects.

```java
class Car {
    String color;
    void drive() {
        System.out.println("Car is driving");
    }
}
```

---

## **2️⃣ Object**

An object is an instance of a class.

```java
Car obj = new Car();
```

---

## **3️⃣ Abstraction**

Hiding internal details and showing only necessary features.

Example: `Scanner`, `ArrayList`, `Car brake()`.

Using abstract class:

```java
abstract class Animal {
    abstract void sound();
}
```

---

## **4️⃣ Encapsulation**

Wrapping data + methods into a single unit (class) with private fields and public getters/setters.

```java
class Bank {
    private int balance = 5000;

    public int getBalance() { return balance; }
}
```

---

## **5️⃣ Inheritance**

Acquiring properties of one class into another.

```java
class Animal {}
class Dog extends Animal {}
```

---

## **6️⃣ Polymorphism**

Same name, different behavior.

### ▶️ **Compile-time polymorphism (method overloading)**

```java
void add(int a, int b) {}
void add(int a, int b, int c) {}
```

### ▶️ **Runtime polymorphism (method overriding)**

```java
class A { void show(){} }
class B extends A { void show(){} }
```

---

## **7️⃣ Association**

Relation between two separate classes.

### Types:

* **One-to-One**
* **One-to-Many**
* **Many-to-One**
* **Many-to-Many**

Example:

```java
class Student {
    Address address; // association
}
```

---

## **8️⃣ Aggregation (Weak association)**

Child can exist without parent.

```java
class Department {
    Teacher teacher; // teacher can exist without department
}
```

---

## **9️⃣ Composition (Strong association)**

Child cannot exist without parent.

```java
class House {
    Room r = new Room(); // room cannot exist without house
}
```

---

## **🔟 Constructor**

A special method used to initialize objects.

```java
class A {
    A() { System.out.println("Constructor called"); }
}
```

---

## **1️⃣1️⃣ Constructor Overloading**

Multiple constructors with different parameters.

```java
A(){}
A(int x){}
```

---

## **1️⃣2️⃣ Interface**

Achieves 100% abstraction.

```java
interface Animal {
    void run();
}
```

---

## **1️⃣3️⃣ Static Keyword**

Belongs to class, not to objects.

```java
static int count;
static void show(){}
```

---

## **1️⃣4️⃣ This Keyword**

Refers to current object.

---

## **1️⃣5️⃣ Super Keyword**

Refers to parent class.

```java
super.display();
```

---

## **1️⃣6️⃣ Final Keyword**

* final variable → constant
* final method → cannot override
* final class → cannot inherit

---

## **1️⃣7️⃣ Method Overloading**

Same method name, different parameters (compile-time polymorphism).

---

## **1️⃣8️⃣ Method Overriding**

Same method name, same parameters, different class (runtime polymorphism).

---

## **1️⃣9️⃣ Data Hiding**

Using `private` variables.

---

## **2️⃣0️⃣ Dynamic Binding (Late Binding)**

Actual method call decided at runtime.

---

## **2️⃣1️⃣ Message Passing**

Objects communicate by calling methods.

---

# 🎯 **OOP MAIN 4 PILLARS**

✔ Abstraction
✔ Encapsulation
✔ Inheritance
✔ Polymorphism

---
