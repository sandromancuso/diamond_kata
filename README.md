Diamond Kata
============

After reading a [blog post](http://ronjeffries.com/articles/diamond/diamond.html) from Ron Jeffries, where he mentions other posts from Alistair Cockburn and Seb Rose, I decided to have a go at the exercise. 

My approach to TDD is different from the one used by Ron Jeffries and the final solution was also different. In my case, I decided not to make any design decision at all, with the exception of the public method on the Diamond class, responsible for creating an array with all the diamond's rows.

I wrote very small tests and wrote the simplest thing I could to make the tests to pass. I would then use the refactoring phase to clean the code. At points, if you follow the tests (they are in the order I created them), I created tests which I knew would force code duplication. I do that on purpose. I write very similar tests that force me to write new code that is very similar to code that already exist. This helps me to identify duplication. Once the duplication is identified, I use the refactoring phase to make the code more generic, removing the duplication. 

What was interesting to see was that both Ron Jeffries and I had no pre-conceived design and were able to get to a solution with designing up-front. 

Admitedly, my solution needs some polishing but I was able to prove the point I wanted to prove: I could grow the solution to the problem through tests and without any design up-front. The code now does what needs to be done and from now on it is just to refactor it and make it better. But I'll leave it to another time.

In order to see all the exact steps, have a look at all my commits.
