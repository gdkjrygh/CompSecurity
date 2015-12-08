// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer.DefaultLoadControl;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.TrackRenderer;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.chunk.VideoFormatSelectorUtil;
import com.google.android.exoplayer.hls.HlsChunkSource;
import com.google.android.exoplayer.hls.HlsMasterPlaylist;
import com.google.android.exoplayer.hls.HlsPlaylist;
import com.google.android.exoplayer.hls.HlsPlaylistParser;
import com.google.android.exoplayer.hls.HlsSampleSource;
import com.google.android.exoplayer.metadata.Id3Parser;
import com.google.android.exoplayer.metadata.MetadataTrackRenderer;
import com.google.android.exoplayer.text.eia608.Eia608TrackRenderer;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import com.google.android.exoplayer.util.ManifestFetcher;
import java.io.IOException;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ExoplayerWrapper

public class HlsRendererBuilder
    implements ExoplayerWrapper.RendererBuilder
{
    private static final class AsyncRendererBuilder
        implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback
    {

        private boolean canceled;
        private final Context context;
        private final ExoplayerWrapper player;
        private final ManifestFetcher playlistFetcher;
        private final String url;
        private final String userAgent;

        public void cancel()
        {
            canceled = true;
        }

        public void init()
        {
            playlistFetcher.singleLoad(player.getMainHandler().getLooper(), this);
        }

        public void onSingleManifest(HlsPlaylist hlsplaylist)
        {
            if (canceled)
            {
                return;
            }
            Object obj = player.getMainHandler();
            Object obj1 = new DefaultLoadControl(new DefaultAllocator(0x10000));
            DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter();
            int ai1[] = null;
            if (hlsplaylist instanceof HlsMasterPlaylist)
            {
                HlsMasterPlaylist hlsmasterplaylist = (HlsMasterPlaylist)hlsplaylist;
                int ai[];
                try
                {
                    ai = VideoFormatSelectorUtil.selectVideoFormatsForDefaultDisplay(context, hlsmasterplaylist.variants, null, false);
                }
                // Misplaced declaration of an exception variable
                catch (HlsPlaylist hlsplaylist)
                {
                    player.onRenderersError(hlsplaylist);
                    return;
                }
                ai1 = ai;
                if (ai.length == 0)
                {
                    player.onRenderersError(new IllegalStateException("No variants selected."));
                    return;
                }
            }
            obj1 = new HlsSampleSource(new HlsChunkSource(new DefaultUriDataSource(context, defaultbandwidthmeter, userAgent), url, hlsplaylist, defaultbandwidthmeter, ai1, 1), ((com.google.android.exoplayer.LoadControl) (obj1)), 0x1000000, ((Handler) (obj)), player, 0);
            hlsplaylist = new MediaCodecVideoTrackRenderer(context, ((com.google.android.exoplayer.SampleSource) (obj1)), 1, 5000L, ((Handler) (obj)), player, 50);
            MediaCodecAudioTrackRenderer mediacodecaudiotrackrenderer = new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj1)), null, true, player.getMainHandler(), player, AudioCapabilities.getCapabilities(context));
            MetadataTrackRenderer metadatatrackrenderer = new MetadataTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj1)), new Id3Parser(), player, ((Handler) (obj)).getLooper());
            obj = new Eia608TrackRenderer(((com.google.android.exoplayer.SampleSource) (obj1)), player, ((Handler) (obj)).getLooper());
            player.onRenderers(new TrackRenderer[] {
                hlsplaylist, mediacodecaudiotrackrenderer, obj, metadatatrackrenderer
            }, defaultbandwidthmeter);
        }

        public volatile void onSingleManifest(Object obj)
        {
            onSingleManifest((HlsPlaylist)obj);
        }

        public void onSingleManifestError(IOException ioexception)
        {
            if (canceled)
            {
                return;
            } else
            {
                player.onRenderersError(ioexception);
                return;
            }
        }

        public AsyncRendererBuilder(Context context1, String s, String s1, ExoplayerWrapper exoplayerwrapper)
        {
            context = context1;
            userAgent = s;
            url = s1;
            player = exoplayerwrapper;
            exoplayerwrapper = new HlsPlaylistParser();
            playlistFetcher = new ManifestFetcher(s1, new DefaultUriDataSource(context1, s), exoplayerwrapper);
        }
    }


    private static final int BUFFER_SEGMENTS = 256;
    private static final int BUFFER_SEGMENT_SIZE = 0x10000;
    private final Context context;
    private AsyncRendererBuilder currentAsyncBuilder;
    private final String url;
    private final String userAgent;

    public HlsRendererBuilder(Context context1, String s, String s1)
    {
        context = context1;
        userAgent = s;
        url = s1;
    }

    public void buildRenderers(ExoplayerWrapper exoplayerwrapper)
    {
        currentAsyncBuilder = new AsyncRendererBuilder(context, userAgent, url, exoplayerwrapper);
        currentAsyncBuilder.init();
    }

    public void cancel()
    {
        if (currentAsyncBuilder != null)
        {
            currentAsyncBuilder.cancel();
            currentAsyncBuilder = null;
        }
    }
}
