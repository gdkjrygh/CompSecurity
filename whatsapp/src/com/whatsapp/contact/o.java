// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.os.Parcel;
import com.whatsapp.protocol.cb;

// Referenced classes of package com.whatsapp.contact:
//            f

final class o
    implements android.os.Parcelable.Creator
{

    o()
    {
    }

    public f a(Parcel parcel)
    {
        cb cb1 = new cb();
        cb1.c = parcel.readString();
        cb1.a = parcel.readString();
        cb1.b = parcel.readInt();
        return new f(cb1);
    }

    public f[] a(int i)
    {
        return new f[i];
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
