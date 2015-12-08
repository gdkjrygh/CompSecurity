// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.annotate;


// Referenced classes of package org.codehaus.jackson.map.annotate:
//            JsonSerialize

public static final class  extends Enum
{

    private static final STATIC $VALUES[];
    public static final STATIC DYNAMIC;
    public static final STATIC STATIC;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/codehaus/jackson/map/annotate/JsonSerialize$Typing, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DYNAMIC = new <init>("DYNAMIC", 0);
        STATIC = new <init>("STATIC", 1);
        $VALUES = (new .VALUES[] {
            DYNAMIC, STATIC
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
