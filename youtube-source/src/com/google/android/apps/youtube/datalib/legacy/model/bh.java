// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            VmapAdBreak

final class bh
    implements android.os.Parcelable.Creator
{

    bh()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new VmapAdBreak(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VmapAdBreak[i];
    }
}
