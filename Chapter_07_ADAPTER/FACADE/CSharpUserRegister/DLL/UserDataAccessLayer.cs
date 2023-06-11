using CSharpUserRegister.Models;

namespace CSharpUserRegister.DLL

{
    public class UserDataAccessLayer
    {
        public bool SaveUser(User user)
        {
            //Save the Customer in the Database
            Console.WriteLine("\nCustomer Saved into the Database...");
            return true;
        }
    }
}