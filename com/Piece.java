package com;

import java.util.HashSet;

/**
 * Piece
 */
public class Piece {

    public char type;
    public char color;
    public boolean moved = false;
    public HashSet<Point> moves = new HashSet<>();

    public Piece(char type) {
        this.type = type;
    }

    // TODO: Get Legal Moves
    public void getMoves() {
        
    }

    // TODO: Check for Castle
    public void castle() {

    }

    // TODO: Check for En Passant
    public void passant() {
        
    }
}