package com.roadmm.workflow.component;

/**
 * Encapsulation of customer specific activity
 *
 * @Author lnz
 * @Date created in 2/12/22
 */
public abstract class Activity {

    /**
     * Perform an activity as part of a work-flow.
     * @return The activity result.
     */
    public abstract ActivityResult act();

    /**
     * Get the name of the activity.
     * @return The activity's name
     */
    public String getActivityName() {
        return getClass().getName();
    }

}

