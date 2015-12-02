// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.summary;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import dru;
import gjz;

public class TripSummaryTabView extends RelativeLayout
{

    int a;
    int b;
    boolean c;
    boolean d;
    private final Animation e;
    private final Animation f;
    View mContentContainer;
    TextView mFooter;
    TextView mTabContent;

    public TripSummaryTabView(Context context)
    {
        this(context, null);
    }

    public TripSummaryTabView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripSummaryTabView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = true;
        d = true;
        e = AnimationUtils.loadAnimation(context, 0x7f04001c);
        f = AnimationUtils.loadAnimation(context, 0x7f040019);
    }

    static Animation a(TripSummaryTabView tripsummarytabview)
    {
        return tripsummarytabview.f;
    }

    public final float a()
    {
        return ((android.widget.LinearLayout.LayoutParams)getLayoutParams()).weight;
    }

    public final void a(float f1)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getLayoutParams();
        layoutparams.weight = f1;
        setLayoutParams(layoutparams);
    }

    public final void a(int i)
    {
        if (a != i)
        {
            a = i;
            if (c)
            {
                TextView textview = mTabContent;
                int j = a;
                if (d)
                {
                    i = b;
                } else
                {
                    i = 0;
                }
                textview.setCompoundDrawablesWithIntrinsicBounds(j, 0, i, 0);
                return;
            }
        }
    }

    public final void a(String s, boolean flag)
    {
        gjz.a(s);
        if (s.equals(mTabContent.getText()))
        {
            return;
        }
        if (!isShown() || b())
        {
            mTabContent.setText(s);
            s = mFooter;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            s.setVisibility(i);
            return;
        } else
        {
            e.setAnimationListener(new dru(s, flag) {

                final String a;
                final boolean b;
                final TripSummaryTabView c;

                public final void onAnimationEnd(Animation animation)
                {
                    c.mTabContent.setText(a);
                    animation = c.mFooter;
                    int j;
                    if (b)
                    {
                        j = 0;
                    } else
                    {
                        j = 8;
                    }
                    animation.setVisibility(j);
                    c.mContentContainer.startAnimation(TripSummaryTabView.a(c));
                }

            
            {
                c = TripSummaryTabView.this;
                a = s;
                b = flag;
                super();
            }
            });
            mContentContainer.startAnimation(e);
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (flag == c)
        {
            return;
        }
        c = flag;
        TextView textview = mTabContent;
        int i;
        int j;
        if (c)
        {
            i = a;
        } else
        {
            i = 0;
        }
        if (d)
        {
            j = b;
        } else
        {
            j = 0;
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(i, 0, j, 0);
    }

    public final void b(int i)
    {
        if (b != i)
        {
            b = i;
            if (d)
            {
                TextView textview = mTabContent;
                if (c)
                {
                    i = a;
                } else
                {
                    i = 0;
                }
                textview.setCompoundDrawablesWithIntrinsicBounds(i, 0, b, 0);
                return;
            }
        }
    }

    public final void b(boolean flag)
    {
        if (flag == d)
        {
            return;
        }
        d = flag;
        TextView textview = mTabContent;
        int i;
        int j;
        if (c)
        {
            i = a;
        } else
        {
            i = 0;
        }
        if (d)
        {
            j = b;
        } else
        {
            j = 0;
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(i, 0, j, 0);
    }

    public final boolean b()
    {
        return TextUtils.isEmpty(mTabContent.getText());
    }

    public final boolean c()
    {
        return d;
    }

    public boolean isShown()
    {
        return getVisibility() == 0;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }
}
