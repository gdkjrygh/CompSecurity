// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.log;


// Referenced classes of package com.arubanetworks.meridian.log:
//            MeridianLogger

public static final class a extends Enum
{

    public static final DEBUG_REPORTS CAMPAIGNS;
    public static final DEBUG_REPORTS DEBUG_REPORTS;
    public static final DEBUG_REPORTS DIRECTIONS;
    public static final DEBUG_REPORTS LOCATION;
    public static final DEBUG_REPORTS MAPS;
    public static final DEBUG_REPORTS OPENGL;
    public static final DEBUG_REPORTS REQUESTS;
    public static final DEBUG_REPORTS SEARCH;
    private static final DEBUG_REPORTS b[];
    private boolean a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/arubanetworks/meridian/log/MeridianLogger$Feature, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public boolean isEnabled()
    {
        return a;
    }

    static 
    {
        DIRECTIONS = new <init>("DIRECTIONS", 0, true);
        CAMPAIGNS = new <init>("CAMPAIGNS", 1, true);
        MAPS = new <init>("MAPS", 2, true);
        REQUESTS = new <init>("REQUESTS", 3, true);
        LOCATION = new <init>("LOCATION", 4, true);
        OPENGL = new <init>("OPENGL", 5, true);
        SEARCH = new <init>("SEARCH", 6, true);
        DEBUG_REPORTS = new <init>("DEBUG_REPORTS", 7, true);
        b = (new b[] {
            DIRECTIONS, CAMPAIGNS, MAPS, REQUESTS, LOCATION, OPENGL, SEARCH, DEBUG_REPORTS
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        a = flag;
    }
}
