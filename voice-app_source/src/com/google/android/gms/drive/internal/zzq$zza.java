// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveContents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzq

static class zzacW
    implements Releasable, com.google.android.gms.drive..DriveContentsResult
{

    private final Status zzOt;
    private final DriveContents zzacW;

    public DriveContents getDriveContents()
    {
        return zzacW;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public void release()
    {
        if (zzacW != null)
        {
            zzacW.zzpf();
        }
    }

    public tentsResult(Status status, DriveContents drivecontents)
    {
        zzOt = status;
        zzacW = drivecontents;
    }
}
