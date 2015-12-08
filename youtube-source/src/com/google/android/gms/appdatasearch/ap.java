// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            SearchResults

public final class ap
    implements android.os.Parcelable.Creator
{

    public ap()
    {
    }

    static void a(SearchResults searchresults, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, searchresults.mErrorMessage, false);
        b.a(parcel, 1000, searchresults.jE);
        b.a(parcel, 2, searchresults.kK, false);
        b.a(parcel, 3, searchresults.kL, false);
        b.a(parcel, 4, searchresults.kM, i, false);
        b.a(parcel, 5, searchresults.kN, i, false);
        b.a(parcel, 6, searchresults.kO, i, false);
        b.a(parcel, 7, searchresults.kP);
        b.a(parcel, 8, searchresults.kQ, false);
        b.a(parcel, 9, searchresults.kR, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String as[] = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int ai[] = null;
        Bundle abundle[] = null;
        Bundle abundle1[] = null;
        Bundle abundle2[] = null;
        byte abyte0[] = null;
        int ai1[] = null;
        String s = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    ai1 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 3: // '\003'
                    abyte0 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 4: // '\004'
                    abundle2 = (Bundle[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Bundle.CREATOR);
                    break;

                case 5: // '\005'
                    abundle1 = (Bundle[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Bundle.CREATOR);
                    break;

                case 6: // '\006'
                    abundle = (Bundle[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, Bundle.CREATOR);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 8: // '\b'
                    ai = com.google.android.gms.common.internal.safeparcel.a.q(parcel, l);
                    break;

                case 9: // '\t'
                    as = com.google.android.gms.common.internal.safeparcel.a.t(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new SearchResults(j, s, ai1, abyte0, abundle2, abundle1, abundle, i, ai, as);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SearchResults[i];
    }
}
