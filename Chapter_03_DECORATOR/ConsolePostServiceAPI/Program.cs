using ConsolePostServiceAPI.services;
using ConsolePostServiceAPI.services.PostServices.Decorator;

namespace ConsolePostServiceAPI;

internal static class Program
{
    public static async Task Main(string[] args)
    {
        IPostService postService = new PostService();
        var postServiceLogging = new PostServiceLoggingDecorator(postService);
        var postServiceCache = new PostServiceCacheDecorator(postServiceLogging);
        try
        {
            var post = await postServiceCache.GetPost(1);
            Console.WriteLine(post);

            // request the same post second time
            Console.WriteLine("Getting the same post again:");
            post = await postServiceCache.GetPost(1);
            Console.WriteLine(post);
        }
        catch (Exception)
        {
            throw;
        }
    }
}

