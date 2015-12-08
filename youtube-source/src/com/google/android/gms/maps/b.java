// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public final class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    public static GoogleMapOptions a(Parcel parcel)
    {
        byte byte0 = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        CameraPosition cameraposition = null;
        byte byte1 = 0;
        byte byte2 = 0;
        byte byte3 = 0;
        byte byte4 = 0;
        byte byte5 = 0;
        int i = 0;
        byte byte6 = 0;
        byte byte7 = 0;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    byte7 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 3: // '\003'
                    byte6 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte5 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 7: // '\007'
                    byte4 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 8: // '\b'
                    byte3 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 9: // '\t'
                    byte2 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 10: // '\n'
                    byte1 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;

                case 11: // '\013'
                    byte0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte7, byte6, i, cameraposition, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, googlemapoptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, googlemapoptions.el());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, googlemapoptions.em());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, googlemapoptions.getMapType());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, googlemapoptions.en());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, googlemapoptions.eo());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, googlemapoptions.ep());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, googlemapoptions.eq());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, googlemapoptions.er());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, googlemapoptions.es());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }
}
