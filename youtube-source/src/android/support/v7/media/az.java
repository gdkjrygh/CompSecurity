// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            ba, bb, as, bc

final class az
{

    private final Context a;
    private final bc b;
    private final Handler c = new Handler();
    private final PackageManager d;
    private final ArrayList e = new ArrayList();
    private boolean f;
    private final BroadcastReceiver g = new ba(this);
    private final Runnable h = new bb(this);

    public az(Context context, bc bc1)
    {
        a = context;
        b = bc1;
        d = context.getPackageManager();
    }

    private int a(String s, String s1)
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            if (((as)e.get(i)).a(s, s1))
            {
                return i;
            }
        }

        return -1;
    }

    static void a(az az1)
    {
        if (az1.f)
        {
            Object obj = new Intent("android.media.MediaRouteProviderService");
            obj = az1.d.queryIntentServices(((Intent) (obj)), 0).iterator();
            int i = 0;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = ((ResolveInfo)((Iterator) (obj)).next()).serviceInfo;
                if (obj1 != null)
                {
                    int l = az1.a(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name);
                    if (l < 0)
                    {
                        obj1 = new as(az1.a, new ComponentName(((ServiceInfo) (obj1)).packageName, ((ServiceInfo) (obj1)).name));
                        ((as) (obj1)).f();
                        az1.e.add(i, obj1);
                        az1.b.a(((f) (obj1)));
                        i++;
                    } else
                    if (l >= i)
                    {
                        Object obj2 = (as)az1.e.get(l);
                        ((as) (obj2)).f();
                        ((as) (obj2)).h();
                        obj2 = az1.e;
                        int j = i + 1;
                        Collections.swap(((List) (obj2)), l, i);
                        i = j;
                    }
                }
            } while (true);
            if (i < az1.e.size())
            {
                for (int k = az1.e.size() - 1; k >= i; k--)
                {
                    as as1 = (as)az1.e.get(k);
                    az1.b.b(as1);
                    az1.e.remove(as1);
                    as1.g();
                }

            }
        }
    }

    public final void a()
    {
        if (!f)
        {
            f = true;
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentfilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentfilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentfilter.addDataScheme("package");
            a.registerReceiver(g, intentfilter, null, c);
            c.post(h);
        }
    }
}
