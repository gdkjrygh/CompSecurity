// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.os.Build;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;

public final class DeviceClassification
{

    private final String a;
    private final String b;
    private final Platform c;
    private final SoftwareInterface d;

    public DeviceClassification(String s, String s1, Platform platform, SoftwareInterface softwareinterface)
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s, "packageName cannot be empty");
        b = com.google.android.apps.youtube.common.fromguava.c.a(s1, "appVersion cannot be empty");
        c = (Platform)com.google.android.apps.youtube.common.fromguava.c.a(platform);
        d = (SoftwareInterface)com.google.android.apps.youtube.common.fromguava.c.a(softwareinterface);
    }

    public final o a(o o1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(o1);
        o1.a("cplatform", c.param).a("c", d.param).a("cver", b).a("cos", "Android").a("cosver", android.os.Build.VERSION.RELEASE).a("cbr", a).a("cbrver", b).a("cbrand", Build.MANUFACTURER).a("cmodel", Build.MODEL);
        return o1;
    }

    private class Platform extends Enum
    {

        private static final Platform $VALUES[];
        public static final Platform BLURAY;
        public static final Platform DESKTOP;
        public static final Platform GAME_CONSOLE;
        public static final Platform MOBILE;
        public static final Platform STB;
        public static final Platform TABLET;
        public static final Platform TV;
        public static final Platform UNKNOWN;
        public final String param;

        public static Platform fromContext(Context context)
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

        public static Platform valueOf(String s)
        {
            return (Platform)Enum.valueOf(com/google/android/apps/youtube/core/client/DeviceClassification$Platform, s);
        }

        public static Platform[] values()
        {
            return (Platform[])$VALUES.clone();
        }

        static 
        {
            DESKTOP = new Platform("DESKTOP", 0, "desktop");
            MOBILE = new Platform("MOBILE", 1, "mobile");
            TV = new Platform("TV", 2, "tv");
            TABLET = new Platform("TABLET", 3, "tablet");
            BLURAY = new Platform("BLURAY", 4, "bluray");
            STB = new Platform("STB", 5, "stb");
            GAME_CONSOLE = new Platform("GAME_CONSOLE", 6, "game_console");
            UNKNOWN = new Platform("UNKNOWN", 7, "unknown_platform");
            $VALUES = (new Platform[] {
                DESKTOP, MOBILE, TV, TABLET, BLURAY, STB, GAME_CONSOLE, UNKNOWN
            });
        }

        private Platform(String s, int i, String s1)
        {
            super(s, i);
            param = s1;
        }
    }


    private class SoftwareInterface extends Enum
    {

        private static final SoftwareInterface $VALUES[];
        public static final SoftwareInterface ANDROID;
        public static final SoftwareInterface OTHERAPP;
        public static final SoftwareInterface TVANDROID;
        public static final SoftwareInterface UNKNOWN;
        public final String param;

        public static SoftwareInterface valueOf(String s)
        {
            return (SoftwareInterface)Enum.valueOf(com/google/android/apps/youtube/core/client/DeviceClassification$SoftwareInterface, s);
        }

        public static SoftwareInterface[] values()
        {
            return (SoftwareInterface[])$VALUES.clone();
        }

        static 
        {
            ANDROID = new SoftwareInterface("ANDROID", 0, "android");
            TVANDROID = new SoftwareInterface("TVANDROID", 1, "tvandroid");
            OTHERAPP = new SoftwareInterface("OTHERAPP", 2, "otherapp");
            UNKNOWN = new SoftwareInterface("UNKNOWN", 3, "unknown_interface");
            $VALUES = (new SoftwareInterface[] {
                ANDROID, TVANDROID, OTHERAPP, UNKNOWN
            });
        }

        private SoftwareInterface(String s, int i, String s1)
        {
            super(s, i);
            param = s1;
        }
    }

}
