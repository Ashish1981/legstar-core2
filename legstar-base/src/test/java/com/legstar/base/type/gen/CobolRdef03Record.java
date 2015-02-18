package com.legstar.base.type.gen;

import java.util.LinkedHashMap;
import java.util.Map;

import com.legstar.base.type.CobolType;
import com.legstar.base.type.composite.*;
import com.legstar.base.type.primitive.*;

public class CobolRdef03Record extends CobolComplexType {

    public CobolRdef03Record() {
        super(new CobolComplexType.Builder()
                    .name("Rdef03Record")
                    .cobolName("RDEF03-RECORD")
                    .fields(createRdef03RecordFields())
              );
    }

    private static Map < String, CobolType > createComDetail1Fields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolStringType < String > comName =
                new CobolStringType.Builder < String >(String.class)
                        .cobolName("COM-NAME")
                        .charNum(10)
                        .build();
        fields.put("comName", comName);

        return fields;

    }

    private static Map < String, CobolType > createComDetail2Fields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolPackedDecimalType < java.math.BigDecimal > comAmount =
                new CobolPackedDecimalType.Builder < java.math.BigDecimal >(java.math.BigDecimal.class)
                        .cobolName("COM-AMOUNT")
                        .totalDigits(7)
                        .fractionDigits(2)
                        .build();
        fields.put("comAmount", comAmount);

        return fields;

    }

    private static Map < String, CobolType > createComDetail3Fields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolZonedDecimalType < Long > comNumber =
                new CobolZonedDecimalType.Builder < Long >(Long.class)
                        .cobolName("COM-NUMBER")
                        .totalDigits(5)
                        .build();
        fields.put("comNumber", comNumber);

        return fields;

    }

    private static Map < String, CobolType > createRdef03RecordFields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolBinaryType < Integer > comSelect =
                new CobolBinaryType.Builder < Integer >(Integer.class)
                        .cobolName("COM-SELECT")
                        .totalDigits(4)
                        .build();
        fields.put("comSelect", comSelect);

        CobolChoiceType comDetail1Choice = new CobolChoiceType.Builder()
                        .name("ComDetail1Choice")
                        .alternatives(createComDetail1ChoiceFields())
                        .build();
        fields.put("comDetail1Choice", comDetail1Choice);

        return fields;

    }

    private static Map < String, CobolType > createComDetail1ChoiceFields() {

        Map < String, CobolType > fields = new LinkedHashMap < String, CobolType >();

        CobolComplexType comDetail1 = new CobolComplexType.Builder()
                        .name("ComDetail1")
                        .cobolName("COM-DETAIL1")
                        .fields(createComDetail1Fields())
                        .build();
        fields.put("comDetail1", comDetail1);

        CobolComplexType comDetail2 = new CobolComplexType.Builder()
                        .name("ComDetail2")
                        .cobolName("COM-DETAIL2")
                        .fields(createComDetail2Fields())
                        .build();
        fields.put("comDetail2", comDetail2);

        CobolComplexType comDetail3 = new CobolComplexType.Builder()
                        .name("ComDetail3")
                        .cobolName("COM-DETAIL3")
                        .fields(createComDetail3Fields())
                        .build();
        fields.put("comDetail3", comDetail3);

        return fields;

    }

}
