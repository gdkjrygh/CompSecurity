// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.d:
//            b

public class a extends b
    implements Serializable
{

    public long a;
    public int b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;
    private int j;
    private String k;
    private int l;
    private String m;
    private String n;
    private String o;
    private int p;
    private String q;
    private List r;

    public a()
    {
        a = 0L;
        b = 0;
        p = 1;
        q = null;
        r = new ArrayList();
    }

    private void b(String s)
    {
        r.clear();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        r.add(Integer.valueOf(1));
        r.add(Integer.valueOf(2));
        r.add(Integer.valueOf(3));
_L4:
        return;
_L2:
        if (!s.contains("#"))
        {
            try
            {
                int i1 = Integer.valueOf(s).intValue();
                r.add(Integer.valueOf(i1));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
        s = s.split("#");
        if (s != null)
        {
            int k1 = s.length;
            int j1 = 0;
            while (j1 < k1) 
            {
                String s1 = s[j1];
                try
                {
                    int l1 = Integer.valueOf(s1).intValue();
                    r.add(Integer.valueOf(l1));
                }
                catch (NumberFormatException numberformatexception) { }
                j1++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public long a()
    {
        return a;
    }

    public void a(long l1)
    {
        a = l1;
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_206;
        }
        s = new JSONObject(s);
        c = s.optLong("appid", 0L);
        d = s.optString("packname", "");
        f = s.optString("name", "");
        g = s.optString("icon", "");
        h = s.optInt("tag", 0);
        i = s.optString("pics", "");
        j = s.optInt("isfree", 0);
        k = s.optString("paytype", "");
        l = s.optInt("downloadtype", 0);
        m = s.optString("downloadurl", "");
        n = s.optString("ficon", "");
        o = s.optString("dependent_app", "");
        b = s.optInt("issupport_coupons", 0);
        p = s.optInt("purchase_process", 1);
        q = s.optString("summary");
        e = s.optString("pkgalias");
        b(e);
        return;
        s;
        s.printStackTrace();
        return;
    }

    public boolean a(int i1)
    {
        return r.contains(Integer.valueOf(i1));
    }

    public long b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return f;
    }

    public String e()
    {
        return g;
    }

    public int f()
    {
        return h;
    }

    public String g()
    {
        return i;
    }

    public int h()
    {
        return j;
    }

    public int i()
    {
        return l;
    }

    public String j()
    {
        return m;
    }

    public String k()
    {
        return q;
    }

    public String l()
    {
        return n;
    }

    public boolean m()
    {
        if (k != null)
        {
            return k.contains("2");
        } else
        {
            return false;
        }
    }

    public boolean n()
    {
        if (k != null)
        {
            return k.contains("7");
        } else
        {
            return false;
        }
    }

    public String o()
    {
        return o;
    }

    public boolean p()
    {
        return b == 1;
    }

    public JSONObject q()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("appid", c);
            jsonobject.put("packname", d);
            jsonobject.put("name", f);
            jsonobject.put("icon", g);
            jsonobject.put("tag", h);
            jsonobject.put("pics", i);
            jsonobject.put("isfree", j);
            jsonobject.put("paytype", k);
            jsonobject.put("downloadtype", l);
            jsonobject.put("downloadurl", m);
            jsonobject.put("ficon", n);
            jsonobject.put("dependent_app", o);
            jsonobject.put("issupport_coupons", b);
            jsonobject.put("purchase_process", p);
            jsonobject.put("pkgalias", e);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public int r()
    {
        if (m())
        {
            return 2;
        }
        return !n() ? 1 : 7;
    }
}
