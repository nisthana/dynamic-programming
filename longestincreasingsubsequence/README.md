## Longest Increase subsequence (non-contiguos)
   Problem: Given an unsorted array, find the max length of subsequence in which the numbers are in incremental order.

For example: If the input array is {7, 2, 3, 1, 5, 8, 9, 6}, a subsequence with the most numbers in incremental order is {2, 3, 5, 8, 9} and the expected output is 5.



### Tutorials and References
* https://youtu.be/CE2b_-XfVDk?list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr
* http://codercareer.blogspot.com/2011/10/no-16-maximum-length-of-incremental.html
* http://people.cs.clemson.edu/~bcdean/dp_practice/dp_3.swf (requires flash)

### Formula
Longest[i] = Max{Longest[j]+1,Longest[i]}
             where 0<=j<i and a[j] < a[i]

###Code 
#### Please see LongestIncreasingSubsequence.java 

