// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Looper;

// Referenced classes of package com.google.android.exoplayer:
//            MediaFormat, TrackRenderer

public interface ExoPlayer
{

    public static final int STATE_BUFFERING = 3;
    public static final int STATE_ENDED = 5;
    public static final int STATE_IDLE = 1;
    public static final int STATE_PREPARING = 2;
    public static final int STATE_READY = 4;
    public static final int TRACK_DEFAULT = 0;
    public static final int TRACK_DISABLED = -1;
    public static final long UNKNOWN_TIME = -1L;

    public abstract void addListener(Listener listener);

    public abstract void blockingSendMessage(ExoPlayerComponent exoplayercomponent, int i, Object obj);

    public abstract int getBufferedPercentage();

    public abstract long getBufferedPosition();

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    public abstract boolean getPlayWhenReady();

    public abstract Looper getPlaybackLooper();

    public abstract int getPlaybackState();

    public abstract boolean getRendererEnabled(int i);

    public abstract boolean getRendererHasMedia(int i);

    public abstract int getSelectedTrack(int i);

    public abstract int getTrackCount(int i);

    public abstract MediaFormat getTrackFormat(int i, int j);

    public abstract boolean isPlayWhenReadyCommitted();

    public transient abstract void prepare(TrackRenderer atrackrenderer[]);

    public abstract void release();

    public abstract void removeListener(Listener listener);

    public abstract void seekTo(long l);

    public abstract void sendMessage(ExoPlayerComponent exoplayercomponent, int i, Object obj);

    public abstract void setPlayWhenReady(boolean flag);

    public abstract void setRendererEnabled(int i, boolean flag);

    public abstract void setSelectedTrack(int i, int j);

    public abstract void stop();

    // Unreferenced inner class com/google/android/exoplayer/ExoPlayer$ExoPlayerComponent
    /* block-local class not found */
    class ExoPlayerComponent {}


    // Unreferenced inner class com/google/android/exoplayer/ExoPlayer$Factory
    /* block-local class not found */
    class Factory {}


    // Unreferenced inner class com/google/android/exoplayer/ExoPlayer$Listener
    /* block-local class not found */
    class Listener {}

}
