// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.content.Context;
import android.content.IntentFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gtp.go.weather.sharephoto.b.h;
import com.gtp.go.weather.sharephoto.b.p;
import com.gtp.go.weather.sharephoto.c.a;
import com.gtp.go.weather.sharephoto.c.l;
import com.gtp.go.weather.sharephoto.d.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            m, h, UserPhotoItem, l, 
//            i, j, b, k, 
//            n, f

public class g extends BaseAdapter
{

    private Context a;
    private LayoutInflater b;
    private List c;
    private f d;
    private a e;
    private m f;
    private c g;
    private n h;

    public g(Context context)
    {
        c = new ArrayList();
        a = context;
        b = LayoutInflater.from(a);
        f = new m(this);
        context = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_FAVOUR_OR_BACKCOUNT");
        a.registerReceiver(f, context);
        e = new com.gtp.go.weather.sharephoto.view.h(this);
        l.a(e);
    }

    private h a(long l1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.b(l1) != null)
            {
                return h1;
            }
        }

        return null;
    }

    private h a(String s)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.a().equals(s))
            {
                return h1;
            }
        }

        return null;
    }

    private UserPhotoItem a(com.gtp.go.weather.sharephoto.view.l l1, p p1)
    {
        return ((UserPhotoItem)b.inflate(0x7f0300e9, null)).a(l1.a).a(g).a(p1).a();
    }

    static List a(g g1)
    {
        return g1.c;
    }

    private void a(h h1, com.gtp.go.weather.sharephoto.view.l l1)
    {
        boolean flag;
        if (h1.d())
        {
            l1.c.setText(a.getString(0x7f0804a8));
            l1.b.setImageResource(0x7f0203dc);
            l1.c.setTextColor(0xff009fe9);
        } else
        {
            l1.c.setText(h1.a());
            l1.b.setImageResource(0x7f0203db);
            l1.c.setTextColor(0xff959595);
        }
        h1 = h1.b();
        l1.d.removeAllViews();
        h1 = h1.values().iterator();
        flag = true;
        UserPhotoItem userphotoitem;
        for (; h1.hasNext(); l1.d.addView(userphotoitem))
        {
            userphotoitem = a(l1, (p)h1.next());
            if (flag)
            {
                userphotoitem.a(false);
                flag = false;
            }
            userphotoitem.a(d);
        }

    }

    private void b(List list)
    {
        if (list == null || list.isEmpty()) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        for (Iterator iterator1 = list.iterator(); iterator1.hasNext();)
        {
            p p1 = (p)iterator1.next();
            list = a(p1.c());
            if (list == null)
            {
                String s = p1.i();
                h h1 = a(s);
                list = h1;
                if (h1 == null)
                {
                    list = new h(s, p1.b());
                    c.add(list);
                }
                list.a(p1);
            } else
            {
                list.a(p1);
            }
        }

        Collections.sort(c, new i(this));
        iterator = c.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        list = (h)iterator.next();
        if (list.e()) goto _L6; else goto _L5
_L5:
        if (list != null)
        {
            list = (h)c.get(0);
            list.a((new SimpleDateFormat("yyyy/MM/dd", Locale.US)).format(Long.valueOf(System.currentTimeMillis())).equals(list.a()));
        }
_L2:
        return;
_L4:
        list = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public int a()
    {
        Iterator iterator = c.iterator();
        int i1;
        for (i1 = 0; iterator.hasNext(); i1 = ((h)iterator.next()).b().size() + i1) { }
        return i1;
    }

    public h a(int i1)
    {
        return (h)c.get(i1);
    }

    public void a(long l1, View view, UserPhotoItem userphotoitem)
    {
label0:
        {
            h h1 = a(userphotoitem.c());
            if (h1 != null)
            {
                h1.a(l1);
                if (!h1.c())
                {
                    break label0;
                }
                com.gtp.go.weather.sharephoto.view.b.a(new j(this, h1), view);
            }
            return;
        }
        com.gtp.go.weather.sharephoto.view.b.a(new k(this), userphotoitem);
    }

    public void a(c c1)
    {
        g = c1;
    }

    public void a(f f1)
    {
        d = f1;
    }

    public void a(n n1)
    {
        h = n1;
    }

    public void a(List list)
    {
        b(list);
    }

    public void b()
    {
        l.b(e);
        a.unregisterReceiver(f);
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i1)
    {
        return a(i1);
    }

    public long getItemId(int i1)
    {
        return (long)i1;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        h h1 = a(i1);
        if (view == null)
        {
            view = b.inflate(0x7f0300e7, null);
            viewgroup = new com.gtp.go.weather.sharephoto.view.l(this, view);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (com.gtp.go.weather.sharephoto.view.l)view.getTag();
        }
        a(h1, viewgroup);
        return view;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        if (h != null)
        {
            h.a();
        }
    }
}
