// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            ab

final class a2
    implements android.os.Parcelable.Creator
{

    a2()
    {
    }

    public ab a(Parcel parcel)
    {
        return new ab(parcel, null);
    }

    public ab[] a(int i)
    {
        return new ab[i];
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
