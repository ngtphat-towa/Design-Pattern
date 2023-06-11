using CSharpUserRegister.Models;

namespace CSharpUserRegister.Services;

public class EmailServices
{
    public bool SendRegistrationEmail(User user)
    {
        //Send Registration Successful Email to Customer
        Console.WriteLine("\nRegistration Email Send to Customer...");
        return true;
    }
}