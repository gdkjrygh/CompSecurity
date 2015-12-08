// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.TrackRenderer;

public class ExoplayerVolumeAdjuster
{

    private TrackRenderer audioRenderer;
    private ExoPlayer player;

    ExoplayerVolumeAdjuster(TrackRenderer trackrenderer, ExoPlayer exoplayer)
    {
        audioRenderer = trackrenderer;
        player = exoplayer;
    }

    public float getVolume(Context context)
    {
        context = (AudioManager)context.getSystemService("audio");
        int i = context.getStreamVolume(3);
        int j = context.getStreamMaxVolume(3);
        return (float)i / (float)j;
    }

    public void setVolume(float f)
    {
        if (audioRenderer != null)
        {
            player.sendMessage(audioRenderer, 1, Float.valueOf(f));
        }
    }
}
