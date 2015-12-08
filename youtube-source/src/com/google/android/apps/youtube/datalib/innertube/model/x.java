// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.e;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            PlaybackTracking

final class x
    implements android.os.Parcelable.Creator
{

    x()
    {
    }

    private static PlaybackTracking a(Parcel parcel)
    {
        try
        {
            parcel = new PlaybackTracking((e)j.b(parcel, new e()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return new PlaybackTracking();
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaybackTracking[i];
    }
}
