package week4.assignment1;

import org.kohsuke.github.GitHub;

public class Assignment1 {

    public static void main(String[] args) {
        final String token = "";
        final String repo  = "whiteship/live-study";
        GithubRepoStatistics githubRepoStatistics = new GithubRepoStatistics(token, repo);
        githubRepoStatistics.show();
    }



}
