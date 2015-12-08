// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.parsing.ValidationException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoMessageFactory

final class VideoMessageListBuilder
{

    private static final String TAG = "VideoMessageListBuilder";

    private VideoMessageListBuilder()
    {
    }

    public static List fromJson(JSONArray jsonarray, VideoMessageFactory videomessagefactory)
    {
        com.google.common.collect.ImmutableList.Builder builder;
        int i;
        Preconditions.checkNotNull(jsonarray);
        Preconditions.checkNotNull(videomessagefactory);
        builder = ImmutableList.builder();
        i = 0;
_L2:
        org.json.JSONObject jsonobject;
        org.json.JSONObject jsonobject1;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = null;
        jsonobject = null;
        org.json.JSONObject jsonobject2 = jsonarray.getJSONObject(i);
        jsonobject = jsonobject2;
        jsonobject1 = jsonobject2;
        builder.add(videomessagefactory.fromJson(jsonobject2));
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        Object obj;
        jsonobject1 = jsonobject;
        obj = jsonexception;
_L4:
        LogUtil.i("VideoMessageListBuilder", LoggingMetaTags.TWC_VIDEOS, "skipping bad video. error=%s, message=%s, json=%s, factory=%s", new Object[] {
            obj.getClass().getSimpleName(), ((Exception) (obj)).getMessage(), jsonobject1, videomessagefactory
        });
          goto _L3
_L1:
        return builder.build();
        obj;
          goto _L4
    }
}
