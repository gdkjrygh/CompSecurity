// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import com.weather.dal2.net.JsonObjectMapper;
import java.util.List;
import org.json.JSONException;

public class SlideShow
{

    public final List assets = null;
    public final String id = null;
    public final String title = null;

    public SlideShow()
    {
    }

    public static SlideShow fromJson(String s)
        throws JSONException
    {
        return (SlideShow)JsonObjectMapper.fromJson(s, com/weather/commons/news/provider/SlideShow);
    }
}
