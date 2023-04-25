package org.example;

public class Review {
    private static double[][] avgRating;

    public Review(double[][] avgRating) {
        this.avgRating = avgRating;
        for (int k = 0; k < avgRating.length; k++) {
            avgRating[k][1] = avgRating[k][0] = 0.0;
        }
    }

    public double getRating(int index){
        return avgRating[index][0];
    }
    public void addRating(int index, int rating){
        double totRating = avgRating[index][0] * avgRating[index][1];
        avgRating[index][0] = (totRating+rating) / (avgRating[index][1]+1);
        avgRating[index][1]++;
    }

}
