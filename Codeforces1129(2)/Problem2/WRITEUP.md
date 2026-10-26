## Observations
- We just need to say if it is possible to make this sequence good or not , and not actually calculate the subarrays.
- If Array contains zero then it has to be good as we can perform operation on rest elements and remove them.
- This brings us to conclusion that there are only 2 possible answers , 0 and n
- If the Minimum Value + 1 is greater then n , then we cant make it good , because before the minimum element becomes 0 , the array
  will be gone.

## Approach
- While taking input check if 0 is present , if it is present output n.
- Calculate min of Array and check if it is greater then n-1 , if it is output 0 else output n.

## Complexity
Time : O(n) 
Space : O(n)
