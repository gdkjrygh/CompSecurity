// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.order;

import android.graphics.Bitmap;
import android.view.View;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.android.photo.view.order:
//            OrderItemsAdapter, PhotoSpecificationView

class val.photoId
    implements com.walmartlabs.android.photo.util.task.pLoadCallback
{

    final OrderItemsAdapter this$0;
    final long val$photoId;

    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
    {
        obj = (BasicViewHolder)obj;
        PhotoSpecificationView photospecificationview = (PhotoSpecificationView)((BasicViewHolder) (obj)).itemView;
        if (((Long)((BasicViewHolder) (obj)).itemView.getTag()).longValue() == val$photoId)
        {
            photospecificationview.setBitmapDrawable(photodrawable);
        }
    }

    public void onTaskCancelled(Bitmap bitmap)
    {
    }

    ew()
    {
        this$0 = final_orderitemsadapter;
        val$photoId = J.this;
        super();
    }
}
