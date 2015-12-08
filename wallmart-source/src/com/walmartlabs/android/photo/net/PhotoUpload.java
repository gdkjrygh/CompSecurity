// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import com.walmartlabs.android.photo.net.exception.PhotoIdException;
import com.walmartlabs.android.photo.net.exception.UploadCancelledException;
import java.io.IOException;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoResponse

public interface PhotoUpload
{
    public static interface PhotoUploadListener
    {

        public abstract void onBytesWritten(long l, long l1);
    }


    public abstract void cancel();

    public abstract long getUploadTime();

    public abstract PhotoResponse start()
        throws IOException, PhotoIdException, UploadCancelledException;

    public abstract PhotoResponse startMocked();
}
