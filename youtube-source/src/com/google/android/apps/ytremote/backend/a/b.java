// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.support.v4.f.f;
import android.util.Log;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.List;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            c

public class b
{

    private static final String a = com/google/android/apps/ytremote/backend/a/b.getCanonicalName();
    private final f b = new f(16);

    public b()
    {
    }

    public final CloudScreen a(String s, ScreenId screenid)
    {
        f f1 = b;
        f1;
        JVM INSTR monitorenter ;
        s = (List)b.a(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Log.w(a, "Cache is not initialized. Remove operation has been refused.");
        f1;
        JVM INSTR monitorexit ;
        return null;
        screenid = c.a(s, screenid);
        if (screenid == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s.remove(screenid);
        f1;
        JVM INSTR monitorexit ;
        return screenid;
        s;
        throw s;
    }

    public final CloudScreen a(String s, ScreenId screenid, String s1)
    {
        f f1 = b;
        f1;
        JVM INSTR monitorenter ;
        List list = (List)b.a(s);
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        Log.w(a, "Cache is not initialized. Update operation has been refused.");
        f1;
        JVM INSTR monitorexit ;
        return null;
        int i;
        s = c.a(list, screenid);
        i = list.indexOf(s);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        list.remove(s);
        s = s.withName(s1);
        list.add(i, s);
_L1:
        f1;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
        s = null;
          goto _L1
    }

    public final List a(String s)
    {
        return (List)b.a(s);
    }

    public final void a()
    {
        b.a();
    }

    public final void a(String s, CloudScreen cloudscreen)
    {
        f f1 = b;
        f1;
        JVM INSTR monitorenter ;
        s = (List)b.a(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        Log.w(a, "Cache is not initialized. Add operation has been refused.");
        f1;
        JVM INSTR monitorexit ;
        return;
        s.add(0, cloudscreen);
        f1;
        JVM INSTR monitorexit ;
        return;
        s;
        f1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, List list)
    {
        synchronized (b)
        {
            b.a(s, list);
        }
    }

}
