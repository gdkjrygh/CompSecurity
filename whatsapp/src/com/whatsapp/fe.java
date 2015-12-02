// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.whatsapp.util.bq;

// Referenced classes of package com.whatsapp:
//            auy, a1g, iz, aog, 
//            afn, App, za

public class fe extends PopupWindow
{

    private boolean a;
    private ViewGroup b;
    private za c;
    private Activity d;
    private View e;
    private boolean f;
    private android.widget.PopupWindow.OnDismissListener g;
    private afn h;

    public fe(Activity activity)
    {
        super(activity);
        f = true;
        g = new auy(this);
        d = activity;
        a1g a1g1 = a1g.a();
        EmojiPopupWindow._cls2 _lcls2 = new EmojiPopupWindow._cls2(this, activity);
        iz.a(activity.getLayoutInflater(), 0x7f030063, _lcls2, true);
        b = (ViewGroup)_lcls2.findViewById(0x7f0b01c2);
        b.getLayoutParams().height = -1;
        b.setVisibility(0);
        setContentView(_lcls2);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchInterceptor(new aog(this));
        setOnDismissListener(g);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        h = new afn(activity, b);
        activity = activity.getWindowManager().getDefaultDisplay();
        int i;
        int j;
        int k;
        if ((float)activity.getWidth() > a1g1.g * 480F)
        {
            i = (int)(a1g1.g * 480F);
        } else
        {
            i = activity.getWidth();
        }
        k = (i - a1g1.E - a1g1.x - ViewConfiguration.getScrollBarSize()) / a1g1.e;
        if (App.aR())
        {
            i = a1g1.E;
        } else
        {
            i = a1g1.x;
        }
        if (App.aR())
        {
            j = a1g1.x;
        } else
        {
            j = a1g1.E;
        }
        _lcls2.setPadding(i, 0, j, a1g1.d);
        h.b(k);
    }

    static Activity a(fe fe1)
    {
        return fe1.d;
    }

    static View b(fe fe1)
    {
        return fe1.e;
    }

    public void a(Configuration configuration)
    {
    }

    public void a(View view)
    {
        Object obj;
        int ai[];
        Display display;
        int k;
        int j1;
label0:
        {
            j1 = App.am;
            e = view;
            obj = a1g.a();
            k = (int)(-8F * ((a1g) (obj)).g);
            int i = view.getHeight();
            ai = new int[2];
            view.getLocationOnScreen(ai);
            int l = ai[1];
            display = d.getWindowManager().getDefaultDisplay();
            if (i + l + k > (display.getHeight() * 2) / 3)
            {
                setHeight(ai[1] + k * 2);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            setHeight(-2);
        }
label1:
        {
            if ((float)display.getWidth() > ((a1g) (obj)).g * 480F)
            {
                setWidth((int)(((a1g) (obj)).g * 480F));
                if (j1 == 0)
                {
                    break label1;
                }
            }
            setWidth(-1);
        }
        int j;
        boolean flag;
label2:
        {
label3:
            {
                int i1;
                boolean flag1;
                if ((float)display.getWidth() > ((a1g) (obj)).g * 480F)
                {
                    j = (int)(((a1g) (obj)).g * 480F);
                } else
                {
                    j = display.getWidth();
                }
                i1 = (j - ((a1g) (obj)).E - ((a1g) (obj)).x - ViewConfiguration.getScrollBarSize()) / ((a1g) (obj)).e;
                setOnDismissListener(g);
                showAsDropDown(view, 0, k);
                flag1 = isAboveAnchor();
                if (flag1 == a)
                {
                    break label2;
                }
                view = (RelativeLayout)getContentView();
                view.removeAllViews();
                if (flag1)
                {
                    d.getLayoutInflater().inflate(0x7f030064, view, true);
                    int k1;
                    if (App.aR())
                    {
                        j = ((a1g) (obj)).E;
                    } else
                    {
                        j = ((a1g) (obj)).x;
                    }
                    k1 = ((a1g) (obj)).d;
                    if (App.aR())
                    {
                        k = ((a1g) (obj)).x;
                    } else
                    {
                        k = ((a1g) (obj)).E;
                    }
                    view.setPadding(j, k1, k, 0);
                    if (j1 == 0)
                    {
                        break label3;
                    }
                }
                d.getLayoutInflater().inflate(0x7f030063, view, true);
                if (App.aR())
                {
                    j = ((a1g) (obj)).E;
                } else
                {
                    j = ((a1g) (obj)).x;
                }
                if (App.aR())
                {
                    k = ((a1g) (obj)).x;
                } else
                {
                    k = ((a1g) (obj)).E;
                }
                view.setPadding(j, 0, k, ((a1g) (obj)).d);
            }
            iz.a(view);
            b = (ViewGroup)view.findViewById(0x7f0b01c2);
            b.getLayoutParams().height = -1;
            b.setVisibility(0);
            h = new afn(d, b);
            h.a(c);
        }
        if (ai[0] >= display.getWidth() / 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != f || flag1 != a)
        {
            view = d.getResources();
            if (flag1)
            {
                j = 0x7f0204d8;
            } else
            {
                j = 0x7f0204d7;
            }
            view = view.getDrawable(j);
            obj = h;
            if (!flag)
            {
                view = new bq(view);
            }
            ((afn) (obj)).a(view);
        }
        a = flag1;
        f = flag;
        h.b(i1);
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        g = ondismisslistener;
        setOnDismissListener(ondismisslistener);
    }

    public void a(za za)
    {
        c = za;
        h.a(za);
    }
}
