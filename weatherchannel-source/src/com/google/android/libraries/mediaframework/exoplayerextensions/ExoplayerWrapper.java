// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.google.android.exoplayer.CodecCounters;
import com.google.android.exoplayer.DummyTrackRenderer;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.ExoPlayer;
import com.google.android.exoplayer.MediaCodecTrackRenderer;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.TimeRange;
import com.google.android.exoplayer.TrackRenderer;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.text.TextRenderer;
import com.google.android.exoplayer.upstream.BandwidthMeter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ObservablePlayerControl, ExoplayerVolumeAdjuster

public class ExoplayerWrapper
    implements com.google.android.exoplayer.ExoPlayer.Listener, com.google.android.exoplayer.chunk.ChunkSampleSource.EventListener, com.google.android.exoplayer.hls.HlsSampleSource.EventListener, com.google.android.exoplayer.upstream.BandwidthMeter.EventListener, com.google.android.exoplayer.MediaCodecVideoTrackRenderer.EventListener, com.google.android.exoplayer.MediaCodecAudioTrackRenderer.EventListener, com.google.android.exoplayer.drm.StreamingDrmSessionManager.EventListener, com.google.android.exoplayer.dash.DashChunkSource.EventListener, TextRenderer, com.google.android.exoplayer.metadata.MetadataTrackRenderer.MetadataRenderer, com.google.android.exoplayer.util.DebugTextViewHelper.Provider
{
    public static interface CaptionListener
    {

        public abstract void onCues(List list);
    }

    public static interface Id3MetadataListener
    {

        public abstract void onId3Metadata(Map map);
    }

    public static interface InfoListener
    {

        public abstract void onAudioFormatEnabled(Format format, int i, long l);

        public abstract void onAvailableRangeChanged(TimeRange timerange);

        public abstract void onBandwidthSample(int i, long l, long l1);

        public abstract void onDecoderInitialized(String s, long l, long l1);

        public abstract void onDroppedFrames(int i, long l);

        public abstract void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4);

        public abstract void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2);

        public abstract void onVideoFormatEnabled(Format format, int i, long l);
    }

    public static interface InternalErrorListener
    {

        public abstract void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception);

        public abstract void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception);

        public abstract void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception);

        public abstract void onDecoderInitializationError(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception);

        public abstract void onDrmSessionManagerError(Exception exception);

        public abstract void onLoadError(int i, IOException ioexception);

        public abstract void onRendererInitializationError(Exception exception);
    }

    public static interface Listener
    {

        public abstract void onError(Exception exception);

        public abstract void onStateChanged(boolean flag, int i);

        public abstract void onVideoSizeChanged(int i, int j, int k, float f);
    }

    public static interface RendererBuilder
    {

        public abstract void buildRenderers(ExoplayerWrapper exoplayerwrapper);

        public abstract void cancel();
    }


    private static final int RENDERER_BUILDING_STATE_BUILDING = 2;
    private static final int RENDERER_BUILDING_STATE_BUILT = 3;
    private static final int RENDERER_BUILDING_STATE_IDLE = 1;
    public static final int RENDERER_COUNT = 4;
    public static final int STATE_BUFFERING = 3;
    public static final int STATE_ENDED = 5;
    public static final int STATE_IDLE = 1;
    public static final int STATE_PREPARING = 2;
    public static final int STATE_READY = 4;
    public static final int TRACK_DEFAULT = 0;
    public static final int TRACK_DISABLED = -1;
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_METADATA = 3;
    public static final int TYPE_TEXT = 2;
    public static final int TYPE_VIDEO = 0;
    private boolean backgrounded;
    private BandwidthMeter bandwidthMeter;
    private CaptionListener captionListener;
    private CodecCounters codecCounters;
    private Id3MetadataListener id3MetadataListener;
    private InfoListener infoListener;
    private InternalErrorListener internalErrorListener;
    private boolean lastReportedPlayWhenReady;
    private int lastReportedPlaybackState;
    private final CopyOnWriteArrayList listeners = new CopyOnWriteArrayList();
    private final Handler mainHandler = new Handler();
    private final ExoPlayer player = com.google.android.exoplayer.ExoPlayer.Factory.newInstance(4, 1000, 5000);
    private final ObservablePlayerControl playerControl;
    private final RendererBuilder rendererBuilder;
    private int rendererBuildingState;
    private Surface surface;
    private Format videoFormat;
    private TrackRenderer videoRenderer;
    private int videoTrackToRestore;
    private ExoplayerVolumeAdjuster volumeAdjuster;

    public ExoplayerWrapper(RendererBuilder rendererbuilder)
    {
        rendererBuilder = rendererbuilder;
        player.addListener(this);
        playerControl = new ObservablePlayerControl(player);
        lastReportedPlaybackState = 1;
        rendererBuildingState = 1;
        player.setSelectedTrack(2, -1);
    }

    private void maybeReportPlayerState()
    {
        boolean flag = player.getPlayWhenReady();
        int i = getPlaybackState();
        if (lastReportedPlayWhenReady != flag || lastReportedPlaybackState != i)
        {
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onStateChanged(flag, i)) { }
            lastReportedPlayWhenReady = flag;
            lastReportedPlaybackState = i;
        }
    }

    private void pushSurface(boolean flag)
    {
        if (videoRenderer == null)
        {
            return;
        }
        if (flag)
        {
            player.blockingSendMessage(videoRenderer, 1, surface);
            return;
        } else
        {
            player.sendMessage(videoRenderer, 1, surface);
            return;
        }
    }

    public void addListener(Listener listener)
    {
        listeners.add(listener);
    }

    public void blockingClearSurface()
    {
        surface = null;
        pushSurface(true);
    }

    public boolean getBackgrounded()
    {
        return backgrounded;
    }

    public BandwidthMeter getBandwidthMeter()
    {
        return bandwidthMeter;
    }

    public int getBufferedPercentage()
    {
        return player.getBufferedPercentage();
    }

    public CodecCounters getCodecCounters()
    {
        return codecCounters;
    }

    public long getCurrentPosition()
    {
        return player.getCurrentPosition();
    }

    public long getDuration()
    {
        return player.getDuration();
    }

    public Format getFormat()
    {
        return videoFormat;
    }

    Handler getMainHandler()
    {
        return mainHandler;
    }

    public boolean getPlayWhenReady()
    {
        return player.getPlayWhenReady();
    }

    Looper getPlaybackLooper()
    {
        return player.getPlaybackLooper();
    }

    public int getPlaybackState()
    {
        int i;
        if (rendererBuildingState == 2)
        {
            i = 2;
        } else
        {
            int j = player.getPlaybackState();
            i = j;
            if (rendererBuildingState == 3)
            {
                i = j;
                if (j == 1)
                {
                    return 2;
                }
            }
        }
        return i;
    }

    public ObservablePlayerControl getPlayerControl()
    {
        return playerControl;
    }

    public int getSelectedTrack(int i)
    {
        return player.getSelectedTrack(i);
    }

    public Surface getSurface()
    {
        return surface;
    }

    public int getTrackCount(int i)
    {
        return player.getTrackCount(i);
    }

    public MediaFormat getTrackFormat(int i, int j)
    {
        return player.getTrackFormat(i, j);
    }

    public ExoplayerVolumeAdjuster getVolumeAdjuster()
    {
        return volumeAdjuster;
    }

    public void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onAudioTrackInitializationError(initializationexception);
        }
    }

    public void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onAudioTrackWriteError(writeexception);
        }
    }

    public void onAvailableRangeChanged(TimeRange timerange)
    {
        if (infoListener != null)
        {
            infoListener.onAvailableRangeChanged(timerange);
        }
    }

    public void onBandwidthSample(int i, long l, long l1)
    {
        if (infoListener != null)
        {
            infoListener.onBandwidthSample(i, l, l1);
        }
    }

    public void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onCryptoError(cryptoexception);
        }
    }

    public void onCues(List list)
    {
        if (captionListener != null && getSelectedTrack(2) != -1)
        {
            captionListener.onCues(list);
        }
    }

    public void onDecoderInitializationError(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onDecoderInitializationError(decoderinitializationexception);
        }
    }

    public void onDecoderInitialized(String s, long l, long l1)
    {
        if (infoListener != null)
        {
            infoListener.onDecoderInitialized(s, l, l1);
        }
    }

    public void onDownstreamFormatChanged(int i, Format format, int j, long l)
    {
        if (infoListener != null)
        {
            if (i == 0)
            {
                videoFormat = format;
                infoListener.onVideoFormatEnabled(format, j, l);
                return;
            }
            if (i == 1)
            {
                infoListener.onAudioFormatEnabled(format, j, l);
                return;
            }
        }
    }

    public void onDrawnToSurface(Surface surface1)
    {
    }

    public void onDrmKeysLoaded()
    {
    }

    public void onDrmSessionManagerError(Exception exception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onDrmSessionManagerError(exception);
        }
    }

    public void onDroppedFrames(int i, long l)
    {
        if (infoListener != null)
        {
            infoListener.onDroppedFrames(i, l);
        }
    }

    public void onLoadCanceled(int i, long l)
    {
    }

    public void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4)
    {
        if (infoListener != null)
        {
            infoListener.onLoadCompleted(i, l, j, k, format, l1, l2, l3, l4);
        }
    }

    public void onLoadError(int i, IOException ioexception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onLoadError(i, ioexception);
        }
    }

    public void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2)
    {
        if (infoListener != null)
        {
            infoListener.onLoadStarted(i, l, j, k, format, l1, l2);
        }
    }

    public volatile void onMetadata(Object obj)
    {
        onMetadata((Map)obj);
    }

    public void onMetadata(Map map)
    {
        if (id3MetadataListener != null && getSelectedTrack(3) != -1)
        {
            id3MetadataListener.onId3Metadata(map);
        }
    }

    public void onPlayWhenReadyCommitted()
    {
    }

    public void onPlayerError(ExoPlaybackException exoplaybackexception)
    {
        rendererBuildingState = 1;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onError(exoplaybackexception)) { }
    }

    public void onPlayerStateChanged(boolean flag, int i)
    {
        maybeReportPlayerState();
    }

    void onRenderers(TrackRenderer atrackrenderer[], BandwidthMeter bandwidthmeter)
    {
        for (int i = 0; i < 4; i++)
        {
            if (atrackrenderer[i] == null)
            {
                atrackrenderer[i] = new DummyTrackRenderer();
            }
        }

        videoRenderer = atrackrenderer[0];
        CodecCounters codeccounters;
        if (videoRenderer instanceof MediaCodecTrackRenderer)
        {
            codeccounters = ((MediaCodecTrackRenderer)videoRenderer).codecCounters;
        } else
        if (atrackrenderer[1] instanceof MediaCodecTrackRenderer)
        {
            codeccounters = ((MediaCodecTrackRenderer)atrackrenderer[1]).codecCounters;
        } else
        {
            codeccounters = null;
        }
        codecCounters = codeccounters;
        bandwidthMeter = bandwidthmeter;
        volumeAdjuster = new ExoplayerVolumeAdjuster(atrackrenderer[1], player);
        pushSurface(false);
        player.prepare(atrackrenderer);
        rendererBuildingState = 3;
    }

    void onRenderersError(Exception exception)
    {
        if (internalErrorListener != null)
        {
            internalErrorListener.onRendererInitializationError(exception);
        }
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onError(exception)) { }
        rendererBuildingState = 1;
        maybeReportPlayerState();
    }

    public void onUpstreamDiscarded(int i, long l, long l1)
    {
    }

    public void onVideoSizeChanged(int i, int j, int k, float f)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((Listener)iterator.next()).onVideoSizeChanged(i, j, k, f)) { }
    }

    public void prepare()
    {
        if (rendererBuildingState == 3)
        {
            player.stop();
        }
        rendererBuilder.cancel();
        videoFormat = null;
        videoRenderer = null;
        rendererBuildingState = 2;
        maybeReportPlayerState();
        rendererBuilder.buildRenderers(this);
    }

    public void release()
    {
        rendererBuilder.cancel();
        rendererBuildingState = 1;
        surface = null;
        player.release();
    }

    public void removeListener(Listener listener)
    {
        listeners.remove(listener);
    }

    public void seekTo(long l)
    {
        player.seekTo(l);
    }

    public void setBackgrounded(boolean flag)
    {
        if (backgrounded == flag)
        {
            return;
        }
        backgrounded = flag;
        if (flag)
        {
            videoTrackToRestore = getSelectedTrack(0);
            setSelectedTrack(0, -1);
            blockingClearSurface();
            return;
        } else
        {
            setSelectedTrack(0, videoTrackToRestore);
            return;
        }
    }

    public void setCaptionListener(CaptionListener captionlistener)
    {
        captionListener = captionlistener;
    }

    public void setInfoListener(InfoListener infolistener)
    {
        infoListener = infolistener;
    }

    public void setInternalErrorListener(InternalErrorListener internalerrorlistener)
    {
        internalErrorListener = internalerrorlistener;
    }

    public void setMetadataListener(Id3MetadataListener id3metadatalistener)
    {
        id3MetadataListener = id3metadatalistener;
    }

    public void setPlayWhenReady(boolean flag)
    {
        player.setPlayWhenReady(flag);
    }

    public void setSelectedTrack(int i, int j)
    {
        player.setSelectedTrack(i, j);
        if (i == 2 && j < 0 && captionListener != null)
        {
            captionListener.onCues(Collections.emptyList());
        }
    }

    public void setSurface(Surface surface1)
    {
        surface = surface1;
        pushSurface(false);
    }
}
