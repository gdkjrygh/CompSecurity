// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;


final class bv
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.values().length];
        try
        {
            b[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.REQUEST_FAILED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNKNOWN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.VIDEO_ERROR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.WATCH_NEXT_ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.values().length];
        try
        {
            a[com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.NEW.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.VIDEO_LOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.VIDEO_PLAYBACK_LOADED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerStage.VIDEO_WATCH_LOADED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
