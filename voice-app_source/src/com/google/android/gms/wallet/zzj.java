// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

// Referenced classes of package com.google.android.gms.wallet:
//            LoyaltyWalletObject

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void zza(LoyaltyWalletObject loyaltywalletobject, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, loyaltywalletobject.getVersionCode());
        zzb.zza(parcel, 2, loyaltywalletobject.zzhI, false);
        zzb.zza(parcel, 3, loyaltywalletobject.zzaQM, false);
        zzb.zza(parcel, 4, loyaltywalletobject.zzaQN, false);
        zzb.zza(parcel, 5, loyaltywalletobject.zzaQO, false);
        zzb.zza(parcel, 6, loyaltywalletobject.zzaBb, false);
        zzb.zza(parcel, 7, loyaltywalletobject.zzaQP, false);
        zzb.zza(parcel, 8, loyaltywalletobject.zzaQQ, false);
        zzb.zza(parcel, 9, loyaltywalletobject.zzaQR, false);
        zzb.zza(parcel, 10, loyaltywalletobject.zzaQS, false);
        zzb.zza(parcel, 11, loyaltywalletobject.zzaQT, false);
        zzb.zzc(parcel, 12, loyaltywalletobject.state);
        zzb.zzc(parcel, 13, loyaltywalletobject.zzaQU, false);
        zzb.zza(parcel, 14, loyaltywalletobject.zzaQV, i, false);
        zzb.zzc(parcel, 15, loyaltywalletobject.zzaQW, false);
        zzb.zza(parcel, 17, loyaltywalletobject.zzaQY, false);
        zzb.zza(parcel, 16, loyaltywalletobject.zzaQX, false);
        zzb.zza(parcel, 19, loyaltywalletobject.zzaRa);
        zzb.zzc(parcel, 18, loyaltywalletobject.zzaQZ, false);
        zzb.zzc(parcel, 21, loyaltywalletobject.zzaRc, false);
        zzb.zzc(parcel, 20, loyaltywalletobject.zzaRb, false);
        zzb.zza(parcel, 23, loyaltywalletobject.zzaRe, i, false);
        zzb.zzc(parcel, 22, loyaltywalletobject.zzaRd, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzjl(i);
    }

    public LoyaltyWalletObject zzgj(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int j = 0;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        int i = 0;
        java.util.ArrayList arraylist5 = zzkx.zzoP();
        TimeInterval timeinterval = null;
        java.util.ArrayList arraylist4 = zzkx.zzoP();
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist3 = zzkx.zzoP();
        boolean flag = false;
        java.util.ArrayList arraylist2 = zzkx.zzoP();
        java.util.ArrayList arraylist1 = zzkx.zzoP();
        java.util.ArrayList arraylist = zzkx.zzoP();
        LoyaltyPoints loyaltypoints = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    s11 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    s10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 4: // '\004'
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 5: // '\005'
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 6: // '\006'
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 7: // '\007'
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 8: // '\b'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, WalletObjectMessage.CREATOR);
                    break;

                case 14: // '\016'
                    timeinterval = (TimeInterval)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, TimeInterval.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, LatLng.CREATOR);
                    break;

                case 17: // '\021'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;

                case 18: // '\022'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, LabelValueRow.CREATOR);
                    break;

                case 21: // '\025'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, TextModuleData.CREATOR);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, UriData.CREATOR);
                    break;

                case 23: // '\027'
                    loyaltypoints = (LoyaltyPoints)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, LoyaltyPoints.CREATOR);
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, UriData.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LoyaltyWalletObject(j, s11, s10, s9, s8, s7, s6, s5, s4, s3, s2, i, arraylist5, timeinterval, arraylist4, s1, s, arraylist3, flag, arraylist2, arraylist1, arraylist, loyaltypoints);
            }
        } while (true);
    }

    public LoyaltyWalletObject[] zzjl(int i)
    {
        return new LoyaltyWalletObject[i];
    }
}
