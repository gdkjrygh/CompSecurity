// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.gcm;

import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{

    private String a;
    private int b;

    public a(String s)
    {
        a = s;
        b = 400;
    }

    private void a(String s)
    {
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        b = (new JSONObject(s)).optInt("result", 400);
        return;
        s;
        s.printStackTrace();
        b = -2;
        return;
    }

    public int a()
    {
        Object obj = new e(a, "GET");
        obj = d.a().b(a, ((e) (obj)), new f());
        if (obj != null)
        {
            a(((String) (obj)));
        } else
        {
            b = 0;
        }
        return b;
    }
}
