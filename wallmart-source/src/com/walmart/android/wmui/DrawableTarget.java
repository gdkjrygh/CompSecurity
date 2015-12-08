// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Target;

public abstract class DrawableTarget
    implements Target
{

    private ImageView mImageView;

    public DrawableTarget(ImageView imageview)
    {
        mImageView = imageview;
        mImageView.setTag(this);
    }

    protected abstract Drawable createDrawable(Bitmap bitmap);

    public void onBitmapFailed(Drawable drawable)
    {
        mImageView.setImageDrawable(drawable);
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        mImageView.setImageDrawable(createDrawable(bitmap));
    }

    public void onPrepareLoad(Drawable drawable)
    {
        mImageView.setImageDrawable(drawable);
    }
}
