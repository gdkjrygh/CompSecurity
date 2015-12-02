// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pins;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.FareDetailMetadata;
import com.ubercab.ui.TextView;

public class PoolSurgeBarView extends LinearLayout
{

    private final int a;
    private final int b;
    private final Resources c;
    ImageView mImageViewSurgeIcon;
    TextView mTextViewFare;
    TextView mTextViewLabel;

    public PoolSurgeBarView(Context context)
    {
        this(context, null);
    }

    public PoolSurgeBarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PoolSurgeBarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = getResources();
        a = c.getDimensionPixelSize(0x7f08019a);
        b = c.getDimensionPixelSize(0x7f0802df);
        inflate(context, 0x7f03013a, this);
        setOrientation(1);
        setGravity(81);
        ButterKnife.inject(this);
    }

    private void a(float f, int i, boolean flag)
    {
        Object obj = new android.widget.LinearLayout.LayoutParams(b, (int)((float)a * f));
        mImageViewSurgeIcon.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = mImageViewSurgeIcon;
        int j;
        if (flag)
        {
            j = 0x7f0201ed;
        } else
        {
            j = 0;
        }
        ((ImageView) (obj)).setImageResource(j);
        mImageViewSurgeIcon.setBackgroundColor(c.getColor(i));
    }

    private void a(String s)
    {
        mTextViewFare.setText(s);
    }

    private void b(String s)
    {
        mTextViewLabel.setText(s);
    }

    public final void a(FareDetailMetadata faredetailmetadata, int i, float f)
    {
        setPadding(i, 0, i, 0);
        if (faredetailmetadata.getIsPool())
        {
            i = 0x7f0d007a;
        } else
        {
            i = 0x7f0d0073;
        }
        a(faredetailmetadata.getFare() / f, i, faredetailmetadata.getIsSurge());
        a(faredetailmetadata.getFormattedFare());
        b(faredetailmetadata.getLabel());
    }
}
