// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.jiubang.playsdk.a.a.b;
import com.jiubang.playsdk.d.a;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.views.ProportionFrameLayout;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore:
//            f, ac, s

public class r extends f
{

    private float f;
    private boolean g;
    private int h;
    private b i;

    public r(Context context, List list, ListView listview)
    {
        super(context, list, listview);
        f = 1.16F;
        g = false;
        h = c.getResources().getDimensionPixelSize(0x7f0c023a);
        i = ac.h().k();
    }

    public int a()
    {
        if (super.a() == 0)
        {
            return 0;
        } else
        {
            return super.a() + 1;
        }
    }

    public View a(int j, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view = new s();
            view1 = b.inflate(0x7f0300a3, viewgroup, false);
            view1.setBackgroundColor(0);
            if (view1 instanceof ProportionFrameLayout)
            {
                ((ProportionFrameLayout)view1).a(f);
            }
            view.a = (KPNetworkImageView)view1.findViewById(0x7f0903d2);
            view.b = (KPNetworkImageView)view1.findViewById(0x7f0903d3);
            ((s) (view)).b.a(false);
            view1.setTag(view);
        }
        view = (s)view1.getTag();
        if (j == a() - 1)
        {
            ((s) (view)).b.setVisibility(4);
            ((s) (view)).a.setTag("more_theme");
            ((s) (view)).a.a(0);
            ((s) (view)).a.a("");
            if (i != null)
            {
                ((s) (view)).a.setImageResource(i.a());
            }
        } else
        {
            viewgroup = (e)e.get(j);
            if (viewgroup != null)
            {
                ((s) (view)).a.a(0x7f020263);
                ((s) (view)).a.a(viewgroup.a());
                viewgroup = viewgroup.f();
                if (viewgroup instanceof a)
                {
                    viewgroup = (a)viewgroup;
                    if (viewgroup.p())
                    {
                        if (g)
                        {
                            ((s) (view)).b.setVisibility(0);
                            ((s) (view)).b.a("");
                            ((s) (view)).b.setImageResource(0x7f020262);
                            return view1;
                        }
                        if (!TextUtils.isEmpty(viewgroup.l()))
                        {
                            ((s) (view)).b.setVisibility(0);
                            ((s) (view)).b.a(viewgroup.l());
                            return view1;
                        } else
                        {
                            ((s) (view)).b.setVisibility(4);
                            ((s) (view)).b.setImageResource(0);
                            return view1;
                        }
                    }
                    if (!TextUtils.isEmpty(viewgroup.l()))
                    {
                        ((s) (view)).b.setVisibility(0);
                        ((s) (view)).b.a(viewgroup.l());
                        return view1;
                    } else
                    {
                        ((s) (view)).b.setVisibility(4);
                        ((s) (view)).b.setImageResource(0);
                        return view1;
                    }
                }
            } else
            {
                ((s) (view)).b.setVisibility(4);
                ((s) (view)).a.setTag("");
                ((s) (view)).a.a(0);
                ((s) (view)).a.a("");
                ((s) (view)).a.setImageResource(0x7f020263);
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
            framelayout.setPadding(framelayout.getPaddingLeft(), h, framelayout.getPaddingRight(), framelayout.getPaddingBottom());
        }
        if (j == getCount() - 1)
        {
            framelayout.setPadding(framelayout.getPaddingLeft(), framelayout.getPaddingTop(), framelayout.getPaddingRight(), b());
        }
    }

    public void b(boolean flag)
    {
        g = flag;
    }
}
