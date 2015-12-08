// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.os.Parcel;

// Referenced classes of package com.google.android.gsf:
//            LoginData

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new LoginData(parcel, null);
    }

    public final volatile Object[] newArray(int j)
    {
        return new LoginData[j];
    }
}
