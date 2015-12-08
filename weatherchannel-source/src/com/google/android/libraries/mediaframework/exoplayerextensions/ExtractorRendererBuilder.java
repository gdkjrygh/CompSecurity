// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer.MediaCodecAudioTrackRenderer;
import com.google.android.exoplayer.MediaCodecVideoTrackRenderer;
import com.google.android.exoplayer.TrackRenderer;
import com.google.android.exoplayer.audio.AudioCapabilities;
import com.google.android.exoplayer.extractor.Extractor;
import com.google.android.exoplayer.extractor.ExtractorSampleSource;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextTrackRenderer;
import com.google.android.exoplayer.upstream.DefaultAllocator;
import com.google.android.exoplayer.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer.upstream.DefaultUriDataSource;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ExoplayerWrapper

public class ExtractorRendererBuilder
    implements ExoplayerWrapper.RendererBuilder
{

    private static final int BUFFER_SEGMENT_COUNT = 256;
    private static final int BUFFER_SEGMENT_SIZE = 0x10000;
    private final Context context;
    private final Uri uri;
    private final String userAgent;

    public ExtractorRendererBuilder(Context context1, String s, Uri uri1)
    {
        context = context1;
        userAgent = s;
        uri = uri1;
    }

    public void buildRenderers(ExoplayerWrapper exoplayerwrapper)
    {
        Object obj = new DefaultAllocator(0x10000);
        DefaultBandwidthMeter defaultbandwidthmeter = new DefaultBandwidthMeter(exoplayerwrapper.getMainHandler(), null);
        Object obj1 = new DefaultUriDataSource(context, defaultbandwidthmeter, userAgent);
        Object obj2 = new ExtractorSampleSource(uri, ((com.google.android.exoplayer.upstream.DataSource) (obj1)), ((com.google.android.exoplayer.upstream.Allocator) (obj)), 0x1000000, new Extractor[0]);
        obj = new MediaCodecVideoTrackRenderer(context, ((com.google.android.exoplayer.SampleSource) (obj2)), 1, 5000L, exoplayerwrapper.getMainHandler(), exoplayerwrapper, 50);
        obj1 = new MediaCodecAudioTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj2)), null, true, exoplayerwrapper.getMainHandler(), exoplayerwrapper, AudioCapabilities.getCapabilities(context));
        obj2 = new TextTrackRenderer(((com.google.android.exoplayer.SampleSource) (obj2)), exoplayerwrapper, exoplayerwrapper.getMainHandler().getLooper(), new SubtitleParser[0]);
        TrackRenderer atrackrenderer[] = new TrackRenderer[4];
        atrackrenderer[0] = ((TrackRenderer) (obj));
        atrackrenderer[1] = ((TrackRenderer) (obj1));
        atrackrenderer[2] = ((TrackRenderer) (obj2));
        exoplayerwrapper.onRenderers(atrackrenderer, defaultbandwidthmeter);
    }

    public void cancel()
    {
    }
}
