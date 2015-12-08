// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.detail.ThemePreviewLastItemView;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.main.c;
import com.jiubang.playsdk.views.ProportionFrameLayout;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            c, b, d

public class a extends com.jiubang.playsdk.detail.a.c
    implements android.view.View.OnClickListener
{

    private Context d;
    private LayoutInflater e;
    private ArrayList f;
    private int g;
    private com.jiubang.playsdk.d.a h;
    private List i;
    private c j;

    public a(Context context, e e1)
    {
        i = new ArrayList();
        d = context;
        e = LayoutInflater.from(d);
        g = y.a().e();
        h = e1.f();
        f = a(e1);
        for (int k = 0; k < f.size() + 1; k++)
        {
            i.add(null);
        }

        j = y.a().b();
    }

    private String a(String s)
    {
        s = s.split("##");
        if (s != null && s.length == 2)
        {
            return s[1];
        } else
        {
            return "";
        }
    }

    private ArrayList a(e e1)
    {
        ArrayList arraylist = new ArrayList();
        e1 = e1.f().g();
        if (!TextUtils.isEmpty(e1))
        {
            e1 = e1.split("@@");
            if (e1 != null)
            {
                int l = e1.length;
                for (int k = 0; k < l; k++)
                {
                    Object obj = e1[k];
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        continue;
                    }
                    obj = a(((String) (obj)));
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        arraylist.add(obj);
                    }
                }

            }
        }
        return arraylist;
    }

    public void a()
    {
        int k = 0;
        while (k < getCount() - 1) 
        {
            Object obj = (View)i.get(k);
            if (obj == null)
            {
                continue;
            }
            obj = (KPNetworkImageView)((View) (obj)).findViewById(0x7f0903f4);
            if (h instanceof com.jiubang.playsdk.d.a)
            {
                if (h.p())
                {
                    if (j.b(d))
                    {
                        ((KPNetworkImageView) (obj)).setVisibility(0);
                        ((KPNetworkImageView) (obj)).a("");
                        ((KPNetworkImageView) (obj)).setImageResource(0x7f020262);
                    } else
                    if (!TextUtils.isEmpty(h.l()))
                    {
                        ((KPNetworkImageView) (obj)).setVisibility(0);
                        ((KPNetworkImageView) (obj)).a(h.l());
                    } else
                    {
                        ((KPNetworkImageView) (obj)).setVisibility(4);
                        ((KPNetworkImageView) (obj)).setImageResource(0);
                    }
                } else
                if (!TextUtils.isEmpty(h.l()))
                {
                    ((KPNetworkImageView) (obj)).setVisibility(0);
                    ((KPNetworkImageView) (obj)).a(h.l());
                } else
                {
                    ((KPNetworkImageView) (obj)).setVisibility(4);
                    ((KPNetworkImageView) (obj)).setImageResource(0);
                }
            }
            k++;
        }
    }

    public void destroyItem(ViewGroup viewgroup, int k, Object obj)
    {
        obj = (View)i.get(k);
        if (obj != null)
        {
            ((View) (obj)).setOnClickListener(null);
            viewgroup.removeView(((View) (obj)));
            i.set(k, null);
        }
    }

    public int getCount()
    {
        if (b)
        {
            return f.size() + 1;
        } else
        {
            return f.size();
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int k)
    {
        Object obj;
        View view;
        view = (View)i.get(k);
        obj = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        if (k != getCount() - 1 || !b) goto _L4; else goto _L3
_L3:
        ThemePreviewLastItemView themepreviewlastitemview = (ThemePreviewLastItemView)e.inflate(0x7f0300a6, null);
        obj = themepreviewlastitemview;
        if (h != null)
        {
            obj = themepreviewlastitemview;
            if (!TextUtils.isEmpty(h.c()))
            {
                themepreviewlastitemview.a(h.c(), g);
                obj = themepreviewlastitemview;
            }
        }
_L6:
        i.set(k, obj);
_L2:
        viewgroup.addView(((View) (obj)));
        return obj;
_L4:
        FrameLayout framelayout = (FrameLayout)e.inflate(0x7f0300b3, null);
        obj = (ProportionFrameLayout)framelayout.findViewById(0x7f0903f2);
        if (!c)
        {
            ((ProportionFrameLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        ((ProportionFrameLayout) (obj)).setTag(Integer.valueOf(k));
        ((ProportionFrameLayout) (obj)).setOnClickListener(this);
        ((ProportionFrameLayout) (obj)).a(false);
        ((ProportionFrameLayout) (obj)).b(c);
        ((ProportionFrameLayout) (obj)).a(1.77F);
        KPNetworkImageView kpnetworkimageview1 = (KPNetworkImageView)((ProportionFrameLayout) (obj)).findViewById(0x7f0903f3);
        KPNetworkImageView kpnetworkimageview = (KPNetworkImageView)((ProportionFrameLayout) (obj)).findViewById(0x7f0903f4);
        kpnetworkimageview1.a(new b(this, (TextView)((ProportionFrameLayout) (obj)).findViewById(0x7f0903f5)));
        kpnetworkimageview1.a((String)f.get(k));
        kpnetworkimageview1.a(0x7f020263);
        obj = framelayout;
        if (h instanceof com.jiubang.playsdk.d.a)
        {
            if (h.p())
            {
                if (j.b(d))
                {
                    kpnetworkimageview.setVisibility(0);
                    kpnetworkimageview.a("");
                    kpnetworkimageview.setImageResource(0x7f020262);
                    obj = framelayout;
                } else
                if (!TextUtils.isEmpty(h.l()))
                {
                    kpnetworkimageview.setVisibility(0);
                    kpnetworkimageview.a(h.l());
                    obj = framelayout;
                } else
                {
                    kpnetworkimageview.setVisibility(4);
                    kpnetworkimageview.setImageResource(0);
                    obj = framelayout;
                }
            } else
            if (!TextUtils.isEmpty(h.l()))
            {
                kpnetworkimageview.setVisibility(0);
                kpnetworkimageview.a(h.l());
                obj = framelayout;
            } else
            {
                kpnetworkimageview.setVisibility(4);
                kpnetworkimageview.setImageResource(0);
                obj = framelayout;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            int k = ((Integer)view.getTag()).intValue();
            a.a(k);
        }
    }
}
