// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.whatsapp.util:
//            av, am, l, bl

public class Log
{

    private static final int a;
    private static int b;
    private static File c;
    private static int d;
    private static final Object e;
    public static boolean f;
    private static File g;
    private static boolean h;
    private static AtomicReference i;
    private static final Object j;
    private static final int k;
    private static FileChannel l;
    private static final Object m;
    private static final SimpleDateFormat n;
    private static AtomicReference o;
    private static final String z[];

    public static String a(c4 c4_1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            stringbuilder.append(z[69]).append(c4_1.M).append(z[68]).append(c4_1.w);
            if (c4_1.y.a.contains("-"))
            {
                stringbuilder.append(z[67]).append(c4_1.t);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        stringbuilder.append(z[70]).append(c4_1.G).append(" ").append(c4_1.y.toString());
        return stringbuilder.toString();
    }

    static String a(String s, String s1)
    {
        return b(s, s1);
    }

    private static String a(String s, String s1, String s2)
    {
        return a(a(s, (new StringBuilder(s1.length() + a + s2.length())).append(s1).append("\n").append(s2))).toString();
    }

    private static StringBuilder a(String s, StringBuilder stringbuilder)
    {
        String s2;
        Object obj;
        String s3;
        String s4;
        long l1;
        l1 = Thread.currentThread().getId();
        s3 = Thread.currentThread().getName();
        s4 = (new StringBuilder()).append(s).append((String)i.get()).append(" ").toString();
        if (d < 5)
        {
            return (new StringBuilder(s4.length() + 20 + s3.length() + stringbuilder.length() + 4)).append(s4).append('[').append(l1).append(':').append(s3).append(z[75]).append(stringbuilder);
        }
        s = "";
        String s1 = "";
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int i1 = 5;
        do
        {
label0:
            {
                obj = s1;
                s2 = s;
                if (i1 >= astacktraceelement.length)
                {
                    break MISSING_BLOCK_LABEL_221;
                }
                obj = astacktraceelement[i1];
                boolean flag;
                try
                {
                    flag = ((StackTraceElement) (obj)).isNativeMethod();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                if (!flag)
                {
                    break label0;
                }
                if (i1 == 5)
                {
                    s = ((StackTraceElement) (obj)).getFileName();
                    s1 = z[74];
                }
                i1++;
            }
        } while (true);
        s2 = ((StackTraceElement) (obj)).getFileName();
        obj = String.valueOf(((StackTraceElement) (obj)).getLineNumber());
        return (new StringBuilder(s4.length() + 1 + 20 + 1 + s3.length() + 1 + s2.length() + 1 + ((String) (obj)).length() + 1 + stringbuilder.length())).append(s4).append('[').append(l1).append(':').append(s3).append(']').append(s2).append(':').append(((String) (obj))).append(' ').append(stringbuilder);
    }

    private static StringBuilder a(StringBuilder stringbuilder)
    {
        if (!e()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        Object obj3;
        obj = new StringBuilder(k + stringbuilder.length() + a);
        obj2 = Calendar.getInstance();
        ByteBuffer bytebuffer;
        try
        {
            ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(1)).append('-');
            if (((Calendar) (obj2)).get(2) < 9)
            {
                ((StringBuilder) (obj)).append('0');
            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        try
        {
            ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(2) + 1).append('-');
            if (((Calendar) (obj2)).get(5) < 10)
            {
                ((StringBuilder) (obj)).append('0');
            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        try
        {
            ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(5)).append(' ');
            if (((Calendar) (obj2)).get(11) < 10)
            {
                ((StringBuilder) (obj)).append('0');
            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        try
        {
            ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(11)).append(':');
            if (((Calendar) (obj2)).get(12) < 10)
            {
                ((StringBuilder) (obj)).append('0');
            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        try
        {
            ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(12)).append(':');
            if (((Calendar) (obj2)).get(13) < 10)
            {
                ((StringBuilder) (obj)).append('0');
            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw stringbuilder;
        }
        ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(13)).append('.');
        if (((Calendar) (obj2)).get(14) >= 10) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj)).append(z[58]);
_L6:
        ((StringBuilder) (obj)).append(((Calendar) (obj2)).get(14)).append(' ');
        ((StringBuilder) (obj)).append(stringbuilder).append("\n");
        bytebuffer = ByteBuffer.wrap(((StringBuilder) (obj)).toString().getBytes());
        obj3 = m;
        obj3;
        JVM INSTR monitorenter ;
        obj = null;
        obj2 = l.lock();
        obj = obj2;
        l.position(l.size());
        obj = obj2;
        l.write(bytebuffer);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        ((FileLock) (obj2)).release();
        obj3;
        JVM INSTR monitorexit ;
_L2:
        return stringbuilder;
        stringbuilder;
        throw stringbuilder;
_L4:
        if (((Calendar) (obj2)).get(14) >= 100) goto _L6; else goto _L5
_L5:
        ((StringBuilder) (obj)).append('0');
          goto _L6
        stringbuilder;
        throw stringbuilder;
        Exception exception;
        exception;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        ((FileLock) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            android.util.Log.e(z[56], (new StringBuilder()).append(z[57]).append(stringbuilder).toString(), ((Throwable) (obj1)));
        }
        return stringbuilder;
        obj1;
        throw obj1;
    }

    public static ArrayList a(int i1)
    {
        return am.b(c, i1);
    }

    static void a(int i1, String s)
    {
        c(i1, s);
    }

    public static void a(Context context)
    {
        try
        {
            if (!o.compareAndSet(null, context))
            {
                throw new IllegalStateException(z[19]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    public static void a(String s)
    {
        b(z[28], s);
    }

    public static void a(String s, Throwable throwable)
    {
        if (d != 5) goto _L2; else goto _L1
_L1:
        c(1, a(z[34], s, d(throwable)));
_L4:
        return;
        s;
        throw s;
_L2:
        if (d < 1) goto _L4; else goto _L3
_L3:
        a(z[33], s, d(throwable));
        return;
        s;
        throw s;
    }

    public static void a(String s, Throwable throwable, Object aobj[])
    {
        boolean flag = f;
        int i1 = d;
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        c(2, a(z[52], String.format(Locale.US, s, aobj), d(throwable)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        c(2, b(z[54], String.format(Locale.US, s, aobj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = d;
        if (i1 < 2)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (throwable != null)
        {
            try
            {
                a(z[55], String.format(Locale.US, s, aobj), d(throwable));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_132;
            }
        }
        b(z[53], String.format(Locale.US, s, aobj));
        return;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
    }

    public static void a(Throwable throwable)
    {
        if (d != 5) goto _L2; else goto _L1
_L1:
        c(1, b(z[22], d(throwable)));
_L4:
        return;
        throwable;
        throw throwable;
_L2:
        if (d < 1) goto _L4; else goto _L3
_L3:
        b(z[23], d(throwable));
        return;
        throwable;
        throw throwable;
    }

    public static boolean a()
    {
        boolean flag = false;
        if (!e()) goto _L2; else goto _L1
_L1:
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = m;
        obj1;
        JVM INSTR monitorenter ;
        l.close();
        flag = am.b(c, g);
        h = false;
        e();
        obj;
        JVM INSTR monitorexit ;
_L2:
        return flag;
        Object obj2;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
    }

    private static String b(int i1)
    {
        switch (i1)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append(z[17]).append(i1).toString());

        case 0: // '\0'
            String s;
            try
            {
                s = z[18];
            }
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            return s;

        case 1: // '\001'
            return z[12];

        case 2: // '\002'
            return z[13];

        case 3: // '\003'
            return z[14];

        case 4: // '\004'
            return z[16];

        case 5: // '\005'
            return z[15];
        }
    }

    private static String b(String s, String s1)
    {
        return a(a(s, new StringBuilder(s1))).toString();
    }

    private static ArrayList b()
    {
        return com.whatsapp.util.l.b(c, g);
    }

    public static void b(int i1, String s)
    {
        if (i1 > d)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        s = b(b(i1), s);
        if (d == 5)
        {
            c(i1, s);
        }
        return;
        s;
        throw s;
    }

    public static void b(String s, Throwable throwable)
    {
        int i1;
        boolean flag;
        try
        {
            i1 = d;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        c(3, a(z[59], s, d(throwable)));
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (d >= 3)
        {
            a(z[60], s, d(throwable));
        }
    }

    public static void b(String s, Throwable throwable, Object aobj[])
    {
        boolean flag = f;
        int i1 = d;
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        c(3, a(z[64], String.format(Locale.US, s, aobj), d(throwable)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        c(3, b(z[61], String.format(Locale.US, s, aobj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = d;
        if (i1 < 3)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (throwable != null)
        {
            try
            {
                a(z[62], String.format(Locale.US, s, aobj), d(throwable));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_132;
            }
        }
        b(z[63], String.format(Locale.US, s, aobj));
        return;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
    }

    public static void b(Throwable throwable)
    {
        int i1;
        boolean flag;
        try
        {
            i1 = d;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            try
            {
                throw throwable;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable) { }
            try
            {
                throw throwable;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                throw throwable;
            }
        }
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(3, b(z[66], d(throwable)));
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (d >= 3)
        {
            b(z[65], d(throwable));
        }
    }

    public static void b(boolean flag)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        b(z[21], z[20]);
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    public static String c()
    {
        return z[0];
    }

    public static void c(int i1)
    {
        d = i1;
        b(z[26], (new StringBuilder()).append(z[27]).append(d).append(z[25]).append(b).append(z[24]).toString());
    }

    private static void c(int i1, String s)
    {
        String s1;
        for (; s.length() > 4000; d(i1, (new StringBuilder()).append(s1).append(z[31]).toString()))
        {
            s1 = s.substring(0, 3997);
            s = (new StringBuilder()).append(z[32]).append(s.substring(3997)).toString();
        }

        d(i1, s);
    }

    public static void c(String s, Throwable throwable)
    {
        int i1;
        boolean flag;
        try
        {
            i1 = d;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(2, a(z[2], s, d(throwable)));
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (d >= 2)
        {
            a(z[3], s, d(throwable));
        }
    }

    public static void c(String s, Throwable throwable, Object aobj[])
    {
        boolean flag = f;
        int i1 = d;
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        c(1, a(z[44], String.format(Locale.US, s, aobj), d(throwable)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        c(1, b(z[45], String.format(Locale.US, s, aobj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = d;
        if (i1 < 1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (throwable != null)
        {
            try
            {
                a(z[46], String.format(Locale.US, s, aobj), d(throwable));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_132;
            }
        }
        b(z[43], String.format(Locale.US, s, aobj));
        return;
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
    }

    public static void c(Throwable throwable)
    {
        int i1;
        boolean flag;
        try
        {
            i1 = d;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            try
            {
                throw throwable;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable) { }
            try
            {
                throw throwable;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                throw throwable;
            }
        }
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(2, b(z[71], d(throwable)));
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (d >= 2)
        {
            b(z[72], d(throwable));
        }
    }

    public static File d()
    {
        return com.whatsapp.util.am.a(c);
    }

    private static String d(Throwable throwable)
    {
        if (throwable == null)
        {
            return "";
        }
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        try
        {
            if (z[51] != null)
            {
                printwriter.println(k());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throw throwable;
        }
        throwable.printStackTrace(printwriter);
        printwriter.println(c());
        return stringwriter.toString();
    }

    private static void d(int i1, String s)
    {
        if (i1 != 0 && i1 != 5) goto _L2; else goto _L1
_L1:
        android.util.Log.v(z[39], s);
_L4:
        return;
        s;
        throw s;
_L2:
        if (i1 == 4)
        {
            try
            {
                android.util.Log.d(z[41], s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 == 3)
        {
            try
            {
                android.util.Log.i(z[38], s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 == 2)
        {
            try
            {
                android.util.Log.w(z[42], s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        android.util.Log.e(z[37], s);
        i1 = App.l;
        if (i1 == 3)
        {
            StringBuilder stringbuilder;
            try
            {
                stringbuilder = (new StringBuilder()).append(z[40]);
                i1 = s.length();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (i1 > 50)
            {
                s = (new StringBuilder()).append(s.substring(0, 47)).append("\u2026").toString();
            }
            App.q(stringbuilder.append(s).toString());
            return;
        }
          goto _L4
        s;
        throw s;
    }

    public static void d(String s)
    {
        int i1;
        boolean flag;
        try
        {
            i1 = d;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        c(4, b(z[36], s));
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (d >= 4)
        {
            b(z[35], s);
        }
    }

    public static void e(String s)
    {
        int i1;
        boolean flag;
        try
        {
            i1 = d;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (i1 != 5)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        c(1, b(z[29], s));
        flag = f;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (d >= 1)
        {
            b(z[30], s);
        }
    }

    private static boolean e()
    {
        Object obj;
        if (!h)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = l;
        if (obj != null)
        {
            boolean flag;
            try
            {
                flag = l.isOpen();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_313;
            }
        }
        obj = m;
        obj;
        JVM INSTR monitorenter ;
        flag = h;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        flag = l.isOpen();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        throw obj;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        Object obj2 = (Context)o.get();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj2 = new File(((Context) (obj2)).getFilesDir(), z[4]);
        boolean flag1;
        if (((File) (obj2)).exists())
        {
            break MISSING_BLOCK_LABEL_137;
        }
        ((File) (obj2)).mkdirs();
        flag1 = ((File) (obj2)).exists();
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        obj2;
        throw obj2;
        c = new File(((File) (obj2)), z[9]);
        g = new File(((File) (obj2)), z[6]);
        l = (new FileOutputStream(c, true)).getChannel();
        System.setErr(new PrintStream(new bl(System.err, Channels.newOutputStream(l)), true));
        h = true;
        Calendar calendar = Calendar.getInstance();
        int i1 = calendar.get(15);
        b = (calendar.get(16) + i1) / 60000;
        b(z[7], (new StringBuilder()).append(z[10]).append(d).append(z[8]).append(b).append(z[5]).toString());
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_313;
        calendar;
        obj;
        JVM INSTR monitorexit ;
        return false;
        return true;
    }

    public static String f()
    {
        return z[73];
    }

    static int g()
    {
        return d;
    }

    public static void h()
    {
        com.whatsapp.util.am.a(c, 3);
    }

    public static File i()
    {
        Object obj;
        boolean flag;
        flag = f;
        obj = null;
        if (!e()) goto _L2; else goto _L1
_L1:
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Object obj3 = j;
        obj3;
        JVM INSTR monitorenter ;
        Iterator iterator = b().iterator();
        obj = null;
_L4:
        File file;
        File file1;
        File file2;
        file = ((File) (obj));
        file1 = ((File) (obj));
        file2 = ((File) (obj));
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        file1 = ((File) (obj));
        file2 = ((File) (obj));
        File file3 = (File)iterator.next();
        file1 = ((File) (obj));
        file2 = ((File) (obj));
        file = com.whatsapp.util.am.a(c, file3);
        file1 = file;
        file2 = file;
        file3.delete();
        obj = file;
        if (!flag) goto _L4; else goto _L3
_L3:
        obj = file;
_L5:
        obj3;
        JVM INSTR monitorexit ;
        obj2;
        JVM INSTR monitorexit ;
_L2:
        return ((File) (obj));
        Object obj1;
        obj1;
        file2 = null;
_L7:
        a(((Throwable) (obj1)));
        obj1 = file2;
          goto _L5
_L6:
        a(((Throwable) (obj1)));
          goto _L3
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        file = file1;
          goto _L6
        obj1;
          goto _L7
        obj1;
        file = null;
          goto _L6
    }

    public static void i(String s)
    {
        if (d != 5) goto _L2; else goto _L1
_L1:
        c(3, b(z[47], s));
_L4:
        return;
        s;
        throw s;
_L2:
        if (d < 3) goto _L4; else goto _L3
_L3:
        b(z[48], s);
        return;
        s;
        throw s;
    }

    public static boolean j()
    {
        int i1;
        try
        {
            i1 = d;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return i1 >= 5;
    }

    public static String k()
    {
        return (new StringBuilder()).append(z[1]).append(f()).toString();
    }

    public static void v(String s)
    {
        try
        {
            if (d >= 5)
            {
                c(5, b(z[11], s));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static void w(String s)
    {
        if (d != 5) goto _L2; else goto _L1
_L1:
        c(2, b(z[49], s));
_L4:
        return;
        s;
        throw s;
_L2:
        if (d < 2) goto _L4; else goto _L3
_L3:
        b(z[50], s);
        return;
        s;
        throw s;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[77];
        obj = "\177\036%Ik2Y&\032z=^mIz.\\e\f";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                i1 = 1;
                obj = "\177\036%Il9Zo\007./Ig\ne|It\bm9\035";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "\020qY>.";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "\020qY>.";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\020Ra\032";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                obj = "|\000;T3";
                byte0 = 4;
                i1 = 5;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                obj = "+Ug\035}=MvGz1M";
                i1 = 6;
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\020qY .";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "|I|T";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "+Ug\035}=MvGb3Z";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "a\000;T.0Ra\017g0X&\005k*XjT";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\020qY?.";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\020qY,.";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "\020qY>.";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                obj = "\020qY .";
                byte0 = 13;
                i1 = 14;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "\020qY?.";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\020qY-.";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\025Sp\bb5Y&\005a;\035j\fx9Q&";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\020qY(.";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "0RaIo,Mj\000m=Io\006`|^i\007z9ErIo0Oc\bj%\035g\032}5Zh\fj";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "\035Nu\f|(Ti\007.\032\\o\005k8";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "\020qY(.";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\020qY,.";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "\020qY,.";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "|\000;T3";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "|I|T";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "\020qY .";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "a\000;T.0Ra\017g0X&\037k.No\006`a\017(X?r\b5X.0Xp\fba";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "\020qY(.";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "\020qY,.";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "\020qY,.";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "r\023(";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "r\023(";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "\020qY,.";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "\020qY,.";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "\020qY-.";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "\020qY-.";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "\013Ug\035}\035Mv";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "\013Ug\035}\035Mv";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "\013Ug\035}\035Mv";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "\031Ot\006|f\035";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "\013Ug\035}\035Mv";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "\013Ug\035}\035Mv";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "\020qY,.";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "\020qY,.";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "\020qY,.";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "\020qY,.";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "\020qY .";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "\020qY .";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "\020qY>.";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "\020qY>.";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "n\0237X i\0167";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "\020qY>.";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "\020qY>.";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "\020qY>.";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "\020qY>.";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "\013Ug\035}\035Mv";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "\025rC\021m9Mr\000a2\035i\007.";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "l\r";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "\020qY .";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "\020qY .";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[i1] = ((String) (obj));
                obj = "\020qY .";
                byte0 = 60;
                i1 = 61;
                break;

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "\020qY .";
                byte0 = 61;
                break;

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "\020qY .";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "\020qY .";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "\020qY .";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "\020qY .";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "sZt\031Q=^r\000a2\007";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "sI\177\031kf";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                i1 = 69;
                obj = ":Pu\016!/Ig\035{/\007";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "sOk\035#/OeS";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = "\020qY>.";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "\020qY>.";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "n\0237X i\0167Dh=I+\036k>No\035kqOc\005k=Nc";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "2\\r\000x9";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "\001\035";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "%D\177\020#\021p+\rj|uNSc1\007u\032 \017nUI";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                z = as;
                a = "\n".length();
                n = new SimpleDateFormat(z[76], Locale.US);
                k = n.toPattern().length();
                o = new AtomicReference();
                i = new av("D");
                c = null;
                g = null;
                d = 5;
                b = 0;
                h = false;
                l = null;
                m = new Object();
                j = new Object();
                e = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1892
    //                   0 1915
    //                   1 1922
    //                   2 1929
    //                   3 1936;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1936;
_L3:
        byte byte1 = 14;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 92;
          goto _L9
_L5:
        byte1 = 61;
          goto _L9
_L6:
        byte1 = 6;
          goto _L9
        byte1 = 105;
          goto _L9
    }
}
