// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            ag

final class bd
    implements android.os.Parcelable.Creator
{

    bd()
    {
    }

    public ag a(Parcel parcel)
    {
        return new ag(parcel);
    }

    public ag[] a(int i)
    {
        return new ag[i];
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
