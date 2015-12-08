// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.go.weatherex.f.b;
import com.go.weatherex.framework.fragment.a;

public class SidebarGoAdView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private Context a;
    private a b;
    private View c;
    private View d;
    private View e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private boolean l;
    private SharedPreferences m;
    private TextView n;
    private com.jiubang.commerce.ad.a.a o;
    private boolean p;
    private com.jiubang.commerce.ad.a.a q;

    SidebarGoAdView(Context context)
    {
        super(context);
        l = false;
        p = false;
        a(context);
    }

    public SidebarGoAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        l = false;
        p = false;
        a(context);
    }

    public SidebarGoAdView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = false;
        p = false;
        a(context);
    }

    private void a(Context context)
    {
        a = context;
        m = context.getSharedPreferences("go_ad_share_prefs", 0);
        a();
    }

    private void d()
    {
        if (n != null)
        {
            b.a(n, 4, true);
        }
    }

    public void a()
    {
        byte byte0;
        if (com.go.weatherex.f.b.b(a))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setVisibility(byte0);
    }

    public void a(a a1)
    {
        b = a1;
        d();
    }

    public void a(com.jiubang.commerce.ad.a.a a1, Bitmap bitmap, String s, int i1)
    {
        if (!com.go.weatherex.f.b.b(a))
        {
            if (p)
            {
                setVisibility(0);
                p = true;
            }
            if (i1 == 1)
            {
                q = a1;
                c.setVisibility(0);
                f.setImageBitmap(bitmap);
                i.setText(s);
                return;
            }
            if (i1 == 2)
            {
                o = a1;
                d.setVisibility(0);
                g.setImageBitmap(bitmap);
                j.setText(s);
                return;
            }
        }
    }

    public void b()
    {
        n.setText(getResources().getString(0x7f0802fb));
    }

    public void c()
    {
        if (!com.go.weatherex.f.b.b(a));
    }

    public void onClick(View view)
    {
        if (view != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!view.equals(c))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (q == null) goto _L1; else goto _L3
_L3:
        com.jiubang.commerce.ad.a.a(a, q, "", "", true, false);
        return;
        if (!view.equals(d) || o == null) goto _L1; else goto _L4
_L4:
        com.jiubang.commerce.ad.a.a(a, o, "", "", true, false);
        return;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = findViewById(0x7f09038c);
        d = findViewById(0x7f09038f);
        e = findViewById(0x7f090392);
        f = (ImageView)findViewById(0x7f09038d);
        g = (ImageView)findViewById(0x7f090390);
        h = (ImageView)findViewById(0x7f090393);
        i = (TextView)findViewById(0x7f09038e);
        j = (TextView)findViewById(0x7f090391);
        k = (TextView)findViewById(0x7f090394);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        n = (TextView)findViewById(0x7f09038b);
    }
}
