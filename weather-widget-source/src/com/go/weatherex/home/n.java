// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import com.gau.go.launcherex.gowidget.weather.view.bd;
import com.go.weatherex.framework.fragment.g;
import com.go.weatherex.g.s;
import com.go.weatherex.home.current.w;
import com.go.weatherex.sidebar.a;
import com.go.weatherex.sidebar.b;
import com.go.weatherex.sidebar.i;
import com.go.weatherex.viewex.d;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

// Referenced classes of package com.go.weatherex.home:
//            z, c

public class n extends g
    implements android.support.v4.app.FragmentManager.OnBackStackChangedListener, a
{

    private final Stack b = new Stack();
    private final Map c = new HashMap();
    private int d;
    private final List e = new ArrayList();

    public n(FragmentActivity fragmentactivity)
    {
        super(fragmentactivity);
        d = 0;
        a().addOnBackStackChangedListener(this);
        a(new int[] {
            4, 5
        });
    }

    private boolean a(String s1)
    {
        boolean flag = false;
        if (!b.isEmpty())
        {
            flag = ((String)b.peek()).equals(s1);
        }
        return flag;
    }

    private void i()
    {
        if (b.isEmpty())
        {
            a(18, com/go/weatherex/home/current/w.getName());
            return;
        } else
        {
            a(18, b.peek());
            return;
        }
    }

    private void j()
    {
        com.gtp.a.a.b.c.a("HomeFragmentManager", (new StringBuilder()).append("onBackStackIncrease: ").append(e).toString());
        b.push(e.remove(0));
    }

    private void k()
    {
        if (a(com/go/weatherex/home/dayforecast/g.getName()) || a(com/go/weatherex/home/hourforecast/c.getName()) || a(com/go/weatherex/home/windforecast/c.getName()) || a(com/go/weatherex/home/rain/g.getName()) || a(com/go/weatherex/home/c/a.getName()))
        {
            Fragment fragment = a().findFragmentByTag(com/go/weatherex/home/z.getName());
            a().beginTransaction().hide(fragment).commit();
            a(11, Boolean.valueOf(true));
            a(13, Boolean.valueOf(false));
            a(17, Boolean.valueOf(true));
        }
        b.pop();
        if (m())
        {
            a(13, Boolean.valueOf(false));
        }
    }

    private Fragment l()
    {
        return a().findFragmentByTag(com/go/weatherex/sidebar/i.getName()).getChildFragmentManager().findFragmentByTag(com/go/weatherex/home/c.getName());
    }

    private boolean m()
    {
        return a().getBackStackEntryCount() == 0 && b.isEmpty();
    }

    private int n()
    {
        int j1 = a().getBackStackEntryCount();
        Fragment fragment = l();
        int i1 = j1;
        if (fragment != null)
        {
            i1 = j1 + fragment.getChildFragmentManager().getBackStackEntryCount();
        }
        return i1;
    }

    public void a(float f)
    {
    }

    public void a(bd bd1)
    {
        com.go.weatherex.home.a.a a1 = new com.go.weatherex.home.a.a();
        a1.b(a);
        a1.setArguments(com.go.weatherex.home.a.a.a(bd1.a, bd1.b));
        z z1 = new z();
        z1.b(a);
        i i1 = new i();
        i1.b(a);
        i1.setArguments(com.go.weatherex.sidebar.i.a(bd1.a, bd1.e));
        bd1 = a().beginTransaction();
        bd1.add(0x1020002, a1, com/go/weatherex/home/a/a.getName());
        bd1.add(0x1020002, z1, com/go/weatherex/home/z.getName());
        bd1.add(0x1020002, i1, com/go/weatherex/sidebar/i.getName());
        bd1.hide(z1);
        bd1.commit();
    }

    protected void a(com.go.weatherex.framework.fragment.a a1, Class class1, Bundle bundle)
    {
        com.gtp.a.a.b.c.a("HomeFragmentManager", class1.getName());
        if (!e.contains(class1.getName()))
        {
            if (com/go/weatherex/home/c.equals(class1))
            {
                a1 = a().findFragmentByTag(com/go/weatherex/sidebar/i.getName()).getChildFragmentManager();
                com.go.weatherex.framework.fragment.a a2 = (com.go.weatherex.framework.fragment.a)a1.findFragmentByTag(class1.getName());
                if (a2 == null)
                {
                    bundle = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), bundle);
                    bundle.b(a);
                    a1.beginTransaction().add(0x7f09038a, bundle, class1.getName()).commit();
                    return;
                } else
                {
                    a(a2, bundle);
                    a(7, Boolean.valueOf(true));
                    return;
                }
            }
            if (com/go/weatherex/sidebar/b.equals(class1))
            {
                a1 = a().findFragmentByTag(com/go/weatherex/sidebar/i.getName()).getChildFragmentManager();
                com.go.weatherex.framework.fragment.a a3 = (com.go.weatherex.framework.fragment.a)a1.findFragmentByTag(class1.getName());
                if (a3 == null)
                {
                    bundle = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), bundle);
                    bundle.b(a);
                    a1.beginTransaction().add(0x7f09038a, bundle, class1.getName()).commit();
                    return;
                } else
                {
                    a(a3, bundle);
                    a(8, Boolean.valueOf(true));
                    return;
                }
            }
            if (com/go/weatherex/home/current/w.equals(class1))
            {
                Object obj = l().getChildFragmentManager();
                a1 = ((FragmentManager) (obj)).beginTransaction();
                obj = (com.go.weatherex.framework.fragment.a)((FragmentManager) (obj)).findFragmentByTag(class1.getName());
                if (obj == null)
                {
                    bundle = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), bundle);
                    bundle.b(a);
                    a1.add(0x7f0903ad, bundle, class1.getName());
                } else
                {
                    a(((com.go.weatherex.framework.fragment.a) (obj)), bundle);
                    a1.show(((Fragment) (obj)));
                }
                a1.commit();
                a(13, Boolean.valueOf(false));
                return;
            }
            if (com/go/weatherex/home/hourforecast/c.equals(class1) || com/go/weatherex/home/dayforecast/g.equals(class1) || com/go/weatherex/home/windforecast/c.equals(class1) || com/go/weatherex/home/rain/g.equals(class1) || com/go/weatherex/home/c/a.equals(class1))
            {
                if (!e.contains(com/go/weatherex/home/dayforecast/g.getName()) && !e.contains(com/go/weatherex/home/hourforecast/c.getName()) && !e.contains(com/go/weatherex/home/windforecast/c.getName()) && !e.contains(com/go/weatherex/home/rain/g.getName()) && !e.contains(com/go/weatherex/home/c/a.getName()) && !a(com/go/weatherex/home/dayforecast/g.getName()) && !a(com/go/weatherex/home/hourforecast/c.getName()) && !a(com/go/weatherex/home/windforecast/c.getName()) && !a(com/go/weatherex/home/rain/g.getName()))
                {
                    a1 = bundle;
                    if (bundle == null)
                    {
                        a1 = new Bundle();
                    }
                    bundle = (Integer)c.get(class1.getName());
                    Object obj1;
                    Object obj2;
                    int i1;
                    boolean flag;
                    if (bundle != null)
                    {
                        i1 = bundle.intValue();
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.putBoolean("extra_key_is_first_open_page", flag);
                    c.put(class1.getName(), Integer.valueOf(i1 + 1));
                    bundle = a().findFragmentByTag(com/go/weatherex/home/z.getName());
                    a().beginTransaction().show(bundle).commit();
                    obj1 = l().getChildFragmentManager();
                    bundle = ((FragmentManager) (obj1)).beginTransaction();
                    bundle.setCustomAnimations(0x7f04000c, 0x7f04000d, 0x7f04000c, 0x7f04000d);
                    bundle.hide(((FragmentManager) (obj1)).findFragmentByTag(com/go/weatherex/home/current/w.getName()));
                    obj1 = (com.go.weatherex.framework.fragment.a)((FragmentManager) (obj1)).findFragmentByTag(class1.getName());
                    if (obj1 == null)
                    {
                        a1 = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), a1);
                        a1.b(a);
                        bundle.add(0x7f0903ad, a1, class1.getName());
                        bundle.addToBackStack(class1.getName());
                        e.add(class1.getName());
                    } else
                    {
                        a(((com.go.weatherex.framework.fragment.a) (obj1)), ((Bundle) (a1)));
                        bundle.show(((Fragment) (obj1)));
                    }
                    bundle.commit();
                    a(11, Boolean.valueOf(false));
                    a(13, Boolean.valueOf(true));
                    a(17, Boolean.valueOf(false));
                    return;
                }
            }
            while (false) 
            {
                if (com/go/weatherex/g/g.equals(class1))
                {
                    flag = m();
                    obj2 = a();
                    a1 = ((FragmentManager) (obj2)).findFragmentByTag(com/go/weatherex/sidebar/i.getName());
                    obj1 = (com.go.weatherex.framework.fragment.a)((FragmentManager) (obj2)).findFragmentByTag(class1.getName());
                    obj2 = ((FragmentManager) (obj2)).beginTransaction();
                    if (com/go/weatherex/g/g.equals(class1))
                    {
                        ((FragmentTransaction) (obj2)).setCustomAnimations(0x7f04000b, 0x7f04000d, 0x7f04000b, 0x7f04000d);
                    } else
                    {
                        ((FragmentTransaction) (obj2)).setCustomAnimations(0x7f04000c, 0x7f04000d, 0x7f04000c, 0x7f04000d);
                    }
                    ((FragmentTransaction) (obj2)).hide(a1);
                    if (obj1 == null)
                    {
                        a1 = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), bundle);
                        a1.b(a);
                        ((FragmentTransaction) (obj2)).add(0x1020002, a1, class1.getName());
                        ((FragmentTransaction) (obj2)).addToBackStack(class1.getName());
                        e.add(class1.getName());
                    } else
                    {
                        a(((com.go.weatherex.framework.fragment.a) (obj1)), bundle);
                        ((FragmentTransaction) (obj2)).show(((Fragment) (obj1)));
                    }
                    ((FragmentTransaction) (obj2)).commit();
                    if (flag)
                    {
                        a(13, Boolean.valueOf(true));
                        return;
                    }
                    continue;
                }
                if (com/go/weatherex/g/a.equals(class1) || com/go/weatherex/g/s.equals(class1))
                {
                    obj1 = a().findFragmentByTag(com/go/weatherex/g/g.getName()).getChildFragmentManager();
                    a1 = ((FragmentManager) (obj1)).beginTransaction();
                    obj1 = (com.go.weatherex.framework.fragment.a)((FragmentManager) (obj1)).findFragmentByTag(class1.getName());
                    if (obj1 == null)
                    {
                        bundle = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), bundle);
                        bundle.b(a);
                        a1.add(0x7f0902b8, bundle, class1.getName());
                    } else
                    {
                        a(((com.go.weatherex.framework.fragment.a) (obj1)), bundle);
                        a1.show(((Fragment) (obj1)));
                    }
                    a1.commit();
                    return;
                }
                flag = m();
                obj2 = a();
                obj1 = (com.go.weatherex.framework.fragment.a)((FragmentManager) (obj2)).findFragmentByTag(class1.getName());
                obj2 = ((FragmentManager) (obj2)).beginTransaction();
                ((FragmentTransaction) (obj2)).setCustomAnimations(0x7f04000c, 0x7f04000d, 0x7f04000c, 0x7f04000d);
                ((FragmentTransaction) (obj2)).hide(a1);
                if (obj1 == null)
                {
                    a1 = (com.go.weatherex.framework.fragment.a)Fragment.instantiate(a, class1.getName(), bundle);
                    a1.b(a);
                    ((FragmentTransaction) (obj2)).add(0x1020002, a1, class1.getName());
                    ((FragmentTransaction) (obj2)).addToBackStack(class1.getName());
                    e.add(class1.getName());
                } else
                {
                    a(((com.go.weatherex.framework.fragment.a) (obj1)), bundle);
                    ((FragmentTransaction) (obj2)).show(((Fragment) (obj1)));
                }
                ((FragmentTransaction) (obj2)).commit();
                if (flag)
                {
                    a(13, Boolean.valueOf(true));
                    return;
                }
            }
        }
    }

    public void a(boolean flag)
    {
    }

    protected boolean a(com.go.weatherex.framework.fragment.a a1)
    {
        return super.a(a1);
    }

    protected void b(int i1, Object obj)
    {
        super.b(i1, obj);
        switch (i1)
        {
        default:
            return;

        case 4: // '\004'
            f_();
            return;

        case 5: // '\005'
            g_();
            break;
        }
    }

    public void b(bd bd1)
    {
        if (!TextUtils.isEmpty(bd1.a))
        {
            a(10, bd1.a);
            a(12, bd1.a);
        }
    }

    protected void b(com.go.weatherex.framework.fragment.a a1)
    {
        if (a1 instanceof com.go.weatherex.home.c)
        {
            a1.getChildFragmentManager().popBackStackImmediate();
            return;
        } else
        {
            super.b(a1);
            return;
        }
    }

    public void d(Fragment fragment)
    {
        super.d(fragment);
        if (fragment instanceof com.go.weatherex.home.c)
        {
            ((i)a().findFragmentByTag(com/go/weatherex/sidebar/i.getName())).b((d)fragment.getView().findViewById(0x7f0903a9));
            fragment.getChildFragmentManager().addOnBackStackChangedListener(this);
        } else
        if (fragment instanceof b)
        {
            ((i)a().findFragmentByTag(com/go/weatherex/sidebar/i.getName())).a((d)fragment.getView().findViewById(0x7f09037e));
            return;
        }
    }

    protected boolean d()
    {
        if (m())
        {
            return false;
        }
        if (a(com/go/weatherex/sidebar/b.getName()))
        {
            a(7, Boolean.valueOf(true));
            return true;
        } else
        {
            return super.d();
        }
    }

    public void d_()
    {
    }

    public void e_()
    {
    }

    public void f_()
    {
        b.push(com/go/weatherex/sidebar/b.getName());
        i();
    }

    public void g(Fragment fragment)
    {
        super.g(fragment);
    }

    public void g_()
    {
        b.pop();
        i();
    }

    public void onBackStackChanged()
    {
        int i1 = n();
        if (d > i1)
        {
            k();
        } else
        {
            j();
        }
        d = i1;
        i();
    }
}
