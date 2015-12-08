// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.config;

import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;

public final class InnerTubeApiSelection extends Enum
{

    private static final InnerTubeApiSelection $VALUES[];
    public static final int DEFAULT_ORDINAL = 0;
    public static final String PREFERENCES_KEY = "InnerTubeApiSelection";
    public static final InnerTubeApiSelection PRERELEASE;
    public static final InnerTubeApiSelection V1;
    public static final InnerTubeApiSelection V1RELEASE_ONLY_WORKS_IN_STAGING;
    private final String encodedPathName;

    private InnerTubeApiSelection(String s, int i, String s1)
    {
        super(s, i);
        encodedPathName = s1;
    }

    public static int getDefaultIndex()
    {
        return 0;
    }

    static InnerTubeApiSelection getInnerTubeApiSelection(SharedPreferences sharedpreferences)
    {
        c.a(sharedpreferences);
        sharedpreferences = sharedpreferences.getString("InnerTubeApiSelection", values()[0].toString());
        InnerTubeApiSelection innertubeapiselection;
        try
        {
            innertubeapiselection = valueOf(sharedpreferences);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            L.b((new StringBuilder("Bogus value in shared preferences for key InnerTubeApiSelection value ")).append(sharedpreferences).append(" returning default value.").toString());
            return values()[0];
        }
        return innertubeapiselection;
    }

    public static InnerTubeApiSelection valueOf(String s)
    {
        return (InnerTubeApiSelection)Enum.valueOf(com/google/android/apps/youtube/datalib/config/InnerTubeApiSelection, s);
    }

    public static InnerTubeApiSelection[] values()
    {
        return (InnerTubeApiSelection[])$VALUES.clone();
    }

    final String getEncodedPath()
    {
        return encodedPathName;
    }

    static 
    {
        V1 = new InnerTubeApiSelection("V1", 0, "youtubei/v1");
        V1RELEASE_ONLY_WORKS_IN_STAGING = new InnerTubeApiSelection("V1RELEASE_ONLY_WORKS_IN_STAGING", 1, "youtubei/v1release");
        PRERELEASE = new InnerTubeApiSelection("PRERELEASE", 2, "youtubei/vi");
        $VALUES = (new InnerTubeApiSelection[] {
            V1, V1RELEASE_ONLY_WORKS_IN_STAGING, PRERELEASE
        });
    }
}
