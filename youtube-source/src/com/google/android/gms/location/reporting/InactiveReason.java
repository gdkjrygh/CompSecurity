// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.location.reporting:
//            e

public class InactiveReason
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    public static final int VERSION_CODE = 0;
    private final int Ga;
    private final int jE;
    private final String mName;

    public InactiveReason(int i, int j, String s)
    {
        jE = i;
        Ga = j;
        mName = s;
    }

    public InactiveReason(int i, String s)
    {
        this(0, i, s);
    }

    public static boolean reasonsContain(Iterable iterable, int i)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (((InactiveReason)iterable.next()).getIdentifier() == i)
            {
                return true;
            }
        }

        return false;
    }

    public int describeContents()
    {
        e e1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof InactiveReason) && Ga == ((InactiveReason)obj).Ga;
    }

    public int getIdentifier()
    {
        return Ga;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return jE;
    }

    public int hashCode()
    {
        return Ga;
    }

    public String toString()
    {
        return (new StringBuilder("InactiveReason{mVersionCode=")).append(jE).append(", mIdentifier=").append(Ga).append(", mName='").append(mName).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e e1 = CREATOR;
        e.a(this, parcel);
    }

}
