// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;

public final class mu extends agd
    implements ServiceConnection
{

    mx a;
    private final Activity b;
    private Context c;
    private afw d;
    private mr e;
    private mv f;
    private na g;
    private nb h;
    private String i;

    public mu(Activity activity)
    {
        i = null;
        b = activity;
        a = mx.a(b.getApplicationContext());
    }

    private void a(String s, boolean flag, int j, Intent intent)
    {
        if (g != null)
        {
            g.a(s, flag, j, intent, f);
        }
    }

    public final void a()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.a(b.getIntent());
        g = ((GInAppPurchaseManagerInfoParcel) (obj)).e;
        h = ((GInAppPurchaseManagerInfoParcel) (obj)).b;
        d = ((GInAppPurchaseManagerInfoParcel) (obj)).c;
        e = new mr(b.getApplicationContext());
        c = ((GInAppPurchaseManagerInfoParcel) (obj)).d;
        if (b.getResources().getConfiguration().orientation == 2)
        {
            b.setRequestedOrientation(ot.g().a());
        } else
        {
            b.setRequestedOrientation(ot.g().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        b.bindService(((Intent) (obj)), this, 1);
    }

    public final void a(int j, int k, Intent intent)
    {
        if (j != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        ot.n();
        j = mz.a(intent);
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        ot.n();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (h.a(i, intent))
        {
            flag = true;
        }
_L3:
        d.b(j);
        b.finish();
        a(d.a(), flag, k, intent);
        i = null;
_L2:
        return;
        a.a(f);
          goto _L3
        intent;
        of.e("Fail to process purchase result.");
        b.finish();
        i = null;
        return;
        intent;
        i = null;
        throw intent;
    }

    public final void b()
    {
        b.unbindService(this);
        e.a();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        e.a(ibinder);
        i = nb.a();
        componentname = e.a(b.getPackageName(), d.a(), i);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                ot.n();
                int j = mz.a(componentname);
                d.b(j);
                a(d.a(), false, j, null);
                b.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_179;
        }
        f = new mv(d.a(), i);
        a.b(f);
        b.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        of.d("Error when connecting in-app billing service", componentname);
        b.finish();
        return;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        of.c("In-app billing service disconnected.");
        e.a();
    }
}
