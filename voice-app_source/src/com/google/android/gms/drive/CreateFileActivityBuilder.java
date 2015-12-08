// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzj;
import com.google.android.gms.drive.internal.zzt;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveContents, Contents, DriveId, 
//            MetadataChangeSet

public class CreateFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final zzj zzacV = new zzj(0);
    private DriveContents zzacW;
    private boolean zzacX;

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        zzu.zzb(Boolean.valueOf(zzacX), "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        zzu.zza(googleapiclient.isConnected(), "Client must be connected");
        boolean flag;
        if (googleapiclient.zza(Drive.SCOPE_FILE) || googleapiclient.zza(Drive.zzacY))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "The apiClient must have suitable scope to create files");
        if (zzacW != null)
        {
            zzacW.zzpf();
        }
        return zzacV.build(googleapiclient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        zzacV.zza(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s)
    {
        zzacV.zzcv(s);
        return this;
    }

    public CreateFileActivityBuilder setInitialDriveContents(DriveContents drivecontents)
    {
        if (drivecontents != null)
        {
            if (!(drivecontents instanceof zzt))
            {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (drivecontents.getDriveId() != null)
            {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (drivecontents.zzpg())
            {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            zzacV.zzct(drivecontents.zzpe().getRequestId());
            zzacW = drivecontents;
        } else
        {
            zzacV.zzct(1);
        }
        zzacX = true;
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        zzacV.zza(metadatachangeset);
        return this;
    }
}
