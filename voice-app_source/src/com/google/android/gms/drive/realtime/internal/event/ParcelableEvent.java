// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zzc, TextInsertedDetails, TextDeletedDetails, ValuesAddedDetails, 
//            ValuesRemovedDetails, ValuesSetDetails, ValueChangedDetails, ReferenceShiftedDetails, 
//            ObjectChangedDetails, FieldChangedDetails

public class ParcelableEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int zzCY;
    final String zzEO;
    final String zzFE;
    final List zzaiC;
    final boolean zzaiD;
    final boolean zzaiE;
    final boolean zzaiF;
    final String zzaiG;
    final TextInsertedDetails zzaiH;
    final TextDeletedDetails zzaiI;
    final ValuesAddedDetails zzaiJ;
    final ValuesRemovedDetails zzaiK;
    final ValuesSetDetails zzaiL;
    final ValueChangedDetails zzaiM;
    final ReferenceShiftedDetails zzaiN;
    final ObjectChangedDetails zzaiO;
    final FieldChangedDetails zzaiP;
    final String zzaiw;

    ParcelableEvent(int i, String s, String s1, List list, boolean flag, boolean flag1, boolean flag2, 
            String s2, String s3, TextInsertedDetails textinserteddetails, TextDeletedDetails textdeleteddetails, ValuesAddedDetails valuesaddeddetails, ValuesRemovedDetails valuesremoveddetails, ValuesSetDetails valuessetdetails, 
            ValueChangedDetails valuechangeddetails, ReferenceShiftedDetails referenceshifteddetails, ObjectChangedDetails objectchangeddetails, FieldChangedDetails fieldchangeddetails)
    {
        zzCY = i;
        zzFE = s;
        zzEO = s1;
        zzaiC = list;
        zzaiD = flag;
        zzaiE = flag1;
        zzaiF = flag2;
        zzaiw = s2;
        zzaiG = s3;
        zzaiH = textinserteddetails;
        zzaiI = textdeleteddetails;
        zzaiJ = valuesaddeddetails;
        zzaiK = valuesremoveddetails;
        zzaiL = valuessetdetails;
        zzaiM = valuechangeddetails;
        zzaiN = referenceshifteddetails;
        zzaiO = objectchangeddetails;
        zzaiP = fieldchangeddetails;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
