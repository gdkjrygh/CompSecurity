// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments.navigation;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.app.fragments.navigation:
//            WatchBackStack

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new WatchBackStack(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new WatchBackStack[i];
    }
}
