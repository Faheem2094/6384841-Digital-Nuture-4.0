import React from 'react';

function BookDetails({ items }) {
  return (
    <div>
      <h2>Book Details</h2>
      {items.map(book => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
}
export default BookDetails;