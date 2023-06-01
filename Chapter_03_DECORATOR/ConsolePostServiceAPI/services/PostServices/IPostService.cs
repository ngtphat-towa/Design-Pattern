
using ConsolePostServiceAPI.models;

namespace ConsolePostServiceAPI.services;

public interface IPostService
{
    public Task<Post?> GetPost(int postId);
}