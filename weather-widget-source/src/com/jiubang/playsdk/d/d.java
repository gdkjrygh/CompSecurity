// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.d:
//            c, e

public class d
{

    public List a;
    private long b;
    private String c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private List j;
    private int k;
    private String l;

    public d()
    {
        a = new ArrayList();
        j = new ArrayList();
    }

    public long a()
    {
        return b;
    }

    public void a(int i1)
    {
        g = i1;
    }

    public void a(String s)
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = 0;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = new JSONObject(s);
        b = s.optLong("typeid", 0L);
        c = s.optString("typename", "");
        d = s.optInt("hasnew", 0);
        e = s.optString("mark", "");
        f = s.optInt("pages", 0);
        g = s.optInt("pageid", 1);
        h = s.optInt("datatype", 0);
        k = s.optInt("feature", 0);
        i = s.optInt("viewtype", 0);
        l = s.optString("dependent_app", "");
        if (h != 1) goto _L4; else goto _L3
_L3:
        s = s.optJSONArray("typedata");
        if (s == null) goto _L2; else goto _L5
_L5:
        if (i1 >= s.length()) goto _L2; else goto _L6
_L6:
        JSONObject jsonobject = s.getJSONObject(i1);
        if (jsonobject == null) goto _L8; else goto _L7
_L7:
        c c1 = new c();
        c1.a(jsonobject.toString());
        a.add(c1);
          goto _L8
_L4:
        if (h != 2) goto _L2; else goto _L9
_L9:
        s = s.optJSONArray("appdata");
        if (s == null) goto _L2; else goto _L10
_L10:
        i1 = ((flag) ? 1 : 0);
_L12:
        if (i1 >= s.length()) goto _L2; else goto _L11
_L11:
        jsonobject = s.getJSONObject(i1);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        e e1 = new e();
        e1.a(b);
        e1.b(jsonobject.toString());
        j.add(e1);
        i1++;
          goto _L12
        s;
        s.printStackTrace();
_L2:
        return;
_L8:
        i1++;
        if (true) goto _L5; else goto _L13
_L13:
    }

    public boolean b()
    {
        return d == 1;
    }

    public List c()
    {
        return a;
    }

    public List d()
    {
        return j;
    }

    public boolean e()
    {
        return h == 1;
    }

    public int f()
    {
        return h;
    }

    public String g()
    {
        return e;
    }

    public String h()
    {
        return l;
    }

    public JSONObject i()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("typeid", b);
        jsonobject.put("typename", c);
        jsonobject.put("hasnew", d);
        jsonobject.put("mark", e);
        jsonobject.put("pages", f);
        jsonobject.put("pageid", g);
        jsonobject.put("datatype", h);
        jsonobject.put("feature", k);
        jsonobject.put("viewtype", i);
        jsonobject.put("dependent_app", l);
        if (h != 1) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = new JSONArray();
        int i1 = 0;
_L4:
        Object obj;
        if (i1 < a.size())
        {
            obj = (c)a.get(i1);
            break MISSING_BLOCK_LABEL_166;
        }
        jsonobject.put("typedata", jsonarray);
        return jsonobject;
_L2:
        if (h != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonarray = new JSONArray();
        i1 = 0;
_L5:
        if (i1 >= j.size())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj = (e)j.get(i1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        jsonarray.put(((e) (obj)).g());
        break MISSING_BLOCK_LABEL_284;
        jsonobject.put("appdata", jsonarray);
        return jsonobject;
        if (obj != null)
        {
            try
            {
                jsonarray.put(((c) (obj)).b());
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
                return jsonobject;
            }
        }
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        return jsonobject;
        i1++;
          goto _L5
    }
}
