// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelImpl

static final class zzaZW
    implements com.google.android.gms.wearable.StreamResult
{

    private final Status zzQA;
    private final InputStream zzaZW;

    public InputStream getInputStream()
    {
        return zzaZW;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public void release()
    {
        if (zzaZW == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        zzaZW.close();
        return;
        IOException ioexception;
        ioexception;
    }

    ult(Status status, InputStream inputstream)
    {
        zzQA = (Status)zzx.zzv(status);
        zzaZW = inputstream;
    }
}
