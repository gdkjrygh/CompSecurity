// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.e;
import com.jiubang.playsdk.main.c;

// Referenced classes of package com.jiubang.playsdk.views:
//            k, l, n, m

public class TitleBar extends RelativeLayout
{

    public View a;
    protected ImageButton b;
    protected TextView c;
    protected ImageView d;
    protected ImageView e;
    private n f;
    private m g;
    private Context h;
    private LinearLayout i;
    private RelativeLayout j;

    public TitleBar(Context context)
    {
        this(context, null);
    }

    public TitleBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        c = null;
        d = null;
        h = context;
    }

    static n a(TitleBar titlebar)
    {
        return titlebar.f;
    }

    static m b(TitleBar titlebar)
    {
        return titlebar.g;
    }

    protected void onFinishInflate()
    {
        setBackgroundResource(y.a().b().c());
        b = (ImageButton)findViewById(e.h);
        b.setBackgroundResource(y.a().b().i());
        b.setOnClickListener(new k(this));
        a = findViewById(e.e).findViewById(e.b);
        a.setOnClickListener(new l(this));
        c = (TextView)a.findViewById(e.f);
        c.setTextColor(getContext().getResources().getColor(y.a().b().b()));
        e = (ImageView)a.findViewById(e.c);
        e.setImageResource(y.a().b().h());
        d = (ImageView)a.findViewById(e.d);
        j = (RelativeLayout)a.findViewById(e.a);
        j.setBackgroundResource(y.a().b().i());
        if (y.a().b().a() != 0)
        {
            d.setImageResource(y.a().b().a());
        } else
        {
            d.setVisibility(8);
        }
        i = (LinearLayout)findViewById(e.g);
    }
}
