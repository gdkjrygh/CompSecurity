// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            b, ScreenId, AppStatus

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        b b1 = new b();
        b1.a(parcel.readInt());
        b1.a((Uri)parcel.readParcelable(android/net/Uri.getClassLoader()));
        b1.a(parcel.readString());
        b1.a((ScreenId)parcel.readSerializable());
        boolean flag;
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.a(flag);
        return b1.a();
    }

    public final volatile Object[] newArray(int i)
    {
        return new AppStatus[i];
    }
}
