// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.google.android.apps.analytics.j;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            l, t

public final class s
    implements l
{

    private final Executor a;
    private final j b;
    private String c;
    private final Thread d;
    private final boolean e;

    public s(Context context, Executor executor, String s1, String s2, String s3, int i, int k, 
            String s4)
    {
        this(context, executor, s1, s2, s3, i, k, s4, Collections.emptyMap());
    }

    private s(Context context, Executor executor, String s1, String s2, String s3, int i, int k, 
            String s4, Map map)
    {
        boolean flag1 = false;
        super();
        a = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        com.google.android.apps.youtube.common.fromguava.c.a(s2, "appVersion can't be null");
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "deviceType can't be null");
        com.google.android.apps.youtube.common.fromguava.c.a(s3, "propertyId can't be null");
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "updateSeconds must be > 0");
        if (map.size() <= 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "up to 4 custom vars are allowed");
        flag = flag1;
        if (k > 0)
        {
            flag = true;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "sampleRatio must be >= 1");
        e = com.google.android.apps.youtube.core.utils.d.a(context, k);
        c = s2;
        if (s4 != null)
        {
            c = (new StringBuilder()).append(c).append("-").append(s4).toString();
        }
        if (k > 1)
        {
            c = (new StringBuilder()).append(c).append("-s").append(k).toString();
        }
        b = j.a();
        b.a(s1, c);
        b.a(s3, i, context);
        b.a(1, "Device", s1, 2);
        for (executor = map.entrySet().iterator(); executor.hasNext(); b.a(((Integer)s1.getKey()).intValue(), (String)((Pair)s1.getValue()).first, (String)((Pair)s1.getValue()).second, 2))
        {
            s1 = (java.util.Map.Entry)executor.next();
        }

        d = context.getMainLooper().getThread();
    }

    static String a(s s1)
    {
        return s1.c;
    }

    static j b(s s1)
    {
        return s1.b;
    }

    public final void a(int i, String s1, String s2, int k)
    {
        b.a(i, s1, s2, k);
    }

    public final void a(String s1, String s2, int i)
    {
        L.e(String.format("event [version=%s, action=%s, label=%s, value=%d]", new Object[] {
            c, s1, s2, Integer.valueOf(i)
        }));
        if (!e || ActivityManager.isUserAMonkey())
        {
            return;
        }
        if (Thread.currentThread() == d)
        {
            a.execute(new t(this, s1, s2, i));
            return;
        } else
        {
            b.a(c, s1, s2, i);
            return;
        }
    }
}
