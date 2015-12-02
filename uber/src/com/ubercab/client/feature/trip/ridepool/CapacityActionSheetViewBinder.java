// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import gdh;
import gjz;
import java.util.List;

public class CapacityActionSheetViewBinder
{

    final ViewGroup a;
    private final Resources b;
    private final LayoutInflater c;
    private final gdh d;
    LinearLayout mCapacityActionSheetView;
    ViewGroup mViewGroupActions;

    public CapacityActionSheetViewBinder(Context context, ViewGroup viewgroup, gdh gdh1, List list)
    {
        c = LayoutInflater.from((Context)gjz.a(context));
        d = (gdh)gjz.a(gdh1);
        a = (ViewGroup)gjz.a(viewgroup);
        viewgroup = (LinearLayout)c.inflate(0x7f0301f3, a, false);
        b = context.getResources();
        ButterKnife.inject(this, viewgroup);
        a((List)gjz.a(list));
    }

    static gdh a(CapacityActionSheetViewBinder capacityactionsheetviewbinder)
    {
        return capacityactionsheetviewbinder.d;
    }

    private void a(List list)
    {
        gjz.a(list);
        mViewGroupActions.removeAllViews();
        for (int i = 0; i < list.size(); i++)
        {
            TextView textview = (TextView)c.inflate(0x7f0301cc, mViewGroupActions, false);
            mViewGroupActions.addView(textview);
            textview.setText((CharSequence)list.get(i));
            textview.setOnClickListener(new android.view.View.OnClickListener(i) {

                final int a;
                final CapacityActionSheetViewBinder b;

                public final void onClick(View view)
                {
                    CapacityActionSheetViewBinder.a(b).a(a);
                }

            
            {
                b = CapacityActionSheetViewBinder.this;
                a = i;
                super();
            }
            });
        }

    }

    public final void a()
    {
        if (c())
        {
            return;
        } else
        {
            a.addView(mCapacityActionSheetView);
            int i = mCapacityActionSheetView.getHeight();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mCapacityActionSheetView, "translationY", new float[] {
                (float)i, 0.0F
            });
            objectanimator.setInterpolator(new DecelerateInterpolator(2.0F));
            objectanimator.setDuration(b.getInteger(0x7f0b000c));
            objectanimator.addListener(new AnimatorListenerAdapter() {

                final CapacityActionSheetViewBinder a;

                public final void onAnimationStart(Animator animator)
                {
                    a.mCapacityActionSheetView.setVisibility(0);
                }

            
            {
                a = CapacityActionSheetViewBinder.this;
                super();
            }
            });
            objectanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(i) {

                final int a;
                final CapacityActionSheetViewBinder b;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    CapacityActionSheetViewBinder.a(b).a(valueanimator.getAnimatedFraction(), a);
                }

            
            {
                b = CapacityActionSheetViewBinder.this;
                a = i;
                super();
            }
            });
            objectanimator.start();
            return;
        }
    }

    public final void b()
    {
        if (!c())
        {
            return;
        } else
        {
            int i = mCapacityActionSheetView.getHeight();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mCapacityActionSheetView, "translationY", new float[] {
                0.0F, (float)i
            });
            objectanimator.setInterpolator(new DecelerateInterpolator(2.0F));
            objectanimator.setDuration(b.getInteger(0x7f0b000c));
            objectanimator.addListener(new AnimatorListenerAdapter() {

                final CapacityActionSheetViewBinder a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.mCapacityActionSheetView.setVisibility(8);
                    a.a.removeView(a.mCapacityActionSheetView);
                }

            
            {
                a = CapacityActionSheetViewBinder.this;
                super();
            }
            });
            objectanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(i) {

                final int a;
                final CapacityActionSheetViewBinder b;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    CapacityActionSheetViewBinder.a(b).a(1.0F - valueanimator.getAnimatedFraction(), a);
                }

            
            {
                b = CapacityActionSheetViewBinder.this;
                a = i;
                super();
            }
            });
            objectanimator.start();
            return;
        }
    }

    public final boolean c()
    {
        return mCapacityActionSheetView.getVisibility() == 0;
    }
}
