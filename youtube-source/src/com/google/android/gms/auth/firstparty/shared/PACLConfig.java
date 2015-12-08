// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            g

public class PACLConfig
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    String nK;
    String nL;
    final int version;

    PACLConfig(int i, String s, String s1)
    {
        version = i;
        nK = s;
        nL = s1;
    }

    public PACLConfig(String s, String s1)
    {
        version = 1;
        nK = s;
        nL = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPacl()
    {
        return nL;
    }

    public String getVisibleActions()
    {
        return nK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel);
    }

}
