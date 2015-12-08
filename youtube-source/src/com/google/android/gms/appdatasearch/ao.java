// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            w, DocumentId

public final class ao
    implements android.os.Parcelable.Creator
{

    public ao()
    {
    }

    static void a(w w1, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, w1.jz, false);
        b.a(parcel, 1000, w1.jE);
        b.a(parcel, 2, w1.kI, i, false);
        b.a(parcel, 3, w1.kJ);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        DocumentId adocumentid[] = null;
        String s = null;
        int i = 0;
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
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    adocumentid = (DocumentId[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, DocumentId.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new w(i, s, adocumentid, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new w[i];
    }
}
