Name: Aqdas Khan
Programming Language: Java
IDE/Editor: Visual Studio Code


Part 4:
Question 1
What is the worst-case Big O time complexity of Bubble Sort?

The worst-case time complexity of Bubble sort would be O(n^2).

Question 2
Why does Bubble Sort have this time complexity?
Your explanation should mention the repeated comparisons or nested loops.

Bubble sort has this time complexity because it uses nested loops and repeatedly compares neighboring elements. As the number of elements increases, the number of comparisons done, also grows.

Question 3
If Bubble Sort processes 10 elements, approximately how many comparisons could be required compared with 1,000 elements?
You do not need to calculate the exact number.
Explain the difference using the idea of:
O(n²)

With 10 elements, the number of comparisons on the order of about 10^2 which is 100. However, with 1,000 elements it is on the order of about 1,000^2 which is 1,000,000. This shows that because Bubble Sort is O(n^2), the amount of work grows very quickly as the number of elements increases. 

Part 6: 
Question 4
What is the Big O time complexity of Merge Sort?

The time complexity of Merge sort is O(nlogn).

Question 5
Which algorithm generally performs better when the amount of data becomes very large?

Choose:
Bubble Sort
or:
Merge Sort
Explain why.

Merge Sort generally performs bettwe when the amount of data becomes very large. This is because Merge Sort has a time complexity of O(nlogn), while Bubble Sort has a time complexity of O(n^2) meaning that Merge Sort would perform slightly faster and overall better than Bubble Sort.


Question 6
Complete the following:

Bubble Sort = O(n^2)

Merge Sort = O(nlogn)

Part 11:
Question 7
What is the Big O time complexity of Linear Search?

The worst-case time complexity of Linear Search is O(n). Linear search would possibly need to check every element in the array before finding the target or determing weather that target is even present or not. 

Question 8
What is the Big O time complexity of Binary Search?

The time complexity of Binary Search is O(log n). Binary Search essentially takes out half of the remaining search area after each comparison. This would allow it to search much more efficiently since its taking it part by part. 

Question 9
Why does Binary Search require sorted data?

Binary Search requires sorted data because since it splits it apart, it uses the middle value to decide whether to search the left half or the right half. If the data isn't sorted, then it cannotly properly and safely determine which half of the array can be eleminated. 

Question 10
Which search would you use if the data were not sorted? Explain why.

I would use Linear Search if the data was not sorted. This is because Linear Search check every element one at a time and doesn't require the values to be in an particular order. Since the scenerio given is that it wasn't sorted, Linear Search would make the most sense. 

Question 11
Which search would generally be better for a very large sorted array? Explain why.

For a very large and sorted array, Binary Search would generally be better. This is because Binary Search has a time complexity of O(log n), while Linear Search has a time complexity of O(n), so Binary Search would usually require fewer comparisons. Also since its sorted it would and could work with Binary Search since it splits it in half and from there works. 

Part 12:

| Algorithm | Purpose | Big O |
|-----------|---------|-------|
| Bubble Sort | Sorting | O(n²) |
| Merge Sort | Sorting | O(n log n) |
| Linear Search | Searching | O(n) |
| Binary Search | Searching | O(log n) |
