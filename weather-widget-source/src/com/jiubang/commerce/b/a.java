// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.go.a.a.b;
import com.gau.go.a.e;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.jiubang.commerce.b:
//            f

public abstract class a
{

    protected static Map a = null;
    protected static Map b = null;
    private static SharedPreferences c;

    public static SharedPreferences a(Context context)
    {
        com/jiubang/commerce/b/a;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = context.getSharedPreferences("ad_sdk_statistic", 0);
        }
        context = c;
        com/jiubang/commerce/b/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static Map a(Context context, String s)
    {
        Object obj;
        obj = null;
        a(context);
        if (c == null) goto _L2; else goto _L1
_L1:
        context = c.getString((new StringBuilder()).append("ACTIVATE#105").append(s).toString(), "");
        if (TextUtils.isEmpty(context)) goto _L2; else goto _L3
_L3:
        context = context.split("#");
_L5:
        s = obj;
        if (context != null)
        {
            s = obj;
            if (context.length > 0)
            {
                s = new HashMap();
                a(((Map) (s)), ((String []) (context)));
            }
        }
        return s;
_L2:
        context = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected static transient void a(Context context, int i, int k, StringBuffer stringbuffer, Object aobj[])
    {
        if (j.a)
        {
            e.a(context).a(true);
        }
        j.a("AbsBaseStatistic", (new StringBuilder()).append("uploadStatisticData(").append(p.d(stringbuffer)).append(")").toString());
        if (a(k))
        {
            e.a(context).a(i, k, p.d(stringbuffer), null, new b[] {
                new b(3, Boolean.valueOf(true))
            });
            return;
        }
        if (aobj.length > 0)
        {
            e.a(context).a(i, k, p.d(stringbuffer), null, new b[] {
                new b(0, (Boolean)aobj[0])
            });
            return;
        } else
        {
            e.a(context).a(i, k, p.d(stringbuffer), null);
            return;
        }
    }

    public static void a(Context context, int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10)
    {
        if (!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s1))
        {
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append(i).append("#");
            stringbuffer.append(s).append("#");
            stringbuffer.append(s1).append("#");
            stringbuffer.append(s2).append("#");
            stringbuffer.append(s3).append("#");
            stringbuffer.append(s4).append("#");
            stringbuffer.append(s5).append("#");
            stringbuffer.append(s6).append("#");
            stringbuffer.append(s7).append("#");
            stringbuffer.append(s8).append("#");
            stringbuffer.append(System.currentTimeMillis()).append("#");
            stringbuffer.append(s10);
            a(context);
            if (c != null)
            {
                context = c.edit();
                context.putString((new StringBuilder()).append("INSTALL#").append(s9).append(s1).toString(), stringbuffer.toString());
                context.commit();
                return;
            }
        }
    }

    private static void a(Map map, String as[])
    {
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        ((Map) (obj)).put(Integer.valueOf(0), p.d(as[0]));
        ((Map) (obj)).put(Integer.valueOf(1), as[1]);
        if (as.length > 2)
        {
            map = as[2];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(2), map);
        if (as.length > 3)
        {
            map = as[3];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(3), map);
        if (as.length > 4)
        {
            map = as[4];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(4), map);
        if (as.length > 5)
        {
            map = as[5];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(5), map);
        if (as.length > 6)
        {
            map = as[6];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(6), map);
        if (as.length > 7)
        {
            map = as[7];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(7), map);
        if (as.length > 8)
        {
            map = as[8];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(8), map);
        if (as.length > 9)
        {
            map = as[9];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(9), map);
        if (as.length > 10)
        {
            map = as[10];
        } else
        {
            map = "0";
        }
        ((Map) (obj)).put(Integer.valueOf(10), map);
        if (as.length > 11)
        {
            map = as[11];
        } else
        {
            map = "";
        }
        ((Map) (obj)).put(Integer.valueOf(11), map);
    }

    private static boolean a(int i)
    {
        return i == f.c;
    }

    public static String[] a(Context context, String s, String s1)
    {
        Object obj = null;
        a(context);
        context = obj;
        if (c != null)
        {
            String s2 = c.getString((new StringBuilder()).append("INSTALL#").append(s1).append(s).toString(), "");
            context = obj;
            if (!TextUtils.isEmpty(s2))
            {
                context = s2.split("#");
                android.content.SharedPreferences.Editor editor = c.edit();
                editor.putString((new StringBuilder()).append("INSTALL#").append(s1).append(s).toString(), "");
                editor.commit();
            }
        }
        return context;
    }

    public static boolean b(Context context, String s, String s1)
    {
        boolean flag = true;
        com/jiubang/commerce/b/a;
        JVM INSTR monitorenter ;
        s = a(context, s, s1);
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length <= 1) goto _L2; else goto _L3
_L3:
        if (a == null)
        {
            a = new HashMap();
        }
        a.clear();
        a.put(Integer.valueOf(0), p.d(s[0]));
        a.put(Integer.valueOf(1), s[1]);
        s1 = a;
        if (s.length > 2)
        {
            context = s[2];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(2), context);
        s1 = a;
        if (s.length > 3)
        {
            context = s[3];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(3), context);
        s1 = a;
        if (s.length > 4)
        {
            context = s[4];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(4), context);
        s1 = a;
        if (s.length > 5)
        {
            context = s[5];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(5), context);
        s1 = a;
        if (s.length > 6)
        {
            context = s[6];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(6), context);
        s1 = a;
        if (s.length > 7)
        {
            context = s[7];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(7), context);
        s1 = a;
        if (s.length > 8)
        {
            context = s[8];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(8), context);
        s1 = a;
        if (s.length > 9)
        {
            context = s[9];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(9), context);
        s1 = a;
        if (s.length > 10)
        {
            context = s[10];
        } else
        {
            context = "0";
        }
        s1.put(Integer.valueOf(10), context);
        s1 = a;
        if (s.length > 11)
        {
            context = s[11];
        } else
        {
            context = "";
        }
        s1.put(Integer.valueOf(11), context);
_L5:
        com/jiubang/commerce/b/a;
        JVM INSTR monitorexit ;
        return flag;
        context;
        throw context;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
