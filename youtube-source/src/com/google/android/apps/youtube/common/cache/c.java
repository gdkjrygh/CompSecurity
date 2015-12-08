// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import android.os.ConditionVariable;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.d;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.common.cache:
//            a, g, f, h

public abstract class c
    implements a
{

    private final String a;
    private final String b;
    private final ConcurrentHashMap c;
    private final FilenameFilter d;
    private final ConditionVariable e;
    private volatile boolean f;

    public c(String s)
    {
        this(s, "");
    }

    private c(String s, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        com.google.android.apps.youtube.common.fromguava.c.a((new File(s)).isDirectory());
        a = s;
        e = new ConditionVariable(false);
        c = new ConcurrentHashMap();
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        d = new g(this, s1);
    }

    static void a(c c1)
    {
        File afile[] = (new File(c1.a)).listFiles(c1.d);
        if (afile != null)
        {
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                File file = afile[i];
                c1.c.put(file.getName(), "");
            }

        }
    }

    protected static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return;
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    protected static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            return;
        }
        try
        {
            outputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            return;
        }
    }

    public static void a(Executor executor, String s, long l)
    {
        executor.execute(new f(s, 0x1400000L));
    }

    static ConditionVariable b(c c1)
    {
        return c1.e;
    }

    private void b()
    {
        com.google.android.apps.youtube.common.fromguava.c.b(f, "init() must be called before calling to this method");
        e.block();
    }

    private String c(Object obj)
    {
        return (new StringBuilder()).append(String.valueOf(obj.hashCode())).append(b).append(".cache").toString();
    }

    public final c a(Executor executor)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(executor);
        f = true;
        executor.execute(new h(this));
        return this;
    }

    protected abstract Object a(BufferedInputStream bufferedinputstream);

    public final Object a(Object obj)
    {
        Object obj1;
        Object obj3;
        String s;
        File file;
        obj1 = null;
        obj3 = null;
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        b();
        s = c(obj);
        if (!c.containsKey(s))
        {
            return null;
        }
        file = new File(a, s);
        Object obj2 = new BufferedInputStream(new FileInputStream(file), 8192);
        obj = obj2;
        obj3 = a(((BufferedInputStream) (obj2)));
        obj = obj2;
        obj1 = obj3;
        file.setLastModified(System.currentTimeMillis());
        a(((InputStream) (obj2)));
        return obj3;
        obj;
        obj1 = null;
_L4:
        obj = obj1;
        c.remove(s);
        obj = obj1;
        L.c((new StringBuilder("Error opening cache file (maybe removed). [filename=")).append(s).append("]").toString());
        a(((InputStream) (obj1)));
        return obj3;
        obj;
        obj2 = null;
        obj1 = obj;
_L2:
        a(((InputStream) (obj2)));
        throw obj1;
        obj1;
        obj2 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        obj3 = obj1;
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        b();
        c.clear();
        File afile[] = (new File(a)).listFiles(d);
        if (afile != null)
        {
            int j = afile.length;
            int i = 0;
            while (i < j) 
            {
                afile[i].delete();
                i++;
            }
        }
    }

    public final void a(d d1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        L.e("Clearing persistent cache as a result of a filtered remove");
        a();
    }

    protected abstract void a(Object obj, BufferedOutputStream bufferedoutputstream);

    public final void a(Object obj, Object obj1)
    {
        String s;
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        b();
        s = c(obj);
        obj = new File(a, s);
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(((File) (obj))), 8192);
        obj = bufferedoutputstream;
        a(obj1, bufferedoutputstream);
        obj = bufferedoutputstream;
        c.put(s, "");
        a(((OutputStream) (bufferedoutputstream)));
        return;
        obj1;
        bufferedoutputstream = null;
_L6:
        obj = bufferedoutputstream;
        L.b("Error creating cache file.", ((Throwable) (obj1)));
        a(((OutputStream) (bufferedoutputstream)));
        return;
        obj1;
        bufferedoutputstream = null;
_L4:
        obj = bufferedoutputstream;
        L.b("Error creating cache file.", ((Throwable) (obj1)));
        a(((OutputStream) (bufferedoutputstream)));
        return;
        obj1;
        obj = null;
_L2:
        a(((OutputStream) (obj)));
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final Object b(Object obj)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        b();
        Object obj1 = a(obj);
        if (obj1 != null)
        {
            obj = c(obj);
            c.remove(obj);
            (new File(a, ((String) (obj)))).delete();
        }
        return obj1;
    }
}
