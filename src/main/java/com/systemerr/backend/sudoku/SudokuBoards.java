package com.systemerr.backend.sudoku;

import java.util.List;

public record SudokuBoards(List<SudokuBoard> grids, int results, String message) {
}