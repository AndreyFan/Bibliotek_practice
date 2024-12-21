package com.example.bibliotek.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {

        private Integer bookId;

        private String title;

        private String authorName;

        private String  genre;

        private int yearPublished;

        @Override
        public String toString() {
                return "BookDto{" +
                        "bookId=" + bookId +
                        ", title='" + title + '\'' +
                        ", authorName='" + authorName + '\'' +
                        ", genre='" + genre + '\'' +
                        ", yearPublished=" + yearPublished +
                        '}';
        }
}
