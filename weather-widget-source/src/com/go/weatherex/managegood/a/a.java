// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.managegood.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.gtp.a.a.b.c;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.go.weatherex.managegood.a:
//            b

public class a
{

    private Activity a;
    private ConcurrentLinkedQueue b;
    private volatile Intent c;
    private String d;
    private String e;
    private String f;
    private volatile boolean g;
    private b h;

    public a()
    {
        b = new ConcurrentLinkedQueue();
        c = null;
        g = false;
    }

    private void a()
    {
        com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", "getjar->ensureConnected");
        if (c != null)
        {
            a.startActivityForResult(c, 1);
        }
    }

    private void a(String s)
    {
        com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", (new StringBuilder()).append(s).append("-> ThreadId: ").append(Thread.currentThread().getId()).toString());
    }

    private void a(String s, String s1, String s2, int i)
    {
        if (h != null)
        {
            h.a(s, s1, s2, i);
        }
    }

    public void a(Activity activity)
    {
    }

    public void a(Activity activity, int i, int j, Intent intent)
    {
        com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", (new StringBuilder()).append("onActivityResult").append(i).append(", ").append(j).toString());
        i;
        JVM INSTR tableswitch 2 2: default 52
    //                   2 53;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j != -1)
        {
            if (j == 0)
            {
                com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", "REQUEST_CODE_PURCHASE: Purchase cancelled");
                g = false;
                a(f, d, e, j);
                return;
            } else
            {
                com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", (new StringBuilder()).append("REQUEST_CODE_PURCHASE: ").append(String.format(Locale.US, "Unknown result code [%1$d]", new Object[] {
                    Integer.valueOf(j)
                })).toString());
                g = false;
                a(f, d, e, j);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(Activity activity, Bundle bundle)
    {
        a("onActivityCreated");
        a = activity;
    }

    public void a(b b1)
    {
        h = b1;
    }

    public void a(String s, String s1, String s2)
    {
        com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", "getjar->startLicensePurchase");
        if (!g)
        {
            d = s1;
            e = s2;
            f = s;
            g = true;
            try
            {
                a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
                com.gtp.a.a.b.c.a("ManageGoodGetjarHelper", (new StringBuilder()).append("getjar->startLicensePurchase: ").append(s).toString());
                return;
            }
        }
    }

    public void b(Activity activity)
    {
    }

    public void c(Activity activity)
    {
    }

    public void d(Activity activity)
    {
    }
}
