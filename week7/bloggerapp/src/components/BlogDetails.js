import React from 'react';

function BlogDetails({ items }) {
  return (
    <div>
      <h2>Blog Details</h2>
      {items.map(blog => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}
export default BlogDetails;