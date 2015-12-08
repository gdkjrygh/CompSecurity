// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            b

public class DetectedActivity
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public static final int EXITING_VEHICLE = 6;
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    int Cf;
    int Cg;
    private final int jE;

    public DetectedActivity(int i, int j)
    {
        jE = 1;
        Cf = i;
        Cg = j;
    }

    public DetectedActivity(int i, int j, int k)
    {
        jE = i;
        Cf = j;
        Cg = k;
    }

    private int cj(int i)
    {
        int j = i;
        if (i > 6)
        {
            j = 4;
        }
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getConfidence()
    {
        return Cg;
    }

    public int getType()
    {
        return cj(Cf);
    }

    public int getVersionCode()
    {
        return jE;
    }

    public String toString()
    {
        return (new StringBuilder("DetectedActivity [type=")).append(getType()).append(", confidence=").append(Cg).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel);
    }

}
