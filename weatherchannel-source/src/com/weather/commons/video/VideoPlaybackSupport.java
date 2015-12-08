// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.app.Activity;
import android.widget.MediaController;

public interface VideoPlaybackSupport
{

    public abstract MediaController createMediaController();

    public abstract Activity getActivity();

    public abstract boolean isFullScreen();

    public abstract void onPlaybackStarted();

    public abstract void shareCurrentVideo();

    public abstract boolean shouldContinuePlaying();

    public abstract void toggleFullScreenMode();
}
