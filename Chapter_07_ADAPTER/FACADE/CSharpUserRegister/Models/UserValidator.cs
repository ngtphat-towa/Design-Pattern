namespace CSharpUserRegister.Models;

public static class UserValidator
{
    public static bool Validate(User user)
    {
        //Need to Validate the User Object
        Console.WriteLine("User Validated...");
        Console.WriteLine($"Name:{user.Name}");
        Console.WriteLine($"Email:{user.Email}");
        Console.WriteLine($"Mobile:{user.MobileNumber}");
        Console.WriteLine($"Address:{user.Address}");
        return true;
    }
}