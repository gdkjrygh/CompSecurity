// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.f;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            PlayerConfig

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    private static PlayerConfig a(Parcel parcel)
    {
        try
        {
            parcel = new PlayerConfig((f)j.b(parcel, new f()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return new PlayerConfig();
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlayerConfig[i];
    }
}
