// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Parcel;

// Referenced classes of package com.whatsapp:
//            abz

final class al3
    implements android.os.Parcelable.Creator
{

    al3()
    {
    }

    public abz a(Parcel parcel)
    {
        return new abz(parcel, null);
    }

    public abz[] a(int i)
    {
        return new abz[i];
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
