# Hi

*"We hope that you find this exercise fun and interesting"*

I did, I am :)

I gave myself until today (25th September) to submit the first release to you (namely, ```0.0.1-RELEASE```).  I was going for the "bonus points" awarded for a working endpoint but I've fallen short of that in this release.  I'm sticking to today's release date however, becasue I want your feedback sooner rather than later (in true agile-stylee).

My aims for this first release were:

- **Fully automated build and unit testing** (almost goes without saying). ![tick](http://files.softicons.com/download/web-icons/web-2-icon-set-by-anders-bjarnle/png/24x24/check.png)
  - I chose Maven and JUnit/Surefire.

- **Good documentation** ![tick](http://files.softicons.com/download/web-icons/web-2-icon-set-by-anders-bjarnle/png/24x24/check.png)
  - I've created UML Class Model diagrams using the UML sketching tool [yuml](http://yuml.me/).  See the [README.md](https://github.com/sparcs360/Casino/blob/master/README.md) for details on what they cover and where to find them (hint: ==notes== directory in the root).
  - Comprehensive JavaDocs.  Again, see the README.md for instructions on how to generate them.

- **Spring Boot** ![tick](http://files.softicons.com/download/web-icons/web-2-icon-set-by-anders-bjarnle/png/24x24/check.png)
  - Built on Spring so I can take advantage of the rich and extensible framework.

- **Game Framework** ![tick](http://files.softicons.com/download/web-icons/web-2-icon-set-by-anders-bjarnle/png/24x24/check.png)
  - I wanted to abstract the common features of an online Casino game into a seperate module, I did this for a few reasons:
    1. I imagine *Sky Bet* have a common framework for their games, and I wanted you to know that I think having a framework is important.
    2. I can exploit the framework to get a head start on another game, say *Texas Hold-Em*.
    2. The decoupling strengthens the design decisions I make.

- **Sensible Git Workflow** ![tick](http://files.softicons.com/download/web-icons/web-2-icon-set-by-anders-bjarnle/png/24x24/check.png)
  - I wanted to show you a full commit history (no fast-forwarding during merges).  I hope you'll see my Test-Driven approach to development in action.
  - I wanted to show how development of the Game Framework can be seperated from development of the Roulette game.
  - I wanted to show the release maturing during the sprint, on the *develop* branch, and then finally being pushed to *master* when the release was ready.
  - The README.md has a section on the Git Workflow I've adopted.

- **Event Sourcing architecture**
  - Because I can't imagine an online Casino being built without one.
  - I created the *EventBroker* component quite late in the sprint... I hope there's enough in this release to show you I have an understanding of the concept.
  - There's plenty of refactoring to do to fully embed the EventBroker, but ultimately, I'd want ++all++ processing to be performed in response to events (so I can start doing cool things like recording the events and playing them back).

- **Working endpoint**
  - I want a 'micro-service' architecture to be able to spin up multiple instances of my Roulette service as demand grows.
  - I want a fully self-contained deployable artefact (an executable .jar)
  - I want to be able to alter the behaviour of the service via properties in a config file.


I'm reasonably happy with the results of the first (one week) sprint - see the first section of the README.md for a summary of what can be done in this release.  You might also want to take a look at the [issues](https://github.com/sparcs360/Casino/issues) I've logged to get a taste of what it doesn't do... although I'm sure you can make your own mind up about that :)

Looking forward to hearing from you.

Lee.

## Running and Testing

See the **Build with Maven** and **Starting the micro-service** sections of [README.md](https://github.com/sparcs360/Casino/blob/master/README.md).
