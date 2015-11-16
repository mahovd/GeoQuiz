package com.mahovd.bignerdranch.geoquiz;

/**
 * Created by mahovd on 10/10/15.
 */
public class Question {

    //String id
    private int mTextResId;
    //Answer state
    private boolean mAnswerTrue;
    //Question state
    private boolean mWasCheated;


    //Getting String id of current answer
    public int getTextResId() {
        return mTextResId;
    }

    //Set text id (never used yet)
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    //Get state of current answer
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    //Set answer state (never used yet)
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    //Constructor
    public Question(int textResId, boolean answerTrue, boolean wasCheated) {
        this.mTextResId = textResId;
        this.mAnswerTrue = answerTrue;
        this.mWasCheated = wasCheated;
    }

    public boolean isWasCheated() {
        return mWasCheated;
    }

    public void setWasCheated(boolean wasCheated) {
        mWasCheated = wasCheated;
    }
}
