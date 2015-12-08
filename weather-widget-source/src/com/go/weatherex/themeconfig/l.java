// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.e;
import com.jiubang.playsdk.a.a.b;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.views.ProportionFrameLayout;
import java.util.List;

// Referenced classes of package com.go.weatherex.themeconfig:
//            m

public class l extends e
{

    private float b;
    private boolean f;
    private int g;
    private b h;
    private boolean i;

    public l(Context context, List list, ListView listview)
    {
        super(context, list, listview);
        b = 1.16F;
        f = false;
        i = false;
        a(3);
        h = ac.h().k();
        context = c.getResources();
        g = context.getDimensionPixelSize(0x7f0c023f);
        b(context.getDimensionPixelSize(0x7f0c023e));
        c(context.getDimensionPixelSize(0x7f0c023f));
    }

    public int a()
    {
        if (super.a() == 0)
        {
            return super.a();
        }
        if (super.a() > 8)
        {
            i = true;
            return 9;
        } else
        {
            return super.a();
        }
    }

    public View a(int j, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view = new m();
            view1 = d.inflate(0x7f0300a3, viewgroup, false);
            view1.setBackgroundColor(0);
            if (view1 instanceof ProportionFrameLayout)
            {
                ((ProportionFrameLayout)view1).a(b);
            }
            view.a = (KPNetworkImageView)view1.findViewById(0x7f0903d2);
            view.b = (KPNetworkImageView)view1.findViewById(0x7f0903d3);
            ((m) (view)).b.a(false);
            view1.setTag(view);
        }
        view = (m)view1.getTag();
        if (i && j == 8)
        {
            ((m) (view)).b.setVisibility(4);
            ((m) (view)).a.setTag("more_theme");
            ((m) (view)).a.a(0);
            ((m) (view)).a.a("");
            if (h != null)
            {
                ((m) (view)).a.setImageResource(h.a());
            }
        } else
        {
            viewgroup = (com.jiubang.playsdk.d.e)e.get(j);
            if (viewgroup != null)
            {
                ((m) (view)).a.a(0x7f020263);
                ((m) (view)).a.a(viewgroup.a());
                viewgroup = viewgroup.f();
                if (viewgroup instanceof a)
                {
                    viewgroup = (a)viewgroup;
                    if (viewgroup.p())
                    {
                        if (f)
                        {
                            ((m) (view)).b.setVisibility(0);
                            ((m) (view)).b.a("");
                            ((m) (view)).b.setImageResource(0x7f020262);
                            return view1;
                        }
                        if (!TextUtils.isEmpty(viewgroup.l()))
                        {
                            ((m) (view)).b.setVisibility(0);
                            ((m) (view)).b.a(viewgroup.l());
                            return view1;
                        } else
                        {
                            ((m) (view)).b.setVisibility(4);
                            ((m) (view)).b.setImageResource(0);
                            return view1;
                        }
                    }
                    if (!TextUtils.isEmpty(viewgroup.l()))
                    {
                        ((m) (view)).b.setVisibility(0);
                        ((m) (view)).b.a(viewgroup.l());
                        return view1;
                    } else
                    {
                        ((m) (view)).b.setVisibility(4);
                        ((m) (view)).b.setImageResource(0);
                        return view1;
                    }
                }
            } else
            {
                ((m) (view)).b.setVisibility(4);
                ((m) (view)).a.setTag("");
                ((m) (view)).a.a(0);
                ((m) (view)).a.a("");
                ((m) (view)).a.setImageResource(0x7f020263);
                return view1;
            }
        }
        return view1;
    }

    protected void a(FrameLayout framelayout, android.widget.LinearLayout.LayoutParams layoutparams, int j, int k)
    {
        super.a(framelayout, layoutparams, j, k);
        if (j == 0)
        {
            framelayout.setPadding(framelayout.getPaddingLeft(), g, framelayout.getPaddingRight(), framelayout.getPaddingBottom());
        }
    }

    public void a(boolean flag)
    {
        f = flag;
    }
}
