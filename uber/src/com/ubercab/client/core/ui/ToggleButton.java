// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import dtc;
import dtd;
import gjz;

// Referenced classes of package com.ubercab.client.core.ui:
//            ToggleButtonItem

public class ToggleButton extends LinearLayout
{

    ObjectAnimator a;
    ObjectAnimator b;
    AnimatorSet c;
    AnimatorSet d;
    private final dtd e;
    private final Resources f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private dtc m;
    TextView mFootnote;
    ToggleButtonItem mLeftItem;
    ToggleButtonItem mRightItem;

    public ToggleButton(Context context)
    {
        this(context, null);
    }

    public ToggleButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ToggleButton(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new dtd(this, (byte)0);
        f = getResources();
        g = f.getColor(0x7f0d0078);
        h = f.getColor(0x7f0d0082);
        i = f.getColor(0x7f0d007b);
        j = f.getColor(0x7f0d008e);
        k = f.getColor(0x7f0d0084);
        l = f.getColor(0x7f0d0071);
    }

    private ValueAnimator a(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(j), Integer.valueOf(l)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mRightItem.a(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private ValueAnimator b(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(k)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mRightItem.b(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private void b()
    {
        if (!mLeftItem.isSelected())
        {
            c.start();
        }
    }

    private ValueAnimator c(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(l), Integer.valueOf(j)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mLeftItem.a(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private void c()
    {
        int i1 = f.getDimensionPixelSize(0x7f080258);
        int j1 = f.getInteger(0x7f0b000c);
        b = ObjectAnimator.ofInt(e, "textViewHeight", new int[] {
            0, i1
        });
        b.setDuration(j1);
        b.setInterpolator(new DecelerateInterpolator());
        b.addListener(new AnimatorListenerAdapter() {

            final ToggleButton a;

            public final void onAnimationStart(Animator animator)
            {
                a.mFootnote.setVisibility(0);
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        a = ObjectAnimator.ofInt(e, "textViewHeight", new int[] {
            i1, 0
        });
        a.setDuration(j1);
        a.setInterpolator(new DecelerateInterpolator());
        a.addListener(new AnimatorListenerAdapter() {

            final ToggleButton a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mFootnote.setVisibility(8);
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
    }

    private ValueAnimator d(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(k), Integer.valueOf(i)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mLeftItem.b(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private void d()
    {
        int i1 = f.getInteger(0x7f0b0010);
        ObjectAnimator objectanimator = f(i1);
        ObjectAnimator objectanimator1 = e(i1);
        ValueAnimator valueanimator = d(i1);
        ValueAnimator valueanimator1 = c(i1);
        ValueAnimator valueanimator2 = b(i1);
        ValueAnimator valueanimator3 = a(i1);
        c = new AnimatorSet();
        c.playTogether(new Animator[] {
            objectanimator, objectanimator1, valueanimator, valueanimator1, valueanimator2, valueanimator3
        });
    }

    private ObjectAnimator e(int i1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofObject(mRightItem, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(g), Integer.valueOf(h)
        });
        objectanimator.setDuration(i1);
        objectanimator.addListener(new AnimatorListenerAdapter() {

            final ToggleButton a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mRightItem.setSelected(false);
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return objectanimator;
    }

    private void e()
    {
        int i1 = f.getInteger(0x7f0b0010);
        ObjectAnimator objectanimator = g(i1);
        ObjectAnimator objectanimator1 = h(i1);
        ValueAnimator valueanimator = i(i1);
        ValueAnimator valueanimator1 = j(i1);
        ValueAnimator valueanimator2 = k(i1);
        ValueAnimator valueanimator3 = l(i1);
        d = new AnimatorSet();
        d.playTogether(new Animator[] {
            objectanimator, objectanimator1, valueanimator, valueanimator1, valueanimator2, valueanimator3
        });
    }

    private ObjectAnimator f(int i1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofObject(mLeftItem, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(h), Integer.valueOf(g)
        });
        objectanimator.setDuration(i1);
        objectanimator.addListener(new AnimatorListenerAdapter() {

            final ToggleButton a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mLeftItem.setSelected(true);
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return objectanimator;
    }

    private ObjectAnimator g(int i1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofObject(mRightItem, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(h), Integer.valueOf(g)
        });
        objectanimator.setDuration(i1);
        objectanimator.addListener(new AnimatorListenerAdapter() {

            final ToggleButton a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mRightItem.setSelected(true);
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return objectanimator;
    }

    private ObjectAnimator h(int i1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofObject(mLeftItem, "backgroundColor", new ArgbEvaluator(), new Object[] {
            Integer.valueOf(g), Integer.valueOf(h)
        });
        objectanimator.setDuration(i1);
        objectanimator.addListener(new AnimatorListenerAdapter() {

            final ToggleButton a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mLeftItem.setSelected(false);
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return objectanimator;
    }

    private ValueAnimator i(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(k)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mLeftItem.b(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private ValueAnimator j(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(j), Integer.valueOf(l)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mLeftItem.a(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private ValueAnimator k(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(k), Integer.valueOf(i)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mRightItem.b(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    private ValueAnimator l(int i1)
    {
        ValueAnimator valueanimator = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[] {
            Integer.valueOf(l), Integer.valueOf(j)
        });
        valueanimator.setDuration(i1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final ToggleButton a;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                a.mRightItem.a(((Integer)valueanimator1.getAnimatedValue()).intValue());
            }

            
            {
                a = ToggleButton.this;
                super();
            }
        });
        return valueanimator;
    }

    public final void a()
    {
        if (!mRightItem.isSelected())
        {
            d.start();
        }
    }

    public final void a(dtc dtc1)
    {
        m = (dtc)gjz.a(dtc1);
    }

    public final void a(String s)
    {
        mFootnote.setText((CharSequence)gjz.a(s));
    }

    public final void b(String s)
    {
        mLeftItem.b((String)gjz.a(s));
    }

    public final void c(String s)
    {
        mLeftItem.a((String)gjz.a(s));
    }

    public final void d(String s)
    {
        mRightItem.b((String)gjz.a(s));
    }

    public final void e(String s)
    {
        mRightItem.a((String)gjz.a(s));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
        c();
        d();
        e();
    }

    public void onLeftButtonClick()
    {
        b();
    }

    public void onRightButtonClick()
    {
        a();
    }
}
