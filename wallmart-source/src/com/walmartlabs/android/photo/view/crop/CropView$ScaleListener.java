// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.crop;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.walmartlabs.android.photo.view.crop:
//            CropView

private class <init> extends android.view.mpleOnScaleGestureListener
{

    final CropView this$0;

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        CropView.access$102(CropView.this, CropView.access$100(CropView.this) * scalegesturedetector.getScaleFactor());
        CropView.access$102(CropView.this, Math.max(CropView.access$200(CropView.this), Math.min(CropView.access$100(CropView.this), CropView.access$300(CropView.this))));
        invalidate();
        return true;
    }

    private ()
    {
        this$0 = CropView.this;
        super();
    }

    <init>(<init> <init>1)
    {
        this();
    }
}
