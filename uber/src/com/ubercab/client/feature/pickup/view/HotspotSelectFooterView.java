// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import exd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HotspotSelectFooterView extends LinearLayout
{

    private final Set a;
    TextView mHotspotSelectFooterSubtitle;
    TextView mHotspotSelectFooterTitle;

    public HotspotSelectFooterView(Context context)
    {
        this(context, null);
    }

    public HotspotSelectFooterView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HotspotSelectFooterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new HashSet();
    }

    public final void a()
    {
        mHotspotSelectFooterSubtitle.setAlpha(0.0F);
    }

    public final void a(exd exd1)
    {
        a.add(exd1);
    }

    public final void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = getContext().getString(0x7f07026e);
        } else
        {
            s = getContext().getString(0x7f070271, new Object[] {
                s
            });
        }
        if (mHotspotSelectFooterSubtitle.getText().equals(s))
        {
            return;
        } else
        {
            mHotspotSelectFooterSubtitle.setText(s);
            ObjectAnimator.ofFloat(mHotspotSelectFooterSubtitle, "alpha", new float[] {
                0.0F, 1.0F
            }).setDuration(200L).start();
            return;
        }
    }

    public final void b(exd exd1)
    {
        a.remove(exd1);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

    void onOptInCtaButtonClick()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((exd)iterator.next()).d()) { }
    }

    void onOptOutCtaButtonClick()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((exd)iterator.next()).e()) { }
    }
}
