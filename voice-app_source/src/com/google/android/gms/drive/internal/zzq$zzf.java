// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq

static class zzaeL
    implements com.google.android.gms.drive..MetadataBufferResult
{

    private final Status zzOt;
    private final MetadataBuffer zzaeK;
    private final boolean zzaeL;

    public MetadataBuffer getMetadataBuffer()
    {
        return zzaeK;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void release()
    {
        if (zzaeK != null)
        {
            zzaeK.release();
        }
    }

    public BufferResult(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        zzOt = status;
        zzaeK = metadatabuffer;
        zzaeL = flag;
    }
}
