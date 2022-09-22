package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "Mango_cake";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            return Integer.toString(Integer.parseInt(parts[2]) + Integer.parseInt(parts[4]));
        }

        

        return "";
    }
}
