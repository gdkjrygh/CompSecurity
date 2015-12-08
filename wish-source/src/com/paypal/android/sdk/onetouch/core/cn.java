// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Parcel;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            AuthorizationRequest

final class cn
    implements android.os.Parcelable.Creator
{

    cn()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new AuthorizationRequest(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AuthorizationRequest[i];
    }
}
