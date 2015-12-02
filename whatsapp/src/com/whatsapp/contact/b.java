// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Voip;
import com.whatsapp.dh;
import com.whatsapp.ft;
import com.whatsapp.k;
import com.whatsapp.m7;
import com.whatsapp.og;
import com.whatsapp.protocol.cb;
import com.whatsapp.s3;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.whatsapp.contact:
//            i, l, e, n, 
//            j, d, f

public class b
{

    private static final AtomicBoolean a;
    public static boolean b;
    private static final Map c;
    private static final Map d;
    private static final AtomicLong e;
    private static final AtomicLong f;
    private static final ConditionVariable g;
    private static final ConditionVariable h;
    private static final String z[];

    public static long a(Context context)
    {
        long l2 = e.get();
        long l1 = l2;
        if (l2 == -1L)
        {
            e.compareAndSet(-1L, a(context, z[24], 0x51d3440L));
            l1 = e.get();
        }
        return l1;
    }

    private static long a(Context context, String s, long l1)
    {
        Context context1;
        Object obj1;
        Object obj2;
        obj2 = null;
        context1 = null;
        obj1 = null;
        context = new ObjectInputStream(context.openFileInput(s));
        long l2 = context.readLong();
        IOException ioexception;
        l1 = l2;
        l2 = l1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return l1;
            }
            l2 = l1;
        }
        return l2;
        context;
        context = null;
_L8:
        l2 = l1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return l1;
            }
            return l1;
        } else
        {
            break MISSING_BLOCK_LABEL_45;
        }
        context;
        context = obj1;
_L6:
        context1 = context;
        Log.a(z[47], null, new Object[] {
            s
        });
        l2 = l1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return l1;
            }
            return l1;
        } else
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ioexception;
        context = obj2;
_L4:
        context1 = context;
        Log.a(z[48], null, new Object[] {
            ioexception, s
        });
        l2 = l1;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return l1;
            }
            return l1;
        } else
        {
            break MISSING_BLOCK_LABEL_45;
        }
        context;
        s = context1;
_L2:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
        Object obj;
        obj;
        s = context;
        context = ((Context) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static l a(Context context, String s)
    {
        boolean flag = b;
        context = i.c(context);
        Object obj = App.az.e();
        l l1 = new l(null);
        HashSet hashset = App.as();
        Iterator iterator = context.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            e e1 = (e)((List)entry1.getValue()).get(0);
            if (((List)entry1.getValue()).size() <= 1);
            og og1 = (og)((Map) (obj)).get(entry1.getKey());
            if (og1 != null)
            {
                if (og1.a(e1))
                {
                    l1.a(og1);
                    if (!flag)
                    {
                        continue;
                    }
                }
                l1.b(og1);
                if (!flag)
                {
                    continue;
                }
            }
            if (hashset.contains(entry1.getKey()))
            {
                l1.b(new og(e1));
                if (!flag)
                {
                    continue;
                }
            }
            l1.c(new og(e1));
        } while (!flag);
        obj = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (!context.containsKey(entry.getKey()))
            {
                l1.d((og)entry.getValue());
            }
        } while (!flag);
        og.a(l1.i(), (new StringBuilder()).append(s).append(z[54]).toString(), z[49]);
        og.a(l1.j(), (new StringBuilder()).append(s).append(z[56]).toString(), z[50]);
        og.a(l1.a(), (new StringBuilder()).append(s).append(z[51]).toString(), z[53]);
        og.a(l1.h(), (new StringBuilder()).append(s).append(z[52]).toString(), z[55]);
        return l1;
    }

    private static n a(Context context, j j1, boolean flag)
    {
        if (!d()) goto _L2; else goto _L1
_L1:
        Log.i(z[9]);
        context = n.USER_IS_EXPIRED;
_L4:
        return context;
_L2:
        if (!App.i())
        {
            Log.i(z[0]);
            return n.NETWORK_UNAVAILABLE;
        }
        if (!flag && !a())
        {
            Log.i(z[3]);
            return n.IN_PROGRESS;
        }
        if (Voip.h())
        {
            Log.i(z[7]);
            return n.DELAYED;
        }
        long l1 = b(context);
        if (l1 <= System.currentTimeMillis())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        Log.b(z[2], null, new Object[] {
            Long.valueOf(l1)
        });
        j1 = n.DELAYED;
        Log.b(z[5], null, new Object[] {
            Integer.valueOf(c.size())
        });
        c.clear();
        d.clear();
        context = j1;
        if (flag) goto _L4; else goto _L3
_L3:
        context = j1;
        if (c()) goto _L4; else goto _L5
_L5:
        Log.e(z[10]);
        return j1;
        int i1;
        boolean flag1;
        i1 = App.az.a();
        if (!j1.isFullSync())
        {
            break MISSING_BLOCK_LABEL_294;
        }
        flag1 = a(context, j1);
_L8:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        App.ay.a(i1);
        j1 = n.UP_TO_DATE;
        Log.b(z[6], null, new Object[] {
            Integer.valueOf(c.size())
        });
        c.clear();
        d.clear();
        context = j1;
        if (flag) goto _L4; else goto _L6
_L6:
        context = j1;
        if (c()) goto _L4; else goto _L7
_L7:
        Log.e(z[11]);
        return j1;
        flag1 = c(context, j1);
          goto _L8
        j1 = n.FAILED;
        Log.b(z[12], null, new Object[] {
            Integer.valueOf(c.size())
        });
        c.clear();
        d.clear();
        context = j1;
        if (flag) goto _L4; else goto _L9
_L9:
        context = j1;
        if (c()) goto _L4; else goto _L10
_L10:
        Log.e(z[8]);
        return j1;
        context;
        Log.b(z[4], null, new Object[] {
            Integer.valueOf(c.size())
        });
        c.clear();
        d.clear();
        if (!flag && !c())
        {
            Log.e(z[1]);
        }
        throw context;
    }

    private static void a(Context context, long l1, String s)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        context = new ObjectOutputStream(context.openFileOutput(s, 0));
        obj = context;
        context.writeLong(l1);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        context.close();
_L2:
        return;
        context;
        context = null;
_L7:
        obj = context;
        Log.c(z[21], null, new Object[] {
            s
        });
        if (context == null) goto _L2; else goto _L1
_L1:
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        obj;
        context = ((Context) (obj1));
        obj1 = obj;
_L6:
        obj = context;
        Log.a(z[22], null, new Object[] {
            obj1, s
        });
        if (context == null) goto _L2; else goto _L3
_L3:
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
_L5:
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
        context;
        return;
        context;
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
          goto _L6
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
          goto _L7
    }

    public static void a(Context context, String s, int i1, int j1, long l1)
    {
        Log.c(z[45], null, new Object[] {
            s, Integer.valueOf(i1), Integer.valueOf(j1), Long.valueOf(l1)
        });
        if (l1 > 0L)
        {
            l1 = System.currentTimeMillis() + l1;
            f.set(l1);
            a(context, l1, z[44]);
        }
        h.open();
    }

    public static void a(Context context, String s, String s1, long l1)
    {
        boolean flag = b;
        Log.b(z[32], null, new Object[] {
            s, s1, Long.valueOf(l1)
        });
        if (l1 > 0L)
        {
            e.set(l1);
            a(context, l1, z[33]);
        }
        context = App.as();
        s = c.entrySet().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            s1 = (cb)((java.util.Map.Entry)s.next()).getValue();
            if (((cb) (s1)).b == 2)
            {
                context.add(((cb) (s1)).a);
            }
        } while (!flag);
        App.a(context);
        h.open();
        if (DialogToastActivity.g != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            b = flag;
        }
    }

    public static void a(Integer integer, String as[], String as1[])
    {
label0:
        {
            boolean flag = b;
            if (integer != null)
            {
                Log.c(z[36], null, new Object[] {
                    integer
                });
            }
            if (as == null || as1 == null)
            {
                break label0;
            }
            if (as.length == as1.length)
            {
                int i1 = 0;
                do
                {
                    if (i1 >= as.length)
                    {
                        break;
                    }
                    if (!TextUtils.isEmpty(as[i1]) && !TextUtils.isEmpty(as1[i1]))
                    {
                        d.put(as[i1], new d(0L, as1[i1]));
                    }
                    i1++;
                } while (!flag);
                if (!flag)
                {
                    break label0;
                }
            }
            Log.c(z[35], null, new Object[] {
                Integer.valueOf(as.length), Integer.valueOf(as1.length)
            });
        }
        g.open();
    }

    public static void a(String s)
    {
    }

    public static void a(String s, int i1, f af[])
    {
        boolean flag = false;
        boolean flag1 = b;
        Log.b(z[23], null, new Object[] {
            s, Integer.valueOf(i1), Integer.valueOf(af.length)
        });
        int j1 = af.length;
        i1 = ((flag) ? 1 : 0);
        do
        {
            if (i1 >= j1)
            {
                break;
            }
            s = af[i1];
            c.put(s.a().a, s.a());
            i1++;
        } while (!flag1);
    }

    public static void a(String s, long l1, String s1)
    {
        d.put(s, new d(l1, s1));
    }

    private static void a(List list, Collection collection)
    {
        boolean flag = b;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            og og1 = (og)list.next();
            d d1 = (d)d.get(og1.a);
            if (d1 != null && (!TextUtils.equals(d1.b, og1.d) || d1.a != og1.b))
            {
                og1.d = d1.b;
                og1.b = d1.a;
                if (collection != null)
                {
                    collection.add(og1);
                }
            }
        } while (!flag);
    }

    public static boolean a()
    {
        return a.compareAndSet(false, true);
    }

    private static boolean a(Context context, j j1)
    {
        long l1 = System.currentTimeMillis();
        context = a(context, z[27]);
        h.close();
        if (!App.a(j1, c(z[26]), 0, true, context.g(), null))
        {
            synchronized (App.I)
            {
                App.aZ = j.combine(App.aZ, j1);
            }
            return false;
        }
        break MISSING_BLOCK_LABEL_109;
        j1;
        context;
        JVM INSTR monitorexit ;
        try
        {
            throw j1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.a(z[30], context);
        }
        Log.b(z[28], null, new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1)
        });
        return false;
        if (h.block(64000L))
        {
            break MISSING_BLOCK_LABEL_132;
        }
        Log.w(z[31]);
        return false;
        ArrayList arraylist;
        og aog[];
        b(context.i(), ((Collection) (null)));
        b(context.j(), ((Collection) (null)));
        arraylist = new ArrayList();
        b(context.h(), arraylist);
        g.close();
        aog = context.f();
        boolean flag;
        if (aog.length <= 0)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        flag = App.a(aog);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        synchronized (App.I)
        {
            App.aZ = j.combine(App.aZ, j1);
        }
        return false;
        context;
        throw context;
        j1;
        context;
        JVM INSTR monitorexit ;
        throw j1;
        App.b(Arrays.asList(aog));
        if (g.block(64000L))
        {
            break MISSING_BLOCK_LABEL_249;
        }
        Log.w(z[29]);
        return false;
        a(context.i(), ((Collection) (null)));
        a(context.j(), ((Collection) (null)));
        j1 = new ArrayList();
        a(context.h(), ((Collection) (j1)));
        if (!context.i().isEmpty())
        {
            App.az.b(context.i());
        }
        if (!context.j().isEmpty())
        {
            App.az.c(context.j());
        }
        if (!arraylist.isEmpty())
        {
            App.az.c(arraylist);
        }
        if (!j1.isEmpty())
        {
            App.az.c(j1);
        }
        if (!context.a().isEmpty())
        {
            App.az.e(context.a());
        }
        Log.b(z[25], null, new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1)
        });
        if (!context.d())
        {
            break MISSING_BLOCK_LABEL_425;
        }
        flag = arraylist.isEmpty();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        App.S.sendEmptyMessage(1);
        App.x.sendEmptyMessage(0);
        return true;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
    }

    public static boolean a(og og1)
    {
        long l1 = System.currentTimeMillis();
        if (og1.z != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Log.w((new StringBuilder()).append(z[41]).append(og1).toString());
        return false;
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = new ArrayList(1);
        arraylist.add(og1);
        arraylist1 = new ArrayList(1);
        arraylist1.add(og1.z.a());
        h.close();
        if (!App.a(j.INTERACTIVE_DELTA, c(z[42]), 0, true, arraylist1, null))
        {
            return false;
        }
        if (h.block(64000L))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        Log.w(z[39]);
        return false;
        b(arraylist, ((Collection) (null)));
        g.close();
        if (!App.a(new og[] {
    og1
}))
        {
            return false;
        }
        App.c(new String[] {
            og1.a
        });
        if (g.block(64000L))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        Log.w(z[37]);
        return false;
        try
        {
            a(((List) (arraylist)), ((Collection) (null)));
            App.az.c(arraylist);
            Log.b(z[43], null, new Object[] {
                Long.valueOf(System.currentTimeMillis() - l1)
            });
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            Log.a(z[40], og1);
            Log.b(z[38], null, new Object[] {
                Long.valueOf(System.currentTimeMillis() - l1)
            });
            return false;
        }
        return true;
    }

    private static long b(Context context)
    {
        long l2 = f.get();
        long l1 = l2;
        if (l2 == -1L)
        {
            f.compareAndSet(-1L, a(context, z[34], 0L));
            l1 = f.get();
        }
        return l1;
    }

    public static n b(Context context, j j1)
    {
        boolean flag = false;
        long l1 = System.currentTimeMillis();
        n n1 = a(context, j1, false);
        if (j1 == j.REGISTRATION_FULL)
        {
            flag = true;
        }
        ft.a(context, flag, n1, System.currentTimeMillis() - l1);
        return n1;
    }

    public static void b(String s)
    {
        d.put(s, new d(0L, null));
    }

    private static void b(List list, Collection collection)
    {
        boolean flag1 = b;
        list = list.iterator();
label0:
        do
        {
            og og1;
            Object obj;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                og1 = (og)list.next();
                obj = (cb)c.get(og1.z.a());
                if (obj != null)
                {
                    break;
                }
                Log.a(z[20], null, new Object[] {
                    og1.z.a()
                });
            } while (!flag1);
            boolean flag;
            if (((cb) (obj)).b == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = ((cb) (obj)).c;
            if (og1.t != flag || !TextUtils.equals(og1.a, ((CharSequence) (obj))))
            {
                og1.t = flag;
                og1.a = ((String) (obj));
                if (collection != null)
                {
                    collection.add(og1);
                }
            }
        } while (!flag1);
    }

    public static boolean b()
    {
        return a.get();
    }

    private static String c(String s)
    {
        return (new StringBuilder()).append(s).append('_').append(UUID.randomUUID().toString()).toString();
    }

    public static void c(Context context)
    {
        f.set(0L);
        a(context, 0L, z[46]);
    }

    public static boolean c()
    {
        return a.compareAndSet(true, false);
    }

    private static boolean c(Context context, j j1)
    {
        long l1 = System.currentTimeMillis();
        ArrayList arraylist;
        ArrayList arraylist1;
        context = a(context, z[18]);
        arraylist = context.e();
        arraylist1 = context.b();
label0:
        {
            boolean flag;
            try
            {
                if (!arraylist.isEmpty())
                {
                    break label0;
                }
                flag = arraylist1.isEmpty();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                try
                {
                    throw context;
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                try
                {
                    throw context;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.a(z[15], context);
                }
                Log.b(z[16], null, new Object[] {
                    Long.valueOf(System.currentTimeMillis() - l1)
                });
                return false;
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_167;
            }
        }
        h.close();
        flag = App.a(j1, c(z[19]), 0, true, arraylist, arraylist1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        synchronized (App.I)
        {
            App.aZ = j.combine(App.aZ, j1);
        }
        return false;
        j1;
        context;
        JVM INSTR monitorexit ;
        throw j1;
        if (h.block(64000L))
        {
            break MISSING_BLOCK_LABEL_167;
        }
        Log.w(z[17]);
        return false;
        og aog[];
        b(context.i(), ((Collection) (null)));
        g.close();
        aog = context.c();
        boolean flag1;
        if (aog.length <= 0)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        flag1 = App.a(aog);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        synchronized (App.I)
        {
            App.aZ = j.combine(App.aZ, j1);
        }
        return false;
        context;
        throw context;
        j1;
        context;
        JVM INSTR monitorexit ;
        throw j1;
        App.b(Arrays.asList(aog));
        if (g.block(64000L))
        {
            break MISSING_BLOCK_LABEL_260;
        }
        Log.w(z[14]);
        return false;
        a(context.i(), ((Collection) (null)));
        if (!context.i().isEmpty())
        {
            App.az.b(context.i());
        }
        if (!context.j().isEmpty())
        {
            App.az.c(context.j());
        }
        if (!context.a().isEmpty())
        {
            App.az.e(context.a());
        }
        Log.b(z[13], null, new Object[] {
            Long.valueOf(System.currentTimeMillis() - l1)
        });
        if (!context.d())
        {
            App.S.sendEmptyMessage(1);
        }
        App.x.sendEmptyMessage(0);
        return true;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
    }

    public static n d(Context context, j j1)
    {
        boolean flag = true;
        long l1 = System.currentTimeMillis();
        n n1 = a(context, j1, true);
        if (j1 != j.REGISTRATION_FULL)
        {
            flag = false;
        }
        ft.a(context, flag, n1, System.currentTimeMillis() - l1);
        return n1;
    }

    private static boolean d()
    {
        return m7.a(true) == 0;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[57];
        obj = "C\001\022x\fC\023\025k\f^\035\blLB\023#nMQ\016\035rOQ\032\020~";
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
                obj = "C\001\022x\fR\r\0334PI\026\037DE\\\031\033DB\\\f\031iFT'\013sJ\\\035#hZ^\033#rMo\b\016tDB\035\017h";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "C\001\022x\fC\023\025k\fR\031\037pLV\036\\>G";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "C\001\022x\fC\023\025k\fQ\024\016~BT\001#rMo\b\016tDB\035\017h";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "C\001\022x\fC\021\006~\003\025\034";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "C\001\022x\fC\021\006~\003\025\034";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "C\001\022x\fC\021\006~\003\025\034";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "C\001\022x\fC\023\025k\fF\027\025k|S\031\020w";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "C\001\022x\fR\r\0334PI\026\037DE\\\031\033DB\\\f\031iFT'\013sJ\\\035#hZ^\033#rMo\b\016tDB\035\017h";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "C\001\022x\fC\023\025k\fU\000\frQU\034";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "C\001\022x\fR\r\0334PI\026\037DE\\\031\033DB\\\f\031iFT'\013sJ\\\035#hZ^\033#rMo\b\016tDB\035\017h";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "C\001\022x\fR\r\0334PI\026\037DE\\\031\033DB\\\f\031iFT'\013sJ\\\035#hZ^\033#rMo\b\016tDB\035\017h";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "C\001\022x\fC\021\006~\003\025\034";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "C\001\022x\fC\001\022x|T\035\020oB\037\f\025vF\037]\030";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "C\001\022x\fC\001\022x|T\035\020oB\037\013\bzWE\013#iF@\024\005DWY\025\031tVD";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "C\001\022x\fC\001\022x|T\035\020oB\037\035\016iLB";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "C\001\022x\fC\001\022x|T\035\020oB\037\f\025vF\037]\030;\013U\n\016tQ\031";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "C\001\022x\fC\001\022x|T\035\020oB\037\013\005u@o\n\031kOI'\brNU\027\to";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "C\001\022x\fC\001\022x|T\035\020oB\037";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "C\001\022x|C\021\030DGU\024\bz";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "C\001\022x\fC\001\022x|Q\024\0204NY\013\017rMW'\016~P@\027\022hF\037]\017";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "V\021\020~\003\025\013\\uLDX\032tV^\034\\}LBX\013iJD\021\022|\r\020\031\fk\003T\021\016~@D\027\016b\003^\027\b;TB\021\bzA\\\035C:\034\021G";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "y79c@U\b\brL^XYh\003G\n\025oJ^\037\\oL\020]\017";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "C\001\022x\fB\035\017nODX\017rG\r]\017;J^\034\031c\036\025\034\\nPU\n\017D@_\r\022o\036\025\034";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "V\r\020w|C\001\022x|G\031\025o";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "C\001\022x\fC\001\022x|Q\024\0204WY\025\0314\006T";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "C\001\022x|C\021\030DEE\024\020";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                obj = "C\001\022x\fC\001\022x|Q\024\0204";
                byte0 = 26;
                i1 = 27;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "C\001\022x\fC\001\022x|Q\024\0204WY\025\0314\006TXT~QB\027\0162";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "C\001\022x\fC\001\022x|Q\024\0204PD\031\bnPo\n\031kOI'\brNU\027\to";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "C\001\022x\fC\001\022x|Q\024\0204FB\n\023i";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "C\001\022x\fC\001\022x|Q\024\0204PI\026\037DQU\b\020b|D\021\021~LE\f";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "C\001\022x\fS\027\021kOU\f\031;PY\034A>P\020\016\031iPY\027\022&\006CX\013zJDEY\177";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "V\r\020w|C\001\022x|G\031\025o";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "C\001\022x|R\031\037pLV\036";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                obj = "C\001\022x\fC\f\035oVCU\016~P@\027\022hF\035\033\023vS\\\035\b~\fZ\021\030h\016C\f\035oVC\035\017;NY\013\021zWS\020\\qJT\013_&\006TX\017oBD\r\017~P\023EY\177";
                byte0 = 34;
                i1 = 35;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "C\001\022x\fC\f\035oVCU\016~P@\027\022hF\035\033\023vS\\\035\b~\003U\n\016tQ\r]\030";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "C\001\022x\fC\001\022x|C\021\022|OU'\037tMD\031\037o\fC\f\035oVC'\016~S\\\001#oJ]\035\023nW";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "C\001\022x\fC\001\022x|C\021\022|OU'\037tMD\031\037o\fD\021\021~\f\025\034\\3FB\n\023i\n";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "C\001\022x\fC\001\022x|C\021\022|OU'\037tMD\031\037o\fC\001\022x|B\035\fwZo\f\025vF_\r\b";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "C\001\022x\fC\001\022x|C\021\022|OU'\037tMD\031\037o\fU\n\016tQ";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "C\001\022x\fC\001\022x|C\021\022|OU'\037tMD\031\037o\f^\r\020w|[\035\005;";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "C\001\022x|C\021\030DPY\026\033wFo\033\023uWQ\033\b";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "C\001\022x\fC\001\022x|C\021\022|OU'\037tMD\031\037o\fD\021\021~\f\025\034";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "C\001\022x|R\031\037pLV\036";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "C\001\022x\fU\n\016tQ\020\013\025\177\036\025\013\\rMT\035\004&\006TX\037tGUEY\177\003R\031\037pLV\036A>G";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "C\001\022x|R\031\037pLV\036";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "S\027\016iV@\f\\}J\\\035\\>P\034X\016~WE\n\022rMWX\030~EQ\r\020o\003\\\031\017o\003G\031\025o\003D\021\021~";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                obj = "y79c@U\b\brL^XYh\003B\035\035\177J^\037\\}Q_\025\\>P\034X\016~WE\n\022rMWX\030~EQ\r\020o\003\\\031\017o\003G\031\025o\003D\021\021~";
                byte0 = 47;
                i1 = 48;
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "Q\034\030";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "E\b\030zWU";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "B\035\021tUU";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "E\026\037sB^\037\031\177";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "B\035\021tUU";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "Q\034\030";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "E\026\037sB^\037\031\177";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "E\b\030zWU";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                z = as;
                a = new AtomicBoolean(false);
                h = new ConditionVariable();
                c = new HashMap();
                g = new ConditionVariable();
                d = new HashMap();
                f = new AtomicLong(-1L);
                e = new AtomicLong(-1L);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1412
    //                   0 1435
    //                   1 1442
    //                   2 1449
    //                   3 1456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1456;
_L3:
        byte byte1 = 35;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 48;
          goto _L9
_L5:
        byte1 = 120;
          goto _L9
_L6:
        byte1 = 124;
          goto _L9
        byte1 = 27;
          goto _L9
    }
}
