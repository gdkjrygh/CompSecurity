// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.prediction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import dci;
import gda;
import gkg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DestinationPredictionView extends LinearLayout
{

    private static final Map a;
    private final Set b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private AnimatorSet j;
    private AnimatorListenerAdapter k;
    private AnimatorSet l;
    private AnimatorListenerAdapter m;
    ImageView mIconView;
    TextView mTextView;
    private Runnable n = new Runnable() {

        final DestinationPredictionView a;

        public final void run()
        {
            DestinationPredictionView.a(a);
        }

            
            {
                a = DestinationPredictionView.this;
                super();
            }
    };
    private Runnable o = new Runnable() {

        final DestinationPredictionView a;

        public final void run()
        {
            DestinationPredictionView.b(a);
        }

            
            {
                a = DestinationPredictionView.this;
                super();
            }
    };

    public DestinationPredictionView(Context context)
    {
        this(context, null);
    }

    public DestinationPredictionView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DestinationPredictionView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new HashSet();
        e = getResources().getDimensionPixelSize(0x7f080082);
        h = -getResources().getDimensionPixelSize(0x7f080089);
        i = getResources().getDimensionPixelSize(0x7f080089);
    }

    static void a(DestinationPredictionView destinationpredictionview)
    {
        destinationpredictionview.e();
    }

    static void b(DestinationPredictionView destinationpredictionview)
    {
        destinationpredictionview.f();
    }

    private void c()
    {
        if (k == null)
        {
            k = new AnimatorListenerAdapter() {

                final DestinationPredictionView a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.setVisibility(8);
                }

                public final void onAnimationStart(Animator animator)
                {
                    a.setPivotX(a.getMeasuredWidth() / 2);
                    a.setPivotY(a.getMeasuredHeight() / 8);
                }

            
            {
                a = DestinationPredictionView.this;
                super();
            }
            };
        }
        if (j == null)
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "scaleX", new float[] {
                1.0F, 0.0F
            });
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "scaleY", new float[] {
                1.0F, 0.0F
            });
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
                getAlpha(), 0.0F
            });
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator2, objectanimator, objectanimator1
            });
            j = new AnimatorSet();
            j.playTogether(new Animator[] {
                animatorset
            });
            j.setDuration(50L);
            j.setInterpolator(new AccelerateInterpolator());
            j.addListener(k);
        }
    }

    static boolean c(DestinationPredictionView destinationpredictionview)
    {
        return destinationpredictionview.c;
    }

    private void d()
    {
        if (m == null)
        {
            m = new AnimatorListenerAdapter() {

                final DestinationPredictionView a;

                public final void onAnimationStart(Animator animator)
                {
                    if (DestinationPredictionView.c(a) || DestinationPredictionView.d(a))
                    {
                        int i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        a.measure(i1, k1);
                        DestinationPredictionView.e(a);
                        DestinationPredictionView.f(a);
                    }
                    int j1 = a.getMeasuredWidth() / 2;
                    a.setAlpha(0.0F);
                    a.setPivotX(j1);
                    a.setPivotY(0.0F);
                    a.setTranslationY(DestinationPredictionView.g(a));
                    a.setVisibility(0);
                }

            
            {
                a = DestinationPredictionView.this;
                super();
            }
            };
        }
        if (l == null)
        {
            Object obj = ObjectAnimator.ofFloat(this, "scaleX", new float[] {
                0.0F, 1.0F
            });
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "scaleY", new float[] {
                0.0F, 1.0F
            });
            ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
                getAlpha(), 1.0F
            });
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "translationY", new float[] {
                getTranslationY(), (float)i
            });
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator2, obj, objectanimator1
            });
            animatorset.setDuration(300L);
            obj = new AnimatorSet();
            ((AnimatorSet) (obj)).setDuration(500L);
            ((AnimatorSet) (obj)).playTogether(new Animator[] {
                objectanimator
            });
            l = new AnimatorSet();
            l.playTogether(new Animator[] {
                animatorset, obj
            });
            l.setStartDelay(0L);
            l.setInterpolator(new AccelerateDecelerateInterpolator());
            l.addListener(m);
        }
    }

    static boolean d(DestinationPredictionView destinationpredictionview)
    {
        return destinationpredictionview.d;
    }

    private void e()
    {
        c();
        if (!j.isRunning() && !j.isStarted())
        {
            if (l != null && l.isRunning())
            {
                l.cancel();
            }
            if (getVisibility() != 8)
            {
                j.start();
            }
        }
    }

    static boolean e(DestinationPredictionView destinationpredictionview)
    {
        destinationpredictionview.c = false;
        return false;
    }

    private void f()
    {
        d();
        if (!l.isRunning() && !l.isStarted())
        {
            if (j != null && j.isRunning())
            {
                j.cancel();
            }
            if (getVisibility() != 0)
            {
                l.start();
            }
        }
    }

    static boolean f(DestinationPredictionView destinationpredictionview)
    {
        destinationpredictionview.d = false;
        return false;
    }

    static int g(DestinationPredictionView destinationpredictionview)
    {
        return destinationpredictionview.h;
    }

    public final void a()
    {
        postDelayed(n, f);
    }

    public final void a(int i1)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)getLayoutParams();
        i1 = e + i1;
        if (layoutparams.topMargin == i1)
        {
            return;
        } else
        {
            layoutparams.topMargin = i1;
            setLayoutParams(layoutparams);
            return;
        }
    }

    public final void a(dci dci1)
    {
        if (mIconView.getTag() == dci1)
        {
            return;
        } else
        {
            mIconView.setImageResource(((Integer)a.get(dci1)).intValue());
            mIconView.setTag(dci1);
            c = true;
            return;
        }
    }

    public final void a(gda gda1)
    {
        b.add(gda1);
    }

    public final void a(String s)
    {
        if (mTextView.getText().toString().equals(s))
        {
            return;
        } else
        {
            mTextView.setText(s);
            d = true;
            return;
        }
    }

    public final void b()
    {
        postDelayed(o, g);
    }

    public void onClick()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((gda)iterator.next()).b()) { }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

    static 
    {
        a = gkg.a(dci.a, Integer.valueOf(0x7f02011f), dci.b, Integer.valueOf(0x7f020120), dci.c, Integer.valueOf(0x7f020121));
    }
}
