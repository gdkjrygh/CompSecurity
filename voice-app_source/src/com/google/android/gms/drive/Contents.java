// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive:
//            zzb, DriveId

public class Contents
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int zzCY;
    final ParcelFileDescriptor zzYZ;
    final int zzacR;
    final int zzacS;
    final DriveId zzacT;
    final boolean zzacU;

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, boolean flag)
    {
        zzCY = i;
        zzYZ = parcelfiledescriptor;
        zzacR = j;
        zzacS = k;
        zzacT = driveid;
        zzacU = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return zzacT;
    }

    public InputStream getInputStream()
    {
        return new FileInputStream(zzYZ.getFileDescriptor());
    }

    public int getMode()
    {
        return zzacS;
    }

    public OutputStream getOutputStream()
    {
        return new FileOutputStream(zzYZ.getFileDescriptor());
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        return zzYZ;
    }

    public int getRequestId()
    {
        return zzacR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public boolean zzpc()
    {
        return zzacU;
    }

}
