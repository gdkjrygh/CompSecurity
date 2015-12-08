// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.ThumbnailSize;
import com.weather.commons.video2.VideoMessage;
import com.weather.util.date.TwcDateParser;
import com.weather.util.parsing.TwcPatterns;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoValidation, AdsMetrics, VideoVariants, Flags, 
//            Tags, VideoStreamType

public class VideoAsset
    implements VideoMessage
{

    private static final String FIELD_NAME_ADSMETRICS = "adsmetrics";
    private static final String FIELD_NAME_COLLECTION_ID = "pcollid";
    private static final String FIELD_NAME_DESCRIPTION = "description";
    private static final String FIELD_NAME_DURATION = "duration";
    private static final String FIELD_NAME_EXPIRES_TIME = "expires_date";
    private static final String FIELD_NAME_FLAGS = "flags";
    private static final String FIELD_NAME_ID = "id";
    private static final String FIELD_NAME_LIVE = "is_live_stream";
    private static final String FIELD_NAME_LOCALE_GLOB = "locale";
    private static final String FIELD_NAME_TAGS = "tags";
    private static final String FIELD_NAME_TEASER_TITLE = "teaserTitle";
    private static final String FIELD_NAME_TITLE = "title";
    private static final String FIELD_NAME_URL = "url";
    private static final String FIELD_NAME_VARIANTS = "variants";
    private static final String FIELD_NAME_VIDEO_PROVIDER = "providername";
    public static final int MAX_DESCRIPTION_LENGTH = 500;
    private final AdsMetrics adsMetrics;
    private final String collectionId;
    private final String description;
    private final String duration;
    private final long expiresTime;
    private final Flags flags;
    private final String id;
    private final boolean live;
    private final String localeGlob;
    private final String provider;
    private final Tags tags;
    private final String teaserTitle;
    private final String title;
    private final String url;
    private final VideoVariants videoVariants;

    private VideoAsset(String s, String s1, String s2, String s3, String s4, String s5, AdsMetrics adsmetrics, 
            VideoVariants videovariants, String s6, String s7, String s8, boolean flag, String s9, Flags flags1, 
            Tags tags1)
        throws ValidationException
    {
        id = Validation.validateUuid("id", ((String)Preconditions.checkNotNull(s)).trim());
        title = Validation.validateLength(1, 100, "title", ((String)Preconditions.checkNotNull(s1)).trim());
        teaserTitle = Validation.validateLength(1, 100, "teaserTitle", ((String)Preconditions.checkNotNull(s2)).trim());
        collectionId = VideoValidation.validateCollectionId("pcollid", ((String)Preconditions.checkNotNull(s3)).trim());
        localeGlob = Validation.validatePattern(TwcPatterns.LOCALE_GLOB_PATTERN, "locale", ((String)Preconditions.checkNotNull(s4)).trim());
        url = Validation.validatePathFragment("url", ((String)Preconditions.checkNotNull(s5)).trim());
        adsMetrics = (AdsMetrics)Preconditions.checkNotNull(adsmetrics);
        videoVariants = (VideoVariants)Preconditions.checkNotNull(videovariants);
        if (((String)Preconditions.checkNotNull(s6)).isEmpty())
        {
            expiresTime = 0x7fffffffffffffffL;
        } else
        {
            s = TwcDateParser.parseISO(s6);
            if (s == null)
            {
                throw new ValidationException(String.format("invalid ISO 8601 data. fieldName=%s, url=%s", new Object[] {
                    "expires_date", s6
                }));
            }
            expiresTime = s.getTime();
        }
        if (s7 == null)
        {
            s = null;
        } else
        {
            s = simplifyDuration(Validation.validateLength(8, 8, "duration", s7));
        }
        duration = s;
        if (s8 == null)
        {
            s = null;
        } else
        {
            s = Validation.validateLength(0, 500, "description", s8);
        }
        description = s;
        live = flag;
        provider = (String)Preconditions.checkNotNull(s9);
        flags = (Flags)Preconditions.checkNotNull(flags1);
        tags = (Tags)Preconditions.checkNotNull(tags1);
    }

    public static VideoAsset fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        Validation.validateClass(java/lang/String, "title", jsonobject.get("title"));
        Validation.validateClass(java/lang/String, "teaserTitle", jsonobject.get("teaserTitle"));
        Validation.validateClass(java/lang/String, "pcollid", jsonobject.get("pcollid"));
        if (jsonobject.has("is_live_stream"))
        {
            Validation.validateClass(java/lang/Boolean, "is_live_stream", jsonobject.get("is_live_stream"));
        }
        JSONObject jsonobject1 = jsonobject.optJSONObject("flags");
        Object obj = jsonobject.optJSONObject("tags");
        String s = jsonobject.getString("id");
        String s1 = jsonobject.getString("title");
        String s2 = jsonobject.getString("teaserTitle");
        String s3 = jsonobject.getString("pcollid");
        String s4 = jsonobject.getString("locale");
        String s5 = jsonobject.getString("url");
        AdsMetrics adsmetrics = AdsMetrics.fromJson(jsonobject.getJSONObject("adsmetrics"));
        VideoVariants videovariants = VideoVariants.fromJson(jsonobject.getJSONObject("variants"));
        String s6 = jsonobject.optString("expires_date", "");
        String s7 = jsonobject.optString("duration", null);
        String s8 = jsonobject.optString("description", null);
        boolean flag = jsonobject.optBoolean("is_live_stream", false);
        String s9 = jsonobject.optString("providername", "unknown");
        if (jsonobject1 == null)
        {
            jsonobject = Flags.getDefault();
        } else
        {
            jsonobject = Flags.fromJson(jsonobject1);
        }
        if (obj == null)
        {
            obj = Tags.getDefault();
        } else
        {
            obj = Tags.fromJson(((JSONObject) (obj)));
        }
        return new VideoAsset(s, s1, s2, s3, s4, s5, adsmetrics, videovariants, s6, s7, s8, flag, s9, jsonobject, ((Tags) (obj)));
    }

    private String simplifyDuration(String s)
    {
        String s1;
        if (s.startsWith("00:0"))
        {
            s1 = s.substring(4);
        } else
        {
            s1 = s;
            if (s.startsWith("00:"))
            {
                return s.substring(3);
            }
        }
        return s1;
    }

    public AdsMetrics getAdsMetrics()
    {
        return adsMetrics;
    }

    public String getCollectionId()
    {
        return collectionId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDuration()
    {
        return duration;
    }

    public long getExpiresTime()
    {
        return expiresTime;
    }

    public Flags getFlags()
    {
        return flags;
    }

    public String getId()
    {
        return id;
    }

    public String getLocaleGlob()
    {
        return localeGlob;
    }

    public String getPlaylistId()
    {
        return null;
    }

    public String getProvider()
    {
        return provider;
    }

    public Tags getTags()
    {
        return tags;
    }

    public String getTeaserTitle()
    {
        return teaserTitle;
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        return videoVariants.getThumbnailUrl(thumbnailsize);
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl(String s)
    {
        return String.format(Locale.US, s, new Object[] {
            url
        });
    }

    public List getVideoStreamInfo(boolean flag)
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        if (flag)
        {
            String s = videoVariants.getAndroidHlsVideoUrl();
            if (s != null)
            {
                builder.add(new com.weather.commons.video2.VideoMessage.VideoStreamInfo(s, VideoStreamType.HLS, videoVariants.getAndroidHlsVariantName()));
            }
        }
        String s1 = videoVariants.getAndroidMp4VideoUrl();
        if (s1 != null)
        {
            builder.add(new com.weather.commons.video2.VideoMessage.VideoStreamInfo(s1, VideoStreamType.MP4, videoVariants.getAndroidMp4VariantName()));
        }
        builder.add(new com.weather.commons.video2.VideoMessage.VideoStreamInfo(videoVariants.getMp4VideoUrl(), VideoStreamType.MP4, videoVariants.getMp4VariantName()));
        return builder.build();
    }

    public boolean isLive()
    {
        return live;
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoAsset{id='").append(id).append('\'').append(", title='").append(title).append('\'').append(", teaserTitle='").append(teaserTitle).append('\'').append(", collectionId='").append(collectionId).append('\'').append(", localeGlob='").append(localeGlob).append('\'').append(", url='").append(url).append('\'').append(", adsMetrics=").append(adsMetrics).append(", videoVariants=").append(videoVariants).append(", expiresTime=").append(expiresTime).append(", duration='").append(duration).append('\'').append(", description='").append(description).append('\'').append(", flags=").append(flags).append(", isLive=").append(live).append(", provider=").append(provider).append(", Tags=").append(tags).append('}').toString();
    }
}
