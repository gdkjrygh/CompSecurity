// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            PendingCallback

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public PendingCallback a(Parcel parcel)
    {
        return new PendingCallback(parcel);
    }

    public PendingCallback[] a(int i)
    {
        return new PendingCallback[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
