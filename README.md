# github.com/amritabindukalpa/sbg-api

The bets are placed as parameters to the api. At the moment it allows for 3 types of bets to be placed: - number,  odd or even (parity) and the colour of the resulting number

e.g. http://localhost:8080/placebets/?n=29&c=red&p=odd

The result for this is a direct display of the text message whether the user has won or lost a particular category of bet. It also displays the number which was the outcome of the simulated spin of the roulette.

The main function invokes the handlers. There are 3 models at play, bets, result and winning. The handler creates a bet and a result. These are passed as parameters to the betresults package which determines a win or loss.
The determinator module determines the qualities of the generated number, whether its odd/even, its colour etc.
The generator module generates a random number. It can be parameterised to generate the number within a limit.

To run the application :-

1. Extract the repository git clone <bundle-file-directory>/sbg-api.bundle <directory-to-extract-to>
2. Open the folder <directory-to-extract-to> in VS Code
3. Start a new terminal( Ctrl + Shift + ')
4. Run docker-compose up
5. Browse to http://localhost:8080/placebets/?n=29&c=red&p=odd with the parameters with n, c and p being changed

Things I would have liked to explore :-

1. I would have liked to implemented more error handling in the application and input validation in the application
2. I would have liked to explore having middleware for logging application flow
3. The application takes the input parameters as simple string. I would have liked to explore json objects
4. I have also attempted to create another api which will take monies on the bets and generate the output
e.g. http://localhost:8080/betswithamount/ This api would take a json object as parameter which would be the user input for all probable bets with a money associated with it. 
