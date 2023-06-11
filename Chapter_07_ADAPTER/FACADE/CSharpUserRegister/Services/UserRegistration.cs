using System.ComponentModel.DataAnnotations;
using CSharpUserRegister.DLL;
using CSharpUserRegister.Models;

namespace CSharpUserRegister.Services;

  public class UserRegistration
    {
        public bool Register(User user)
        {
            //Step1: Validate the User
            var isValid = UserValidator.Validate(user);
            if (isValid == false) return false;
            
            //Step1: Save the User Object into the database
            var userDataAccessLayer = new UserDataAccessLayer();
            var isSaved = userDataAccessLayer.SaveUser(user);
        
            //Step3: Send the Registration Email to the User
            var emailServices = new EmailServices();
            emailServices.SendRegistrationEmail(user);

            return true;
        }
    }
