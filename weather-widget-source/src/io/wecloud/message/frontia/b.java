// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{

    private long a;
    private int b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private String i;
    private String j;
    private String k;
    private String l;

    public b()
    {
        c = null;
        d = null;
        e = false;
        f = false;
        g = false;
        i = null;
        j = null;
        k = null;
        l = null;
    }

    public b(JSONObject jsonobject)
    {
        c = null;
        d = null;
        e = false;
        f = false;
        g = false;
        i = null;
        j = null;
        k = null;
        l = null;
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (jsonobject.has("message_id"))
        {
            a = jsonobject.getLong("message_id");
        }
        if (!jsonobject.has("message_type")) goto _L4; else goto _L3
_L3:
        String s = jsonobject.getString("message_type");
        if (!TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        b = -1;
_L4:
        if (jsonobject.has("message_title"))
        {
            c = jsonobject.getString("message_title");
        }
        if (jsonobject.has("message_content"))
        {
            d = jsonobject.getString("message_content");
        }
        if (jsonobject.has("warm_type"))
        {
            s = jsonobject.getString("warm_type");
            if (!TextUtils.isEmpty(s))
            {
                if (s.contains("1"))
                {
                    e = true;
                }
                if (s.contains("2"))
                {
                    f = true;
                }
                if (s.contains("3"))
                {
                    g = true;
                }
            }
        }
        if (!jsonobject.has("message_action")) goto _L8; else goto _L7
_L7:
        s = jsonobject.getString("message_action");
        if (!TextUtils.isEmpty(s)) goto _L10; else goto _L9
_L9:
        h = -1;
_L8:
        if (jsonobject.has("action_param"))
        {
            i = jsonobject.getString("action_param");
        }
        if (jsonobject.has("message_style"))
        {
            j = jsonobject.getString("message_style");
        }
        if (jsonobject.has("message_url"))
        {
            k = jsonobject.getString("message_url");
        }
        if (!jsonobject.has("message_icon")) goto _L1; else goto _L11
_L11:
        l = jsonobject.getString("message_icon");
        return;
_L6:
label0:
        {
            if (!s.equals("1"))
            {
                break label0;
            }
            b = 1;
        }
          goto _L4
label1:
        {
            if (!s.equals("2"))
            {
                break label1;
            }
            b = 2;
        }
          goto _L4
label2:
        {
            if (!s.equals("3"))
            {
                break label2;
            }
            b = 3;
        }
          goto _L4
        try
        {
            b = -1;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return;
        }
          goto _L4
_L10:
label3:
        {
            if (!s.equals("1"))
            {
                break label3;
            }
            h = 1;
        }
          goto _L8
label4:
        {
            if (!s.equals("2"))
            {
                break label4;
            }
            h = 2;
        }
          goto _L8
label5:
        {
            if (!s.equals("3"))
            {
                break label5;
            }
            h = 3;
        }
          goto _L8
label6:
        {
            if (!s.equals("4"))
            {
                break label6;
            }
            h = 4;
        }
          goto _L8
        h = -1;
          goto _L8
    }

    public void a(int i1)
    {
        b = i1;
    }

    public void a(long l1)
    {
        a = l1;
    }

    public void a(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            a = bundle.getLong("id");
            b = bundle.getInt("type");
            c = bundle.getString("title");
            d = bundle.getString("content");
            e = bundle.getBoolean("isledenable");
            f = bundle.getBoolean("issoundenable");
            g = bundle.getBoolean("isvibrationenable");
            h = bundle.getInt("action");
            i = bundle.getString("param");
            j = bundle.getString("style");
            k = bundle.getString("url");
            l = bundle.getString("icon");
            return;
        }
    }

    public void b(int i1)
    {
        h = i1;
    }

    public void b(String s)
    {
        c = s;
    }

    public void b(boolean flag)
    {
        f = flag;
    }

    public Bundle c()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("id", a);
        bundle.putInt("type", b);
        bundle.putString("title", c);
        bundle.putString("content", d);
        bundle.putBoolean("isledenable", e);
        bundle.putBoolean("issoundenable", f);
        bundle.putBoolean("isvibrationenable", g);
        bundle.putInt("action", h);
        bundle.putString("param", i);
        bundle.putString("style", j);
        bundle.putString("url", k);
        bundle.putString("icon", l);
        return bundle;
    }

    public void c(String s)
    {
        d = s;
    }

    public void c(boolean flag)
    {
        g = flag;
    }

    public long d()
    {
        return a;
    }

    public void d(String s)
    {
        i = s;
    }

    public int e()
    {
        return b;
    }

    public void e(String s)
    {
        j = s;
    }

    public String f()
    {
        return c;
    }

    public void f(String s)
    {
        k = s;
    }

    public String g()
    {
        return d;
    }

    public boolean h()
    {
        return e;
    }

    public boolean i()
    {
        return f;
    }

    public boolean j()
    {
        return g;
    }

    public int k()
    {
        return h;
    }

    public String l()
    {
        return i;
    }

    public String m()
    {
        return j;
    }

    public String n()
    {
        return k;
    }

    public String o()
    {
        return l;
    }

    public String toString()
    {
        return (new StringBuilder("[MessageBean:id = ")).append(a).append(", type = ").append(b).append(", title =").append(c).append(", content = ").append(d).append(", isLedEnable =").append(e).append(", isSoundEnable = ").append(f).append(", isVibrationEnable = ").append(g).append(", action = ").append(h).append(", param = ").append(i).append(", style = ").append(j).append(", url = ").append(k).append(", icon = ").append(l).append("]").toString();
    }
}
