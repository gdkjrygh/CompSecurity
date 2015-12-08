// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzan;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzlg;
import com.google.android.gms.internal.zzlo;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.drive.events:
//            ResourceEvent, zze

public final class CompletionEvent
    implements SafeParcelable, ResourceEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS = 0;
    final int zzCY;
    final String zzOx;
    final DriveId zzacT;
    final ParcelFileDescriptor zzadT;
    final ParcelFileDescriptor zzadU;
    final MetadataBundle zzadV;
    final List zzadW;
    final IBinder zzadX;
    private boolean zzadY;
    private boolean zzadZ;
    private boolean zzaea;
    final int zzwS;

    CompletionEvent(int i, DriveId driveid, String s, ParcelFileDescriptor parcelfiledescriptor, ParcelFileDescriptor parcelfiledescriptor1, MetadataBundle metadatabundle, List list, 
            int j, IBinder ibinder)
    {
        zzadY = false;
        zzadZ = false;
        zzaea = false;
        zzCY = i;
        zzacT = driveid;
        zzOx = s;
        zzadT = parcelfiledescriptor;
        zzadU = parcelfiledescriptor1;
        zzadV = metadatabundle;
        zzadW = list;
        zzwS = j;
        zzadX = ibinder;
    }

    private void zzpu()
    {
        if (zzaea)
        {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        } else
        {
            return;
        }
    }

    private void zzv(boolean flag)
    {
        zzpu();
        zzaea = true;
        zzlg.zza(zzadT);
        zzlg.zza(zzadU);
        if (zzadV != null && zzadV.zzc(zzlo.zzaho))
        {
            ((BitmapTeleporter)zzadV.zza(zzlo.zzaho)).release();
        }
        if (zzadX == null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("No callback on ");
            String s;
            if (flag)
            {
                s = "snooze";
            } else
            {
                s = "dismiss";
            }
            zzx.zzv("CompletionEvent", stringbuilder.append(s).toString());
            return;
        }
        try
        {
            com.google.android.gms.drive.internal.zzan.zza.zzaR(zzadX).zzv(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            StringBuilder stringbuilder1 = (new StringBuilder()).append("RemoteException on ");
            String s1;
            if (flag)
            {
                s1 = "snooze";
            } else
            {
                s1 = "dismiss";
            }
            zzx.zzv("CompletionEvent", stringbuilder1.append(s1).append(": ").append(remoteexception).toString());
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void dismiss()
    {
        zzv(false);
    }

    public String getAccountName()
    {
        zzpu();
        return zzOx;
    }

    public InputStream getBaseContentsInputStream()
    {
        zzpu();
        if (zzadT == null)
        {
            return null;
        }
        if (zzadY)
        {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            zzadY = true;
            return new FileInputStream(zzadT.getFileDescriptor());
        }
    }

    public DriveId getDriveId()
    {
        zzpu();
        return zzacT;
    }

    public InputStream getModifiedContentsInputStream()
    {
        zzpu();
        if (zzadU == null)
        {
            return null;
        }
        if (zzadZ)
        {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        } else
        {
            zzadZ = true;
            return new FileInputStream(zzadU.getFileDescriptor());
        }
    }

    public MetadataChangeSet getModifiedMetadataChangeSet()
    {
        zzpu();
        if (zzadV != null)
        {
            return new MetadataChangeSet(zzadV);
        } else
        {
            return null;
        }
    }

    public int getStatus()
    {
        zzpu();
        return zzwS;
    }

    public List getTrackingTags()
    {
        zzpu();
        return new ArrayList(zzadW);
    }

    public int getType()
    {
        return 2;
    }

    public void snooze()
    {
        zzv(true);
    }

    public String toString()
    {
        String s;
        if (zzadW == null)
        {
            s = "<null>";
        } else
        {
            s = (new StringBuilder()).append("'").append(TextUtils.join("','", zzadW)).append("'").toString();
        }
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] {
            zzacT, Integer.valueOf(zzwS), s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i | 1);
    }

}
