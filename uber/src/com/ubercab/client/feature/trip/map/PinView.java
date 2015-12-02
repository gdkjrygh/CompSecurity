// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import gan;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            ETACircleView

public class PinView extends FrameLayout
{

    private int a;
    private int b;
    private Integer c;
    private Integer d;
    private String e;
    private boolean f;
    private Set g;
    ETACircleView mEtaCircleView;
    ImageView mImageViewPin;
    TextView mTextViewCapacity;
    TextView mTextViewEtaLabel;
    TextView mTextViewEtaNumber;
    TextView mTextViewPickup;
    View mViewCircleArrow;
    ViewGroup mViewGroupCapacityPopup;
    ViewGroup mViewGroupEta;
    ViewGroup mViewGroupLowAccuracy;
    ViewGroup mViewGroupPin;
    View mViewPinButton;

    public PinView(Context context)
    {
        this(context, null);
    }

    public PinView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        g = new HashSet();
        context = getResources();
        a = context.getInteger(0x7f0b0010);
        b = context.getDimensionPixelSize(0x7f080195);
    }

    static Set a(PinView pinview)
    {
        return pinview.g;
    }

    private void a(View view, boolean flag)
    {
        if (view.getAlpha() == 1.0F)
        {
            return;
        }
        if (!flag)
        {
            view.setAlpha(1.0F);
            view.setClickable(true);
            mEtaCircleView.a(true);
            return;
        } else
        {
            view.animate().alpha(1.0F).setListener(new AnimatorListenerAdapter(view) {

                final View a;
                final PinView b;

                public final void onAnimationStart(Animator animator)
                {
                    a.setClickable(true);
                    b.mEtaCircleView.a(true);
                }

            
            {
                b = PinView.this;
                a = view;
                super();
            }
            }).start();
            return;
        }
    }

    private void b(View view, boolean flag)
    {
        if (view.getAlpha() == 0.0F)
        {
            view.setClickable(false);
            return;
        }
        if (!flag)
        {
            view.setAlpha(0.0F);
            view.setClickable(false);
            mEtaCircleView.a(false);
            return;
        } else
        {
            view.animate().alpha(0.0F).setListener(new AnimatorListenerAdapter(view) {

                final View a;
                final PinView b;

                public final void onAnimationEnd(Animator animator)
                {
                    b.mEtaCircleView.a(false);
                }

                public final void onAnimationStart(Animator animator)
                {
                    a.setClickable(false);
                }

            
            {
                b = PinView.this;
                a = view;
                super();
            }
            }).start();
            return;
        }
    }

    public final float a(int l, int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        mViewGroupPin.measure(k1, k1);
        float f1 = l;
        f1 = ((float)(j1 - l - i1) / 2.0F + f1) - (float)mViewGroupPin.getMeasuredHeight();
        if (mViewGroupPin.getVisibility() == 0)
        {
            mViewGroupPin.animate().translationY(f1).setInterpolator(new DecelerateInterpolator()).setDuration(a).start();
            return f1;
        } else
        {
            mViewGroupPin.setTranslationY(f1);
            return f1;
        }
    }

    public final int a()
    {
        int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        mViewGroupPin.measure(l, l);
        return mViewGroupPin.getMeasuredHeight();
    }

    public final void a(int l)
    {
        mViewGroupEta.setVisibility(l);
        mViewCircleArrow.setVisibility(l);
        if (c == null || d == null)
        {
            c = Integer.valueOf(mTextViewPickup.getPaddingLeft());
            d = Integer.valueOf(mTextViewPickup.getPaddingRight());
        }
        int l1 = c.intValue();
        int k1 = d.intValue();
        int j1 = k1;
        int i1 = l1;
        if (l == 8)
        {
            i1 = l1 + b;
            j1 = k1 + b;
        }
        mTextViewPickup.setPadding(i1, mTextViewPickup.getPaddingTop(), j1, mTextViewPickup.getPaddingBottom());
    }

    public final void a(gan gan1)
    {
        g.add(gan1);
    }

    public final void a(String s)
    {
        e = s;
        if (!f)
        {
            mTextViewPickup.setText(e);
        }
    }

    public final void a(String s, String s1)
    {
        mTextViewEtaNumber.setText(s);
        mTextViewEtaLabel.setText(s1);
        mTextViewEtaLabel.setVisibility(0);
    }

    public final void a(boolean flag)
    {
        b(mViewPinButton, flag);
    }

    public final int b()
    {
        if (!mViewGroupLowAccuracy.isShown() || !mViewGroupPin.isShown())
        {
            return 0;
        } else
        {
            int l = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            mViewPinButton.measure(l, l);
            mViewGroupLowAccuracy.measure(l, l);
            return mViewGroupLowAccuracy.getMeasuredHeight() - mViewPinButton.getMeasuredHeight();
        }
    }

    public final void b(int l)
    {
        mTextViewCapacity.setText(String.valueOf(l));
    }

    public final void b(gan gan1)
    {
        g.remove(gan1);
    }

    public final void b(boolean flag)
    {
        b(((View) (mViewGroupCapacityPopup)), flag);
    }

    public final void c()
    {
        if (mViewGroupLowAccuracy.getVisibility() != 0 || mViewGroupLowAccuracy.getAlpha() <= 0.0F)
        {
            mViewGroupLowAccuracy.setAlpha(0.0F);
            mViewGroupLowAccuracy.setVisibility(0);
            mViewGroupLowAccuracy.animate().alpha(1.0F).start();
            Iterator iterator = g.iterator();
            while (iterator.hasNext()) 
            {
                ((gan)iterator.next()).c();
            }
        }
    }

    public final void c(boolean flag)
    {
        mEtaCircleView.b(flag);
    }

    public final void d()
    {
        if (mViewGroupLowAccuracy.isShown() && mViewGroupLowAccuracy.getAlpha() != 0.0F)
        {
            mViewGroupLowAccuracy.setVisibility(8);
            mViewGroupLowAccuracy.setAlpha(0.0F);
            Iterator iterator = g.iterator();
            while (iterator.hasNext()) 
            {
                ((gan)iterator.next()).c();
            }
        }
    }

    public final void d(boolean flag)
    {
        f = flag;
        ImageView imageview = mImageViewPin;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
        if (flag)
        {
            mTextViewPickup.setText(getResources().getString(0x7f0701ec).toUpperCase());
            return;
        } else
        {
            mTextViewPickup.setText(e);
            return;
        }
    }

    public final void e()
    {
        mViewGroupPin.animate().alpha(1.0F).setListener(new AnimatorListenerAdapter() {

            final PinView a;

            public final void onAnimationStart(Animator animator)
            {
                a.mViewGroupPin.setVisibility(0);
            }

            
            {
                a = PinView.this;
                super();
            }
        }).start();
    }

    public final void f()
    {
        mViewGroupPin.animate().alpha(0.0F).setListener(new AnimatorListenerAdapter() {

            final PinView a;

            public final void onAnimationEnd(Animator animator)
            {
                a.mViewGroupPin.setVisibility(8);
            }

            
            {
                a = PinView.this;
                super();
            }
        }).start();
    }

    public final void g()
    {
        b(false);
        a(mViewPinButton, false);
    }

    public final void h()
    {
        a(true);
        a(mViewGroupCapacityPopup, true);
    }

    public final void i()
    {
        mTextViewEtaNumber.setText("--");
        mTextViewEtaLabel.setVisibility(8);
    }

    public final View j()
    {
        return mViewGroupPin;
    }

    public final boolean k()
    {
        return mViewPinButton.isShown() && mViewPinButton.getAlpha() != 0.0F;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        mViewPinButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PinView a;

            public final void onClick(View view)
            {
                for (view = PinView.a(a).iterator(); view.hasNext(); ((gan)view.next()).d()) { }
            }

            
            {
                a = PinView.this;
                super();
            }
        });
        mViewGroupCapacityPopup.setOnClickListener(new android.view.View.OnClickListener() {

            final PinView a;

            public final void onClick(View view)
            {
                for (view = PinView.a(a).iterator(); view.hasNext(); ((gan)view.next()).g()) { }
            }

            
            {
                a = PinView.this;
                super();
            }
        });
    }
}
