# Shape Program

## Overview
- A **menu-driven program** to calculate the **area, perimeter, and volume** of different shapes.
- Uses **abstract classes** and **inheritance** to implement different 2D and 3D shapes.
- Written in **Java** with multiple files for better organization.

## Files & Classes
- **Main.java**  
  - Contains the **menu-driven logic** for user interaction.  
  - Uses a `Scanner` to take user input for shape dimensions.  

- **Shape.java** *(Abstract Class)*  
  - Defines **common attributes**: `dim_one`, `dim_two`, `dim_three`, `num_sides`.  
  - Implements constructor overloading.  
  - Declares **abstract methods**:  
    - `calculateArea()`  
    - `calculatePerimeter()`  
    - `calculateVolume()`  

- **Circle.java**  
  - Implements **calculateArea()** and **calculatePerimeter()**.  

- **Rectangle.java**  
  - Implements **calculateArea()** and **calculatePerimeter()**.  

- **Square.java**  
  - Inherits from `Shape` with a **single dimension** (`side`).  
  - Implements **calculateArea()** and **calculatePerimeter()**.  

- **Sphere.java**  
  - Implements **calculateVolume()** and **calculateArea()** (as surface area).  
  - Returns **0 for calculatePerimeter()** (not applicable).  

- **Cylinder.java**  
  - Implements **calculateVolume()** and **calculateArea()** (as surface area).  
  - Returns **0 for calculatePerimeter()** (not applicable).  

- **Pyramid.java** *(Square Base)*  
  - Implements **calculateVolume()** and **calculateArea()** (as total surface area).  
  - Implements **calculatePerimeter()** as base perimeter.  

## Features
- **Menu-driven selection** for choosing a shape.  
- **Separate files for each shape** following OOP principles.  
- Uses **abstract classes** to enforce method implementation.  
- **No API dependencies** – pure Java implementation.  


