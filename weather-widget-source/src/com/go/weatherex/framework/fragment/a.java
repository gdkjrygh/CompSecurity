// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.framework.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.View;
import com.go.weatherex.framework.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.go.weatherex.framework.fragment:
//            f, d, g, c

public class a extends Fragment
    implements com.go.weatherex.framework.a.a
{

    private c a;
    private d b;
    private boolean c;
    private final f d = new f(this);

    public a()
    {
    }

    private com.gau.go.launcherex.gowidget.c.a a(boolean flag)
    {
        if (b == null)
        {
            throw new IllegalStateException("do you forget to call onNew(Activity)");
        }
        com.gau.go.launcherex.gowidget.c.a a1 = b.d();
        if (a1 == null && flag)
        {
            throw new IllegalStateException("need to implements getCellBroadcastCenter in activity");
        } else
        {
            return a1;
        }
    }

    private void a(Activity activity)
    {
        if (b != null)
        {
            return;
        }
        if (activity == null)
        {
            throw new IllegalStateException("fragment has not yet associate to activity");
        }
        if (activity instanceof d)
        {
            b = (d)activity;
            return;
        } else
        {
            throw new IllegalStateException("the attach activity of this fragment should implements FragmentFunctionExtended to make some features available");
        }
    }

    private g b(boolean flag)
    {
        if (b == null)
        {
            throw new IllegalStateException("do you forget to call onNew(Activity)");
        }
        g g1 = b.a();
        if (g1 == null && flag)
        {
            throw new IllegalStateException("need to implements getGwFragmentManager in activity");
        } else
        {
            return g1;
        }
    }

    private b c(boolean flag)
    {
        if (b == null)
        {
            throw new IllegalStateException("do you forget to call onNew(Activity)");
        }
        b b1 = b.e();
        if (b1 == null && flag)
        {
            throw new IllegalStateException("need to implements getWeatherChangeMonitor in activity");
        } else
        {
            return b1;
        }
    }

    private com.go.weatherex.framework.a.a d(boolean flag)
    {
        if (b == null)
        {
            throw new IllegalStateException("do you forget to call onNew(Activity)");
        }
        com.go.weatherex.framework.a.a a1 = b.f();
        if (a1 == null && flag)
        {
            throw new IllegalStateException("need to implements getFontManager in activity");
        } else
        {
            return a1;
        }
    }

    public Typeface a(Context context, int j, int k)
    {
        return d(true).a(context, j, k);
    }

    public final void a(int j, Object obj)
    {
        a(true).a(j, obj);
    }

    public final void a(int j, Object obj, long l, boolean flag)
    {
        a(true).a(j, obj, l, flag);
    }

    protected void a(Bundle bundle)
    {
    }

    public void a(View view)
    {
        a(view, 2, true);
    }

    public void a(View view, int j, int k)
    {
        d(true).a(view, j, k);
    }

    public void a(View view, int j, boolean flag)
    {
        d(true).a(view, j, flag);
    }

    public final void a(com.go.weatherex.framework.a a1)
    {
        c(true).a(a1);
    }

    public final void a(Class class1, Bundle bundle)
    {
        b(true).a(this, class1, bundle);
    }

    public final transient void a(int ai[])
    {
        com.gau.go.launcherex.gowidget.c.a a1 = a(true);
        if (a == null)
        {
            a = new c(this, null);
        }
        a1.a(a, ai);
    }

    protected boolean a()
    {
        FragmentManager fragmentmanager = getChildFragmentManager();
        if (fragmentmanager != null && isResumed() && isVisible() && fragmentmanager.getBackStackEntryCount() > 0)
        {
            return fragmentmanager.popBackStackImmediate();
        } else
        {
            return false;
        }
    }

    protected void b(int j, Object obj)
    {
    }

    public void b(Activity activity)
    {
        a(activity);
    }

    public final void b(com.go.weatherex.framework.a a1)
    {
        c(true).b(a1);
    }

    public final View c(int j)
    {
        return getView().findViewById(j);
    }

    boolean e()
    {
        return c;
    }

    protected void f()
    {
        Object obj = getChildFragmentManager().getFragments();
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Fragment fragment = (Fragment)((Iterator) (obj)).next();
                if (fragment instanceof a)
                {
                    ((a)fragment).f();
                }
            } while (true);
        }
    }

    protected boolean g()
    {
        c = false;
        Object obj = getChildFragmentManager();
        if (obj != null && ((FragmentManager) (obj)).getFragments() != null)
        {
            obj = new ArrayList(((FragmentManager) (obj)).getFragments());
            if (((List) (obj)).size() > 0)
            {
                for (int j = ((List) (obj)).size() - 1; j >= 0; j--)
                {
                    Fragment fragment = (Fragment)((List) (obj)).get(j);
                    if (fragment == null || !fragment.isVisible() || !(fragment instanceof a))
                    {
                        continue;
                    }
                    if (((a)fragment).g())
                    {
                        return true;
                    }
                    if (((a)fragment).e())
                    {
                        c = true;
                        return false;
                    }
                }

            }
        }
        obj = b(false);
        if (obj != null && ((g) (obj)).a(this))
        {
            c = true;
            return false;
        } else
        {
            return a();
        }
    }

    public void h()
    {
        if (isAdded() && isResumed())
        {
            b(true).b(this);
        }
    }

    public f i()
    {
        return d;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = b(false);
        if (bundle != null)
        {
            bundle.e(this);
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a(activity);
        activity = b(false);
        if (activity != null)
        {
            activity.b(this);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = b(false);
        if (bundle != null)
        {
            bundle.c(this);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        g g1 = b(false);
        if (g1 != null)
        {
            g1.j(this);
        }
    }

    public void onDetach()
    {
        super.onDetach();
        Object obj = b(false);
        if (obj != null)
        {
            ((g) (obj)).k(this);
        }
        obj = a(false);
        if (obj != null && a != null)
        {
            ((com.gau.go.launcherex.gowidget.c.a) (obj)).a(a);
            a = null;
        }
        b = null;
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        g g1 = b(false);
        if (g1 != null)
        {
            g1.l(this);
        }
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        a(activity);
        activity = b(false);
        if (activity != null)
        {
            activity.a(this);
        }
    }

    public void onPause()
    {
        super.onPause();
        g g1 = b(false);
        if (g1 != null)
        {
            g1.h(this);
        }
    }

    public void onResume()
    {
        super.onResume();
        g g1 = b(false);
        if (g1 != null)
        {
            g1.g(this);
        }
    }

    public void onStart()
    {
        super.onStart();
        g g1 = b(false);
        if (g1 != null)
        {
            g1.f(this);
        }
    }

    public void onStop()
    {
        super.onStop();
        g g1 = b(false);
        if (g1 != null)
        {
            g1.i(this);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        bundle = b(false);
        if (bundle != null)
        {
            bundle.d(this);
        }
        a(view);
    }
}
