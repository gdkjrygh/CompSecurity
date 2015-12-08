// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEvent, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails, FieldChangedDetails

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(ParcelableEvent parcelableevent, Parcel parcel, int i)
    {
        int j = zzb.zzac(parcel);
        zzb.zzc(parcel, 1, parcelableevent.zzCY);
        zzb.zza(parcel, 2, parcelableevent.zzFE, false);
        zzb.zza(parcel, 3, parcelableevent.zzEO, false);
        zzb.zzb(parcel, 4, parcelableevent.zzaiC, false);
        zzb.zza(parcel, 5, parcelableevent.zzaiD);
        zzb.zza(parcel, 6, parcelableevent.zzaiw, false);
        zzb.zza(parcel, 7, parcelableevent.zzaiG, false);
        zzb.zza(parcel, 8, parcelableevent.zzaiH, i, false);
        zzb.zza(parcel, 9, parcelableevent.zzaiI, i, false);
        zzb.zza(parcel, 10, parcelableevent.zzaiJ, i, false);
        zzb.zza(parcel, 11, parcelableevent.zzaiK, i, false);
        zzb.zza(parcel, 12, parcelableevent.zzaiL, i, false);
        zzb.zza(parcel, 13, parcelableevent.zzaiM, i, false);
        zzb.zza(parcel, 14, parcelableevent.zzaiN, i, false);
        zzb.zza(parcel, 15, parcelableevent.zzaiO, i, false);
        zzb.zza(parcel, 17, parcelableevent.zzaiF);
        zzb.zza(parcel, 16, parcelableevent.zzaiE);
        zzb.zza(parcel, 18, parcelableevent.zzaiP, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbZ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdP(i);
    }

    public ParcelableEvent zzbZ(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel);
        int i = 0;
        String s3 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        String s1 = null;
        String s = null;
        TextInsertedDetails textinserteddetails = null;
        TextDeletedDetails textdeleteddetails = null;
        ValuesAddedDetails valuesaddeddetails = null;
        ValuesRemovedDetails valuesremoveddetails = null;
        ValuesSetDetails valuessetdetails = null;
        ValueChangedDetails valuechangeddetails = null;
        ReferenceShiftedDetails referenceshifteddetails = null;
        ObjectChangedDetails objectchangeddetails = null;
        FieldChangedDetails fieldchangeddetails = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzbA(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    textinserteddetails = (TextInsertedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, TextInsertedDetails.CREATOR);
                    break;

                case 9: // '\t'
                    textdeleteddetails = (TextDeletedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, TextDeletedDetails.CREATOR);
                    break;

                case 10: // '\n'
                    valuesaddeddetails = (ValuesAddedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValuesAddedDetails.CREATOR);
                    break;

                case 11: // '\013'
                    valuesremoveddetails = (ValuesRemovedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValuesRemovedDetails.CREATOR);
                    break;

                case 12: // '\f'
                    valuessetdetails = (ValuesSetDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValuesSetDetails.CREATOR);
                    break;

                case 13: // '\r'
                    valuechangeddetails = (ValueChangedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ValueChangedDetails.CREATOR);
                    break;

                case 14: // '\016'
                    referenceshifteddetails = (ReferenceShiftedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ReferenceShiftedDetails.CREATOR);
                    break;

                case 15: // '\017'
                    objectchangeddetails = (ObjectChangedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, ObjectChangedDetails.CREATOR);
                    break;

                case 17: // '\021'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 16: // '\020'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 18: // '\022'
                    fieldchangeddetails = (FieldChangedDetails)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, FieldChangedDetails.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ParcelableEvent(i, s3, s2, arraylist, flag2, flag1, flag, s1, s, textinserteddetails, textdeleteddetails, valuesaddeddetails, valuesremoveddetails, valuessetdetails, valuechangeddetails, referenceshifteddetails, objectchangeddetails, fieldchangeddetails);
            }
        } while (true);
    }

    public ParcelableEvent[] zzdP(int i)
    {
        return new ParcelableEvent[i];
    }
}
