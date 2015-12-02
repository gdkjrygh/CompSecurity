// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.os.Parcel;

final class 
    implements android.os.EditText.Chip._cls1
{

    private static  a(Parcel parcel)
    {
        return new nit>(parcel.readString(), parcel.readBundle(), parcel.readString());
    }

    private static nit>[] a(int i)
    {
        return new nit>[i];
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
