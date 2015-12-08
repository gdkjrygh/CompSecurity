// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.security.PrivilegedAction;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

static final class val.value
    implements PrivilegedAction
{

    final String val$name;
    final String val$value;

    public volatile Object run()
    {
        return run();
    }

    public String run()
    {
        return System.setProperty(val$name, val$value);
    }

    (String s, String s1)
    {
        val$name = s;
        val$value = s1;
        super();
    }
}
