// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import android.graphics.Bitmap;
import android.view.View;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.view.album:
//            DevicePhotosAdapter, CheckablePhotoView

class this._cls1
    implements ViewListener
{

    final l.position this$1;

    public void onEnlargeClick()
    {
        if (DevicePhotosAdapter.access$000(_fld0) != null)
        {
            DevicePhotosAdapter.access$000(_fld0).onEnlarge(getItem(position), position);
        }
    }

    l.position()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/android/photo/view/album/DevicePhotosAdapter$1

/* anonymous class */
    class DevicePhotosAdapter._cls1
        implements com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback
    {

        final DevicePhotosAdapter this$0;
        final long val$photoId;
        final int val$position;

        public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
        {
label0:
            {
                obj = (DevicePhotosAdapter.DevicePhotoViewHolder)obj;
                if (((Long)((DevicePhotosAdapter.DevicePhotoViewHolder) (obj)).itemView.getTag()).longValue() == photoId)
                {
                    if (photodrawable == null)
                    {
                        break label0;
                    }
                    ((DevicePhotosAdapter.DevicePhotoViewHolder) (obj)).photo.setPhotoSource(photodrawable, flag);
                    ((DevicePhotosAdapter.DevicePhotoViewHolder) (obj)).photo.setPhotoViewListener(new DevicePhotosAdapter._cls1._cls1());
                }
                return;
            }
            photodrawable = ((DevicePhotosAdapter.DevicePhotoViewHolder) (obj)).photo;
            if (!isValidItem(position))
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

            
            {
                this$0 = final_devicephotosadapter;
                photoId = l;
                position = I.this;
                super();
            }
    }

}
