// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPDbAdapter

public static final class mTableName extends Enum
{

    private static final PEOPLE ENUM$VALUES[];
    public static final PEOPLE EVENTS;
    public static final PEOPLE PEOPLE;
    private final String mTableName;

    public static mTableName valueOf(String s)
    {
        return (mTableName)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
    }

    public static mTableName[] values()
    {
        mTableName amtablename[] = ENUM$VALUES;
        int i = amtablename.length;
        mTableName amtablename1[] = new ENUM.VALUES[i];
        System.arraycopy(amtablename, 0, amtablename1, 0, i);
        return amtablename1;
    }

    public String getName()
    {
        return mTableName;
    }

    static 
    {
        EVENTS = new <init>("EVENTS", 0, "events");
        PEOPLE = new <init>("PEOPLE", 1, "people");
        ENUM$VALUES = (new ENUM.VALUES[] {
            EVENTS, PEOPLE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mTableName = s1;
    }
}
