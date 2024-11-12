package it.unibo.deathnote.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import it.unibo.deathnote.api.DeathNote;

public class DeathNoteImplementation implements DeathNote {

    private final Map<String, String> deadHumans;

    public DeathNoteImplementation() {
        this.deadHumans = new HashMap<>();
    }

    @Override
    public String getRule(final int ruleNumber) throws IllegalArgumentException {
        try {
            return DeathNote.RULES.get(ruleNumber);
        } catch (final IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("There is no rule for this number", e);
        }
    }

    @Override
    public void writeName(final String name) throws NullPointerException {
        Objects.requireNonNull(name);
        deadHumans.put(name, DEFAULT_DEATH_CAUSE);
    }

    @Override
    public boolean writeDeathCause(final String cause) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDeathCause'");
    }

    @Override
    public boolean writeDetails(final String details) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDetails'");
    }

    @Override
    public String getDeathCause(final String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeathCause'");
    }

    @Override
    public String getDeathDetails(final String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeathDetails'");
    }

    @Override
    public boolean isNameWritten(final String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNameWritten'");
    }
    
}
