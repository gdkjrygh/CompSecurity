// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{

    private long a;
    private String b;
    private int c;
    private String d;

    public c()
    {
    }

    public long a()
    {
        return a;
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s = new JSONObject(s);
        a = s.optLong("typeid", 0L);
        b = s.optString("name", "");
        c = s.optInt("ishome", 0);
        d = s.optString("home", "");
        return;
        s;
        s.printStackTrace();
        return;
    }

    public boolean a(int i)
    {
        while (TextUtils.isEmpty(d) || d.contains("#") || !String.valueOf(i).equals(d)) 
        {
            return false;
        }
        return true;
    }

    public JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("typeid", a);
            jsonobject.put("name", b);
            jsonobject.put("ishome", c);
            jsonobject.put("home", d);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
