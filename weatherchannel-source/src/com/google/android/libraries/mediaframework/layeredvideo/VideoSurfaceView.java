// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.layeredvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class VideoSurfaceView extends SurfaceView
{

    private static final float MAX_ASPECT_RATIO_DEFORMATION_PERCENT = 0.01F;
    private float videoAspectRatio;

    public VideoSurfaceView(Context context)
    {
        super(context);
    }

    public VideoSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        super.onMeasure(i, j);
        k = getMeasuredWidth();
        l = getMeasuredHeight();
        i = l;
        j = k;
        if (videoAspectRatio == 0.0F) goto _L2; else goto _L1
_L1:
        float f;
        f = (float)k / (float)l;
        f = videoAspectRatio / f - 1.0F;
        if (f <= 0.01F) goto _L4; else goto _L3
_L3:
        i = (int)((float)k / videoAspectRatio);
        j = k;
_L2:
        setMeasuredDimension(j, i);
        return;
_L4:
        i = l;
        j = k;
        if (f < -0.01F)
        {
            j = (int)((float)l * videoAspectRatio);
            i = l;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void setVideoWidthHeightRatio(float f)
    {
        if (videoAspectRatio != f)
        {
            videoAspectRatio = f;
            requestLayout();
        }
    }
}
