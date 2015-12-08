// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TextView;
import com.google.android.gms.maps.j;
import java.util.HashMap;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            q, m, r, p, 
//            n, c, LocationListActivity

public class LocationTabListFragment extends Fragment
    implements android.widget.TabHost.OnTabChangeListener
{

    private TabHost a;
    private HashMap b;
    private q c;
    private View d;

    public LocationTabListFragment()
    {
        b = new HashMap();
        c = null;
    }

    private void a(Bundle bundle)
    {
        a = (TabHost)d.findViewById(0x1020012);
        a.setup();
        Object obj = LayoutInflater.from(getActivity()).inflate(0x7f04005a, a.getTabWidget(), false);
        ((TextView)((View) (obj)).findViewById(0x1020016)).setText(getResources().getString(0x7f080038));
        TabHost tabhost = a;
        obj = a.newTabSpec("ATM").setIndicator(((View) (obj)));
        q q1 = new q(this, "ATM", com/wf/wellsfargomobile/locations/m, bundle);
        a(this, tabhost, ((android.widget.TabHost.TabSpec) (obj)), q1);
        b.put(q.a(q1), q1);
        obj = LayoutInflater.from(getActivity()).inflate(0x7f04005a, a.getTabWidget(), false);
        ((TextView)((View) (obj)).findViewById(0x1020016)).setText(getResources().getString(0x7f0800fe));
        tabhost = a;
        obj = a.newTabSpec("STORE").setIndicator(((View) (obj)));
        bundle = new q(this, "STORE", com/wf/wellsfargomobile/locations/r, bundle);
        a(this, tabhost, ((android.widget.TabHost.TabSpec) (obj)), ((q) (bundle)));
        b.put(q.a(bundle), bundle);
        a.setOnTabChangedListener(this);
    }

    private static void a(LocationTabListFragment locationtablistfragment, TabHost tabhost, android.widget.TabHost.TabSpec tabspec, q q1)
    {
        locationtablistfragment.getClass();
        tabspec.setContent(new p(locationtablistfragment, locationtablistfragment.getActivity()));
        String s = tabspec.getTag();
        q.a(q1, locationtablistfragment.getChildFragmentManager().findFragmentByTag(s));
        if (q.b(q1) != null && !q.b(q1).isDetached())
        {
            FragmentTransaction fragmenttransaction = locationtablistfragment.getChildFragmentManager().beginTransaction();
            fragmenttransaction.detach(q.b(q1));
            fragmenttransaction.commit();
            locationtablistfragment.getChildFragmentManager().executePendingTransactions();
        }
        tabhost.addTab(tabspec);
    }

    public String a()
    {
        return a.getCurrentTabTag();
    }

    public void a(int i)
    {
        q q1 = (q)b.get(a.getCurrentTabTag());
        if (q.b(q1) != null)
        {
            ((n)q.b(q1)).a(i);
        }
    }

    public void a(String s)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            s = (q)b.get(s);
            if (c != s)
            {
                FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
                if (c != null && q.b(c) != null)
                {
                    fragmenttransaction.detach(q.b(c));
                }
                if (s != null)
                {
                    if (q.b(s) == null)
                    {
                        q.a(s, Fragment.instantiate(fragmentactivity, q.c(s).getName(), q.d(s)));
                        fragmenttransaction.add(0x7f0f00b8, q.b(s), q.a(s));
                    } else
                    {
                        fragmenttransaction.attach(q.b(s));
                    }
                }
                c = s;
                fragmenttransaction.commit();
                getChildFragmentManager().executePendingTransactions();
            }
        }
    }

    public void b()
    {
        q q1 = (q)b.get(a.getCurrentTabTag());
        if (q.b(q1) != null)
        {
            ((n)q.b(q1)).b();
        }
    }

    public void b(String s)
    {
        s = (q)b.get(s);
        if (q.b(s) != null)
        {
            ((c)q.b(s)).a();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        j.a(getActivity());
        d = layoutinflater.inflate(0x7f040038, viewgroup, false);
        a(bundle);
        if (bundle != null)
        {
            a.setCurrentTabByTag(bundle.getString("tab"));
        }
        return d;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("tab", a.getCurrentTabTag());
        super.onSaveInstanceState(bundle);
    }

    public void onTabChanged(String s)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            q q1 = (q)b.get(s);
            if (c != q1)
            {
                FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
                if (c != null && q.b(c) != null)
                {
                    fragmenttransaction.detach(q.b(c));
                }
                if (q1 != null)
                {
                    if (q.b(q1) == null)
                    {
                        q.a(q1, Fragment.instantiate(fragmentactivity, q.c(q1).getName(), q.d(q1)));
                        fragmenttransaction.add(0x7f0f00b8, q.b(q1), q.a(q1));
                    } else
                    {
                        fragmenttransaction.attach(q.b(q1));
                    }
                }
                c = q1;
                ((LocationListActivity)getActivity()).a(s);
                fragmenttransaction.commitAllowingStateLoss();
                getChildFragmentManager().executePendingTransactions();
            }
        }
    }
}
