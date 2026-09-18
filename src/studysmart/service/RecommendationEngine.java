package studysmart.service;

public class RecommendationEngine {

    public String generateRecommendation(
            double score,
            String difficulty,
            int availableMinutes) {

        if (score < 50) {

            return "Your performance needs improvement. "
                    + "Revise the basic concepts and practice "
                    + "for " + availableMinutes + " minutes.";

        } else if (score < 70) {

            return "Your performance is moderate. "
                    + "Review important concepts and solve "
                    + "practice questions for "
                    + availableMinutes + " minutes.";

        } else if (difficulty.equalsIgnoreCase("Hard")) {

            return "Your score is good, but this is a difficult topic. "
                    + "Try advanced practice for "
                    + availableMinutes + " minutes.";

        } else {

            return "Good performance! Spend "
                    + availableMinutes
                    + " minutes revising before moving to a new topic.";
        }
    }
}