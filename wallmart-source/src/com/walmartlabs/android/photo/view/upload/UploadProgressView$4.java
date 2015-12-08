// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.upload;

import android.content.Context;
import android.graphics.Bitmap;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.view.upload:
//            UploadProgressView

class adCallback extends BitmapLoadTask
{

    final UploadProgressView this$0;

    protected PhotoDrawable onPostProcessInBackground(DevicePhoto devicephoto, PhotoDrawable photodrawable)
    {
        if (photodrawable != null && photodrawable.getBitmap() != null)
        {
            int k = 0;
            int l = 0;
            int j = photodrawable.getBitmap().getWidth();
            int i = photodrawable.getBitmap().getHeight();
            if (j > i)
            {
                k = j / 2 - i / 2;
                j = i;
            } else
            {
                l = i / 2 - j / 2;
                i = j;
            }
            photodrawable = Bitmap.createBitmap(photodrawable.getBitmap(), k, l, j, i);
            devicephoto = photodrawable;
            if (photodrawable.getWidth() > UploadProgressView.access$700(UploadProgressView.this))
            {
                devicephoto = Bitmap.createScaledBitmap(photodrawable, UploadProgressView.access$700(UploadProgressView.this), UploadProgressView.access$700(UploadProgressView.this), true);
                photodrawable.recycle();
            }
            return asDrawable(devicephoto);
        } else
        {
            return null;
        }
    }

    protected boolean shouldCache()
    {
        return false;
    }

    adCallback(Context context, int i, com.walmartlabs.android.photo.util.task.LoadCallback loadcallback)
    {
        this$0 = UploadProgressView.this;
        super(context, i, loadcallback);
    }
}
