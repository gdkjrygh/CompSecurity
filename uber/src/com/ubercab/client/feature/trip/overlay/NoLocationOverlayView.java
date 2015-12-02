// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderApplication;
import dfp;

public class NoLocationOverlayView extends LinearLayout
{

    ImageView mImageViewNoLocationArrow;

    public NoLocationOverlayView(Context context)
    {
        this(context, null);
    }

    public NoLocationOverlayView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NoLocationOverlayView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
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
            RotateAnimation rotateanimation = new RotateAnimation(0.0F, 30F, 1, 0.5F, 1, 0.5F);
            rotateanimation.setRepeatMode(2);
            rotateanimation.setInterpolator(new AccelerateDecelerateInterpolator());
            rotateanimation.setRepeatCount(-1);
            rotateanimation.setDuration(2000L);
            mImageViewNoLocationArrow.startAnimation(rotateanimation);
            return;
        }
    }
}
