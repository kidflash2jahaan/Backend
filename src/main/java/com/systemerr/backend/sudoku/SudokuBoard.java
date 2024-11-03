package com.systemerr.backend.sudoku;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("boards")
public final class SudokuBoard {
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String user;
    private int[][] value;
    private int[][] solution;
    private String difficulty;
    private String location;

    public SudokuBoard() {
    }

    public SudokuBoard(String user, int[][] value, int[][] solution, String difficulty) {
        this.id = new ObjectId();
        this.user = user;
        this.value = value;
        this.solution = solution;
        this.difficulty = difficulty;
        this.location = "/games/" + id;
    }

    public ObjectId getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public int[][] getSolution() {
        return solution;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getLocation() {
        return location;
    }

    public int[][] getValue() {
        return value;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }
}
