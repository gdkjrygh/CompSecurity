// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ah, CorpusId

public class PhraseAffinityResponse
    implements SafeParcelable
{

    public static final ah CREATOR = new ah();
    final int jE;
    final CorpusId kq[];
    final int kr[];
    final String mErrorMessage;

    PhraseAffinityResponse(int i, String s, CorpusId acorpusid[], int ai[])
    {
        jE = i;
        mErrorMessage = s;
        kq = acorpusid;
        kr = ai;
    }

    public int describeContents()
    {
        ah ah1 = CREATOR;
        return 0;
    }

    public int getAffinityScore(int i, int j)
    {
        return kr[kq.length * j + i];
    }

    public String getErrorMessage()
    {
        return mErrorMessage;
    }

    public boolean hasError()
    {
        return mErrorMessage != null;
    }

    public boolean isPhraseFound(int i)
    {
        int j = kq.length * i;
        int k = kq.length;
        for (i = j; i < k + j; i++)
        {
            if (kr[i] != 0)
            {
                return true;
            }
        }

        return false;
    }

    public int size()
    {
        if (kq == null || kq.length == 0)
        {
            return 0;
        } else
        {
            return kr.length / kq.length;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ah ah1 = CREATOR;
        ah.a(this, parcel, i);
    }

}
