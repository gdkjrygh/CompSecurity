// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.util.Log;
import com.wf.wellsfargomobile.util.u;
import java.util.Date;
import java.util.Observable;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            j, a, t, l

public class k extends Observable
    implements j
{

    private static final String a = com/wf/wellsfargomobile/locations/k.getSimpleName();
    private Location b;
    private LocationManager c;
    private t d;
    private a e;
    private final long f;
    private Handler g;
    private Runnable h;

    public k(Activity activity)
    {
        if (u.a(activity))
        {
            e = new a(activity, this);
            Log.d(a, "Yes play service is available");
        } else
        {
            c = (LocationManager)activity.getSystemService("location");
            d = new t(this);
            Log.d(a, "Oopps no play service");
        }
        f = 0L;
    }

    public k(Activity activity, long l1)
    {
        if (u.a(activity))
        {
            e = new a(activity, this);
            Log.d(a, "Yes play service is available");
        } else
        {
            c = (LocationManager)activity.getSystemService("location");
            d = new t(this);
            Log.d(a, "Oopps no play service");
        }
        f = l1;
    }

    static void a(k k1)
    {
        k1.f();
    }

    private void b(Location location, Location location1)
    {
        boolean flag4 = true;
        if (location1 != null || location != null)
        {
            if (location1 != null && location == null)
            {
                b(location1);
                return;
            }
            if (location1 == null && location != null)
            {
                b(location);
                return;
            }
            long l1 = (new Date()).getTime();
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (l1 - location1.getTime() <= 60000L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (location1.getAccuracy() <= 100F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (l1 - location.getTime() <= 60000L)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (location.getAccuracy() <= 100F)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (location1.getAccuracy() > location.getAccuracy())
            {
                flag4 = false;
            }
            if (flag4 && flag && flag1)
            {
                b(location1);
                return;
            }
            if (!flag4 && flag3 && flag2)
            {
                b(location);
                return;
            }
        }
    }

    private void d()
    {
        if (f > 0L)
        {
            if (g != null)
            {
                g.removeCallbacks(h);
                g = null;
            }
            g = new Handler();
            h = new l(this);
            g.postDelayed(h, f);
        }
    }

    private void d(Location location)
    {
        b(b, location);
    }

    private void e()
    {
        if (g != null)
        {
            g.removeCallbacks(h);
            g = null;
        }
    }

    private void f()
    {
        c();
        b = null;
        setChanged();
    }

    public void a(Location location)
    {
        d(location);
    }

    public void a(Location location, Location location1)
    {
        b(location, location1);
    }

    public boolean a()
    {
        if (e != null)
        {
            return e.a();
        } else
        {
            return d.a();
        }
    }

    public void b()
    {
        if (c == null)
        {
            e.c();
        } else
        {
            d.a(c);
        }
        d();
    }

    public void b(Location location)
    {
        this;
        JVM INSTR monitorenter ;
        e();
        b = location;
        setChanged();
        notifyObservers(location);
        this;
        JVM INSTR monitorexit ;
        return;
        location;
        throw location;
    }

    public void c()
    {
        e();
        if (c == null)
        {
            e.b();
            return;
        } else
        {
            d.b(c);
            return;
        }
    }

    public boolean c(Location location)
    {
        return location != null && location.hasAccuracy() && location.getAccuracy() <= 100F && (new Date()).getTime() - location.getTime() < 60000L;
    }

}
