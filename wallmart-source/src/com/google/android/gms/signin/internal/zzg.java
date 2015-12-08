// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.signin.internal:
//            RecordConsentRequest

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void zza(RecordConsentRequest recordconsentrequest, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, recordconsentrequest.mVersionCode);
        zzb.zza(parcel, 2, recordconsentrequest.getAccount(), i, false);
        zzb.zza(parcel, 3, recordconsentrequest.zzzs(), i, false);
        zzb.zza(parcel, 4, recordconsentrequest.zzlG(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgl(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjb(i);
    }

    public RecordConsentRequest zzgl(Parcel parcel)
    {
        String s;
        Object obj;
        Scope ascope[];
        int i;
        int j;
        s = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        i = 0;
        ascope = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbH(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 97
    //                   2 118
    //                   3 142
    //                   4 165;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_165;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        Scope ascope1[] = ascope;
        ascope = ((Scope []) (obj));
        obj = ascope1;
_L8:
        Scope ascope2[] = ascope;
        ascope = ((Scope []) (obj));
        obj = ascope2;
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj1 = obj;
        obj = ascope;
        ascope = ((Scope []) (obj1));
          goto _L8
_L3:
        Account account = (Account)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Account.CREATOR);
        obj = ascope;
        ascope = account;
          goto _L8
_L4:
        Scope ascope3[] = (Scope[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, Scope.CREATOR);
        ascope = ((Scope []) (obj));
        obj = ascope3;
          goto _L8
        s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
        Scope ascope4[] = ((Scope []) (obj));
        obj = ascope;
        ascope = ascope4;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new RecordConsentRequest(i, ((Account) (obj)), ascope, s);
        }
    }

    public RecordConsentRequest[] zzjb(int i)
    {
        return new RecordConsentRequest[i];
    }
}
