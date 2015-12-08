// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CloseContentsRequest

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(CloseContentsRequest closecontentsrequest, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, closecontentsrequest.zzCY);
        zzb.zza(parcel, 2, closecontentsrequest.zzaes, i, false);
        zzb.zza(parcel, 3, closecontentsrequest.zzaew, false);
        zzb.zzc(parcel, 4, closecontentsrequest.zzaeu);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaH(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcr(i);
    }

    public CloseContentsRequest zzaH(Parcel parcel)
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        obj1 = null;
        i = 0;
        k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        obj = null;
        j = 0;
_L7:
        int l;
        if (parcel.dataPosition() >= k)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbA(l);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 93
    //                   2 112
    //                   3 134
    //                   4 150;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_150;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        Contents contents = (Contents)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Contents.CREATOR);
        obj = obj1;
        obj1 = contents;
          goto _L8
_L4:
        Boolean boolean1 = com.google.android.gms.common.internal.safeparcel.zza.zzd(parcel, l);
        obj1 = obj;
        obj = boolean1;
          goto _L8
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != k)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
        } else
        {
            return new CloseContentsRequest(j, ((Contents) (obj)), ((Boolean) (obj1)), i);
        }
    }

    public CloseContentsRequest[] zzcr(int i)
    {
        return new CloseContentsRequest[i];
    }
}
