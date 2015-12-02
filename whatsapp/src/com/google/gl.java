// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google:
//            e_, af, ff, df

public class gl
{

    private static final String C[];
    private static final Pattern b;
    private static final Pattern i;
    private static final e_ k;
    private static final Pattern o;
    private static final Pattern r;
    private static final Pattern s;
    private int A;
    private final af B = af.a();
    private String a;
    private StringBuilder c;
    private boolean d;
    private String e;
    private String f;
    private StringBuilder g;
    private e_ h;
    private int j;
    private e_ l;
    private int m;
    private List n;
    private StringBuilder p;
    private boolean q;
    private boolean t;
    private ff u;
    private String v;
    private StringBuilder w;
    private boolean x;
    private StringBuilder y;
    private boolean z;

    gl(String s1)
    {
        f = "";
        p = new StringBuilder();
        e = "";
        y = new StringBuilder();
        w = new StringBuilder();
        x = true;
        t = false;
        z = false;
        d = false;
        A = 0;
        m = 0;
        j = 0;
        c = new StringBuilder();
        q = false;
        a = "";
        g = new StringBuilder();
        n = new ArrayList();
        u = new ff(64);
        v = s1;
        l = c(v);
        h = l;
    }

    private char a(char c1, boolean flag)
    {
        char c2;
label0:
        {
            if (c1 == '+')
            {
                w.append(c1);
                c2 = c1;
                if (af.k == 0)
                {
                    break label0;
                }
            }
            c2 = Character.forDigit(Character.digit(c1, 10), 10);
            w.append(c2);
            g.append(c2);
        }
        if (flag)
        {
            j = w.length();
        }
        return c2;
    }

    private String a()
    {
        x = true;
        d = false;
        n.clear();
        return l();
    }

    private String a(String s1, String s2)
    {
        Object obj = C[0];
        obj = u.a(s1).matcher(((CharSequence) (obj)));
        ((Matcher) (obj)).find();
        obj = ((Matcher) (obj)).group();
        if (((String) (obj)).length() < g.length())
        {
            return "";
        } else
        {
            return ((String) (obj)).replaceAll(s1, s2).replaceAll("9", "\u2008");
        }
    }

    private boolean a(char c1)
    {
        return Character.isDigit(c1) || y.length() == 1 && af.f.matcher(Character.toString(c1)).matches();
    }

    private boolean a(df df1)
    {
        String s1 = df1.e();
        if (s1.indexOf('|') == -1)
        {
            s1 = s.matcher(s1).replaceAll(C[4]);
            s1 = i.matcher(s1).replaceAll(C[3]);
            p.setLength(0);
            df1 = a(s1, df1.d());
            if (df1.length() > 0)
            {
                p.append(df1);
                return true;
            }
        }
        return false;
    }

    private boolean a(String s1)
    {
        return b.matcher(s1).matches();
    }

    private String b()
    {
        if (!j()) goto _L2; else goto _L1
_L1:
        c.append('1').append(' ');
        z = true;
        if (af.k == 0) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L7:
        int i1;
        i1 = ((flag) ? 1 : 0);
        if (l.Z())
        {
            Matcher matcher = u.a(l.L()).matcher(g);
            i1 = ((flag) ? 1 : 0);
            if (matcher.lookingAt())
            {
                z = true;
                i1 = matcher.end();
                c.append(g.substring(0, i1));
            }
        }
_L5:
        String s1 = g.substring(0, i1);
        g.delete(0, i1);
        return s1;
_L4:
        i1 = 1;
        if (true) goto _L5; else goto _L2
_L2:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private String b(char c1)
    {
        Matcher matcher = r.matcher(p);
        if (matcher.find(A))
        {
            String s1 = matcher.replaceFirst(Character.toString(c1));
            p.replace(0, s1.length(), s1);
            A = matcher.start();
            return p.substring(0, A + 1);
        }
        if (n.size() == 1)
        {
            x = false;
        }
        e = "";
        return y.toString();
    }

    private String b(char c1, boolean flag)
    {
        char c2;
        int i1;
label0:
        {
            i1 = af.k;
            y.append(c1);
            if (flag)
            {
                m = y.length();
            }
            if (!a(c1))
            {
                x = false;
                t = true;
                c2 = c1;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            c2 = a(c1, flag);
        }
        if (x) goto _L2; else goto _L1
_L1:
        if (!t) goto _L4; else goto _L3
_L3:
        String s1 = y.toString();
_L10:
        return s1;
_L4:
        if (i())
        {
            if (c())
            {
                return a();
            }
        } else
        if (e())
        {
            c.append(' ');
            return a();
        }
        return y.toString();
_L2:
        w.length();
        JVM INSTR tableswitch 0 3: default 172
    //                   0 219
    //                   1 219
    //                   2 219
    //                   3 227;
           goto _L5 _L6 _L6 _L6 _L7
_L5:
        if (d)
        {
            if (c())
            {
                d = false;
            }
            return (new StringBuilder()).append(c).append(g.toString()).toString();
        }
        break; /* Loop/switch isn't completed */
_L6:
        return y.toString();
_L7:
        if (!i())
        {
            break; /* Loop/switch isn't completed */
        }
        d = true;
        if (i1 == 0) goto _L5; else goto _L8
_L8:
        a = b();
        return l();
        if (n.size() > 0)
        {
            String s3 = b(c2);
            String s2 = h();
            s1 = s2;
            if (s2.length() <= 0)
            {
                b(g.toString());
                if (f())
                {
                    return k();
                }
                if (x)
                {
                    return e(s3);
                } else
                {
                    return y.toString();
                }
            }
        } else
        {
            return l();
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void b(String s1)
    {
        int i1 = af.k;
        int j1 = s1.length() - 3;
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            df df1 = (df)iterator.next();
            if (df1.c() > j1 && !u.a(df1.a(j1)).matcher(s1).lookingAt())
            {
                iterator.remove();
            }
        } while (i1 == 0);
    }

    private e_ c(String s1)
    {
        int i1 = B.l(s1);
        s1 = B.a(i1);
        s1 = B.d(s1);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return k;
        }
    }

    private boolean c()
    {
        if (g.length() != 0)
        {
            Object obj = new StringBuilder();
            int i1 = B.a(g, ((StringBuilder) (obj)));
            if (i1 != 0)
            {
label0:
                {
                    g.setLength(0);
                    g.append(((CharSequence) (obj)));
                    obj = B.a(i1);
                    if (C[2].equals(obj))
                    {
                        l = B.b(i1);
                        if (af.k == 0)
                        {
                            break label0;
                        }
                    }
                    if (!((String) (obj)).equals(v))
                    {
                        l = c(((String) (obj)));
                    }
                }
                obj = Integer.toString(i1);
                c.append(((String) (obj))).append(' ');
                return true;
            }
        }
        return false;
    }

    private void d(String s1)
    {
        int i1 = af.k;
        Object obj;
        boolean flag;
        if (z && l.M() > 0)
        {
            obj = l.G();
        } else
        {
            obj = l.B();
        }
        flag = l.K();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            df df1 = (df)((Iterator) (obj)).next();
            if (flag && !z && !df1.l())
            {
                af af1 = B;
                if (!af.a(df1.m()))
                {
                    continue;
                }
            }
            if (a(df1.d()))
            {
                n.add(df1);
            }
        } while (i1 == 0);
        b(s1);
    }

    private String e(String s1)
    {
        int i1 = c.length();
        if (q && i1 > 0 && c.charAt(i1 - 1) != ' ')
        {
            return (new StringBuilder()).append(new String(c)).append(' ').append(s1).toString();
        } else
        {
            return (new StringBuilder()).append(c).append(s1).toString();
        }
    }

    private boolean e()
    {
        boolean flag = false;
        if (a.length() > 0)
        {
            g.insert(0, a);
            int i1 = c.lastIndexOf(a);
            c.setLength(i1);
        }
        if (!a.equals(b()))
        {
            flag = true;
        }
        return flag;
    }

    private boolean f()
    {
        int i1 = af.k;
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            df df1 = (df)iterator.next();
            String s1 = df1.e();
            if (e.equals(s1))
            {
                return false;
            }
            if (a(df1))
            {
                e = s1;
                q = o.matcher(df1.m()).find();
                A = 0;
                return true;
            }
            iterator.remove();
        } while (i1 == 0);
        x = false;
        return false;
    }

    private boolean i()
    {
        Matcher matcher = u.a((new StringBuilder()).append(C[1]).append(l.n()).toString()).matcher(w);
        if (matcher.lookingAt())
        {
            z = true;
            int i1 = matcher.end();
            g.setLength(0);
            g.append(w.substring(i1));
            c.setLength(0);
            c.append(w.substring(0, i1));
            if (w.charAt(0) != '+')
            {
                c.append(' ');
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean j()
    {
        return l.ad() == 1 && g.charAt(0) == '1' && g.charAt(1) != '0' && g.charAt(1) != '1';
    }

    private String k()
    {
        int j1 = af.k;
        int k1 = g.length();
        if (k1 > 0)
        {
            String s1 = "";
            int i1 = 0;
            do
            {
                if (i1 >= k1)
                {
                    break;
                }
                String s2 = b(g.charAt(i1));
                i1++;
                s1 = s2;
                if (j1 == 0)
                {
                    continue;
                }
                s1 = s2;
                break;
            } while (true);
            if (x)
            {
                return e(s1);
            } else
            {
                return y.toString();
            }
        } else
        {
            return c.toString();
        }
    }

    private String l()
    {
        if (g.length() >= 3)
        {
            d(g.substring(0, 3));
            if (f())
            {
                return k();
            } else
            {
                return y.toString();
            }
        } else
        {
            return e(g.toString());
        }
    }

    public String c(char c1)
    {
        f = b(c1, false);
        return f;
    }

    public int d()
    {
        int i1;
        int j2;
        i1 = 0;
        j2 = af.k;
        if (x) goto _L2; else goto _L1
_L1:
        int k1 = m;
_L4:
        return k1;
_L2:
        int j1 = 0;
_L6:
        k1 = i1;
        if (j1 >= j) goto _L4; else goto _L3
_L3:
        k1 = i1;
        if (i1 >= f.length()) goto _L4; else goto _L5
_L5:
        int l1 = j1;
        if (w.charAt(j1) == f.charAt(i1))
        {
            l1 = j1 + 1;
        }
        int i2 = i1 + 1;
        i1 = i2;
        j1 = l1;
        if (j2 != 0)
        {
            return i2;
        }
          goto _L6
    }

    public String d(char c1)
    {
        f = b(c1, true);
        return f;
    }

    public void g()
    {
        f = "";
        y.setLength(0);
        w.setLength(0);
        p.setLength(0);
        A = 0;
        e = "";
        c.setLength(0);
        a = "";
        g.setLength(0);
        x = true;
        t = false;
        j = 0;
        m = 0;
        z = false;
        d = false;
        n.clear();
        q = false;
        if (!l.equals(h))
        {
            l = c(v);
        }
    }

    String h()
    {
        int i1 = af.k;
        Iterator iterator = n.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            df df1 = (df)iterator.next();
            Matcher matcher = u.a(df1.e()).matcher(g);
            if (matcher.matches())
            {
                q = o.matcher(df1.m()).find();
                return e(matcher.replaceAll(df1.d()));
            }
        } while (i1 == 0);
        return "";
    }

    static 
    {
        Object obj;
        Object aobj[];
        byte byte0;
        int i1;
        aobj = new String[5];
        obj = "<B\\#t<B\\#t<B\\#t";
        byte0 = -1;
        i1 = 0;
_L8:
        String as[];
        int k1;
        int l1;
        as = ((String []) (aobj));
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        k1 = 0;
_L23:
        if (l1 > k1) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 92
    //                   1 108
    //                   2 124
    //                   3 140;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        as[i1] = ((String) (obj));
        obj = "YP\031";
        i1 = 1;
        byte0 = 0;
          goto _L8
_L4:
        as[i1] = ((String) (obj));
        obj = "5KT";
        i1 = 2;
        byte0 = 1;
          goto _L8
_L5:
        as[i1] = ((String) (obj));
        i1 = 3;
        obj = "Y'\001";
        byte0 = 2;
          goto _L8
_L6:
        as[i1] = ((String) (obj));
        i1 = 4;
        obj = "Y'\001";
        byte0 = 3;
          goto _L8
_L7:
        int j1;
        as[i1] = ((String) (obj));
        C = ((String []) (aobj));
        obj = new e_();
        aobj = "K:".toCharArray();
        j1 = aobj.length;
        i1 = 0;
_L30:
        if (j1 > i1) goto _L10; else goto _L9
_L9:
        k = ((e_) (obj)).b((new String(((char []) (aobj)))).intern());
        obj = "Y MA\023Y 9G\020,Q9G";
        i1 = -1;
_L17:
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L37:
        if (k1 > j1) goto _L12; else goto _L11
_L11:
        obj = (new String(((char []) (obj)))).intern();
        i1;
        JVM INSTR tableswitch 0 2: default 260
    //                   0 536
    //                   1 552
    //                   2 568;
           goto _L13 _L14 _L15 _L16
_L13:
        s = Pattern.compile(((String) (obj)));
        obj = "Y\037M%p^%Ig\020^%Ig\020,";
        i1 = 0;
          goto _L17
_L2:
        char c1 = obj[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 316
    //                   0 339
    //                   1 345
    //                   2 352
    //                   3 359;
           goto _L18 _L19 _L20 _L21 _L22
_L18:
        j1 = 77;
_L24:
        obj[k1] = (char)(j1 ^ c1);
        k1++;
          goto _L23
_L19:
        j1 = 5;
          goto _L24
_L20:
        j1 = 123;
          goto _L24
_L21:
        j1 = 101;
          goto _L24
_L22:
        j1 = 26;
          goto _L24
_L10:
        k1 = aobj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 408
    //                   0 429
    //                   1 434
    //                   2 440
    //                   3 446;
           goto _L25 _L26 _L27 _L28 _L29
_L25:
        byte0 = 77;
_L31:
        aobj[i1] = (char)(byte0 ^ k1);
        i1++;
          goto _L30
_L26:
        byte0 = 5;
          goto _L31
_L27:
        byte0 = 123;
          goto _L31
_L28:
        byte0 = 101;
          goto _L31
_L29:
        byte0 = 26;
          goto _L31
_L12:
        l1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 492
    //                   0 513
    //                   1 518
    //                   2 524
    //                   3 530;
           goto _L32 _L33 _L34 _L35 _L36
_L32:
        byte0 = 77;
_L38:
        obj[j1] = (char)(byte0 ^ l1);
        j1++;
          goto _L37
_L33:
        byte0 = 5;
          goto _L38
_L34:
        byte0 = 123;
          goto _L38
_L35:
        byte0 = 101;
          goto _L38
_L36:
        byte0 = 26;
          goto _L38
_L14:
        i = Pattern.compile(((String) (obj)));
        obj = "^V\035\u200A`\u2010\u2269\u3099\uFF17`\uFF0A[\305\267\u2046\u2065\u307BM3\uFF45\uFF0C\uFF40\uFF584\021^'853\u2056\u2247\uFF3BGg-'AF)^V\035\u200A`\u2010\u2269\u3099\uFF17`\uFF0A[\305\267\u2046\u2065\u307BM3\uFF45\uFF0C\uFF40\uFF584\021^'853\u2056\u2247\uFF3BGg,P";
        i1 = 1;
          goto _L17
_L15:
        b = Pattern.compile(((String) (obj)));
        obj = "^VEG";
        i1 = 2;
          goto _L17
_L16:
        o = Pattern.compile(((String) (obj)));
        r = Pattern.compile("\u2008");
        if (true) goto _L8; else goto _L39
_L39:
    }
}
