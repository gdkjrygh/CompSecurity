// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzw

private static class zzafs
    implements com.google.android.gms.drive.der.DriveFolderResult
{

    private final Status zzOt;
    private final DriveFolder zzafs;

    public DriveFolder getDriveFolder()
    {
        return zzafs;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public FolderResult(Status status, DriveFolder drivefolder)
    {
        zzOt = status;
        zzafs = drivefolder;
    }
}
