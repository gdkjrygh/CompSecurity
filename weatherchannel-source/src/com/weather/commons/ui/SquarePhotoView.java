// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.content.Context;
import android.util.AttributeSet;
import uk.co.senab.photoview.PhotoView;

public class SquarePhotoView extends PhotoView
{

    public SquarePhotoView(Context context)
    {
        super(context);
    }

    public SquarePhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SquarePhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        if (j == 0 || i == 0) goto _L2; else goto _L1
_L1:
        i = Math.min(i, j);
_L4:
        setMeasuredDimension(i, i);
        return;
_L2:
        if (j != 0)
        {
            i = j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
