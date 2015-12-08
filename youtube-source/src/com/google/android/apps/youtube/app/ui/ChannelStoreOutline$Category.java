// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.res.Resources;
import com.google.android.youtube.p;

public final class stringId extends Enum
{

    private static final NOTEWORTHY $VALUES[];
    public static final NOTEWORTHY LOCAL;
    public static final NOTEWORTHY MOST_SUBSCRIBED;
    public static final NOTEWORTHY MOST_VIEWED;
    public static final NOTEWORTHY NOTEWORTHY;
    public static final NOTEWORTHY RECOMMENDED;
    public final int position;
    public final int stringId;

    public static stringId valueOf(String s)
    {
        return (stringId)Enum.valueOf(com/google/android/apps/youtube/app/ui/ChannelStoreOutline$Category, s);
    }

    public static stringId[] values()
    {
        return (stringId[])$VALUES.clone();
    }

    public final String toString(Resources resources)
    {
        return resources.getString(stringId);
    }

    static 
    {
        RECOMMENDED = new <init>("RECOMMENDED", 0, 0, p.eS);
        MOST_SUBSCRIBED = new <init>("MOST_SUBSCRIBED", 1, 1, p.cI);
        MOST_VIEWED = new <init>("MOST_VIEWED", 2, 2, p.cJ);
        LOCAL = new <init>("LOCAL", 3, 3, p.cw);
        NOTEWORTHY = new <init>("NOTEWORTHY", 4, 4, p.cW);
        $VALUES = (new .VALUES[] {
            RECOMMENDED, MOST_SUBSCRIBED, MOST_VIEWED, LOCAL, NOTEWORTHY
        });
    }

    private I(String s, int i, int j, int k)
    {
        super(s, i);
        position = j;
        stringId = k;
    }
}
