// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class er
{

    static final int a[];

    static 
    {
        a = new int[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.values().length];
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PLAYING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.PAUSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNSTARTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ENDED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.ADVERTISEMENT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.BUFFERING.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.app.remote.RemoteControl.RemotePlayerState.UNCONFIRMED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
