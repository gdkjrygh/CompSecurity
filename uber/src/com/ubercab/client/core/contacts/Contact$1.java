// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.contacts;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.contacts:
//            Contact

final class 
    implements android.os..Creator
{

    private static Contact a(Parcel parcel)
    {
        return new Contact(parcel, (byte)0);
    }

    private static Contact[] a(int i)
    {
        return new Contact[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
