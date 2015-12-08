// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;


final class ag
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[RemoteControl.State.values().length];
        try
        {
            b[RemoteControl.State.CONNECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        a = new int[RemoteControl.RemotePlayerState.values().length];
        try
        {
            a[RemoteControl.RemotePlayerState.BUFFERING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[RemoteControl.RemotePlayerState.ENDED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            a[RemoteControl.RemotePlayerState.ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            a[RemoteControl.RemotePlayerState.PAUSED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[RemoteControl.RemotePlayerState.PLAYING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[RemoteControl.RemotePlayerState.UNSTARTED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[RemoteControl.RemotePlayerState.UNCONFIRMED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[RemoteControl.RemotePlayerState.UNKNOWN.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[RemoteControl.RemotePlayerState.VIDEO_CUED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[RemoteControl.RemotePlayerState.ADVERTISEMENT.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
