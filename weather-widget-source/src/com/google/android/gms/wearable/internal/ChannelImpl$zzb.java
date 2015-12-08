// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelImpl

static final class zzaZX
    implements com.google.android.gms.wearable.tStreamResult
{

    private final Status zzQA;
    private final OutputStream zzaZX;

    public OutputStream getOutputStream()
    {
        return zzaZX;
    }

    public Status getStatus()
    {
        return zzQA;
    }

    public void release()
    {
        if (zzaZX == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        zzaZX.close();
        return;
        IOException ioexception;
        ioexception;
    }

    sult(Status status, OutputStream outputstream)
    {
        zzQA = (Status)zzx.zzv(status);
        zzaZX = outputstream;
    }
}
