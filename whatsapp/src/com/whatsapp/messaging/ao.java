// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            ac

final class ao
    implements android.os.Parcelable.Creator
{

    ao()
    {
    }

    public ac a(Parcel parcel)
    {
        return new ac(parcel, null);
    }

    public ac[] a(int i)
    {
        return new ac[i];
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
