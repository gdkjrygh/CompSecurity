// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.framework.fragment.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.go.weatherex.messagecenter:
//            o, a, i, c, 
//            d, e, f

public class b extends a
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, o
{

    private View a;
    private ListView b;
    private d c;
    private TextView d;
    private Button e;
    private i f;
    private Vector g;
    private f h;

    public b()
    {
        b = null;
        c = null;
    }

    static Vector a(b b1)
    {
        return b1.g;
    }

    private void a(int j)
    {
        e.setVisibility(j);
    }

    private void a(int j, int k)
    {
        if (!isAdded())
        {
            return;
        }
        if (k == 0)
        {
            d.setText(0x7f080305);
            return;
        } else
        {
            d.setText((new StringBuilder()).append(getString(0x7f080305)).append("(").append(j).append("/").append(k).append(")").toString());
            return;
        }
    }

    private void a(long l)
    {
        ((NotificationManager)getActivity().getSystemService("notification")).cancel((int)l);
    }

    private void a(com.go.weatherex.messagecenter.a a1)
    {
        if (a1 == null) goto _L2; else goto _L1
_L1:
        a1.e();
        JVM INSTR tableswitch 1 3: default 36
    //                   1 42
    //                   2 36
    //                   3 53;
           goto _L3 _L4 _L3 _L5
_L3:
        a1.a(true);
_L2:
        return;
_L4:
        f.b(a1);
        continue; /* Loop/switch isn't completed */
_L5:
        f.a(getActivity(), a1);
        if (true) goto _L3; else goto _L6
_L6:
    }

    static void a(b b1, int j)
    {
        b1.a(j);
    }

    static void a(b b1, int j, int k)
    {
        b1.a(j, k);
    }

    static boolean b(b b1)
    {
        return b1.c();
    }

    static d c(b b1)
    {
        return b1.c;
    }

    private boolean c()
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            if (((com.go.weatherex.messagecenter.a)iterator.next()).a())
            {
                return true;
            }
        }

        return false;
    }

    static i d(b b1)
    {
        return b1.f;
    }

    public void a(Activity activity)
    {
        activity = new com.gau.go.launcherex.gowidget.weather.globalview.b(activity);
        activity.b(0x7f08030a);
        activity.c(0x7f08030b);
        activity.a(new c(this));
        activity.a();
    }

    public void a(Vector vector)
    {
        if (!isAdded())
        {
            return;
        }
        if (vector == null)
        {
            g = new Vector();
        } else
        {
            g = vector;
        }
        b();
        c.notifyDataSetChanged();
    }

    public void b()
    {
        if (g != null && !g.isEmpty())
        {
            Collections.sort(g, new e(this, null));
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        a = c(0x7f0902e2);
        a.setOnClickListener(this);
        b = (ListView)c(0x7f0902e5);
        c = new d(this);
        b.setAdapter(c);
        b.setOnItemClickListener(this);
        b.setEmptyView(c(0x7f0902e6));
        d = (TextView)c(0x7f0902e3);
        e = (Button)c(0x7f0902e4);
        e.setOnClickListener(this);
        f = com.go.weatherex.messagecenter.i.a(getActivity());
        f.a(this);
        h = new f(this, new Handler());
        getActivity().getContentResolver().registerContentObserver(WeatherContentProvider.q, false, h);
    }

    public void onClick(View view)
    {
        if (view.equals(a))
        {
            h();
        } else
        if (view.equals(e))
        {
            a(getActivity());
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030081, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        adapterview = (com.go.weatherex.messagecenter.a)adapterview.getItemAtPosition(j);
        if (!adapterview.a())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        a(adapterview);
        if (j != 0)
        {
            b();
            c.notifyDataSetChanged();
            f.a(adapterview.d());
        }
        a(adapterview.d());
    }
}
