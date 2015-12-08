// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.gau.go.launcherex.gowidget.c.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.framework.fragment:
//            d, a, i

public abstract class g
{

    protected FragmentActivity a;
    private i b;

    public g(FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
    }

    private a a(boolean flag)
    {
        if (a instanceof d)
        {
            a a1 = ((d)a).d();
            if (a1 == null && flag)
            {
                throw new IllegalStateException("need to implements getCellBroadcastCenter in activity");
            } else
            {
                return a1;
            }
        } else
        {
            throw new IllegalStateException("the fragment activity should implements FragmentFunctionExtended to make some features available");
        }
    }

    protected FragmentManager a()
    {
        return a.getSupportFragmentManager();
    }

    public final void a(int i1, Object obj)
    {
        a(true).a(i1, obj);
    }

    public void a(Fragment fragment)
    {
    }

    protected final void a(com.go.weatherex.framework.fragment.a a1, Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            a1.a(bundle);
            return;
        }
    }

    protected abstract void a(com.go.weatherex.framework.fragment.a a1, Class class1, Bundle bundle);

    public final transient void a(int ai[])
    {
        a a1 = a(true);
        if (b == null)
        {
            b = new i(this, null);
        }
        a1.a(b, ai);
    }

    protected boolean a(com.go.weatherex.framework.fragment.a a1)
    {
        return false;
    }

    protected void b(int i1, Object obj)
    {
    }

    public void b(Fragment fragment)
    {
    }

    protected void b(com.go.weatherex.framework.fragment.a a1)
    {
        if (!a().popBackStackImmediate())
        {
            a.finish();
        }
    }

    public boolean b()
    {
        Object obj = a();
        if (obj == null || ((FragmentManager) (obj)).getFragments() == null) goto _L2; else goto _L1
_L1:
        obj = new ArrayList(((FragmentManager) (obj)).getFragments());
        if (((List) (obj)).size() <= 0) goto _L2; else goto _L3
_L3:
        int i1 = ((List) (obj)).size() - 1;
_L8:
        if (i1 < 0) goto _L2; else goto _L4
_L4:
        Fragment fragment = (Fragment)((List) (obj)).get(i1);
        if (fragment == null || !fragment.isVisible() || !(fragment instanceof com.go.weatherex.framework.fragment.a)) goto _L6; else goto _L5
_L5:
        if (((com.go.weatherex.framework.fragment.a)fragment).g())
        {
            return true;
        }
        if (!((com.go.weatherex.framework.fragment.a)fragment).e()) goto _L6; else goto _L2
_L2:
        return d();
_L6:
        i1--;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void c()
    {
        a a1 = a(false);
        if (a1 != null && b != null)
        {
            a1.a(b);
            b = null;
        }
    }

    public void c(Fragment fragment)
    {
    }

    public void d(Fragment fragment)
    {
    }

    protected boolean d()
    {
        return false;
    }

    public void e(Fragment fragment)
    {
    }

    public void f(Fragment fragment)
    {
    }

    public void g(Fragment fragment)
    {
    }

    public void h(Fragment fragment)
    {
    }

    public void i(Fragment fragment)
    {
    }

    public void j(Fragment fragment)
    {
    }

    public void k(Fragment fragment)
    {
    }

    public void l(Fragment fragment)
    {
    }
}
