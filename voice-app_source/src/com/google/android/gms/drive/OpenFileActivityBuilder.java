// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.zzak;
import com.google.android.gms.drive.internal.zzs;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.zzg;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveId

public class OpenFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String zzadv;
    private String zzadw[];
    private Filter zzadx;
    private DriveId zzady;

    public OpenFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        zzu.zza(googleapiclient.isConnected(), "Client must be connected");
        if (zzadw == null)
        {
            zzadw = new String[0];
        }
        if (zzadw.length > 0 && zzadx != null)
        {
            throw new IllegalStateException("Cannot use a selection filter and set mimetypes simultaneously");
        }
        FilterHolder filterholder;
        if (zzadx == null)
        {
            filterholder = null;
        } else
        {
            filterholder = new FilterHolder(zzadx);
        }
        try
        {
            googleapiclient = ((zzs)googleapiclient.zza(Drive.zzNX)).zzpB().zza(new OpenFileIntentSenderRequest(zzadv, zzadw, zzady, filterholder));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }

    public OpenFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        zzady = (DriveId)zzu.zzu(driveid);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String s)
    {
        zzadv = (String)zzu.zzu(s);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String as[])
    {
        boolean flag;
        if (as != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "mimeTypes may not be null");
        zzadw = as;
        return this;
    }

    public OpenFileActivityBuilder setSelectionFilter(Filter filter)
    {
        boolean flag1 = true;
        boolean flag;
        if (filter != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "filter may not be null");
        if (!zzg.zza(filter))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "FullTextSearchFilter cannot be used as a selection filter");
        zzadx = filter;
        return this;
    }
}
