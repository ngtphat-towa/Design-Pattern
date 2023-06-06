namespace CSharpSingleton.lazy_net_4;

public sealed class Singleton
{
    private static readonly Lazy<Singleton> Lazy =
        new Lazy<Singleton>(() => new Singleton());

    public static Singleton Instance => Lazy.Value;

    private Singleton()
    {
    }
    public String getDescription() {
        return "I'm a Thread Safe Singleton without using locks and no lazy instantiation!";
    }
}