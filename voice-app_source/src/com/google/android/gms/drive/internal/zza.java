// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AddEventListenerRequest

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(AddEventListenerRequest addeventlistenerrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, addeventlistenerrequest.zzCY);
        zzb.zza(parcel, 2, addeventlistenerrequest.zzacT, i, false);
        zzb.zzc(parcel, 3, addeventlistenerrequest.zzaca);
        zzb.zza(parcel, 4, addeventlistenerrequest.zzadO, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaB(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcl(i);
    }

    public AddEventListenerRequest zzaB(Parcel parcel)
    {
        ChangesAvailableOptions changesavailableoptions;
        DriveId driveid;
        int i;
        int j;
        int l;
        changesavailableoptions = null;
        j = 0;
        l = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        driveid = null;
        i = 0;
_L7:
        int k;
        if (parcel.dataPosition() >= l)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbA(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 101
    //                   2 120
    //                   3 148
    //                   4 167;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_167;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        k = j;
        j = i;
        i = k;
_L8:
        k = j;
        j = i;
        i = k;
        if (true) goto _L7; else goto _L6
_L6:
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        i = j;
        j = k;
          goto _L8
_L3:
        driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, DriveId.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
_L4:
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        j = i;
        i = k;
          goto _L8
        changesavailableoptions = (ChangesAvailableOptions)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ChangesAvailableOptions.CREATOR);
        k = i;
        i = j;
        j = k;
          goto _L8
        if (parcel.dataPosition() != l)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
        } else
        {
            return new AddEventListenerRequest(i, driveid, j, changesavailableoptions);
        }
    }

    public AddEventListenerRequest[] zzcl(int i)
    {
        return new AddEventListenerRequest[i];
    }
}
