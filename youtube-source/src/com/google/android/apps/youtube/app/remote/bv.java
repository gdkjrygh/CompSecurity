// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.os.Parcel;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.YouTubeDevice;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            YouTubeTvScreen

final class bv
    implements android.os.Parcelable.Creator
{

    bv()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = true;
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        if (flag)
        {
            return new YouTubeTvScreen((YouTubeDevice)parcel.readParcelable(com/google/android/apps/ytremote/model/YouTubeDevice.getClassLoader()));
        } else
        {
            return new YouTubeTvScreen((CloudScreen)parcel.readParcelable(com/google/android/apps/ytremote/model/CloudScreen.getClassLoader()));
        }
    }

    public final volatile Object[] newArray(int i)
    {
        return new YouTubeTvScreen[i];
    }
}
