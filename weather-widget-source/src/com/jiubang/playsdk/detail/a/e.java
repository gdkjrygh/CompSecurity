// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.jiubang.playsdk.imageload.KPNetworkImageView;
import com.jiubang.playsdk.main.BitmapBean;
import com.jiubang.playsdk.views.ProportionFrameLayout;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            c, f, d

public class e extends c
    implements android.view.View.OnClickListener
{

    private Context d;
    private LayoutInflater e;
    private List f;
    private List g;

    public e(Context context, List list)
    {
        g = new ArrayList();
        d = context;
        e = LayoutInflater.from(d);
        int i;
        if (list == null)
        {
            f = new ArrayList();
        } else
        {
            f = list;
        }
        for (i = 0; i < f.size(); i++)
        {
            g.add(null);
        }

    }

    public List a()
    {
        return f;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (View)g.get(i);
        if (obj != null)
        {
            ((View) (obj)).setOnClickListener(null);
            viewgroup.removeView(((View) (obj)));
            g.set(i, null);
        }
    }

    public int getCount()
    {
        return f.size();
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = (View)g.get(i);
        Object obj = view;
        if (view == null)
        {
            FrameLayout framelayout = (FrameLayout)e.inflate(0x7f0300b3, null);
            obj = (ProportionFrameLayout)framelayout.findViewById(0x7f0903f2);
            if (!c)
            {
                ((ProportionFrameLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            ((ProportionFrameLayout) (obj)).setTag(Integer.valueOf(i));
            ((ProportionFrameLayout) (obj)).setOnClickListener(this);
            ((ProportionFrameLayout) (obj)).a(false);
            ((ProportionFrameLayout) (obj)).b(c);
            ((ProportionFrameLayout) (obj)).a(1.77F);
            KPNetworkImageView kpnetworkimageview = (KPNetworkImageView)((ProportionFrameLayout) (obj)).findViewById(0x7f0903f3);
            TextView textview = (TextView)((ProportionFrameLayout) (obj)).findViewById(0x7f0903f5);
            BitmapBean bitmapbean = (BitmapBean)f.get(i);
            obj = framelayout;
            if (bitmapbean != null)
            {
                obj = bitmapbean.a();
                if (obj != null)
                {
                    kpnetworkimageview.setImageBitmap(((android.graphics.Bitmap) (obj)));
                    kpnetworkimageview.a("");
                    kpnetworkimageview.a(0);
                    textview.setVisibility(8);
                    obj = framelayout;
                } else
                {
                    kpnetworkimageview.a(bitmapbean.b());
                    kpnetworkimageview.a(0x7f020263);
                    kpnetworkimageview.a(new f(this, textview));
                    obj = framelayout;
                }
            }
        }
        viewgroup.addView(((View) (obj)));
        return obj;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void onClick(View view)
    {
        if (a != null)
        {
            int i = ((Integer)view.getTag()).intValue();
            a.a(i);
        }
    }
}
