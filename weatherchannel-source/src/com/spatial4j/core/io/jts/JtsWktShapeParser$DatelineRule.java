// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;


// Referenced classes of package com.spatial4j.core.io.jts:
//            JtsWktShapeParser

public static final class  extends Enum
{

    private static final ccwRect a[];
    public static final ccwRect ccwRect;
    public static final ccwRect none;
    public static final ccwRect width180;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spatial4j/core/io/jts/JtsWktShapeParser$DatelineRule, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        none = new <init>("none", 0);
        width180 = new <init>("width180", 1);
        ccwRect = new <init>("ccwRect", 2);
        a = (new a[] {
            none, width180, ccwRect
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
