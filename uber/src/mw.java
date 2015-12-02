// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class mw extends agj
    implements ServiceConnection
{

    mr a;
    private boolean b;
    private Context c;
    private int d;
    private Intent e;
    private mv f;
    private String g;

    public mw(Context context, String s, boolean flag, int i, Intent intent, mv mv)
    {
        b = false;
        g = s;
        d = i;
        e = intent;
        b = flag;
        c = context;
        f = mv;
    }

    public final boolean a()
    {
        return b;
    }

    public final String b()
    {
        return g;
    }

    public final Intent c()
    {
        return e;
    }

    public final int d()
    {
        return d;
    }

    public final void e()
    {
        ot.n();
        int i = mz.a(e);
        if (d != -1 || i != 0)
        {
            return;
        } else
        {
            a = new mr(c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            xc.a().a(c, intent, this, 1);
            return;
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        of.c("In-app billing service connected.");
        a.a(ibinder);
        ot.n();
        componentname = mz.b(e);
        ot.n();
        componentname = mz.b(componentname);
        if (componentname == null)
        {
            return;
        }
        if (a.a(c.getPackageName(), componentname) == 0)
        {
            mx.a(c).a(f);
        }
        xc.a().a(c, this);
        a.a();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        of.c("In-app billing service disconnected.");
        a.a();
    }
}
