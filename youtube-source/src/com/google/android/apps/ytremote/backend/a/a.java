// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.List;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            b

public final class a
    implements com.google.android.apps.ytremote.backend.logic.a
{

    private final com.google.android.apps.ytremote.backend.logic.a a;
    private volatile b b;

    public a(com.google.android.apps.ytremote.backend.logic.a a1)
    {
        a = a1;
        b = new b();
    }

    private void b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b.a(s) == null)
        {
            b.a(s, a.a(s, s1));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid)
    {
        b(s, s1);
        a.a(s, s1, screenid);
        return b.a(s, screenid);
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid, String s2)
    {
        b(s, s1);
        a.a(s, s1, screenid, s2);
        return b.a(s, screenid, s2);
    }

    public final List a(String s, String s1)
    {
        b(s, s1);
        return b.a(s);
    }

    public final void a()
    {
        b.a();
    }

    public final void a(String s, String s1, CloudScreen cloudscreen)
    {
        b(s, s1);
        a.a(s, s1, cloudscreen);
        b.a(s, cloudscreen);
    }
}
