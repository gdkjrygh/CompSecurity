// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.internal.aR;
import com.crashlytics.android.internal.ab;
import com.crashlytics.android.internal.ah;
import com.crashlytics.android.internal.ai;
import com.crashlytics.android.internal.ao;
import com.crashlytics.android.internal.ap;
import com.crashlytics.android.internal.aq;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android:
//            w, H, J, K, 
//            d, Crashlytics, CrashlyticsListener, L, 
//            M, h, y, G, 
//            f, R, b, S, 
//            I, e, Q, D, 
//            x, P, F, O, 
//            z, A, B, C, 
//            E, N

final class v
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new w();
    private static Comparator b = new H();
    private static Comparator c = new J();
    private static final Pattern d = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map e = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final d f = com.crashlytics.android.d.a("0");
    private final AtomicInteger g;
    private final AtomicBoolean h;
    private final int i;
    private final Thread.UncaughtExceptionHandler j;
    private final File k;
    private final File l;
    private final AtomicBoolean m;
    private final String n;
    private final BroadcastReceiver o;
    private final BroadcastReceiver p;
    private final d q;
    private final d r;
    private final ExecutorService s;
    private android.app.ActivityManager.RunningAppProcessInfo t;
    private aq u;
    private boolean v;
    private Thread w[];
    private List x;
    private StackTraceElement y[];

    public v(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, String s1)
    {
        this(uncaughtexceptionhandler, crashlyticslistener, ah.a("Crashlytics Exception Handler"), s1);
    }

    private v(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, ExecutorService executorservice, String s1)
    {
        g = new AtomicInteger(0);
        h = new AtomicBoolean(false);
        j = uncaughtexceptionhandler;
        s = executorservice;
        m = new AtomicBoolean(false);
        k = com.crashlytics.android.internal.v.a().h();
        l = new File(k, "initialization_marker");
        n = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            Crashlytics.getInstance().getVersion()
        });
        i = 8;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Checking for previous crash marker.");
        uncaughtexceptionhandler = new File(com.crashlytics.android.internal.v.a().h(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
            if (crashlyticslistener != null)
            {
                try
                {
                    crashlyticslistener.crashlyticsDidDetectCrashDuringPreviousExecution();
                }
                // Misplaced declaration of an exception variable
                catch (Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
                {
                    com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Exception thrown by CrashlyticsListener while notifying of previous crash.", uncaughtexceptionhandler);
                }
            }
        }
        q = com.crashlytics.android.d.a(Crashlytics.d());
        if (s1 == null)
        {
            uncaughtexceptionhandler = null;
        } else
        {
            uncaughtexceptionhandler = com.crashlytics.android.d.a(s1.replace("-", ""));
        }
        r = uncaughtexceptionhandler;
        p = new L(this);
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        o = new M(this);
        crashlyticslistener = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        Crashlytics.getInstance().getContext().registerReceiver(p, uncaughtexceptionhandler);
        Crashlytics.getInstance().getContext().registerReceiver(o, crashlyticslistener);
        h.set(true);
    }

    private static int a(float f1, int i1, boolean flag, int j1, long l1, long l2)
    {
        return com.crashlytics.android.h.b(1, f1) + 0 + com.crashlytics.android.h.f(2, i1) + com.crashlytics.android.h.b(3, flag) + com.crashlytics.android.h.d(4, j1) + com.crashlytics.android.h.b(5, l1) + com.crashlytics.android.h.b(6, l2);
    }

    private int a(int i1, d d1, d d2, int j1, long l1, long l2, boolean flag, Map map, int k1, d d3, d d4)
    {
        int i2 = com.crashlytics.android.h.b(1, d1);
        int j2 = com.crashlytics.android.h.e(3, i1);
        if (d2 == null)
        {
            i1 = 0;
        } else
        {
            i1 = com.crashlytics.android.h.b(4, d2);
        }
        i1 = i1 + (j2 + (i2 + 0)) + com.crashlytics.android.h.d(5, j1) + com.crashlytics.android.h.b(6, l1) + com.crashlytics.android.h.b(7, l2) + com.crashlytics.android.h.b(10, flag);
        if (map != null)
        {
            d1 = map.entrySet().iterator();
            do
            {
                j1 = i1;
                if (!d1.hasNext())
                {
                    break;
                }
                d2 = (java.util.Map.Entry)d1.next();
                j1 = a((ap)d2.getKey(), (String)d2.getValue());
                i1 = j1 + (com.crashlytics.android.h.a(11) + com.crashlytics.android.h.c(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        i2 = com.crashlytics.android.h.d(12, k1);
        if (d3 == null)
        {
            i1 = 0;
        } else
        {
            i1 = com.crashlytics.android.h.b(13, d3);
        }
        if (d4 == null)
        {
            k1 = 0;
        } else
        {
            k1 = com.crashlytics.android.h.b(14, d4);
        }
        return k1 + (j1 + i2 + i1);
    }

    private static int a(ap ap1, String s1)
    {
        return com.crashlytics.android.h.e(1, ap1.f) + com.crashlytics.android.h.b(2, com.crashlytics.android.d.a(s1));
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int i1;
        int j1;
        if (stacktraceelement.isNativeMethod())
        {
            i1 = com.crashlytics.android.h.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            i1 = com.crashlytics.android.h.b(1, 0L) + 0;
        }
        j1 = i1 + com.crashlytics.android.h.b(2, com.crashlytics.android.d.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        i1 = j1;
        if (stacktraceelement.getFileName() != null)
        {
            i1 = j1 + com.crashlytics.android.h.b(3, com.crashlytics.android.d.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            i1 += com.crashlytics.android.h.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        return com.crashlytics.android.h.d(5, j1) + i1;
    }

    private static int a(String s1, String s2)
    {
        int i1 = com.crashlytics.android.h.b(1, com.crashlytics.android.d.a(s1));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return i1 + com.crashlytics.android.h.b(2, com.crashlytics.android.d.a(s1));
    }

    private int a(Thread thread, Throwable throwable, Map map)
    {
        int i1 = b(thread, throwable);
        i1 = i1 + (com.crashlytics.android.h.a(1) + com.crashlytics.android.h.c(i1)) + 0;
        int j1;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            do
            {
                j1 = i1;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                j1 = a((String)throwable.getKey(), (String)throwable.getValue());
                i1 = j1 + (com.crashlytics.android.h.a(2) + com.crashlytics.android.h.c(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        i1 = j1;
        if (t != null)
        {
            boolean flag;
            if (t.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1 = j1 + com.crashlytics.android.h.b(3, flag);
        }
        return com.crashlytics.android.h.d(4, Crashlytics.getInstance().getContext().getResources().getConfiguration().orientation) + i1;
    }

    private int a(Thread thread, StackTraceElement astacktraceelement[], int i1, boolean flag)
    {
        int j1 = com.crashlytics.android.h.b(1, com.crashlytics.android.d.a(thread.getName()));
        j1 = com.crashlytics.android.h.d(2, i1) + j1;
        int k1 = astacktraceelement.length;
        for (i1 = 0; i1 < k1; i1++)
        {
            int l1 = a(astacktraceelement[i1], flag);
            j1 += l1 + (com.crashlytics.android.h.a(3) + com.crashlytics.android.h.c(l1));
        }

        return j1;
    }

    private int a(Throwable throwable, int i1)
    {
        int j1;
        int k1;
label0:
        {
            boolean flag = false;
            k1 = com.crashlytics.android.h.b(1, com.crashlytics.android.d.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            j1 = k1;
            if (obj != null)
            {
                j1 = k1 + com.crashlytics.android.h.b(3, com.crashlytics.android.d.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int l1 = astacktraceelement.length;
            for (k1 = 0; k1 < l1;)
            {
                int i2 = a(astacktraceelement[k1], true);
                int j2 = com.crashlytics.android.h.a(4);
                int k2 = com.crashlytics.android.h.c(i2);
                k1++;
                j1 = i2 + (j2 + k2) + j1;
            }

            astacktraceelement = throwable.getCause();
            k1 = j1;
            if (astacktraceelement != null)
            {
                k1 = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i1 >= 8)
                {
                    break label0;
                }
                i1 = a(((Throwable) (astacktraceelement)), i1 + 1);
                k1 = j1 + (i1 + (com.crashlytics.android.h.a(6) + com.crashlytics.android.h.c(i1)));
            }
            return k1;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            k1++;
        }
        return j1 + com.crashlytics.android.h.d(7, k1);
    }

    private d a(aq aq1)
    {
        if (aq1 == null)
        {
            return null;
        }
        int ai1[] = new int[1];
        ai1[0] = 0;
        byte abyte0[] = new byte[aq1.a()];
        try
        {
            aq1.a(new y(this, abyte0, ai1));
        }
        // Misplaced declaration of an exception variable
        catch (aq aq1)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "A problem occurred while reading the Crashlytics log file.", aq1);
        }
        return com.crashlytics.android.d.a(abyte0, 0, ai1[0]);
    }

    private Object a(Callable callable)
    {
        try
        {
            callable = ((Callable) (s.submit(callable).get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    private static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    private Future a(Runnable runnable)
    {
        try
        {
            runnable = s.submit(new G(this, runnable));
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    static AtomicBoolean a(v v1)
    {
        return v1.m;
    }

    private static void a(f f1)
    {
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        f1.a();
        return;
        f1;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error closing session file stream in the presence of an exception", f1);
        return;
    }

    private void a(h h1, int i1, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        h1.g(i1, 2);
        h1.b(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            h1.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            h1.a(1, 0L);
        }
        h1.a(2, com.crashlytics.android.d.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            h1.a(3, com.crashlytics.android.d.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            h1.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        h1.a(5, i1);
    }

    private static void a(h h1, File file)
        throws IOException
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[(int)file.length()];
        file = new FileInputStream(file);
        int i1 = 0;
_L4:
        int j1;
        if (i1 >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = file.read(abyte0, i1, abyte0.length - i1);
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 += j1;
        if (true) goto _L4; else goto _L3
_L3:
        ab.a(file, "Failed to close file input stream.");
        h1.a(abyte0);
        return;
        h1;
        file = null;
_L6:
        ab.a(file, "Failed to close file input stream.");
        throw h1;
_L2:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        h1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(h h1, String s1)
        throws IOException
    {
        String as[] = new String[4];
        as[0] = "SessionUser";
        as[1] = "SessionApp";
        as[2] = "SessionOS";
        as[3] = "SessionDevice";
        int j1 = as.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            String s2 = as[i1];
            File afile[] = a(((FilenameFilter) (new R((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1).toString());
                a(h1, afile[0]);
            }
            i1++;
        }
    }

    private void a(h h1, Thread thread, Throwable throwable)
        throws Exception
    {
        h1.g(1, 2);
        h1.b(b(thread, throwable));
        a(h1, thread, y, 4, true);
        int j1 = w.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            a(h1, w[i1], (StackTraceElement[])x.get(i1), 0, false);
        }

        a(h1, throwable, 1, 2);
        h1.g(3, 2);
        h1.b(s());
        h1.a(1, f);
        h1.a(2, f);
        h1.a(3, 0L);
        h1.g(4, 2);
        h1.b(r());
        h1.a(1, 0L);
        h1.a(2, 0L);
        h1.a(3, q);
        if (r != null)
        {
            h1.a(4, r);
        }
    }

    private void a(h h1, Thread thread, StackTraceElement astacktraceelement[], int i1, boolean flag)
        throws Exception
    {
        h1.g(1, 2);
        h1.b(a(thread, astacktraceelement, i1, flag));
        h1.a(1, com.crashlytics.android.d.a(thread.getName()));
        h1.a(2, i1);
        int j1 = astacktraceelement.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            a(h1, 3, astacktraceelement[i1], flag);
        }

    }

    private void a(h h1, Throwable throwable, int i1, int j1)
        throws Exception
    {
label0:
        {
            boolean flag = false;
            h1.g(j1, 2);
            h1.b(a(throwable, 1));
            h1.a(1, com.crashlytics.android.d.a(throwable.getClass().getName()));
            Object obj = throwable.getLocalizedMessage();
            if (obj != null)
            {
                h1.a(3, com.crashlytics.android.d.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int k1 = astacktraceelement.length;
            for (j1 = 0; j1 < k1; j1++)
            {
                a(h1, 4, astacktraceelement[j1], true);
            }

            astacktraceelement = throwable.getCause();
            if (astacktraceelement != null)
            {
                j1 = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i1 >= 8)
                {
                    break label0;
                }
                a(h1, ((Throwable) (astacktraceelement)), i1 + 1, 6);
            }
            return;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            j1++;
        }
        h1.a(7, j1);
    }

    private void a(h h1, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); h1.a(2, com.crashlytics.android.d.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            h1.g(2, 2);
            h1.b(a((String)map.getKey(), (String)map.getValue()));
            h1.a(1, com.crashlytics.android.d.a((String)map.getKey()));
            String s1 = (String)map.getValue();
            map = s1;
            if (s1 == null)
            {
                map = "";
            }
        }

    }

    private void a(h h1, File afile[], String s1)
    {
        Arrays.sort(afile, ab.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                }));
                a(h1, file);
            }
            catch (Exception exception)
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    static void a(aq aq1, int i1, long l1, String s1)
    {
        if (aq1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (s1 == null)
        {
            s1 = "null";
        }
        String s2 = s1;
        try
        {
            if (s1.length() > 16384)
            {
                s2 = (new StringBuilder("...")).append(s1.substring(s1.length() - 16384)).toString();
            }
            s1 = s2.replaceAll("\r", " ").replaceAll("\n", " ");
            aq1.a(String.format(Locale.US, "%d %s%n", new Object[] {
                Long.valueOf(l1), s1
            }).getBytes("UTF-8"));
            while (!aq1.b() && aq1.a() > 0x10000) 
            {
                aq1.c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (aq aq1)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "There was a problem writing to the Crashlytics log.", aq1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void a(v v1, Date date, Thread thread, Throwable throwable)
        throws Exception
    {
        h h1;
        f f1;
        h h2;
        Object obj1;
        Object obj2;
        h2 = null;
        h1 = null;
        obj2 = null;
        obj1 = null;
        f1 = null;
        Object obj;
        (new File(v1.k, "crash_marker")).createNewFile();
        obj = v1.n();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Crashlytics.b(((String) (obj)));
        obj = new f(v1.k, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        h1 = obj2;
        f1 = ((f) (obj));
        h2 = ((h) (obj1));
        obj1 = com.crashlytics.android.h.a(((OutputStream) (obj)));
        h1 = ((h) (obj1));
        f1 = ((f) (obj));
        h2 = ((h) (obj1));
        v1.a(date, ((h) (obj1)), thread, throwable, "crash", true);
_L3:
        ab.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        ab.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        v1.m();
        v1.l();
        com.crashlytics.android.b.a(v1.k, a, 4, c);
        if (!Crashlytics.getInstance().j())
        {
            v1.p();
        }
        return;
_L2:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = f1;
          goto _L3
        date;
        obj = null;
_L7:
        h1 = h2;
        f1 = ((f) (obj));
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "An error occurred in the fatal exception logger", date);
        h1 = h2;
        f1 = ((f) (obj));
        v1.a(((Throwable) (date)), ((OutputStream) (obj)));
        ab.a(h2, "Failed to flush to session begin file.");
        ab.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        v1;
        f1 = null;
_L6:
        ab.a(h1, "Failed to flush to session begin file.");
        ab.a(f1, "Failed to close fatal exception file output stream.");
        throw v1;
        v1;
        if (true) goto _L6; else goto _L5
_L5:
        date;
          goto _L7
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new S(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    private void a(String s1, int i1)
    {
        com.crashlytics.android.b.a(k, new R((new StringBuilder()).append(s1).append("SessionEvent").toString()), i1, c);
    }

    private void a(Throwable throwable, OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        PrintWriter printwriter = new PrintWriter(outputstream);
        outputstream = printwriter;
        a(throwable, ((Writer) (printwriter)));
        ab.a(printwriter, "Failed to close stack trace writer.");
        return;
        Exception exception;
        exception;
        throwable = null;
_L4:
        outputstream = throwable;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Failed to create PrintWriter", exception);
        ab.a(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
        outputstream = null;
_L2:
        ab.a(outputstream, "Failed to close stack trace writer.");
        throw throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        throwable = printwriter;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(Throwable throwable, Writer writer)
    {
        Throwable throwable1;
        int i1;
        i1 = 1;
        throwable1 = throwable;
_L5:
        if (throwable1 == null) goto _L2; else goto _L1
_L1:
        throwable = throwable1.getLocalizedMessage();
        break MISSING_BLOCK_LABEL_14;
_L6:
        String s1;
        writer.write((new StringBuilder()).append(s1).append(throwable1.getClass().getName()).append(": ").append(throwable).append("\n").toString());
        throwable = throwable1.getStackTrace();
        j1 = throwable.length;
        i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = throwable[i1];
        writer.write((new StringBuilder("\tat ")).append(s1.toString()).append("\n").toString());
        i1++;
        if (true) goto _L4; else goto _L3
        int j1;
        if (throwable == null)
        {
            throwable = null;
            break MISSING_BLOCK_LABEL_174;
        }
        try
        {
            throwable = throwable.replaceAll("(\r\n|\n|\f)", " ");
            break MISSING_BLOCK_LABEL_174;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Could not write stack trace", throwable);
        }
          goto _L2
_L3:
        throwable1 = throwable1.getCause();
        i1 = 0;
          goto _L5
_L2:
        return;
        if (throwable == null)
        {
            throwable = "";
        }
        if (i1 != 0)
        {
            s1 = "";
        } else
        {
            s1 = "Caused by: ";
        }
          goto _L6
    }

    private void a(Date date, h h1, Thread thread, Throwable throwable, String s1, boolean flag)
        throws Exception
    {
        long l3 = date.getTime() / 1000L;
        float f1 = ab.b(Crashlytics.getInstance().getContext());
        int l1 = ab.a(v);
        boolean flag1 = ab.c(Crashlytics.getInstance().getContext());
        int i2 = Crashlytics.getInstance().getContext().getResources().getConfiguration().orientation;
        long l4 = ab.c() - ab.a(Crashlytics.getInstance().getContext());
        long l5 = ab.b(Environment.getDataDirectory().getPath());
        t = ab.a(Crashlytics.d(), Crashlytics.getInstance().getContext());
        x = new LinkedList();
        y = throwable.getStackTrace();
        if (flag)
        {
            date = Thread.getAllStackTraces();
            w = new Thread[date.size()];
            date = date.entrySet().iterator();
            for (int i1 = 0; date.hasNext(); i1++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)date.next();
                w[i1] = (Thread)entry.getKey();
                x.add(entry.getValue());
            }

        } else
        {
            w = new Thread[0];
        }
        d d1 = a(u);
        if (d1 == null)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "No log data to include with this event.");
        }
        ab.a(u, "There was a problem closing the Crashlytics log file.");
        u = null;
        int j1;
        int k1;
        int j2;
        int k2;
        int l2;
        int i3;
        if (!ab.a(Crashlytics.getInstance().getContext(), "com.crashlytics.CollectCustomKeys", true))
        {
            date = new TreeMap();
        } else
        {
            date = Crashlytics.getInstance().a();
            if (date != null && date.size() > 1)
            {
                date = new TreeMap(date);
            }
        }
        h1.g(10, 2);
        j1 = com.crashlytics.android.h.b(1, l3);
        k1 = com.crashlytics.android.h.b(2, com.crashlytics.android.d.a(s1));
        j2 = a(thread, throwable, ((Map) (date)));
        k2 = com.crashlytics.android.h.a(3);
        l2 = com.crashlytics.android.h.c(j2);
        i3 = a(f1, l1, flag1, i2, l4, l5);
        k1 = j1 + 0 + k1 + (j2 + (k2 + l2)) + (i3 + (com.crashlytics.android.h.a(5) + com.crashlytics.android.h.c(i3)));
        j1 = k1;
        if (d1 != null)
        {
            j1 = com.crashlytics.android.h.b(1, d1);
            j1 = k1 + (j1 + (com.crashlytics.android.h.a(6) + com.crashlytics.android.h.c(j1)));
        }
        h1.b(j1);
        h1.a(1, l3);
        h1.a(2, com.crashlytics.android.d.a(s1));
        h1.g(3, 2);
        h1.b(a(thread, throwable, ((Map) (date))));
        a(h1, thread, throwable);
        if (date != null && !date.isEmpty())
        {
            a(h1, ((Map) (date)));
        }
        if (t != null)
        {
            if (t.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h1.a(3, flag);
        }
        h1.a(4, Crashlytics.getInstance().getContext().getResources().getConfiguration().orientation);
        h1.g(5, 2);
        h1.b(a(f1, l1, flag1, i2, l4, l5));
        h1.a(1, f1);
        h1.c(2, l1);
        h1.a(3, flag1);
        h1.a(4, i2);
        h1.a(5, l4);
        h1.a(6, l5);
        if (d1 != null)
        {
            h1.g(6, 2);
            h1.b(com.crashlytics.android.h.b(1, d1));
            h1.a(1, d1);
        }
    }

    static boolean a(v v1, boolean flag)
    {
        v1.v = flag;
        return flag;
    }

    static File[] a(v v1, FilenameFilter filenamefilter)
    {
        return v1.a(filenamefilter);
    }

    private File[] a(FilenameFilter filenamefilter)
    {
        File afile[] = k.listFiles(filenamefilter);
        filenamefilter = afile;
        if (afile == null)
        {
            filenamefilter = new File[0];
        }
        return filenamefilter;
    }

    private int b(Thread thread, Throwable throwable)
    {
        int i1 = a(thread, y, 4, true);
        int l1 = com.crashlytics.android.h.a(1);
        int i2 = com.crashlytics.android.h.c(i1);
        int k1 = w.length;
        int j1 = 0;
        i1 = i1 + (l1 + i2) + 0;
        for (; j1 < k1; j1++)
        {
            l1 = a(w[j1], (StackTraceElement[])x.get(j1), 0, false);
            i1 += l1 + (com.crashlytics.android.h.a(1) + com.crashlytics.android.h.c(l1));
        }

        j1 = a(throwable, 1);
        k1 = com.crashlytics.android.h.a(2);
        l1 = com.crashlytics.android.h.c(j1);
        i2 = s();
        int j2 = com.crashlytics.android.h.a(3);
        int k2 = com.crashlytics.android.h.c(i2);
        int l2 = r();
        return j1 + (k1 + l1) + i1 + (i2 + (j2 + k2)) + (l2 + (com.crashlytics.android.h.a(3) + com.crashlytics.android.h.c(l2)));
    }

    private static d b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return com.crashlytics.android.d.a(s1);
        }
    }

    private Future b(Callable callable)
    {
        try
        {
            callable = s.submit(new I(this, callable));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }

    static void b(v v1)
        throws Exception
    {
        v1.m();
    }

    static void b(v v1, Date date, Thread thread, Throwable throwable)
    {
        h h1;
        h h2;
        h h3;
        Object obj1;
        String s1;
        h1 = null;
        obj1 = null;
        h3 = null;
        h2 = null;
        s1 = v1.n();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        Crashlytics.a(s1);
        Object obj;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Crashlytics is logging non-fatal exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = ab.a(v1.g.getAndIncrement());
        obj = (new StringBuilder()).append(s1).append("SessionEvent").append(((String) (obj))).toString();
        obj = new f(v1.k, ((String) (obj)));
        h1 = obj1;
        h2 = h3;
        h3 = com.crashlytics.android.h.a(((OutputStream) (obj)));
        h1 = h3;
        h2 = h3;
        v1.a(date, h3, thread, throwable, "error", false);
        ab.a(h3, "Failed to flush to non-fatal file.");
        ab.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_178;
        thread;
        date = null;
_L6:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "An error occurred in the non-fatal exception logger", thread);
        v1.a(thread, date);
        ab.a(h2, "Failed to flush to non-fatal file.");
        ab.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        v1;
        date = null;
_L5:
        ab.a(h1, "Failed to flush to non-fatal file.");
        ab.a(date, "Failed to close non-fatal file output stream.");
        throw v1;
_L3:
        try
        {
            v1.a(s1, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "An error occurred when trimming non-fatal files.", v1);
        }
        return;
_L2:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        v1;
        date = ((Date) (obj));
        continue; /* Loop/switch isn't completed */
        v1;
        h1 = h2;
        if (true) goto _L5; else goto _L4
_L4:
        thread;
        date = ((Date) (obj));
          goto _L6
    }

    static void c(v v1)
        throws Exception
    {
        v1.l();
    }

    private void c(String s1)
        throws Exception
    {
        Object obj;
        Object obj1 = null;
        String s2 = null;
        Object obj2;
        Object obj3;
        Object obj4;
        int i1;
        int j1;
        int k1;
        long l1;
        long l2;
        boolean flag;
        try
        {
            obj = new f(com.crashlytics.android.internal.v.a().h(), (new StringBuilder()).append(s1).append("SessionDevice").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s1 = ((String) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s2 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        s1 = com.crashlytics.android.h.a(((OutputStream) (obj)));
        s2 = s1;
        obj3 = new StatFs(Environment.getDataDirectory().getPath());
        i1 = ab.b();
        obj2 = b(Build.MODEL);
        s1 = b(Build.MANUFACTURER);
        obj1 = b(Build.PRODUCT);
        j1 = Runtime.getRuntime().availableProcessors();
        l1 = ab.c();
        l2 = (long)((StatFs) (obj3)).getBlockCount() * (long)((StatFs) (obj3)).getBlockSize();
        flag = ab.d();
        obj4 = Crashlytics.getInstance().b();
        obj3 = com.crashlytics.android.d.a(((ao) (obj4)).e());
        obj4 = ((ao) (obj4)).f();
        k1 = ab.f();
        s2.g(9, 2);
        s2.b(a(i1, ((d) (obj3)), ((d) (obj2)), j1, l1, l2, flag, ((Map) (obj4)), k1, s1, ((d) (obj1))));
        s2.a(1, ((d) (obj3)));
        s2.b(3, i1);
        s2.a(4, ((d) (obj2)));
        s2.a(5, j1);
        s2.a(6, l1);
        s2.a(7, l2);
        s2.a(10, flag);
        for (obj2 = ((Map) (obj4)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); s2.a(2, com.crashlytics.android.d.a((String)((java.util.Map.Entry) (obj3)).getValue())))
        {
            obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
            s2.g(11, 2);
            s2.b(a((ap)((java.util.Map.Entry) (obj3)).getKey(), (String)((java.util.Map.Entry) (obj3)).getValue()));
            s2.b(1, ((ap)((java.util.Map.Entry) (obj3)).getKey()).f);
        }

          goto _L1
        obj1;
        s1 = ((String) (obj));
        obj = obj1;
_L5:
        a(((Throwable) (obj)), s1);
        throw obj;
        obj1;
        obj = s1;
        s1 = ((String) (obj1));
_L3:
        ab.a(s2, "Failed to flush session device info.");
        ab.a(((java.io.Closeable) (obj)), "Failed to close session device file.");
        throw s1;
_L1:
        s2.a(12, k1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        s2.a(13, s1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        s2.a(14, ((d) (obj1)));
        ab.a(s2, "Failed to flush session device info.");
        ab.a(((java.io.Closeable) (obj)), "Failed to close session device file.");
        return;
        s1;
        s2 = null;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L3; else goto _L2
_L2:
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        s1 = ((String) (obj));
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static aq d(v v1)
    {
        return v1.u;
    }

    static boolean e(v v1)
    {
        return v1.k();
    }

    static File f(v v1)
    {
        return v1.l;
    }

    static Pattern i()
    {
        return d;
    }

    static Map j()
    {
        return e;
    }

    private boolean k()
    {
        if (!ab.a(Crashlytics.getInstance().getContext(), "com.crashlytics.CollectCustomLogs", true))
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Preferences requested not to collect custom logs. Aborting log file creation.");
            return false;
        }
        ab.a(u, (new StringBuilder("Could not close log file: ")).append(u).toString());
        File file;
        String s1 = (new StringBuilder("crashlytics-userlog-")).append(UUID.randomUUID().toString()).append(".temp").toString();
        file = new File(com.crashlytics.android.internal.v.a().h(), s1);
        u = new aq(file);
        file.delete();
        return true;
        Exception exception;
        exception;
        file = null;
_L2:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Could not create log file: ")).append(file).toString(), exception);
        return false;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void l()
        throws Exception
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj5;
        d d1;
        d d2;
        Object obj6;
        String s1;
        Object obj7;
        obj2 = null;
        obj3 = null;
        d1 = null;
        obj6 = null;
        obj5 = null;
        d2 = null;
        obj = null;
        obj7 = new Date();
        s1 = (new e(Crashlytics.getInstance().b())).toString();
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Opening an new session with ID ")).append(s1).toString());
        Object obj1 = new f(com.crashlytics.android.internal.v.a().h(), (new StringBuilder()).append(s1).append("BeginSession").toString());
        Exception exception;
        Exception exception1;
        d d3;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        boolean flag;
        try
        {
            obj = com.crashlytics.android.h.a(((OutputStream) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        ((h) (obj)).a(1, com.crashlytics.android.d.a(n));
        ((h) (obj)).a(2, com.crashlytics.android.d.a(s1));
        ((h) (obj)).a(3, ((Date) (obj7)).getTime() / 1000L);
        ab.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        ab.a(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
        obj2 = new f(com.crashlytics.android.internal.v.a().h(), (new StringBuilder()).append(s1).append("SessionApp").toString());
        try
        {
            obj1 = com.crashlytics.android.h.a(((OutputStream) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = obj2;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
        }
        obj = com.crashlytics.android.d.a(Crashlytics.d());
        obj3 = com.crashlytics.android.d.a(Crashlytics.g());
        obj7 = com.crashlytics.android.d.a(Crashlytics.f());
        com.crashlytics.android.d.a(Crashlytics.h());
        com.crashlytics.android.d.a(Crashlytics.getInstance().getContext().getPackageCodePath());
        d3 = com.crashlytics.android.d.a(Crashlytics.getInstance().b().b());
        i1 = ai.a(Crashlytics.e()).a();
        ((h) (obj1)).g(7, 2);
        j1 = com.crashlytics.android.h.b(1, ((d) (obj)));
        k1 = com.crashlytics.android.h.b(2, ((d) (obj3)));
        l1 = com.crashlytics.android.h.b(3, ((d) (obj7)));
        i2 = q();
        ((h) (obj1)).b(j1 + 0 + k1 + l1 + (i2 + (com.crashlytics.android.h.a(5) + com.crashlytics.android.h.c(i2))) + com.crashlytics.android.h.b(6, d3) + com.crashlytics.android.h.e(10, i1));
        ((h) (obj1)).a(1, ((d) (obj)));
        ((h) (obj1)).a(2, ((d) (obj3)));
        ((h) (obj1)).a(3, ((d) (obj7)));
        ((h) (obj1)).g(5, 2);
        ((h) (obj1)).b(q());
        ((h) (obj1)).a(1, com.crashlytics.android.internal.r.a(Crashlytics.getInstance().getContext(), false));
        ((h) (obj1)).a(6, d3);
        ((h) (obj1)).b(10, i1);
        ab.a(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        ab.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        obj3 = new f(com.crashlytics.android.internal.v.a().h(), (new StringBuilder()).append(s1).append("SessionOS").toString());
        obj1 = obj3;
        obj = obj6;
        obj2 = d2;
        obj5 = com.crashlytics.android.h.a(((OutputStream) (obj3)));
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        d1 = com.crashlytics.android.d.a(android.os.Build.VERSION.RELEASE);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        d2 = com.crashlytics.android.d.a(android.os.Build.VERSION.CODENAME);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        flag = ab.e();
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((h) (obj5)).g(8, 2);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((h) (obj5)).b(com.crashlytics.android.h.e(1, 3) + 0 + com.crashlytics.android.h.b(2, d1) + com.crashlytics.android.h.b(3, d2) + com.crashlytics.android.h.b(4, flag));
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((h) (obj5)).b(1, 3);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((h) (obj5)).a(2, d1);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((h) (obj5)).a(3, d2);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((h) (obj5)).a(4, flag);
        ab.a(((java.io.Flushable) (obj5)), "Failed to flush to session OS file.");
        ab.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        c(s1);
        return;
        obj2;
        obj3 = null;
        obj1 = obj;
        obj = obj3;
_L12:
        a(((Throwable) (obj2)), ((OutputStream) (obj1)));
        throw obj2;
        obj3;
        obj2 = obj;
        obj = obj3;
_L10:
        ab.a(((java.io.Flushable) (obj2)), "Failed to flush to session begin file.");
        ab.a(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
        throw obj;
        obj1;
        obj = null;
        obj2 = obj3;
_L8:
        a(((Throwable) (obj1)), ((OutputStream) (obj)));
        throw obj1;
        obj3;
        obj1 = obj2;
        obj2 = obj;
        obj = obj3;
_L6:
        ab.a(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        ab.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj;
        obj5;
        obj3 = null;
        obj2 = d1;
_L4:
        obj1 = obj3;
        obj = obj2;
        a(((Throwable) (obj5)), ((OutputStream) (obj3)));
        obj1 = obj3;
        obj = obj2;
        throw obj5;
        obj3;
        obj2 = obj;
        obj = obj3;
_L2:
        ab.a(((java.io.Flushable) (obj2)), "Failed to flush to session OS file.");
        ab.a(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
        throw obj;
        obj;
        obj1 = null;
        obj2 = obj5;
        if (true) goto _L2; else goto _L1
_L1:
        obj5;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj1 = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        exception1;
        Object obj4 = obj1;
        obj = obj2;
        obj1 = exception1;
        obj2 = obj4;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        exception;
        obj2 = obj;
        obj = exception;
        if (true) goto _L10; else goto _L9
        obj2;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void m()
        throws Exception
    {
        Object obj3;
        HashSet hashset = new HashSet();
        File afile[] = o();
        Arrays.sort(afile, b);
        int l1 = Math.min(8, afile.length);
        for (int i1 = 0; i1 < l1; i1++)
        {
            hashset.add(a(afile[i1]));
        }

        afile = a(new Q((byte)0));
        l1 = afile.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            File file = afile[j1];
            String s1 = file.getName();
            Matcher matcher = d.matcher(s1);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Trimming open session file: ")).append(s1).toString());
                file.delete();
            }
        }

        obj3 = n();
        if (obj3 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj7;
        obj = null;
        obj1 = null;
        obj7 = null;
        obj2 = null;
        obj3 = new f(k, (new StringBuilder()).append(((String) (obj3))).append("SessionUser").toString());
        obj1 = obj3;
        obj2 = obj7;
        obj7 = com.crashlytics.android.h.a(((OutputStream) (obj3)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        Object obj9 = Crashlytics.getInstance().m();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s3 = Crashlytics.getInstance().o();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s2 = Crashlytics.getInstance().n();
        if (obj9 != null || s3 != null || s2 != null) goto _L4; else goto _L3
_L3:
        ab.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        ab.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
_L16:
        obj = Crashlytics.getInstance().r();
        if (obj == null) goto _L6; else goto _L5
_L5:
        File afile1[];
        int i2;
        i2 = ((aR) (obj)).a;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Closing all open sessions.");
        afile1 = o();
        if (afile1 == null || afile1.length <= 0) goto _L8; else goto _L7
_L7:
        int k1;
        int j2;
        j2 = afile1.length;
        k1 = 0;
_L12:
        if (k1 >= j2) goto _L8; else goto _L9
_L9:
        Exception exception1;
        Object obj10 = afile1[k1];
        obj9 = a(((File) (obj10)));
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Closing session: ")).append(((String) (obj9))).toString());
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Collecting session parts for ID ")).append(((String) (obj9))).toString());
        obj7 = a(new R((new StringBuilder()).append(((String) (obj9))).append("SessionCrash").toString()));
        Exception exception;
        Object obj8;
        boolean flag;
        boolean flag1;
        if (obj7 != null && obj7.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            obj9, Boolean.valueOf(flag)
        }));
        obj3 = a(new R((new StringBuilder()).append(((String) (obj9))).append("SessionEvent").toString()));
        if (obj3 != null && obj3.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            obj9, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L11; else goto _L10
_L10:
        obj2 = null;
        obj1 = null;
        obj = new f(k, ((String) (obj9)));
        obj1 = obj2;
        obj2 = com.crashlytics.android.h.a(((OutputStream) (obj)));
        obj1 = obj2;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Collecting SessionStart data for session ID ")).append(((String) (obj9))).toString());
        obj1 = obj2;
        a(((h) (obj2)), ((File) (obj10)));
        obj1 = obj2;
        ((h) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((h) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((h) (obj2)), ((String) (obj9)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_863;
        }
        obj1 = obj2;
        if (obj3.length <= i2)
        {
            break MISSING_BLOCK_LABEL_852;
        }
        obj1 = obj2;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i2)
        }));
        obj1 = obj2;
        a(((String) (obj9)), i2);
        obj1 = obj2;
        obj3 = a(new R((new StringBuilder()).append(((String) (obj9))).append("SessionEvent").toString()));
        obj1 = obj2;
        a(((h) (obj2)), ((File []) (obj3)), ((String) (obj9)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_878;
        }
        obj1 = obj2;
        a(((h) (obj2)), obj7[0]);
        obj1 = obj2;
        ((h) (obj2)).a(11, 1);
        obj1 = obj2;
        ((h) (obj2)).b(12, 3);
        ab.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        ab.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L18:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Removing session part files for ID ")).append(((String) (obj9))).toString());
        a(((String) (obj9)));
        k1++;
          goto _L12
_L4:
        obj8 = obj9;
        if (obj9 == null)
        {
            obj8 = "";
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj10 = com.crashlytics.android.d.a(((String) (obj8)));
        if (s3 != null) goto _L14; else goto _L13
_L13:
        obj8 = null;
          goto _L15
_L17:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        i2 = com.crashlytics.android.h.b(1, ((d) (obj10))) + 0;
        k1 = i2;
        if (obj8 == null)
        {
            break MISSING_BLOCK_LABEL_1045;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        k1 = i2 + com.crashlytics.android.h.b(2, ((d) (obj8)));
        i2 = k1;
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1074;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        i2 = k1 + com.crashlytics.android.h.b(3, ((d) (obj9)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((h) (obj7)).g(6, 2);
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((h) (obj7)).b(i2);
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((h) (obj7)).a(1, ((d) (obj10)));
        if (obj8 == null)
        {
            break MISSING_BLOCK_LABEL_1146;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((h) (obj7)).a(2, ((d) (obj8)));
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1168;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((h) (obj7)).a(3, ((d) (obj9)));
        ab.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        ab.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
          goto _L16
_L14:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj8 = com.crashlytics.android.d.a(s3);
          goto _L15
_L24:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj9 = com.crashlytics.android.d.a(s2);
          goto _L17
        exception1;
        obj3 = null;
_L22:
        obj = obj2;
        obj1 = obj3;
        a(exception1, ((OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L21:
        ab.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        ab.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L20:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Failed to write session file for session ID: ")).append(((String) (obj9))).toString(), ((Throwable) (obj2)));
        a(((Throwable) (obj2)), ((OutputStream) (obj1)));
        ab.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        a(((f) (obj1)));
          goto _L18
        obj2;
        obj = null;
_L19:
        ab.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        ab.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L11:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("No events present for session ID ")).append(((String) (obj9))).toString());
          goto _L18
_L6:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "No session begin files found.");
_L8:
        return;
_L2:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Unable to close session. Settings are not loaded.");
        return;
        obj2;
          goto _L19
        obj2;
        Object obj4 = obj1;
        obj1 = obj;
        obj = obj4;
          goto _L19
        obj2;
        Object obj5 = null;
        obj1 = obj;
        obj = obj5;
          goto _L20
        exception1;
        obj1 = obj2;
        Object obj6 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj6;
          goto _L20
        obj;
        obj2 = null;
          goto _L21
        exception1;
          goto _L22
_L15:
        if (s2 != null) goto _L24; else goto _L23
_L23:
        obj9 = null;
          goto _L17
    }

    private String n()
    {
        File afile[] = a(new R("BeginSession"));
        Arrays.sort(afile, b);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    private File[] o()
    {
        return a(new R("BeginSession"));
    }

    private void p()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Attempting to send crash report at time of crash...");
            (new Thread(new D(this, file), "Crashlytics Report Uploader")).start();
        }

    }

    private static int q()
    {
        return com.crashlytics.android.h.b(1, com.crashlytics.android.d.a(com.crashlytics.android.internal.r.a(Crashlytics.getInstance().getContext(), com.crashlytics.android.internal.v.a().f()))) + 0;
    }

    private int r()
    {
        int j1 = com.crashlytics.android.h.b(1, 0L) + 0 + com.crashlytics.android.h.b(2, 0L) + com.crashlytics.android.h.b(3, q);
        int i1 = j1;
        if (r != null)
        {
            i1 = j1 + com.crashlytics.android.h.b(4, r);
        }
        return i1;
    }

    private static int s()
    {
        return com.crashlytics.android.h.b(1, f) + 0 + com.crashlytics.android.h.b(2, f) + com.crashlytics.android.h.b(3, 0L);
    }

    final void a(long l1, String s1)
    {
        b(new x(this, l1, s1));
    }

    final void a(Thread thread, Throwable throwable)
    {
        a(((Runnable) (new P(this, new Date(), thread, throwable))));
    }

    final void a(File afile[])
    {
        File file = new File(com.crashlytics.android.internal.v.a().h(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile2[] = file.listFiles();
                int k1 = afile2.length;
                for (int i1 = 0; i1 < k1; i1++)
                {
                    afile2[i1].delete();
                }

            }
            file.delete();
        }
        int i2 = afile.length;
        for (int j1 = 0; j1 < i2; j1++)
        {
            Object obj = afile[j1];
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Found invalid session part file: ")).append(obj).toString());
            obj = a(((File) (obj)));
            F f1 = new F(this, ((String) (obj)));
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
            File afile1[] = a(((FilenameFilter) (f1)));
            int j2 = afile1.length;
            for (int l1 = 0; l1 < j2; l1++)
            {
                File file1 = afile1[l1];
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Deleting session file: ")).append(file1).toString());
                file1.delete();
            }

        }

    }

    final boolean a()
    {
        return m.get();
    }

    final boolean b()
    {
        return ((Boolean)a(new O(this))).booleanValue();
    }

    final void c()
    {
        b(new z(this));
    }

    final void d()
    {
        b(new A(this));
    }

    final void e()
    {
        b(new B(this));
    }

    final boolean f()
    {
        return ((Boolean)a(new C(this))).booleanValue();
    }

    final boolean g()
    {
        return o().length > 0;
    }

    final void h()
    {
        a(new E(this));
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        m.set(true);
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!h.getAndSet(true))
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Unregistering power receivers.");
            Crashlytics.getInstance().getContext().unregisterReceiver(p);
            Crashlytics.getInstance().getContext().unregisterReceiver(o);
        }
        a(new N(this, new Date(), thread, throwable));
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        m.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        m.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        m.set(false);
        throw obj;
    }

    static 
    {
        new K();
    }
}
