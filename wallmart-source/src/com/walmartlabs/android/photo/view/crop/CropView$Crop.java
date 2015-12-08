// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.crop;


// Referenced classes of package com.walmartlabs.android.photo.view.crop:
//            CropView

public static class mBottom
{

    private float mBottom;
    private float mLeft;
    private float mRight;
    private float mTop;

    public float getBottom()
    {
        return mBottom;
    }

    public float getLeft()
    {
        return mLeft;
    }

    public float getRight()
    {
        return mRight;
    }

    public float getTop()
    {
        return mTop;
    }

    public (float f, float f1, float f2, float f3)
    {
        mLeft = Math.max(0.0F, f);
        mTop = Math.max(0.0F, f1);
        mRight = Math.min(1.0F, f2);
        mBottom = Math.min(1.0F, f3);
    }
}
