// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.model.ClientName;

// Referenced classes of package com.google.android.apps.ytremote.backend.model:
//            c, DeviceType

public final class d
{

    DeviceType a;
    String b;
    String c;
    String d;
    ClientName e;
    String f;
    boolean g;

    public d()
    {
    }

    public final c a()
    {
        return new c(a, b, c, d, e, f, g, (byte)0);
    }

    public final d a(DeviceType devicetype)
    {
        a = devicetype;
        return this;
    }

    public final d a(ClientName clientname)
    {
        e = clientname;
        return this;
    }

    public final d a(String s)
    {
        b = s;
        return this;
    }

    public final d a(boolean flag)
    {
        g = flag;
        return this;
    }

    public final d b(String s)
    {
        d = s;
        return this;
    }

    public final d c(String s)
    {
        f = s;
        return this;
    }
}
