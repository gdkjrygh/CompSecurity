// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            b6

final class a9
    implements android.os.Parcelable.Creator
{

    a9()
    {
    }

    public b6 a(Parcel parcel)
    {
        return new b6(parcel, null);
    }

    public b6[] a(int i)
    {
        return new b6[i];
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
