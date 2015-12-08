// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;

public class FadingImageView extends ImageView
{

    private static Bitmap placeHolderImage;

    public FadingImageView(Context context)
    {
        super(context);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(100, 100));
        setImageBitmap(placeHolderImage);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }
}
