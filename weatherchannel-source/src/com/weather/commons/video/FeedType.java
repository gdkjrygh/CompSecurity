// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import com.google.common.collect.ImmutableList;
import com.weather.util.device.LocaleUtil;
import java.util.Collection;

public abstract class FeedType extends Enum
{

    private static final FeedType $VALUES[];
    public static final FeedType LOCAL;
    public static final FeedType MUST_SEE;
    public static final FeedType ON_TV;

    private FeedType(String s, int i)
    {
        super(s, i);
    }


    public static FeedType valueOf(String s)
    {
        return (FeedType)Enum.valueOf(com/weather/commons/video/FeedType, s);
    }

    public static FeedType[] values()
    {
        return (FeedType[])$VALUES.clone();
    }

    abstract Collection getVideoTypes();

    static 
    {
        LOCAL = new FeedType("LOCAL", 0) {

            Collection getVideoTypes()
            {
                return ImmutableList.of(VideoMessage.VideoType.LOCAL, VideoMessage.VideoType.REGIONAL, VideoMessage.VideoType.NATIONAL);
            }

        };
        ON_TV = new FeedType("ON_TV", 1) {

            Collection getVideoTypes()
            {
                return ImmutableList.of(VideoMessage.VideoType.ONTV);
            }

        };
        MUST_SEE = new FeedType("MUST_SEE", 2) {

            Collection getVideoTypes()
            {
                VideoMessage.VideoType videotype;
                if (LocaleUtil.isDeviceInUS())
                {
                    videotype = VideoMessage.VideoType.MUST_SEE;
                } else
                {
                    videotype = VideoMessage.VideoType.MUST_SEE_INTL;
                }
                return ImmutableList.of(videotype);
            }

        };
        $VALUES = (new FeedType[] {
            LOCAL, ON_TV, MUST_SEE
        });
    }
}
