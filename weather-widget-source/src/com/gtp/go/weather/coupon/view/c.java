// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.gtp.go.weather.coupon.b.a;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            CouponCollectActivity, d, a

class c extends BaseAdapter
{

    final CouponCollectActivity a;

    private c(CouponCollectActivity couponcollectactivity)
    {
        a = couponcollectactivity;
        super();
    }

    c(CouponCollectActivity couponcollectactivity, com.gtp.go.weather.coupon.view.a a1)
    {
        this(couponcollectactivity);
    }

    public int getCount()
    {
        return com.gtp.go.weather.coupon.view.CouponCollectActivity.a(a).size();
    }

    public Object getItem(int i)
    {
        if (getCount() == 0)
        {
            return null;
        } else
        {
            return (a)com.gtp.go.weather.coupon.view.CouponCollectActivity.a(a).get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            viewgroup = new d(this);
            view = com.gtp.go.weather.coupon.view.d.a(viewgroup);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (d)view.getTag();
        }
        viewgroup.a(i);
        return view;
    }
}
