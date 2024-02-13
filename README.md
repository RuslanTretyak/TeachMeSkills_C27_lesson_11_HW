## TeachMeSkills_C27_lesson_6_HW
Homework for the eleventh lesson

**task1** This program takes as input a string in the format xxxx-yyy-xxxx-yyy-xyxy, where "x" is any number, and "y" is
a letter of the Latin alphabet (can be large or small). The "util" class contains methods for working with this string:
getNumberBlocks() - displays the first two blocks of 4 digits on the screen in one line;
getDocumentNumber() - displays the document number on the screen, but replace blocks of three letters with *** (each 
letter will be replaced with *);
getBriefe() - displays only one letter from the document number in the format yyy/yyy/y/y in lowercase;
getBriefeByStringbuilder() - displays the letters from the document number in the format "Letters:yyy/yyy/y/y" in upper 
case;
checkSubsting() - checks whether the document number contains the sequence "abc" and whether the message contains it or 
not (moreover, abc and ABC are considered the same sequence);
checkBegin() - checks whether the document number begins with the sequence 555.
checkEnd() - checks whether the document number ends with the sequence 1a2b.
All these methods are static methods.

**task2** This program contains two methods for working with a string of arbitrary length with arbitrary words:
printWordMaxLength() - finds the shortest word in the string and displays it on the screen.
printWordMinLength() - finds the longest word in the line and displays it on the screen.
If there are several such words, then the methods display the last one.

**task3** This program takes a string as input and outputs a new line to the console that duplicates each letter from 
the initial string.