// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b.a;

import com.gtp.go.weather.sharephoto.b.f;
import org.json.JSONObject;

public class a
{

    public static com.gtp.go.weather.sharephoto.b.a a(JSONObject jsonobject)
    {
        com.gtp.go.weather.sharephoto.b.a a1 = new com.gtp.go.weather.sharephoto.b.a();
        JSONObject jsonobject1 = jsonobject.optJSONObject("apkPic");
        if (jsonobject1 != null)
        {
            a1.a(f.a(jsonobject1).a());
        }
        a1.c(jsonobject.optString("packageName", ""));
        a1.d(jsonobject.optString("apkName", ""));
        a1.e(jsonobject.optString("apkUrl", ""));
        a1.a(jsonobject.optInt("apkUrlType", -1));
        return a1;
    }
}
