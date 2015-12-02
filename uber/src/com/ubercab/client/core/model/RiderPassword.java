// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_RiderPassword

public abstract class RiderPassword
    implements Parcelable
{

    public RiderPassword()
    {
    }

    public static RiderPassword create()
    {
        return new Shape_RiderPassword();
    }

    public static RiderPassword create(String s, String s1, String s2)
    {
        return (new Shape_RiderPassword()).setApp(s).setDevice(s1).setPassword(s2);
    }

    public abstract String getApp();

    public abstract String getDevice();

    public abstract String getPassword();

    abstract RiderPassword setApp(String s);

    abstract RiderPassword setDevice(String s);

    abstract RiderPassword setPassword(String s);
}
