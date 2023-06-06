namespace CsharpSingleton.static_read_only_init;

// As you can see, this is really is extremely simple - but why is it thread-safe and how lazy is it?
// Well, static constructors in C# are specified to execute only when an instance of the class is created or a static member is referenced, and to execute only once per AppDomain.
// Given that this check for the type being newly constructed needs to be executed whatever else happens, it will be faster than adding extra checking as in the previous examples. 
public sealed class StaticReadOnlySingleton
{
    private static StaticReadOnlySingleton _instance = new StaticReadOnlySingleton();
    StaticReadOnlySingleton()
    {
    }

    public static StaticReadOnlySingleton Instance
    {
        get
        {
           
                return _instance;
            
        }
    }
    public String getDescription() {
        return "I'm a Thread Safe Singleton using Using .NET 4's Lazy<T> type!";
    }
}