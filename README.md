# Java Generics Demo / Java 泛型演示
This repository contains demonstration code for a Java generics tutorial video.  
Each method in `main()` showcases a different concept of Java generics — including generic classes, bounded types, wildcards, and generic methods.

本仓库包含用于 Java 泛型视频教程的演示代码。  
`main()` 方法中的每个演示展示了 Java 泛型的不同概念，包括泛型类、边界类型、通配符以及泛型方法。

---

## ✅ Video Links / 视频地址

- **YouTube:** https://www.youtube.com/watch?v=DNLyMD-CJiw

- **Bilibili:** http://bilibili.com/video/BV1H94y1a7bJ/

---

## ✅ Features Demonstrated / 演示功能

| Demo Method / 方法           | Concept / 概念                          | Description / 描述                                           |
| ---------------------------- | --------------------------------------- | ------------------------------------------------------------ |
| `withoutGenericDemo()`       | No Generics / 非泛型                    | Shows the limitation of creating separate classes for each type (e.g., `IntegerPrinter`, `StringPrinter`).<br>演示为每种类型创建单独类的局限性（如 `IntegerPrinter`、`StringPrinter`）。 |
| `genericDemo()`              | Basic Generics / 基本泛型               | One `Printer<T>` works for multiple types. Also includes a 2-type `CompositePrinter<T, K>`. <br>单个 `Printer<T>` 可以处理多种类型，同时演示双类型 `CompositePrinter<T, K>`。 |
| `boundedTypeDemo()`          | Bounded Type Parameters / 泛型边界      | `T extends Vehicle` and `T extends Vehicle & Thing`. Demonstrates compile-time constraints. <br>`T extends Vehicle` 和 `T extends Vehicle & Thing`，展示编译期约束。 |
| `wildcardDemo()`             | Unbounded Wildcard `?` / 无界通配符 `?` | Read-only list; type-safe printing without knowing list element type.<br>只读列表；在不确定元素类型的情况下安全打印。 |
| `upperBoundedWildcardDemo()` | `? extends Vehicle` / 上界通配符        | Accepts Vehicle or subclasses (Car, Bus). Safe for reading elements.<br>接受 Vehicle 或其子类（Car、Bus），适合只读操作。 |
| `lowerBoundedWildcardDemo()` | `? super Car` / 下界通配符              | Accepts Car or its superclasses. Safe for adding Car objects.<br>接受 Car 或其父类，适合安全添加 Car 或其子类对象。 |
| `genericMethodDemo()`        | Generic Methods / 泛型方法              | `printVehicle()` requires `T extends Vehicle & Thing`.<br>演示方法级别的泛型约束：T 必须继承 Vehicle 并实现 Thing 接口。 |

---

## ✅ How to Run / 如何运行

### 1. Clone this repository / 克隆仓库

```bash
git clone https://github.com/AlbertShenTech/java-generics.git
cd java-generics-demo

2. Open in any Java IDE / 在任意 Java IDE 打开

or compile and run in terminal / 或在终端编译运行:

javac Main.java
java Main

⸻

✅ How to Use / 如何使用

Inside main() you will see / 在 main() 中你会看到:

withoutGenericDemo();           // Demonstrates printing without generics 非泛型打印示例
genericDemo();                  // Basic generic classes 基本泛型类示例
boundedTypeDemo();              // Bounded type parameters 泛型边界示例
wildcardDemo();                 // Unbounded wildcard 无界通配符示例
upperBoundedWildcardDemo();     // ? extends Vehicle 上界通配符示例
lowerBoundedWildcardDemo();     // ? super Car 下界通配符示例
genericMethodDemo();            // Generic method with multiple bounds 多边界泛型方法

    •   Uncomment any method to test 
    	取消注释运行想要测试的方法
    •   Re-run the program 
    	重新运行程序
    •   Output will appear in the console 
    	控制台输出结果

✔ Easy to switch between different generics concepts while watching the tutorial
	方便在观看教程时切换不同泛型概念演示。

⸻

✅ Project Structure / 项目结构

src/
 ├─ Main.java                     // Entry point, calls all demo methods 程序入口，调用各演示方法
 ├─ Printer.java                  // Generic Printer<T> 泛型打印类
 ├─ CompositePrinter.java         // Printer<T, K> with 2 type params 双类型泛型打印类
 ├─ Vehicle.java                  // Base class 基类 Vehicle
 ├─ Car.java, Bus.java            // Subclasses of Vehicle Vehicle 子类
 ├─ Thing.java                    // Interface implemented by Bus Bus 实现的接口
 ├─ VehiclePrinter.java           // T extends Vehicle 泛型边界：继承 Vehicle
 ├─ VehicleThingPrinter.java      // T extends Vehicle & Thing 泛型边界：继承 Vehicle 且实现 Thing


⸻

✅ Why This Project Exists / 项目目的

✔ To teach Java generics with real, compilable examples 
  用可编译的示例教学 Java 泛型
✔ To visually demonstrate difference between
  直观展示不同泛型概念区别:
    •   Generics vs non-generics 泛型 vs 非泛型
    •   T extends vs ? extends vs ? super
    •   Generic classes & generic methods 泛型类 & 泛型方法

⸻

✅ License / 许可

Feel free to use this code in tutorials, classrooms, and learning projects 可自由用于教程、课堂和学习项目。

```
