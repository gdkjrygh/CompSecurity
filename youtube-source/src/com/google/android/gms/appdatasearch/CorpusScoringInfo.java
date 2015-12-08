// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            t, CorpusId

public class CorpusScoringInfo
    implements SafeParcelable
{

    public static final t CREATOR = new t();
    public final CorpusId corpus;
    final int jE;
    public final int weight;

    CorpusScoringInfo(int i, CorpusId corpusid, int j)
    {
        jE = i;
        corpus = corpusid;
        weight = j;
    }

    public CorpusScoringInfo(CorpusId corpusid, int i)
    {
        this(1, corpusid, i);
    }

    public CorpusScoringInfo(String s, int i)
    {
        this(1, new CorpusId(s, null), i);
    }

    public CorpusScoringInfo(String s, String s1, int i)
    {
        this(new CorpusId(s, s1), i);
    }

    public int describeContents()
    {
        t t1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t t1 = CREATOR;
        t.a(this, parcel, i);
    }

}
