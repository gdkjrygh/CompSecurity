// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ap, l, m

public class SearchResults
    implements SafeParcelable, Iterable
{

    public static final ap CREATOR = new ap();
    final int jE;
    final int kK[];
    final byte kL[];
    final Bundle kM[];
    final Bundle kN[];
    final Bundle kO[];
    final int kP;
    final int kQ[];
    final String kR[];
    final String mErrorMessage;

    SearchResults(int i, String s, int ai[], byte abyte0[], Bundle abundle[], Bundle abundle1[], Bundle abundle2[], 
            int j, int ai1[], String as[])
    {
        jE = i;
        mErrorMessage = s;
        kK = ai;
        kL = abyte0;
        kM = abundle;
        kN = abundle1;
        kO = abundle2;
        kP = j;
        kQ = ai1;
        kR = as;
    }

    public int describeContents()
    {
        ap ap1 = CREATOR;
        return 0;
    }

    public String getErrorMessage()
    {
        return mErrorMessage;
    }

    public int getNumResults()
    {
        return kP;
    }

    public boolean hasError()
    {
        return mErrorMessage != null;
    }

    public l iterator()
    {
        return new l(this);
    }

    public l iterator(String s)
    {
        return new m(this, s, null);
    }

    public l iterator(String s, String s1)
    {
        return new m(this, s, s1);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ap ap1 = CREATOR;
        ap.a(this, parcel, i);
    }

}
