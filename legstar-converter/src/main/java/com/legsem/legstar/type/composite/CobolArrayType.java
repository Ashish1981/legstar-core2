package com.legsem.legstar.type.composite;

import com.legsem.legstar.context.CobolContext;
import com.legsem.legstar.type.CobolType;
import com.legsem.legstar.utils.StringUtils;
import com.legsem.legstar.visitor.CobolVisitor;

/**
 * Array of other types.
 * <p/>
 * If there is no dependingOn then this is a fixed size array otherwise, it is a
 * variable size array which size is determined at runtime by the value of the
 * dependingOn variable.
 * 
 * @param an item java object type
 */
public class CobolArrayType extends CobolCompositeType {

    private final CobolType itemType;

    private final int maxOccurs;

    private final String dependingOn;

    public CobolArrayType(CobolContext cobolContext, CobolType itemType,
            int maxOccurs) {
        this(cobolContext, itemType, maxOccurs, null);
    }

    public CobolArrayType(CobolContext cobolContext, CobolType itemType,
            int maxOccurs, String dependingOn) {
        super(cobolContext);
        this.maxOccurs = maxOccurs;
        this.itemType = itemType;
        this.dependingOn = dependingOn;
    }

    /** {@inheritDoc} */
    public void accept(CobolVisitor visitor) {
        visitor.visit(this);
    }

    public CobolType getItemType() {
        return itemType;
    }

    public int getMaxOccurs() {
        return maxOccurs;
    }

    public String getDependingOn() {
        return dependingOn;
    }

    public boolean isVariableSize() {
        return StringUtils.isNotBlank(dependingOn);
    }

}
