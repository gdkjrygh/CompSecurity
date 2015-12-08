// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFile;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzw

private static class zzafr
    implements com.google.android.gms.drive.der.DriveFileResult
{

    private final Status zzOt;
    private final DriveFile zzafr;

    public DriveFile getDriveFile()
    {
        return zzafr;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public FileResult(Status status, DriveFile drivefile)
    {
        zzOt = status;
        zzafr = drivefile;
    }
}
