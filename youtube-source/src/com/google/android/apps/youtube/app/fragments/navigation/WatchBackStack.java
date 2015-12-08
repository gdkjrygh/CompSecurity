// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.os.Parcel;
import com.google.android.apps.youtube.core.player.PlaybackServiceState;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            BackStack, e, f, WatchDescriptor, 
//            a

public class WatchBackStack extends BackStack
{

    public static final android.os.Parcelable.Creator CREATOR = new e();

    public WatchBackStack()
    {
    }

    public WatchBackStack(Parcel parcel)
    {
        super(parcel);
    }

    protected a readEntryFromParcel(Parcel parcel)
    {
        return new f((WatchDescriptor)parcel.readParcelable(com/google/android/apps/youtube/app/fragments/navigation/WatchDescriptor.getClassLoader()), (PlaybackServiceState)parcel.readParcelable(com/google/android/apps/youtube/core/player/PlaybackServiceState.getClassLoader()));
    }

    protected void writeEntryToParcel(a a1, Parcel parcel, int i)
    {
        parcel.writeParcelable(a1.a, 0);
        parcel.writeParcelable(a1.b, 0);
    }

}
