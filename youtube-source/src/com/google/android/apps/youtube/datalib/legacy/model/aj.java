// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SubtitleWindowSnapshot

final class aj
    implements android.os.Parcelable.Creator
{

    private aj()
    {
    }

    aj(byte byte0)
    {
        this();
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new SubtitleWindowSnapshot(parcel, null);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SubtitleWindowSnapshot[i];
    }
}
