// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package de.greenrobot.event:
//            n, d, m, a, 
//            c, j, h, q, 
//            e, p, k, i, 
//            o, l, b

public class g
{

    static volatile g f;
    private static final n h;
    public static String m;
    public static boolean n;
    private static final Map r;
    private static final String z[];
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final Map g;
    private final c i;
    private final ThreadLocal j;
    private final j k;
    private final m l;
    private final ExecutorService o;
    private final a p;
    private final boolean q;
    private final Map s;
    private final Map t;

    public g()
    {
        this(h);
    }

    g(n n1)
    {
        j = new d(this);
        g = new HashMap();
        s = new HashMap();
        t = new ConcurrentHashMap();
        l = new m(this, Looper.getMainLooper(), 10);
        p = new a(this);
        i = new c(this);
        k = new j(n1.i);
        d = n1.a;
        c = n1.d;
        e = n1.c;
        q = n1.b;
        b = n1.g;
        a = n1.f;
        o = n1.h;
    }

    public static g a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        de/greenrobot/event/g;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new g();
        }
        de/greenrobot/event/g;
        JVM INSTR monitorexit ;
_L2:
        return f;
        Exception exception;
        exception;
        de/greenrobot/event/g;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(e e1, Object obj, Throwable throwable)
    {
        if (!(obj instanceof q)) goto _L2; else goto _L1
_L1:
        boolean flag = d;
        if (flag)
        {
            Log.e(m, (new StringBuilder()).append(z[6]).append(e1.d.getClass()).append(z[7]).toString(), throwable);
            e1 = (q)obj;
            Log.e(m, (new StringBuilder()).append(z[8]).append(((q) (e1)).d).append(z[3]).append(((q) (e1)).a).toString(), ((q) (e1)).c);
        }
_L4:
        return;
        e1;
        throw e1;
_L2:
        try
        {
            if (b)
            {
                throw new h(z[5], throwable);
            }
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw e1;
        }
        try
        {
            if (d)
            {
                Log.e(m, (new StringBuilder()).append(z[4]).append(obj.getClass()).append(z[2]).append(e1.d.getClass()).toString(), throwable);
            }
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw e1;
        }
        if (e)
        {
            a(new q(this, throwable, obj, e1.d));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(e e1, Object obj, boolean flag)
    {
        int i1;
        try
        {
            i1 = p.a[e1.b.d.ordinal()];
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw e1;
        }
        i1;
        JVM INSTR tableswitch 1 4: default 48
    //                   1 85
    //                   2 95
    //                   3 119
    //                   4 143;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalStateException((new StringBuilder()).append(z[13]).append(e1.b.d).toString());
_L2:
        a(e1, obj);
        return;
_L3:
        if (flag)
        {
            try
            {
                a(e1, obj);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw e1;
            }
        } else
        {
            l.a(e1, obj);
            return;
        }
_L4:
        if (flag)
        {
            try
            {
                p.a(e1, obj);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                throw e1;
            }
        } else
        {
            a(e1, obj);
            return;
        }
_L5:
        i.a(e1, obj);
        return;
    }

    private void a(Object obj, k k1, boolean flag, int i1)
    {
        Object obj1;
        e e1;
        Class class1;
        class1 = k1.a;
        obj1 = (CopyOnWriteArrayList)g.get(class1);
        e1 = new e(obj, k1, i1);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        k1 = new CopyOnWriteArrayList();
        g.put(class1, k1);
_L11:
        int j1;
        j1 = k1.size();
        i1 = 0;
_L9:
        if (i1 > j1) goto _L4; else goto _L3
_L3:
        if (i1 == j1) goto _L6; else goto _L5
_L5:
        int l1;
        int i2;
        l1 = e1.c;
        i2 = ((e)k1.get(i1)).c;
        if (l1 <= i2) goto _L7; else goto _L6
_L6:
        try
        {
            k1.add(i1, e1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
_L4:
        obj1 = (List)s.get(obj);
        k1 = ((k) (obj1));
        if (obj1 == null)
        {
            k1 = new ArrayList();
            s.put(obj, k1);
        }
        k1.add(class1);
        if (flag)
        {
            synchronized (t)
            {
                k1 = ((k) (t.get(class1)));
            }
            if (k1 != null)
            {
                try
                {
                    obj = Looper.getMainLooper();
                    obj1 = Looper.myLooper();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                if (obj == obj1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(e1, k1, flag);
            }
        }
        return;
_L2:
        try
        {
            if (((CopyOnWriteArrayList) (obj1)).contains(e1))
            {
                throw new h((new StringBuilder()).append(z[10]).append(obj.getClass()).append(z[11]).append(class1).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        break; /* Loop/switch isn't completed */
        obj;
        throw obj;
_L7:
        i1++;
        if (true) goto _L9; else goto _L8
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
_L8:
        k1 = ((k) (obj1));
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void a(Object obj, l l1)
    {
        Class class1 = obj.getClass();
        boolean flag;
        if (a)
        {
            List list = b(class1);
            int j1 = list.size();
            int i1 = 0;
            flag = false;
            for (; i1 < j1; i1++)
            {
                flag |= a(obj, l1, (Class)list.get(i1));
            }

        } else
        {
            flag = a(obj, l1, class1);
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        try
        {
            if (c)
            {
                Log.d(m, (new StringBuilder()).append(z[0]).append(class1).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            flag = q;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag || class1 == de/greenrobot/event/o || class1 == de/greenrobot/event/q)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        a(new o(this, obj));
    }

    private void a(Object obj, Class class1)
    {
        int j1;
        boolean flag;
        j1 = 0;
        flag = i.a;
        class1 = (List)g.get(class1);
        if (class1 == null) goto _L2; else goto _L1
_L1:
        int i1 = class1.size();
_L6:
        if (j1 >= i1) goto _L2; else goto _L3
_L3:
label0:
        {
            e e1 = (e)class1.get(j1);
            try
            {
                if (e1.d != obj)
                {
                    break label0;
                }
                e1.a = false;
                class1.remove(j1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            j1--;
            i1--;
        }
        if (!flag) goto _L4; else goto _L2
_L2:
        return;
_L4:
        j1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(Object obj, boolean flag, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.a(obj.getClass()).iterator(); iterator.hasNext(); a(obj, (k)iterator.next(), flag, i1)) { }
        break MISSING_BLOCK_LABEL_55;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
    }

    static void a(List list, Class aclass[])
    {
        int j1 = aclass.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            Class class1 = aclass[i1];
            try
            {
                if (!list.contains(class1))
                {
                    list.add(class1);
                    a(list, class1.getInterfaces());
                }
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list;
            }
            i1++;
        }
    }

    private boolean a(Object obj, l l1, Class class1)
    {
        this;
        JVM INSTR monitorenter ;
        class1 = (CopyOnWriteArrayList)g.get(class1);
        this;
        JVM INSTR monitorexit ;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        e e1;
        boolean flag;
        try
        {
            flag = class1.isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        class1 = class1.iterator();
        if (!class1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = (e)class1.next();
        l1.a = obj;
        l1.f = e1;
        a(e1, obj, l1.d);
        flag = l1.c;
        l1.a = null;
        l1.f = null;
        l1.c = false;
        if (!flag) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_38;
_L1:
        return true;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        l1.a = null;
        l1.f = null;
        l1.c = false;
        throw obj;
        return false;
    }

    private List b(Class class1)
    {
        Map map = r;
        map;
        JVM INSTR monitorenter ;
        Object obj1 = (List)r.get(class1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj1 = new ArrayList();
        obj = class1;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        ((List) (obj1)).add(obj);
        a(((List) (obj1)), ((Class) (obj)).getInterfaces());
        obj = ((Class) (obj)).getSuperclass();
          goto _L1
        r.put(class1, obj1);
        obj = obj1;
        map;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public Object a(Class class1)
    {
        synchronized (t)
        {
            class1 = ((Class) (class1.cast(t.get(class1))));
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    void a(b b1)
    {
        Object obj = b1.c;
        e e1 = b1.d;
        try
        {
            de.greenrobot.event.b.a(b1);
            if (e1.a)
            {
                a(e1, obj);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw b1;
        }
    }

    void a(e e1, Object obj)
    {
        try
        {
            e1.b.b.invoke(e1.d, new Object[] {
                obj
            });
            return;
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            a(e1, obj, invocationtargetexception.getCause());
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new IllegalStateException(z[9], e1);
        }
    }

    public void a(Object obj)
    {
        l l1;
        List list;
        boolean flag = true;
        l1 = (l)j.get();
        list = l1.b;
        Looper looper;
        try
        {
            list.add(obj);
            if (l1.e)
            {
                break MISSING_BLOCK_LABEL_143;
            }
            obj = Looper.getMainLooper();
            looper = Looper.myLooper();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (obj != looper)
        {
            flag = false;
        }
        try
        {
            l1.d = flag;
            l1.e = true;
            if (l1.c)
            {
                throw new h(z[12]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        for (; !list.isEmpty(); a(list.remove(0), l1)) { }
        break MISSING_BLOCK_LABEL_133;
        obj;
        l1.e = false;
        l1.d = false;
        throw obj;
        l1.e = false;
        l1.d = false;
    }

    ExecutorService b()
    {
        return o;
    }

    public void b(Object obj)
    {
        synchronized (t)
        {
            t.put(obj.getClass(), obj);
        }
        a(obj);
        return;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void c(Object obj)
    {
        a(obj, false, 0);
    }

    public void d(Object obj)
    {
        a(obj, true, 0);
    }

    public void e(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        boolean flag;
        flag = i.a;
        obj1 = (List)s.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            a(obj, (Class)((Iterator) (obj1)).next());
        } while (!flag);
        s.remove(obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        Log.w(m, (new StringBuilder()).append(z[1]).append(obj.getClass()).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int i1;
        as = new String[14];
        ac = "4Yd[~\030E'Zb\030S6[+\bS#Ax\016S6MoZP+Z+\037@!F\177Z";
        byte0 = -1;
        i1 = 0;
_L25:
        String as1[];
        int k1;
        int l1;
        as1 = as;
        ac = ac.toCharArray();
        l1 = ac.length;
        k1 = 0;
_L23:
        if (l1 > k1) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 12: default 116
    //                   0 132
    //                   1 148
    //                   2 164
    //                   3 180
    //                   4 196
    //                   5 213
    //                   6 231
    //                   7 249
    //                   8 267
    //                   9 285
    //                   10 303
    //                   11 321
    //                   12 339;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L3:
        as1[i1] = ac;
        ac = ")C&[h\b_&MyZB+\b~\024D!Ob\tB!Z+\rW7\be\025BdZn\035_7\\n\bS \bi\037P+Zn@\026";
        i1 = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[i1] = ac;
        ac = "ZB+\bx\017T7Ky\023T-FlZU(Ix\t\026";
        i1 = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[i1] = ac;
        ac = "ZU%]x\037RdMs\031S4\\b\025XdAeZ";
        i1 = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[i1] = ac;
        i1 = 4;
        ac = "9Y1DoZX+\\+\036_7Xj\016U,\bn\fS*\\1Z";
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[i1] = ac;
        i1 = 5;
        ac = "3X2G`\023X#\bx\017T7Ky\023T!Z+\034W-Dn\036";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        as1[i1] = ac;
        i1 = 6;
        ac = ")C&[h\b_&My?N'M{\016_+FN\fS*\\+\tC&[h\b_&MyZ";
        byte0 = 5;
        break; /* Loop/switch isn't completed */
_L9:
        as1[i1] = ac;
        i1 = 7;
        ac = "ZB,Zn\r\026%F+\037N'M{\016_+F";
        byte0 = 6;
        break; /* Loop/switch isn't completed */
_L10:
        as1[i1] = ac;
        i1 = 8;
        ac = "3X-\\b\033ZdM}\037X0\b";
        byte0 = 7;
        break; /* Loop/switch isn't completed */
_L11:
        as1[i1] = ac;
        i1 = 9;
        ac = "/X!P{\037U0MoZS<Kn\nB-Ge";
        byte0 = 8;
        break; /* Loop/switch isn't completed */
_L12:
        as1[i1] = ac;
        i1 = 10;
        ac = ")C&[h\b_&MyZ";
        byte0 = 9;
        break; /* Loop/switch isn't completed */
_L13:
        as1[i1] = ac;
        ac = "ZW(Zn\033R=\by\037Q-[\177\037D!L+\016YdM}\037X0\b";
        byte0 = 10;
        i1 = 11;
        break; /* Loop/switch isn't completed */
_L14:
        as1[i1] = ac;
        i1 = 12;
        ac = "3X0My\024W(\bn\bD+Z%Zw&Gy\016\0267\\j\016Sd_j\t\026*G\177ZD![n\016";
        byte0 = 11;
        break; /* Loop/switch isn't completed */
_L15:
        as1[i1] = ac;
        i1 = 13;
        ac = "/X/Fd\rXd\\c\bS%L+\027Y M1Z";
        byte0 = 12;
        break; /* Loop/switch isn't completed */
_L16:
        int j1;
        as1[i1] = ac;
        z = as;
        ac = "?@!F\177".toCharArray();
        j1 = ac.length;
        i1 = 0;
          goto _L17
_L2:
        c1 = ac[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 444
    //                   0 467
    //                   1 474
    //                   2 481
    //                   3 488;
           goto _L18 _L19 _L20 _L21 _L22
_L22:
        break MISSING_BLOCK_LABEL_488;
_L18:
        j1 = 11;
_L24:
        ac[k1] = (char)(j1 ^ c1);
        k1++;
          goto _L23
_L19:
        j1 = 122;
          goto _L24
_L20:
        j1 = 54;
          goto _L24
_L21:
        j1 = 68;
          goto _L24
        j1 = 40;
          goto _L24
        if (true) goto _L25; else goto _L2
_L17:
        char c1;
        if (j1 <= i1)
        {
            m = (new String(ac)).intern();
            h = new n();
            r = new HashMap();
            return;
        }
        k1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 536
    //                   0 557
    //                   1 563
    //                   2 569
    //                   3 575;
           goto _L26 _L27 _L28 _L29 _L30
_L30:
        break MISSING_BLOCK_LABEL_575;
_L27:
        break; /* Loop/switch isn't completed */
_L26:
        byte0 = 11;
_L32:
        ac[i1] = (char)(byte0 ^ k1);
        i1++;
        if (true) goto _L17; else goto _L31
_L31:
        byte0 = 122;
          goto _L32
_L28:
        byte0 = 54;
          goto _L32
_L29:
        byte0 = 68;
          goto _L32
        byte0 = 40;
          goto _L32
    }
}
