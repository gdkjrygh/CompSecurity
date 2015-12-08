// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.cast:
//            CastDevice

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(CastDevice castdevice, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, castdevice.getVersionCode());
        b.a(parcel, 2, castdevice.getDeviceId(), false);
        b.a(parcel, 3, castdevice.ol, false);
        b.a(parcel, 4, castdevice.getFriendlyName(), false);
        b.a(parcel, 5, castdevice.getModelName(), false);
        b.a(parcel, 6, castdevice.getDeviceVersion(), false);
        b.a(parcel, 7, castdevice.getServicePort());
        b.b(parcel, 8, castdevice.getIcons(), false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 8: // '\b'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, WebImage.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CastDevice(j, s4, s3, s2, s1, s, i, arraylist);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CastDevice[i];
    }
}
