// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape;


// Referenced classes of package com.spatial4j.core.shape:
//            SpatialRelation

static final class 
{

    static final int a[];

    static 
    {
        a = new int[SpatialRelation.values().length];
        try
        {
            a[SpatialRelation.CONTAINS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SpatialRelation.WITHIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SpatialRelation.DISJOINT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
