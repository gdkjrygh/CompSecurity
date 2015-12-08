// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoEntityUpload

public static class mTotalToWrite extends BufferedOutputStream
{
    public static interface WriteListener
    {

        public abstract void onBytesWritten(long l);
    }


    private static final long NOTIFICATION_INTERVAL_BYTES = 0x10000L;
    private long mBytesWritten;
    private long mLastNotificationBytes;
    private WriteListener mListener;
    private long mTotalToWrite;

    private void fireBytesWritten()
    {
        if (mBytesWritten == mTotalToWrite || mBytesWritten - mLastNotificationBytes > 0x10000L)
        {
            mLastNotificationBytes = mBytesWritten;
            if (mListener != null)
            {
                mListener.onBytesWritten(mBytesWritten);
            }
        }
    }

    public void write(int i)
        throws IOException
    {
        super.write(i);
        mBytesWritten = mBytesWritten + 1L;
        fireBytesWritten();
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        super.write(abyte0, i, j);
        mBytesWritten = mBytesWritten + (long)j;
        fireBytesWritten();
    }

    public WriteListener(OutputStream outputstream, long l, WriteListener writelistener)
    {
        super(outputstream);
        mListener = writelistener;
        mTotalToWrite = l;
    }
}
