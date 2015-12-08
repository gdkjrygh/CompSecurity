// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;

import com.vividsolutions.jts.f.i;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.c.h;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.f;
import com.vividsolutions.jts.geom.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.a:
//            c, m, p

public class a
{

    public a()
    {
    }

    public static char a(int j)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown location value: ")).append(j).toString());

        case 2: // '\002'
            return 'e';

        case 1: // '\001'
            return 'b';

        case 0: // '\0'
            return 'i';

        case -1: 
            return '-';
        }
    }

    public static double a(double d1)
    {
        double d2;
        do
        {
            d2 = d1;
            if (d1 <= 3.1415926535897931D)
            {
                break;
            }
            d1 -= 6.2831853071795862D;
        } while (true);
        for (; d2 <= -3.1415926535897931D; d2 += 6.2831853071795862D) { }
        return d2;
    }

    public static double a(Coordinate coordinate, Coordinate coordinate1)
    {
        double d1 = coordinate1.x;
        double d2 = coordinate.x;
        return Math.atan2(coordinate1.y - coordinate.y, d1 - d2);
    }

    public static double a(d d1)
    {
        int k = d1.b();
        if (k < 3)
        {
            return 0.0D;
        }
        Coordinate coordinate = new Coordinate();
        Coordinate coordinate1 = new Coordinate();
        Coordinate coordinate2 = new Coordinate();
        d1.a(0, coordinate1);
        d1.a(1, coordinate2);
        double d3 = coordinate1.x;
        coordinate2.x = coordinate2.x - d3;
        double d2 = 0.0D;
        for (int j = 1; j < k - 1; j++)
        {
            coordinate.y = coordinate1.y;
            coordinate1.x = coordinate2.x;
            coordinate1.y = coordinate2.y;
            d1.a(j + 1, coordinate2);
            coordinate2.x = coordinate2.x - d3;
            d2 += coordinate1.x * (coordinate.y - coordinate2.y);
        }

        return d2 / 2D;
    }

    public static int a(char c1)
    {
        switch (Character.toUpperCase(c1))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown dimension symbol: ")).append(c1).toString());

        case 70: // 'F'
            return -1;

        case 84: // 'T'
            return -2;

        case 42: // '*'
            return -3;

        case 48: // '0'
            return 0;

        case 49: // '1'
            return 1;

        case 50: // '2'
            return 2;
        }
    }

    public static int a(double d1, double d2)
    {
        if (d1 < d2)
        {
            return -1;
        }
        return d1 <= d2 ? 0 : 1;
    }

    public static int a(double d1, double d2, double d3, double d4)
    {
        int j = 1;
        if (d1 != 0.0D && d4 != 0.0D) goto _L2; else goto _L1
_L1:
        if (d2 != 0.0D && d3 != 0.0D) goto _L4; else goto _L3
_L3:
        int k = 0;
_L11:
        return k;
_L4:
        if (d2 > 0.0D)
        {
            return d3 <= 0.0D ? 1 : -1;
        }
        return d3 <= 0.0D ? -1 : 1;
_L2:
        if (d2 == 0.0D || d3 == 0.0D)
        {
            if (d4 > 0.0D)
            {
                return d1 <= 0.0D ? -1 : 1;
            }
            return d1 <= 0.0D ? 1 : -1;
        }
        double d6;
        double d8;
        if (0.0D < d2)
        {
            if (0.0D < d4)
            {
                if (d2 > d4)
                {
                    j = -1;
                    double d5 = d2;
                    d2 = d4;
                    d4 = d3;
                    d3 = d2;
                    d2 = d1;
                    d1 = d5;
                } else
                {
                    double d7 = d2;
                    double d9 = d1;
                    d1 = d4;
                    d2 = d3;
                    d3 = d7;
                    d4 = d9;
                }
            } else
            if (d2 <= -d4)
            {
                j = -1;
                d3 = -d3;
                d8 = -d4;
                d4 = d2;
                d6 = d1;
                d1 = d8;
                d2 = d3;
                d3 = d4;
                d4 = d6;
            } else
            {
                d6 = -d3;
                d4 = -d4;
                d3 = d1;
                d1 = d2;
                d2 = d3;
                d3 = d4;
                d4 = d6;
            }
        } else
        if (0.0D < d4)
        {
            if (-d2 <= d4)
            {
                j = -1;
                d6 = -d1;
                d8 = -d2;
                d1 = d4;
                d2 = d3;
                d3 = d8;
                d4 = d6;
            } else
            {
                d6 = -d1;
                d1 = -d2;
                d2 = d6;
                d6 = d3;
                d3 = d4;
                d4 = d6;
            }
        } else
        if (d2 >= d4)
        {
            d6 = -d1;
            d8 = -d2;
            d2 = -d3;
            d1 = -d4;
            d3 = d8;
            d4 = d6;
        } else
        {
            j = -1;
            d8 = -d1;
            d6 = -d3;
            d1 = -d2;
            d3 = -d4;
            d2 = d8;
            d4 = d6;
        }
        if (0.0D >= d4) goto _L6; else goto _L5
_L5:
        k = j;
        if (0.0D >= d2)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = j;
        if (d4 > d2)
        {
            continue; /* Loop/switch isn't completed */
        }
        d6 = d3;
        d8 = d1;
_L8:
        d3 = Math.floor(d2 / d4);
        d1 = d2 - d3 * d4;
        d2 = d8 - d3 * d6;
        if (d2 < 0.0D)
        {
            return -j;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (0.0D < d2)
        {
            return -j;
        }
        if (d4 >= d2)
        {
            j = -j;
            d4 = -d4;
            d2 = -d2;
            d8 = d1;
            d6 = d3;
        } else
        {
            return -j;
        }
        if (true) goto _L8; else goto _L7
_L7:
        k = j;
        if (d2 > d6)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d4 > d1 + d1)
        {
            k = j;
            if (d6 < d2 + d2)
            {
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            if (d6 > d2 + d2)
            {
                return -j;
            }
            d1 = d4 - d1;
            d2 = d6 - d2;
            j = -j;
        }
        if (d2 == 0.0D)
        {
            if (d1 == 0.0D)
            {
                return 0;
            } else
            {
                return -j;
            }
        }
        k = j;
        if (d1 == 0.0D)
        {
            continue; /* Loop/switch isn't completed */
        }
        d8 = Math.floor(d4 / d1);
        d3 = d4 - d8 * d1;
        d6 -= d8 * d2;
        k = j;
        if (d6 < 0.0D)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d6 > d2)
        {
            return -j;
        }
        if (d1 > d3 + d3)
        {
            k = j;
            d4 = d6;
            if (d2 < d6 + d6)
            {
                return -j;
            }
        } else
        {
            k = j;
            if (d2 > d6 + d6)
            {
                continue; /* Loop/switch isn't completed */
            }
            d3 = d1 - d3;
            d4 = d2 - d6;
            k = -j;
        }
        if (d4 == 0.0D)
        {
            if (d3 == 0.0D)
            {
                return 0;
            }
            continue; /* Loop/switch isn't completed */
        }
        j = k;
        d8 = d2;
        d2 = d1;
        d6 = d4;
        d4 = d3;
        if (d3 != 0.0D) goto _L8; else goto _L9
_L9:
        return -k;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static int a(int j, int k)
    {
        if (j >= 0)
        {
            if (j > 0)
            {
                return 1;
            }
            if (k >= 0)
            {
                return k <= 0 ? 0 : 1;
            }
        }
        return -1;
    }

    public static int a(int j, Coordinate coordinate, Coordinate coordinate1)
    {
        if (coordinate.equals2D(coordinate1))
        {
            return 0;
        }
        int k = a(coordinate.x, coordinate1.x);
        int l = a(coordinate.y, coordinate1.y);
        switch (j)
        {
        default:
            a("invalid octant value");
            return 0;

        case 0: // '\0'
            return a(k, l);

        case 1: // '\001'
            return a(l, k);

        case 2: // '\002'
            return a(l, -k);

        case 3: // '\003'
            return a(-k, l);

        case 4: // '\004'
            return a(-k, -l);

        case 5: // '\005'
            return a(-l, -k);

        case 6: // '\006'
            return a(-l, k);

        case 7: // '\007'
            return a(k, -l);
        }
    }

    public static int a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2)
    {
        return com.vividsolutions.jts.a.c.a(coordinate, coordinate1, coordinate2);
    }

    private static int a(Coordinate acoordinate[], int j)
    {
        int k;
        for (k = j; k < acoordinate.length - 1 && acoordinate[k].equals2D(acoordinate[k + 1]); k++) { }
        if (k >= acoordinate.length - 1)
        {
            return acoordinate.length - 1;
        }
        k = b(acoordinate[k], acoordinate[k + 1]);
        for (j++; j < acoordinate.length && (acoordinate[j - 1].equals2D(acoordinate[j]) || b(acoordinate[j - 1], acoordinate[j]) == k); j++) { }
        return j - 1;
    }

    public static Coordinate a(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2, Coordinate coordinate3)
        throws m
    {
        double d1 = coordinate.y - coordinate1.y;
        double d6 = coordinate1.x - coordinate.x;
        double d2 = coordinate.x * coordinate1.y - coordinate1.x * coordinate.y;
        double d3 = coordinate2.y - coordinate3.y;
        double d7 = coordinate3.x - coordinate2.x;
        double d4 = coordinate2.x * coordinate3.y - coordinate3.x * coordinate2.y;
        double d5 = d1 * d7 - d6 * d3;
        d6 = (d6 * d4 - d7 * d2) / d5;
        d1 = (d2 * d3 - d4 * d1) / d5;
        if (Double.isNaN(d6) || Double.isInfinite(d6) || Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new m();
        } else
        {
            return new Coordinate(d6, d1);
        }
    }

    public static d a(f f1, d d1)
    {
        boolean flag = true;
        int j = d1.b();
        if (j != 0)
        {
            if (j <= 3)
            {
                return a(f1, d1, 4);
            }
            if (d1.a(0, 0) != d1.a(j - 1, 0) || d1.a(0, 1) != d1.a(j - 1, 1))
            {
                flag = false;
            }
            if (!flag)
            {
                return a(f1, d1, j + 1);
            }
        }
        return d1;
    }

    private static d a(f f1, d d1, int j)
    {
        f1 = f1.a(j, d1.a());
        int k = d1.b();
        a(d1, 0, ((d) (f1)), 0, k);
        for (; k < j; k++)
        {
            a(d1, 0, ((d) (f1)), k, 1);
        }

        return f1;
    }

    public static List a(com.vividsolutions.jts.geom.i j)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = h.b(j).iterator(); iterator.hasNext(); arraylist.add(new i(((n)iterator.next()).getCoordinates(), j))) { }
        return arraylist;
    }

    public static List a(Coordinate acoordinate[], Object obj)
    {
        ArrayList arraylist = new ArrayList();
        int ai[] = b(acoordinate);
        for (int j = 0; j < ai.length - 1; j++)
        {
            arraylist.add(new com.vividsolutions.jts.c.b.a(acoordinate, ai[j], ai[j + 1], obj));
        }

        return arraylist;
    }

    public static void a(double d1, byte abyte0[], int j)
    {
        long l = Double.doubleToLongBits(d1);
        if (j == 1)
        {
            abyte0[0] = (byte)(int)(l >> 56);
            abyte0[1] = (byte)(int)(l >> 48);
            abyte0[2] = (byte)(int)(l >> 40);
            abyte0[3] = (byte)(int)(l >> 32);
            abyte0[4] = (byte)(int)(l >> 24);
            abyte0[5] = (byte)(int)(l >> 16);
            abyte0[6] = (byte)(int)(l >> 8);
            abyte0[7] = (byte)(int)l;
            return;
        } else
        {
            abyte0[0] = (byte)(int)l;
            abyte0[1] = (byte)(int)(l >> 8);
            abyte0[2] = (byte)(int)(l >> 16);
            abyte0[3] = (byte)(int)(l >> 24);
            abyte0[4] = (byte)(int)(l >> 32);
            abyte0[5] = (byte)(int)(l >> 40);
            abyte0[6] = (byte)(int)(l >> 48);
            abyte0[7] = (byte)(int)(l >> 56);
            return;
        }
    }

    public static void a(d d1, int j, d d2, int k, int l)
    {
        for (int i1 = 0; i1 < l; i1++)
        {
            for (int j1 = 0; j1 < d1.a(); j1++)
            {
                d2.a(k + i1, j1, d1.a(j + i1, j1));
            }

        }

    }

    public static void a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder("Should never reach here");
        if (s != null)
        {
            s = (new StringBuilder(": ")).append(s).toString();
        } else
        {
            s = "";
        }
        throw new com.vividsolutions.jts.i.a(stringbuilder.append(s).toString());
    }

    public static void a(boolean flag, String s)
    {
        if (!flag)
        {
            if (s == null)
            {
                throw new com.vividsolutions.jts.i.a();
            } else
            {
                throw new com.vividsolutions.jts.i.a(s);
            }
        } else
        {
            return;
        }
    }

    public static boolean a(Coordinate coordinate, Coordinate acoordinate[])
    {
        return b(coordinate, acoordinate) != 2;
    }

    public static boolean a(Coordinate acoordinate[])
    {
        boolean flag = true;
        int i1 = acoordinate.length - 1;
        if (i1 < 3)
        {
            throw new IllegalArgumentException("Ring has fewer than 3 points, so orientation cannot be determined");
        }
        Coordinate coordinate = acoordinate[0];
        int k = 1;
        int j = 0;
        for (; k <= i1; k++)
        {
            Coordinate coordinate1 = acoordinate[k];
            if (coordinate1.y > coordinate.y)
            {
                j = k;
                coordinate = coordinate1;
            }
        }

        int l = j;
        do
        {
            l--;
            k = l;
            if (l < 0)
            {
                k = i1;
            }
            if (!acoordinate[k].equals2D(coordinate))
            {
                break;
            }
            l = k;
        } while (k != j);
        l = j;
        int j1;
        do
        {
            j1 = (l + 1) % i1;
            if (!acoordinate[j1].equals2D(coordinate))
            {
                break;
            }
            l = j1;
        } while (j1 != j);
        Coordinate coordinate2 = acoordinate[k];
        acoordinate = acoordinate[j1];
        if (coordinate2.equals2D(coordinate) || acoordinate.equals2D(coordinate) || coordinate2.equals2D(acoordinate))
        {
            return false;
        }
        j = com.vividsolutions.jts.a.c.a(coordinate2, coordinate, acoordinate);
        if (j == 0)
        {
            return coordinate2.x > ((Coordinate) (acoordinate)).x;
        }
        if (j <= 0)
        {
            flag = false;
        }
        return flag;
    }

    public static int[] a(List list)
    {
        int ai[] = new int[list.size()];
        for (int j = 0; j < ai.length; j++)
        {
            ai[j] = ((Integer)list.get(j)).intValue();
        }

        return ai;
    }

    public static double b(Coordinate coordinate, Coordinate coordinate1, Coordinate coordinate2)
    {
        if (coordinate1.x == coordinate2.x && coordinate1.y == coordinate2.y)
        {
            return coordinate.distance(coordinate1);
        }
        double d1 = (coordinate2.x - coordinate1.x) * (coordinate2.x - coordinate1.x) + (coordinate2.y - coordinate1.y) * (coordinate2.y - coordinate1.y);
        double d2 = ((coordinate.x - coordinate1.x) * (coordinate2.x - coordinate1.x) + (coordinate.y - coordinate1.y) * (coordinate2.y - coordinate1.y)) / d1;
        if (d2 <= 0.0D)
        {
            return coordinate.distance(coordinate1);
        }
        if (d2 >= 1.0D)
        {
            return coordinate.distance(coordinate2);
        } else
        {
            double d3 = Math.abs(((coordinate1.y - coordinate.y) * (coordinate2.x - coordinate1.x) - (coordinate1.x - coordinate.x) * (coordinate2.y - coordinate1.y)) / d1);
            return Math.sqrt(d1) * d3;
        }
    }

    public static int b(int j)
    {
        int k;
        if (j == 1)
        {
            k = 2;
        } else
        {
            k = j;
            if (j == 2)
            {
                return 1;
            }
        }
        return k;
    }

    public static int b(Coordinate coordinate, Coordinate coordinate1)
    {
        if (coordinate1.x == coordinate.x && coordinate1.y == coordinate.y)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot compute the quadrant for two identical points ")).append(coordinate).toString());
        }
        if (coordinate1.x >= coordinate.x)
        {
            return coordinate1.y < coordinate.y ? 3 : 0;
        }
        return coordinate1.y < coordinate.y ? 2 : 1;
    }

    public static int b(Coordinate coordinate, Coordinate acoordinate[])
    {
        coordinate = new p(coordinate);
        int j = 1;
        do
        {
            if (j >= acoordinate.length)
            {
                break;
            }
            coordinate.a(acoordinate[j], acoordinate[j - 1]);
            if (coordinate.a())
            {
                break;
            }
            j++;
        } while (true);
        return coordinate.b();
    }

    public static void b(d d1)
    {
        int l = d1.b() - 1;
        int i1 = l / 2;
        for (int j = 0; j <= i1; j++)
        {
            int j1 = l - j;
            if (j == j1)
            {
                continue;
            }
            for (int k = 0; k < d1.a(); k++)
            {
                double d2 = d1.a(j, k);
                d1.a(j, k, d1.a(j1, k));
                d1.a(j1, k, d2);
            }

        }

    }

    public static int[] b(Coordinate acoordinate[])
    {
        int j = 0;
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Integer(0));
        int k;
        do
        {
            k = a(acoordinate, j);
            arraylist.add(new Integer(k));
            j = k;
        } while (k < acoordinate.length - 1);
        return a(arraylist);
    }

    public static boolean c(int j)
    {
        return j == 0 || j == 1;
    }
}
