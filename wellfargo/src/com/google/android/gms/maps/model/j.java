// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition, LatLng

public class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, cameraposition.a());
        c.a(parcel, 2, cameraposition.a, i, false);
        c.a(parcel, 3, cameraposition.b);
        c.a(parcel, 4, cameraposition.c);
        c.a(parcel, 5, cameraposition.d);
        c.a(parcel, k);
    }

    public CameraPosition a(Parcel parcel)
    {
        float f = 0.0F;
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        LatLng latlng = null;
        float f1 = 0.0F;
        float f2 = 0.0F;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f2 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 5: // '\005'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new CameraPosition(i, latlng, f2, f1, f);
            }
        } while (true);
    }

    public CameraPosition[] a(int i)
    {
        return new CameraPosition[i];
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
