// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzt, zzx

class zzafd
    implements ResultCallback
{

    final zzt zzafd;

    public void onResult(Result result)
    {
        zzm((Status)result);
    }

    public void zzm(Status status)
    {
        if (!status.isSuccess())
        {
            zzx.zzv("DriveContentsImpl", "Error discarding contents");
            return;
        } else
        {
            zzx.zzt("DriveContentsImpl", "Contents discarded");
            return;
        }
    }

    back(zzt zzt1)
    {
        zzafd = zzt1;
        super();
    }
}
