// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzw

public static class zzbao
    implements com.google.android.gms.wearable.GetFdForAssetResult
{

    private volatile boolean mClosed;
    private final Status zzQA;
    private volatile InputStream zzaZW;
    private volatile ParcelFileDescriptor zzbao;

    public ParcelFileDescriptor getFd()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the file descriptor after release().");
        } else
        {
            return zzbao;
        }
    }

    public InputStream getInputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Cannot access the input stream after release().");
        }
        if (zzbao == null)
        {
            return null;
        }
        if (zzaZW == null)
        {
            zzaZW = new android.os.leDescriptor.AutoCloseInputStream(zzbao);
        }
        return zzaZW;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public void release()
    {
        if (zzbao == null)
        {
            return;
        }
        if (mClosed)
        {
            throw new IllegalStateException("releasing an already released result.");
        }
        if (zzaZW == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzaZW.close();
_L1:
        mClosed = true;
        zzbao = null;
        zzaZW = null;
        return;
        try
        {
            zzbao.close();
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
        zzQA = status;
        zzbao = parcelfiledescriptor;
    }
}
