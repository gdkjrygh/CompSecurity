// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.annotate;


// Referenced classes of package org.codehaus.jackson.annotate:
//            JsonTypeInfo

public static final class  extends Enum
{

    private static final EXTERNAL_PROPERTY $VALUES[];
    public static final EXTERNAL_PROPERTY EXTERNAL_PROPERTY;
    public static final EXTERNAL_PROPERTY PROPERTY;
    public static final EXTERNAL_PROPERTY WRAPPER_ARRAY;
    public static final EXTERNAL_PROPERTY WRAPPER_OBJECT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/codehaus/jackson/annotate/JsonTypeInfo$As, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PROPERTY = new <init>("PROPERTY", 0);
        WRAPPER_OBJECT = new <init>("WRAPPER_OBJECT", 1);
        WRAPPER_ARRAY = new <init>("WRAPPER_ARRAY", 2);
        EXTERNAL_PROPERTY = new <init>("EXTERNAL_PROPERTY", 3);
        $VALUES = (new .VALUES[] {
            PROPERTY, WRAPPER_OBJECT, WRAPPER_ARRAY, EXTERNAL_PROPERTY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
