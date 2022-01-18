package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NewsTest {
    @Test
    public void testCompareTo_HappyCaseOne() {
        News myNews = new News("Hello world", 7);
        News incomingNews = new News("Hello", 7);

        assertEquals(-1, myNews.compareTo(incomingNews));
    }

    @Test
    public void testCompareTo_HappyCaseTwo() {
        News myNews = new News("Hello world", 2);
        News incomingNews = new News("Hello", 7);

        assertEquals(-1, myNews.compareTo(incomingNews));
    }

    @Test
    public void testCompareTo_HappyCaseThree() {
        News myNews = new News("Hello world", 10);
        News incomingNews = new News("Hello", 1);

        assertEquals(1, myNews.compareTo(incomingNews));
    }

    @Test
    public void testCompareTo_PriorityZero() {
        News myNews = new News("Hello world", 0);
        News incomingNews = new News("Hello", 0);

        assertEquals(-1, myNews.compareTo(incomingNews));
    }

    @Test
    public void testCompareTo_TextEmpty() {
        News myNews = new News("", 7);
        News incomingNews = new News("", 7);

        assertEquals(-1, myNews.compareTo(incomingNews));
    }

    @Test
    public void testCompareTo_Text() {
        MalformedNewsException thrown = Assertions.assertThrows(MalformedNewsException.class, () -> {
            News myNews = new News(null, 7);
            News incomingNews = new News(null, 7);
            myNews.compareTo(incomingNews);
        });
        assertEquals("Text is null.", thrown.getMessage());
    }

}