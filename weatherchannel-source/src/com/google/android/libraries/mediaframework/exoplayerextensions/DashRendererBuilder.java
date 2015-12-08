// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer.DefaultLoadControl;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.TrackRenderer;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.chunk.ChunkSampleSource;
import com.google.android.exoplayer.dash.DashChunkSource;
import com.google.android.exoplayer.dash.DefaultDashTrackSelector;
import com.google.android.exoplayer.dash.mpd.AdaptationSet;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescription;
import com.google.android.exoplayer.dash.mpd.MediaPresentationDescriptionParser;
import com.google.android.exoplayer.dash.mpd.Period;
import com.google.android.exoplayer.dash.mpd.UtcTimingElement;
import com.google.android.exoplayer.dash.mpd.UtcTimingElementResolver;
import com.google.android.exoplayer.drm.MediaDrmCallback;
import com.google.android.exoplayer.drm.StreamingDrmSessionManager;
import com.google.android.exoplayer.drm.UnsupportedDrmException;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;
import com.google.android.exoplayer.upstream.UriDataSource;
import com.google.android.exoplayer.util.ManifestFetcher;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ExoplayerWrapper

public class DashRendererBuilder
    implements ExoplayerWrapper.RendererBuilder
{
    private static final class AsyncRendererBuilder
        implements com.google.android.exoplayer.util.ManifestFetcher.ManifestCallback, com.google.android.exoplayer.dash.mpd.UtcTimingElementResolver.UtcTimingCallback
    {

        private boolean canceled;
        private final Context context;
        private final MediaDrmCallback drmCallback;
        private long elapsedRealtimeOffset;
        private MediaPresentationDescription manifest;
        private final UriDataSource manifestDataSource;
        private final ManifestFetcher manifestFetcher;
        private final ExoplayerWrapper player;
        private final String userAgent;

        private void buildRenderers()
        {
            Object obj = manifest.getPeriod(0);
            Object obj1 = player.getMainHandler();
            DefaultLoadControl defaultloadcontrol = new DefaultLoadControl(new DefaultAllocator(0x10000));
            DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter(((Handler) (obj1)), player);
            boolean flag = false;
            for (int i = 0; i < ((Period) (obj)).adaptationSets.size();)
            {
                AdaptationSet adaptationset = (AdaptationSet)((Period) (obj)).adaptationSets.get(i);
                boolean flag1 = flag;
                if (adaptationset.type != -1)
                {
                    flag1 = flag | adaptationset.hasContentProtection();
                }
                i++;
                flag = flag1;
            }

            boolean flag2 = false;
            obj = null;
            if (flag)
            {
                if (Util.SDK_INT < 18)
                {
                    player.onRenderersError(new UnsupportedDrmException(1));
                    return;
                }
                TrackRenderer atrackrenderer[];
                Object obj2;
                DefaultUriDataSource defaulturidatasource;
                int j;
                try
                {
                    obj = StreamingDrmSessionManager.newWidevineInstance(player.getPlaybackLooper(), drmCallback, null, player.getMainHandler(), player);
                    j = getWidevineSecurityLevel(((StreamingDrmSessionManager) (obj)));
                }
                catch (UnsupportedDrmException unsupporteddrmexception)
                {
                    player.onRenderersError(unsupporteddrmexception);
                    return;
                }
                if (j != 1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
            }
            obj2 = new DefaultUriDataSource(context, defaultbandwidthmeter, userAgent);
            obj2 = new ChunkSampleSource(new DashChunkSource(manifestFetcher, DefaultDashTrackSelector.newVideoInstance(context, true, flag2), ((com.google.android.exoplayer.upstream.DataSource) (obj2)), new com.google.android.exoplayer.chunk.FormatEvaluator.AdaptiveEvaluator(defaultbandwidthmeter), 30000L, elapsedRealtimeOffset, ((Handler) (obj1)), player), defaultloadcontrol, 0xc80000, ((Handler) (obj1)), player, 0);
            obj2 = new MediaCodecVideoTrackRenderer(context, ((com.google.android.exoplayer.SampleSource) (obj2)), 1, 5000L, ((com.google.android.exoplayer.drm.DrmSessionManager) (obj)), true, ((Handler) (obj1)), player, 50);
            defaulturidatasource = new DefaultUriDataSource(context, defaultbandwidthmeter, userAgent);
            obj = new MediaCodecAudioTrackRenderer(new ChunkSampleSource(new DashChunkSource(manifestFetcher, DefaultDashTrackSelector.newAudioInstance(), defaulturidatasource, null, 30000L, elapsedRealtimeOffset, ((Handler) (obj1)), player), defaultloadcontrol, 0x360000, ((Handler) (obj1)), player, 1), ((com.google.android.exoplayer.drm.DrmSessionManager) (obj)), true, ((Handler) (obj1)), player, AudioCapabilities.getCapabilities(context));
            defaulturidatasource = new DefaultUriDataSource(context, defaultbandwidthmeter, userAgent);
            obj1 = new TextTrackRenderer(new ChunkSampleSource(new DashChunkSource(manifestFetcher, DefaultDashTrackSelector.newTextInstance(), defaulturidatasource, null, 30000L, elapsedRealtimeOffset, ((Handler) (obj1)), player), defaultloadcontrol, 0x20000, ((Handler) (obj1)), player, 2), player, ((Handler) (obj1)).getLooper(), new SubtitleParser[0]);
            atrackrenderer = new TrackRenderer[4];
            atrackrenderer[0] = ((TrackRenderer) (obj2));
            atrackrenderer[1] = ((TrackRenderer) (obj));
            atrackrenderer[2] = ((TrackRenderer) (obj1));
            player.onRenderers(atrackrenderer, defaultbandwidthmeter);
        }

        private static int getWidevineSecurityLevel(StreamingDrmSessionManager streamingdrmsessionmanager)
        {
            streamingdrmsessionmanager = streamingdrmsessionmanager.getPropertyString("securityLevel");
            if (streamingdrmsessionmanager.equals("L1"))
            {
                return 1;
            }
            return !streamingdrmsessionmanager.equals("L3") ? -1 : 3;
        }

        public void cancel()
        {
            canceled = true;
        }

        public void init()
        {
            manifestFetcher.singleLoad(player.getMainHandler().getLooper(), this);
        }

        public void onSingleManifest(MediaPresentationDescription mediapresentationdescription)
        {
            if (canceled)
            {
                return;
            }
            manifest = mediapresentationdescription;
            if (mediapresentationdescription.dynamic && mediapresentationdescription.utcTiming != null)
            {
                UtcTimingElementResolver.resolveTimingElement(manifestDataSource, mediapresentationdescription.utcTiming, manifestFetcher.getManifestLoadCompleteTimestamp(), this);
                return;
            } else
            {
                buildRenderers();
                return;
            }
        }

        public volatile void onSingleManifest(Object obj)
        {
            onSingleManifest((MediaPresentationDescription)obj);
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

        public void onTimestampError(UtcTimingElement utctimingelement, IOException ioexception)
        {
            if (canceled)
            {
                return;
            } else
            {
                Log.e("DashRendererBuilder", (new StringBuilder()).append("Failed to resolve UtcTiming element [").append(utctimingelement).append("]").toString(), ioexception);
                buildRenderers();
                return;
            }
        }

        public void onTimestampResolved(UtcTimingElement utctimingelement, long l)
        {
            if (canceled)
            {
                return;
            } else
            {
                elapsedRealtimeOffset = l;
                buildRenderers();
                return;
            }
        }

        public AsyncRendererBuilder(Context context1, String s, String s1, MediaDrmCallback mediadrmcallback, ExoplayerWrapper exoplayerwrapper)
        {
            context = context1;
            userAgent = s;
            drmCallback = mediadrmcallback;
            player = exoplayerwrapper;
            mediadrmcallback = new MediaPresentationDescriptionParser();
            manifestDataSource = new DefaultUriDataSource(context1, s);
            manifestFetcher = new ManifestFetcher(s1, manifestDataSource, mediadrmcallback);
        }
    }


    private static final int AUDIO_BUFFER_SEGMENTS = 54;
    private static final int BUFFER_SEGMENT_SIZE = 0x10000;
    private static final int LIVE_EDGE_LATENCY_MS = 30000;
    private static final int SECURITY_LEVEL_1 = 1;
    private static final int SECURITY_LEVEL_3 = 3;
    private static final int SECURITY_LEVEL_UNKNOWN = -1;
    private static final String TAG = "DashRendererBuilder";
    private static final int TEXT_BUFFER_SEGMENTS = 2;
    private static final int VIDEO_BUFFER_SEGMENTS = 200;
    private final Context context;
    private AsyncRendererBuilder currentAsyncBuilder;
    private final MediaDrmCallback drmCallback;
    private final String url;
    private final String userAgent;

    public DashRendererBuilder(Context context1, String s, String s1, MediaDrmCallback mediadrmcallback)
    {
        context = context1;
        userAgent = s;
        url = s1;
        drmCallback = mediadrmcallback;
    }

    public void buildRenderers(ExoplayerWrapper exoplayerwrapper)
    {
        currentAsyncBuilder = new AsyncRendererBuilder(context, userAgent, url, drmCallback, exoplayerwrapper);
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
