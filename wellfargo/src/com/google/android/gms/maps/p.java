// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, googlemapoptions.a());
        c.a(parcel, 2, googlemapoptions.b());
        c.a(parcel, 3, googlemapoptions.c());
        c.a(parcel, 4, googlemapoptions.l());
        c.a(parcel, 5, googlemapoptions.m(), i, false);
        c.a(parcel, 6, googlemapoptions.d());
        c.a(parcel, 7, googlemapoptions.e());
        c.a(parcel, 8, googlemapoptions.f());
        c.a(parcel, 9, googlemapoptions.g());
        c.a(parcel, 10, googlemapoptions.h());
        c.a(parcel, 11, googlemapoptions.i());
        c.a(parcel, 12, googlemapoptions.j());
        c.a(parcel, 14, googlemapoptions.k());
        c.a(parcel, j);
    }

    public GoogleMapOptions a(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        byte byte9 = -1;
        byte byte8 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte7 = -1;
        byte byte6 = -1;
        byte byte5 = -1;
        byte byte4 = -1;
        byte byte3 = -1;
        byte byte2 = -1;
        byte byte1 = -1;
        byte byte0 = -1;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                case 13: // '\r'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    byte9 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 3: // '\003'
                    byte8 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte7 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte6 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte5 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;

                case 14: // '\016'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public GoogleMapOptions[] a(int i)
    {
        return new GoogleMapOptions[i];
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
