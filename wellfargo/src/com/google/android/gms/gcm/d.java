// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            OneoffTask

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public OneoffTask a(Parcel parcel)
    {
        return new OneoffTask(parcel, null);
    }

    public OneoffTask[] a(int i)
    {
        return new OneoffTask[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
