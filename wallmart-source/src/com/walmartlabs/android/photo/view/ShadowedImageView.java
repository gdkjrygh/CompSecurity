// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package com.walmartlabs.android.photo.view:
//            RecyclingImageView, RecyclingBitmapDrawable

public class ShadowedImageView extends RecyclingImageView
{

    private int mBottomClip;
    private int mRightSideClip;
    private Drawable mShadow9Patch;

    public ShadowedImageView(Context context)
    {
        super(context);
        init();
    }

    public ShadowedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        mRightSideClip = getRightShadowSize();
        mBottomClip = getBottomShadowSize();
        mShadow9Patch = getContext().getResources().getDrawable(com.walmartlabs.android.photo.R.drawable.photo_photo_drop_shadow);
    }

    public Bitmap addShadowToBitmap(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        mShadow9Patch.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        mShadow9Patch.draw(canvas);
        canvas.clipRect(0, 0, canvas.getWidth() - mRightSideClip, canvas.getHeight() - mBottomClip);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        return bitmap1;
    }

    protected int getBottomShadowSize()
    {
        return getContext().getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_single_image_shadow_bottom);
    }

    protected int getRightShadowSize()
    {
        return getContext().getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_single_image_shadow_side);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap = addShadowToBitmap(bitmap);
            super.setImageDrawable(new RecyclingBitmapDrawable(getResources(), bitmap));
            return;
        } else
        {
            super.setImageBitmap(bitmap);
            return;
        }
    }
}
