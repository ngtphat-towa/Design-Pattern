using ConsolePostServiceAPI.models;

namespace ConsolePostServiceAPI.services.PostServices.Decorator;

public abstract class PostServiceDecorator : IPostService
{
    protected readonly IPostService postService;

    protected PostServiceDecorator(IPostService postService)
    {
        this.postService = postService;
    }

    public abstract Task<Post?> GetPost(int postId);

}