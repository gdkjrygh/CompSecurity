// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.util.Collection;

// Referenced classes of package com.vividsolutions.jts.geom:
//            Coordinate, c

public final class a
{

    private static final Coordinate a[] = new Coordinate[0];

    public static int a(Coordinate acoordinate[])
    {
        for (int i = 0; i < acoordinate.length / 2; i++)
        {
            int j = acoordinate.length;
            j = acoordinate[i].compareTo(acoordinate[j - 1 - i]);
            if (j != 0)
            {
                return j;
            }
        }

        return 1;
    }

    public static void a(Coordinate acoordinate[], Coordinate coordinate)
    {
        int i = 0;
_L3:
        if (i >= acoordinate.length)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (!coordinate.equals(acoordinate[i])) goto _L2; else goto _L1
_L1:
        if (i < 0)
        {
            return;
        } else
        {
            coordinate = new Coordinate[acoordinate.length];
            System.arraycopy(acoordinate, i, coordinate, 0, acoordinate.length - i);
            System.arraycopy(acoordinate, 0, coordinate, acoordinate.length - i, i);
            System.arraycopy(coordinate, 0, acoordinate, 0, acoordinate.length);
            return;
        }
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public static Coordinate[] a(Collection collection)
    {
        return (Coordinate[])collection.toArray(a);
    }

    public static Coordinate[] b(Coordinate acoordinate[])
    {
        int i;
        boolean flag;
        flag = true;
        i = 1;
_L3:
        if (i >= acoordinate.length)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (!acoordinate[i - 1].equals(acoordinate[i])) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
_L4:
        if (i == 0)
        {
            return acoordinate;
        } else
        {
            return (new c(acoordinate, false)).a();
        }
_L2:
        i++;
          goto _L3
        i = 0;
          goto _L4
    }

    public static void c(Coordinate acoordinate[])
    {
        int j = acoordinate.length - 1;
        int k = j / 2;
        for (int i = 0; i <= k; i++)
        {
            Coordinate coordinate = acoordinate[i];
            acoordinate[i] = acoordinate[j - i];
            acoordinate[j - i] = coordinate;
        }

    }

    public static Coordinate d(Coordinate acoordinate[])
    {
        Coordinate coordinate = null;
        for (int i = 0; i < acoordinate.length;)
        {
            Coordinate coordinate1;
label0:
            {
                if (coordinate != null)
                {
                    coordinate1 = coordinate;
                    if (coordinate.compareTo(acoordinate[i]) <= 0)
                    {
                        break label0;
                    }
                }
                coordinate1 = acoordinate[i];
            }
            i++;
            coordinate = coordinate1;
        }

        return coordinate;
    }

}
