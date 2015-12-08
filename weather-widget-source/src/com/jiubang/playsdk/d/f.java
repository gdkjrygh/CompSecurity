// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.text.TextUtils;
import com.jiubang.playsdk.a.w;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.f.c;
import com.jiubang.playsdk.f.d;
import com.jiubang.playsdk.main.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.playsdk.d:
//            g, d, c, h, 
//            j, i, e

public class f
{

    public static g a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = s.split("_")) != null && s.length == 4)
            {
                return new g(Long.parseLong(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]));
            }
        }
        return null;
    }

    public static String a(long l, int k, int i1, int j1)
    {
        d.a("KtpDataLoader", "getClassificationRequestJSON begin >>>>");
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        if (y.a().c(b(l, k, i1, j1)))
        {
            com.jiubang.playsdk.d.d d1 = y.a().a(b(l, k, i1, j1));
            if (d1 != null)
            {
                Object obj = d1;
                if (l == 0L)
                {
                    obj = d1;
                    if (d1.c().size() != 0)
                    {
                        arraylist.add(0, Long.valueOf(0L));
                        arraylist2.add(0, d1.g());
                        arraylist1.add(0, Integer.valueOf(0));
                        obj = (com.jiubang.playsdk.d.c)d1.c().get(0);
                        obj = y.a().a(b(((com.jiubang.playsdk.d.c) (obj)).a(), k, i1, j1));
                    }
                }
                if (obj != null)
                {
                    arraylist.add(0, Long.valueOf(((com.jiubang.playsdk.d.d) (obj)).a()));
                    arraylist2.add(0, ((com.jiubang.playsdk.d.d) (obj)).g());
                    arraylist1.add(0, Integer.valueOf(0));
                    if (((com.jiubang.playsdk.d.d) (obj)).f() == 1)
                    {
                        obj = ((com.jiubang.playsdk.d.d) (obj)).c();
                        if (obj != null && ((List) (obj)).size() > 0)
                        {
                            int k1 = 0;
                            while (k1 < ((List) (obj)).size()) 
                            {
                                com.jiubang.playsdk.d.c c1 = (com.jiubang.playsdk.d.c)((List) (obj)).get(k1);
                                if (c1 != null)
                                {
                                    com.jiubang.playsdk.d.d d2 = y.a().a(b(c1.a(), 1, i1, j1));
                                    if (d2 != null)
                                    {
                                        arraylist.add(Long.valueOf(d2.a()));
                                        arraylist2.add(d2.g());
                                        arraylist1.add(Integer.valueOf(0));
                                    } else
                                    {
                                        arraylist.add(Long.valueOf(c1.a()));
                                        arraylist2.add("");
                                        arraylist1.add(Integer.valueOf(1));
                                    }
                                }
                                k1++;
                            }
                        }
                    }
                }
            }
        }
        if (arraylist.size() <= 0)
        {
            arraylist.add(Long.valueOf(l));
            arraylist2.add("");
            arraylist1.add(Integer.valueOf(1));
        }
        String s = a(((List) (arraylist1)), ((List) (arraylist2)), ((List) (arraylist)), i1, k, j1, 0).toString();
        d.a("KtpDataLoader", "getClassificationRequestJSON end >>>>");
        return s;
    }

    public static String a(h h1)
    {
        return a(h1.a(), h1.b(), h1.c(), h1.d());
    }

    public static Map a(String s, long l, int k, int i1, int j1)
    {
        HashMap hashmap;
        JSONObject jsonobject;
        d.a("KtpDataLoader", "parseClassificationResultJSON begin >>>>");
        hashmap = new HashMap();
        JSONObject jsonobject1;
        j j2;
        try
        {
            jsonobject = new JSONObject(s);
            jsonobject1 = jsonobject.optJSONObject("result");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new w(s);
        }
        if (jsonobject1 == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        j2 = new j();
        j2.a(jsonobject1.toString());
        if (j2.a() != 1)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        jsonobject = jsonobject.optJSONObject("types");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (jsonobject.length() != 0)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (d.a())
        {
            c.a(s.getBytes(), (new StringBuilder()).append(b.b).append("/exception.txt").toString());
        }
        throw new w("type\u5B57\u6BB5\u4E3A\u7A7A");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        Iterator iterator = jsonobject.keys();
_L1:
        com.jiubang.playsdk.d.d d1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_266;
        }
        s = (String)iterator.next();
        JSONObject jsonobject2 = jsonobject.getJSONObject(s);
        d1 = new com.jiubang.playsdk.d.d();
        d1.a(jsonobject2.toString());
        d1.a(k);
        if (d1.b() || j1 == 0)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        s = b(l, k, i1, j1);
_L2:
        hashmap.put(s, d1);
          goto _L1
        s = b(Integer.parseInt(s), k, i1, j1);
          goto _L2
        d.a("KtpDataLoader", "parseClassificationResultJSON edn <<<<<<");
        return hashmap;
          goto _L1
    }

    public static JSONObject a(String s, int k, int l)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("packname", s);
            jsonobject.put("extra", k);
            jsonobject.put("phead", i.a(y.a().d(), "6.3", l, 0, y.a().b(y.a().d())));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    private static JSONObject a(List list, List list1, List list2, int k, int l, int i1, int j1)
    {
        JSONObject jsonobject = new JSONObject();
        if (list == null || list1 == null || list2 == null)
        {
            return jsonobject;
        }
        JSONArray jsonarray;
        JSONObject jsonobject1;
        int k1;
        int l1;
        try
        {
            l1 = list2.size();
            jsonarray = new JSONArray();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
            return jsonobject;
        }
        k1 = 0;
        if (k1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = new JSONObject();
        jsonobject1.put("typeid", list2.get(k1));
        jsonobject1.put("itp", i1);
        jsonobject1.put("must", list.get(k1));
        jsonobject1.put("mark", list1.get(k1));
        jsonobject1.put("pageid", l);
        jsonobject1.put("access", k);
        jsonarray.put(jsonobject1);
        k1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_44;
_L1:
        jsonobject.put("phead", i.a(y.a().d(), "6.3", y.a().e(), j1, y.a().b(y.a().d())));
        jsonobject.put("reqs", jsonarray);
        return jsonobject;
    }

    public static com.jiubang.playsdk.a.a.c b(String s)
    {
        com.jiubang.playsdk.a.a.c c1;
        c1 = new com.jiubang.playsdk.a.a.c();
        JSONObject jsonobject;
        j j1;
        try
        {
            jsonobject = new JSONObject(s);
            s = jsonobject.optJSONObject("result");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new w(s);
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        j1 = new j();
        j1.a(s.toString());
        if (j1.a() != 1) goto _L2; else goto _L3
_L3:
        s = jsonobject.optJSONArray("apps");
        c1.b = jsonobject.optInt("type");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        throw new w("appinfo\u5B57\u6BB5\u4E3A\u7A7A");
        ArrayList arraylist = new ArrayList();
        int k = 0;
_L9:
        if (k >= s.length()) goto _L5; else goto _L4
_L4:
        JSONObject jsonobject1 = s.getJSONObject(k);
        if (jsonobject1 == null) goto _L7; else goto _L6
_L6:
        e e1 = new e();
        e1.b(jsonobject1.toString());
        arraylist.add(e1);
          goto _L7
_L5:
        c1.a = arraylist;
_L2:
        return c1;
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static String b(long l, int k, int i1, int j1)
    {
        return (new StringBuilder()).append(l).append("_").append(k).append("_").append(i1).append("_").append(j1).toString();
    }
}
