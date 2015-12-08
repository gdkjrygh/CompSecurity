// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            CorpusScoringInfo, CorpusId

public final class t
    implements android.os.Parcelable.Creator
{

    public t()
    {
    }

    static void a(CorpusScoringInfo corpusscoringinfo, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, corpusscoringinfo.corpus, i, false);
        b.a(parcel, 1000, corpusscoringinfo.jE);
        b.a(parcel, 2, corpusscoringinfo.weight);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        CorpusId corpusid = null;
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
                    corpusid = (CorpusId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, CorpusId.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CorpusScoringInfo(i, corpusid, j);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new CorpusScoringInfo[i];
    }
}
