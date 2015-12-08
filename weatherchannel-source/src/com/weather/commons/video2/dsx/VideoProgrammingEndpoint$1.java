// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.weather.commons.video2.VideoMessage;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoMessageFactory, VideoProgrammingEndpoint, ListVideo

static final class 
    implements VideoMessageFactory
{

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

    ()
    {
    }
}
