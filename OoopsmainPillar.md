# 🟩 **1. Abstraction (Hiding internal details)**

## ⭐ Definition

Abstraction means **showing only the essential features and hiding complex internal logic**.

You interact only with what you need — not how it works inside.

---

## ⭐ Real-life example

* You drive a **car** using the steering wheel, brake, accelerator.
* You don’t know how the engine burns fuel internally.

---

## ⭐ Java Example (using abstract class)

```java
abstract class Phone {
    abstract void takePhoto();  // abstract method
}

class Android extends Phone {
    void takePhoto() {
        System.out.println("Android captures photo");
    }
}
```

---

## ⭐ Java Example (using interface)

```java
interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment using UPI");
    }
}
```

---

## ⭐ Why abstraction?

✔ Reduces complexity
✔ Improves security
✔ Easy to use objects without knowing internal logic

---

# 🟧 **2. Encapsulation (Data hiding + binding data & methods)**

## ⭐ Definition

Encapsulation means wrapping **data + methods** into a class and **protecting data using private fields**.

You allow controlled access using **getters and setters**.

---

## ⭐ Real-life example

You use an **ATM**:

* You enter PIN (method)
* But your balance inside the bank database is **hidden (private)**

---

## ⭐ Java Example

```java
class BankAccount {
    private double balance = 5000; // hidden data

    public double getBalance() {
        return balance;   // controlled access
    }

    public void deposit(double amt) {
        balance += amt;
    }
}
```

---

## ⭐ Why encapsulation?

✔ Data security
✔ Prevents accidental changes
✔ Makes code modular and maintainable

---

# 🟦 **3. Inheritance (one class acquiring properties of another)**

## ⭐ Definition

Inheritance allows a class (child) to **use fields and methods** of another class (parent).

---

## ⭐ Example Diagram

```
Animal (Parent)
 ↳ Dog (Child)
```

---

## ⭐ Java Example

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

Usage:

```java
Dog d = new Dog();
d.eat();  // inherited
d.bark();
```

---

## ⭐ Why inheritance?

✔ Code reusability
✔ Less redundancy
✔ Logical hierarchy

---

## ⭐ Types of inheritance in Java

| Type         | Java Support?      | Example      |
| ------------ | ------------------ | ------------ |
| Single       | ✔ Yes              | A → B        |
| Multilevel   | ✔ Yes              | A → B → C    |
| Hierarchical | ✔ Yes              | A → B, A → C |
| Multiple     | ❌ No (via classes) | —            |
| Hybrid       | ❌ No               | —            |

> Java supports **multiple inheritance through interfaces**, not classes.

---

# 🟪 **4. Polymorphism (same name, different behavior)**

## Polymorphism = “Many forms”

---

# 🔵 **2 Types of Polymorphism**

# **A) Compile-time Polymorphism (Method Overloading)**

Decided during compile time.

### Example:

```java
class MathOp {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}
```

---

# **B) Runtime Polymorphism (Method Overriding)**

Decided at runtime using **dynamic binding**.

### Example:

```java
class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
```

Usage:

```java
Animal a = new Dog();
a.sound();  // Dog barks → runtime polymorphism
```

---

## ⭐ Why polymorphism?

✔ Flexibility
✔ Reusability
✔ Supports dynamic behavior

---

# 🎉 **Summary Table**

| OOP Pillar        | Meaning                    | Keyword                    | Example           |
| ----------------- | -------------------------- | -------------------------- | ----------------- |
| **Abstraction**   | Hiding internal details    | `abstract`, `interface`    | Car engine hidden |
| **Encapsulation** | Data hiding using private  | `private`, getters/setters | Bank balance      |
| **Inheritance**   | Properties passed to child | `extends`                  | Dog → Animal      |
| **Polymorphism**  | One name, many forms       | Overloading/Overriding     | sound(), add()    |

