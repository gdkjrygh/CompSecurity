// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class czb extends gkw
    implements czh
{

    public static final cic a = new cic() {

        public final String name()
        {
            return "";
        }

    };
    Collection b;
    private final Set c = new HashSet();
    private czh d;
    private czj e;

    public czb()
    {
    }

    private static Collection b()
    {
        return Collections.emptySet();
    }

    public abstract czj a(dfp dfp);

    public abstract void a(czj czj);

    public final void a(String s, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        RiderActivity rideractivity = d();
        if (rideractivity != null)
        {
            rideractivity.a(s, oncancellistener);
        }
    }

    public final void a(String s, android.content.DialogInterface.OnDismissListener ondismisslistener)
    {
        RiderActivity rideractivity = d();
        if (rideractivity != null)
        {
            rideractivity.a(s, ondismisslistener);
        }
    }

    public final void b(String s)
    {
        RiderActivity rideractivity = d();
        if (rideractivity != null)
        {
            rideractivity.b(s, null);
        }
    }

    public final czj c()
    {
        return a(((RiderApplication)getActivity().getApplication()).b());
    }

    public final void c(String s)
    {
        RiderActivity rideractivity = d();
        if (rideractivity != null && !TextUtils.isEmpty(s))
        {
            rideractivity.a_(s);
        }
    }

    public final RiderActivity d()
    {
        return (RiderActivity)getActivity();
    }

    public final void e()
    {
        RiderActivity rideractivity = d();
        if (rideractivity != null)
        {
            rideractivity.u();
        }
    }

    public abstract cic f();

    public void onCreate(Bundle bundle)
    {
        if (d == null)
        {
            e = a(((RiderApplication)getActivity().getApplication()).b());
            a(e);
        } else
        {
            e = d.c();
            d.a(e);
        }
        super.onCreate(bundle);
        c.addAll(b);
        c.addAll(b());
    }

    public void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onPause()
    {
        super.onPause();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((czw)iterator.next()).b()) { }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        super.onRequestPermissionsResult(i, as, ai);
    }

    public void onResume()
    {
        super.onResume();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((czw)iterator.next()).a()) { }
    }

}
