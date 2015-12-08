// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.b.b;
import android.support.v7.b.c;
import android.support.v7.b.d;
import android.support.v7.media.ad;
import android.support.v7.media.s;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.app:
//            ab, y, v, x

public final class u extends Dialog
{

    private final android.support.v7.media.u a;
    private final y b;
    private final ad c;
    private boolean d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private LinearLayout i;
    private SeekBar j;
    private boolean k;
    private View l;
    private Button m;

    public u(Context context)
    {
        this(context, 0);
    }

    private u(Context context, int i1)
    {
        super(ab.a(context, true), 0);
        h = true;
        a = android.support.v7.media.u.a(getContext());
        b = new y(this, (byte)0);
        context = a;
        c = android.support.v7.media.u.c();
    }

    private boolean a()
    {
        if (!c.e() || c.f())
        {
            dismiss();
            return false;
        }
        setTitle(c.a());
        b();
        Drawable drawable;
        if (c.d())
        {
            if (e == null)
            {
                e = android.support.v7.app.ab.b(getContext(), b.c);
            }
            drawable = e;
        } else
        {
            if (f == null)
            {
                f = android.support.v7.app.ab.b(getContext(), b.e);
            }
            drawable = f;
        }
        if (drawable != g)
        {
            g = drawable;
            drawable.setVisible(false, true);
            getWindow().setFeatureDrawable(3, drawable);
        }
        return true;
    }

    static boolean a(u u1)
    {
        return u1.k;
    }

    static boolean a(u u1, boolean flag)
    {
        u1.k = flag;
        return flag;
    }

    private void b()
    {
label0:
        {
            boolean flag = true;
            if (!k)
            {
                if (!h || c.j() != 1)
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                i.setVisibility(0);
                j.setMax(c.l());
                j.setProgress(c.k());
            }
            return;
        }
        i.setVisibility(8);
    }

    static void b(u u1)
    {
        u1.b();
    }

    static SeekBar c(u u1)
    {
        return u1.j;
    }

    static ad d(u u1)
    {
        return u1.c;
    }

    static android.support.v7.media.u e(u u1)
    {
        return u1.a;
    }

    static boolean f(u u1)
    {
        return u1.a();
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.a(s.a, b, 2);
        a();
    }

    protected final void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            getWindow().requestFeature(3);
            setContentView(d.b);
            i = (LinearLayout)findViewById(c.d);
            j = (SeekBar)findViewById(c.e);
            j.setOnSeekBarChangeListener(new v(this));
            m = (Button)findViewById(c.b);
            m.setOnClickListener(new x(this));
            d = true;
            if (a())
            {
                l = null;
                bundle = (FrameLayout)findViewById(c.a);
                if (l == null)
                {
                    break label0;
                }
                bundle.addView(l);
                bundle.setVisibility(0);
            }
            return;
        }
        bundle.setVisibility(8);
    }

    public final void onDetachedFromWindow()
    {
        a.a(b);
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 25 || i1 == 24)
        {
            keyevent = c;
            if (i1 == 25)
            {
                i1 = -1;
            } else
            {
                i1 = 1;
            }
            keyevent.b(i1);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public final boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 25 || i1 == 24)
        {
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }
}
