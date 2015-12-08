// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.util.Log;
import com.wf.wellsfargomobile.a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            k, LocationListActivity, ac, z, 
//            w

public class u extends Fragment
    implements Observer
{

    k a;
    LocationManager b;
    private LocationListActivity c;
    private CharSequence d[];
    private List e;
    private List f;
    private double g;
    private double h;
    private String i;

    public u()
    {
        e = new ArrayList(25);
        f = new ArrayList(25);
        i = "";
    }

    static double a(u u1, double d1)
    {
        u1.g = d1;
        return d1;
    }

    static LocationListActivity a(u u1)
    {
        return u1.c;
    }

    private StringBuffer a(double d1, double d2)
    {
        return (new StringBuffer(com.wf.wellsfargomobile.a.a.a())).append(getString(0x7f08015b)).append(d1).append("&lt=").append(d2).append("&WFAppId=").append(com.wf.wellsfargomobile.a.a.i()).append("&searchAtms=true").append("&searchBranches=false").append("&searchInStoreBranches=false").append("&format=xml");
    }

    static StringBuffer a(u u1, String s)
    {
        return u1.b(s);
    }

    static CharSequence[] a(u u1, CharSequence acharsequence[])
    {
        u1.d = acharsequence;
        return acharsequence;
    }

    static double b(u u1, double d1)
    {
        u1.h = d1;
        return d1;
    }

    private StringBuffer b(double d1, double d2)
    {
        return (new StringBuffer(com.wf.wellsfargomobile.a.a.a())).append(getString(0x7f08015b)).append(d1).append("&lt=").append(d2).append("&WFAppId=").append(com.wf.wellsfargomobile.a.a.i()).append("&searchAtms=false").append("&searchBranches=true").append("&searchInStoreBranches=true").append("&format=xml");
    }

    static StringBuffer b(u u1, String s)
    {
        return u1.c(s);
    }

    private StringBuffer b(String s)
    {
        return (new StringBuffer(com.wf.wellsfargomobile.a.a.a())).append(getString(0x7f08015a)).append(com.wf.wellsfargomobile.a.a.i()).append("&fullAddress=").append(URLEncoder.encode(s, "UTF-8")).append("&searchAtms=true").append("&searchBranches=false").append("&searchInStoreBranches=false").append("&format=xml");
    }

    static CharSequence[] b(u u1)
    {
        return u1.d;
    }

    static String c(u u1, String s)
    {
        u1.i = s;
        return s;
    }

    private StringBuffer c(String s)
    {
        return (new StringBuffer(com.wf.wellsfargomobile.a.a.a())).append(getString(0x7f08015a)).append(com.wf.wellsfargomobile.a.a.i()).append("&fullAddress=").append(URLEncoder.encode(s, "UTF-8")).append("&searchAtms=false").append("&searchBranches=true").append("&searchInStoreBranches=true").append("&format=xml");
    }

    static List c(u u1)
    {
        return u1.e;
    }

    static List d(u u1)
    {
        return u1.f;
    }

    public List a()
    {
        return e;
    }

    void a(Location location)
    {
        if (c != null && a.c(location))
        {
            if (c.g() != null)
            {
                c.g().a("", false);
                c.g().setIconified(true);
            }
            i = "";
            g = location.getLatitude();
            h = location.getLongitude();
            location = a(h, g);
            StringBuffer stringbuffer = b(h, g);
            if (a.a())
            {
                a.c();
            }
            (new ac(this, null)).b(new String[] {
                location.toString(), stringbuffer.toString()
            });
        }
    }

    void a(String s)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        i = s;
        if (c.g() != null)
        {
            c.g().a(s, false);
        }
        StringBuffer stringbuffer = b(s);
        s = c(s);
        c.g().clearFocus();
        (new ac(this, null)).b(new String[] {
            stringbuffer.toString(), s.toString()
        });
        return;
        s;
        c.a(getString(0x7f080092), getString(0x7f08008d));
        return;
    }

    public List b()
    {
        return f;
    }

    public double c()
    {
        return g;
    }

    public double d()
    {
        return h;
    }

    void e()
    {
        if (a.a())
        {
            Log.d("XMLParseTask", "Listener already running...lets not run it again.");
            return;
        }
        b = (LocationManager)c.getSystemService("location");
        Boolean boolean1 = Boolean.valueOf(b.isProviderEnabled("gps"));
        Boolean boolean2 = Boolean.valueOf(b.isProviderEnabled("network"));
        if (!boolean2.booleanValue() && !boolean1.booleanValue())
        {
            (new z()).show(getFragmentManager(), null);
            return;
        }
        if (boolean2.booleanValue() && !boolean1.booleanValue())
        {
            (new w()).show(getFragmentManager(), null);
        }
        a.b();
        a.addObserver(this);
    }

    void f()
    {
    }

    float g()
    {
        return 12F;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c = (LocationListActivity)activity;
        a = new k(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        e();
    }

    public void onDetach()
    {
        super.onDetach();
        if (a != null)
        {
            a.c();
        }
        c = null;
    }

    public void update(Observable observable, Object obj)
    {
        if (obj instanceof Location)
        {
            a((Location)obj);
        }
    }
}
