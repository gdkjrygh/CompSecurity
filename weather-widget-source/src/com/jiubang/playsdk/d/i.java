// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.content.Context;
import android.os.Build;
import com.jiubang.playsdk.f.a;
import com.jiubang.playsdk.f.e;
import org.json.JSONException;
import org.json.JSONObject;

public class i
{

    public static JSONObject a(Context context, String s, int j, int k, String s1)
    {
        JSONObject jsonobject;
        String s2;
        int l;
        l = 0;
        jsonobject = new JSONObject();
        s2 = e.b(context);
        jsonobject.put("launcherid", s2);
        jsonobject.put("imsi", e.c(context));
        jsonobject.put("imei", e.b(context));
        if (com.jiubang.playsdk.f.a.c(context, "com.android.vending"))
        {
            l = 1;
        }
        try
        {
            jsonobject.put("hasmarket", l);
            jsonobject.put("lang", e.d(context));
            jsonobject.put("local", e.e(context));
            jsonobject.put("channel", e.f(context));
            jsonobject.put("sys", Build.MODEL);
            jsonobject.put("sdk", android.os.Build.VERSION.SDK_INT);
            jsonobject.put("dpi", e.g(context));
            jsonobject.put("pversion", s);
            jsonobject.put("netlog", k);
            jsonobject.put("net", e.k(context));
            jsonobject.put("clientid", j);
            jsonobject.put("androidid", e.h(context));
            jsonobject.put("cversion", e.i(context));
            jsonobject.put("sbuy", 0);
            jsonobject.put("official", 0);
            jsonobject.put("curthemes", com.jiubang.playsdk.f.a.a(context));
            jsonobject.put("goid", com.gau.go.a.e.b(context));
            jsonobject.put("gadid", s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
