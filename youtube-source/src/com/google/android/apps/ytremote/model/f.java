// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            g, SsdpId, AppStatus, YouTubeDevice

final class f
    implements android.os.Parcelable.Creator
{

    f()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        g g1 = new g();
        g1.a(parcel.readString());
        g1.b(parcel.readString());
        g1.c(parcel.readString());
        g1.a((SsdpId)parcel.readSerializable());
        g1.a((Uri)parcel.readParcelable(android/net/Uri.getClassLoader()));
        boolean flag;
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.a(flag);
        g1.a((AppStatus)parcel.readParcelable(com/google/android/apps/ytremote/model/AppStatus.getClassLoader()));
        return g1.a();
    }

    public final volatile Object[] newArray(int i)
    {
        return new YouTubeDevice[i];
    }
}
