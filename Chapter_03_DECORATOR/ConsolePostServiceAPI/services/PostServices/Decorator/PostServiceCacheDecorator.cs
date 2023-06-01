using ConsolePostServiceAPI.models;

namespace ConsolePostServiceAPI.services.PostServices.Decorator;

public class PostServiceCacheDecorator : PostServiceDecorator
{
    private readonly Dictionary<int, Post> cache;

    public PostServiceCacheDecorator(IPostService postService) : base(postService)
    {
        cache = new Dictionary<int, Post>();
    }

    public override async Task<Post?> GetPost(int postId)
    {
        // get post from the cache
        if (cache.TryGetValue(postId, out var post))
        {
            // demo purpose 
            Console.WriteLine($"Getting the post with id {postId} from the cache");
            return post;
        }

        // otherwise call the API
        post = await postService.GetPost(postId);
        if (post != null)
        {
            cache[postId] = post;
        }
        return post;

    }
}