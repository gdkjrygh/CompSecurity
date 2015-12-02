// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fpu
{

    private final fte a;
    private final int b;
    private final boolean c;
    private final Set d = new HashSet();
    private final Handler e = new Handler();
    private final Runnable f = new Runnable() {

        final fpu a;

        public final void run()
        {
            fpu.a(a);
        }

            
            {
                a = fpu.this;
                super();
            }
    };
    private ViewGroup g;
    private ViewGroup h;
    private View i;
    private int j;
    private AnimatorSet k;
    private AnimatorSet l;

    public fpu(RiderActivity rideractivity, gmg gmg1, cyg cyg1, fte fte1)
    {
        j = 0;
        b = duz.a(rideractivity);
        c = a(gmg1, cyg1);
        a = fte1;
    }

    static void a(fpu fpu1)
    {
        fpu1.f();
    }

    private static boolean a(gmg gmg1, cyg cyg1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (gmg1.a(dbf.bL))
        {
            if (gmg1.a(dbf.bK) && cyg1.a() > 2013)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        flag1 = gmg1.a(dbf.bK);
        flag2 = gmg1.a(dbf.bD);
        return flag && (flag2 || flag1);
    }

    static ViewGroup b(fpu fpu1)
    {
        return fpu1.g;
    }

    static View c(fpu fpu1)
    {
        return fpu1.i;
    }

    static ViewGroup d(fpu fpu1)
    {
        return fpu1.h;
    }

    private void d()
    {
        if (c)
        {
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) 
            {
                ((fpv)iterator.next()).a(j);
            }
        }
    }

    private void e()
    {
        if (j == 3 || j == 4)
        {
            if (k == null)
            {
                k = new AnimatorSet();
                ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                    g.getTranslationY(), 0.0F
                });
                valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final fpu a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator3)
                    {
                        fpu.b(a).setTranslationY(((Float)valueanimator3.getAnimatedValue()).floatValue());
                    }

            
            {
                a = fpu.this;
                super();
            }
                });
                ValueAnimator valueanimator1 = ValueAnimator.ofFloat(new float[] {
                    i.getTranslationY(), 0.0F
                });
                valueanimator1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final fpu a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator3)
                    {
                        fpu.c(a).setTranslationY(((Float)valueanimator3.getAnimatedValue()).floatValue());
                    }

            
            {
                a = fpu.this;
                super();
            }
                });
                ValueAnimator valueanimator2 = ValueAnimator.ofFloat(new float[] {
                    h.getTranslationY(), 0.0F
                });
                valueanimator2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final fpu a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator3)
                    {
                        fpu.d(a).setTranslationY(((Float)valueanimator3.getAnimatedValue()).floatValue());
                    }

            
            {
                a = fpu.this;
                super();
            }
                });
                k.addListener(new AnimatorListenerAdapter() {

                    boolean a;
                    final fpu b;

                    public final void onAnimationCancel(Animator animator)
                    {
                        a = true;
                    }

                    public final void onAnimationEnd(Animator animator)
                    {
                        if (!a)
                        {
                            b.a(2);
                        }
                        a = false;
                    }

                    public final void onAnimationStart(Animator animator)
                    {
                        b.a(1);
                    }

            
            {
                b = fpu.this;
                super();
                a = false;
            }
                });
                k.setInterpolator(new FastOutSlowInInterpolator());
                k.playTogether(new Animator[] {
                    valueanimator, valueanimator1, valueanimator2
                });
                k.setDuration(300L);
            }
            if (!k.isRunning() && !k.isStarted())
            {
                g();
                k.start();
                return;
            }
        }
    }

    private void f()
    {
        if (j != 3 && j != 4)
        {
            if (l == null)
            {
                l = new AnimatorSet();
                ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                    0.0F, (float)(-b)
                });
                valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final fpu a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator3)
                    {
                        fpu.b(a).setTranslationY(((Float)valueanimator3.getAnimatedValue()).floatValue());
                    }

            
            {
                a = fpu.this;
                super();
            }
                });
                ValueAnimator valueanimator1 = ValueAnimator.ofFloat(new float[] {
                    0.0F, (float)(-b)
                });
                valueanimator1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final fpu a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator3)
                    {
                        fpu.c(a).setTranslationY(((Float)valueanimator3.getAnimatedValue()).floatValue());
                    }

            
            {
                a = fpu.this;
                super();
            }
                });
                ValueAnimator valueanimator2 = ValueAnimator.ofFloat(new float[] {
                    0.0F, (float)h.getMeasuredHeight()
                });
                valueanimator2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final fpu a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator3)
                    {
                        fpu.d(a).setTranslationY(((Float)valueanimator3.getAnimatedValue()).floatValue());
                    }

            
            {
                a = fpu.this;
                super();
            }
                });
                l.setInterpolator(new FastOutSlowInInterpolator());
                l.playTogether(new Animator[] {
                    valueanimator, valueanimator1, valueanimator2
                });
                l.setDuration(300L);
                l.addListener(new AnimatorListenerAdapter() {

                    boolean a;
                    final fpu b;

                    public final void onAnimationCancel(Animator animator)
                    {
                        a = true;
                    }

                    public final void onAnimationEnd(Animator animator)
                    {
                        if (!a)
                        {
                            b.a(4);
                        }
                        a = false;
                    }

                    public final void onAnimationStart(Animator animator)
                    {
                        b.a(3);
                    }

            
            {
                b = fpu.this;
                super();
                a = false;
            }
                });
            }
            if (!l.isRunning() && !l.isStarted())
            {
                g();
                l.start();
                return;
            }
        }
    }

    private void g()
    {
        if (l != null)
        {
            l.cancel();
        }
        if (k != null)
        {
            k.cancel();
        }
    }

    private void h()
    {
        e.postDelayed(f, 300L);
    }

    public final void a()
    {
        boolean flag;
        if (fte.d(a.g()) || fte.e(a.g()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!c || !flag)
        {
            return;
        } else
        {
            h();
            return;
        }
    }

    final void a(int i1)
    {
        if (i1 == j)
        {
            return;
        } else
        {
            j = i1;
            d();
            return;
        }
    }

    public final void a(View view, ViewGroup viewgroup, ViewGroup viewgroup1)
    {
        i = view;
        g = viewgroup;
        h = viewgroup1;
    }

    public final void a(fpv fpv1)
    {
        if (!c)
        {
            return;
        } else
        {
            d.add(fpv1);
            return;
        }
    }

    public final void b()
    {
        if (!c)
        {
            return;
        } else
        {
            e.removeCallbacks(f);
            e();
            return;
        }
    }

    public final void b(fpv fpv1)
    {
        if (!c)
        {
            return;
        } else
        {
            d.remove(fpv1);
            return;
        }
    }

    public final void c()
    {
        e.removeCallbacks(f);
    }
}
