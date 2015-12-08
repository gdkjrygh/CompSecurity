// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            x

public class DocumentResults
    implements SafeParcelable
{

    public static final x CREATOR = new x();
    final int jE;
    final Bundle jO;
    final Bundle jP;
    final Bundle jQ;
    final String mErrorMessage;

    DocumentResults(int i, String s, Bundle bundle, Bundle bundle1, Bundle bundle2)
    {
        jE = i;
        mErrorMessage = s;
        jO = bundle;
        jP = bundle1;
        jQ = bundle2;
    }

    public int describeContents()
    {
        x x1 = CREATOR;
        return 0;
    }

    public String getErrorMessage()
    {
        return mErrorMessage;
    }

    public int getNumResults()
    {
        return jO.size();
    }

    public String getSectionContent(String s, String s1)
    {
        if (jQ != null)
        {
            if ((s1 = jQ.getBundle(s1)) != null)
            {
                return s1.getString(s);
            }
        }
        return null;
    }

    public boolean hasError()
    {
        return mErrorMessage != null;
    }

    public boolean hasTag(String s, String s1)
    {
        if (jP != null)
        {
            if ((s1 = jP.getBundle(s1)) != null && s1.containsKey(s))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isUriFound(String s)
    {
        return jO.containsKey(s);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        x x1 = CREATOR;
        x.a(this, parcel);
    }

}
