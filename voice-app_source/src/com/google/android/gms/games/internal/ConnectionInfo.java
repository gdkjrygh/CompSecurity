// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            ConnectionInfoCreator

public class ConnectionInfo
    implements SafeParcelable
{

    public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();
    private final int zzCY;
    private final String zzaoO;
    private final int zzaoP;

    public ConnectionInfo(int i, String s, int j)
    {
        zzCY = i;
        zzaoO = s;
        zzaoP = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConnectionInfoCreator.zza(this, parcel, i);
    }

    public String zzsr()
    {
        return zzaoO;
    }

    public int zzss()
    {
        return zzaoP;
    }

}
