package com.legsem.legstar.visitor;

import java.util.Map;

import com.legsem.legstar.type.CobolType;
import com.legsem.legstar.type.composite.CobolChoiceType;

/**
 * Example of a custom strategy.
 * 
 */
public class Rdef03ObjectFromHostChoiceStrategy implements
        FromCobolChoiceStrategy {

    public CobolType choose(String choiceFieldName, CobolChoiceType choiceType,
            Map < String, Object > variables, byte[] hostData, int start) {

        int select = ((Number) variables.get("comSelect")).intValue();

        switch (select) {
        case 0:
            return choiceType.getAlternatives().get("comDetail1");
        case 1:
            return choiceType.getAlternatives().get("comDetail2");
        case 2:
            return choiceType.getAlternatives().get("comDetail3");
        default:
            return null;

        }
    }

}
