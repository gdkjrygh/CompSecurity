// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import ayi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CameraUpdateParcelable
    implements SafeParcelable
{

    public static final ayi CREATOR = new ayi();
    private final int a;
    private int b;
    private Bundle c;

    public CameraUpdateParcelable(int i, int j, Bundle bundle)
    {
        a = i;
        b = j;
        c = bundle;
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final Bundle c()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ayi.a(this, parcel);
    }

}
