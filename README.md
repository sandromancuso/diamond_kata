Diamond Kata
============

After reading a [blog post](http://ronjeffries.com/articles/diamond/diamond.html) by [Ron Jeffries](https://twitter.com/RonJeffries), where he mentions other posts by Alistair Cockburn and Seb Rose, I decided to have a go at the exercise. 

My approach to TDD is different from the one used by Ron Jeffries and the final solution was also different. In my case, I decided not to make any design decisions at all, with the exception of the public method on the Diamond class, responsible for creating an array with all the diamond's rows.

I wrote a sequence of very small tests and just wrote enough code in order to make them pass. Test after test, I used the refactoring phase to clean up the code. If you follow the tests (they are in the order I created them), you will see that I created tests which I knew would force code duplication. I do that on purpose. I write very similar tests that force me to write new code that is very similar to code that already exist. This helps me to identify duplication without speculation. Once the duplication is identified, I use the refactoring phase to make the code more generic, removing the duplication. 

What was interesting to see was that both Ron Jeffries and I had no pre-conceived design and we were both able to get to a solution without designing up-front. 

Admitedly, my solution needs some polishing but I was able to prove the point I wanted to prove: I could grow the solution to the problem through tests and without any design up-front. The code now does what needs to be done and from now on it is just a matter of refactoring and making it better. But I'll leave it to another time.

In order to see all the exact steps, have a look at the commit history.
