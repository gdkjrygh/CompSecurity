// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.video;

import com.google.common.base.Preconditions;
import com.weather.commons.video.VideoMessage;

// Referenced classes of package com.weather.Weather.video:
//            VideoListManager

public static final class videoMessage
{

    public final int position;
    public final VideoMessage videoMessage;

    public (int i, VideoMessage videomessage)
    {
        position = i;
        videoMessage = (VideoMessage)Preconditions.checkNotNull(videomessage);
    }
}
