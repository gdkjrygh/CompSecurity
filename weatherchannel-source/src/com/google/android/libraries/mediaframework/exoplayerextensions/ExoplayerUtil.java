// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            Video, HlsRendererBuilder, DashRendererBuilder, WidevineTestMediaDrmCallback, 
//            ExtractorRendererBuilder

public class ExoplayerUtil
{

    public ExoplayerUtil()
    {
    }

    public static ExoplayerWrapper.RendererBuilder createRendererBuilder(Context context, Video video)
    {
        String s = Util.getUserAgent(context, "TWC");
        static class _cls1
        {

            static final int $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[];

            static 
            {
                $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType = new int[Video.VideoType.values().length];
                try
                {
                    $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[Video.VideoType.HLS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[Video.VideoType.DASH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$libraries$mediaframework$exoplayerextensions$Video$VideoType[Video.VideoType.OTHER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.android.libraries.mediaframework.exoplayerextensions.Video.VideoType[video.getVideoType().ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unsupported type: ").append(video.getVideoType()).toString());

        case 1: // '\001'
            return new HlsRendererBuilder(context, s, video.getUrl());

        case 2: // '\002'
            return new DashRendererBuilder(context, s, video.getUrl(), new WidevineTestMediaDrmCallback(video.getContentId()));

        case 3: // '\003'
            return new ExtractorRendererBuilder(context, s, Uri.parse(video.getUrl()));
        }
    }

    public static String getExoplayerStateString(int i)
    {
        switch (i)
        {
        default:
            return (new StringBuilder()).append("Unknown: ").append(i).toString();

        case 1: // '\001'
            return "STATE_IDLE";

        case 2: // '\002'
            return "STATE_PREPARING";

        case 3: // '\003'
            return "STATE_BUFFERING";

        case 4: // '\004'
            return "STATE_READY";

        case 5: // '\005'
            return "STATE_ENDED";
        }
    }
}
