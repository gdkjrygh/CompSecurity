// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            v

public class WebSetupConfig
    implements SafeParcelable
{

    public static final v CREATOR = new v();
    public final String url;
    final int version;

    WebSetupConfig(int i, String s)
    {
        version = i;
        url = s;
    }

    public WebSetupConfig(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        v.a(this, parcel);
    }

}
