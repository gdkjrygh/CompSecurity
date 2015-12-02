// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.whispersystems.at;
import org.whispersystems.b6;
import org.whispersystems.bs;
import org.whispersystems.i;

// Referenced classes of package com.whatsapp:
//            App, hi, fz, px, 
//            cr, oy, n9, cd, 
//            akj, adv, _2, rq, 
//            ad

public final class my
{

    private static boolean a = false;
    private static AtomicReference b = new AtomicReference();
    public static final List c = Collections.synchronizedList(new ArrayList());
    public static byte d[];
    private static oy e;
    private static final List f = new ArrayList();
    public static String g = null;
    public static rq h = null;
    public static String i = null;
    public static byte j[];
    private static Map k;
    private static final SecureRandom l = new SecureRandom();
    public static byte m[];
    public static String n = null;
    private static final String z[];

    public static hi a(int i1, boolean flag, boolean flag1)
    {
        hi hi1 = new hi(i1, flag, flag1, null);
        if (hi1.equals((hi)b.getAndSet(hi1)))
        {
            return null;
        } else
        {
            return hi1;
        }
    }

    public static rq a()
    {
        rq rq1 = h;
        h = null;
        return rq1;
    }

    public static String a(String s1, String s2)
    {
        Object obj = null;
        fz fz1 = i(s1);
        s1 = obj;
        if (fz1 != null)
        {
            s1 = obj;
            if (fz1.j.equals(s2))
            {
                s1 = fz1.g;
            }
        }
        return s1;
    }

    public static String a(String s1, byte abyte0[])
    {
        i i1 = bs.a();
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        byte abyte4[];
        try
        {
            s1 = Base64.decode(s1, 0);
            s1 = bs.a(bs.a(px.b(new byte[] {
                5
            }, s1), 0), i1.b());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e((new StringBuilder()).append(z[18]).append(s1).toString());
            return null;
        }
        abyte2 = at.a(3).a(s1, null, 80);
        abyte3 = new byte[32];
        System.arraycopy(abyte2, 0, abyte3, 0, 32);
        s1 = new byte[32];
        System.arraycopy(abyte2, 32, s1, 0, 32);
        abyte4 = new byte[16];
        System.arraycopy(abyte2, 64, abyte4, 0, 16);
        abyte0 = px.a(abyte3, abyte4, abyte0);
        abyte1 = ((b6)(b6)i1.a()).b();
        s1 = px.a(s1, px.b(abyte1, abyte0));
        if (s1 == null || abyte0 == null)
        {
            boolean flag;
            boolean flag1;
            try
            {
                abyte1 = z[19];
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (abyte0 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (s1 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Log.c(abyte1, null, new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1)
            });
            return null;
        } else
        {
            return Base64.encodeToString(px.b(abyte1, px.b(s1, abyte0)), 2);
        }
    }

    private static void a(int i1)
    {
        int j1 = App.am;
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((cr)iterator.next()).a(i1);
        } while (j1 == 0);
    }

    public static void a(long l1)
    {
        a = false;
        a(l1, n);
    }

    public static void a(long l1, String s1)
    {
        fz fz1;
        if (s1 != null && l1 > 0L)
        {
            if ((fz1 = (fz)h().get(s1)) != null)
            {
                fz1.k = l1;
                j().b(s1, fz1.k);
                k();
                return;
            }
        }
    }

    public static void a(cr cr1)
    {
        if (!f.contains(cr1))
        {
            f.add(cr1);
        }
    }

    private static void a(fz fz1)
    {
label0:
        {
            n9 n9_1 = new n9(App.au);
            Location location = n9_1.a(2);
            if (location != null && location.getTime() + 0x1d4c0L > System.currentTimeMillis())
            {
                Log.i((new StringBuilder()).append(z[20]).append(location.getTime()).toString());
                x.a(new cd(fz1, location));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            fz1 = new akj(fz1, n9_1);
            n9_1.a(2, 0L, 0.0F, fz1);
            App.au.ab().postDelayed(new adv(n9_1, fz1), 60000L);
        }
    }

    public static void a(String s1)
    {
        if (d(s1))
        {
            g(s1);
            k();
        }
    }

    public static void a(String s1, int i1)
    {
        if (g != null && !g.equals(s1))
        {
            return;
        }
        if (!e())
        {
            Log.e(z[30]);
        }
        a(i1);
    }

    public static void a(String s1, String s2, String s3, String s4, String s5, String s6, boolean flag)
    {
        if (!e(s1))
        {
            Log.e(z[28]);
        }
        if (!j(s4))
        {
            Log.e(z[27]);
        }
        if (s2 != null && !k(s2))
        {
            Log.e(z[29]);
        }
        if (s3 != null && !c(s3))
        {
            Log.e(z[25]);
        }
        if (!a(s3, s2, s4, s5, s6, flag))
        {
            Log.e(z[26]);
        }
    }

    public static void a(boolean flag)
    {
        if (!b(flag))
        {
            Log.e(z[31]);
        }
    }

    private static boolean a(String s1, String s2, String s3)
    {
        s1 = App.au.getSharedPreferences(s1, 0).edit();
        s1.putString(s2, s3);
        return s1.commit();
    }

    private static boolean a(String s1, String s2, String s3, String s4, String s5, boolean flag)
    {
        fz fz1;
label0:
        {
            if (s1 == null)
            {
                return true;
            }
            Log.b(z[4], null, new Object[] {
                s1, s3, s4, s5
            });
            fz fz2 = (fz)h().get(s1);
            fz1 = fz2;
            if (fz2 == null)
            {
                fz1 = new fz(s1, s2, s3, s4, s5, flag);
                h().put(s1, fz1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            fz1.g = s2;
            fz1.j = s3;
            fz1.b = s4;
            fz1.a = s5;
            fz1.h = flag;
            fz1.c = 0L;
        }
        fz1.k = System.currentTimeMillis();
        j().a(s1, s2, s3, s4, s5, flag);
        k();
        a(fz1);
        return true;
    }

    private static boolean a(String s1, boolean flag)
    {
label0:
        {
            boolean flag1 = false;
            m = Base64.decode(s1, 0);
            if (m.length == 64)
            {
                j = new byte[32];
                d = new byte[32];
                System.arraycopy(m, 0, j, 0, 32);
                System.arraycopy(m, 32, d, 0, 32);
            }
            if (flag)
            {
                flag = flag1;
                if (!a(z[1], z[0], s1))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static fz b(fz fz1)
    {
        if (fz1 != null)
        {
            fz fz2 = fz1;
            if (fz1.h)
            {
                fz2 = fz1;
                if (fz1.c != 0L)
                {
                    fz2 = fz1;
                    if (fz1.c < System.currentTimeMillis())
                    {
                        Log.b(z[5], null, new Object[] {
                            fz1.f
                        });
                        g(fz1.f);
                        k();
                        fz2 = null;
                    }
                }
            }
            return fz2;
        } else
        {
            return null;
        }
    }

    public static String b(String s1, String s2, String s3)
    {
        s1 = (fz)h().get(s1);
        if (s1 != null)
        {
            byte abyte0[] = Base64.decode(((fz) (s1)).g, 0);
            byte abyte1[] = new byte[32];
            System.arraycopy(abyte0, 32, abyte1, 0, 32);
            s3 = px.a(abyte1, Base64.decode(s3, 0));
            if (s3 != null)
            {
                if (Base64.encodeToString(s3, 2).equals(s2))
                {
                    s1 = ((fz) (s1)).g;
                } else
                {
                    s1 = null;
                }
                return s1;
            }
        }
        return null;
    }

    static SecureRandom b()
    {
        return l;
    }

    public static void b(cr cr1)
    {
        f.remove(cr1);
    }

    public static void b(String s1)
    {
        if (!a(s1, false))
        {
            Log.e(z[12]);
        }
    }

    public static void b(String s1, String s2)
    {
        boolean flag;
        if (s2 != null && s2.equals(g))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        App.a(s1, s2, flag);
    }

    private static boolean b(boolean flag)
    {
        android.content.SharedPreferences.Editor editor;
label0:
        {
            editor = App.au.getSharedPreferences(z[16], 0).edit();
            g = null;
            editor.remove(z[17]);
            if (flag)
            {
                g(n);
                m = null;
                j = null;
                d = null;
                i = null;
                n = null;
                editor.remove(z[14]);
                editor.remove(z[13]);
                editor.remove(z[15]);
                k();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            fz fz1 = (fz)h().get(n);
            if (fz1 != null && fz1.h)
            {
                fz1.c = System.currentTimeMillis() + 0x927c0L;
                j().a(n, fz1.c);
            }
        }
        c.clear();
        h = null;
        return editor.commit();
    }

    public static void c()
    {
        if (c.size() > 0)
        {
            x.a(new _2());
        }
    }

    public static void c(String s1, String s2)
    {
        fz fz1 = (fz)h().get(s1);
        if (fz1 != null)
        {
            byte abyte0[] = Base64.decode(fz1.g, 0);
            byte abyte1[] = new byte[32];
            System.arraycopy(abyte0, 0, abyte1, 0, 32);
            byte abyte2[] = new byte[32];
            System.arraycopy(abyte0, 32, abyte2, 0, 32);
            abyte0 = px.a(abyte2, abyte1);
            if (abyte0 != null && Base64.encodeToString(abyte0, 2).equals(s2))
            {
                g(s1);
                k();
            }
        }
    }

    private static boolean c(String s1)
    {
        n = s1;
        return a(z[23], z[24], s1);
    }

    public static boolean d()
    {
        return g != null;
    }

    public static boolean d(String s1)
    {
        return h().containsKey(s1);
    }

    private static boolean e()
    {
        return b(false);
    }

    private static boolean e(String s1)
    {
        g = s1;
        return a(z[21], z[22], s1);
    }

    static oy f()
    {
        return j();
    }

    public static boolean f(String s1)
    {
        return s1 != null && s1.equals(n) && r();
    }

    public static List g()
    {
        int i1 = App.am;
        Iterator iterator = (new ArrayList(h().values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b((fz)iterator.next());
        } while (i1 == 0);
        return new ArrayList(h().values());
    }

    public static void g(String s1)
    {
        h().remove(s1);
        j().a(s1);
    }

    public static String h(String s1)
    {
        String s2 = p();
        h = new rq(s2, s1);
        return s2;
    }

    private static Map h()
    {
        int i1 = App.am;
        if (k == null)
        {
            k = new LinkedHashMap();
            Iterator iterator = j().b().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                fz fz1 = (fz)iterator.next();
                k.put(fz1.f, fz1);
            } while (i1 == 0);
        }
        return k;
    }

    private static fz i(String s1)
    {
        return b((fz)h().get(s1));
    }

    static boolean i()
    {
        return e();
    }

    private static oy j()
    {
        if (e == null)
        {
            e = oy.a(App.au);
        }
        return e;
    }

    private static boolean j(String s1)
    {
        i = s1;
        return a(z[3], z[2], s1);
    }

    private static void k()
    {
        int i1 = App.am;
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((cr)iterator.next()).a();
        } while (i1 == 0);
    }

    private static boolean k(String s1)
    {
        return a(s1, true);
    }

    public static boolean l()
    {
        return i != null;
    }

    public static boolean l(String s1)
    {
        return s1 == null && n == null || n != null && n.equals(s1);
    }

    public static ad m(String s1)
    {
        Object obj = null;
        String as[] = s1.split(",");
        if (as.length < 2)
        {
            Log.e(z[10]);
            return null;
        }
        String s2 = as[0];
        String s3 = as[1];
        s1 = obj;
        if (as.length >= 3)
        {
            s1 = as[2];
        }
        return new ad(s2, s3, s1);
    }

    public static void m()
    {
        if (!e())
        {
            Log.e(z[11]);
        }
    }

    public static void n()
    {
        App.au.getSharedPreferences(z[9], 0).edit().clear().commit();
        h().clear();
        j().a();
        m = null;
        j = null;
        d = null;
        i = null;
        n = null;
        k();
    }

    public static void o()
    {
        android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(z[8], 0).edit();
        i = null;
        editor.remove(z[7]);
        if (!editor.commit())
        {
            Log.e(z[6]);
        }
    }

    public static String p()
    {
        byte abyte0[] = new byte[32];
        l.nextBytes(abyte0);
        return Base64.encodeToString(abyte0, 2);
    }

    public static void q()
    {
        a = true;
        k();
    }

    public static boolean r()
    {
        return d() && a;
    }

    static void s()
    {
        k();
    }

    public static boolean t()
    {
        return !h().isEmpty();
    }

    private static String z(char ac[])
    {
        int i1;
        int j1;
        j1 = ac.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            return (new String(ac)).intern();
        }
        c1 = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 78
    //                   1 84
    //                   2 90
    //                   3 96;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_96;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 102;
_L8:
        ac[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 46;
          goto _L8
_L3:
        byte0 = 74;
          goto _L8
_L4:
        byte0 = 62;
          goto _L8
        byte0 = 126;
          goto _L8
    }

    private static char[] z(String s1)
    {
        s1 = s1.toCharArray();
        if (s1.length < 2)
        {
            s1[0] = (char)(s1[0] ^ 0x66);
        }
        return s1;
    }

    static 
    {
        byte byte1 = -1;
        String as[] = new String[32];
        int i1 = 0;
        Object obj = "E/G";
        byte byte0 = -1;
label0:
        do
        {
            String as1[] = as;
            obj = z(z(((String) (obj))));
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "_8a\032\007Z+";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "Z%U\033\b";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "_8a\032\007Z+";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "_8M\033\025]#Q\020I]/J!\004\\%I\r\003\\j\033\rF\0139\036[\025\016oM";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Y/\\-\003]9W\021\b\001-[\n3@/F\016\017\\/Z-\003]9W\021\b\016(L\021\021]/L^\022G'[\032FA?J^C]";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "_8M\033\025]#Q\020IM&[\037\024b%Y\027\bz%U\033\b\001/L\f\t\\e]\021\013C#J!\000O#R\033\002";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "Z%U\033\b";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "_8a\032\007Z+";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "_8a\032\007Z+";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "_8M\033\025]#Q\020I^8Q\035\003]9o,IK8L\021\024\001#P\b\007B#Z!\005A.[^\026O8J\r";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "_8M\033\025]#Q\020I\\/M\033\022}>_\n\003\001/L\f\t\\e]\021\013C#J!\000O#R\033\002";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "_8M\033\025]#Q\020IL/X\021\024K\033l-\037@)\021\035\tC'W\n9H+W\022\003J\025M\033\005\\/J";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "Z%U\033\b";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "E/G";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "L8Q\t\025K8";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "_8a\032\007Z+";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\\/X";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "_8M\033\025]#Q\020IK$]\f\037^>m\033\005\\/JQ\005[8H\033FK8L\021\024\016";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "_8M\033\025]#Q\020IK$]\f\037^>m\033\005\\/J^\000O#R^\b[&R^\003@)\004^CLjV\023\007Mp\036[\004";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "_8M\033\025]#Q\020IB%]\037\022G%PQ\nO9J^";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "_8a\032\007Z+";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\\/X";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "_8a\032\007Z+";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "L8Q\t\025K8";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "_8M\033\025]#Q\020IA$o,5W$]Q\025[)]\033\025]e]\021\013C#J!\000O#R\033\002q)K\f\024q(L\021\021]/L";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "_8M\033\025]#Q\020IA$o,5W$]Q\025[)]\033\025]e]\021\013C#J!\000O#R\033\002q(L\021\021]/L!\017@,Q";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "_8M\033\025]#Q\020IA$o\f5W$]Q\025[)]\033\025]e]\021\013C#J!\000O#R\033\002q>Q\025\003@";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "_8M\033\025]#Q\020IA$o\f5W$]Q\025[)]\033\025]e]\021\013C#J!\000O#R\033\002q8[\030";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "_8M\033\025]#Q\020IA$o,5W$]Q\025[)]\033\025]e]\021\013C#J!\000O#R\033\002q9[\035\024K>";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "_8M\033\025]#Q\020IA$o\f5W$]Q\003\\8Q\fIM%S\023\017Z\025X\037\017B/Z";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "_8M\033\025]#Q\020IA$o\f2K8S\027\bO>[Q\003\\8Q\fIM%S\023\017Z\025X\037\017B/Z";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                break label0;
            }
        } while (true);
        z = as;
        m = null;
        j = null;
        d = null;
        obj = App.au.getSharedPreferences(z(z("_8a\032\007Z+")), 0);
        Object obj1 = "\\/X";
        byte0 = -1;
label1:
        do
        {
            SharedPreferences sharedpreferences = ((SharedPreferences) (obj));
            obj1 = z(z(((String) (obj1))));
            switch (byte0)
            {
            default:
                g = sharedpreferences.getString(((String) (obj1)), null);
                obj1 = "E/G";
                byte0 = 0;
                break;

            case 0: // '\0'
                obj1 = sharedpreferences.getString(((String) (obj1)), null);
                break label1;
            }
        } while (true);
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = Base64.decode(((String) (obj1)), 0);
        }
        m = ((byte []) (obj1));
        j = null;
        d = null;
        if (m != null)
        {
            j = new byte[32];
            d = new byte[32];
            System.arraycopy(m, 0, j, 0, 32);
            System.arraycopy(m, 32, d, 0, 32);
        }
        obj1 = "Z%U\033\b";
        byte0 = byte1;
label2:
        do
        {
            SharedPreferences sharedpreferences1 = ((SharedPreferences) (obj));
            obj1 = z(z(((String) (obj1))));
            switch (byte0)
            {
            default:
                i = sharedpreferences1.getString(((String) (obj1)), null);
                obj1 = "L8Q\t\025K8";
                byte0 = 0;
                break;

            case 0: // '\0'
                n = sharedpreferences1.getString(((String) (obj1)), null);
                break label2;
            }
        } while (true);
    }
}
