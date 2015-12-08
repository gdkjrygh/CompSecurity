// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.RecyclingImageView;

// Referenced classes of package com.walmartlabs.android.photo.view.configuration:
//            OverlaidGalleryView

class val.galleryLayout
    implements com.walmartlabs.android.photo.util.task.oadCallback
{

    final OverlaidGalleryView this$0;
    final LinearLayout val$galleryLayout;
    final int val$galleryPadding;
    final int val$itemSize;

    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
    {
        obj = new RecyclingImageView(getContext());
        ((ImageView) (obj)).setImageDrawable(photodrawable);
        photodrawable = new android.widget.ams(val$itemSize, val$itemSize);
        photodrawable.setMargins(val$galleryPadding / 2, 0, val$galleryPadding / 2, 0);
        ((ImageView) (obj)).setLayoutParams(photodrawable);
        ((ImageView) (obj)).setScaleType(android.widget.NTER_CROP);
        val$galleryLayout.addView(((android.view.View) (obj)));
    }

    public void onTaskCancelled(Bitmap bitmap)
    {
    }

    ck()
    {
        this$0 = final_overlaidgalleryview;
        val$itemSize = i;
        val$galleryPadding = j;
        val$galleryLayout = LinearLayout.this;
        super();
    }
}
