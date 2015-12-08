// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.VideoMessage;
import com.weather.util.parsing.ValidationException;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoMessageListBuilder, VideoMessageFactory, VideoAsset

public class VideoAssetList
{

    private static final String TAG = "VideoAssetList";
    private static final VideoMessageFactory videoMessageFactory = new VideoMessageFactory() {

        public volatile VideoMessage fromJson(JSONObject jsonobject)
            throws ValidationException, JSONException
        {
            return fromJson(jsonobject);
        }

        public VideoAsset fromJson(JSONObject jsonobject)
            throws ValidationException, JSONException
        {
            return VideoAsset.fromJson(jsonobject);
        }

        public String toString()
        {
            return String.format("VideoMessageFactory for %s", new Object[] {
                "VideoAssetList"
            });
        }

    };
    private final ImmutableList videos;

    public VideoAssetList(List list)
    {
        videos = ImmutableList.copyOf((Collection)Preconditions.checkNotNull(list));
    }

    public static VideoAssetList fromJson(JSONArray jsonarray)
    {
        return new VideoAssetList(VideoMessageListBuilder.fromJson(jsonarray, videoMessageFactory));
    }

    public static VideoAssetList fromJsonString(String s)
        throws JSONException
    {
        String s1 = s;
        if (s.isEmpty())
        {
            s1 = "[]";
        }
        return fromJson(new JSONArray((String)Preconditions.checkNotNull(s1)));
    }

    public ImmutableList getVideos()
    {
        return ImmutableList.copyOf(videos);
    }

}
