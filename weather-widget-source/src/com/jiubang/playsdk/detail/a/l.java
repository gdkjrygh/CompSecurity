// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.jiubang.playsdk.c;
import com.jiubang.playsdk.d;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.views.TouchMaskFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            m

public class l extends BaseAdapter
{

    private Context a;
    private List b;
    private int c;
    private int d;
    private int e;
    private android.widget.AdapterView.OnItemClickListener f;

    public l(Context context, List list, int i)
    {
        e = 1;
        a = context;
        b = list;
        c = i;
        d = (int)((double)i * 1.6499999999999999D);
        e = context.getResources().getDimensionPixelSize(c.c);
        a();
    }

    static android.widget.AdapterView.OnItemClickListener a(l l1)
    {
        return l1.f;
    }

    public void a()
    {
        if (b == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            if (e1 != null && e1.f() != null)
            {
                String s = e1.f().c();
                if (com.jiubang.playsdk.f.a.a(a, s, null))
                {
                    arraylist.add(e1);
                    iterator.remove();
                }
            }
        } while (true);
        b.addAll(arraylist);
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        f = onitemclicklistener;
    }

    public int getCount()
    {
        int i;
        if (b != null)
        {
            i = b.size();
        } else
        {
            i = 0;
        }
        if (i > 3)
        {
            return 3;
        } else
        {
            return i;
        }
    }

    public Object getItem(int i)
    {
        if (b != null)
        {
            return (e)b.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = new TouchMaskFrameLayout(a);
        view.setPadding(e, e, e, e);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(c, -1));
        KPNetworkImageView kpnetworkimageview = new KPNetworkImageView(a);
        kpnetworkimageview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        kpnetworkimageview.setAdjustViewBounds(true);
        kpnetworkimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        kpnetworkimageview.a(d.d);
        e e1 = (e)getItem(i);
        if (e1 != null)
        {
            kpnetworkimageview.a(e1.a());
        }
        view.addView(kpnetworkimageview);
        view.setOnClickListener(new m(this, viewgroup, view, i));
        return view;
    }
}
