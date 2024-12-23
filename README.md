Final Project Documentation Template 
Project Title: Solving quadratic equation, numerical integration
Author: Narvaez Alec Haven R.

Introduction
This project provides two distinct functionalities: solving quadratic equations and numerical integration of functions over a given range. The goal is to demonstrate the implementation of mathematical concepts in Java while providing a user-friendly interface for interaction.

Purpose and Objectives
1. Implement a program to solve quadratic equations and handle real and complex roots.
2. Provide a numerical integration tool using the Trapezoidal Rule for approximating definite integrals.
3. Create an interactive CLI-based system for users to choose desired functionalities. 

Features and Functionality
1. Quadratic Equation Solver:
Solves quadratic equations of the form ax² + bx + c = 0.
Handles three cases:
oReal and distinct roots.
oReal and equal roots.
oComplex roots.
2. Numerical Integrator:
Implements numerical integration using the Trapezoidal Rule.
Allows users to input a function, integration range, and the number of intervals for approximation.
3. Interactive CLI:
Enables users to choose between solving quadratic equations or performing numerical integration.



Implementation Details
Design Decisions
1. Quadratic Equation Solver:
Used the discriminant formula ( b² - 4ac) to determine root types.
Applied conditional checks for real and complex cases.

2. Numerical Integration:
Applied the Trapezoidal Rule formula:

∫ab​f(x)dx≈h[2f(a)+f(b)​+ i=1∑n−1​f(a+i⋅h)]

Where h = b-a/n.

3. Interactive CLI:
Used a Scanner for user input.
Implemented a modular structure to manage separate functionalities.

Tools Used
Programming Language: Java
Libraries:
java.util.function.Function,
java.util.Scanner

User Guide
Setup Instructions
1. Install Java Development Kit (JDK).
2. Compile the code using:
Java Main.java QuadraticEquationSolver.java NumericalIntegrator.java
3. Run the program using:
Java Main


Usage Instructions
1. Run the program and select an option:
Option 1: Solve a quadratic equation. Input coefficients a, b , and c.
Option 2: Perform numerical integration. Provide the range [a, b], number of intervals n, and define the function (currently pre-set as f(x) x²).
2. Follow the prompts to view the results. 

Sample Runtime
Quadratic Equation Solver
Input: 
1
Enter coefficients a, b and c:
1 – 3 2

Output:
Roots are real: 2.0, 1.0 
Numerical Integration 
Input:
2
Enter range (a and b) and number of interval
0 1 100
Output:
Intergral value: 0.33333349999999997

Conclusion and Future Work
Achievements 
Successfully implemented quadratic equation solving and numerical integration.
Provided an interactive interface for user convenience.
Future Improvements
Allow dynamic function input for numerical integration.
Enhance the CLI for a more robust user experience.
Add additional integration methods (e.g., Simpson's Rule).
Test Case Documentation
Test Case ID	Description 	Input Data	Expected Outcome	Actual Result	Status
TC1	Solve Quadratic with real roots	a = 1, b=
-3, c = 2	Roots: 2.o, 1.0	Roots: 2.o, 1.0	Pass
TC2	Solve Quadratic with equal roots	a = 1, b=
-2, c = 1	Root: 1.0	Root: 1.0	Pass 
TC3	Solve Quadratic with comnplex roots	a = 1, b=
1, c =1	Roots: Complex -0.5± 0.8661	Roots: Complex -0.5± 0.8661	Pass

TC4	Integrate f (x) = x², range 0-1	a = 0, b = 1, n = 100	Approx. 0.33333	Approx. 0.33333	Pass

TC5	Invalid option input	Choice =3	Invalid Option	Invalid Option 	Pass

