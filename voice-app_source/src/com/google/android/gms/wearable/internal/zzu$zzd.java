// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzu

public static class zzaUn
    implements com.google.android.gms.wearable.GetFdForAssetResult
{

    private volatile boolean mClosed;
    private final Status zzOt;
    private volatile InputStream zzaTV;
    private volatile ParcelFileDescriptor zzaUn;

    public ParcelFileDescriptor getFd()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        } else
        {
            return zzaUn;
        }
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the input stream after release().");
        }
        if (zzaUn == null)
        {
            return null;
        }
        if (zzaTV == null)
        {
            zzaTV = new android.os.leDescriptor.AutoCloseInputStream(zzaUn);
        }
        return zzaTV;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void release()
    {
        if (zzaUn == null)
        {
            return;
        }
        if (mClosed)
        {
            throw new IllegalStateException("releasing an already released result.");
        }
        if (zzaTV == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzaTV.close();
_L1:
        mClosed = true;
        zzaUn = null;
        zzaTV = null;
        return;
        try
        {
            zzaUn.close();
        }
        catch (IOException ioexception)
        {
            return;
        }
          goto _L1
    }

    public eam(Status status, ParcelFileDescriptor parcelfiledescriptor)
    {
        mClosed = false;
        zzOt = status;
        zzaUn = parcelfiledescriptor;
    }
}
