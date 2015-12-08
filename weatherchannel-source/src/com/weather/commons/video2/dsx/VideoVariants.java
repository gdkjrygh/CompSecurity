// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.weather.commons.video2.ThumbnailSize;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            ImageVariants

class VideoVariants
{

    private static final String FIELD_NAME_ANDROID = "android";
    private static final String FIELD_NAME_ANDROID_ABR = "android_abr";
    private static final String FIELD_NAME_VIDEO = "video";
    private final String androidHlsVideoUrl;
    private final String androidMp4VideoUrl;
    private final ImageVariants imageVariants;
    private final String mp4VideoUrl;

    private VideoVariants(ImageVariants imagevariants, String s, String s1, String s2)
        throws ValidationException
    {
        Object obj = null;
        super();
        imageVariants = imagevariants;
        mp4VideoUrl = Validation.validateWebUrl("video", s);
        if (s1 == null)
        {
            imagevariants = null;
        } else
        {
            imagevariants = Validation.validateWebUrl("android", s1);
        }
        androidMp4VideoUrl = imagevariants;
        if (s2 == null)
        {
            imagevariants = obj;
        } else
        {
            imagevariants = Validation.validateWebUrl("android_abr", s2);
        }
        androidHlsVideoUrl = imagevariants;
    }

    public static VideoVariants fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        return new VideoVariants(ImageVariants.fromJson(jsonobject), jsonobject.getString("video"), jsonobject.optString("android", null), jsonobject.optString("android_abr", null));
    }

    String getAndroidHlsVariantName()
    {
        return "android_abr";
    }

    public String getAndroidHlsVideoUrl()
    {
        return androidHlsVideoUrl;
    }

    String getAndroidMp4VariantName()
    {
        return "android";
    }

    public String getAndroidMp4VideoUrl()
    {
        return androidMp4VideoUrl;
    }

    String getMp4VariantName()
    {
        return "video";
    }

    public String getMp4VideoUrl()
    {
        return mp4VideoUrl;
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        return imageVariants.getThumbnailUrl(thumbnailsize);
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoVariants{imageVariants=").append(imageVariants).append(", mp4VideoUrl='").append(mp4VideoUrl).append('\'').append(", androidMp4VideoUrl='").append(androidMp4VideoUrl).append('\'').append(", androidHlsVideoUrl='").append(androidHlsVideoUrl).append('\'').append('}').toString();
    }
}
