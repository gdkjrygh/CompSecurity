// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape;


public final class SpatialRelation extends Enum
{

    public static final SpatialRelation CONTAINS;
    public static final SpatialRelation DISJOINT;
    public static final SpatialRelation INTERSECTS;
    public static final SpatialRelation WITHIN;
    private static final SpatialRelation a[];

    private SpatialRelation(String s, int i)
    {
        super(s, i);
    }

    public static SpatialRelation valueOf(String s)
    {
        return (SpatialRelation)Enum.valueOf(com/spatial4j/core/shape/SpatialRelation, s);
    }

    public static SpatialRelation[] values()
    {
        return (SpatialRelation[])a.clone();
    }

    public final SpatialRelation combine(SpatialRelation spatialrelation)
    {
        if (spatialrelation == this)
        {
            return this;
        }
        if (this == DISJOINT && spatialrelation == CONTAINS || this == CONTAINS && spatialrelation == DISJOINT)
        {
            return CONTAINS;
        } else
        {
            return INTERSECTS;
        }
    }

    public final boolean intersects()
    {
        return this != DISJOINT;
    }

    public final SpatialRelation inverse()
    {
        static final class _cls1
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

        switch (_cls1.a[ordinal()])
        {
        default:
            return INTERSECTS;

        case 3: // '\003'
            return CONTAINS;

        case 1: // '\001'
            return DISJOINT;

        case 2: // '\002'
            return INTERSECTS;
        }
    }

    public final SpatialRelation transpose()
    {
        switch (_cls1.a[ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            return WITHIN;

        case 2: // '\002'
            return CONTAINS;
        }
    }

    static 
    {
        WITHIN = new SpatialRelation("WITHIN", 0);
        CONTAINS = new SpatialRelation("CONTAINS", 1);
        DISJOINT = new SpatialRelation("DISJOINT", 2);
        INTERSECTS = new SpatialRelation("INTERSECTS", 3);
        a = (new SpatialRelation[] {
            WITHIN, CONTAINS, DISJOINT, INTERSECTS
        });
    }
}
