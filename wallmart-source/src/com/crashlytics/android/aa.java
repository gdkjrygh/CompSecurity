// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.r;
import com.crashlytics.android.internal.v;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.crashlytics.android:
//            ab, Z, ac, U, 
//            V

final class aa
{

    static final Map a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final FilenameFilter b = new ab();
    private static final short c[] = {
        10, 20, 30, 60, 120, 300
    };
    private final Object d = new Object();
    private final V e;
    private Thread f;

    public aa(V v1)
    {
        if (v1 == null)
        {
            throw new IllegalArgumentException("createReportCall must not be null.");
        } else
        {
            e = v1;
            return;
        }
    }

    static Thread a(aa aa1, Thread thread)
    {
        aa1.f = null;
        return null;
    }

    static short[] b()
    {
        return c;
    }

    final List a()
    {
        v.a().b().a("Crashlytics", "Checking for crash reports...");
        File afile[];
        int j;
        synchronized (d)
        {
            afile = v.a().h().listFiles(b);
        }
        obj = new LinkedList();
        j = afile.length;
        for (int i = 0; i < j; i++)
        {
            File file = afile[i];
            v.a().b().a("Crashlytics", (new StringBuilder("Found crash report ")).append(file.getPath()).toString());
            ((List) (obj)).add(new Z(file));
        }

        if (((List) (obj)).size() == 0)
        {
            v.a().b().a("Crashlytics", "No reports found.");
        }
        return ((List) (obj));
    }

    public final void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new Thread(new ac(this, f1), "Crashlytics Report Uploader");
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final boolean a(Z z)
    {
        boolean flag1 = false;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        q q1;
        StringBuilder stringbuilder;
        boolean flag2;
        U u = new U(r.a(v.a().getContext(), v.a().f()), z);
        flag2 = e.a(u);
        q1 = v.a().b();
        stringbuilder = new StringBuilder("Crashlytics report upload ");
        String s;
        boolean flag;
        if (flag2)
        {
            s = "complete: ";
        } else
        {
            s = "FAILED: ";
        }
        q1.b("Crashlytics", stringbuilder.append(s).append(z.b()).toString());
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        z.a();
        flag = true;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        v.a().b().a("Crashlytics", (new StringBuilder("Error occurred sending report ")).append(z).toString(), exception);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        z;
        throw z;
    }

}
