import React, { useState } from 'react';
import './App.css';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import { courses } from './data/courseData';
import { books } from './data/bookData';
import { blogs } from './data/blogData';

function App() {
  const [view, setView] = useState('all'); 

  let content;
  if (view === 'all') {
    content = (
      <div className="container">
        <div className="section"><CourseDetails items={courses} /></div>
        <div className="section"><BookDetails items={books} /></div>
        <div className="section"><BlogDetails items={blogs} /></div>
      </div>
    );
  } else if (view === 'courses') {
    content = <CourseDetails items={courses} />;
  } else if (view === 'books') {
    content = <BookDetails items={books} />;
  } else if (view === 'blogs') {
    content = <BlogDetails items={blogs} />;
  }

  return (
    <div className="app-container">
      <h1>Blogger App</h1>
      <div className="controls">
        <button onClick={() => setView('all')}>Show All</button>
        <button onClick={() => setView('courses')}>Show Courses</button>
        <button onClick={() => setView('books')}>Show Books</button>
        <button onClick={() => setView('blogs')}>Show Blogs</button>
      </div>

      <hr />

      {content}
    </div>
  );
}

export default App;