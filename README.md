<div align="center">
<h1><strong>🐞 Java Debugging Lab 🐞</strong></h1>
<img src="https://sjinnovation.com/sites/default/files/inline-images/evolution2012_0.jpg" alt="debugging" width="1000"/>
</div>

<div align="center">
</br>
Handling the <strong>NullPointerException</strong>
</br>
</br>
Documenting the study and practical application of fundamental Java debugging concepts.

The purpose of this project is to simulate, diagnose, and fix one of the most common bugs in software development:</br> the <strong>NullPointerException</strong> (NPE).  
</div>
</br>


🛠️ Tech Stack
-----
</br>
<strong>Java 21:</strong> The core programming language.
</br>
</br>
This project feats a full Java app as it's oriented to be useful on learning Debugging processes and to practice them on the same. 
</br>
</br>

💻 Tools & Technologies
------------
</br>
<p align="center">
<a href="#"><img src="https://img.shields.io/badge/macOS-000000?logo=apple&logoColor=F0F0F0" alt="macOS"></a>
<a href="#"><img src="https://img.shields.io/badge/Spotify-1ED760?logo=spotify&logoColor=white" alt="Spotify"></a> 
<a href="#"><img src="https://custom-icon-badges.demolab.com/badge/Visual%20Studio%20Code-0078d7.svg?logo=vsc&logoColor=white" alt="VSC"></a>
<a href="#"><img src="https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white" alt="GitHub"></a> 
</p>
</br>

🧑‍🔬 Key Interactive Debugger Tools
---------
</br>
Breakpoint (🔴): A "red light" set on a line of code. When the program hits it in Debug mode, it "freezes".

Variable Inspection (🔬): The panel that lets us "look inside" the program's memory and see the value of all variables.

Step Over (➡️): Executes the highlighted line of code and stops at the next one.

Step Into (⬇️): If the line is a function call, this "enters" that function and stops at its first line.
</br>
</br>

▶️  Core Debugging Concepts 
-----
</br>
1. (Summary)
</br>

Debugging is the investigative process of finding and fixing errors (bugs) in code. For a Junior Developer, this relies on three primary methods:

Stack Trace Analysis: Reading the error report that the program prints to the terminal when it crashes. It tells us what happened (NullPointerException) and where it happened (the file and line number).

Interactive Debugger (IDE): Using IDE tools to "freeze" the program at a specific point and inspect it in real-time. (i call this the "Flying Controller")

Print/Logging Debugging: Inserting print statements (like System.out.println) to observe the value of variables while the program is running.
</br>

</br>
2. Executing This Project (The Process)
</br>

To practice these concepts, i've followed a methodical debugging process on this simple Java app.

<strong>The app simulates a user search in a database. The intentional bug is in Main.java, which fails to check if the user returned from UserService is null before trying to use it.</strong>
</br>
</br>

🛃 The Process
-------

</br>
Phase 1: The Bug (Stack Trace Analysis)
</br>
</br>
Running Main.java for the first time (by clicking Run ▶️). As expected, the program crashed.

(What): java.lang.NullPointerException: Cannot invoke "User.getName()" because "user" is null

(Where): at Main.main(Main.java:18)

Diagnosis: The initial investigation confirmed the program crashed at line 18 because the utente variable was null.

</br>
Phase 2: The Investigation (Interactive Debugger)
</br>
</br>
To visually confirm the hypothesis, I used the interactive debugger:

Breakpoint (🔴): i've set a breakpoint at the "crime scene," line 18 in Main.java.

Debug (🐞): i've launched the program in Debug mode. The program correctly "froze" at line 18.

Inspection (🔬): i've looked at the "Variables" panel and got visual confirmation: utente: null.

Verifying the Crash: i've pressed Step Over (➡️) to execute line 18. The program crashed (taking me to the Thread.class file), confirming that null.getName() was the cause.

(i've also used Step Into (⬇️) to go inside findUserById and observe the return null in the UserService.)

</br>
Phase 3: The Solution (Defensive Programming)
</br>
</br>
Once the bug was confirmed, i've fixed Main.java by implementing a safety check (an if-else block) before the bugging line.

Corrected Code (in Main.java):

// ...
User user = service.findUserById(99);

// --- THE FIX ---

if (user != null) { 
            System.out.println("User found: " + user.getName());
        } else {
            System.out.println("ERROR: User not found.");
        }
// ...

</br>
Phase 4: The Final Verification
</br>
</br>
i've ran Main.java again (by clicking Run ▶️).

Result: This time the program didn't crashed. It correctly printed the handled error message, completing the debug cycle.

The message printed on terminal: 

UserFinder activation...
Looking for specific user...
ERROR: User not found. (by searching any ID that is not 1 or 2, presaved in a fake DB)
Done Searching, player!
</br>

Conclusion:

This lab introduced me to the debugging processes, concepts and methods and helped me with understanding the workflow of debugging and it also gave me a chance to create a personal "debug safetraveling map" that i can always check when in need. 
I will surely produce another small project for the debugging chapter, eventually using a Maven - Spring Boot app in order to raise the test difficulties and to practice in a scenario much closer to the actual debugging activities in a production scenario. 
