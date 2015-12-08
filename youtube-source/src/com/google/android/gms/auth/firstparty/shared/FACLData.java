// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            f, FACLConfig

public class FACLData
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    FACLConfig nG;
    String nH;
    boolean nI;
    String nJ;
    final int version;

    FACLData(int i, FACLConfig faclconfig, String s, boolean flag, String s1)
    {
        version = i;
        nG = faclconfig;
        nH = s;
        nI = flag;
        nJ = s1;
    }

    public FACLData(FACLConfig faclconfig, String s, String s1, boolean flag)
    {
        version = 1;
        nG = faclconfig;
        nH = s;
        nJ = s1;
        nI = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getActivityText()
    {
        return nH;
    }

    public FACLConfig getFaclConfig()
    {
        return nG;
    }

    public String getSpeedbumpText()
    {
        return nJ;
    }

    public boolean isSpeedbumpNeeded()
    {
        return nI;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
