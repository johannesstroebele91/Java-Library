package de.hdm_stuttgart.mi.Classes_Objects;

import java.util.Objects;

public class ClassCreationExample {

    static Article bicycle = new Article("Bicycle", 2312, 2312);

    public static void main(String[] args) {
        System.out.println(bicycle.toString());
    }

    /**
     * Prodcuts class.
     * <p>
     * Article with article name, article number, and price (230,50€ are 23050 cents)
     * <p>
     * toString method: bicycle, article number 3321 to 230,50€
     * equals and hashcode method: only depended on article number
     */
    static public class Article {

        private String articleName;
        private int articleNumber;
        private int price;

        public Article(String articleName, int articleNumber, int price) {
            this.articleName = articleName;
            this.articleNumber = articleNumber;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Article artikel = (Article) o;
            return articleNumber == artikel.articleNumber;
        }

        @Override
        public int hashCode() {
            return Objects.hash(articleNumber);
        }

        @Override
        public String toString() {
            return articleName + ", article number " + articleNumber + " to " + String.format("%.2f", (double) price / 100) + "€";
        }
    }
}