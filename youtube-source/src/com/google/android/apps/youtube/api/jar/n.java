// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;


final class n
{

    static final int a[];

    static 
    {
        a = new int[ApiTvControlsView.PlaybackState.values().length];
        try
        {
            a[ApiTvControlsView.PlaybackState.PLAYING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ApiTvControlsView.PlaybackState.PAUSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
