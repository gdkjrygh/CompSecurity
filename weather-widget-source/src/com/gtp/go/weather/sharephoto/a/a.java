// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.a;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.award.k;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.a:
//            b, f, c, d, 
//            e

public class a
{

    Handler a;
    private Context b;
    private boolean c;
    private d d;
    private e e;

    public a(Context context)
    {
        c = false;
        a = new b(this);
        b = context;
    }

    static Context a(a a1)
    {
        return a1.b;
    }

    private JSONObject a(int i, String s, Context context)
    {
        context = new JSONObject();
        try
        {
            f.a(context, "userId", s);
            f.a(context, "type", i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return context;
        }
        return context;
    }

    static JSONObject a(a a1, int i, String s, Context context)
    {
        return a1.a(i, s, context);
    }

    static boolean a(a a1, boolean flag)
    {
        a1.c = flag;
        return flag;
    }

    static d b(a a1)
    {
        return a1.d;
    }

    private void c()
    {
        k.a(b);
    }

    static void c(a a1)
    {
        a1.c();
    }

    private void d()
    {
        k.b(b);
    }

    static void d(a a1)
    {
        a1.d();
    }

    static e e(a a1)
    {
        return a1.e;
    }

    public void a()
    {
        if (!w.h(b))
        {
            a(false);
        }
    }

    public void a(d d1)
    {
        d = d1;
    }

    public void a(e e1)
    {
        e = e1;
    }

    public void a(boolean flag)
    {
        com.gtp.a.a.b.c.a("GOID", "registGOID");
        if (w.a())
        {
            return;
        } else
        {
            com.gtp.a.a.b.c.a("GOID", "SDCard is not exist");
            return;
        }
    }

    public void a(boolean flag, String s)
    {
        if (!TextUtils.isEmpty(s) && !c)
        {
            c = true;
            (new com.gtp.go.weather.sharephoto.a.c(this, flag, s, null)).execute(new Object[0]);
        }
    }

    public void b()
    {
        e = null;
    }
}
