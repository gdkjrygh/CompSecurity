// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            s, o

public class SuggestionResults
    implements SafeParcelable, Iterable
{

    public static final s CREATOR = new s();
    final int jE;
    final String la[];
    final String lb[];
    final String mErrorMessage;

    SuggestionResults(int i, String s1, String as[], String as1[])
    {
        jE = i;
        mErrorMessage = s1;
        la = as;
        lb = as1;
    }

    public int describeContents()
    {
        s s1 = CREATOR;
        return 0;
    }

    public String getDisplayText(int i)
    {
        if (lb[i] == null)
        {
            return la[i];
        } else
        {
            return lb[i];
        }
    }

    public String getErrorMessage()
    {
        return mErrorMessage;
    }

    public int getNumResults()
    {
        return la.length;
    }

    public String getQuery(int i)
    {
        return la[i];
    }

    public boolean hasError()
    {
        return mErrorMessage != null;
    }

    public Iterator iterator()
    {
        if (hasError())
        {
            return null;
        } else
        {
            return new o(this);
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s s1 = CREATOR;
        s.a(this, parcel);
    }

}
