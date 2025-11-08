<div align="center">
<h1><strong>Debugging: learning debug printing with a Logic Bug</br> (Incorrect Calculation)</strong></h1>
<img width="1000" alt="printdebug" src="https://github.com/user-attachments/assets/310138e9-9500-4212-96d1-1f63dd1d4c0a" />


</div>

<div align="center">
</br>
In this phase, i've faced a different scenario:
</br>
</br>
the application ran successfully, but produced the wrong result. Not a crash or a failure!
</div>
</br>


🛠️ Tech Stack
-----
</br>
<strong>Java 21:</strong> core programming language. 
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

👨🏻‍🔧 The Scenario
---------
</br>
I've created a CartService to calculate the total price of a shopping cart.</br>
</br>
Expected Behavior: Sum of items + Shipping (once) + VAT (22%).

Actual Behavior: The total was much higher than expected.
</br>
</br>

🕵🏻‍♂️ The Investigation (Print Debugging)
-----
</br>
Since there was no crash, i couldn't rely on stack trace. I've used Print Debugging by inserting System.out.println("DEBUG: ...") statements inside the calculation loop.
</br>
The logs revealed the "bug":
</br>
</br>
<strong>--- DEBUG: Loop start for Mechanical Keyboard ---</br>
DEBUG: Subtotal after adding item: 75.0</br>
THE BUG: Subtotal after adding SHIPPING: 80.0  <-- Shipping added here...</br>
--- DEBUG: Loop start for Wireless Mouse ---</br>
DEBUG: Subtotal after adding item: 105.0</br>
THE BUG: Subtotal after adding SHIPPING: 110.0 <-- ...and added AGAIN here!</strong></br>
</br>
</br>
This way it's clear that the shipping fee was being added inside the loop (for every item) instead of outside the loop (once) and logs debug printing shows exactly where the "bug" happens.
</br>
</br>

👷🏻 The Fix
-------
</br>
The fix consist in moving the shipping calculation logic outside of the for loop, ensuring it only runs once after all items are summed up.
</br>
(for this lab, i've calculated vat on shipping as well. Now this is not very common in a real setting but my "idea" was to have a shop that also makes their own delivery (so that's why adding VAT on shipping fees).
</br>
</br>

🚀 Conclusion
---------
</br>
This repository and branch demonstrates the ability to:
</br>
---> Diagnose crashes using stack traces and breakpoints.</br>
---> Trace logic errors using strategic print debugging.</br>
---> Apply defensive programming to prevent future crashes.</br>
</br>
</br>
With this labo i've learned more about debugging, dived into debug printing and learn the process of the same. This labo served as a great introduction to another much more interesting matter:</br>
</br>
<div align="center"><strong>LOGGING</strong></div>
</br>
</br>
(I've also committed this part of the debugging lab into a separate branch! Usually i push everything on a single main branch but this time i've wanted to have the print debugging topic nicely separated in another branch. Git and the professional how-to will be studied in depth in the upcoming phases of my Junior Developer preparation plan!)
