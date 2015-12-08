// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import android.os.Parcel;
import com.google.protobuf.micro.c;

public final class j
{

    public static void a(Parcel parcel, c c1)
    {
        if (c1 == null)
        {
            c1 = null;
        } else
        {
            c1 = c1.s();
        }
        parcel.writeByteArray(c1);
    }

    public static void a(Parcel parcel, com.google.protobuf.nano.c c1)
    {
        if (c1 == null)
        {
            c1 = null;
        } else
        {
            c1 = com.google.protobuf.nano.c.a(c1);
        }
        parcel.writeByteArray(c1);
    }

    public static c b(Parcel parcel, c c1)
    {
        parcel = parcel.createByteArray();
        if (parcel == null)
        {
            return null;
        } else
        {
            c1.b(parcel);
            return c1;
        }
    }

    public static com.google.protobuf.nano.c b(Parcel parcel, com.google.protobuf.nano.c c1)
    {
        parcel = parcel.createByteArray();
        if (parcel == null)
        {
            return null;
        } else
        {
            return com.google.protobuf.nano.c.a(c1, parcel);
        }
    }
}
