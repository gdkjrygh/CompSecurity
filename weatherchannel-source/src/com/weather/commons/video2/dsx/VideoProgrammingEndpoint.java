// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.VideoMessage;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.parsing.ValidationException;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            ListVideo, VideoMessageListBuilder, VideoMessageFactory

public class VideoProgrammingEndpoint
{

    private static final String FIELD_NAME_MAIN = "main";
    private static final String FIELD_NAME_RIGHTNOW = "rightnow";
    private static final String FIELD_NAME_WIDGET = "widget";
    private static final String TAG = "VideoProgrammingEndpoint";
    private static final VideoMessageFactory videoMessageFactory = new VideoMessageFactory() {

        public volatile VideoMessage fromJson(JSONObject jsonobject)
            throws ValidationException, JSONException
        {
            return fromJson(jsonobject);
        }

        public ListVideo fromJson(JSONObject jsonobject)
            throws ValidationException, JSONException
        {
            return ListVideo.fromJson(jsonobject);
        }

        public String toString()
        {
            return String.format("VideoMessageFactory for %s", new Object[] {
                "VideoProgrammingEndpoint"
            });
        }

    };
    private final ImmutableList moduleVideos;
    private final VideoMessage rightNowVideo;
    private final VideoMessage widgetVideo;

    private VideoProgrammingEndpoint(List list, VideoMessage videomessage, VideoMessage videomessage1)
    {
        moduleVideos = ImmutableList.copyOf((Collection)Preconditions.checkNotNull(list));
        rightNowVideo = videomessage;
        widgetVideo = videomessage1;
    }

    public static VideoProgrammingEndpoint fromJson(String s)
        throws JSONException
    {
        return fromJson(new JSONObject((String)Preconditions.checkNotNull(s)));
    }

    public static VideoProgrammingEndpoint fromJson(JSONObject jsonobject)
        throws JSONException
    {
        Object obj;
        Object obj1;
        Preconditions.checkNotNull(jsonobject);
        obj1 = null;
        obj = null;
        Object obj2 = jsonobject.getJSONObject("rightnow");
        obj = obj2;
        obj1 = obj2;
        obj2 = ListVideo.fromJson(((JSONObject) (obj2)));
_L1:
        obj1 = null;
        obj = null;
        Object obj3 = jsonobject.getJSONObject("widget");
        obj = obj3;
        obj1 = obj3;
        obj3 = ListVideo.fromJson(((JSONObject) (obj3)));
        obj = obj3;
_L2:
        return new VideoProgrammingEndpoint(VideoMessageListBuilder.fromJson(jsonobject.getJSONArray("main"), videoMessageFactory), ((VideoMessage) (obj2)), ((VideoMessage) (obj)));
        JSONException jsonexception;
        jsonexception;
        obj1 = obj;
        obj = jsonexception;
_L4:
        LogUtil.i("VideoProgrammingEndpoint", LoggingMetaTags.TWC_VIDEOS, "skipping bad right now video. error=%s, message=%s, json=%s", new Object[] {
            obj.getClass().getSimpleName(), ((Exception) (obj)).getMessage(), obj1
        });
        jsonexception = null;
          goto _L1
        JSONException jsonexception1;
        jsonexception1;
        obj1 = obj;
        obj = jsonexception1;
_L3:
        LogUtil.i("VideoProgrammingEndpoint", LoggingMetaTags.TWC_VIDEOS, "skipping bad widget video. error=%s, message=%s, json=%s", new Object[] {
            obj.getClass().getSimpleName(), ((Exception) (obj)).getMessage(), obj1
        });
        obj = null;
          goto _L2
        obj;
          goto _L3
        obj;
          goto _L4
    }

    public List getModuleVideos()
    {
        return ImmutableList.copyOf(moduleVideos);
    }

    public VideoMessage getRightNowVideo()
    {
        return rightNowVideo;
    }

    public VideoMessage getWidgetVideo()
    {
        return widgetVideo;
    }

}
