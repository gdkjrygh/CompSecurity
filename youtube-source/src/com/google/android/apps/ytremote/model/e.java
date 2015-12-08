// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            ScreenId

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ScreenId(parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new ScreenId[i];
    }
}
