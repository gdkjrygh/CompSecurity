// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.crash.CrashService;
import com.ubercab.crash.model.Crash;
import com.ubercab.crash.model.MetaData;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public abstract class gkx
    implements Thread.UncaughtExceptionHandler
{

    private final glq a;
    private final gmc b;
    private Collection c;
    private final Thread.UncaughtExceptionHandler d;
    private final Application e;
    private gld f;
    private hoi g;

    public gkx(hoi hoi1, gld gld1, glq glq1, gmc gmc1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Collection collection, Application application)
    {
        c = Collections.emptyList();
        a = glq1;
        f = gld1;
        b = gmc1;
        d = uncaughtexceptionhandler;
        e = application;
        g = hoi1;
        c = collection;
    }

    private String a(Collection collection)
    {
        String s;
        hoi hoi1;
        s = e("crash.");
        hoi1 = f.a(e, s);
        d(s);
        hoi1.b("com.ubercab.crash:killed_early");
        Object obj = a.c();
        if (obj != null)
        {
            hoi1.a((new StringBuilder("com.ubercab.crashmetadata:")).append(a.a()).toString(), obj);
        }
        collection = collection.iterator();
_L2:
        glq glq1;
        if (!collection.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        glq1 = (glq)collection.next();
        Object obj1 = glq1.c();
        if (obj1 != null)
        {
            try
            {
                hoi1.a((new StringBuilder("com.ubercab.crash:")).append(glq1.a()).toString(), obj1);
            }
            catch (Throwable throwable)
            {
                b.a(throwable);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        hoi1.a("com.ubercab.crash:killed_early");
        hoi1.a();
        return s;
    }

    private static void a(Crash crash, Application application)
    {
        application.startService(CrashService.a(crash, application));
    }

    private void d(String s)
    {
        g.a(s, "1");
    }

    private static String e(String s)
    {
        return (new StringBuilder()).append(s).append(Calendar.getInstance().getTimeInMillis()).append(UUID.randomUUID().toString()).toString();
    }

    protected abstract Crash a();

    public final MetaData a(String s)
    {
        return (MetaData)f.a(e, s).a((new StringBuilder("com.ubercab.crashmetadata:")).append(a.a()).toString(), a.b());
    }

    public final String b()
    {
        String as[] = g.e("crash.");
        if (as == null || as.length <= 0)
        {
            throw new Exception("No crashes found in index");
        } else
        {
            Arrays.sort(as, new _cls1());
            return as[0];
        }
    }

    public final Map b(String s)
    {
        s = f.a(e, s);
        HashMap hashmap = new HashMap();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            glq glq1 = (glq)iterator.next();
            if (s.a((new StringBuilder("com.ubercab.crash:")).append(glq1.a()).toString(), glq1.b()) != null)
            {
                hashmap.put(glq1.a(), s.a((new StringBuilder("com.ubercab.crash:")).append(glq1.a()).toString(), glq1.b()));
            }
        } while (true);
        boolean flag = s.c("com.ubercab.crash:killed_early");
        if (flag)
        {
            hashmap.put("killed_early", Boolean.valueOf(flag));
        }
        return Collections.unmodifiableMap(hashmap);
    }

    public final void c(String s)
    {
        g.a(s);
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Crash crash = a();
        crash.setCrashId(a(c));
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        crash.setStackTrace(stringwriter.toString());
        a(crash, e);
_L2:
        d.uncaughtException(thread, throwable);
        return;
        Throwable throwable1;
        throwable1;
        b.a(throwable1);
        a(crash, e);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        a(crash, e);
        throw thread;
    }

    /* member class not found */
    class _cls1 {}

}
