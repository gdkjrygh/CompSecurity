// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Parcel;

// Referenced classes of package com.whatsapp:
//            a88

final class gt
    implements android.os.Parcelable.Creator
{

    gt()
    {
    }

    public a88 a(Parcel parcel)
    {
        return new a88(parcel);
    }

    public a88[] a(int i)
    {
        return new a88[i];
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
