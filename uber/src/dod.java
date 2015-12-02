// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class dod
{

    public static final File a;
    public static final List b;
    private final Application c;
    private final doe d;
    private final cyy e;

    public dod(Application application, cyy cyy1)
    {
        c = application;
        d = new doe(application);
        e = cyy1;
    }

    private static ClassLoader a(File file, File file1, ClassLoader classloader)
    {
        return new DexClassLoader(file.getAbsolutePath(), file1.getAbsolutePath(), null, classloader);
    }

    private String h()
    {
        Iterator iterator = b.iterator();
_L2:
        Object obj;
        StringWriter stringwriter;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (File)iterator.next();
        if (!((File) (obj)).exists())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a(((File) (obj)), c.getDir("dex", 0), getClass().getClassLoader()).getResourceAsStream("promo.txt");
        stringwriter = new StringWriter();
        String s;
        gkq.a(((java.io.InputStream) (obj)), stringwriter);
        s = stringwriter.toString();
        gkq.a(((java.io.InputStream) (obj)));
        gkq.a(stringwriter);
        return s;
        IOException ioexception;
        ioexception;
        gkq.a(((java.io.InputStream) (obj)));
        gkq.a(stringwriter);
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        gkq.a(((java.io.InputStream) (obj)));
        gkq.a(stringwriter);
        throw exception;
_L1:
        return null;
    }

    private static File i()
    {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public final boolean a()
    {
        return !d.b();
    }

    public final void b()
    {
        d.c();
    }

    public final boolean c()
    {
        return d.d();
    }

    public final boolean d()
    {
        return d.e();
    }

    public final void e()
    {
        d.f();
    }

    public final void f()
    {
        d.a(UUID.randomUUID().toString());
    }

    public final String g()
    {
        String s = cyy.d();
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return h();
        }
    }

    static 
    {
        a = i();
        b = gke.a(new File("/vendor/lib", "ub__preload.jar"), new File("/system/framework", "ub__preload.jar"), new File(a, "ub__preload.jar"));
    }
}
