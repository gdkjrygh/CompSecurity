// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImpl, PlaceLocalization

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(PlaceImpl placeimpl, Parcel parcel, int i)
    {
        int j = zzb.zzak(parcel);
        zzb.zza(parcel, 1, placeimpl.getId(), false);
        zzb.zza(parcel, 2, placeimpl.zzwo(), false);
        zzb.zza(parcel, 3, placeimpl.zzwq(), i, false);
        zzb.zza(parcel, 4, placeimpl.getLatLng(), i, false);
        zzb.zza(parcel, 5, placeimpl.zzwj());
        zzb.zza(parcel, 6, placeimpl.getViewport(), i, false);
        zzb.zza(parcel, 7, placeimpl.zzwp(), false);
        zzb.zza(parcel, 8, placeimpl.getWebsiteUri(), i, false);
        zzb.zza(parcel, 9, placeimpl.zzwm());
        zzb.zza(parcel, 10, placeimpl.getRating());
        zzb.zzc(parcel, 11, placeimpl.getPriceLevel());
        zzb.zza(parcel, 12, placeimpl.zzwn());
        zzb.zza(parcel, 13, placeimpl.zzwi(), false);
        zzb.zza(parcel, 14, placeimpl.getAddress(), false);
        zzb.zza(parcel, 15, placeimpl.getPhoneNumber(), false);
        zzb.zzb(parcel, 17, placeimpl.zzwl(), false);
        zzb.zza(parcel, 16, placeimpl.zzwk(), false);
        zzb.zzc(parcel, 1000, placeimpl.mVersionCode);
        zzb.zza(parcel, 19, placeimpl.getName(), false);
        zzb.zza(parcel, 18, placeimpl.zzaEC);
        zzb.zza(parcel, 20, placeimpl.getPlaceTypes(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeK(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhk(i);
    }

    public PlaceImpl zzeK(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzaj(parcel);
        int j = 0;
        String s5 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        android.os.Bundle bundle = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        LatLng latlng = null;
        float f1 = 0.0F;
        LatLngBounds latlngbounds = null;
        String s = null;
        Uri uri = null;
        boolean flag1 = false;
        float f = 0.0F;
        int i = 0;
        long l1 = 0L;
        boolean flag = false;
        PlaceLocalization placelocalization = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzai(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, l);
                    break;

                case 3: // '\003'
                    placelocalization = (PlaceLocalization)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, PlaceLocalization.CREATOR);
                    break;

                case 4: // '\004'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, LatLng.CREATOR);
                    break;

                case 5: // '\005'
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, l);
                    break;

                case 6: // '\006'
                    latlngbounds = (LatLngBounds)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, LatLngBounds.CREATOR);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 8: // '\b'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;

                case 10: // '\n'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, l);
                    break;

                case 11: // '\013'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 12: // '\f'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 13: // '\r'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzB(parcel, l);
                    break;

                case 14: // '\016'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 17: // '\021'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, l);
                    break;

                case 16: // '\020'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 19: // '\023'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 18: // '\022'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;

                case 20: // '\024'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzB(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlaceImpl(j, s5, arraylist2, arraylist1, bundle, s4, s3, s2, s1, arraylist, latlng, f1, latlngbounds, s, uri, flag1, f, i, l1, flag, placelocalization);
            }
        } while (true);
    }

    public PlaceImpl[] zzhk(int i)
    {
        return new PlaceImpl[i];
    }
}
