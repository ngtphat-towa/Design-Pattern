using CSharpUserRegister.Models;
using CSharpUserRegister.Services;

namespace CSharpUserRegister;
/*
 * This code is using this example from this website:
 * https://dotnettutorials.net/lesson/facade-design-pattern-real-time-example-csharp/ 
 */
internal class Program
{
    static void Main(string[] args)
    {
        // Create an Instance of User Class
        User user = new User()
        {
            Name = "Pranaya",
            Email = "info@dotnettutorials.net",
            MobileNumber = "1234567890",
            Address = "BBSR, Odisha, India"
        };
        //Using Facade Class
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.Register(user);
    }
}
