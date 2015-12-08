// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.jiubang.commerce.ad.j.a.a;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.d;
import java.util.Map;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            a

class f extends LinearLayout
    implements android.view.View.OnClickListener
{

    final com.jiubang.commerce.ad.j.a a;

    public f(com.jiubang.commerce.ad.j.a a1, Context context)
    {
        a = a1;
        super(context);
        a();
    }

    private void a()
    {
        LayoutInflater.from(com.jiubang.commerce.ad.j.a.d(a)).inflate(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).b("ad_activation_guide_dialog_layout"), this);
        a(a, (LinearLayout)findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("ad_activation_top_layout")));
        a(a, (GridView)findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_recommends")));
        int i = d.b(com.jiubang.commerce.ad.j.a.d(a));
        if (d.a(56F) * 4 + d.a(10F) * 3 > i)
        {
            com.jiubang.commerce.ad.j.a.e(a).setNumColumns(3);
        } else
        {
            com.jiubang.commerce.ad.j.a.e(a).setNumColumns(4);
        }
        a(a, new a(com.jiubang.commerce.ad.j.a.d(a), a, com.jiubang.commerce.ad.j.a.f(a)));
        com.jiubang.commerce.ad.j.a.e(a).setAdapter(com.jiubang.commerce.ad.j.a.g(a));
        com.jiubang.commerce.ad.j.a.e(a).setSelector(new ColorDrawable(0));
        a(a, (TextView)findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_installed_app_name_textview")));
        a(a, findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_refresh")));
        com.jiubang.commerce.ad.j.a.c(a).setOnClickListener(this);
        a(a, (ProgressBar)findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("ad_refresh_progressbar")));
        com.jiubang.commerce.ad.j.a.b(a, findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_cancel")));
        com.jiubang.commerce.ad.j.a.h(a).setOnClickListener(this);
        com.jiubang.commerce.ad.j.a.c(a, findViewById(com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_open")));
        com.jiubang.commerce.ad.j.a.i(a).setOnClickListener(this);
    }

    private boolean a(MotionEvent motionevent)
    {
        return motionevent.getY() >= (float)getTop();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        keyevent.getKeyCode();
        JVM INSTR lookupswitch 2: default 32
    //                   4: 38
    //                   82: 38;
           goto _L1 _L2 _L2
_L1:
        return super.dispatchKeyEvent(keyevent);
_L2:
        a.b();
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onClick(View view)
    {
        if (view != null)
        {
            int i = view.getId();
            if (i == com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_cancel"))
            {
                a.b();
                return;
            }
            if (i == com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_open"))
            {
                b.g(com.jiubang.commerce.ad.j.a.d(a), com.jiubang.commerce.ad.j.a.j(a));
                Context context = com.jiubang.commerce.ad.j.a.d(a);
                String s;
                String s1;
                if (com.jiubang.commerce.ad.j.a.k(a) != null)
                {
                    view = (String)com.jiubang.commerce.ad.j.a.k(a).get(Integer.valueOf(1));
                } else
                {
                    view = "";
                }
                if (com.jiubang.commerce.ad.j.a.k(a) != null)
                {
                    s = (String)com.jiubang.commerce.ad.j.a.k(a).get(Integer.valueOf(6));
                } else
                {
                    s = "";
                }
                if (com.jiubang.commerce.ad.j.a.k(a) != null)
                {
                    s1 = (String)com.jiubang.commerce.ad.j.a.k(a).get(Integer.valueOf(8));
                } else
                {
                    s1 = "";
                }
                com.jiubang.commerce.b.b.b(context, "av_a000", view, s, s1, com.jiubang.commerce.ad.j.a.j(a));
                if (com.jiubang.commerce.ad.j.a.k(a) != null)
                {
                    com.jiubang.commerce.ad.j.a.k(a).clear();
                    a(a, null);
                }
                a.b();
                return;
            }
            if (i == com.jiubang.commerce.ad.f.a(com.jiubang.commerce.ad.j.a.d(a)).a("dialog_refresh") && !a(a))
            {
                a(a, true);
                a.();
                return;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!a(motionevent))
        {
            a.b();
            return true;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }
}
