// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoResult

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(PlacePhotoResult placephotoresult, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, placephotoresult.a(), i, false);
        c.a(parcel, 1000, placephotoresult.a);
        c.a(parcel, 2, placephotoresult.b, i, false);
        c.a(parcel, k);
    }

    public PlacePhotoResult a(Parcel parcel)
    {
        BitmapTeleporter bitmapteleporter = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    bitmapteleporter = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, BitmapTeleporter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlacePhotoResult(i, status, bitmapteleporter);
            }
        } while (true);
    }

    public PlacePhotoResult[] a(int i)
    {
        return new PlacePhotoResult[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
