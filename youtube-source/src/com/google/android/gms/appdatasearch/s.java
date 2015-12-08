// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            SuggestionResults

public final class s
    implements android.os.Parcelable.Creator
{

    public s()
    {
    }

    static void a(SuggestionResults suggestionresults, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, suggestionresults.mErrorMessage, false);
        b.a(parcel, 1000, suggestionresults.jE);
        b.a(parcel, 2, suggestionresults.la, false);
        b.a(parcel, 3, suggestionresults.lb, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String as1[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s1 = null;
        int i = 0;
        String as[] = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    as = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k);
                    break;

                case 3: // '\003'
                    as1 = com.google.android.gms.common.internal.safeparcel.a.t(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SuggestionResults(i, s1, as, as1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SuggestionResults[i];
    }
}
