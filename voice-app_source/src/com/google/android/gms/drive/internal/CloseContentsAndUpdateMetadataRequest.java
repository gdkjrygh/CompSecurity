// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzg

public class CloseContentsAndUpdateMetadataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    final int zzCY;
    final String zzadn;
    final boolean zzado;
    final DriveId zzaeq;
    final MetadataBundle zzaer;
    final Contents zzaes;
    final int zzaet;
    final int zzaeu;
    final boolean zzaev;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, boolean flag, String s, int j, 
            int k, boolean flag1)
    {
        zzCY = i;
        zzaeq = driveid;
        zzaer = metadatabundle;
        zzaes = contents;
        zzado = flag;
        zzadn = s;
        zzaet = j;
        zzaeu = k;
        zzaev = flag1;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveid, MetadataBundle metadatabundle, int i, boolean flag, ExecutionOptions executionoptions)
    {
        this(1, driveid, metadatabundle, null, executionoptions.zzpj(), executionoptions.zzpi(), executionoptions.zzpk(), i, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

}
