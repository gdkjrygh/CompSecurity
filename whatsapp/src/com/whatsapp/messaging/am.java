// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            p

final class am
    implements android.os.Parcelable.Creator
{

    am()
    {
    }

    public p a(Parcel parcel)
    {
        return new p(parcel, null);
    }

    public p[] a(int i)
    {
        return new p[i];
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
