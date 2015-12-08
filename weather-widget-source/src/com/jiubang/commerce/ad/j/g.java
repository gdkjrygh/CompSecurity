// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.jiubang.commerce.service.AdService;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.q;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            h, k, i, l, 
//            j

public class g
{

    private static g h;
    public boolean a;
    public boolean b;
    private k c;
    private android.view.WindowManager.LayoutParams d;
    private WindowManager e;
    private Activity f;
    private boolean g;
    private Handler i;

    private g()
    {
        i = new h(this);
    }

    public static g a()
    {
        com/jiubang/commerce/ad/j/g;
        JVM INSTR monitorenter ;
        g g1;
        if (h == null)
        {
            h = new g();
        }
        g1 = h;
        com/jiubang/commerce/ad/j/g;
        JVM INSTR monitorexit ;
        return g1;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(g g1, Context context)
    {
        g1.h(context);
    }

    static boolean a(g g1)
    {
        return g1.g;
    }

    static WindowManager b(g g1)
    {
        return g1.e;
    }

    static android.view.WindowManager.LayoutParams c(g g1)
    {
        return g1.d;
    }

    static k d(g g1)
    {
        return g1.c;
    }

    private WindowManager g(Context context)
    {
        if (e == null)
        {
            e = (WindowManager)context.getSystemService("window");
        }
        return e;
    }

    private void h(Context context)
    {
        g = false;
        Object obj;
        if (b() != null)
        {
            obj = b().getClass();
        } else
        {
            obj = null;
        }
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("hideFloatWindow to Activity::->").append(obj).toString());
        }
        b(context);
        if (obj != null && context != null)
        {
            obj = new Intent(context, ((Class) (obj)));
            ((Intent) (obj)).putExtra("entrance_id", 16);
            ((Intent) (obj)).setFlags(0x10200000);
            context.startActivity(((Intent) (obj)));
        }
    }

    public void a(Context context)
    {
        if (context != null)
        {
            WindowManager windowmanager = g(context);
            int i1 = windowmanager.getDefaultDisplay().getWidth();
            int j1 = windowmanager.getDefaultDisplay().getHeight();
            if (c == null)
            {
                c = new k(this, context);
                if (d == null)
                {
                    d = new android.view.WindowManager.LayoutParams();
                    d.type = 2003;
                    d.format = 1;
                    d.flags = 40;
                    d.gravity = 51;
                    d.width = c.a;
                    d.height = c.b;
                    d.x = i1;
                    d.y = j1 / 2 - d.height / 2;
                }
                windowmanager.addView(c, d);
                a = true;
                c.setOnClickListener(new i(this, context));
                return;
            }
        }
    }

    public Activity b()
    {
        return f;
    }

    public void b(Context context)
    {
        a = false;
        if (c != null)
        {
            g(context).removeView(c);
            c = null;
            d = null;
            c(((Context) (null)));
        }
        if (!q.e)
        {
            Intent intent = new Intent(context, com/jiubang/commerce/service/AdService);
            Bundle bundle = new Bundle();
            bundle.putInt("AD_SERVICES_REQUEST", 17);
            intent.putExtras(bundle);
            context.startService(intent);
        }
    }

    public void c()
    {
        if (d != null && d.x < e.getDefaultDisplay().getWidth())
        {
            (new l(this)).execute(new Void[0]);
        }
    }

    public void c(Context context)
    {
        if (context != null && (context instanceof Activity))
        {
            f = (Activity)context;
            return;
        } else
        {
            f = null;
            return;
        }
    }

    public void d()
    {
        g = false;
    }

    public void d(Context context)
    {
        (new com.jiubang.commerce.ad.j.j(this, context, i)).start();
    }

    public boolean e(Context context)
    {
        if (context != null)
        {
            boolean flag = com.jiubang.commerce.utils.b.e(context, "com.android.vending");
            if (q.e)
            {
                context = com.jiubang.commerce.utils.b.a(context);
                if (flag && "com.android.vending".equals(context))
                {
                    return true;
                }
            } else
            {
                return flag;
            }
        }
        return false;
    }

    public void f(Context context)
    {
        g = true;
        Message message = new Message();
        message.what = 1;
        message.obj = context;
        i.sendMessageDelayed(message, 1000L);
    }
}
