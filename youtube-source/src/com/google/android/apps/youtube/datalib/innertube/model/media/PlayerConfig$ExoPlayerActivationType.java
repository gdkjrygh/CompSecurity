// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;


public final class  extends Enum
{

    private static final SERVER_EXPERIMENT $VALUES[];
    public static final SERVER_EXPERIMENT ADAPTIVE;
    public static final SERVER_EXPERIMENT NON_ADAPTIVE;
    public static final SERVER_EXPERIMENT OFF;
    public static final String PREFERENCES_KEY = "ExoPlayer";
    public static final SERVER_EXPERIMENT SERVER_EXPERIMENT;

    public static  getDefaultValue(boolean flag)
    {
        if (flag)
        {
            return NON_ADAPTIVE;
        } else
        {
            return SERVER_EXPERIMENT;
        }
    }

    public static SERVER_EXPERIMENT valueOf(String s)
    {
        return (SERVER_EXPERIMENT)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/model/media/PlayerConfig$ExoPlayerActivationType, s);
    }

    public static SERVER_EXPERIMENT[] values()
    {
        return (SERVER_EXPERIMENT[])$VALUES.clone();
    }

    static 
    {
        OFF = new <init>("OFF", 0);
        NON_ADAPTIVE = new <init>("NON_ADAPTIVE", 1);
        ADAPTIVE = new <init>("ADAPTIVE", 2);
        SERVER_EXPERIMENT = new <init>("SERVER_EXPERIMENT", 3);
        $VALUES = (new .VALUES[] {
            OFF, NON_ADAPTIVE, ADAPTIVE, SERVER_EXPERIMENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
