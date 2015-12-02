// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            au

final class a8
    implements android.os.Parcelable.Creator
{

    a8()
    {
    }

    public au a(Parcel parcel)
    {
        return new au(parcel, null);
    }

    public au[] a(int i)
    {
        return new au[i];
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
