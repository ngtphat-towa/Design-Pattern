namespace CSharpSingleton.non_thread_safe;


// Bad code! Do not use!
public sealed class NoThreadSafeSingleton
{
    private static NoThreadSafeSingleton _instance = null;

    private NoThreadSafeSingleton()
    {
    }

    public static NoThreadSafeSingleton Instance
    {
        get
        {
            if (_instance == null)
            {
                _instance = new NoThreadSafeSingleton();
            }
            return _instance;
        }
    }
    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}