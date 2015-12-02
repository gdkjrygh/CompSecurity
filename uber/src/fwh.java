// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import com.ubercab.client.core.app.RiderActivity;

public abstract class fwh
{

    private View a;
    private ViewGroup b;
    private final RiderActivity c;

    fwh(RiderActivity rideractivity)
    {
        c = rideractivity;
    }

    protected static int a(Activity activity)
    {
        int l = cwu.a(activity);
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return l - rect.top;
    }

    abstract void a(int l);

    public final void a(ViewGroup viewgroup)
    {
        b = viewgroup;
    }

    public boolean a()
    {
        return a == null;
    }

    protected void c()
    {
        if (a != null && b != null)
        {
            b.removeView(a);
            a = null;
        }
    }

    abstract View d();

    public final View e()
    {
        return a;
    }

    public final RiderActivity f()
    {
        return c;
    }

    public final ViewGroup g()
    {
        return b;
    }

    public final boolean h()
    {
        if (a == null)
        {
            return false;
        } else
        {
            k();
            return true;
        }
    }

    final void i()
    {
        if (a == null)
        {
            a = d();
            b.addView(a);
            a.setOnClickListener(new android.view.View.OnClickListener() {

                final fwh a;

                public final void onClick(View view)
                {
                    a.k();
                }

            
            {
                a = fwh.this;
                super();
            }
            });
        }
    }

    final void j()
    {
        ObjectAnimator.ofFloat(a, "alpha", new float[] {
            0.0F, 1.0F
        }).start();
    }

    void k()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.animate().alpha(0.0F).setListener(new AnimatorListenerAdapter() {

                final fwh a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.c();
                }

            
            {
                a = fwh.this;
                super();
            }
            }).start();
            return;
        }
    }
}
