// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v3;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import fbg;

public class RequestProgressView extends FrameLayout
{

    ProgressBar mProgressView;
    ImageView mResultImageView;
    TextView mResultTextView;
    ViewGroup mResultView;

    public RequestProgressView(Context context)
    {
        this(context, null);
    }

    public RequestProgressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RequestProgressView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        LayoutInflater.from(context).inflate(0x7f03015e, this);
        ButterKnife.inject(this, this);
    }

    private void e()
    {
        mResultView.setVisibility(8);
    }

    public final void a()
    {
        setVisibility(0);
        mProgressView.setVisibility(0);
        e();
    }

    public final void b()
    {
        fbg.a(mProgressView, 8).start();
    }

    public final void c()
    {
        byte byte0 = 0;
        setVisibility(0);
        fbg.a(mResultView).start();
        mResultImageView.setImageResource(0x7f0200e2);
        mResultTextView.setText(null);
        TextView textview = mResultTextView;
        if (TextUtils.isEmpty(null))
        {
            byte0 = 8;
        }
        textview.setVisibility(byte0);
    }

    public final void d()
    {
        fbg.a(this, 8).start();
    }
}
