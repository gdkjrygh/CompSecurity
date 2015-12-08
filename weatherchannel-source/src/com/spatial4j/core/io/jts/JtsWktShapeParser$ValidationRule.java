// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;


// Referenced classes of package com.spatial4j.core.io.jts:
//            JtsWktShapeParser

public static final class  extends Enum
{

    private static final repairBuffer0 a[];
    public static final repairBuffer0 error;
    public static final repairBuffer0 none;
    public static final repairBuffer0 repairBuffer0;
    public static final repairBuffer0 repairConvexHull;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spatial4j/core/io/jts/JtsWktShapeParser$ValidationRule, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        none = new <init>("none", 0);
        error = new <init>("error", 1);
        repairConvexHull = new <init>("repairConvexHull", 2);
        repairBuffer0 = new <init>("repairBuffer0", 3);
        a = (new a[] {
            none, error, repairConvexHull, repairBuffer0
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
