// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;


public final class mType extends Enum
{

    private static final LARGE_IMAGE_LIST $VALUES[];
    public static final LARGE_IMAGE_LIST COMPACT_LIST;
    public static final LARGE_IMAGE_LIST GRID;
    public static final LARGE_IMAGE_LIST LARGE_IMAGE_LIST;
    private final String mType;

    public static mType fromType(String s)
    {
        mType amtype[] = values();
        int j = amtype.length;
        for (int i = 0; i < j; i++)
        {
            mType mtype = amtype[i];
            if (mtype.mType.equals(s))
            {
                return mtype;
            }
        }

        return COMPACT_LIST;
    }

    public static COMPACT_LIST valueOf(String s)
    {
        return (COMPACT_LIST)Enum.valueOf(com/ubercab/client/feature/shoppingcart/model/Page$DisplayType, s);
    }

    public static COMPACT_LIST[] values()
    {
        return (COMPACT_LIST[])$VALUES.clone();
    }

    static 
    {
        COMPACT_LIST = new <init>("COMPACT_LIST", 0, "");
        GRID = new <init>("GRID", 1, "grid");
        LARGE_IMAGE_LIST = new <init>("LARGE_IMAGE_LIST", 2, "list");
        $VALUES = (new .VALUES[] {
            COMPACT_LIST, GRID, LARGE_IMAGE_LIST
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mType = s1;
    }
}
