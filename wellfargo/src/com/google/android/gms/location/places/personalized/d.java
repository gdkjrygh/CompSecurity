// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.location.places.personalized.internal.TestDataImpl;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData, PlaceAlias, HereContent

public class d
    implements android.os.Parcelable.Creator
{

    public d()
    {
    }

    static void a(PlaceUserData placeuserdata, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, placeuserdata.a(), false);
        c.a(parcel, 1000, placeuserdata.a);
        c.a(parcel, 2, placeuserdata.b(), false);
        c.c(parcel, 5, placeuserdata.e(), false);
        c.c(parcel, 6, placeuserdata.c(), false);
        c.c(parcel, 7, placeuserdata.d(), false);
        c.a(parcel, i);
    }

    public PlaceUserData a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
        String s = null;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, TestDataImpl.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, PlaceAlias.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, HereContent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceUserData(i, s1, s, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public PlaceUserData[] a(int i)
    {
        return new PlaceUserData[i];
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
