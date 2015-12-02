// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pickup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ubercab.client.feature.trip.map.PinEtaView;
import dte;

public class DynamicPickupsWalkingCallout extends RelativeLayout
{

    private dte a;
    private String b;
    PinEtaView mPinEtaView;
    TextView mSubtitle;
    TextView mTitle;

    public DynamicPickupsWalkingCallout(Context context)
    {
        this(context, null);
    }

    public DynamicPickupsWalkingCallout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DynamicPickupsWalkingCallout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new dte(context);
    }

    public final Bitmap a()
    {
        measure(-2, -2);
        Bitmap bitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Bitmap bitmap1 = a.a(b);
        int i = canvas.getHeight();
        int j = bitmap1.getHeight();
        int k = Math.round((float)canvas.getWidth() / 2.0F - (float)bitmap1.getWidth() / 2.0F);
        canvas.drawBitmap(bitmap1, i - j, k, null);
        draw(canvas);
        return bitmap;
    }

    public final void a(String s)
    {
        mTitle.setText(s);
    }

    public final void b(String s)
    {
        mSubtitle.setText(s);
    }

    public final void c(String s)
    {
        b = s;
        mPinEtaView.a(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            mPinEtaView.a(false);
            mPinEtaView.b(true);
            mPinEtaView.setVisibility(4);
            return;
        }
    }
}
