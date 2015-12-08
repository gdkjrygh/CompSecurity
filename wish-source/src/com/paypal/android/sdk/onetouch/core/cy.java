// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cx, da, RequestTarget, dc, 
//            db, cw

public class cy
{

    private static final String a = com/paypal/android/sdk/onetouch/core/cy.getSimpleName();

    public cy()
    {
    }

    private static void a(da da1, String s, JSONObject jsonobject)
    {
        da1.a(s, (new cx()).a(s).b(jsonobject.getString("url")).c(jsonobject.getString("certificate")));
    }

    private static void a(dc dc1, JSONObject jsonobject)
    {
        boolean flag = false;
        dc1.a(RequestTarget.valueOf(jsonobject.getString("target"))).c(jsonobject.getString("protocol"));
        if (jsonobject.has("component"))
        {
            dc1.f(jsonobject.getString("component"));
        }
        if (jsonobject.has("intent_action"))
        {
            dc1.g(jsonobject.getString("intent_action"));
        }
        JSONArray jsonarray = jsonobject.getJSONArray("packages");
        for (int i = 0; i < jsonarray.length(); i++)
        {
            dc1.d(jsonarray.getString(i));
        }

        if (jsonobject.has("supported_locales"))
        {
            jsonobject = jsonobject.getJSONArray("supported_locales");
            for (int j = ((flag) ? 1 : 0); j < jsonobject.length(); j++)
            {
                dc1.e(jsonobject.getString(j));
            }

        }
    }

    private da b(JSONObject jsonobject)
    {
        da da1 = new da();
        a(da1, jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray("scope");
        int i = 0;
        while (i < jsonarray.length()) 
        {
            String s = jsonarray.getString(i);
            if ("*".equals(s))
            {
                da1.b();
            } else
            {
                da1.a(s);
            }
            i++;
        }
        if (jsonobject.has("endpoints"))
        {
            jsonobject = jsonobject.getJSONObject("endpoints");
            if (jsonobject.has("live"))
            {
                a(da1, "live", jsonobject.getJSONObject("live"));
            }
            if (jsonobject.has("develop"))
            {
                a(da1, "develop", jsonobject.getJSONObject("develop"));
            }
            if (jsonobject.has("mock"))
            {
                a(da1, "mock", jsonobject.getJSONObject("mock"));
            }
        }
        return da1;
    }

    public final db a(JSONObject jsonobject)
    {
        boolean flag = false;
        db db1 = new db();
        Object obj = jsonobject.getString("os");
        (new StringBuilder("os:")).append(((String) (obj)));
        obj = jsonobject.getString("file_timestamp");
        (new StringBuilder("file_timestamp:")).append(((String) (obj)));
        db1.a(((String) (obj)));
        (new StringBuilder("otcConfiguration.getFileTimestamp():")).append(db1.a());
        jsonobject = jsonobject.getJSONObject("1.0");
        obj = jsonobject.getJSONArray("oauth2_recipes_in_decreasing_priority_order");
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            JSONObject jsonobject2 = ((JSONArray) (obj)).getJSONObject(i);
            if (jsonobject2 != null)
            {
                db1.a(b(jsonobject2));
            }
        }

        (new StringBuilder("parsed ")).append(db1.c().size()).append(" oauth2 recipes");
        jsonobject = jsonobject.getJSONArray("checkout_recipes_in_decreasing_priority_order");
        for (int j = ((flag) ? 1 : 0); j < jsonobject.length(); j++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(j);
            if (jsonobject1 != null)
            {
                cw cw1 = new cw();
                a(((dc) (cw1)), jsonobject1);
                db1.a(cw1);
            }
        }

        (new StringBuilder("parsed ")).append(db1.d().size()).append(" checkout recipes");
        return db1;
    }

}
