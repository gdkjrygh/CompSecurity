// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzl

public class CreateFileRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int zzCY;
    final String zzadn;
    final MetadataBundle zzaeA;
    final Integer zzaeB;
    final DriveId zzaeC;
    final int zzaeD;
    final int zzaeE;
    final boolean zzaen;
    final Contents zzaes;

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s, 
            int j, int k)
    {
        if (contents != null && k != 0)
        {
            boolean flag1;
            if (contents.getRequestId() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            zzu.zzb(flag1, "inconsistent contents reference");
        }
        if ((integer == null || integer.intValue() == 0) && contents == null && k == 0)
        {
            throw new IllegalArgumentException("Need a valid contents");
        } else
        {
            zzCY = i;
            zzaeC = (DriveId)zzu.zzu(driveid);
            zzaeA = (MetadataBundle)zzu.zzu(metadatabundle);
            zzaes = contents;
            zzaeB = integer;
            zzadn = s;
            zzaeD = j;
            zzaen = flag;
            zzaeE = k;
            return;
        }
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, int i, int j, ExecutionOptions executionoptions)
    {
        this(2, driveid, metadatabundle, null, Integer.valueOf(j), executionoptions.zzpj(), executionoptions.zzpi(), executionoptions.zzpk(), i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

}
