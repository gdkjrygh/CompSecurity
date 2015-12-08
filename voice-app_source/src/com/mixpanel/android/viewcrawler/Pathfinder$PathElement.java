// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            Pathfinder

public static class tag
{

    public static final int SHORTEST_PREFIX = 1;
    public static final int ZERO_LENGTH_PREFIX = 0;
    public final String contentDescription;
    public final int index;
    public final int prefix;
    public final String tag;
    public final String viewClassName;
    public final int viewId;

    public String toString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            if (prefix == 1)
            {
                ((JSONObject) (obj)).put("prefix", "shortest");
            }
            if (viewClassName != null)
            {
                ((JSONObject) (obj)).put("view_class", viewClassName);
            }
            if (index > -1)
            {
                ((JSONObject) (obj)).put("index", index);
            }
            if (viewId > -1)
            {
                ((JSONObject) (obj)).put("id", viewId);
            }
            if (contentDescription != null)
            {
                ((JSONObject) (obj)).put("contentDescription", contentDescription);
            }
            if (tag != null)
            {
                ((JSONObject) (obj)).put("tag", tag);
            }
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException("Can't serialize PathElement to String", jsonexception);
        }
        return ((String) (obj));
    }

    public (int i, String s, int j, int k, String s1, String s2)
    {
        prefix = i;
        viewClassName = s;
        index = j;
        viewId = k;
        contentDescription = s1;
        tag = s2;
    }
}
