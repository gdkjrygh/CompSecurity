// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RiderAccountPicture

public abstract class RiderAccountPicture
    implements Parcelable
{

    public RiderAccountPicture()
    {
    }

    public static RiderAccountPicture create()
    {
        return new Shape_RiderAccountPicture();
    }

    public static RiderAccountPicture create(String s)
    {
        return (new Shape_RiderAccountPicture()).setPicture(s);
    }

    public abstract String getPicture();

    abstract RiderAccountPicture setPicture(String s);
}
