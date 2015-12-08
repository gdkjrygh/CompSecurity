// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.bean;

import android.os.Parcel;

// Referenced classes of package io.wecloud.message.bean:
//            EventInfo

class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public EventInfo a(Parcel parcel)
    {
        return new EventInfo(parcel);
    }

    public EventInfo[] a(int i)
    {
        return new EventInfo[i];
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
