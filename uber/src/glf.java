// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.crash.model.MetaData;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class glf
    implements Thread.UncaughtExceptionHandler
{

    private final Thread.UncaughtExceptionHandler a;
    private final hoi b;
    private final gmc c;
    private final glq d;
    private Collection e;

    public glf(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, hoi hoi1, gmc gmc1, glq glq1)
    {
        e = Collections.emptyList();
        a = uncaughtexceptionhandler;
        b = hoi1;
        c = gmc1;
        d = glq1;
    }

    public final MetaData a()
    {
        return (MetaData)b.a((new StringBuilder("com.ubercab.crashmetadata:")).append(d.a()).toString(), d.b());
    }

    public final void a(Collection collection)
    {
        e = collection;
    }

    public final Map b()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            glq glq1 = (glq)iterator.next();
            if (b.a((new StringBuilder("com.ubercab.crash:")).append(glq1.a()).toString(), glq1.b()) != null)
            {
                hashmap.put(glq1.a(), b.a((new StringBuilder("com.ubercab.crash:")).append(glq1.a()).toString(), glq1.b()));
            }
        } while (true);
        boolean flag = b.c("com.ubercab.crash:killed_early");
        if (flag)
        {
            hashmap.put("killed_early", Boolean.valueOf(flag));
        }
        return Collections.unmodifiableMap(hashmap);
    }

    public final void c()
    {
        b.a((new StringBuilder("com.ubercab.crashmetadata:")).append(d.a()).toString());
        String as[] = b.e("com.ubercab.crash:");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            b.a(s);
        }

    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Object obj;
        b.b("com.ubercab.crash:killed_early");
        obj = d.c();
        glq glq1;
        Throwable throwable3;
        Object obj1;
        if (obj != null)
        {
            try
            {
                b.a((new StringBuilder("com.ubercab.crashmetadata:")).append(d.a()).toString(), obj);
            }
            catch (Throwable throwable1)
            {
                c.a(throwable1);
            }
        }
        obj = e.iterator();
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        glq1 = (glq)((Iterator) (obj)).next();
        obj1 = glq1.c();
        if (obj1 != null)
        {
            try
            {
                b.a((new StringBuilder("com.ubercab.crash:")).append(glq1.a()).toString(), obj1);
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable3)
            {
                c.a(throwable3);
            }
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_69;
_L1:
        try
        {
            b.a("com.ubercab.crash:killed_early");
        }
        catch (Throwable throwable2)
        {
            c.a(throwable2);
        }
        a.uncaughtException(thread, throwable);
        return;
    }
}
