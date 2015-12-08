// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.ytremote.backend.model.Method;

final class bn
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[com.google.android.apps.ytremote.intent.Intents.IntentAction.values().length];
        try
        {
            c[com.google.android.apps.ytremote.intent.Intents.IntentAction.CLOUD_SERVICE_IPV6_ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            c[com.google.android.apps.ytremote.intent.Intents.IntentAction.CLOUD_SERVICE_NO_NETWORK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            c[com.google.android.apps.ytremote.intent.Intents.IntentAction.LOUNGE_SERVER_CONNECTION_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        b = new int[Method.values().length];
        try
        {
            b[Method.LOUNGE_STATUS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            b[Method.SCREEN_CONNECTED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            b[Method.SCREEN_DISCONNECTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            b[Method.REMOTE_CONNECTED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            b[Method.REMOTE_DISCONNECTED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            b[Method.NOW_PLAYING_PLAYLIST.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            b[Method.NOW_PLAYING.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            b[Method.ON_STATE_CHANGED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            b[Method.PLAYLIST_MODIFIED.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            b[Method.ON_SUBTITLES_TRACK_CHANGED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            b[Method.ON_ERROR.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            b[Method.ON_VOLUME_CHANGED.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        a = new int[RemoteControl.RemotePlayerState.values().length];
        try
        {
            a[RemoteControl.RemotePlayerState.PLAYING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            a[RemoteControl.RemotePlayerState.PAUSED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[RemoteControl.RemotePlayerState.ADVERTISEMENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[RemoteControl.RemotePlayerState.BUFFERING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[RemoteControl.RemotePlayerState.ENDED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[RemoteControl.RemotePlayerState.UNCONFIRMED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[RemoteControl.RemotePlayerState.UNSTARTED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
