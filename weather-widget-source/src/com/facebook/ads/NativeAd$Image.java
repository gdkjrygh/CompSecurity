// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import org.json.JSONObject;

public class height
{

    private final int height;
    private final String url;
    private final int width;

    public static height fromJSONObject(JSONObject jsonobject)
    {
        String s;
        if (jsonobject != null)
        {
            if ((s = jsonobject.optString("url")) != null)
            {
                return new <init>(s, jsonobject.optInt("width", 0), jsonobject.optInt("height", 0));
            }
        }
        return null;
    }

    public int getHeight()
    {
        return height;
    }

    public String getUrl()
    {
        return url;
    }

    public int getWidth()
    {
        return width;
    }

    private (String s, int i, int j)
    {
        url = s;
        width = i;
        height = j;
    }
}
