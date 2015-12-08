// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;


final class b
{

    static final int a[];

    static 
    {
        a = new int[PlaybackControllerGroup.PlaybackInfo.PlaybackState.values().length];
        try
        {
            a[PlaybackControllerGroup.PlaybackInfo.PlaybackState.BUFFERING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[PlaybackControllerGroup.PlaybackInfo.PlaybackState.PAUSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[PlaybackControllerGroup.PlaybackInfo.PlaybackState.PLAYING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[PlaybackControllerGroup.PlaybackInfo.PlaybackState.STOPPED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PlaybackControllerGroup.PlaybackInfo.PlaybackState.ENDED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PlaybackControllerGroup.PlaybackInfo.PlaybackState.ERROR.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
