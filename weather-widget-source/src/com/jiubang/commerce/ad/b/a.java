// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.a.a.e;
import com.jiubang.commerce.ad.e.q;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.h.d;
import com.jiubang.commerce.database.b.c;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b:
//            c, e, d, b

public class a
{

    public static void a(Context context, int i, int k, e e1)
    {
        try
        {
            e1 = new com.gau.a.a.d.a(c.a(), e1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("requestOnlineAdInfo(error, ");
            if (e1 != null)
            {
                e1 = e1.getMessage();
            } else
            {
                e1 = "==";
            }
            j.d("Ad_SDK", stringbuilder.append(e1).append(")").toString());
            e1 = null;
        }
        if (e1 != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("phead", p.d(c.a(context, i, k)));
            Map map = com.jiubang.commerce.ad.b.c.c();
            hashmap.put("prodKey", map.get("prodKey"));
            hashmap.put("accessKey", map.get("accessKey"));
            hashmap.put("handle", "0");
            hashmap.put("shandle", "1");
            e1.a(hashmap);
            e1.d(1);
            e1.b(15000);
            e1.c(10);
            e1.a(new com.jiubang.commerce.ad.b.e(false));
            d.a(context).a(e1, false);
        } else
        if (j.a)
        {
            j.a("Ad_SDK", "requestOnlineAdInfo(error, httpRequest is null)");
            return;
        }
    }

    public static void a(Context context, int i, int k, boolean flag, String s, Integer integer, e e1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new d(Integer.valueOf(i), Integer.valueOf(k)));
        a(context, ((List) (arraylist)), "", flag, s, integer, e1);
    }

    public static void a(Context context, int i, e e1)
    {
        try
        {
            e1 = new com.gau.a.a.d.a("http://adviap.goforandroid.com/adv_iap/smartload", e1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("requestIntelligentAdInfo(error, ");
            if (e1 != null)
            {
                e1 = e1.getMessage();
            } else
            {
                e1 = "==";
            }
            j.d("Ad_SDK", stringbuilder.append(e1).append(")").toString());
            e1 = null;
        }
        if (e1 != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("phead", p.d(c.a(context, i)));
            Map map = com.jiubang.commerce.ad.b.c.c();
            hashmap.put("prodKey", map.get("prodKey"));
            hashmap.put("accessKey", map.get("accessKey"));
            hashmap.put("handle", "0");
            hashmap.put("shandle", "1");
            e1.a(hashmap);
            e1.d(1);
            e1.b(15000);
            e1.c(10);
            e1.a(new com.jiubang.commerce.ad.b.e(false));
            d.a(context).a(e1, true);
        } else
        if (j.a)
        {
            j.d("Ad_SDK", "requestIntelligentAdInfo(error, httpRequest is null)");
            return;
        }
    }

    static void a(Context context, int i, String s, JSONObject jsonobject, boolean flag, e e1)
    {
        b(context, i, s, jsonobject, flag, e1);
    }

    public static void a(Context context, e e1)
    {
        try
        {
            e1 = new com.gau.a.a.d.a(com.jiubang.commerce.ad.b.c.b(), e1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("requestUserTagInfo(error, ");
            if (e1 != null)
            {
                e1 = e1.getMessage();
            } else
            {
                e1 = "==";
            }
            j.d("Ad_SDK", stringbuilder.append(e1).append(")").toString());
            e1 = null;
        }
        if (e1 != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("phead", p.d(c.a(context, 0, 0)));
            Map map = com.jiubang.commerce.ad.b.c.c();
            hashmap.put("prodKey", map.get("prodKey"));
            hashmap.put("accessKey", map.get("accessKey"));
            hashmap.put("handle", "0");
            hashmap.put("shandle", "1");
            e1.a(hashmap);
            e1.d(1);
            e1.b(15000);
            e1.c(10);
            e1.a(new com.jiubang.commerce.ad.b.e(false));
            d.a(context).a(e1, false);
        } else
        if (j.a)
        {
            j.a("Ad_SDK", "requestUserTagInfo(error, httpRequest is null)");
            return;
        }
    }

    private static void a(Context context, String s)
    {
        context = context.getSharedPreferences("sp_admodule_unreachable", 0).edit();
        context.putLong(s, System.currentTimeMillis());
        context.commit();
    }

    public static void a(Context context, List list, String s, boolean flag, String s1, Integer integer, e e1)
    {
        JSONObject jsonobject;
        int i;
        int k;
        k = 0;
        jsonobject = new JSONObject();
        i = k;
        jsonobject.put("phead", c.a(context, s1, integer));
        i = k;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        i = k;
        jsonobject.put("pkgnames", s);
_L6:
        i = k;
        k = ((d)list.get(0)).a().intValue();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        i = k;
        s = c.a(context).a(String.valueOf(k), 30);
_L10:
        i = k;
        jsonobject.put("filterpkgnames", s);
        i = k;
        s = new JSONArray();
        i = k;
        list = list.iterator();
_L4:
        i = k;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        i = k;
        s1 = (d)list.next();
        i = k;
        int l = s1.a().intValue();
        i = k;
        integer = new JSONObject();
        i = k;
        integer.put("moduleId", l);
        i = k;
        integer.put("pageid", s1.b().intValue());
        i = k;
        integer.put("showquantity", q.a(context).a(l));
        i = k;
        s.put(integer);
        if (true) goto _L4; else goto _L3
        list;
        list.printStackTrace();
_L9:
        t.a().a(context, new com.jiubang.commerce.ad.b.b(jsonobject, context, i, e1));
        return;
_L2:
        i = k;
        s1 = com.jiubang.commerce.utils.b.c(context);
        i = k;
        jsonobject.put("pkgnames", s1);
        i = k;
        if (!j.a) goto _L6; else goto _L5
_L5:
        i = k;
        integer = list.iterator();
        s = "";
_L8:
        i = k;
        if (!integer.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        i = k;
        d d1 = (d)integer.next();
        i = k;
        s = (new StringBuilder()).append(s).append(d1.a()).append(",").toString();
        if (true) goto _L8; else goto _L7
_L7:
        i = k;
        j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(s).append("]upload pkgs(").append(s1).append(")").toString());
          goto _L6
_L3:
        i = k;
        jsonobject.put("reqs", s);
        i = k;
          goto _L9
        s = "";
          goto _L10
    }

    public static boolean a(Context context, int i)
    {
        boolean flag1 = true;
        boolean flag = true;
        Object obj = context.getSharedPreferences("sp_admodule_unreachable", 0);
        context = String.valueOf(i);
        if (((SharedPreferences) (obj)).contains(context))
        {
            long l = ((SharedPreferences) (obj)).getLong(context, 0L);
            if (System.currentTimeMillis() - l <= 0x5265c00L)
            {
                flag = false;
            }
            flag1 = flag;
            if (flag)
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).remove(context);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                flag1 = flag;
            }
        }
        return flag1;
    }

    public static boolean a(Context context, int i, JSONObject jsonobject)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        String s;
        return true;
_L2:
        if (jsonobject.getJSONObject(s = String.valueOf(i)).getInt("mstatus") != 0) goto _L1; else goto _L3
_L3:
        a(context, s);
        return false;
        context;
        context.printStackTrace();
        return true;
    }

    private static void b(Context context, int i, String s, JSONObject jsonobject, boolean flag, e e1)
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]requestData(start, ").append(s).append(", ").append(jsonobject).append(")").toString());
        }
        HashMap hashmap;
        try
        {
            e1 = new com.gau.a.a.d.a(s, e1);
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("[vmId:").append(i).append("]requestData(error, ");
            if (e1 != null)
            {
                e1 = e1.getMessage();
            } else
            {
                e1 = "==";
            }
            j.d("Ad_SDK", stringbuilder.append(e1).append(")").toString());
            e1 = null;
        }
        if (e1 == null) goto _L2; else goto _L1
_L1:
        hashmap = new HashMap();
        hashmap.put("handle", "0");
        hashmap.put("data", p.d(jsonobject));
        hashmap.put("shandle", "1");
        e1.a(hashmap);
        e1.d(1);
        e1.b(10000);
        e1.c(10);
        e1.a(new com.jiubang.commerce.ad.b.e());
        d.a(context).a(e1, flag);
_L4:
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]requestData(end, ").append(s).append(")").toString());
        }
        return;
_L2:
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]requestData(error, httpRequest is null)").toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
