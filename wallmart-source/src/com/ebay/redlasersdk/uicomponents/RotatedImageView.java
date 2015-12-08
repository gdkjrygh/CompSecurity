// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.uicomponents;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RotatedImageView extends ImageView
{

    private Bitmap rotatedBm;

    public RotatedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        orientImage();
    }

    private void orientImage()
    {
        Object obj = getDrawable();
        if (obj != null)
        {
            obj = ((BitmapDrawable)obj).getBitmap();
            int i = ((Bitmap) (obj)).getWidth();
            int j = ((Bitmap) (obj)).getHeight();
            Matrix matrix = new Matrix();
            matrix.postRotate(-90F);
            rotatedBm = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, i, j, matrix, true);
            setImageBitmap(rotatedBm);
        }
        invalidate();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
