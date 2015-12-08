// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.common.base.Function;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.weather.ads2.config.AdConfigManager;
import com.weather.ads2.config.AdConfigUnit;
import com.weather.ads2.config.AdSlotNotFoundException;
import com.weather.ads2.targeting.AdCallData;
import com.weather.ads2.targeting.TargetingManager;
import com.weather.commons.share.ShareableUrl;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;
import java.io.File;

public final class VideoMessage
    implements ShareableUrl
{
    public static final class VideoType extends Enum
    {

        private static final VideoType $VALUES[];
        public static final VideoType CANTORE;
        public static final VideoType LOCAL;
        public static final VideoType MUST_SEE;
        public static final VideoType MUST_SEE_INTL;
        public static final VideoType NATIONAL;
        public static final VideoType ONTV;
        public static final VideoType REGIONAL;
        public static final VideoType TORNADO;
        public static final VideoType TROPICAL;
        public static final VideoType WORLD;

        public static VideoType valueOf(String s)
        {
            return (VideoType)Enum.valueOf(com/weather/commons/video/VideoMessage$VideoType, s);
        }

        public static VideoType[] values()
        {
            return (VideoType[])$VALUES.clone();
        }

        static 
        {
            LOCAL = new VideoType("LOCAL", 0);
            REGIONAL = new VideoType("REGIONAL", 1);
            NATIONAL = new VideoType("NATIONAL", 2);
            MUST_SEE = new VideoType("MUST_SEE", 3);
            CANTORE = new VideoType("CANTORE", 4);
            TORNADO = new VideoType("TORNADO", 5);
            TROPICAL = new VideoType("TROPICAL", 6);
            WORLD = new VideoType("WORLD", 7);
            ONTV = new VideoType("ONTV", 8);
            MUST_SEE_INTL = new VideoType("MUST_SEE_INTL", 9);
            $VALUES = (new VideoType[] {
                LOCAL, REGIONAL, NATIONAL, MUST_SEE, CANTORE, TORNADO, TROPICAL, WORLD, ONTV, MUST_SEE_INTL
            });
        }

        private VideoType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "VideoMessage";
    private static String largeReplacement;
    private static String regularReplacement;
    private String clipid;
    private String country;
    private String description;
    private String dma;
    private File localThumbnailLink;
    private String region;
    private String state;
    private String thumbnailLink;
    private String title;
    private VideoType type;
    private String videoLink;

    public VideoMessage()
    {
    }

    public static String getLargeVideoReplacement()
    {
        if (largeReplacement != null)
        {
            return largeReplacement;
        }
        int i = AbstractTwcApplication.getRootContext().getResources().getDisplayMetrics().densityDpi;
        if ((AbstractTwcApplication.getRootContext().getResources().getConfiguration().screenLayout & 0xf) >= 3 || i == 320 || i == 480)
        {
            largeReplacement = "_980x551.";
        } else
        if (i == 240)
        {
            largeReplacement = "_815x458.";
        } else
        {
            largeReplacement = "_485x273";
        }
        return largeReplacement;
    }

    public static String getRegularVideoReplacement()
    {
        if (regularReplacement != null)
        {
            return regularReplacement;
        }
        int i = AbstractTwcApplication.getRootContext().getResources().getDisplayMetrics().densityDpi;
        if ((AbstractTwcApplication.getRootContext().getResources().getConfiguration().screenLayout & 0xf) >= 3 || i == 320 || i == 480)
        {
            regularReplacement = "_650x366.";
        } else
        if (i == 240)
        {
            regularReplacement = "_485x273.";
        } else
        {
            regularReplacement = "_320x180.";
        }
        return regularReplacement;
    }

    public static Multimap partitionByDMA(Iterable iterable)
    {
        return Multimaps.index(iterable, new Function() {

            public volatile Object apply(Object obj)
            {
                return apply((VideoMessage)obj);
            }

            public String apply(VideoMessage videomessage)
            {
                if (videomessage == null)
                {
                    return "";
                }
                if (videomessage.dma == null)
                {
                    return "";
                } else
                {
                    return videomessage.dma;
                }
            }

        });
    }

    public static Multimap partitionByRegion(Iterable iterable)
    {
        return Multimaps.index(iterable, new Function() {

            public volatile Object apply(Object obj)
            {
                return apply((VideoMessage)obj);
            }

            public String apply(VideoMessage videomessage)
            {
                if (videomessage == null)
                {
                    return "";
                }
                if (videomessage.region == null)
                {
                    return "";
                } else
                {
                    return videomessage.region;
                }
            }

        });
    }

    public String getClipid()
    {
        return clipid;
    }

    public String getCountry()
    {
        return country;
    }

    public String getDMA()
    {
        return dma;
    }

    public String getDescription()
    {
        return description;
    }

    public String getLargerThumbnailLink()
    {
        if (thumbnailLink == null)
        {
            return null;
        } else
        {
            return thumbnailLink.replace("_122.", getLargeVideoReplacement());
        }
    }

    public File getLocalThumbNailLink()
    {
        return localThumbnailLink;
    }

    public String getRegion()
    {
        return region;
    }

    public String getRegularThumbnailLink()
    {
        if (thumbnailLink == null)
        {
            return null;
        } else
        {
            return thumbnailLink.replace("_122.", getRegularVideoReplacement());
        }
    }

    public String getState()
    {
        return state;
    }

    public String getThumbnailLink()
    {
        return thumbnailLink;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUnicornVideoLink(String s)
    {
        Object obj;
        com.weather.ads2.config.AdConfig adconfig;
        try
        {
            adconfig = AdConfigManager.INSTANCE.getAdConfig();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("VideoMessage", "Unable to add unicorn parameters to request", s);
            return null;
        }
        obj = null;
        s = new AdConfigUnit(adconfig, s);
_L1:
        return TargetingManager.INSTANCE.addUnicornParameters(videoLink, new AdCallData(s), adconfig);
        s;
        Log.w("VideoMessage", "Unable to find slot", s);
        s = obj;
          goto _L1
    }

    public String getUrl(String s)
    {
        return String.format(s, new Object[] {
            clipid
        });
    }

    public String getVideoLink()
    {
        return videoLink;
    }

    public VideoType getVideoType()
    {
        return type;
    }

    public void setClipid(String s)
    {
        clipid = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setDMA(String s)
    {
        dma = s;
    }

    public void setDescription(String s)
    {
        description = s.trim();
    }

    public void setLocalThumbnailLink(File file)
    {
        localThumbnailLink = file;
    }

    public void setRegion(String s)
    {
        region = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setThumbnailLink(String s)
    {
        thumbnailLink = s;
    }

    public void setTitle(String s)
    {
        title = s.trim();
    }

    public void setType(VideoType videotype)
    {
        type = videotype;
    }

    public void setUnicornVideoLink(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            videoLink = s;
        }
    }

    public void setVideoLink(String s)
    {
        videoLink = s;
    }


}
