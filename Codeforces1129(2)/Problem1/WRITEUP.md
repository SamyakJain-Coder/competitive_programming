## Observations
- Each Group should have atleast 'k' Elements
- An element cannot be given to multiple groups
- To get max mex , we need atleast k elements of the smaller elements , which ever element does not have k copies, print it

## Approach
- Create a HashMap to store the count of variables
- Iterate through the HashMap and also maintain a count variable to store the count of elements of smaller elements but have more than
  k copies , as they can be used for further values

## Complexity
Time : O(n)
Space : O(n)
