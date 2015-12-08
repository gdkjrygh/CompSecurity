// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.miteksystems.misnap:
//            a

class MitekAnalyzer
{

    private float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private List G;
    private byte H[];
    private Rect I;
    private Handler J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private float Q;
    String a;
    int b;
    float c;
    float d;
    float e;
    List f;
    List g;
    List h;
    boolean i;
    int j[];
    int k[];
    Rect l;
    Rect m;
    Rect n;
    List o;
    List p;
    int q[];
    private boolean r;
    private ArrayList s;
    private List t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    MitekAnalyzer(int i1, int j1, int k1, int l1, int i2, String s1)
    {
        r = false;
        B = 0;
        K = true;
        Q = 0.0F;
        a = null;
        b = 0;
        c = 0.0F;
        d = 0.0F;
        e = 0.0F;
        g = new ArrayList();
        h = new ArrayList();
        j = new int[16];
        k = new int[8];
        l = new Rect();
        m = new Rect();
        n = new Rect();
        o = new ArrayList();
        p = new ArrayList();
        q = new int[256];
        s = new ArrayList();
        L = i1;
        M = i2;
        N = j1;
        O = k1;
        P = l1;
        a = s1;
        J = new Handler();
    }

    private static float a(List list)
    {
        if (list.size() != 5)
        {
            return 0.0F;
        }
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        do
        {
            if (i1 >= 4)
            {
                Collections.sort(arraylist);
                return (float)Math.sqrt(((Float)arraylist.get(0)).floatValue());
            }
            int j1 = (i1 + 1) % 4;
            float f1 = ((Point)list.get(i1)).x - ((Point)list.get(j1)).x;
            float f2 = ((Point)list.get(i1)).y - ((Point)list.get(j1)).y;
            arraylist.add(Float.valueOf(f2 * f2 + f1 * f1));
            i1++;
        } while (true);
    }

    private List b(byte abyte0[], int i1, int j1)
    {
        findCandidatePoints(abyte0, k, j, i1);
        if (o.size() != 0) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        if (k1 < 5) goto _L3; else goto _L2
_L2:
        k1 = 0;
_L5:
        if (k1 >= 4)
        {
            ((Point)o.get(4)).x = i1;
            ((Point)o.get(4)).y = j1;
            return o;
        }
        break MISSING_BLOCK_LABEL_111;
_L3:
        o.add(new Point(0, 0));
        k1++;
          goto _L4
        ((Point)o.get(k1)).x = j[k1 * 2];
        ((Point)o.get(k1)).y = j[k1 * 2 + 1];
        k1++;
          goto _L5
    }

    private boolean b(List list)
    {
        if (list == null || list.size() != 5) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        float f1;
        float f2;
        float f3;
        Object obj;
        float af[];
        float af1[];
        float af2[];
        if (i1 >= 4)
        {
            i1 = 0;
        } else
        {
label0:
            {
                obj = (Point)list.get(i1);
                if (((Point) (obj)).x > 1 && ((Point) (obj)).x < C - 1 && ((Point) (obj)).y > 1 && ((Point) (obj)).y < D - 1)
                {
                    break label0;
                }
                i1 = 1;
            }
        }
_L9:
        if (i1 != 0) goto _L2; else goto _L3
_L3:
        obj = new float[4];
        obj;
        obj[0] = 0.0F;
        obj[1] = 0.0F;
        obj[2] = 0.0F;
        obj[3] = 0.0F;
        af = new float[4];
        af;
        af[0] = 0.0F;
        af[1] = 0.0F;
        af[2] = 0.0F;
        af[3] = 0.0F;
        af1 = new float[4];
        af1;
        af1[0] = 0.0F;
        af1[1] = 0.0F;
        af1[2] = 0.0F;
        af1[3] = 0.0F;
        af2 = new float[4];
        af2;
        af2[0] = 0.0F;
        af2[1] = 0.0F;
        af2[2] = 0.0F;
        af2[3] = 0.0F;
        i1 = ((Point)list.get(0)).x;
        int j1 = ((Point)list.get(1)).x;
        int k1 = ((Point)list.get(2)).x;
        f2 = ((Point)list.get(3)).x + (i1 + j1 + k1) >> 2;
        i1 = ((Point)list.get(0)).y;
        j1 = ((Point)list.get(1)).y;
        k1 = ((Point)list.get(2)).y;
        f3 = ((Point)list.get(3)).y + (i1 + j1 + k1) >> 2;
        f1 = 0.0F;
        i1 = 0;
_L7:
        if (i1 < 4) goto _L5; else goto _L4
_L4:
        f1 *= 0.25F;
        i1 = 0;
_L8:
        if (i1 >= 4)
        {
            i1 = 1;
        } else
        {
label1:
            {
                double d1 = af[i1];
                double d2 = f1;
                double d3 = f1;
                boolean flag;
                if (Math.abs(d1 - d2) < 0.10000000000000001D * d3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label1;
                }
                i1 = 0;
            }
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_554;
        }
_L2:
        return false;
        i1++;
          goto _L6
_L5:
        af1[i1] = f2 - (float)((Point)list.get(i1)).x;
        af2[i1] = f3 - (float)((Point)list.get(i1)).y;
        obj[i1] = af1[i1] * af1[i1] + af2[i1] * af2[i1];
        af[i1] = (float)Math.sqrt(obj[i1]);
        f1 += af[i1];
        i1++;
          goto _L7
        i1++;
          goto _L8
        return true;
          goto _L9
    }

    private Rect c(List list)
    {
        l.top = 0x7fffffff;
        l.bottom = 0x80000000;
        l.left = 0x7fffffff;
        l.right = 0x80000000;
        int i1 = 0;
        do
        {
            if (i1 >= 4)
            {
                return l;
            }
            Point point = (Point)list.get(i1);
            if (point.x > l.right)
            {
                l.right = point.x + 0;
            }
            if (point.x < l.left)
            {
                l.left = point.x + 0;
            }
            if (point.y > l.bottom)
            {
                l.bottom = point.y + 0;
            }
            if (point.y < l.top)
            {
                l.top = point.y + 0;
            }
            i1++;
        } while (true);
    }

    private static double d(List list)
    {
        double d1 = 0.0D;
        int i1 = 0;
        do
        {
            if (i1 >= 4)
            {
                return Math.abs(0.5D * d1);
            }
            int j1 = (i1 + 1) % 4;
            int k1 = ((Point)list.get(i1)).x;
            double d2 = ((Point)list.get(j1)).y * k1;
            k1 = ((Point)list.get(i1)).y;
            d1 = (d1 + d2) - (double)(((Point)list.get(j1)).x * k1);
            i1++;
        } while (true);
    }

    private static double e(List list)
    {
        double d1;
        double d2;
        int i1;
        d1 = ((Point)list.get(0)).x;
        d2 = ((Point)list.get(0)).x;
        i1 = 1;
_L2:
        if (i1 >= 4)
        {
            return d2 - d1;
        }
        if ((double)((Point)list.get(i1)).x >= d1)
        {
            break; /* Loop/switch isn't completed */
        }
        double d3 = ((Point)list.get(i1)).x;
        d1 = d2;
        d2 = d3;
_L3:
        i1++;
        double d4 = d2;
        d2 = d1;
        d1 = d4;
        if (true) goto _L2; else goto _L1
_L1:
        if ((double)((Point)list.get(i1)).x > d2)
        {
            double d5 = ((Point)list.get(i1)).x;
            d2 = d1;
            d1 = d5;
        } else
        {
            double d6 = d1;
            d1 = d2;
            d2 = d6;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private static double f(List list)
    {
        double d1;
        double d2;
        int i1;
        d1 = ((Point)list.get(0)).y;
        d2 = ((Point)list.get(0)).y;
        i1 = 1;
_L2:
        if (i1 >= 4)
        {
            return d2 - d1;
        }
        if ((double)((Point)list.get(i1)).y >= d1)
        {
            break; /* Loop/switch isn't completed */
        }
        double d3 = ((Point)list.get(i1)).y;
        d1 = d2;
        d2 = d3;
_L3:
        i1++;
        double d4 = d2;
        d2 = d1;
        d1 = d4;
        if (true) goto _L2; else goto _L1
_L1:
        if ((double)((Point)list.get(i1)).y > d2)
        {
            double d5 = ((Point)list.get(i1)).y;
            d2 = d1;
            d1 = d5;
        } else
        {
            double d6 = d1;
            d1 = d2;
            d2 = d6;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private native void findCandidatePoints(byte abyte0[], int ai[], int ai1[], int i1);

    private native int getOOFscoreGray(byte abyte0[], int ai[]);

    private native void invertY(byte abyte0[], int i1, int j1, int k1);

    private native void preFilter(byte abyte0[], int ai[], int i1, int j1, int k1, int l1);

    private void r()
    {
        Iterator iterator = s.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((a)iterator.next()).a(this);
        } while (true);
    }

    private native void statistics(byte abyte0[], int ai[], int i1, int j1, int k1, int l1, int i2, 
            int j2);

    final void a(a a1)
    {
        s.add(a1);
    }

    final void a(byte abyte0[], int i1, int j1)
    {
        long al[];
label0:
        {
            if (K && !r && !i)
            {
                C = i1;
                D = j1;
                H = abyte0;
                K = false;
                al = new long[7];
                al[0] = System.nanoTime();
                if (H != null)
                {
                    break label0;
                }
                p();
                o();
            }
            return;
        }
        p();
        abyte0 = H;
        i1 = C;
        j1 = D;
        preFilter(abyte0, k, i1, j1, 1, i1);
        E = k[1];
        F = k[2];
        al[1] = System.nanoTime();
        t = b(H, C, D);
        al[2] = System.nanoTime();
        (new StringBuilder("Points:")).append(t.get(0)).append(",").append(t.get(1)).append(",").append(t.get(2)).append(",").append(t.get(3)).toString();
        abyte0 = t;
        i1 = ((Point)abyte0.get(0)).x;
        j1 = ((Point)abyte0.get(1)).x;
        int k1 = ((Point)abyte0.get(2)).x;
        int i2 = ((Point)abyte0.get(3)).x;
        int k2 = ((Point)abyte0.get(0)).y;
        int i3 = ((Point)abyte0.get(1)).y;
        int k3 = ((Point)abyte0.get(2)).y;
        abyte0 = new Point(i2 + (i1 + j1 + k1) >> 2, ((Point)abyte0.get(3)).y + (k2 + i3 + k3) >> 2);
        float f3 = 0.7F * a(t);
        float f1 = f3;
        if (f3 == 0.0F)
        {
            f1 = 40F;
            abyte0 = new Point(C / 2, D / 2);
        }
        i1 = Math.max((int)((float)((Point) (abyte0)).x - f1 / 2.0F), 0);
        j1 = Math.max((int)((float)((Point) (abyte0)).y - f1 / 2.0F), 0);
        k1 = Math.min((int)((float)((Point) (abyte0)).x + f1 / 2.0F), C - 1);
        f3 = ((Point) (abyte0)).y;
        abyte0 = new Rect(i1, j1, k1, Math.min((int)(f1 / 2.0F + f3), D - 1));
        byte abyte1[] = H;
        i1 = C;
        j1 = D;
        int ai[] = new int[4];
        p.clear();
        statistics(abyte1, ai, i1, j1, ((Rect) (abyte0)).left, ((Rect) (abyte0)).top, ((Rect) (abyte0)).right, ((Rect) (abyte0)).bottom);
        p.add(Integer.valueOf(ai[0]));
        p.add(Integer.valueOf(ai[1]));
        p.add(Integer.valueOf(ai[2]));
        p.add(Integer.valueOf(ai[3]));
        G = p;
        if (f != null) goto _L2; else goto _L1
_L1:
        f = new ArrayList();
        i1 = 0;
_L5:
        if (i1 < G.size()) goto _L3; else goto _L2
_L2:
        abyte0 = f;
        float f2 = ((Integer)f.get(0)).intValue();
        abyte0.set(0, Integer.valueOf((int)((float)((Integer)G.get(0)).intValue() * 0.1F + 0.9F * f2)));
        abyte0 = f;
        f2 = ((Integer)f.get(1)).intValue();
        abyte0.set(1, Integer.valueOf((int)((float)((Integer)G.get(1)).intValue() * 0.1F + 0.9F * f2)));
        w = (((Integer)f.get(0)).intValue() * 1000) / 255;
        boolean flag1 = b(t);
        boolean flag = flag1;
        if (!flag1)
        {
            invertY(H, E, F, E);
            t = b(H, C, D);
            al[3] = System.nanoTime();
            boolean flag2 = b(t);
            flag = flag2;
            if (!flag2)
            {
                b = 0;
                if (t != null)
                {
                    t.clear();
                }
                z = 0;
                y = 0;
                v = 0;
                flag = flag2;
            }
        }
        if (flag)
        {
            al[4] = System.nanoTime();
            I = c(t);
            double d1 = d(t);
            double d2 = e(t);
            double d3 = f(t);
            v = (int)Math.abs((1000D * d1) / (double)(C * D));
            y = (int)Math.abs(d2 * 1000D) / C;
            z = (int)Math.abs(1000D * d3) / D;
            abyte0 = I;
            i1 = ((Rect) (abyte0)).bottom;
            j1 = ((Rect) (abyte0)).top;
            d2 = (((Rect) (abyte0)).right - ((Rect) (abyte0)).left) * (i1 - j1);
            u = (int)(Math.abs((d2 - d1) / d2) * 1000D);
            abyte0 = H;
            i1 = C;
            j1 = I.left;
            int l1 = I.top;
            int j2 = I.right;
            int l2 = I.left;
            int j3 = I.bottom;
            int l3 = I.top;
            String s1 = a;
            if (!s1.contains("ACH") && !s1.contains("CheckFront") && !s1.contains("CheckBack") && !s1.contains("Auto") && !s1.contains("Balance") && !s1.contains("Bill") && !s1.contains("Business") && !s1.contains("License") && !s1.contains("VIN"))
            {
                s1.contains("W2");
            }
            x = getOOFscoreGray(abyte0, new int[] {
                j2 - l2, j3 - l3, 0, 0, j1, l1, i1
            });
            x = x;
        }
        c = 0.4F * c + 0.6F * (float)v;
        d = 0.4F * d + 0.6F * (float)y;
        e = 0.4F * e + 0.6F * (float)z;
        r();
        K = true;
        al[5] = System.nanoTime();
        i1 = b;
        return;
_L3:
        f.add((Integer)G.get(i1));
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final boolean a()
    {
        return u < N;
    }

    final boolean a(int i1)
    {
        return w > i1;
    }

    final void b(a a1)
    {
        int i1 = s.indexOf(a1);
        if (i1 >= 0)
        {
            s.remove(i1);
        }
    }

    final boolean b()
    {
        return c > (float)L;
    }

    final boolean c()
    {
        return d > (float)M;
    }

    final boolean d()
    {
        return w > O;
    }

    final boolean e()
    {
        return x > P;
    }

    final int f()
    {
        return u;
    }

    final int g()
    {
        return (int)c;
    }

    final int h()
    {
        return (int)d;
    }

    final int i()
    {
        return (int)e;
    }

    final int j()
    {
        return w;
    }

    final int k()
    {
        return x;
    }

    final List l()
    {
        return t;
    }

    final int m()
    {
        return L;
    }

    final int n()
    {
        return M;
    }

    final void o()
    {
        u = 1000;
        A = 1000F;
        H = null;
        K = true;
    }

    final void p()
    {
        v = 0;
        y = 0;
        z = 0;
        w = 0;
        x = 0;
        if (t != null && t.size() > 0)
        {
            t.clear();
        }
    }

    final void q()
    {
        r = true;
    }

    static 
    {
        System.loadLibrary("mitek");
    }
}
