// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            DocumentResults

public final class x
    implements android.os.Parcelable.Creator
{

    public x()
    {
    }

    static void a(DocumentResults documentresults, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, documentresults.mErrorMessage, false);
        b.a(parcel, 1000, documentresults.jE);
        b.a(parcel, 2, documentresults.jO, false);
        b.a(parcel, 3, documentresults.jP, false);
        b.a(parcel, 4, documentresults.jQ, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        android.os.Bundle bundle1 = null;
        android.os.Bundle bundle2 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    bundle2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 3: // '\003'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DocumentResults(i, s, bundle2, bundle1, bundle);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new DocumentResults[i];
    }
}
