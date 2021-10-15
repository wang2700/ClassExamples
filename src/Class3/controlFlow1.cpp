#include <iostream>

int main() {
    int TARGET = 33;
    int guess;
    std::cout<<"Guess a number between 0 - 100\n";
    
    while (1)
    {
        std::cin>>guess;
    
        std::cout<<"You guessed: "<<guess<<"\n";
        if(guess < TARGET)
        {
            std::cout<<"Your guess is too low.\n";
        }
        else if(guess > TARGET)
        {
            std::cout<<"Your guess is too high.\n";
        }
        else
        {
            std::cout<<"Yay! You guessed correctly.\n";
            break;
        }
    }  
    
    
    return 0;
}