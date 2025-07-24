package com.db.fin.game.dbfingame.model;

public class Question {
    public String questionId;
    public String question;
    public int level;

    public Question(String questionId, String question, int level) {
        this.questionId = questionId;
        this.question = question;
        this.level = level;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
