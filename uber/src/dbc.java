// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Pair;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.City;
import com.ubercab.client.core.model.Ping;
import java.util.concurrent.TimeUnit;

public final class dbc extends gme
{

    dpg a;
    String b;
    private final Context c;
    private final LocationManager d;
    private Pair e;

    public dbc(cev cev1, Context context, hku hku1, LocationManager locationmanager)
    {
        c = context;
        d = locationmanager;
        b = null;
        e = d();
        hku1.b().c(new dbd(this, (byte)0));
        cev1.a(this);
    }

    static Context a(dbc dbc1)
    {
        return dbc1.c;
    }

    private void a(UberLatLng uberlatlng)
    {
        boolean flag;
        if (uberlatlng != null)
        {
            uberlatlng = new Pair(Double.valueOf(uberlatlng.a()), Double.valueOf(uberlatlng.b()));
        } else
        {
            uberlatlng = d();
        }
        if (uberlatlng != null && e == null || uberlatlng == null && e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = uberlatlng;
        if (flag)
        {
            b();
        }
    }

    static Pair b(dbc dbc1)
    {
        return dbc1.e;
    }

    private Pair c()
    {
        return e;
    }

    static void c(dbc dbc1)
    {
        dbc1.b();
    }

    private Pair d()
    {
        Location location = gnu.a(d, TimeUnit.DAYS.toMillis(1L));
        if (location != null)
        {
            return new Pair(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
        } else
        {
            return null;
        }
    }

    public final Object a()
    {
        return c();
    }

    public final void onDeviceLocationEvent(dap dap1)
    {
        a(dap1.a().getUberLatLng());
    }

    public final void onNoLocationEvent(ciz ciz)
    {
        a(((UberLatLng) (null)));
    }

    public final void onPingEvent(dar dar1)
    {
        if (a == null)
        {
            ((RiderApplication)c.getApplicationContext()).b().a(this);
        }
        if (!a.n())
        {
            if (dul.d(dar1 = dar1.a()))
            {
                dar1 = dar1.getCity().getCityName();
                if (b != null && !gjx.a(b, dar1) && e != null)
                {
                    b();
                }
                b = dar1;
                return;
            }
        }
    }
}
