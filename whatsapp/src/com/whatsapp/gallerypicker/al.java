// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.gallerypicker:
//            aq

final class al
    implements android.os.Parcelable.Creator
{

    al()
    {
    }

    public aq a(Parcel parcel)
    {
        return new aq(parcel, null);
    }

    public aq[] a(int i)
    {
        return new aq[i];
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
