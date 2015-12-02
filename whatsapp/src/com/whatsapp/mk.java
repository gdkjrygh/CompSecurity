// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cf;
import com.whatsapp.protocol.cp;
import com.whatsapp.util.Log;
import com.whatsapp.util.a3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            a9k, k4, ab1, App, 
//            k, oh, og, as_, 
//            u5, sk, asw, aoz, 
//            a1e, rr

public class mk
    implements cp
{

    private static final int a[];
    private static ConcurrentHashMap b;
    public static Handler c;
    public static boolean d;
    private static final ConcurrentHashMap e;
    public static boolean f;
    private static final String z[];

    public mk()
    {
    }

    public static k4 a(String s)
    {
        ConcurrentHashMap concurrenthashmap = e;
        concurrenthashmap;
        JVM INSTR monitorenter ;
        k4 k4_2 = (k4)e.get(s);
        k4 k4_1;
        k4_1 = k4_2;
        if (k4_2 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        k4_1 = new k4(s);
        k4_1.c();
        e.put(s, k4_1);
        concurrenthashmap;
        JVM INSTR monitorexit ;
        return k4_1;
        s;
        concurrenthashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static c4 a(int j, b3 b3_1, String s, String s1)
    {
label0:
        {
            Log.i((new StringBuilder()).append(z[0]).append(j).append("/").append(b3_1).append("/").append(s).toString());
            if (b3_1 != null)
            {
                b3_1 = new ab1(b3_1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b3_1 = new c4(s, (byte[])null, null);
        }
        b3_1.M = 6;
        b3_1.t = j;
        b3_1.G = s1;
        b3_1.I = App.U();
        if (j == 4 && s1 != null && s1.equals(App.az.f().a))
        {
            b3_1.H = 1;
        }
        return b3_1;
    }

    static c4 a(int j, b3 b3_1, String s, String s1, Vector vector)
    {
        return b(j, b3_1, s, s1, vector);
    }

    static c4 a(int j, b3 b3_1, String s, String s1, Vector vector, k4 k4_1)
    {
        return b(j, b3_1, s, s1, vector, k4_1);
    }

    private static c4 a(b3 b3_1, String s, String s1, String s2, long l)
    {
label0:
        {
            if (b3_1 != null)
            {
                b3_1 = new ab1(b3_1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b3_1 = new c4(s, (byte[])null, null);
        }
        b3_1.a(s1);
        b3_1.M = 6;
        b3_1.t = 11L;
        b3_1.G = s2;
        b3_1.I = l;
        return b3_1;
    }

    private static c4 a(String s, String s1, String s2)
    {
        s = new c4(s, (byte[])null, null);
        s.M = 6;
        s.t = 10L;
        s.G = s1;
        s.B = s2;
        s.I = App.U();
        return s;
    }

    public static c4 a(String s, String s1, Vector vector, int j)
    {
        s = new c4(s, s1, null);
        s.I = App.U();
        s.M = 6;
        s.t = j;
        s.B = vector;
        return s;
    }

    public static String a(ArrayList arraylist)
    {
        int j = App.am;
        StringBuilder stringbuilder = new StringBuilder();
        String s = Locale.getDefault().getLanguage();
        char c1;
        if (z[69].equals(s) || z[71].equals(s) || z[70].equals(s))
        {
            c1 = '\u060C';
        } else
        {
            c1 = ',';
        }
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            String s1 = (String)arraylist.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(c1);
                stringbuilder.append(' ');
            }
            stringbuilder.append(s1);
        } while (j == 0);
        return stringbuilder.toString();
    }

    public static String a(Vector vector)
    {
        Object obj;
        boolean flag1;
        int j;
label0:
        {
            j = App.am;
            obj = new ArrayList();
            vector = vector.iterator();
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (!vector.hasNext())
                {
                    break label0;
                }
                Object obj1 = (String)vector.next();
                flag1 = flag;
                if (App.az.d(((String) (obj1))))
                {
                    flag = true;
                    flag1 = true;
                    if (j == 0)
                    {
                        continue;
                    }
                }
                obj1 = App.az.e(((String) (obj1)));
                flag = flag1;
                if (!((ArrayList) (obj)).contains(obj1))
                {
                    ((ArrayList) (obj)).add(obj1);
                    flag = flag1;
                }
            } while (j == 0);
            flag1 = flag;
        }
        vector = new ArrayList();
        ArrayList arraylist = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            og og1 = (og)((Iterator) (obj)).next();
            String s = og1.a(App.au);
            if (s == null)
            {
                continue;
            }
            if (s.equals(og1.a()))
            {
                arraylist.add(s);
                if (j == 0)
                {
                    continue;
                }
            }
            vector.add(s);
        } while (j == 0);
        Collections.sort(vector);
        Collections.sort(arraylist);
        vector.addAll(arraylist);
        if (flag1)
        {
            vector.add(App.au.getString(0x7f0e04b8));
        }
        return a(((ArrayList) (vector)));
    }

    public static void a(int j, Object obj)
    {
        c.sendMessage(c.obtainMessage(j, obj));
    }

    public static void a(String s, String s1)
    {
        a(s).a(s1, false, false);
        b.remove(s);
        a(1, a(4, ((b3) (null)), s, s1));
    }

    public static void a(String s, Vector vector)
    {
        int j = App.am;
        s = a(s);
        vector = vector.iterator();
        do
        {
            if (!vector.hasNext())
            {
                break;
            }
            s.a((String)vector.next(), false, true);
        } while (j == 0);
    }

    public static void a(boolean flag)
    {
        Log.i((new StringBuilder()).append(z[61]).append(flag).toString());
        android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(z[60], 0).edit();
        editor.putBoolean(z[62], flag);
        if (!editor.commit())
        {
            Log.e(z[63]);
        }
    }

    public static boolean a()
    {
        return App.au.getSharedPreferences(z[46], 0).getBoolean(z[47], true);
    }

    public static boolean a(c4 c4_1)
    {
        return c4_1.M == 6 && (c4_1.t == 1L && !c4_1.G.contains(App.k()) || c4_1.t == 4L && c4_1.H == 1 || c4_1.t == 12L && c4_1.H == 1);
    }

    private static c4 b(int j, b3 b3_1, String s, String s1, Vector vector)
    {
        return b(j, b3_1, s, s1, vector, null);
    }

    private static c4 b(int j, b3 b3_1, String s, String s1, Vector vector, k4 k4_1)
    {
        Object obj;
label0:
        {
            obj = null;
            Log.i((new StringBuilder()).append(z[1]).append(j).append("/").append(b3_1).append("/").append(s).append("/").append(s1).append("/").append(Arrays.deepToString(vector.toArray())).toString());
            if (b3_1 != null)
            {
                b3_1 = new ab1(b3_1, k4_1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b3_1 = new c4(s, (byte[])null, null);
        }
        b3_1.M = 6;
        b3_1.t = j;
        if (TextUtils.isEmpty(s1))
        {
            s = obj;
        } else
        {
            s = s1;
        }
        b3_1.G = s;
        b3_1.B = vector;
        b3_1.I = App.U();
        if (j == 12 && vector != null && vector.contains(App.az.f().a))
        {
            b3_1.H = 1;
        }
        return b3_1;
    }

    private static c4 b(b3 b3_1, String s, String s1, String s2, long l)
    {
label0:
        {
            if (b3_1 != null)
            {
                b3_1 = new ab1(b3_1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b3_1 = new c4(s, (byte[])null, null);
        }
        b3_1.a(s1);
        b3_1.M = 6;
        b3_1.t = 1L;
        b3_1.G = s2;
        b3_1.I = l;
        return b3_1;
    }

    public static cf b(c4 c4_1)
    {
        cf cf1;
        int j;
        j = App.am;
        if (c4_1.M != 6)
        {
            return null;
        }
        cf1 = new cf();
        cf1.s = c4_1.y.c;
        cf1.i = c4_1.I;
        cf1.r = c4_1.y.a;
        (int)c4_1.t;
        JVM INSTR tableswitch 1 17: default 140
    //                   1 186
    //                   2 140
    //                   3 140
    //                   4 212
    //                   5 388
    //                   6 507
    //                   7 300
    //                   8 140
    //                   9 577
    //                   10 533
    //                   11 144
    //                   12 272
    //                   13 421
    //                   14 360
    //                   15 450
    //                   16 478
    //                   17 169;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        c4_1 = null;
_L17:
        return c4_1;
_L9:
        cf1.m = 1;
        cf1.d = c4_1.e();
        cf1.f = c4_1.G;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L15:
        cf1.m = 2;
        cf1.f = c4_1.G;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L2:
        cf1.m = 10;
        cf1.d = c4_1.e();
        cf1.f = c4_1.G;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        if (og.e(cf1.r))
        {
            cf1.m = 12;
            cf1.f = c4_1.G;
            if (j == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        cf1.m = 3;
        cf1.h = new Vector();
        cf1.h.add(c4_1.G);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        cf1.m = 3;
        cf1.f = c4_1.G;
        cf1.h = (Vector)c4_1.B;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        if (og.e(cf1.r))
        {
            cf1.m = 13;
            cf1.f = c4_1.G;
            if (j == 0)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        cf1.m = 4;
        cf1.h = new Vector();
        cf1.h.add(c4_1.G);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L12:
        cf1.m = 4;
        cf1.f = c4_1.G;
        cf1.h = (Vector)c4_1.B;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        cf1.m = 7;
        cf1.h = new Vector();
        cf1.h.add(c4_1.G);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L11:
        cf1.m = 7;
        cf1.f = c4_1.G;
        cf1.h = (Vector)c4_1.B;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L13:
        cf1.m = 5;
        cf1.f = c4_1.G;
        cf1.h = (Vector)c4_1.B;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L14:
        cf1.m = 6;
        cf1.f = c4_1.G;
        cf1.h = (Vector)c4_1.B;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        cf1.m = 8;
        cf1.d = c4_1.e();
        cf1.f = c4_1.G;
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L8:
        cf1.m = 9;
        cf1.f = c4_1.G;
        cf1.h = new Vector();
        cf1.h.add((String)c4_1.B);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        cf1.m = 11;
        cf1.j = ((Vector)c4_1.B).size();
        cf1.f = c4_1.G;
        if (j != 0) goto _L1; else goto _L16
_L16:
        c4_1 = cf1;
          goto _L17
        if (true) goto _L1; else goto _L18
_L18:
    }

    public static String b(String s)
    {
        Object obj;
        boolean flag1;
        int j;
label0:
        {
            j = App.am;
            obj = (String)b.get(s);
            if (obj != null)
            {
                return ((String) (obj));
            }
            obj = new ArrayList();
            Iterator iterator = a(s).i().iterator();
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                Object obj1 = (as_)iterator.next();
                flag1 = flag;
                if (App.az.d(((as_) (obj1)).b))
                {
                    flag = true;
                    flag1 = true;
                    if (j == 0)
                    {
                        continue;
                    }
                }
                obj1 = App.az.e(((as_) (obj1)).b);
                flag = flag1;
                if (!((ArrayList) (obj)).contains(obj1))
                {
                    ((ArrayList) (obj)).add(obj1);
                    flag = flag1;
                }
            } while (j == 0);
            flag1 = flag;
        }
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            og og1 = (og)((Iterator) (obj)).next();
            String s1 = og1.z();
            if (s1 == null)
            {
                continue;
            }
            if (s1.equals(og1.a()))
            {
                arraylist1.add(s1);
                if (j == 0)
                {
                    continue;
                }
            }
            arraylist.add(s1);
        } while (j == 0);
        Collections.sort(arraylist);
        Collections.sort(arraylist1);
        arraylist.addAll(arraylist1);
        if (flag1)
        {
            arraylist.add(App.au.getString(0x7f0e04b8));
        }
        obj = a(arraylist);
        b.put(s, obj);
        return ((String) (obj));
    }

    public static void b()
    {
        int l = App.am;
        oh oh1 = App.az.f();
        if (oh1 != null)
        {
            SharedPreferences sharedpreferences = App.au.getSharedPreferences(z[6], 0);
            ArrayList arraylist = new ArrayList();
            Iterator iterator = u5.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if ((h(s1) || og.e(s1)) && (sharedpreferences.contains((new StringBuilder()).append(z[11]).append(s1).toString()) || sharedpreferences.contains((new StringBuilder()).append(z[9]).append(s1).toString())))
                {
                    Object obj = sharedpreferences.getString((new StringBuilder()).append(z[7]).append(s1).toString(), "");
                    String s2 = sharedpreferences.getString((new StringBuilder()).append(z[10]).append(s1).toString(), "");
                    Log.i((new StringBuilder()).append(z[8]).append(s1).toString());
                    og og1 = App.az.f(s1);
                    String s;
                    String as[];
                    String as1[];
                    int j;
                    int i1;
                    if (og1 == null)
                    {
                        s = null;
                    } else
                    {
                        s = og1.u();
                    }
                    as1 = ((String) (obj)).split(",");
                    obj = new k4(s1);
                    i1 = as1.length;
                    j = 0;
                    do
                    {
                        if (j >= i1)
                        {
                            break;
                        }
                        String s4 = as1[j];
                        if (s4.length() > 0)
                        {
                            ((k4) (obj)).a(s4, s4.equals(s), false);
                        }
                        j++;
                    } while (l == 0);
                    as = s2.split(",");
                    i1 = as.length;
                    j = 0;
                    do
                    {
                        if (j >= i1)
                        {
                            break;
                        }
                        String s3 = as[j];
                        if (s3.length() > 0)
                        {
                            ((k4) (obj)).a(s3, false, true);
                        }
                        j++;
                    } while (l == 0);
                    if (h(s1) && og1 != null && og1.t)
                    {
                        ((k4) (obj)).a(((og) (oh1)).a, ((og) (oh1)).a.equals(s), false);
                    }
                    arraylist.add(obj);
                    if (((k4) (obj)).g() > 0)
                    {
                        e.put(s1, obj);
                    }
                }
            } while (l == 0);
            if (!arraylist.isEmpty())
            {
                com.whatsapp.asw.a(new sk(arraylist, sharedpreferences), new Void[0]);
                return;
            }
        }
    }

    public static boolean b(String s, String s1)
    {
        s = c(s, s1);
        return s != null && ((as_) (s)).d;
    }

    public static as_ c(String s, String s1)
    {
        return a(s).b(s1);
    }

    private void c(String s, String s1, long l, String s2, long l1, 
            String s3, String s4, long l2, Hashtable hashtable)
    {
label0:
        {
            int j = App.am;
            boolean flag;
            if (!App.ah.v(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                a(0, a(((b3) (null)), s, s2, s1, l1));
                if (App.az.d(s1))
                {
                    break label0;
                }
                s3 = new c4(s, (byte[])null, null);
                s3.M = 6;
                s3.t = 4L;
                s3.G = App.az.f().a;
                s3.I = l1;
                a(1, s3);
                if (j == 0)
                {
                    break label0;
                }
            }
            App.ah.a(s, s2, l);
        }
label1:
        {
            if (a(s).a(hashtable, false))
            {
                b.remove(s);
            }
            s3 = App.az.e(s);
            s3.n = s2;
            s3.M = Long.toString(l);
            s3.p = s1;
            App.az.o(s3);
            if (!e.containsKey(s))
            {
                com.whatsapp.App.a(s, 0, 2);
            }
            if (l2 == 0L)
            {
                a1e.g.c(s);
                if (j == 0)
                {
                    break label1;
                }
            }
            if (l2 == -1L)
            {
                a1e.g.a(s, 0L);
                if (j == 0)
                {
                    break label1;
                }
            }
            a1e.g.a(s, l2);
        }
    }

    public static boolean c(String s)
    {
        return a(s).f();
    }

    public static String d()
    {
        return (new StringBuilder()).append(App.k()).append("-").append(z[14]).toString();
    }

    public static String d(String s)
    {
        return (new StringBuilder()).append(App.k()).append("-").append(s).append(z[16]).toString();
    }

    public static void d(String s, String s1)
    {
        a(s).a(s1);
        b.remove(s);
        a(1, a(7, ((b3) (null)), s, s1));
    }

    public static boolean e(String s)
    {
        return a(s).j();
    }

    static int[] e()
    {
        return a;
    }

    public static void f()
    {
        Log.i(z[17]);
        App.ah.g(a(d(), ((String) (null)), ((Vector) (null)), -1));
    }

    public static boolean f(String s)
    {
        int j = App.am;
        s = a(s).d().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            Object obj = (as_)s.next();
            if (!((as_) (obj)).a())
            {
                obj = App.az.f(((as_) (obj)).b);
                if (obj != null && ((og) (obj)).z != null)
                {
                    return true;
                }
            }
        } while (j == 0);
        return false;
    }

    public static c4 g(String s)
    {
        s = new c4(s, (byte[])null, null);
        s.I = App.U();
        s.M = 6;
        s.t = 8L;
        return s;
    }

    public static void g()
    {
        App.ah.g(a(d(), ((String) (null)), ((Vector) (null)), -2));
    }

    public static void h()
    {
        Log.i(z[59]);
        f = false;
        g();
    }

    public static boolean h(String s)
    {
        return s.contains("-");
    }

    public static boolean i(String s)
    {
        return s.endsWith(z[65]);
    }

    public void a()
    {
        Log.i(z[15]);
        com.whatsapp.App.a(App.au, false);
    }

    public void a(b3 b3_1)
    {
    }

    public void a(b3 b3_1, String s)
    {
label0:
        {
            int j = App.am;
            Log.i((new StringBuilder()).append(z[13]).append(b3_1).toString());
            if (e.containsKey(b3_1.a))
            {
                s = a(b3_1.a);
                s.a(App.az.f().a);
                s = s.i().iterator();
                do
                {
                    if (!s.hasNext())
                    {
                        break;
                    }
                    ((as_)s.next()).d = false;
                } while (j == 0);
                a(1, a(17, b3_1, b3_1.a, b3_1.e));
                if (j == 0)
                {
                    break label0;
                }
            }
            com.whatsapp.App.a(b3_1);
        }
    }

    public void a(b3 b3_1, String s, String s1, int j)
    {
label0:
        {
            int l = App.am;
            Log.i((new StringBuilder()).append(z[74]).append(b3_1).append("/").append(s).append("/").append(s1).append("/").append((long)j * 1000L).toString());
            String s2 = b3_1.a;
            Object obj = App.az.c(s2);
            if (obj != null)
            {
                if (!((og) (obj)).a(App.au).equals(s))
                {
                    Log.i(z[76]);
                    App.az.a(s2, s1, s);
                    a(3, b(b3_1, s2, s, s1, (long)j * 1000L));
                    if (l == 0)
                    {
                        break label0;
                    }
                }
                Log.i(z[77]);
                com.whatsapp.App.a(b3_1);
                if (l == 0)
                {
                    break label0;
                }
            }
            Log.i(z[73]);
            obj = new k4(s2);
            com.whatsapp.u5.a(s2, s, (long)j * 1000L);
            ((k4) (obj)).a((new StringBuilder()).append(s2.substring(0, s2.indexOf("-"))).append(z[75]).toString(), true, false);
            e.put(s2, obj);
            a(0, a(b3_1, s2, s, s1, (long)j * 1000L));
            App.w(s2);
        }
    }

    public void a(b3 b3_1, String s, String s1, String s2)
    {
        int j = 0;
        Log.i((new StringBuilder()).append(z[5]).append(b3_1).append(z[2]).append(s).append(z[3]).append(s1).toString());
        s2 = b3_1.a;
        og og1 = App.az.c(s2);
        Object obj = a(s2);
        as_ as_1 = ((k4) (obj)).b(s);
        ((k4) (obj)).a(s);
        boolean flag;
        if (as_1 == null)
        {
            flag = false;
        } else
        {
            flag = as_1.d;
        }
        ((k4) (obj)).a(s1, flag, false);
        if (og1 == null || !((k4) (obj)).f() || as_1 == null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(z[4]);
            if (og1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            stringbuilder = stringbuilder.append(flag).append("/");
            if (!((k4) (obj)).f())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = stringbuilder.append(flag).append("/");
            if (as_1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.i(((StringBuilder) (obj)).append(flag).toString());
            App.w(s2);
            if (og1 != null)
            {
                j = og1.q;
            }
            com.whatsapp.App.a(s2, j, 2);
        }
        a(1, a(b3_1.a, s, s1));
        com.whatsapp.App.a(b3_1);
    }

    public void a(b3 b3_1, String s, String s1, String s2, String s3, long l, 
            String s4, long l1, String s5, String s6, Hashtable hashtable, String s7)
    {
label0:
        {
            int j = App.am;
            Log.i((new StringBuilder()).append(z[33]).append(b3_1).append("/").append(s3).append("/").append(l).append("/").append(s4).append("/").append(s5).append("/").append(l1).append("/").append(s6).toString());
            Log.i((new StringBuilder()).append(z[30]).append(Arrays.deepToString(Collections.list(hashtable.keys()).toArray())).append("/").append(Arrays.deepToString(hashtable.values().toArray())).toString());
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (!App.ah.v(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (App.az.d(s3) && App.az.d(b3_1.e))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!hashtable.containsKey(b3_1.e))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Log.i((new StringBuilder()).append(z[34]).append(flag).append(z[32]).append(flag1).append(z[35]).append(flag2).toString());
            if (flag1)
            {
                s1 = d(s4);
                if (App.ah.v(s1))
                {
                    e.remove(s1);
                    App.ah.d(s1, s);
                    App.az.a(App.az.e(s1), s, s4, l1);
                    com.whatsapp.u5.a(s1, s, s4);
                }
                if (j == 0)
                {
                    break label0;
                }
            }
            s1 = App.az.f(s);
            if (s1 == null)
            {
                com.whatsapp.u5.a(s, s4, l1);
                if (j == 0)
                {
                    break label0;
                }
            }
            com.whatsapp.App.a(s, ((og) (s1)).q, 2);
            if (!s1.a(App.au).equals(s4))
            {
                Log.i(z[36]);
                App.az.a(s, s5, s4);
                App.ah.c(s, s4);
            }
        }
label1:
        {
            s1 = a(s);
            Log.i((new StringBuilder()).append(z[29]).append(Arrays.deepToString((new ArrayList(s1.b())).toArray())).toString());
            flag3 = s1.f();
            s1.a(hashtable, false);
            b.remove(s);
            if (flag)
            {
                a(0, a(b3_1, s, s4, s3, l1));
            }
            if (hashtable.containsKey(App.az.f().a) && !flag1 && !flag3 && !flag2)
            {
                Log.i((new StringBuilder()).append(z[31]).append(App.az.f().a).toString());
                s2 = new Vector(1);
                s2.add(App.az.f().a);
                if (flag)
                {
                    s1 = null;
                } else
                {
                    s1 = b3_1;
                }
                a(1, b(12, s1, s, b3_1.e, s2));
                if (j == 0)
                {
                    break label1;
                }
            }
            if (!flag)
            {
                com.whatsapp.App.a(b3_1);
            }
        }
    }

    public void a(b3 b3_1, Hashtable hashtable, String s)
    {
label0:
        {
            int l = App.am;
            Log.i((new StringBuilder()).append(z[67]).append(b3_1).append("/").append(Arrays.deepToString(hashtable.values().toArray())).toString());
            s = b3_1.a;
            b.remove(s);
            String s1 = App.az.f().a;
            Object obj = App.az.c(s);
            k4 k4_1 = a(s);
            if (obj == null || !k4_1.f() && !hashtable.containsKey(s1))
            {
                Log.i(z[66]);
                App.w(s);
                Vector vector;
                Object obj1;
                int j;
                if (obj == null)
                {
                    j = 0;
                } else
                {
                    j = ((og) (obj)).q;
                }
                com.whatsapp.App.a(s, j, 2);
                com.whatsapp.App.a(b3_1);
                if (l == 0)
                {
                    break label0;
                }
            }
            vector = new Vector();
            hashtable = hashtable.entrySet().iterator();
            do
            {
                if (!hashtable.hasNext())
                {
                    break;
                }
                obj1 = (java.util.Map.Entry)hashtable.next();
                obj = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
                vector.add(obj);
                k4_1.a(((String) (obj)), z[68].equals(obj1), false);
            } while (l == 0);
            hashtable = b3_1.e;
            if (TextUtils.isEmpty(hashtable))
            {
                obj = k4_1.d();
                if (((ArrayList) (obj)).size() == 1)
                {
                    hashtable = ((as_)((ArrayList) (obj)).get(0)).b;
                }
            }
            a(1, b(12, b3_1, s, hashtable, vector, k4_1));
        }
    }

    public void a(b3 b3_1, Vector vector, String s)
    {
        int j = App.am;
        Log.i((new StringBuilder()).append(z[57]).append(b3_1).append("/").append(Arrays.deepToString(vector.toArray())).toString());
        String s2 = b3_1.a;
        k4 k4_1 = a(s2);
        Iterator iterator = vector.iterator();
        boolean flag = false;
label0:
        do
        {
            String s1;
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s1 = (String)iterator.next();
                s = k4_1.b(s1);
                if (s == null)
                {
                    s = k4_1.a(s1, true, false);
                    s1 = s;
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                s.d = true;
                s1 = s;
            }
            if (s1.a())
            {
                flag = true;
            }
            App.ah.a(s2, s1);
        } while (j == 0);
label2:
        {
            if (flag)
            {
                a(1, b(15, b3_1, s2, b3_1.e, vector));
                if (j == 0)
                {
                    break label2;
                }
            }
            com.whatsapp.App.a(b3_1);
            a(4, s2);
        }
    }

    public void a(b3 b3_1, Vector vector, String s, String s1, String s2)
    {
label0:
        {
            int j = 0;
            int l = App.am;
            Log.i((new StringBuilder()).append(z[19]).append(b3_1).append(z[21]).append(Arrays.deepToString(vector.toArray())).append(z[18]).append(s).toString());
            s2 = b3_1.a;
            b.remove(s2);
            String s3 = App.az.f().a;
            og og1 = App.az.c(s2);
            if ((s == null || s.equals(s3)) && vector.size() == 1 && vector.get(0).equals(s3))
            {
                Log.i(z[22]);
                com.whatsapp.App.a(b3_1);
                if (l == 0)
                {
                    break label0;
                }
            }
            if (og1 == null || !a(s2).f())
            {
                Log.i(z[20]);
                App.w(s2);
                k4 k4_1;
                Vector vector1;
                String s4;
                if (og1 != null)
                {
                    j = og1.q;
                }
                com.whatsapp.App.a(s2, j, 2);
                com.whatsapp.App.a(b3_1);
                if (l == 0)
                {
                    break label0;
                }
            }
            k4_1 = a(s2);
            vector1 = new Vector(vector.size());
            vector = vector.iterator();
            do
            {
                if (!vector.hasNext())
                {
                    break;
                }
                s4 = (String)vector.next();
                if (k4_1.a(s4) != null)
                {
                    vector1.add(s4);
                }
                if (s3.equals(s4))
                {
                    a1e.g.c(og1.a);
                }
            } while (l == 0);
            if (s != null && vector1.contains(s))
            {
                vector1.remove(s);
                a(1, a(5, b3_1, s2, s));
            }
            if (!vector1.isEmpty())
            {
                if (s == null)
                {
                    j = 13;
                } else
                {
                    j = 14;
                }
                a(1, b(j, b3_1, s2, s, vector1));
            }
        }
        if (og1 != null && !TextUtils.isEmpty(s1) && TextUtils.isEmpty(og1.n))
        {
            Log.i(z[23]);
            App.az.a(s2, null, s1);
            App.ah.c(s2, s1);
        }
    }

    public void a(String s)
    {
        Log.i((new StringBuilder()).append(z[58]).append(s).toString());
    }

    public void a(String s, String s1, long l, String s2, long l1, 
            String s3, String s4, long l2, Hashtable hashtable)
    {
        Log.i((new StringBuilder()).append(z[54]).append(s).append(z[48]).append(s1).append(z[50]).append(l).append(z[51]).append(s3).append(z[55]).append(s2).append(z[56]).append(l1).append(z[49]).append(s4).append(z[52]).append(l2).toString());
        Log.i((new StringBuilder()).append(z[53]).append(Arrays.deepToString(Collections.list(hashtable.keys()).toArray())).append("/").append(Arrays.deepToString(hashtable.values().toArray())).toString());
        c(s, s1, l, s2, l1, s3, s4, l2, hashtable);
        App.a1.b(s);
    }

    public void a(String s, String s1, long l, String s2, long l1, 
            String s3, String s4, Hashtable hashtable, Hashtable hashtable1)
    {
        Log.i((new StringBuilder()).append(z[64]).append(s).append("/").append(s1).append("/").append(l).append("/").append(s2).append("/").append(s3).append("/").append(l1).append("/").append(s4).append("/").append(Arrays.deepToString(hashtable.keySet().toArray())).toString());
        if (hashtable1 != null && hashtable1.size() > 0)
        {
            a(35, hashtable1);
        }
    }

    public void a(String s, String s1, String as[])
    {
        Log.i((new StringBuilder()).append(z[79]).append(s).append(z[78]).append(s1).append(z[80]).append(Arrays.deepToString(as)).toString());
        if (!u5.b(s))
        {
            Vector vector = new Vector(as.length);
            vector.addAll(Arrays.asList(as));
            as = new c4(s, s1, null);
            as.I = App.U();
            as.M = 6;
            as.t = 9L;
            as.B = vector;
            as.G = App.az.f().a;
            App.ah.g(as);
            a(s, vector);
        }
        if (App.az.f(s) == null)
        {
            com.whatsapp.u5.a(s, s1, System.currentTimeMillis());
        }
    }

    public void a(String s, Hashtable hashtable, Hashtable hashtable1)
    {
        Log.i((new StringBuilder()).append(z[24]).append(s).append("/").append(Arrays.deepToString(hashtable.keySet().toArray())).append("/").append(Arrays.deepToString(hashtable1.keySet().toArray())).toString());
        if (hashtable1 != null && hashtable1.size() > 0)
        {
            a(37, hashtable1);
        }
    }

    public void a(Vector vector)
    {
        int j = App.am;
        Log.i((new StringBuilder()).append(z[27]).append(Arrays.deepToString(vector.toArray())).toString());
        String s = App.az.f().a;
        vector = vector.iterator();
        do
        {
            if (!vector.hasNext())
            {
                break;
            }
            String s1 = (String)vector.next();
            b.remove(s1);
            a(s1).a(s);
            a1e.g.c(s1);
            a(1, a(5, ((b3) (null)), s1, s));
        } while (j == 0);
    }

    public void a(Vector vector, Hashtable hashtable)
    {
    }

    public void b(b3 b3_1)
    {
    }

    public void b(b3 b3_1, Vector vector, String s)
    {
        int j = App.am;
        Log.i((new StringBuilder()).append(z[72]).append(b3_1).append("/").append(Arrays.deepToString(vector.toArray())).toString());
        String s1 = b3_1.a;
        k4 k4_1 = a(s1);
        Iterator iterator = vector.iterator();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s = (String)iterator.next();
                vector = k4_1.b(s);
                if (vector == null)
                {
                    vector = k4_1.a(s, false, false);
                    s = vector;
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                vector.d = false;
                s = vector;
            }
            App.ah.a(s1, s);
        } while (j == 0);
        com.whatsapp.App.a(b3_1);
        a(4, s1);
    }

    public void b(String s, String s1, long l, String s2, long l1, 
            String s3, String s4, long l2, Hashtable hashtable)
    {
        Log.i((new StringBuilder()).append(z[41]).append(s).append(z[40]).append(s1).append(z[44]).append(l).append(z[45]).append(s3).append(z[38]).append(s2).append(z[43]).append(l1).append(z[42]).append(s4).append(z[37]).append(l2).toString());
        Log.i((new StringBuilder()).append(z[39]).append(Arrays.deepToString(Collections.list(hashtable.keys()).toArray())).append("/").append(Arrays.deepToString(hashtable.values().toArray())).toString());
        c(s, s1, l, s2, l1, s3, s4, l2, hashtable);
    }

    public void b(String s, Hashtable hashtable, Hashtable hashtable1)
    {
        Log.i((new StringBuilder()).append(z[12]).append(s).append("/").append(Arrays.deepToString(hashtable.keySet().toArray())).append("/").append(Arrays.deepToString(hashtable1.keySet().toArray())).toString());
        if (hashtable1 != null && hashtable1.size() > 0)
        {
            a(36, hashtable1);
        }
    }

    public void b(Vector vector)
    {
        int j = App.am;
        Log.i((new StringBuilder()).append(z[26]).append(Arrays.deepToString(vector.toArray())).toString());
        Iterator iterator = u5.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (h(s) && !vector.contains(s))
            {
                a(s).a(App.az.f().a);
                App.ah.a(s, App.az.f().a);
                if (App.az.c(s) == null)
                {
                    og og1 = new og(s);
                    App.az.m(og1);
                }
                rr rr1 = App.ah.e(s);
                if (rr1.a != null && rr1.b != null)
                {
                    App.az.a(s, null, rr1.a, rr1.b.longValue());
                }
            }
        } while (j == 0);
        f = false;
        a(false);
        App.ah.s(d());
        if (d)
        {
            d = false;
            App.ax();
        }
        App.S.sendEmptyMessage(0);
    }

    public void c()
    {
        b.clear();
    }

    public void c(String s, Hashtable hashtable, Hashtable hashtable1)
    {
        Log.i((new StringBuilder()).append(z[25]).append(s).append("/").append(Arrays.deepToString(hashtable.keySet().toArray())).append("/").append(Arrays.deepToString(hashtable1.keySet().toArray())).toString());
        if (hashtable1 != null && hashtable1.size() > 0)
        {
            a(35, hashtable1);
        }
    }

    public void d(String s, Hashtable hashtable, Hashtable hashtable1)
    {
        Log.i((new StringBuilder()).append(z[28]).append(s).append("/").append(Arrays.deepToString(hashtable.keySet().toArray())).append("/").append(Arrays.deepToString(hashtable1.keySet().toArray())).toString());
        if (hashtable1 != null && hashtable1.size() > 0)
        {
            a(38, hashtable1);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[81];
        obj = "G\030O.\022M\rRt\005E\036p:\020T\003C2\022A\004T\b\026A\036U(/E\031S:\005EE";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "G\030O.\022M\rRt\005E\036p:\020T\003C2\022A\004T(1T\013T.\021m\017S(\003G\017\017";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\017\005L?\bI\016\032";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                j = 3;
                obj = "\017\004E,\bI\016\032";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "G\030O.\022M\rRt\rN-R4\027P?S>\020c\002A5\005E\016n.\017B\017Rt\021E\004D<\007T\rR4\027P\003N=\r\017";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "G\030O.\022M\rRt\rN-R4\027P?S>\020c\002A5\005E\016n.\017B\017Rt";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "C\005Mu\025H\013T(\003P\032\177+\020E\fE)\007N\tE(";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "P\013\r";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "G\030O.\022M\rRt\017I\rR:\026E\fR4\017P\030E=\021\017";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "F\032Av";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "F\032Av";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "P\013\r";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "G\030O.\022M\rRt\rN8E6\rV\017g)\rU\032p:\020T\003C2\022A\004T(M";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "G\030O.\022M\rRt\rN-R4\027P.E7\007T\017\017";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "G\030O.\022\177\004O/\013C\017`/\007M\032";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = "G\030O.\022M\rRt\rN:A)\026I\tI+\003T\003N<.I\031Tt\rN:A)\026I\tI+\003T\003N<.I\031T(!O\007P7\007T\017";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "`\036E6\022";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 17;
                obj = "G\030O.\022M\rRt\003D\016g)\rU\032s\"\fC\003N<'N\036R\"";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[j] = ((String) (obj));
                j = 18;
                obj = "\017\030E6\rV\017D\004\000YP";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[j] = ((String) (obj));
                j = 19;
                obj = "G\030O.\022M\rRt\rN-R4\027P8E6\rV\017u(\007R\031\017";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[j] = ((String) (obj));
                obj = "G\030O.\022M\rRt\rN-R4\027P8E6\rV\017u(\007R\031\017)\007Q\037E)\033G\030O.\022I\004F4";
                byte0 = 19;
                j = 20;
                break;

            case 19: // '\023'
                as1[j] = ((String) (obj));
                j = 21;
                obj = "J\003D(X";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[j] = ((String) (obj));
                j = 22;
                obj = "G\030O.\022M\rRt\rN-R4\027P8E6\rV\017u(\007R\031\0176\007\000\006E:\024I\004G";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[j] = ((String) (obj));
                j = 23;
                obj = "G\030O.\022M\rRt\rN-R4\027P8E6\rV\017u(\007R\031\017(\027B\000E8\026C\002A5\005E\016";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[j] = ((String) (obj));
                j = 24;
                obj = "G\030O.\022M\rRt\rN:R4\017O\036E\034\020O\037P\013\003R\036I8\013P\013N/\021\017";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[j] = ((String) (obj));
                j = 25;
                obj = "G\030O.\022M\rRt\rN+D?%R\005U+2A\030T2\001I\032A5\026SE";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[j] = ((String) (obj));
                j = 26;
                obj = "G\030O.\022M\rRt\rN\032A)\026I\tI+\003T\003N<\005R\005U+\021\017";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[j] = ((String) (obj));
                j = 27;
                obj = "G\030O.\022M\rRt\rN&E:\024E-R4\027PE";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[j] = ((String) (obj));
                j = 28;
                obj = "G\030O.\022M\rRt\rN.E6\rT\017g)\rU\032p:\020T\003C2\022A\004T(M";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[j] = ((String) (obj));
                j = 29;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,%R\005U+BO\006D+\003R\036I8\013P\013N/\021\032";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[j] = ((String) (obj));
                j = 30;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,%R\005U+M";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[j] = ((String) (obj));
                j = 31;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,%R\005U+M";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[j] = ((String) (obj));
                obj = "\000\007E8\020E\013T4\020\032";
                byte0 = 31;
                j = 32;
                break;

            case 31: // '\037'
                as1[j] = ((String) (obj));
                j = 33;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,%R\005U+M";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[j] = ((String) (obj));
                j = 34;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,%R\005U+M\000\004E,X";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[j] = ((String) (obj));
                j = 35;
                obj = "\000\004U6\000E\030C3\003N\rEa";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[j] = ((String) (obj));
                j = 36;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,%R\005U+MC\002A5\005E\016";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[j] = ((String) (obj));
                j = 37;
                obj = "\017\006O8\003T\003O5X";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[j] = ((String) (obj));
                j = 38;
                obj = "\017\031U9\bE\tTa";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[j] = ((String) (obj));
                j = 39;
                obj = "G\030O.\022M\rRt\rN-R4\027P#N=\rf\030O6.I\031Tt";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[j] = ((String) (obj));
                j = 40;
                obj = "\017\tR>\003T\005Ra";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[j] = ((String) (obj));
                j = 41;
                obj = "G\030O.\022M\rRt\rN-R4\027P#N=\rf\030O6.I\031Tt\005J\003Da";
                byte0 = 40;
                break;

            case 40: // '('
                as1[j] = ((String) (obj));
                j = 42;
                obj = "\017\036Y+\007\032";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[j] = ((String) (obj));
                j = 43;
                obj = "\017\031U9\bE\tT\004\026I\007Ea";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[j] = ((String) (obj));
                j = 44;
                obj = "\017\tR>\003T\003O5X";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[j] = ((String) (obj));
                j = 45;
                obj = "\017\031U9\bE\tT{\rW\004E)X";
                byte0 = 44;
                break;

            case 44: // ','
                as1[j] = ((String) (obj));
                j = 46;
                obj = "C\005Mu\025H\013T(\003P\032\177+\020E\fE)\007N\tE(";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[j] = ((String) (obj));
                j = 47;
                obj = "N\017E?=T\005\177<\007T5G)\rU\032S";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[j] = ((String) (obj));
                j = 48;
                obj = "\017\tR>\003T\005Ra";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[j] = ((String) (obj));
                j = 49;
                obj = "\017\036Y+\007\032";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[j] = ((String) (obj));
                j = 50;
                obj = "\017\tR>\003T\003O5X";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[j] = ((String) (obj));
                j = 51;
                obj = "\017\031U9\bE\tT{\rW\004E)X";
                byte0 = 50;
                break;

            case 50: // '2'
                as1[j] = ((String) (obj));
                j = 52;
                obj = "\017\006O8\003T\003O5X";
                byte0 = 51;
                break;

            case 51: // '3'
                as1[j] = ((String) (obj));
                j = 53;
                obj = "G\030O.\022M\rRt\rN-R4\027P#N=\r\017";
                byte0 = 52;
                break;

            case 52: // '4'
                as1[j] = ((String) (obj));
                j = 54;
                obj = "G\030O.\022M\rRt\rN-R4\027P#N=\r\017\rJ2\006\032";
                byte0 = 53;
                break;

            case 53: // '5'
                as1[j] = ((String) (obj));
                j = 55;
                obj = "\017\031U9\bE\tTa";
                byte0 = 54;
                break;

            case 54: // '6'
                as1[j] = ((String) (obj));
                j = 56;
                obj = "\017\031U9\bE\tT\004\026I\007Ea";
                byte0 = 55;
                break;

            case 55: // '7'
                as1[j] = ((String) (obj));
                j = 57;
                obj = "G\030O.\022M\rRt\rN-R4\027P:R4\017O\036E\016\021E\030St";
                byte0 = 56;
                break;

            case 56: // '8'
                as1[j] = ((String) (obj));
                j = 58;
                obj = "G\030O.\022M\rRt\rN9E/1U\bJ>\001TE";
                byte0 = 57;
                break;

            case 57: // '9'
                as1[j] = ((String) (obj));
                j = 59;
                obj = "G\030O.\022M\rRt\005R\005U+1Y\004C\035\003I\006E?-R>I6\007O\037T";
                byte0 = 58;
                break;

            case 58: // ':'
                as1[j] = ((String) (obj));
                j = 60;
                obj = "C\005Mu\025H\013T(\003P\032\177+\020E\fE)\007N\tE(";
                byte0 = 59;
                break;

            case 59: // ';'
                as1[j] = ((String) (obj));
                j = 61;
                obj = "G\030O.\022M\rRt\021E\036S3\rU\006D<\007T\rR4\027P\031\0";
                byte0 = 60;
                break;

            case 60: // '<'
                as1[j] = ((String) (obj));
                j = 62;
                obj = "N\017E?=T\005\177<\007T5G)\rU\032S";
                byte0 = 61;
                break;

            case 61: // '='
                as1[j] = ((String) (obj));
                j = 63;
                obj = "G\030O.\022M\rRt\021E\036S3\rU\006D<\007T\rR4\027P\031\017=\003I\006E?";
                byte0 = 62;
                break;

            case 62: // '>'
                as1[j] = ((String) (obj));
                j = 64;
                obj = "G\030O.\022M\rRt\rN-R4\027P)R>\003T\017Dt";
                byte0 = 63;
                break;

            case 63: // '?'
                as1[j] = ((String) (obj));
                j = 65;
                obj = "`\036E6\022";
                byte0 = 64;
                break;

            case 64: // '@'
                as1[j] = ((String) (obj));
                j = 66;
                obj = "G\030O.\022M\rRt\rN-R4\027P+D?7S\017R(MR\017Q.\007R\023G)\rU\032I5\004O";
                byte0 = 65;
                break;

            case 65: // 'A'
                as1[j] = ((String) (obj));
                j = 67;
                obj = "G\030O.\022M\rRt\rN-R4\027P+D?7S\017R(M";
                byte0 = 66;
                break;

            case 66: // 'B'
                as1[j] = ((String) (obj));
                j = 68;
                obj = "A\016M2\f";
                byte0 = 67;
                break;

            case 67: // 'C'
                as1[j] = ((String) (obj));
                j = 69;
                obj = "A\030";
                byte0 = 68;
                break;

            case 68: // 'D'
                as1[j] = ((String) (obj));
                j = 70;
                obj = "U\030";
                byte0 = 69;
                break;

            case 69: // 'E'
                as1[j] = ((String) (obj));
                j = 71;
                obj = "F\013";
                byte0 = 70;
                break;

            case 70: // 'F'
                as1[j] = ((String) (obj));
                j = 72;
                obj = "G\030O.\022M\rRt\rN-R4\027P.E6\rT\017u(\007R\031\017";
                byte0 = 71;
                break;

            case 71: // 'G'
                as1[j] = ((String) (obj));
                j = 73;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,1U\bJ>\001TEN>\025\000\rR4\027P";
                byte0 = 72;
                break;

            case 72: // 'H'
                as1[j] = ((String) (obj));
                j = 74;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,1U\bJ>\001TE";
                byte0 = 73;
                break;

            case 73: // 'I'
                as1[j] = ((String) (obj));
                j = 75;
                obj = "`\031\016,\nA\036S:\022PDN>\026";
                byte0 = 74;
                break;

            case 74: // 'J'
                as1[j] = ((String) (obj));
                j = 76;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,1U\bJ>\001TEC3\003N\rE?";
                byte0 = 75;
                break;

            case 75: // 'K'
                as1[j] = ((String) (obj));
                j = 77;
                obj = "G\030O.\022M\rRt\rN-R4\027P$E,1U\bJ>\001TED2\006\000\004O/BC\002A5\005E";
                byte0 = 76;
                break;

            case 76: // 'L'
                as1[j] = ((String) (obj));
                j = 78;
                obj = "\017\004A6\007\032";
                byte0 = 77;
                break;

            case 77: // 'M'
                as1[j] = ((String) (obj));
                j = 79;
                obj = "G\030O.\022M\rRt\rN:A)\026I\tI+\003T\003N<.I\031Tt\bI\016\032";
                byte0 = 78;
                break;

            case 78: // 'N'
                as1[j] = ((String) (obj));
                j = 80;
                obj = "\017\030E8\013P\003E5\026SP";
                byte0 = 79;
                break;

            case 79: // 'O'
                as1[j] = ((String) (obj));
                z = as;
                d = false;
                f = false;
                e = new ConcurrentHashMap();
                b = new ConcurrentHashMap();
                c = new a9k();
                a = (new int[] {
                    0xffb4c74b, 0xff8393ca, -36820, 0xff4ebbbb, 0xffdfb610, 0xff1f7aec, 0xfff091b9, 0xff029d00, 0xff7869c0, 0xffb4876e, 
                    0xfffe7c7f, 0xff59d368, -22150, 0xff7d9ef1, 0xffc90379, 0xffa3e2cb, 0xffa6402c, 0xffe542a3, 0xffa16fad, 0xffef4b4f
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 2024
    //                   0 2047
    //                   1 2054
    //                   2 2061
    //                   3 2068;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_2068;
_L3:
        byte byte1 = 98;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 32;
          goto _L9
_L5:
        byte1 = 106;
          goto _L9
_L6:
        byte1 = 32;
          goto _L9
        byte1 = 91;
          goto _L9
    }
}
