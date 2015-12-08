// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            e

public class FACLConfig
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    private static final String mi = (new StringBuilder("[")).append(com/google/android/gms/auth/firstparty/shared/FACLConfig.getSimpleName()).append("]").toString();
    boolean nE;
    String nF;
    final int version;

    FACLConfig(int i, boolean flag, String s)
    {
        version = i;
        nE = flag;
        nF = s;
    }

    public FACLConfig(boolean flag, String s)
    {
        version = 1;
        nE = flag;
        if (flag)
        {
            nF = "";
            return;
        } else
        {
            nF = s;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getVisibleSocialGraph()
    {
        return nF;
    }

    public boolean isAllSocialGraphVisible()
    {
        return nE;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel);
    }

}
