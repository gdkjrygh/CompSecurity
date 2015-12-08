// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            PendingCallback

static final class 
    implements android.os.
{

    public Object createFromParcel(Parcel parcel)
    {
        return zzdW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgi(i);
    }

    public PendingCallback zzdW(Parcel parcel)
    {
        return new PendingCallback(parcel);
    }

    public PendingCallback[] zzgi(int i)
    {
        return new PendingCallback[i];
    }

    ()
    {
    }
}
