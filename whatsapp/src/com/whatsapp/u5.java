// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.sqlite.SQLiteDiskIOException;
import com.whatsapp.util.Log;
import com.whatsapp.util.by;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            wg, a31, App, nb, 
//            og, k, aoz, mk, 
//            ij, wv

public class u5
{

    private static final ArrayList a;
    private static final Comparator b;
    private static final wv c;
    private static final String z[];

    public static int a()
    {
        int l;
        synchronized (a)
        {
            l = a.size();
        }
        return l;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static int a(nb nb1)
    {
        return Collections.binarySearch(a, nb1, b);
    }

    private static nb a(String s)
    {
        int l = App.am;
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        nb nb1 = (nb)iterator.next();
        if (nb1.a.equals(s))
        {
            return nb1;
        }
          goto _L3
_L2:
        arraylist;
        JVM INSTR monitorexit ;
        return null;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
_L3:
        if (l == 0) goto _L4; else goto _L2
    }

    public static og a(String s, String s1, long l)
    {
        Log.i(z[0]);
        s = new og(s);
        s.n = s1;
        s.M = Long.toString(l);
        App.az.f(s);
        return s;
    }

    public static void a(String s, String s1, String s2)
    {
        Log.i((new StringBuilder()).append(z[4]).append(s).append(z[3]).append(s1).toString());
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        s2 = a(s);
        s = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        s = new nb(null);
        s.a = s1;
        a.remove(s);
        s.a = s1;
        a.add(0, s);
        arraylist;
        JVM INSTR monitorexit ;
        return;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static int b()
    {
        int l;
        int i1;
        i1 = App.am;
        l = 0;
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L2:
        nb nb1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        nb1 = (nb)iterator.next();
        boolean flag = App.ah.y(nb1.a);
        if (!flag)
        {
            l++;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return l;
        Object obj;
        obj;
        throw obj;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public static boolean b(String s)
    {
        try
        {
            s = a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s != null;
    }

    public static int c()
    {
        int l;
        int i1;
        i1 = App.am;
        l = 0;
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L2:
        nb nb1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        nb1 = (nb)iterator.next();
        boolean flag = App.ah.y(nb1.a);
        if (flag)
        {
            l++;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return l;
        Object obj;
        obj;
        throw obj;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static boolean c(String s)
    {
        return f(s);
    }

    public static og d(String s)
    {
        if (mk.h(s)) goto _L2; else goto _L1
_L1:
        og og1 = App.az.e(s);
        Object obj;
label0:
        {
            obj = og1;
            try
            {
                if (og1.a.equals(s))
                {
                    break label0;
                }
                Log.e((new StringBuilder()).append(z[9]).append(s).append(z[7]).append(og1.a).append(")").toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                try
                {
                    throw s;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    by.a(App.au, 0x7f0e0158);
                }
                throw s;
            }
            obj = og1;
        }
_L4:
        return ((og) (obj));
_L2:
        og1 = App.az.c(s);
        if (og1 == null)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        boolean flag = og1.l();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj = og1.M;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        int l = og1.M.length();
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        flag = og1.p();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        Log.e((new StringBuilder()).append(z[8]).append(og1.a).toString());
        App.w(s);
        obj = og1;
        if (og1.a.equals(s)) goto _L4; else goto _L3
_L3:
        Log.e((new StringBuilder()).append(z[10]).append(s).append(z[6]).append(og1.a).append(")").toString());
        return og1;
        s;
        throw s;
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
        throw s;
        Log.e((new StringBuilder()).append(z[5]).append(s).toString());
        og1 = new og(s);
        App.az.m(og1);
        obj = og1;
        if (og.c(s)) goto _L4; else goto _L5
_L5:
        App.w(s);
        return og1;
        s;
        throw s;
    }

    public static ArrayList d()
    {
        int l = App.am;
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        Iterator iterator;
        arraylist1 = new ArrayList(a.size());
        iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            arraylist1.add(((nb)iterator.next()).a);
        } while (l == 0);
        arraylist;
        JVM INSTR monitorexit ;
        return arraylist1;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static int e(String s)
    {
        return g(s);
    }

    public static String e()
    {
        int l;
        long l1;
        l = App.am;
        l1 = System.currentTimeMillis() / 1000L;
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
_L2:
        long l2 = l1;
        if (!b((new StringBuilder()).append(Long.toString(l1)).append(z[1]).toString()))
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = l1 + 1L;
        l1 = l2;
        if (l == 0) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return (new StringBuilder()).append(Long.toString(l2)).append(z[2]).toString();
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static ArrayList f()
    {
        ArrayList arraylist1;
        int l;
        l = App.am;
        arraylist1 = new ArrayList(a.size());
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L2:
        nb nb1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        nb1 = (nb)iterator.next();
        if (!App.ah.y(nb1.a))
        {
            arraylist1.add(nb1.a);
        }
        if (l == 0) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return arraylist1;
        Object obj;
        obj;
        throw obj;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private static boolean f(String s)
    {
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        nb nb2 = a(s);
        nb nb1;
        nb1 = nb2;
        if (nb2 != null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        nb1 = new nb(null);
        nb1.a = s;
        int l;
        int i1;
        nb1.b = App.ah.r(s);
        l = g(s);
        i1 = a(nb1);
        a.add(-i1 - 1, nb1);
        boolean flag;
        if (-i1 - 1 != l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static int g(String s)
    {
        int l;
        int j1;
        j1 = App.am;
        l = -1;
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = 0;
_L5:
        if (i1 >= a.size()) goto _L2; else goto _L1
_L1:
        if (!((nb)a.get(i1)).a.equals(s)) goto _L4; else goto _L3
_L3:
        a.remove(i1);
        l = i1;
          goto _L4
_L2:
        arraylist;
        JVM INSTR monitorexit ;
        return l;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        i1++;
        if (j1 == 0) goto _L5; else goto _L2
    }

    public static void g()
    {
        App.o.a();
    }

    public static void h()
    {
        synchronized (a)
        {
            a.clear();
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static ArrayList i()
    {
        ArrayList arraylist1;
        int l;
        l = App.am;
        arraylist1 = new ArrayList(a.size());
        ArrayList arraylist = a;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L2:
        nb nb1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        nb1 = (nb)iterator.next();
        if (App.ah.y(nb1.a))
        {
            arraylist1.add(nb1.a);
        }
        if (l == 0) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return arraylist1;
        Object obj;
        obj;
        throw obj;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public static void j()
    {
        App.ah.a(c);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[11];
        obj = "\t\017\034\002[\007\036\b\006A\t\037;*G\034\n\0331";
        byte0 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[l] = ((String) (obj));
                obj = "(\t\n*H\f\b\0316]";
                l = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "(\t\n*H\f\b\0316]";
                l = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                obj = "HFFe";
                l = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                obj = "\013\004\0263L\032\030\0311@\007\005\013(N\032D\n Y\004\n\033 J\007\005\f$J\034Q";
                l = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "\013\004\0263D\017\031W\"L\034\b\027+_\r\031\013$]\001\004\026&F\006\037\031&]G\f\n*\\\030\b\020$]G\b\n H\034\016U&F\006\037\031&]H";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "DK";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                l = 7;
                obj = "DK";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "\013\004\0263L\032\030\0311@\007\005W6L\006\017\037 ]/\031\0270Y!\005\036*\023H";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                l = 9;
                obj = "\013\004\0263D\017\031W\"L\034\b\027+_\r\031\013$]\001\004\026&F\006\037\031&]G\001\021!\t\005\002\013(H\034\b\020e\001";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "\013\004\0263D\017\031W\"L\034\b\027+_\r\031\013$]\001\004\026&F\006\037\031&]G\f\n*\\\030\b\020$]G\001\021!\t\005\002\013(H\034\b\020e\001";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                z = as;
                a = new ArrayList();
                c = new wg();
                b = new a31();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 352
    //                   0 375
    //                   1 382
    //                   2 389
    //                   3 396;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_396;
_L3:
        byte byte1 = 41;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 104;
          goto _L9
_L5:
        byte1 = 107;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 69;
          goto _L9
    }
}
