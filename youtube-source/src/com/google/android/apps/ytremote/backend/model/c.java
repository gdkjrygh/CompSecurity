// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.model.ClientName;

// Referenced classes of package com.google.android.apps.ytremote.backend.model:
//            DeviceType

public final class c
{

    public final DeviceType a;
    public final String b;
    public final String c;
    public final String d;
    public final ClientName e;
    public final String f;
    public final boolean g;

    private c(DeviceType devicetype, String s, String s1, String s2, ClientName clientname, String s3, boolean flag)
    {
        a = (DeviceType)com.google.android.apps.ytremote.util.c.a(devicetype);
        b = (String)com.google.android.apps.ytremote.util.c.a(s);
        c = s1;
        d = (String)com.google.android.apps.ytremote.util.c.a(s2);
        e = (ClientName)com.google.android.apps.ytremote.util.c.a(clientname);
        f = (String)com.google.android.apps.ytremote.util.c.a(s3);
        g = flag;
    }

    c(DeviceType devicetype, String s, String s1, String s2, ClientName clientname, String s3, boolean flag, 
            byte byte0)
    {
        this(devicetype, s, s1, s2, clientname, s3, flag);
    }

    public final boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof c))
        {
            return false;
        } else
        {
            obj = (c)obj;
            return b.equals(((c) (obj)).b);
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Device [type=")).append(a).append(", id=").append(b).append(", application=").append(c).append(", name=").append(d).append(", clientName=").append(e).append(", user=").append(f).append(", hasCC=").append(g).append("]").toString();
    }
}
