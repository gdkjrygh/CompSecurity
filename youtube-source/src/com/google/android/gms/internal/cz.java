// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            dq

public final class cz
    implements SafeParcelable
{

    public static final dq CREATOR = new dq();
    public String iM;
    public int iN;
    public int iO;
    public boolean iP;
    public final int versionCode;

    public cz(int i, int j, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder("afma-sdk-a-v")).append(i).append(".").append(j).append(".");
        String s;
        if (flag)
        {
            s = "0";
        } else
        {
            s = "1";
        }
        this(1, stringbuilder.append(s).toString(), i, j, flag);
    }

    cz(int i, String s, int j, int k, boolean flag)
    {
        versionCode = i;
        iM = s;
        iN = j;
        iO = k;
        iP = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        dq.a(this, parcel);
    }

}
