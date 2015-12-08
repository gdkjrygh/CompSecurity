// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.gtp.go.weather.coupon.b.b;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            CouponsActivity, o, l, n, 
//            m

class k extends BaseAdapter
{

    final CouponsActivity a;
    private LayoutInflater b;
    private o c;

    public k(CouponsActivity couponsactivity)
    {
        a = couponsactivity;
        super();
        b = LayoutInflater.from(couponsactivity.getApplicationContext());
    }

    public int getCount()
    {
        return CouponsActivity.c(a).size();
    }

    public Object getItem(int i)
    {
        return CouponsActivity.c(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        String s;
        String s1;
        if (view == null)
        {
            view = b.inflate(0x7f030055, null);
            c = new o(this);
            o.a(c, (ImageView)view.findViewById(0x7f090257));
            o.a(c, (TextView)view.findViewById(0x7f090258));
            o.a(c, view.findViewById(0x7f090259));
            com.gtp.go.weather.coupon.view.o.b(c, (TextView)view.findViewById(0x7f09025a));
            o.c(c, (TextView)view.findViewById(0x7f09025b));
            com.gtp.go.weather.coupon.view.o.b(c, view.findViewById(0x7f09025c));
            o.d(c, (TextView)view.findViewById(0x7f09025d));
            o.e(c, (TextView)view.findViewById(0x7f09025e));
            o.a(c, (Button)view.findViewById(0x7f09025f));
            o.c(c, view.findViewById(0x7f090256));
            view.setTag(c);
        } else
        {
            c = (o)view.getTag();
        }
        viewgroup = (b)CouponsActivity.c(a).get(i);
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        o.a(c).setText(viewgroup.d());
        viewgroup.f();
        JVM INSTR tableswitch 1 2: default 256
    //                   1 437
    //                   2 496;
           goto _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_496;
_L6:
        o.g(c).setOnClickListener(new l(this, viewgroup));
        o.h(c).setText(viewgroup.e());
        if (viewgroup.l())
        {
            o.i(c).setBackgroundResource(0x7f020642);
            o.i(c).setClickable(false);
            o.i(c).setText(a.getString(0x7f08027e));
        } else
        {
            o.i(c).setBackgroundResource(0x7f020641);
            o.i(c).setClickable(true);
            o.i(c).setText(a.getString(0x7f08027d));
            o.i(c).setOnClickListener(new m(this, viewgroup));
        }
        s = viewgroup.j();
        s1 = String.valueOf(viewgroup.b());
        o.j(c).setTag(s1);
        if (!TextUtils.isEmpty(s))
        {
            viewgroup = CouponsActivity.i(a).a(a.getApplicationContext(), s, s1, "", new n(this, viewgroup));
            if (viewgroup == null)
            {
                break MISSING_BLOCK_LABEL_605;
            }
            o.j(c).setImageDrawable(viewgroup);
        }
_L2:
        return view;
_L4:
        com.gtp.go.weather.coupon.view.o.b(c).setVisibility(0);
        o.c(c).setVisibility(8);
        o.d(c).setText(a.getString(0x7f08027b));
        o.e(c).setText(viewgroup.h());
          goto _L6
        com.gtp.go.weather.coupon.view.o.b(c).setVisibility(8);
        o.c(c).setVisibility(0);
        o.f(c).setText(a.getString(0x7f08027c));
          goto _L6
        o.j(c).setImageResource(0x7f0205c6);
        return view;
    }
}
