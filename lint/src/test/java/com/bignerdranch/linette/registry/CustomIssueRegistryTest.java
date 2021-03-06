package com.bignerdranch.linette.registry;

import com.android.tools.lint.detector.api.Issue;
import com.bignerdranch.linette.detectors.EnumDetector;
import com.bignerdranch.linette.detectors.MinSdkDetector;
import com.bignerdranch.linette.detectors.TodoDetector;

import org.junit.Before;
import org.junit.Test;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test the {@link CustomIssueRegistry}
 */
public class CustomIssueRegistryTest {

    private CustomIssueRegistry mCustomIssueRegistry;

    /**
     * Setup for the other test methods
     */
    @Before
    public void setUp() throws Exception {
        mCustomIssueRegistry = new CustomIssueRegistry();
    }

    /**
     * Test that the issue registry contains the correct number of issues
     */
    @Test
    public void testNumberOfIssues() throws Exception {
        int size = mCustomIssueRegistry.getIssues().size();
        assertThat(size).isEqualTo(3);
    }

    /**
     * Test that the issue registry contains the correct issues
     */
    @Test
    public void testGetIssues() throws Exception {
        List<Issue> actual = mCustomIssueRegistry.getIssues();
        assertThat(actual).contains(EnumDetector.ISSUE);
        assertThat(actual).contains(MinSdkDetector.ISSUE);
        assertThat(actual).contains(TodoDetector.ISSUE);
    }

}
