// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.l;

public final class param extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN BLURAY;
    public static final UNKNOWN DESKTOP;
    public static final UNKNOWN GAME_CONSOLE;
    public static final UNKNOWN MOBILE;
    public static final UNKNOWN STB;
    public static final UNKNOWN TABLET;
    public static final UNKNOWN TV;
    public static final UNKNOWN UNKNOWN;
    public final String param;

    public static param fromContext(Context context)
    {
        if (PackageUtil.e(context))
        {
            return TV;
        }
        if (l.a(context))
        {
            return TABLET;
        } else
        {
            return MOBILE;
        }
    }

    public static MOBILE valueOf(String s)
    {
        return (MOBILE)Enum.valueOf(com/google/android/apps/youtube/core/client/DeviceClassification$Platform, s);
    }

    public static MOBILE[] values()
    {
        return (MOBILE[])$VALUES.clone();
    }

    static 
    {
        DESKTOP = new <init>("DESKTOP", 0, "desktop");
        MOBILE = new <init>("MOBILE", 1, "mobile");
        TV = new <init>("TV", 2, "tv");
        TABLET = new <init>("TABLET", 3, "tablet");
        BLURAY = new <init>("BLURAY", 4, "bluray");
        STB = new <init>("STB", 5, "stb");
        GAME_CONSOLE = new <init>("GAME_CONSOLE", 6, "game_console");
        UNKNOWN = new <init>("UNKNOWN", 7, "unknown_platform");
        $VALUES = (new .VALUES[] {
            DESKTOP, MOBILE, TV, TABLET, BLURAY, STB, GAME_CONSOLE, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        param = s1;
    }
}
