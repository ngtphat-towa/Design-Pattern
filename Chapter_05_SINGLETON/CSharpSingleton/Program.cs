using CSharpSingleton.double_check_locking;
using CSharpSingleton.lazy_net_4;
using CSharpSingleton.non_thread_safe;
using CSharpSingleton.simple_thread_safety;
using CsharpSingleton.static_read_only_init;

// https://csharpindepth.com/Articles/Singleton
// https://www.c-sharpcorner.com/UploadFile/8911c4/singleton-design-pattern-in-C-Sharp/
namespace CSharpSingleton;

internal class Program
{
    static void Main(string[] args)
    {
        var noThreadSafeSingleton = NoThreadSafeSingleton.Instance;
        Console.WriteLine(noThreadSafeSingleton.getDescription());

        var simpleThreadSafeSingleton = SimpleThreadSafeSingleton.Instance;
        Console.WriteLine(simpleThreadSafeSingleton.getDescription());
        
        var doubleCheckLockingSingleton = DoubleCheckLockingSingleton.Instance;
        Console.WriteLine(doubleCheckLockingSingleton.getDescription());
        
        var staticReadOnlySingleton = StaticReadOnlySingleton.Instance;
        Console.WriteLine(staticReadOnlySingleton.getDescription());
        
        var singleton = Singleton.Instance;
        Console.WriteLine(singleton.getDescription());
        
    }
}
