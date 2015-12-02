// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import op;

public final class InterstitialAdParameterParcel
    implements SafeParcelable
{

    public static final op CREATOR = new op();
    public final int a;
    public final boolean b;
    public final boolean c;

    public InterstitialAdParameterParcel(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    public InterstitialAdParameterParcel(boolean flag, boolean flag1)
    {
        a = 1;
        b = flag;
        c = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        op.a(this, parcel);
    }

}
