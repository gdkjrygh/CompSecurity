// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterSectionInfo, Feature

public final class al
    implements android.os.Parcelable.Creator
{

    public al()
    {
    }

    static void a(RegisterSectionInfo registersectioninfo, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, registersectioninfo.name, false);
        b.a(parcel, 1000, registersectioninfo.jE);
        b.a(parcel, 2, registersectioninfo.format, false);
        b.a(parcel, 3, registersectioninfo.noIndex);
        b.a(parcel, 4, registersectioninfo.weight);
        b.a(parcel, 5, registersectioninfo.indexPrefixes);
        b.a(parcel, 6, registersectioninfo.subsectionSeparator, false);
        b.a(parcel, 7, registersectioninfo.features, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Feature afeature[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 1;
        String s = null;
        boolean flag1 = false;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 7: // '\007'
                    afeature = (Feature[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Feature.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RegisterSectionInfo(j, s2, s1, flag1, i, flag, s, afeature);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RegisterSectionInfo[i];
    }
}
