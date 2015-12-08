// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera

public class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, streetviewpanoramacamera.a());
        c.a(parcel, 2, streetviewpanoramacamera.a);
        c.a(parcel, 3, streetviewpanoramacamera.b);
        c.a(parcel, 4, streetviewpanoramacamera.c);
        c.a(parcel, i);
    }

    public StreetViewPanoramaCamera a(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    public StreetViewPanoramaCamera[] a(int i)
    {
        return new StreetViewPanoramaCamera[i];
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
