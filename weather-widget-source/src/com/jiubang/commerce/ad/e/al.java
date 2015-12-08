// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.c;
import com.jiubang.commerce.utils.f;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            am, ao

public class al
{

    private static final String a;
    private static al b;
    private boolean c;
    private long d;
    private boolean e;

    private al(Context context)
    {
        e = false;
    }

    public static al a(Context context)
    {
        com/jiubang/commerce/ad/e/al;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new al(context);
        }
        context = b;
        com/jiubang/commerce/ad/e/al;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private JSONObject a(long l)
    {
        JSONObject jsonobject = new JSONObject();
        if (!b(l))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        jsonobject.put("user_time", l);
        jsonobject.put("new_user", false);
        return jsonobject;
        try
        {
            jsonobject.put("user_time", l);
            jsonobject.put("new_user", true);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    private void a()
    {
        d = System.currentTimeMillis();
        c = b();
        e = true;
    }

    private void a(JSONObject jsonobject)
    {
        if (jsonobject != null && !TextUtils.isEmpty(jsonobject.toString()))
        {
            f.a(jsonobject.toString(), a);
        }
    }

    static boolean a(al al1)
    {
        return al1.e;
    }

    static boolean a(al al1, long l)
    {
        return al1.c(l);
    }

    static boolean a(al al1, boolean flag)
    {
        al1.c = flag;
        return flag;
    }

    static void b(al al1)
    {
        al1.a();
    }

    private boolean b()
    {
        JSONObject jsonobject = c();
        if (jsonobject != null)
        {
            boolean flag1 = jsonobject.optBoolean("new_user");
            long l = jsonobject.optLong("user_time", System.currentTimeMillis());
            boolean flag = flag1;
            if (flag1)
            {
                a(a(l));
                flag = flag1;
                if (b(l))
                {
                    flag = false;
                }
            }
            return flag;
        } else
        {
            a(a(System.currentTimeMillis()));
            return true;
        }
    }

    private boolean b(long l)
    {
        return System.currentTimeMillis() - l > 0xf731400L;
    }

    private JSONObject c()
    {
        Object obj = f.b(a);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = new JSONObject(((String) (obj)));
        return ((JSONObject) (obj));
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
        return null;
    }

    private boolean c(long l)
    {
        return System.currentTimeMillis() - l > 0x5265c00L;
    }

    static boolean c(al al1)
    {
        return al1.c;
    }

    static long d(al al1)
    {
        return al1.d;
    }

    static boolean e(al al1)
    {
        return al1.b();
    }

    public void a(ao ao)
    {
        if (ao == null)
        {
            return;
        } else
        {
            (new Thread(new am(this, ao))).start();
            return;
        }
    }

    static 
    {
        a = (new StringBuilder()).append(c.a).append("user").toString();
    }
}
