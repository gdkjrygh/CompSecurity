// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoEntityUpload

public static class mListener extends InputStreamEntity
{
    public static interface EntityListener
    {

        public abstract void onBytesWritten(long l);
    }


    private long mBytesToRead;
    private EntityListener mListener;

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream = new >(outputstream, mBytesToRead, new PhotoEntityUpload.PhotoOutputStream.WriteListener() {

            final PhotoEntityUpload.PhotoInputStreamEntity this$0;

            public void onBytesWritten(long l)
            {
                if (mListener != null)
                {
                    mListener.onBytesWritten(l);
                }
            }

            
            {
                this$0 = PhotoEntityUpload.PhotoInputStreamEntity.this;
                super();
            }
        });
        super.writeTo(outputstream);
        outputstream.();
    }


    public EntityListener(InputStream inputstream, long l, EntityListener entitylistener)
    {
        super(inputstream, l);
        mBytesToRead = l;
        mListener = entitylistener;
    }
}
