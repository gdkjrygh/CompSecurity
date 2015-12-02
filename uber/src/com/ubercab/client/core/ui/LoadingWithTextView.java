// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import chm;
import com.ubercab.client.core.app.RiderApplication;

public class LoadingWithTextView extends LinearLayout
{

    private String a;
    ImageView mLoadingIcon;
    TextView mLoadingText;

    public LoadingWithTextView(Context context)
    {
        this(context, null);
    }

    public LoadingWithTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingWithTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
        a();
    }

    private void a()
    {
        inflate(getContext(), 0x7f030099, this);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, chm.LoadingWithTextView, 0, 0);
        a = context.getString(0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
            mLoadingText.setText(a);
            if (!((RiderApplication)(RiderApplication)getContext().getApplicationContext()).i())
            {
                Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04000f);
                animation.setInterpolator(new LinearInterpolator());
                mLoadingIcon.startAnimation(animation);
                return;
            }
        }
    }
}
