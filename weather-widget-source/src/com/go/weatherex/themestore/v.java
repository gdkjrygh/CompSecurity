// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.gau.go.launcherex.gowidget.weather.view.as;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.g;

// Referenced classes of package com.go.weatherex.themestore:
//            ac, ab, w

public class v extends g
    implements android.support.v4.app.FragmentManager.OnBackStackChangedListener
{

    public v(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
        a().addOnBackStackChangedListener(this);
    }

    private int e()
    {
        return 0x7f090537;
    }

    public void a(as as)
    {
        ac.e().a(as);
        as = (a)Fragment.instantiate(a, com/go/weatherex/themestore/w.getName(), null);
        as.b(a);
        FragmentTransaction fragmenttransaction = a().beginTransaction();
        fragmenttransaction.add(e(), as, com/go/weatherex/themestore/w.getName());
        fragmenttransaction.commit();
    }

    protected void a(a a1, Class class1, Bundle bundle)
    {
    }

    protected void b(int i, Object obj)
    {
        super.b(i, obj);
    }

    public void b(as as)
    {
        ac.e().a(as);
    }

    public void d(Fragment fragment)
    {
        super.d(fragment);
    }

    protected boolean d()
    {
        return super.d();
    }

    public void onBackStackChanged()
    {
    }
}
