// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.twcpresents.provider;

import com.google.common.collect.ImmutableList;
import com.google.gson.reflect.TypeToken;
import com.weather.dal2.net.JsonObjectMapper;
import java.util.List;
import org.json.JSONException;

public class TwcPresentsPojo
{

    private static final TypeToken LIST_TYPE = new _cls1();
    public final String featDescript = null;
    public final String featImage = null;
    public final String featTime = null;
    public final String featTitle = null;
    public final String url = null;

    public TwcPresentsPojo()
    {
    }

    public static List parseTwcPresents(String s)
        throws JSONException
    {
        for (s = (List)JsonObjectMapper.fromJson(s, LIST_TYPE.getType()); s.contains(null); s.remove(null)) { }
        return ImmutableList.copyOf(s);
    }


    /* member class not found */
    class _cls1 {}

}
