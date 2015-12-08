// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq

private static class zzacT
    implements com.google.android.gms.drive..DriveIdResult
{

    private final Status zzOt;
    private final DriveId zzacT;

    public DriveId getDriveId()
    {
        return zzacT;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public esult(Status status, DriveId driveid)
    {
        zzOt = status;
        zzacT = driveid;
    }
}
