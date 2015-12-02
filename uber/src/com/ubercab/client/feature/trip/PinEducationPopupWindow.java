// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import butterknife.ButterKnife;
import cev;
import czd;
import dsg;
import fqf;

public class PinEducationPopupWindow extends czd
{

    ImageView mTextViewClose;
    View mViewTextContainer;
    View mViewTooltipContainer;

    public PinEducationPopupWindow(Activity activity, cev cev, int i, int j)
    {
        super(activity, cev);
        cev = (ViewGroup)LayoutInflater.from(activity).inflate(0x7f0300c5, null, false);
        ButterKnife.inject(this, cev);
        int l = c();
        int k = i - l;
        i = k;
        if (android.os.Build.VERSION.SDK_INT <= 21)
        {
            a(l);
            i = k + l;
        }
        Resources resources = activity.getResources();
        float f = resources.getDimension(0x7f080135);
        if (j == fqf.b)
        {
            k = 0;
        } else
        {
            k = resources.getDimensionPixelSize(0x7f080136);
        }
        cev.addView(new dsg(activity, i, f, k), 0);
        setContentView(cev);
        if (j == fqf.b)
        {
            mViewTooltipContainer.setVisibility(0);
            mViewTextContainer.setVisibility(8);
            mTextViewClose.setVisibility(8);
            activity = (android.widget.FrameLayout.LayoutParams)mViewTooltipContainer.getLayoutParams();
            activity.setMargins(((android.widget.FrameLayout.LayoutParams) (activity)).leftMargin, (int)((float)(i + ((android.widget.FrameLayout.LayoutParams) (activity)).topMargin) + f), ((android.widget.FrameLayout.LayoutParams) (activity)).rightMargin, ((android.widget.FrameLayout.LayoutParams) (activity)).bottomMargin);
        } else
        {
            i = (int)(resources.getDimension(0x7f080139) + ((float)i + f));
            mViewTextContainer.setPadding(mViewTextContainer.getPaddingLeft(), i, mViewTextContainer.getPaddingRight(), mViewTextContainer.getPaddingBottom());
        }
        setAnimationStyle(0x7f0900d2);
        setWidth(-1);
        setHeight(-1);
    }

    private void a(int i)
    {
        mTextViewClose.setPadding(mTextViewClose.getPaddingLeft(), mTextViewClose.getPaddingTop() + i, mTextViewClose.getPaddingRight(), mTextViewClose.getPaddingBottom());
    }

    private int c()
    {
        Rect rect = new Rect();
        a().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public final void b()
    {
        showAtLocation(a().getWindow().getDecorView(), 0, 0, 0);
    }

    public void onClickClose()
    {
        dismiss();
    }

    public void onClickTooltipClose()
    {
        dismiss();
    }
}
