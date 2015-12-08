// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            PhraseAffinitySpecification, PhraseAffinityCorpusSpec

public final class ai
    implements android.os.Parcelable.Creator
{

    public ai()
    {
    }

    static void a(PhraseAffinitySpecification phraseaffinityspecification, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, phraseaffinityspecification.ks, i, false);
        b.a(parcel, 1000, phraseaffinityspecification.jE);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        PhraseAffinityCorpusSpec aphraseaffinitycorpusspec[] = null;
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
                    aphraseaffinitycorpusspec = (PhraseAffinityCorpusSpec[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, PhraseAffinityCorpusSpec.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PhraseAffinitySpecification(i, aphraseaffinitycorpusspec);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new PhraseAffinitySpecification[i];
    }
}
