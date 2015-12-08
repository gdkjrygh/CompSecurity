// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.gcm.request;

import android.content.Intent;
import android.text.TextUtils;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;

// Referenced classes of package com.walmartlabs.android.photo.gcm.request:
//            PhotoCloudMessage

public class PhotoMessageFactory
{

    public static final String EXTRA_PHOTO_MESSAGE = "photo-message";
    private static PhotoMessageFactory sInstance;

    private PhotoMessageFactory()
    {
    }

    public static PhotoMessageFactory get()
    {
        com/walmartlabs/android/photo/gcm/request/PhotoMessageFactory;
        JVM INSTR monitorenter ;
        PhotoMessageFactory photomessagefactory;
        if (sInstance == null)
        {
            sInstance = new PhotoMessageFactory();
        }
        photomessagefactory = sInstance;
        com/walmartlabs/android/photo/gcm/request/PhotoMessageFactory;
        JVM INSTR monitorexit ;
        return photomessagefactory;
        Exception exception;
        exception;
        throw exception;
    }

    public PhotoCloudMessage createMessageFromIntent(Intent intent)
    {
        intent = intent.getStringExtra("photo-message");
        if (!TextUtils.isEmpty(intent))
        {
            return (PhotoCloudMessage)PhotoObjectMapper.get().readFromString(intent, com/walmartlabs/android/photo/gcm/request/PhotoCloudMessage);
        } else
        {
            return null;
        }
    }
}
