package week4.assignment1;

import lombok.extern.slf4j.Slf4j;
import org.kohsuke.github.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class GithubRepoStatistics {
    private GitHub gitHub;
    private GHRepository ghRepository;

    public GithubRepoStatistics(String token, String repo) {
        GitHubBuilder builder = new GitHubBuilder();
        try {
            this.gitHub = builder.withOAuthToken(token).build();
            this.ghRepository = this.gitHub.getRepository(repo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        List<GHIssue> issues = getAllIssues();

    }

    private List<GHIssue> getAllIssues() {
        try {
            return this.ghRepository.getIssues(GHIssueState.ALL);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
