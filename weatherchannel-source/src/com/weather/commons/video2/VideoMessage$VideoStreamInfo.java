// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.weather.commons.video2.dsx.VideoStreamType;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.video2:
//            VideoMessage

public static class variantName
{

    private static final String TAG = "VideoStreamInfo";
    public final VideoStreamType type;
    public final String url;
    public final String variantName;

    public String toString()
    {
        return (new StringBuilder()).append("VideoStreamInfo{url='").append(url).append('\'').append(", type=").append(type).append(", variantName='").append(variantName).append('\'').append('}').toString();
    }

    public (String s, VideoStreamType videostreamtype, String s1)
    {
        url = (String)Preconditions.checkNotNull(s);
        type = (VideoStreamType)Preconditions.checkNotNull(videostreamtype);
        variantName = (String)Preconditions.checkNotNull(s1);
        LogUtil.d("VideoStreamInfo", LoggingMetaTags.TWC_VIDEOS, "%s", new Object[] {
            this
        });
    }
}
