// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service.order;

import com.walmartlabs.android.photo.model.device.DevicePhoto;

// Referenced classes of package com.walmartlabs.android.photo.service.order:
//            OrderService, OrderProgress

public static interface 
{

    public abstract void onNewPhotoUploading(DevicePhoto devicephoto, int i);

    public abstract void onUploadStatus(OrderProgress orderprogress);

    public abstract boolean visible();
}
