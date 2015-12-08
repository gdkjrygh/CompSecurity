// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.l;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            f, w

public abstract class x
    implements f
{

    private final l a;

    public x(l l1)
    {
        a = (l)c.a(l1);
    }

    public boolean a(w w1, Exception exception)
    {
        while (!a.b() || !(exception instanceof HttpResponseException) || ((HttpResponseException)exception).getStatusCode() != 401) 
        {
            return false;
        }
        return true;
    }

    public volatile boolean a(Object obj, Exception exception)
    {
        return a((w)obj, exception);
    }
}
