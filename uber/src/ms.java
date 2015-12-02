// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ms extends aiw
    implements ServiceConnection
{

    private final Object a;
    private boolean b;
    private Context c;
    private agl d;
    private mr e;
    private mx f;
    private List g;
    private nb h;

    public ms(Context context, agl agl, nb nb)
    {
        this(context, agl, nb, new mr(context), mx.a(context.getApplicationContext()));
    }

    private ms(Context context, agl agl, nb nb, mr mr1, mx mx1)
    {
        a = new Object();
        b = false;
        g = null;
        c = context;
        d = agl;
        h = nb;
        e = mr1;
        f = mx1;
        g = f.a();
    }

    static nb a(ms ms1)
    {
        return ms1.h;
    }

    private void a(long l)
    {
        do
        {
            if (!b(l))
            {
                of.d("Timeout waiting for pending transaction to be processed.");
            }
        } while (!b);
    }

    private void a(mv mv1, String s, String s1)
    {
        Intent intent = new Intent();
        ot.n();
        intent.putExtra("RESPONSE_CODE", 0);
        ot.n();
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        ot.n();
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        ajc.a.post(new _cls1(mv1, intent));
    }

    static Context b(ms ms1)
    {
        return ms1.c;
    }

    private boolean b(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            a.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            of.e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    static agl c(ms ms1)
    {
        return ms1.d;
    }

    private void c()
    {
        if (!g.isEmpty())
        {
            HashMap hashmap = new HashMap();
            mv mv1;
            for (Iterator iterator = g.iterator(); iterator.hasNext(); hashmap.put(mv1.c, mv1))
            {
                mv1 = (mv)iterator.next();
            }

            Object obj = null;
            do
            {
                obj = e.b(c.getPackageName(), ((String) (obj)));
                if (obj == null)
                {
                    break;
                }
                ot.n();
                if (mz.a(((Bundle) (obj))) != 0)
                {
                    break;
                }
                ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < arraylist.size(); i++)
                {
                    if (!hashmap.containsKey(arraylist.get(i)))
                    {
                        continue;
                    }
                    String s1 = (String)arraylist.get(i);
                    String s2 = (String)arraylist1.get(i);
                    String s3 = (String)arraylist2.get(i);
                    mv mv2 = (mv)hashmap.get(s1);
                    ot.n();
                    String s4 = mz.a(s2);
                    if (mv2.b.equals(s4))
                    {
                        a(mv2, s2, s3);
                        hashmap.remove(s1);
                    }
                }

            } while (obj != null && !hashmap.isEmpty());
            obj = hashmap.keySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s = (String)((Iterator) (obj)).next();
                f.a((mv)hashmap.get(s));
            }
        }
    }

    public final void a()
    {
        synchronized (a)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            xc.a().a(c, intent, this, 1);
            a(SystemClock.elapsedRealtime());
            xc.a().a(c, this);
            e.a();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (a)
        {
            xc.a().a(c, this);
            e.a();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (a)
        {
            e.a(ibinder);
            c();
            b = true;
            a.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        of.c("In-app billing service disconnected.");
        e.a();
    }

    /* member class not found */
    class _cls1 {}

}
