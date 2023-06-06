namespace CSharpSingleton.double_check_locking;

// Bad code! Do not use!
// This implementation attempts to be thread-safe without the necessity of taking out a lock every time.
// However, it has several downsides, including not working in Java and being easy to get wrong.
public sealed class DoubleCheckLockingSingleton
{
    private static DoubleCheckLockingSingleton _instance = null;

    private static readonly object padlock = new object();

    DoubleCheckLockingSingleton()
    {
    }

    public static DoubleCheckLockingSingleton Instance
    {
        get
        {
            if (_instance == null)
            {
                lock (padlock)
                {
                    if (_instance == null)
                    {
                        _instance = new DoubleCheckLockingSingleton();
                    }
                }
            }
            return _instance;
        }
    }
    public String getDescription() {
        return "I'm a thread-safety Singleton using double-check locking !";
    }
}