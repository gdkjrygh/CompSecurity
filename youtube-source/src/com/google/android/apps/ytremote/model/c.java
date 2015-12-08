// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            CloudScreen, ScreenId, ClientName, LoungeToken, 
//            TemporaryAccessToken

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        CloudScreen.AccessType accesstype = CloudScreen.AccessType.values()[parcel.readInt()];
        String s = parcel.readString();
        if (accesstype == CloudScreen.AccessType.PERMANENT)
        {
            return new CloudScreen((ScreenId)parcel.readParcelable(com/google/android/apps/ytremote/model/ScreenId.getClassLoader()), s, (ClientName)parcel.readParcelable(com/google/android/apps/ytremote/model/ClientName.getClassLoader()), (LoungeToken)parcel.readSerializable());
        } else
        {
            return new CloudScreen((TemporaryAccessToken)parcel.readSerializable(), s);
        }
    }

    public final volatile Object[] newArray(int i)
    {
        return new CloudScreen[i];
    }
}
