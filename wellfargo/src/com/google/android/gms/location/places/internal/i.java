// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(AutocompletePredictionEntity.SubstringEntity substringentity, Parcel parcel, int j)
    {
        j = c.a(parcel);
        c.a(parcel, 1, substringentity.b);
        c.a(parcel, 1000, substringentity.a);
        c.a(parcel, 2, substringentity.c);
        c.a(parcel, j);
    }

    public AutocompletePredictionEntity.SubstringEntity a(Parcel parcel)
    {
        int l = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity.SubstringEntity(j, k, l);
            }
        } while (true);
    }

    public AutocompletePredictionEntity.SubstringEntity[] a(int j)
    {
        return new AutocompletePredictionEntity.SubstringEntity[j];
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
