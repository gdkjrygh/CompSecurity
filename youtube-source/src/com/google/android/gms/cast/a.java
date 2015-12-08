// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import java.net.Inet4Address;

// Referenced classes of package com.google.android.gms.cast:
//            CastDevice

public final class a
{

    final CastDevice a;

    public a(CastDevice castdevice, String s, Inet4Address inet4address)
    {
        a = castdevice;
        super();
        CastDevice.a(castdevice, inet4address);
        if (CastDevice.a(castdevice) != null)
        {
            inet4address = CastDevice.a(castdevice).getHostAddress();
        } else
        {
            inet4address = null;
        }
        castdevice.ol = inet4address;
        CastDevice.a(castdevice, s);
    }
}
