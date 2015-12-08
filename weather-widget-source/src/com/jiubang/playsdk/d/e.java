// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.d:
//            a

public class e
    implements Serializable
{

    public long a;
    private int b;
    private int c;
    private String d;
    private String e;
    private String f;
    private int g;
    private a h;

    public e()
    {
        a = 0L;
    }

    public String a()
    {
        return e;
    }

    public void a(long l)
    {
        a = l;
    }

    public void a(a a1)
    {
        h = a1;
    }

    public void a(String s)
    {
        f = s;
    }

    public String b()
    {
        return f;
    }

    public void b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        try
        {
            s = new JSONObject(s);
            b = s.optInt("type", 1);
            c = s.optInt("acttype", 0);
            d = s.optString("actvalue", "");
            e = s.optString("pic", "");
            f = s.optString("name", "");
            g = s.optInt("position", 0);
            s = s.optJSONObject("appinfo");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        h = new a();
        h.b(g);
        h.a(a);
        h.a(s.toString());
    }

    public int c()
    {
        return g;
    }

    public int d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public a f()
    {
        return h;
    }

    public JSONObject g()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("type", b);
            jsonobject.put("acttype", c);
            jsonobject.put("actvalue", d);
            jsonobject.put("pic", e);
            jsonobject.put("name", f);
            jsonobject.put("position", g);
            if (h != null)
            {
                jsonobject.put("appinfo", h.q());
            }
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
