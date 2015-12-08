// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.data;


public final class SearchDirection extends Enum
{

    public static final SearchDirection ALL;
    public static final SearchDirection HORIZONTAL;
    public static final SearchDirection VERTICAL;
    private static final SearchDirection b[];
    private int a;

    private SearchDirection(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static SearchDirection valueOf(String s)
    {
        return (SearchDirection)Enum.valueOf(com/kofax/kmc/kui/uicontrols/data/SearchDirection, s);
    }

    public static SearchDirection[] values()
    {
        return (SearchDirection[])b.clone();
    }

    public int getValue()
    {
        return a;
    }

    static 
    {
        HORIZONTAL = new SearchDirection("HORIZONTAL", 0, 3);
        VERTICAL = new SearchDirection("VERTICAL", 1, 12);
        ALL = new SearchDirection("ALL", 2, 15);
        b = (new SearchDirection[] {
            HORIZONTAL, VERTICAL, ALL
        });
    }
}
