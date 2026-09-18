package studysmart.service;

import java.util.ArrayList;
import java.util.List;

import studysmart.model.QuizResult;

public class PerformanceAnalyzer {

    private List<QuizResult> results;

    public PerformanceAnalyzer() {
        results = new ArrayList<>();
    }

    public void addResult(QuizResult result) {
        results.add(result);
    }

    public List<QuizResult> getResults() {
        return results;
    }

    public double getAverageScore() {

        if (results.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (QuizResult result : results) {
            total += result.getPercentage();
        }

        return total / results.size();
    }

    public String getStatus(double score) {

        if (score >= 80) {
            return "Strong";
        } else if (score >= 60) {
            return "Moderate";
        } else {
            return "Needs Improvement";
        }
    }

    public String getWeakestSubject() {

        if (results.isEmpty()) {
            return "No data";
        }

        QuizResult weakest = results.get(0);

        for (QuizResult result : results) {

            if (result.getPercentage()
                    < weakest.getPercentage()) {

                weakest = result;
            }
        }

        return weakest.getSubject();
    }
}
