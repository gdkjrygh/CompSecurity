// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import ffu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LocationSearchFooterView extends FrameLayout
{

    private int a;
    private List b;
    TextView mFooterTitle;
    ImageView mImageViewPoweredByGoogle;
    Button mRemoveTaggedButton;
    ViewGroup mViewGroupSearchMore;

    public LocationSearchFooterView(Context context)
    {
        this(context, null);
    }

    public LocationSearchFooterView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LocationSearchFooterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = (int)getResources().getDimension(0x7f08020a);
        b = new ArrayList();
    }

    private void b(boolean flag, String s)
    {
        if (flag)
        {
            e();
        } else
        {
            f();
        }
        mFooterTitle.setText(s);
    }

    private void e()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = g();
        marginlayoutparams.setMargins(0, a, 0, 0);
        mViewGroupSearchMore.setLayoutParams(marginlayoutparams);
    }

    private void f()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = g();
        marginlayoutparams.setMargins(0, 0, 0, 0);
        mViewGroupSearchMore.setLayoutParams(marginlayoutparams);
    }

    private android.view.ViewGroup.MarginLayoutParams g()
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)mViewGroupSearchMore.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = marginlayoutparams1;
        if (marginlayoutparams1 == null)
        {
            marginlayoutparams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        }
        return marginlayoutparams;
    }

    public final void a()
    {
        mImageViewPoweredByGoogle.setVisibility(8);
    }

    public final void a(ffu ffu1)
    {
        b.add(ffu1);
    }

    public final void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            b();
            return;
        } else
        {
            mRemoveTaggedButton.setText(getResources().getString(0x7f07039b, new Object[] {
                s
            }));
            return;
        }
    }

    public final void a(boolean flag, String s)
    {
        mViewGroupSearchMore.setVisibility(0);
        b(flag, s);
    }

    public final void b()
    {
        mRemoveTaggedButton.setVisibility(8);
    }

    public final void b(ffu ffu1)
    {
        b.remove(ffu1);
    }

    public final void c()
    {
        mRemoveTaggedButton.setVisibility(0);
    }

    public final void d()
    {
        mViewGroupSearchMore.setVisibility(8);
        f();
    }

    public void onClickRemoveButton()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ffu)iterator.next()).f_()) { }
    }

    public void onClickSearchMore()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ffu)iterator.next()).b()) { }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
