// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.model;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.d;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;

// Referenced classes of package com.google.android.apps.youtube.core.player.model:
//            PlaybackStartDescriptor

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    private static PlaybackStartDescriptor a(Parcel parcel)
    {
        try
        {
            parcel = (d)j.b(parcel, new d());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return null;
        }
        if (parcel == null)
        {
            return null;
        }
        parcel = new PlaybackStartDescriptor(parcel);
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaybackStartDescriptor[i];
    }
}
