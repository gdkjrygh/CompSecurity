// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import com.whatsapp.DialogToastActivity;
import java.io.RandomAccessFile;

// Referenced classes of package com.whatsapp.util:
//            bi, a_

public class a8
{

    public static final a8 c;
    public static final a8 j;
    public static final a8 k;
    public static final a8 l;
    private static final String z[];
    double a;
    double b;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;
    double m;

    public a8(double d1, double d2, double d3, double d4, double d5, double d6, double d7, 
            double d8, double d9)
    {
        b = d5;
        m = d6;
        i = d7;
        h = d1;
        d = d2;
        a = d3;
        g = d4;
        e = d8;
        f = d9;
    }

    public static a8 a(RandomAccessFile randomaccessfile)
    {
        double d1 = bi.f(randomaccessfile);
        double d2 = bi.f(randomaccessfile);
        double d3 = bi.a(randomaccessfile);
        double d4 = bi.f(randomaccessfile);
        double d5 = bi.f(randomaccessfile);
        double d6 = bi.a(randomaccessfile);
        double d7 = bi.f(randomaccessfile);
        double d8 = bi.f(randomaccessfile);
        return new a8(d1, d2, d4, d5, d3, d6, bi.a(randomaccessfile), d7, d8);
    }

    public int a()
    {
        if (h == 0.0D && d == 1.0D && a == -1D && g == 0.0D)
        {
            return 90;
        }
        if (h == -1D && d == 0.0D && a == 0.0D && g == -1D)
        {
            return 180;
        }
        return h != 0.0D || d != -1D || a != 1.0D || g != 0.0D ? 0 : 270;
    }

    public boolean b()
    {
        return e != 0.0D || f != 0.0D;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a8)obj;
            if (Double.compare(((a8) (obj)).h, h) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).d, d) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).a, a) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).g, g) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).e, e) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).f, f) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).b, b) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).m, m) != 0)
            {
                return false;
            }
            if (Double.compare(((a8) (obj)).i, i) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int i1 = a_.c;
        long l3 = Double.doubleToLongBits(b);
        int j1 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(m);
        int k1 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(i);
        int l1 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(h);
        int i2 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(d);
        int j2 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(a);
        int k2 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(g);
        int l2 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(e);
        int i3 = (int)(l3 ^ l3 >>> 32);
        l3 = Double.doubleToLongBits(f);
        int j3 = (int)(l3 ^ l3 >>> 32);
        if (i1 != 0)
        {
            DialogToastActivity.g++;
        }
        return (((((((j1 * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3;
    }

    public String toString()
    {
        if (equals(c))
        {
            return z[11];
        }
        if (equals(j))
        {
            return z[5];
        }
        if (equals(l))
        {
            return z[2];
        }
        if (equals(k))
        {
            return z[12];
        } else
        {
            return (new StringBuilder()).append(z[6]).append(b).append(z[10]).append(m).append(z[0]).append(i).append(z[7]).append(h).append(z[3]).append(d).append(z[9]).append(a).append(z[4]).append(g).append(z[8]).append(e).append(z[1]).append(f).append('}').toString();
        }
    }

    static 
    {
        String as[];
        String as1[];
        Object obj;
        byte byte0;
        int i1;
        as1 = new String[13];
        i1 = 0;
        obj = "\036\036u\017";
        byte0 = -1;
        as = as1;
_L2:
        int j1;
        int k1;
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
                as[i1] = ((String) (obj));
                i1 = 1;
                obj = "\036\036vKe";
                byte0 = 0;
                as = as1;
                break;

            case 0: // '\0'
                as[i1] = ((String) (obj));
                i1 = 2;
                obj = "`QvS,W\0363\nh\202";
                byte0 = 1;
                as = as1;
                break;

            case 1: // '\001'
                as[i1] = ((String) (obj));
                i1 = 3;
                obj = "\036\036`\017";
                byte0 = 2;
                as = as1;
                break;

            case 2: // '\002'
                as[i1] = ((String) (obj));
                i1 = 4;
                obj = "\036\036f\017";
                byte0 = 3;
                as = as1;
                break;

            case 3: // '\003'
                as[i1] = ((String) (obj));
                i1 = 5;
                obj = "`QvS,W\036;\002\350";
                byte0 = 4;
                as = as1;
                break;

            case 4: // '\004'
                as[i1] = ((String) (obj));
                i1 = 6;
                obj = "\177_v@1JEw\017";
                byte0 = 5;
                as = as1;
                break;

            case 5: // '\005'
                as[i1] = ((String) (obj));
                i1 = 7;
                obj = "\036\036c\017";
                byte0 = 6;
                as = as1;
                break;

            case 6: // '\006'
                as[i1] = ((String) (obj));
                i1 = 8;
                obj = "\036\036vJe";
                byte0 = 7;
                as = as1;
                break;

            case 7: // '\007'
                as[i1] = ((String) (obj));
                i1 = 9;
                obj = "\036\036a\017";
                byte0 = 8;
                as = as1;
                break;

            case 8: // '\b'
                as[i1] = ((String) (obj));
                i1 = 10;
                obj = "\036\036t\017";
                byte0 = 9;
                as = as1;
                break;

            case 9: // '\t'
                as[i1] = ((String) (obj));
                i1 = 11;
                obj = "`QvS,W\0362\202";
                byte0 = 10;
                as = as1;
                break;

            case 10: // '\n'
                as[i1] = ((String) (obj));
                i1 = 12;
                obj = "`QvS,W\0360\005h\202";
                byte0 = 11;
                as = as1;
                break;

            case 11: // '\013'
                as[i1] = ((String) (obj));
                z = as1;
                c = new a8(1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
                j = new a8(0.0D, 1.0D, -1D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
                l = new a8(-1D, 0.0D, 0.0D, -1D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
                k = new a8(0.0D, -1D, 1.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 0.0D);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 476
    //                   0 499
    //                   1 506
    //                   2 513
    //                   3 519;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_519;
_L3:
        byte byte1 = 88;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 50;
          goto _L9
_L5:
        byte1 = 62;
          goto _L9
_L6:
        byte1 = 2;
          goto _L9
        byte1 = 50;
          goto _L9
    }
}
