// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.i;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            WatchDescriptor

final class g
    implements android.os.Parcelable.Creator
{

    g()
    {
    }

    private static WatchDescriptor a(Parcel parcel)
    {
        try
        {
            parcel = (i)j.b(parcel, new i());
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
        parcel = new WatchDescriptor(parcel, null);
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int k)
    {
        return new WatchDescriptor[k];
    }
}
