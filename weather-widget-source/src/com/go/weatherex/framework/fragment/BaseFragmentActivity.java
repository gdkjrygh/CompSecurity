// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.gau.go.launcherex.gowidget.c.a;
import com.gau.go.launcherex.gowidget.c.c;
import com.gau.go.launcherex.gowidget.language.GoWeatherExFragmentActivity;
import com.go.weatherex.framework.b;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.framework.fragment:
//            d, e, g, a

public abstract class BaseFragmentActivity extends GoWeatherExFragmentActivity
    implements d
{

    private final a a = new c();
    private b b;
    private g c;

    public BaseFragmentActivity()
    {
    }

    public final g a()
    {
        return c;
    }

    protected g b()
    {
        return null;
    }

    protected b c()
    {
        return new e(this);
    }

    public final a d()
    {
        return a;
    }

    public final b e()
    {
        return b;
    }

    public final com.go.weatherex.framework.a.a f()
    {
        return this;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = c();
        c = b();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (b != null)
        {
            b.a();
        }
        if (c != null)
        {
            c.c();
        }
    }

    public void onLanguageChanged(Resources resources)
    {
        super.onLanguageChanged(resources);
        resources = getSupportFragmentManager().getFragments();
        if (resources != null)
        {
            resources = resources.iterator();
            do
            {
                if (!resources.hasNext())
                {
                    break;
                }
                Fragment fragment = (Fragment)resources.next();
                if (fragment instanceof com.go.weatherex.framework.fragment.a)
                {
                    ((com.go.weatherex.framework.fragment.a)fragment).f();
                }
            } while (true);
        }
    }
}
