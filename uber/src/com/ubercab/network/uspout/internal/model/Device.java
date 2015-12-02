// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout.internal.model;

import android.content.Context;
import android.os.Build;

// Referenced classes of package com.ubercab.network.uspout.internal.model:
//            Shape_Device, Carrier

public abstract class Device
{

    private static final String TYPE_ANDROID = "android";

    public Device()
    {
    }

    public static Device create(Context context)
    {
        return (new Shape_Device()).setType("android").setName(Build.MODEL).setOs(android.os.Build.VERSION.RELEASE).setCarrier(Carrier.create(context));
    }

    public abstract Carrier getCarrier();

    public abstract String getName();

    public abstract String getOs();

    public abstract String getType();

    public abstract Device setCarrier(Carrier carrier);

    public abstract Device setName(String s);

    public abstract Device setOs(String s);

    public abstract Device setType(String s);
}
