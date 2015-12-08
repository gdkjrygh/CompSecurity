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
//            VideoValidation, ImageVariants

class Config
{

    private static final String FIELD_NAME_IMAGE = "overrideimage";
    private static final String FIELD_NAME_PLAYLIST = "playlist";
    private static final String FIELD_NAME_TEASERTITLE = "overridetitle";
    private final ImageVariants imageVariants;
    private final String playlist;
    private final String teaserTitle;

    private Config(String s, ImageVariants imagevariants, String s1)
        throws ValidationException
    {
        Object obj;
        obj = null;
        super();
        if (s == null)
        {
            s = null;
        } else
        if (s.isEmpty())
        {
            s = null;
        } else
        {
            s = Validation.validateLength(2, 100, "overridetitle", s);
        }
        teaserTitle = s;
        imageVariants = imagevariants;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s = obj;
_L4:
        playlist = s;
        return;
_L2:
        s = obj;
        if (!s1.isEmpty())
        {
            s = VideoValidation.validatePlaylistId("playlist", s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Config fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        if (jsonobject.has("overridetitle"))
        {
            Validation.validateClass(java/lang/String, "overridetitle", jsonobject.get("overridetitle"));
        }
        if (jsonobject.has("playlist"))
        {
            Validation.validateClass(java/lang/String, "playlist", jsonobject.get("playlist"));
        }
        if (jsonobject.has("overrideimage"))
        {
            Validation.validateClass(org/json/JSONObject, "overrideimage", jsonobject.get("overrideimage"));
        }
        Object obj = jsonobject.optJSONObject("overrideimage");
        String s = jsonobject.optString("overridetitle", null);
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ImageVariants.fromJson(((JSONObject) (obj)));
        }
        return new Config(s, ((ImageVariants) (obj)), jsonobject.optString("playlist", null));
    }

    public String getPlaylist()
    {
        return playlist;
    }

    public String getTeaserTitle()
    {
        return teaserTitle;
    }

    public String getThumbnailUrl(ThumbnailSize thumbnailsize)
    {
        if (imageVariants == null)
        {
            return null;
        } else
        {
            return imageVariants.getThumbnailUrl(thumbnailsize);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Config{teaserTitle='").append(teaserTitle).append('\'').append(", imageVariants=").append(imageVariants).append(", playlist='").append(playlist).append('\'').append('}').toString();
    }
}
