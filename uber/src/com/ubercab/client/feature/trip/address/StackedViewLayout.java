// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import cwu;
import fue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackedViewLayout extends ViewGroup
{

    private static final int a = cwu.a(10);
    private final int b;
    private final Interpolator c;
    private final List d;
    private final android.animation.ValueAnimator.AnimatorUpdateListener e;
    private final android.animation.ValueAnimator.AnimatorUpdateListener f;
    private final android.animation.Animator.AnimatorListener g;
    private final android.animation.Animator.AnimatorListener h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private Animator n;
    private View o;
    private View p;

    public StackedViewLayout(Context context)
    {
        this(context, null);
    }

    public StackedViewLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public StackedViewLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new FastOutSlowInInterpolator();
        d = new ArrayList();
        e = new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final StackedViewLayout a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                StackedViewLayout.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                a.requestLayout();
            }

            
            {
                a = StackedViewLayout.this;
                super();
            }
        };
        f = new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final StackedViewLayout a;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                StackedViewLayout.b(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                a.requestLayout();
            }

            
            {
                a = StackedViewLayout.this;
                super();
            }
        };
        g = new AnimatorListenerAdapter() {

            final StackedViewLayout a;

            public final void onAnimationEnd(Animator animator)
            {
                StackedViewLayout.a(a);
            }

            
            {
                a = StackedViewLayout.this;
                super();
            }
        };
        h = new AnimatorListenerAdapter() {

            final StackedViewLayout a;

            public final void onAnimationEnd(Animator animator)
            {
                StackedViewLayout.c(a);
            }

            public final void onAnimationStart(Animator animator)
            {
                StackedViewLayout.b(a);
            }

            
            {
                a = StackedViewLayout.this;
                super();
            }
        };
        i = true;
        m = -1;
        b = context.getResources().getInteger(0x7f0b0008);
    }

    static int a(StackedViewLayout stackedviewlayout, int i1)
    {
        stackedviewlayout.l = i1;
        return i1;
    }

    private void a(int i1, int j1)
    {
label0:
        {
            boolean flag3 = true;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (i1 == 4 || i1 == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j1 == 4 || j1 == 3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (i1 == 2 || i1 == 1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (j1 == 2 || j1 == 1)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (flag)
            {
                flag2 = flag3;
                if (j1 != 0)
                {
                    break label0;
                }
            }
            if (i1 != 0 && flag1)
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
        }
        j = flag2;
    }

    private static void a(View view, int i1, int j1, int k1)
    {
        view.layout(i1, j1, k1, view.getMeasuredHeight() + j1);
    }

    static void a(StackedViewLayout stackedviewlayout)
    {
        stackedviewlayout.b();
    }

    static int b(StackedViewLayout stackedviewlayout, int i1)
    {
        stackedviewlayout.k = i1;
        return i1;
    }

    private void b()
    {
        if (m == 1 || m == 2)
        {
            bringChildToFront(p);
        }
        if (m == 3 || m == 4)
        {
            bringChildToFront(o);
        }
    }

    static void b(StackedViewLayout stackedviewlayout)
    {
        stackedviewlayout.i();
    }

    private void c()
    {
        if (n != null)
        {
            n.cancel();
        }
        Animator animator = d();
        Animator animator1 = e();
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            animator, animator1
        });
        animatorset.addListener(h);
        n = animatorset;
    }

    static void c(StackedViewLayout stackedviewlayout)
    {
        stackedviewlayout.j();
    }

    private Animator d()
    {
        if (j)
        {
            AnimatorSet animatorset = new AnimatorSet();
            int i1 = 0 - a;
            ValueAnimator valueanimator1 = ValueAnimator.ofInt(new int[] {
                l, i1
            });
            valueanimator1.addUpdateListener(e);
            valueanimator1.addListener(g);
            ValueAnimator valueanimator2 = ValueAnimator.ofInt(new int[] {
                i1, 0
            });
            valueanimator2.addUpdateListener(e);
            animatorset.setDuration(b / 2);
            animatorset.playSequentially(new Animator[] {
                valueanimator1, valueanimator2
            });
            animatorset.setInterpolator(c);
            return animatorset;
        } else
        {
            ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
                l, 0
            });
            valueanimator.setDuration(b);
            valueanimator.addUpdateListener(e);
            valueanimator.setInterpolator(c);
            return valueanimator;
        }
    }

    private Animator e()
    {
        int i1;
        int j1;
        i1 = g();
        j1 = h();
        if (j)
        {
            if (m == 2 || m == 4)
            {
                j1 = 0;
            }
            AnimatorSet animatorset = new AnimatorSet();
            ValueAnimator valueanimator1 = ValueAnimator.ofInt(new int[] {
                k, i1 - a
            });
            valueanimator1.addUpdateListener(f);
            ValueAnimator valueanimator2 = ValueAnimator.ofInt(new int[] {
                i1 - a, j1
            });
            valueanimator2.addUpdateListener(f);
            animatorset.setDuration(b / 2);
            animatorset.playSequentially(new Animator[] {
                valueanimator1, valueanimator2
            });
            animatorset.setInterpolator(c);
            return animatorset;
        }
        if (m != 0) goto _L2; else goto _L1
_L1:
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            k, i1
        });
        valueanimator.setDuration(b);
        valueanimator.addUpdateListener(f);
        valueanimator.setInterpolator(c);
        return valueanimator;
_L2:
        i1 = j1;
        if (m != 1)
        {
            i1 = j1;
            if (m != 3)
            {
                i1 = 0;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private int f()
    {
        if (m == 1 || m == 3)
        {
            return h();
        }
        if (m == 0)
        {
            return g();
        } else
        {
            return 0;
        }
    }

    private int g()
    {
        return o.getMeasuredHeight() - o.getPaddingBottom() - p.getPaddingTop();
    }

    private int h()
    {
        return o.getMeasuredHeight() / 2 - p.getPaddingTop();
    }

    private void i()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fue)iterator.next()).c()) { }
    }

    private void j()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fue)iterator.next()).d()) { }
    }

    public final int a()
    {
        return m;
    }

    public final void a(int i1)
    {
        if (m == i1)
        {
            return;
        } else
        {
            m = i1;
            j = false;
            k = f();
            l = 0;
            b();
            requestLayout();
            return;
        }
    }

    final void a(fue fue1)
    {
        d.add(fue1);
    }

    public final void b(int i1)
    {
        if (m == i1)
        {
            return;
        }
        a(m, i1);
        m = i1;
        c();
        if (!j)
        {
            b();
        }
        n.start();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (getChildCount() != 2)
        {
            throw new IllegalStateException("You must have only 2 child views defined in the layout.");
        } else
        {
            o = getChildAt(0);
            p = getChildAt(1);
            return;
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = getPaddingLeft();
        i1 = k1 - i1 - getPaddingRight();
        k1 = getPaddingTop();
        a(o, j1, l + k1, i1);
        a(p, j1, k1 + k, i1);
    }

    protected void onMeasure(int i1, int j1)
    {
        if (getVisibility() != 8)
        {
            measureChildren(i1, j1);
            j1 = 0;
            int k1;
            int l1;
            for (k1 = 0; j1 < getChildCount(); k1 = l1)
            {
                View view = getChildAt(j1);
                l1 = k1;
                if (view.getVisibility() != 8)
                {
                    l1 = k1 + view.getMeasuredHeight();
                }
                j1++;
            }

            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i1), k1 + getPaddingTop() + getPaddingBottom());
            if (i)
            {
                k = f();
                l = 0;
                i = false;
                return;
            }
        }
    }

}
