// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GlobalSearchQuerySpecification, CorpusId, CorpusScoringInfo

public final class ad
    implements android.os.Parcelable.Creator
{

    public ad()
    {
    }

    static void a(GlobalSearchQuerySpecification globalsearchqueryspecification, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, globalsearchqueryspecification.jV, i, false);
        b.a(parcel, 1000, globalsearchqueryspecification.jE);
        b.a(parcel, 2, globalsearchqueryspecification.scoringVerbosityLevel);
        b.a(parcel, 3, globalsearchqueryspecification.jW, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        CorpusId acorpusid[] = null;
        int i = 0;
        CorpusScoringInfo acorpusscoringinfo[] = null;
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
                    acorpusid = (CorpusId[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, CorpusId.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 3: // '\003'
                    acorpusscoringinfo = (CorpusScoringInfo[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, CorpusScoringInfo.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GlobalSearchQuerySpecification(i, acorpusid, j, acorpusscoringinfo);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GlobalSearchQuerySpecification[i];
    }
}
