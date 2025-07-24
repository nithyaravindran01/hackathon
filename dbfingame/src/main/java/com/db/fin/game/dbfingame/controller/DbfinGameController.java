package com.db.fin.game.dbfingame.controller;

import com.db.fin.game.dbfingame.model.Question;
import com.db.fin.game.dbfingame.model.QuestionResponse;
import com.db.fin.game.dbfingame.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class DbfinGameController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/{id}")
    public ResponseEntity<QuestionResponse> getQuestionResponse(@PathVariable("id") String id) {
        return ResponseEntity.ok(questionService.getResponseById(id));
    }

    @GetMapping("/level/{id}")
    public ResponseEntity<List<Question>> getQuestionsByLevel(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(questionService.getQuestionByLevel(id));
    }
}
