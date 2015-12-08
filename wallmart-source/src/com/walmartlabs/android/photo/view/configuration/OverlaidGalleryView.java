// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.RecyclingImageView;
import java.util.List;

public class OverlaidGalleryView extends RelativeLayout
{

    public OverlaidGalleryView(Context context)
    {
        super(context);
    }

    public OverlaidGalleryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setModel(PendingOrder pendingorder)
    {
        final LinearLayout galleryLayout = (LinearLayout)findViewById(com.walmartlabs.android.photo.R.id.gallery);
        galleryLayout.removeAllViews();
        if (pendingorder != null && pendingorder.getProductSelection().size() > 0)
        {
            final int itemSize = getContext().getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_overlaid_gallery_height);
            final int galleryPadding = getContext().getResources().getDimensionPixelSize(com.walmartlabs.android.photo.R.dimen.photo_overlaid_gallery_padding);
            int i = getContext().getResources().getDisplayMetrics().widthPixels;
            itemSize -= galleryPadding * 2;
            i /= itemSize - galleryPadding;
            int j = pendingorder.getProductSelection().size();
            ((TextView)findViewById(com.walmartlabs.android.photo.R.id.description_count)).setText(String.valueOf(j));
            ((TextView)findViewById(com.walmartlabs.android.photo.R.id.description)).setText((new StringBuilder()).append(getResources().getQuantityString(com.walmartlabs.android.photo.R.plurals.photos, j)).append(" ").append(getResources().getString(com.walmartlabs.android.photo.R.string.photo_selected)).toString());
            pendingorder = pendingorder.getProductSelection();
            j = Math.min(i + 1, pendingorder.size());
            i = 0;
            while (i < j) 
            {
                DevicePhoto devicephoto = ((PhotoSpecification)pendingorder.get(i)).getPhoto();
                BitmapLoadTask bitmaploadtask = new BitmapLoadTask(getContext(), 0, new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

                    final OverlaidGalleryView this$0;
                    final LinearLayout val$galleryLayout;
                    final int val$galleryPadding;
                    final int val$itemSize;

                    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
                    {
                        obj = new RecyclingImageView(getContext());
                        ((ImageView) (obj)).setImageDrawable(photodrawable);
                        photodrawable = new android.widget.LinearLayout.LayoutParams(itemSize, itemSize);
                        photodrawable.setMargins(galleryPadding / 2, 0, galleryPadding / 2, 0);
                        ((ImageView) (obj)).setLayoutParams(photodrawable);
                        ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                        galleryLayout.addView(((android.view.View) (obj)));
                    }

                    public void onTaskCancelled(Bitmap bitmap)
                    {
                    }

            
            {
                this$0 = OverlaidGalleryView.this;
                itemSize = i;
                galleryPadding = j;
                galleryLayout = linearlayout;
                super();
            }
                });
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    bitmaploadtask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new DevicePhoto[] {
                        devicephoto
                    });
                } else
                {
                    bitmaploadtask.execute(new DevicePhoto[] {
                        devicephoto
                    });
                }
                i++;
            }
        }
    }
}
