// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.util;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils
{

    public JSONUtils()
    {
    }

    public static String optionalStringKey(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has(s) && !jsonobject.isNull(s))
        {
            return jsonobject.getString(s);
        } else
        {
            return null;
        }
    }
}
