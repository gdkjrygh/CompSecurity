// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gtp.go.weather.coupon.b.a;
import com.gtp.go.weather.sharephoto.photo.b;
import java.util.ArrayList;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            c, CouponCollectActivity, e

class d
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener
{

    final c a;
    private View b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private LinearLayout g;
    private CheckBox h;
    private ImageView i;
    private View j;
    private RelativeLayout k;
    private RelativeLayout l;
    private a m;

    d(c c1)
    {
        a = c1;
        super();
        b = c1.a.getLayoutInflater().inflate(0x7f030053, null);
        c = (ImageView)b.findViewById(0x7f090245);
        d = (TextView)b.findViewById(0x7f090246);
        e = (TextView)b.findViewById(0x7f090249);
        f = (TextView)b.findViewById(0x7f09024c);
        g = (LinearLayout)b.findViewById(0x7f09024d);
        h = (CheckBox)b.findViewById(0x7f09024e);
        i = (ImageView)b.findViewById(0x7f09024f);
        k = (RelativeLayout)b.findViewById(0x7f090247);
        l = (RelativeLayout)b.findViewById(0x7f09024a);
        j = b.findViewById(0x7f090244);
        b.setOnLongClickListener(this);
        g.setOnClickListener(this);
        j.setOnClickListener(this);
    }

    static View a(d d1)
    {
        return d1.b;
    }

    private void a()
    {
        c();
        d.setText(m.d());
        b();
        f.setText(m.e());
        h.setChecked(m.a());
        m.f();
        if (com.gtp.go.weather.coupon.c.a.c(m.g()))
        {
            i.setVisibility(0);
        } else
        {
            i.setVisibility(8);
        }
        if (com.gtp.go.weather.coupon.view.CouponCollectActivity.b(a.a))
        {
            g.setVisibility(0);
            return;
        } else
        {
            g.setVisibility(8);
            return;
        }
    }

    private void b()
    {
        switch (m.f())
        {
        default:
            return;

        case 1: // '\001'
            k.setVisibility(0);
            l.setVisibility(8);
            e.setText(m.h());
            return;

        case 2: // '\002'
            k.setVisibility(8);
            break;
        }
        l.setVisibility(0);
    }

    private void c()
    {
label0:
        {
            Object obj = m.j();
            String s = String.valueOf(m.b());
            c.setTag(s);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = CouponCollectActivity.d(a.a).a(a.a.getApplicationContext(), ((String) (obj)), s, "", new e(this));
                if (obj == null)
                {
                    break label0;
                }
                c.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
            }
            return;
        }
        c.setImageResource(0x7f0205c6);
    }

    void a(int i1)
    {
        m = (a)com.gtp.go.weather.coupon.view.CouponCollectActivity.a(a.a).get(i1);
        a();
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            boolean flag;
            if (!h.isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h.setChecked(flag);
            m.a(flag);
        } else
        if (view.equals(j))
        {
            com.gtp.go.weather.coupon.view.CouponCollectActivity.a(a.a, m);
            return;
        }
    }

    public boolean onLongClick(View view)
    {
        CouponCollectActivity.e(a.a).setVisibility(0);
        com.gtp.go.weather.coupon.view.CouponCollectActivity.a(a.a, true);
        m.a(true);
        CouponCollectActivity.f(a.a).notifyDataSetChanged();
        CouponCollectActivity.g(a.a).setVisibility(0);
        return false;
    }
}
