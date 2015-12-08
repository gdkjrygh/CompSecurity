// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.core.player.event.ScriptedPlaybackEvent;
import com.google.android.apps.youtube.core.player.event.SequencerNavigationRequestEvent;

final class h
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        c = new int[ScriptedPlaybackEvent.values().length];
        try
        {
            c[ScriptedPlaybackEvent.NAVIGATION.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            c[ScriptedPlaybackEvent.PLAYER_CONTROL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        b = new int[Director.VideoStage.values().length];
        try
        {
            b[Director.VideoStage.MEDIA_PLAYING_VIDEO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[Director.VideoStage.MEDIA_PLAYING_AD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        a = new int[SequencerNavigationRequestEvent.values().length];
        try
        {
            a[SequencerNavigationRequestEvent.AUTOPLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[SequencerNavigationRequestEvent.NEXT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[SequencerNavigationRequestEvent.PREVIOUS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SequencerNavigationRequestEvent.START.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SequencerNavigationRequestEvent.JUMP.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SequencerNavigationRequestEvent.RETRY.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
