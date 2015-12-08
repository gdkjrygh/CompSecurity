// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.e;

import java.io.Serializable;

public final class a
    implements Serializable, Cloneable, Comparable
{

    private static a a = new a((0.0D / 0.0D), (0.0D / 0.0D));
    private static final a d = a(10D);
    private static final a e = a(1.0D);
    private double b;
    private double c;

    public a()
    {
        b = 0.0D;
        c = 0.0D;
        c(0.0D);
    }

    private a(double d1)
    {
        b = 0.0D;
        c = 0.0D;
        c(d1);
    }

    private a(double d1, double d2)
    {
        b = 0.0D;
        c = 0.0D;
        b = d1;
        c = d2;
    }

    private a(a a1)
    {
        b = 0.0D;
        c = 0.0D;
        b = a1.b;
        c = a1.c;
    }

    public static a a(double d1)
    {
        return new a(d1);
    }

    private final a a(double d1, double d2)
    {
        double d3 = b + d1;
        double d4 = c + d2;
        double d7 = d3 - b;
        double d5 = d4 - c;
        double d8 = b;
        double d6 = c;
        d7 = d4 + ((d1 - d7) + (d8 - (d3 - d7)));
        d1 = d3 + d7;
        d2 = (d3 - d1) + d7 + ((d2 - d5) + (d6 - (d4 - d5)));
        d3 = d1 + d2;
        b = d3;
        c = d2 + (d1 - d3);
        return this;
    }

    private static String a(char c1, int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (c1 = '\0'; c1 < i; c1++)
        {
            stringbuffer.append('0');
        }

        return stringbuffer.toString();
    }

    private String a(boolean flag, int ai[])
    {
        a a1;
        Object obj;
        Object obj1;
        int i;
        int j;
        if (Double.isNaN(b))
        {
            a1 = a;
        } else
        if (d())
        {
            a1 = b();
        } else
        {
            a1 = new a(this);
        }
        j = d(a1.b);
        obj = d;
        if ((double)j == 0.0D)
        {
            obj1 = a(1.0D);
        } else
        {
            obj1 = new a(((a) (obj)));
            a a2 = a(1.0D);
            i = Math.abs(j);
            obj = obj1;
            if (i > 1)
            {
                do
                {
                    if (i <= 0)
                    {
                        break;
                    }
                    if (i % 2 == 1)
                    {
                        a2.b(((a) (obj1)));
                    }
                    int l = i / 2;
                    i = l;
                    if (l > 0)
                    {
                        obj1 = ((a) (obj1)).e(((a) (obj1)));
                        i = l;
                    }
                } while (true);
                obj = a2;
            }
            obj1 = obj;
            if (j < 0)
            {
                double d1 = 1.0D / ((a) (obj)).b;
                double d2 = 134217729D * d1;
                double d5 = 134217729D * ((a) (obj)).b;
                d2 -= d2 - d1;
                double d3 = d1 - d2;
                double d6 = ((a) (obj)).b;
                double d4 = ((a) (obj)).b * d1;
                d5 -= d5 - d6;
                d6 = ((a) (obj)).b - d5;
                d2 = (1.0D - d4 - (d2 * d6 + (d2 * d5 - d4) + d5 * d3 + d3 * d6) - ((a) (obj)).c * d1) / ((a) (obj)).b;
                d3 = d1 + d2;
                obj1 = new a(d3, (d1 - d3) + d2);
            }
        }
        a1 = a1.f(((a) (obj1)));
        obj = d;
        if (a1.b > ((a) (obj)).b || a1.b == ((a) (obj)).b && a1.c > ((a) (obj)).c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            a1 = a1.f(d);
            i = j + 1;
        } else
        {
            obj = e;
            if (a1.b < ((a) (obj)).b || a1.b == ((a) (obj)).b && a1.c < ((a) (obj)).c)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                a1 = a1.e(d);
                i = j - 1;
            } else
            {
                i = j;
            }
        }
        obj = new StringBuffer();
        j = 0;
        do
        {
            if (j > 31)
            {
                break;
            }
            if (flag && j == i + 1)
            {
                ((StringBuffer) (obj)).append('.');
            }
            int i1 = (int)a1.b;
            if (i1 < 0)
            {
                break;
            }
            boolean flag1 = false;
            char c1;
            int k;
            int j1;
            if (i1 > 9)
            {
                flag1 = true;
                c1 = '9';
            } else
            {
                c1 = (char)(i1 + 48);
            }
            ((StringBuffer) (obj)).append(c1);
            obj1 = a(i1).b();
            a1 = c(a1).d(((a) (obj1))).e(d);
            if (flag1)
            {
                a1.d(d);
            }
            i1 = 1;
            j1 = d(a1.b);
            k = i1;
            if (j1 < 0)
            {
                k = i1;
                if (Math.abs(j1) >= 31 - j)
                {
                    k = 0;
                }
            }
            if (k == 0)
            {
                break;
            }
            j++;
        } while (true);
        ai[0] = i;
        return ((StringBuffer) (obj)).toString();
    }

    private a b()
    {
        if (Double.isNaN(b))
        {
            return this;
        } else
        {
            return new a(-b, -c);
        }
    }

    private static a c(a a1)
    {
        return new a(a1);
    }

    private final void c(double d1)
    {
        b = d1;
        c = 0.0D;
    }

    private boolean c()
    {
        return b == 0.0D && c == 0.0D;
    }

    private static int d(double d1)
    {
        d1 = Math.abs(d1);
        int j = (int)Math.floor(Math.log(d1) / Math.log(10D));
        int i = j;
        if (Math.pow(10D, j) * 10D <= d1)
        {
            i = j + 1;
        }
        return i;
    }

    private a d(a a1)
    {
        return a(a1.b, a1.c);
    }

    private boolean d()
    {
        return b < 0.0D || b == 0.0D && c < 0.0D;
    }

    private a e(a a1)
    {
        if (Double.isNaN(a1.b))
        {
            return new a((0.0D / 0.0D), (0.0D / 0.0D));
        } else
        {
            return c(this).b(a1);
        }
    }

    private String e()
    {
        if (c())
        {
            return "0.0";
        }
        if (Double.isNaN(b))
        {
            return "NaN ";
        } else
        {
            return null;
        }
    }

    private a f(a a1)
    {
        double d1 = b / a1.b;
        double d2 = d1 * 134217729D;
        double d5 = a1.b * 134217729D;
        d2 -= d2 - d1;
        double d3 = d1 - d2;
        double d6 = a1.b;
        double d4 = a1.b * d1;
        d5 -= d5 - d6;
        d6 = a1.b - d5;
        d2 = (((b - d4 - (d2 * d6 + (d2 * d5 - d4) + d5 * d3 + d3 * d6)) + c) - a1.c * d1) / a1.b;
        d3 = d1 + d2;
        return new a(d3, (d1 - d3) + d2);
    }

    public final int a()
    {
        if (b <= 0.0D)
        {
            if (b < 0.0D)
            {
                return -1;
            }
            if (c <= 0.0D)
            {
                return c >= 0.0D ? 0 : -1;
            }
        }
        return 1;
    }

    public final a a(a a1)
    {
        if (Double.isNaN(b))
        {
            return this;
        } else
        {
            return a(-a1.b, -a1.c);
        }
    }

    public final a b(double d1)
    {
        double d2 = b + d1;
        double d3 = d2 - b;
        d3 = (d1 - d3) + (b - (d2 - d3)) + c;
        d1 = d2 + d3;
        d2 = (d2 - d1) + d3;
        b = d1 + d2;
        c = d2 + (d1 - b);
        return this;
    }

    public final a b(a a1)
    {
        double d1 = a1.b;
        double d2 = a1.c;
        double d3 = 134217729D * b;
        double d4 = b;
        double d6 = 134217729D * d1;
        d4 = d3 - (d3 - d4);
        double d5 = b - d4;
        d3 = b * d1;
        d6 -= d6 - d1;
        double d7 = d1 - d6;
        double d8 = b;
        d1 = d1 * c + d2 * d8 + (d4 * d7 + (d4 * d6 - d3) + d6 * d5 + d5 * d7);
        d2 = d3 + d1;
        b = d2;
        c = d1 + (d3 - d2);
        return this;
    }

    public final Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return obj;
    }

    public final int compareTo(Object obj)
    {
        obj = (a)obj;
        if (b >= ((a) (obj)).b)
        {
            if (b > ((a) (obj)).b)
            {
                return 1;
            }
            if (c >= ((a) (obj)).c)
            {
                return c <= ((a) (obj)).c ? 0 : 1;
            }
        }
        return -1;
    }

    public final String toString()
    {
        int i = d(b);
        if (i < -3 || i > 20) goto _L2; else goto _L1
_L1:
        String s3 = e();
        if (s3 == null) goto _L4; else goto _L3
_L3:
        return s3;
_L4:
        String s;
        int ai[] = new int[1];
        s3 = a(true, ai);
        i = ai[0] + 1;
        if (s3.charAt(0) != '.')
        {
            break; /* Loop/switch isn't completed */
        }
        s = (new StringBuilder("0")).append(s3).toString();
_L6:
        s3 = s;
        if (d())
        {
            return (new StringBuilder("-")).append(s).toString();
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (i < 0)
        {
            s = (new StringBuilder("0.")).append(a('0', -i)).append(s3).toString();
        } else
        {
            s = s3;
            if (s3.indexOf('.') == -1)
            {
                s = a('0', i - s3.length());
                s = (new StringBuilder()).append(s3).append(s).append(".0").toString();
            }
        }
          goto _L6
_L2:
        if (c())
        {
            return "0.0E0";
        }
        String s1 = e();
        s3 = s1;
        if (s1 == null)
        {
            int ai1[] = new int[1];
            String s4 = a(false, ai1);
            String s5 = (new StringBuilder("E")).append(ai1[0]).toString();
            if (s4.charAt(0) == '0')
            {
                throw new IllegalStateException((new StringBuilder("Found leading zero: ")).append(s4).toString());
            }
            String s2 = "";
            if (s4.length() > 1)
            {
                s2 = s4.substring(1);
            }
            s2 = (new StringBuilder()).append(s4.charAt(0)).append(".").append(s2).toString();
            if (d())
            {
                return (new StringBuilder("-")).append(s2).append(s5).toString();
            } else
            {
                return (new StringBuilder()).append(s2).append(s5).toString();
            }
        }
        if (true) goto _L3; else goto _L7
_L7:
    }

    static 
    {
        new a(3.1415926535897931D, 1.2246467991473532E-16D);
        new a(6.2831853071795862D, 2.4492935982947064E-16D);
        new a(1.5707963267948966D, 6.123233995736766E-17D);
        new a(2.7182818284590451D, 1.4456468917292502E-16D);
    }
}
