package com.db.fin.game.dbfingame.service;

import com.db.fin.game.dbfingame.model.Question;
import com.db.fin.game.dbfingame.model.QuestionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionService {
    public Map<String, QuestionResponse> qMap = new HashMap<>();

    public List<Question> getQuestionByLevel(int level) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("L001", "CREDITED: Rs.75 wallet money. Use it to order medicines and get FLAT 22% OFF. Code. PHMY22 *TC Pharm...", 1));
        questions.add(new Question("L002", "Enjoy more talktime when you recharge your Airtel line! Using your smartcash bank account, you get 1...", 1));
        questions.add(new Question("L003", "Do you like your friend's signature? Reply with '1' to copy your friend's signature. Dial *836*51# t...", 1));
        questions.add(new Question("L004", "Keep up with MTN Broadband! Visit https://apps.mtn.ng/newsletter/c/mtn-broadband-july-newsletter to ...", 1));
        return questions;
    }

    public QuestionResponse getResponseById(String questionId) {
        return new QuestionResponse("L001", "That's correct", "No, you shouldn't respond to such messages");
    }


}
