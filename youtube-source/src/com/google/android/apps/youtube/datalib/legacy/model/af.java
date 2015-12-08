// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SubtitleWindowSettings

final class af
    implements android.os.Parcelable.Creator
{

    private af()
    {
    }

    af(byte byte0)
    {
        this();
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new SubtitleWindowSettings(parcel, null);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SubtitleWindowSettings[i];
    }
}
