// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelImpl

static final class zzaTV
    implements com.google.android.gms.wearable.StreamResult
{

    private final Status zzOt;
    private final InputStream zzaTV;

    public InputStream getInputStream()
    {
        return zzaTV;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void release()
    {
        if (zzaTV == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        zzaTV.close();
        return;
        IOException ioexception;
        ioexception;
    }

    ult(Status status, InputStream inputstream)
    {
        zzOt = (Status)zzu.zzu(status);
        zzaTV = inputstream;
    }
}
