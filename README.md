# SB&G API Tech Test

## Introduction

Welcome to the Sky Betting & Gaming Technical Test!

We hope that you find this exercise fun and interesting. There are no trick questions; we want to see your solution to a
simple problem with well thought-out and well-structured code. We realise that there are a lot of topics in the brief
and that you may not have the experience or time to complete them all.

There is no strict time limit on how long you spend on the test, but we recommend you spend no longer than 3 hours on
it.

When you've produced something you're proud of, send it to us (see [Submission](#Submission)). We may then invite you to
an interview. In this interview you'll discuss your work, so it's worth considering how you'd improve the application
further, even if you didn't have time to do it.

## The Brief

### Initial considerations

Our product team would like you to help us build a new [roulette][1] platform. Currently all the different variations of
roulette work in different ways, some with more business logic in the front end than is preferred. The product team
aspire to have a single roulette platform which they can concentrate their focus on.

For this technical test we would like you to create a roulette API. This will be an API that receives requests from a
user, simulates a game of roulette, and returns the results. A front end user interface is not required, neither is any
consideration of any services which you might expect to be shared; examples of these might be account verification or
game history. If you do want to include something like this in your code, please write against a stub - there is
certainly no need to write a full implementation.

We’d like you to consider:

- How bets are placed, how a win or a loss is communicated, how winnings will be shown. Does your implementation allow
  for single bets, colour bets, odd/even bets, etc.?
- What API methods would be useful to other teams writing calling code (how you can make the API easy to use, is each
  method doing what someone else would expect it to do?).
- Testing and maintainability - you should consider what testing is appropriate.

### Further considerations

The expectation from the product team is that we produce a fully working system as soon as possible, then continue to
add features. We hope that you will think about this expectation as you work.

- As you add more features you might want to consider how they would be rolled out into production. Would your design
  easily allow feature toggles to be implemented?
- Could you easily load test your system?
- Are there certain parts of the system you'd like to monitor? How would you monitor them?
- How would you deploy your system to an environment? Why would it be advantageous to automate this progress?

## Submission

Replace the contents of this README.md with:

1. A covering note explaining the technology choices you have made.
1. Any instructions required to run your solution and tests in a Linux/Mac environment.

Email your SBG recruitment contact with the Git bundled repository as an attachment, showing your commit history with
all features on the principal branch:

        git bundle create <anything>.bundle --all --branches

## Equality & Diversity

We consider all candidates equally, fairly and without bias. More information can be found on
the [SBG Careers website][2].

[1]: https://en.wikipedia.org/wiki/Roulette

[2]: https://www.skybetcareers.com
