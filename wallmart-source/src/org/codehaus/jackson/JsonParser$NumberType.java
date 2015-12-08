// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson;


// Referenced classes of package org.codehaus.jackson:
//            JsonParser

public static final class  extends Enum
{

    private static final BIG_DECIMAL $VALUES[];
    public static final BIG_DECIMAL BIG_DECIMAL;
    public static final BIG_DECIMAL BIG_INTEGER;
    public static final BIG_DECIMAL DOUBLE;
    public static final BIG_DECIMAL FLOAT;
    public static final BIG_DECIMAL INT;
    public static final BIG_DECIMAL LONG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/codehaus/jackson/JsonParser$NumberType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INT = new <init>("INT", 0);
        LONG = new <init>("LONG", 1);
        BIG_INTEGER = new <init>("BIG_INTEGER", 2);
        FLOAT = new <init>("FLOAT", 3);
        DOUBLE = new <init>("DOUBLE", 4);
        BIG_DECIMAL = new <init>("BIG_DECIMAL", 5);
        $VALUES = (new .VALUES[] {
            INT, LONG, BIG_INTEGER, FLOAT, DOUBLE, BIG_DECIMAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
