package com.db.fin.game.dbfingame.model;

public class QuestionResponse {
    private String questionId;
    private String answer;
    private String feedback;

    public QuestionResponse(String questionId, String answer, String feedback) {
        this.questionId = questionId;
        this.answer = answer;
        this.feedback = feedback;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

}
