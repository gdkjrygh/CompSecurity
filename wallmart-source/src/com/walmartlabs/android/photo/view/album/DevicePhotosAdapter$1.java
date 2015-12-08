// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.graphics.Bitmap;
import android.view.View;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.view.album:
//            DevicePhotosAdapter, CheckablePhotoView

class val.position
    implements com.walmartlabs.android.photo.util.task.oadCallback
{

    final DevicePhotosAdapter this$0;
    final long val$photoId;
    final int val$position;

    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
    {
label0:
        {
            obj = (vicePhotoViewHolder)obj;
            if (((Long)((vicePhotoViewHolder) (obj)).itemView.getTag()).longValue() == val$photoId)
            {
                if (photodrawable == null)
                {
                    break label0;
                }
                ((vicePhotoViewHolder) (obj)).photo.setPhotoSource(photodrawable, flag);
                ((vicePhotoViewHolder) (obj)).photo.setPhotoViewListener(new CheckablePhotoView.PhotoViewListener() {

                    final DevicePhotosAdapter._cls1 this$1;

                    public void onEnlargeClick()
                    {
                        if (DevicePhotosAdapter.access$000(this$0) != null)
                        {
                            DevicePhotosAdapter.access$000(this$0).onEnlarge(getItem(position), position);
                        }
                    }

            
            {
                this$1 = DevicePhotosAdapter._cls1.this;
                super();
            }
                });
            }
            return;
        }
        photodrawable = ((vicePhotoViewHolder) (obj)).photo;
        if (!isValidItem(val$position))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        photodrawable.setUnavailable(flag);
    }

    public void onTaskCancelled(Bitmap bitmap)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = final_devicephotosadapter;
        val$photoId = l;
        val$position = I.this;
        super();
    }
}
