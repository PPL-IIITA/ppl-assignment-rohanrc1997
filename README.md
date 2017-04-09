IPPL430C Assignment
(A JAVA Project)

Author:
IIT2015073
Rohan Chaudhary

This is the PPL Assignment, by Prof. Rahul Kala.


This repository consists of two folders : 

*part_1 : consists of the following questions: 1 , 2.

*part_2 : consists of the following questions: 3, 4, 5, 6, 7, 8, 9, 10.



KEY FEATURES:

*Different Namespaces are used to classify classes according to algorithms, data structures, data items, utilities and main classes for every question.

*The source files (.java) are located in the directory: (src) 
 of each "part_1" and "part_2" directories of the repository.

*Consists of a utility (Random_gen_util.java) for producing randomly generated data in the following file: "input.txt"
 for input boys, gifts and girls and uses a 
 dictionary of names ("girl.txt" and "boy.txt") to choose the names from.

*Consists of a utility to store all the events namely, commitments and gift exchanges in the
 following text file along with a timestamp :    "log.txt"

*The Java-Documentation for the Project is present in : javadoc/index.html   
 and can be viewed using an internet browser

*The class diagram is provided as "class_diagram.pdf" in both of the directories, ie "part_1" and "part_2"



Operating System Used and Java Version Used: 

* JDK 1.8.111
* Windows-10-64-bit-(10.0, Build 10586)



Developer Tools used:

* Netbeans Build 8.2
* Javadoc  
* Code 2 UML 
* Apache ANT 1.9.4-bin ( Build Tool )



Compilation and Build Procedure using Apache ANT (using command line):

1. Change the current working directory to that of the root of the project directory "part_1" or "part_2"  using :

    cd part_1
   
   For example: For Q1 and Q2, change the current working directory to "part_1" .
   Then, Run the following command to compile all the project packages at once: 
   [[ Required : Apache ANT v 1.9.4+ must be installed on the system for the command to execute successfully. ]] 
   
    ant compile


2. Change the Current Directory to that of (/build/classes) using the following command:

    cd build/classes


3. Now, for Running the Program for Question 1, Enter the following command:

    java main_classes.q1


   **Similarly, for question 2, give the following command:
  
    java main_classes.q2




NOTE:

  1. Similarly, For "part_2" consisting of questions 3,4,5,6,7,8,9,10: 
  
     cd part_2


   Go to "part_2" directory in the repository and give the following command to build the project:

    ant compile


  2. Change the current working directory to (/build/classes) using the following command:

    cd build/classes


  3. Now, for Running the Program for Question 3, Enter the following command:

    java main_classes.q3

     For Q4:

  java main_classes.q4
  
     and so on




***The Q1 program takes the Number of Boys, Number of girls and Number of gifts (in order) from the terminal from the user.
   It then generates random data items using the random utility.
   Couples then are allocated and printed in the terminal itself as well as in the following file with a timestamp : PPL_assignment_iit2015073/src/log.txt
   Furthermore, the random input data is stored in : 'PPL_assignment_iit2015073/src/input.txt' for easier debugging.


4. Similarly, to Run the Program for Question 2, Enter :

  java algorithm.q2

***The Q2 program takes Number of Boys, Number of girls and Number of gifts (in order) from the terminal, from the user.
   It also requires an input integer 'k' from the user. (where k < TOTAL NUMBER OF COUPLES FORMED)
   Gift Exchanges then are printed in the terminal itself as well as in the following file with a timestamp : PPL_assignment_iit2015073/src/log.txt
   It also prints the k-most compatible and k-most happiest couples.
   Furthermore, the random input data is stored in : 'PPL_assignment_iit2015073/src/input.txt' for easier debugging;

