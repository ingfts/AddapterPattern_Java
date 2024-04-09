# Game Mode Selection🎮 
[![](https://skills.thijs.gg/icons?i=java)](https://skills.thijs.gg)

## Purpose🚀 

This repository contains a Java implementation of a game mode selection system. The purpose of the system is to allow players to choose between solo and group game modes and to initialize the selected game mode accordingly.

## Components🛠️ 

1. **Interfaces**:
   - `SoloGame`: Defines the behavior for solo game mode.
   - `GroupGame`: Defines the behavior for group game mode.
   - `Game`: Represents a generic game interface.

2. **Concrete Implementations**:
   - `ConcreteSoloG`: Provides the implementation for solo game mode.
   - `ConcreteGroupG`: Provides the implementation for group game mode.

3. **Adapter**:
   - `GameAdapter`: Bridges the gap between solo and group game modes by implementing the `SoloGame` interface and internally referencing the `Game` interface.

4. **Factory**:
   - `GameFactory`: Generates instances of solo and group game modes based on user selection.

5. **Main Class**:
   - `Main`: Entry point of the application, where instances of solo and group game modes are created using the factory pattern.
  
  ## Learning 🎯
  With this code, I learned how the Adapter pattern behaves in handling incompatible interfaces. Additionally,
  I was able to review the application of the Factory 
  pattern by incorporating it into the code to dynamically create instances without the need for using if statements.

 


