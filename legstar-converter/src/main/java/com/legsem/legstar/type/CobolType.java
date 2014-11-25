package com.legsem.legstar.type;

import com.legsem.legstar.context.CobolContext;
import com.legsem.legstar.visitor.CobolVisitor;

/**
 * Represents a COBOL item type.
 * <p/>
 * They represent metadata and do not hold the actual item value during
 * conversion.
 * <p/>
 * Types are immutable and thread safe.
 * 
 */
public abstract class CobolType {

    private final CobolContext cobolContext;

    public CobolType(CobolContext cobolContext) {
        this.cobolContext = cobolContext;
    }

    /**
     * Propagate a visitor.
     * 
     * @param visitor the visitor
     */
    public abstract void accept(CobolVisitor visitor);

    public CobolContext getCobolContext() {
        return cobolContext;
    }

}
