package io.minimum.minecraft.superbvote.votes.rewards.matchers;

import io.minimum.minecraft.superbvote.votes.Vote;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class ServiceRewardMatcher implements RewardMatcher {
    private final List<String> names;

    public ServiceRewardMatcher(List<String> names) {
        this.names = new ArrayList<>(names);
        this.names.replaceAll(String::toLowerCase);
    }

    @Override
    public boolean matches(Vote vote) {
        return names.contains(vote.getServiceName().toLowerCase());
    }
}
