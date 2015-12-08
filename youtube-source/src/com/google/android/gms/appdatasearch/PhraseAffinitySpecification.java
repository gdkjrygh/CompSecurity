// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ai, h, PhraseAffinityCorpusSpec

public class PhraseAffinitySpecification
    implements SafeParcelable
{

    public static final ai CREATOR = new ai();
    public static final int MAX_NUM_PHRASES = 100;
    final int jE;
    final PhraseAffinityCorpusSpec ks[];

    PhraseAffinitySpecification(int i, PhraseAffinityCorpusSpec aphraseaffinitycorpusspec[])
    {
        jE = i;
        ks = aphraseaffinitycorpusspec;
    }

    public PhraseAffinitySpecification(PhraseAffinityCorpusSpec aphraseaffinitycorpusspec[])
    {
        this(1, (PhraseAffinityCorpusSpec[])aphraseaffinitycorpusspec.clone());
    }

    public static h builder()
    {
        return new h();
    }

    public int describeContents()
    {
        ai ai1 = CREATOR;
        return 0;
    }

    public PhraseAffinityCorpusSpec[] getCorpusSpecs()
    {
        return (PhraseAffinityCorpusSpec[])ks.clone();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ai ai1 = CREATOR;
        ai.a(this, parcel, i);
    }

}
