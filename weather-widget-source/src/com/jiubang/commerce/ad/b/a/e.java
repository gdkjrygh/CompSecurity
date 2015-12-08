// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b.a:
//            d

public class e
{

    private int a;
    private int b;
    private int c;
    private String d;
    private List e;

    public e()
    {
    }

    public static e a(Context context, int i, JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() < 1)
        {
            return null;
        } else
        {
            e e1 = new e();
            e1.a = i;
            e1.b = jsonobject.optInt("success", 0);
            e1.c = jsonobject.optInt("clickLimit", -1);
            e1.d = jsonobject.optString("message");
            e1.e = com.jiubang.commerce.ad.b.a.d.a(context, jsonobject.optJSONArray("advs"), i);
            return e1;
        }
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public List d()
    {
        return e;
    }
}
