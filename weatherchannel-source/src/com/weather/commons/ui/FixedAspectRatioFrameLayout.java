// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class FixedAspectRatioFrameLayout extends FrameLayout
{

    private static final int DEFAULT_ASPECT_HEIGHT = 9;
    private static final int DEFAULT_ASPECT_WIDTH = 16;
    private static final float MAX_DEFORMATION_PERCENT = 0.01F;
    private static final String TAG = "FixedAspectRatioFrameLayout";
    private int aspectHeight;
    private int aspectWidth;

    public FixedAspectRatioFrameLayout(Context context)
    {
        super(context);
        aspectWidth = 16;
        aspectHeight = 9;
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        aspectWidth = 16;
        aspectHeight = 9;
        readAspectAttributes(context, attributeset);
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        aspectWidth = 16;
        aspectHeight = 9;
        readAspectAttributes(context, attributeset);
    }

    private void readAspectAttributes(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.weather.commons.R.styleable.FixedAspectRatioFrameLayout);
        aspectWidth = context.getInt(com.weather.commons.R.styleable.FixedAspectRatioFrameLayout_farflAspectWidth, aspectWidth);
        aspectHeight = context.getInt(com.weather.commons.R.styleable.FixedAspectRatioFrameLayout_farflAspectHeight, aspectHeight);
        context.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        l = android.view.View.MeasureSpec.getSize(i);
        i1 = android.view.View.MeasureSpec.getSize(j);
        j = l;
        k = i1;
        if (l == 0 || i1 == 0) goto _L2; else goto _L1
_L1:
        float f;
        float f1;
        float f2;
        f = (float)l / (float)i1;
        f1 = (float)aspectWidth / (float)aspectHeight;
        f2 = f1 / f - 1.0F;
        if (f2 <= 0.01F) goto _L4; else goto _L3
_L3:
        i = (int)((float)l / f1);
        LogUtil.v("FixedAspectRatioFrameLayout", LoggingMetaTags.TWC_UI, "onMeasure: adjusting height. desiredAspectRatio=%s, originalAspectRatio=%s, aspectDeformation=%s", new Object[] {
            Float.valueOf(f1), Float.valueOf(f), Float.valueOf(f2)
        });
_L6:
        LogUtil.v("FixedAspectRatioFrameLayout", LoggingMetaTags.TWC_UI, "onMeasure: originalWidth=%s, originalHeight=%s, adjustedWidth=%s, adjustedHeight=%s", new Object[] {
            Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(i)
        });
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
        return;
_L4:
        i = k;
        if (f2 < -0.01F)
        {
            j = (int)((float)i1 * f1);
            LogUtil.v("FixedAspectRatioFrameLayout", LoggingMetaTags.TWC_UI, "onMeasure: adjusting width. desiredAspectRatio=%s, originalAspectRatio=%s, aspectDeformation=%s", new Object[] {
                Float.valueOf(f1), Float.valueOf(f), Float.valueOf(f2)
            });
            i = k;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l != 0)
        {
            i = (aspectHeight * l) / aspectWidth;
            LogUtil.v("FixedAspectRatioFrameLayout", LoggingMetaTags.TWC_UI, "onMeasure: forcing height.", new Object[0]);
        } else
        {
            j = (aspectWidth * i1) / aspectHeight;
            LogUtil.v("FixedAspectRatioFrameLayout", LoggingMetaTags.TWC_UI, "onMeasure: forcing width.", new Object[0]);
            i = k;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
