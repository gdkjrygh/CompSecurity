// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            PhraseAffinityResponse, CorpusId

public final class ah
    implements android.os.Parcelable.Creator
{

    public ah()
    {
    }

    static void a(PhraseAffinityResponse phraseaffinityresponse, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, phraseaffinityresponse.mErrorMessage, false);
        b.a(parcel, 1000, phraseaffinityresponse.jE);
        b.a(parcel, 2, phraseaffinityresponse.kq, i, false);
        b.a(parcel, 3, phraseaffinityresponse.kr, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        CorpusId acorpusid[] = null;
        String s = null;
        int i = 0;
        int ai[] = null;
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
                    acorpusid = (CorpusId[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, CorpusId.CREATOR);
                    break;

                case 3: // '\003'
                    ai = com.google.android.gms.common.internal.safeparcel.a.q(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PhraseAffinityResponse(i, s, acorpusid, ai);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PhraseAffinityResponse[i];
    }
}
