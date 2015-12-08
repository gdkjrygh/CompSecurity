// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            SharedContent, ViewableItem, LocalContent

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(SharedContent sharedcontent, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, sharedcontent.getVersionCode());
        zzb.zza(parcel, 3, sharedcontent.getUri(), false);
        zzb.zza(parcel, 8, sharedcontent.zzxe(), i, false);
        zzb.zza(parcel, 9, sharedcontent.zzxf(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfA(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzip(i);
    }

    public SharedContent zzfA(Parcel parcel)
    {
        LocalContent alocalcontent[];
        Object obj;
        ViewableItem aviewableitem[];
        int i;
        int j;
        alocalcontent = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        i = 0;
        aviewableitem = null;
        obj = null;
_L7:
        int k;
        if (parcel.dataPosition() >= j)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzbA(k);
        JVM INSTR tableswitch 1 9: default 88
    //                   1 117
    //                   2 88
    //                   3 138
    //                   4 88
    //                   5 88
    //                   6 88
    //                   7 88
    //                   8 156
    //                   9 179;
           goto _L1 _L2 _L1 _L3 _L1 _L1 _L1 _L1 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_179;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        ViewableItem aviewableitem1[] = aviewableitem;
        aviewableitem = ((ViewableItem []) (obj));
        obj = aviewableitem1;
_L8:
        ViewableItem aviewableitem2[] = aviewableitem;
        aviewableitem = ((ViewableItem []) (obj));
        obj = aviewableitem2;
        if (true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj1 = obj;
        obj = aviewableitem;
        aviewableitem = ((ViewableItem []) (obj1));
          goto _L8
_L3:
        String s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
        obj = aviewableitem;
        aviewableitem = s;
          goto _L8
_L4:
        ViewableItem aviewableitem3[] = (ViewableItem[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, ViewableItem.CREATOR);
        aviewableitem = ((ViewableItem []) (obj));
        obj = aviewableitem3;
          goto _L8
        alocalcontent = (LocalContent[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k, LocalContent.CREATOR);
        ViewableItem aviewableitem4[] = ((ViewableItem []) (obj));
        obj = aviewableitem;
        aviewableitem = aviewableitem4;
          goto _L8
        if (parcel.dataPosition() != j)
        {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            return new SharedContent(i, ((String) (obj)), aviewableitem, alocalcontent);
        }
    }

    public SharedContent[] zzip(int i)
    {
        return new SharedContent[i];
    }
}
