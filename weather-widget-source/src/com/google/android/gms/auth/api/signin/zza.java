// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            EmailSignInConfig

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(EmailSignInConfig emailsigninconfig, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, emailsigninconfig.versionCode);
        zzb.zza(parcel, 2, emailsigninconfig.zzlA(), i, false);
        zzb.zza(parcel, 3, emailsigninconfig.zzlC(), false);
        zzb.zza(parcel, 4, emailsigninconfig.zzlB(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzN(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzaD(i);
    }

    public EmailSignInConfig zzN(Parcel parcel)
    {
        Uri uri;
        Object obj;
        Object obj1;
        int i;
        int j;
        uri = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        i = 0;
        obj1 = null;
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
    //                   4 159;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_159;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        Uri uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
        obj = obj1;
        obj1 = uri1;
          goto _L8
_L4:
        String s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
        obj1 = obj;
        obj = s;
          goto _L8
        uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new EmailSignInConfig(i, ((Uri) (obj)), ((String) (obj1)), uri);
        }
    }

    public EmailSignInConfig[] zzaD(int i)
    {
        return new EmailSignInConfig[i];
    }
}
