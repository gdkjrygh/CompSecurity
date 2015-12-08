// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.jiubang.playsdk.a.a;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.main.BitmapBean;
import com.jiubang.playsdk.main.c;
import com.jiubang.playsdk.views.ProportionFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.go.weatherex.themestore:
//            e, n, ac, o, 
//            h

public class m extends e
{

    private float b;
    private c f;
    private final Map g = new HashMap();
    private final Executor h = Executors.newSingleThreadExecutor();
    private int i;
    private g j;

    public m(Context context, List list, ListView listview)
    {
        super(context, list, listview);
        b = 1.16F;
        f = null;
        j = new n(this);
        i = c.getResources().getDimensionPixelSize(0x7f0c023a);
        f = ac.h();
        com.gau.go.launcherex.gowidget.weather.service.a.b.a(j);
    }

    static Map a(m m1)
    {
        return m1.g;
    }

    static void a(m m1, BitmapBean bitmapbean, KPNetworkImageView kpnetworkimageview)
    {
        m1.a(bitmapbean, kpnetworkimageview);
    }

    private void a(BitmapBean bitmapbean, KPNetworkImageView kpnetworkimageview)
    {
        if (bitmapbean == null || kpnetworkimageview == null)
        {
            return;
        }
        if (bitmapbean.a() != null && !bitmapbean.a().isRecycled())
        {
            kpnetworkimageview.a("");
            kpnetworkimageview.a(0);
            kpnetworkimageview.setImageBitmap(bitmapbean.a());
            return;
        } else
        {
            kpnetworkimageview.a("");
            kpnetworkimageview.a(0);
            kpnetworkimageview.setImageResource(0x7f020263);
            return;
        }
    }

    public View a(int k, View view, ViewGroup viewgroup)
    {
        View view1;
label0:
        {
            view1 = view;
            if (view == null)
            {
                view = new o(null);
                view1 = d.inflate(0x7f0300ac, viewgroup, false);
                view1.setBackgroundColor(0);
                if (view1 instanceof ProportionFrameLayout)
                {
                    ((ProportionFrameLayout)view1).a(b);
                }
                view.a = (KPNetworkImageView)view1.findViewById(0x7f0903e6);
                view.b = (KPNetworkImageView)view1.findViewById(0x7f0903e7);
                view.c = (FrameLayout)view1.findViewById(0x7f0903e8);
                view1.setTag(view);
            }
            view = (o)view1.getTag();
            if (f != null && view != null)
            {
                viewgroup = (a)e.get(k);
                String s = viewgroup.a();
                ((o) (view)).a.setTag(s);
                BitmapBean bitmapbean = (BitmapBean)g.get(s);
                if (bitmapbean != null && bitmapbean.a() != null && !bitmapbean.a().isRecycled())
                {
                    a(bitmapbean, ((o) (view)).a);
                } else
                {
                    if (bitmapbean != null)
                    {
                        g.remove(s);
                    }
                    com.gau.go.launcherex.gowidget.weather.service.a.b.a(new h(c, f, viewgroup, s), h);
                }
                if (f.d(c, viewgroup))
                {
                    ((o) (view)).c.setVisibility(0);
                } else
                {
                    ((o) (view)).c.setVisibility(4);
                }
                if (!f.e(c, viewgroup))
                {
                    break label0;
                }
                ((o) (view)).b.setVisibility(0);
                ((o) (view)).b.a("");
                ((o) (view)).b.setImageResource(0x7f0205b3);
            }
            return view1;
        }
        ((o) (view)).b.a("");
        ((o) (view)).b.setVisibility(4);
        return view1;
    }

    protected void a(FrameLayout framelayout, android.widget.LinearLayout.LayoutParams layoutparams, int k, int l)
    {
        super.a(framelayout, layoutparams, k, l);
        if (k == 0)
        {
            framelayout.setPadding(framelayout.getPaddingLeft(), i, framelayout.getPaddingRight(), framelayout.getPaddingBottom());
        }
        if (k == getCount() - 1)
        {
            framelayout.setPadding(framelayout.getPaddingLeft(), framelayout.getPaddingTop(), framelayout.getPaddingRight(), b());
        }
    }

    public void c()
    {
        com.gau.go.launcherex.gowidget.weather.service.a.b.b(j);
        g.clear();
    }
}
