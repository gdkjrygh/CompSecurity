// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, CreateFileIntentSenderRequest, zzak

public class zzj
{

    private String zzadv;
    private DriveId zzady;
    protected MetadataChangeSet zzaex;
    private Integer zzaey;
    private final int zzaez;

    public zzj(int i)
    {
        zzaez = i;
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        zzu.zzb(zzaex, "Must provide initial metadata to CreateFileActivityBuilder.");
        zzu.zza(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = (zzs)googleapiclient.zza(Drive.zzNX);
        zzaex.zzpm().setContext(googleapiclient.getContext());
        int i;
        if (zzaey == null)
        {
            i = 0;
        } else
        {
            i = zzaey.intValue();
        }
        try
        {
            googleapiclient = googleapiclient.zzpB().zza(new CreateFileIntentSenderRequest(zzaex.zzpm(), i, zzadv, zzady, zzaez));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }

    public void zza(DriveId driveid)
    {
        zzady = (DriveId)zzu.zzu(driveid);
    }

    public void zza(MetadataChangeSet metadatachangeset)
    {
        zzaex = (MetadataChangeSet)zzu.zzu(metadatachangeset);
    }

    public void zzct(int i)
    {
        zzaey = Integer.valueOf(i);
    }

    public void zzcv(String s)
    {
        zzadv = (String)zzu.zzu(s);
    }
}
