// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;


final class i
{

    static final int a[];

    static 
    {
        a = new int[PlayerConfig.ExoPlayerActivationType.values().length];
        try
        {
            a[PlayerConfig.ExoPlayerActivationType.OFF.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[PlayerConfig.ExoPlayerActivationType.NON_ADAPTIVE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PlayerConfig.ExoPlayerActivationType.ADAPTIVE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PlayerConfig.ExoPlayerActivationType.SERVER_EXPERIMENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
