// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.e;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.b.a:
//            f, h

public class i
{

    private int a;
    private List b;
    private long c;
    private String d;

    public i()
    {
    }

    public static com.jiubang.commerce.ad.a.b a(Context context, f f1, int k, int l, boolean flag, List list, JSONObject jsonobject)
    {
        int j1;
        Object obj;
        i i1;
        String s;
        Iterator iterator;
        h h1;
        if (f1 != null)
        {
            j1 = f1.d();
        } else
        {
            j1 = 0;
        }
        i1 = a(context, k, j1, jsonobject);
        if (i1 != null)
        {
            jsonobject = i1.c();
        } else
        {
            jsonobject = null;
        }
        if (jsonobject == null || jsonobject.isEmpty()) goto _L2; else goto _L1
_L1:
label0:
        {
            s = i1.b();
            if (j.a)
            {
                if (f1 != null)
                {
                    j1 = f1.a();
                } else
                {
                    j1 = -1;
                }
                j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(j1).append("]getOnlineAdInfoList(adPos::->").append(k).append(", hasShowAdUrls::->").append(s).append(")").toString());
            }
            iterator = jsonobject.iterator();
            jsonobject = null;
            do
            {
                do
                {
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        h1 = (h)iterator.next();
                    } while (h1 == null || flag && !TextUtils.isEmpty(s) && s.indexOf((new StringBuilder()).append("||").append(h1.e()).append("||").toString()) >= 0 || (list == null || !list.contains(h1.c())) && com.jiubang.commerce.utils.b.a(context, h1.c()));
                    obj = jsonobject;
                    if (jsonobject == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(h1);
                    jsonobject = ((JSONObject) (obj));
                } while (l <= 0);
                jsonobject = ((JSONObject) (obj));
            } while (((List) (obj)).size() < l);
            jsonobject = ((JSONObject) (obj));
        }
_L4:
        if (jsonobject != null && !jsonobject.isEmpty())
        {
            obj = new com.jiubang.commerce.ad.a.b();
            ((com.jiubang.commerce.ad.a.b) (obj)).a(context, f1, i1, jsonobject, list);
            context = ((Context) (obj));
            if (j.a)
            {
                f1 = jsonobject.iterator();
                do
                {
                    context = ((Context) (obj));
                    if (!f1.hasNext())
                    {
                        break;
                    }
                    context = (h)f1.next();
                    if (context != null)
                    {
                        j.a("Ad_SDK", (new StringBuilder()).append("return online ad info::>(count:").append(jsonobject.size()).append("--").append(l).append(", VirtualModuleId:").append(context.r()).append(", ModuleId:").append(context.a()).append(", MapId:").append(context.d()).append(", packageName:").append(context.c()).append(", Name:").append(context.i()).append(", AdPos:").append(context.b()).append(")").toString());
                    }
                } while (true);
            }
        } else
        {
            context = null;
        }
        return context;
_L2:
        jsonobject = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static i a(Context context, int k, int l, JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() < 1 || !jsonobject.has(String.valueOf(k)))
        {
            return null;
        }
        i i1 = new i();
        i1.a = k;
        try
        {
            i1.b = h.a(context, jsonobject.getJSONArray(String.valueOf(k)), -1, -1, k, l);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        if (jsonobject.has("saveDataTime"))
        {
            i1.c = jsonobject.optLong("saveDataTime", 0L);
        }
        if (jsonobject.has("hasShowAdUrlList"))
        {
            i1.d = jsonobject.optString("hasShowAdUrlList", "");
        }
        return i1;
    }

    public static String a(int k)
    {
        return (new StringBuilder()).append("online_ad_").append(k).toString();
    }

    public static boolean a(int k, JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() < 1)
        {
            return false;
        }
        boolean flag;
        if (!jsonobject.has("saveDataTime"))
        {
            try
            {
                jsonobject.put("saveDataTime", System.currentTimeMillis());
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        try
        {
            flag = e.a(a(k), p.d(jsonobject), true);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return false;
        }
        return flag;
    }

    public static boolean a(long l)
    {
        return l <= 0L || l > System.currentTimeMillis() - 0x36ee80L;
    }

    public long a()
    {
        return c;
    }

    public String b()
    {
        return d;
    }

    public List c()
    {
        return b;
    }
}
