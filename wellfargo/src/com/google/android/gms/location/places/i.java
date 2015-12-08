// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoMetadataResult

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(PlacePhotoMetadataResult placephotometadataresult, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, placephotometadataresult.a(), j, false);
        c.a(parcel, 1000, placephotometadataresult.a);
        c.a(parcel, 2, placephotometadataresult.b, j, false);
        c.a(parcel, k);
    }

    public PlacePhotoMetadataResult a(Parcel parcel)
    {
        DataHolder dataholder = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        Status status = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    status = (Status)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Status.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, DataHolder.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlacePhotoMetadataResult(j, status, dataholder);
            }
        } while (true);
    }

    public PlacePhotoMetadataResult[] a(int j)
    {
        return new PlacePhotoMetadataResult[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
