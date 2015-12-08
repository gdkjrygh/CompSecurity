// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.order;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.album.PhotoExecutors;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.view.order:
//            PhotoSpecificationView

public class OrderItemsAdapter extends BasicAdapter
{

    private Context mContext;
    private List mPhotoSpecifications;

    public OrderItemsAdapter(Context context)
    {
        mPhotoSpecifications = new ArrayList();
        mContext = context;
    }

    public PhotoSpecification getItem(int i)
    {
        return (PhotoSpecification)mPhotoSpecifications.get(i);
    }

    public int getItemCount()
    {
        return mPhotoSpecifications.size();
    }

    public BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new BasicViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.photo.R.layout.photo_order_photo_specification, null));
    }

    public void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        Object obj = (PhotoSpecificationView)basicviewholder.itemView;
        ((PhotoSpecificationView) (obj)).reset();
        ((PhotoSpecificationView) (obj)).setModel((PhotoSpecification)mPhotoSpecifications.get(i));
        final long photoId = ((PhotoSpecification)mPhotoSpecifications.get(i)).getPhoto().getId();
        ((PhotoSpecificationView) (obj)).setTag(Long.valueOf(photoId));
        obj = new BitmapLoadTask(mContext, 0, new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

            final OrderItemsAdapter this$0;
            final long val$photoId;

            public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj1)
            {
                obj1 = (BasicViewHolder)obj1;
                PhotoSpecificationView photospecificationview = (PhotoSpecificationView)((BasicViewHolder) (obj1)).itemView;
                if (((Long)((BasicViewHolder) (obj1)).itemView.getTag()).longValue() == photoId)
                {
                    photospecificationview.setBitmapDrawable(photodrawable);
                }
            }

            public void onTaskCancelled(Bitmap bitmap)
            {
            }

            
            {
                this$0 = OrderItemsAdapter.this;
                photoId = l;
                super();
            }
        });
        ((BitmapLoadTask) (obj)).setTag(basicviewholder);
        basicviewholder = ((PhotoSpecification)mPhotoSpecifications.get(i)).getPhoto();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ((BitmapLoadTask) (obj)).executeOnExecutor(PhotoExecutors.THREAD_POOL_EXECUTOR, new DevicePhoto[] {
                basicviewholder
            });
            return;
        } else
        {
            ((BitmapLoadTask) (obj)).execute(new DevicePhoto[] {
                basicviewholder
            });
            return;
        }
    }

    public void setModel(PendingOrder pendingorder)
    {
        if (pendingorder != null)
        {
            mPhotoSpecifications.clear();
            PhotoSpecification photospecification;
            for (pendingorder = pendingorder.getProductSelection().iterator(); pendingorder.hasNext(); mPhotoSpecifications.add(photospecification))
            {
                photospecification = (PhotoSpecification)pendingorder.next();
            }

        }
        notifyDataSetChanged();
    }
}
