// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.response.LocationDescription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public final class evn
{

    private static final long c;
    final Map a = new HashMap();
    Handler b;
    private final hke d;
    private final ewg e;
    private final List f = new CopyOnWriteArrayList();

    public evn(hke hke1, ewg ewg1)
    {
        b = new Handler(Looper.getMainLooper());
        d = hke1;
        e = ewg1;
    }

    private boolean a()
    {
        return e.f();
    }

    public final void a(UberLatLng uberlatlng)
    {
        if (a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!a.containsKey(uberlatlng))
        {
            break; /* Loop/switch isn't completed */
        }
        uberlatlng = (LocationDescription)a.get(uberlatlng);
        Iterator iterator = f.iterator();
        while (iterator.hasNext()) 
        {
            evo evo1 = (evo)iterator.next();
            if (uberlatlng == null)
            {
                evo1.a();
            } else
            {
                evo1.a(uberlatlng);
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        a.put(uberlatlng, null);
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext(); ((evo)iterator1.next()).a()) { }
        d.a(uberlatlng.a(), uberlatlng.b(), cwt.b()).a(ico.a()).b(new ick(uberlatlng) {

            final UberLatLng a;
            final evn b;

            private void a(LocationDescription locationdescription)
            {
                b.a(locationdescription, a);
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((LocationDescription)obj);
            }

            public final void a(Throwable throwable)
            {
                b.c(a);
            }

            
            {
                b = evn.this;
                a = uberlatlng;
                super();
            }
        });
        return;
    }

    final void a(LocationDescription locationdescription, UberLatLng uberlatlng)
    {
        a.put(uberlatlng, locationdescription);
        for (uberlatlng = f.iterator(); uberlatlng.hasNext(); ((evo)uberlatlng.next()).a(locationdescription)) { }
    }

    public final void a(evo evo1)
    {
        f.add(evo1);
    }

    public final LocationDescription b(UberLatLng uberlatlng)
    {
        if (!a())
        {
            return null;
        } else
        {
            return (LocationDescription)a.get(uberlatlng);
        }
    }

    public final void b(evo evo1)
    {
        f.remove(evo1);
    }

    final void c(UberLatLng uberlatlng)
    {
        b.postDelayed(new Runnable(uberlatlng) {

            final UberLatLng a;
            final evn b;

            public final void run()
            {
                b.a.remove(a);
            }

            
            {
                b = evn.this;
                a = uberlatlng;
                super();
            }
        }, c);
        for (uberlatlng = f.iterator(); uberlatlng.hasNext(); ((evo)uberlatlng.next()).b()) { }
    }

    static 
    {
        c = TimeUnit.SECONDS.toMillis(30L);
    }
}
