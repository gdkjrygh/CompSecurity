// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.media.s;
import android.support.v7.media.u;
import android.support.v7.media.v;

// Referenced classes of package android.support.v7.app:
//            aa

public class MediaRouteDiscoveryFragment extends Fragment
{

    private final String a = "selector";
    private u b;
    private s c;
    private v d;

    public MediaRouteDiscoveryFragment()
    {
    }

    public final void d()
    {
        super.d();
        if (c == null)
        {
            Bundle bundle = h();
            if (bundle != null)
            {
                c = s.a(bundle.getBundle("selector"));
            }
            if (c == null)
            {
                c = s.a;
            }
        }
        if (b == null)
        {
            b = u.a(i());
        }
        d = new aa(this);
        if (d != null)
        {
            b.a(c, d, 4);
        }
    }

    public final void e()
    {
        if (d != null)
        {
            b.a(d);
            d = null;
        }
        super.e();
    }
}
