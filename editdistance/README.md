## Edit Distance
 Problem: Implement a function which gets the edit distance of two input strings. There are three types of edit operations: insertion, deletion and substitution. Edit distance is the minimal number of edit operations to modify a string from one to the other.

For example, the edit distance between “Saturday” and “Sunday” is 3, since the following three edit operations are required to modify one into the other:
1.       Saturday → Sturday (deletion of ‘a’)
2.       Sturday→ Surday (deletion of ‘t’)
3.       Surday → Sunday (substitution of ‘n’ for ‘r’)

There is no way to achieve it with fewer than three operations.

### Tutorials and References
* http://codercareer.blogspot.com/2011/12/no-25-edit-distance.html
* http://people.cs.clemson.edu/~bcdean/dp_practice/dp_8.swf (requires flash)
* https://youtu.be/We3YDTzNXEk?list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr

### Formula
![Edit distance formula](http://2.bp.blogspot.com/-4DT3u0T9jpc/Tt4fEP0-BKI/AAAAAAAABBk/jC5QQfQS1ko/s1600/25_Figure1.PNG)

Original Owner of the image http://codercareer.blogspot.com/

###Code 
#### Please see EditDistance.java 

