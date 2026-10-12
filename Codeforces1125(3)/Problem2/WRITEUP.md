# Observations 
- This is a stack based problem , got the instinct because files add to the top.
- If char at i in s is 1 keep it as pending , therefore push in stack
- If char at i in s is 2 print recent most pending , if not pending print i , if char is 3 print i
  
# Solution
- We iterate the string s from left to right.
- Create a array to keep check on printed documents , initialize array with first N natural Numbers ,so that if printed change
  to -1 , using count to keep count of not printed documents
- If a 1 is encountered in the string, the current index 'i' is pushed onto the stack.
- If a 2 is encountered, we check if the stack is empty or not. If it is empty, we print document 'i' and change Array's ith
  index to -1 .Otherwise, get the index of top at stack and change the corresponding Array's index to -1.
- Then we print count which depicts not printed documents , and print i+1 for which Array's index value is not -1.

# Complexity
- O(n) per test case
