// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;
import java.lang.reflect.Array;

public class IntersectionMatrix
    implements Cloneable
{

    private int a[][];

    public IntersectionMatrix()
    {
        a = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            3, 3
        });
        setAll(-1);
    }

    public IntersectionMatrix(IntersectionMatrix intersectionmatrix)
    {
        this();
        a[0][0] = intersectionmatrix.a[0][0];
        a[0][1] = intersectionmatrix.a[0][1];
        a[0][2] = intersectionmatrix.a[0][2];
        a[1][0] = intersectionmatrix.a[1][0];
        a[1][1] = intersectionmatrix.a[1][1];
        a[1][2] = intersectionmatrix.a[1][2];
        a[2][0] = intersectionmatrix.a[2][0];
        a[2][1] = intersectionmatrix.a[2][1];
        a[2][2] = intersectionmatrix.a[2][2];
    }

    public IntersectionMatrix(String s)
    {
        this();
        set(s);
    }

    public static boolean isTrue(int i)
    {
        return i >= 0 || i == -2;
    }

    public static boolean matches(int i, char c)
    {
        while (c == '*' || c == 'T' && (i >= 0 || i == -2) || c == 'F' && i == -1 || c == '0' && i == 0 || c == '1' && i == 1 || c == '2' && i == 2) 
        {
            return true;
        }
        return false;
    }

    public static boolean matches(String s, String s1)
    {
        return (new IntersectionMatrix(s)).matches(s1);
    }

    public void add(IntersectionMatrix intersectionmatrix)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                setAtLeast(i, j, intersectionmatrix.get(i, j));
            }

        }

    }

    public int get(int i, int j)
    {
        return a[i][j];
    }

    public boolean isContains()
    {
        return isTrue(a[0][0]) && a[2][0] == -1 && a[2][1] == -1;
    }

    public boolean isCoveredBy()
    {
        boolean flag;
        if (isTrue(a[0][0]) || isTrue(a[0][1]) || isTrue(a[1][0]) || isTrue(a[1][1]))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && a[0][2] == -1 && a[1][2] == -1;
    }

    public boolean isCovers()
    {
        boolean flag;
        if (isTrue(a[0][0]) || isTrue(a[0][1]) || isTrue(a[1][0]) || isTrue(a[1][1]))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && a[2][0] == -1 && a[2][1] == -1;
    }

    public boolean isCrosses(int i, int j)
    {
        if ((i != 0 || j != 1) && (i != 0 || j != 2) && (i != 1 || j != 2)) goto _L2; else goto _L1
_L1:
        if (!isTrue(a[0][0]) || !isTrue(a[0][2])) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if ((i != 1 || j != 0) && (i != 2 || j != 0) && (i != 2 || j != 1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!isTrue(a[0][0]) || !isTrue(a[2][0]))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (i == 1 && j == 1)
        {
            if (a[0][0] != 0)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    public boolean isDisjoint()
    {
        return a[0][0] == -1 && a[0][1] == -1 && a[1][0] == -1 && a[1][1] == -1;
    }

    public boolean isEquals(int i, int j)
    {
        while (i != j || !isTrue(a[0][0]) || a[0][2] != -1 || a[1][2] != -1 || a[2][0] != -1 || a[2][1] != -1) 
        {
            return false;
        }
        return true;
    }

    public boolean isIntersects()
    {
        return !isDisjoint();
    }

    public boolean isOverlaps(int i, int j)
    {
        if ((i != 0 || j != 0) && (i != 2 || j != 2)) goto _L2; else goto _L1
_L1:
        if (!isTrue(a[0][0]) || !isTrue(a[0][2]) || !isTrue(a[2][0])) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i == 1 && j == 1)
        {
            if (a[0][0] != 1 || !isTrue(a[0][2]) || !isTrue(a[2][0]))
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isTouches(int i, int j)
    {
        boolean flag1 = true;
        if (i <= j) goto _L2; else goto _L1
_L1:
        boolean flag = isTouches(j, i);
_L4:
        return flag;
_L2:
        if ((i != 2 || j != 2) && (i != 1 || j != 1) && (i != 1 || j != 2) && (i != 0 || j != 2) && (i != 0 || j != 1))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (a[0][0] != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (isTrue(a[0][1])) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (isTrue(a[1][0])) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (isTrue(a[1][1])) goto _L4; else goto _L6
_L6:
        return false;
        return false;
    }

    public boolean isWithin()
    {
        return isTrue(a[0][0]) && a[0][2] == -1 && a[1][2] == -1;
    }

    public boolean matches(String s)
    {
        if (s.length() != 9)
        {
            throw new IllegalArgumentException((new StringBuilder("Should be length 9: ")).append(s).toString());
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (!matches(a[i][j], s.charAt(i * 3 + j)))
                {
                    return false;
                }
            }

        }

        return true;
    }

    public void set(int i, int j, int k)
    {
        a[i][j] = k;
    }

    public void set(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            int j = i / 3;
            a[j][i % 3] = com.vividsolutions.jts.a.a.a(s.charAt(i));
        }

    }

    public void setAll(int i)
    {
        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                a[j][k] = i;
            }

        }

    }

    public void setAtLeast(int i, int j, int k)
    {
        if (a[i][j] < k)
        {
            a[i][j] = k;
        }
    }

    public void setAtLeast(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            setAtLeast(i / 3, i % 3, com.vividsolutions.jts.a.a.a(s.charAt(i)));
        }

    }

    public void setAtLeastIfValid(int i, int j, int k)
    {
        if (i >= 0 && j >= 0)
        {
            setAtLeast(i, j, k);
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer;
        int i;
        stringbuffer = new StringBuffer("123456789");
        i = 0;
_L12:
        int j;
        if (i >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L9:
        int k;
        if (j >= 3)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        k = a[i][j];
        k;
        JVM INSTR tableswitch -3 2: default 76
    //                   -3 130
    //                   -2 124
    //                   -1 101
    //                   0 136
    //                   1 142
    //                   2 148;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_148;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown dimension value: ")).append(k).toString());
_L4:
        char c = 'F';
_L10:
        stringbuffer.setCharAt(i * 3 + j, c);
        j++;
        if (true) goto _L9; else goto _L8
_L8:
        c = 'T';
          goto _L10
_L2:
        c = '*';
          goto _L10
_L5:
        c = '0';
          goto _L10
_L6:
        c = '1';
          goto _L10
        c = '2';
          goto _L10
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        return stringbuffer.toString();
    }

    public IntersectionMatrix transpose()
    {
        int i = a[1][0];
        a[1][0] = a[0][1];
        a[0][1] = i;
        i = a[2][0];
        a[2][0] = a[0][2];
        a[0][2] = i;
        i = a[2][1];
        a[2][1] = a[1][2];
        a[1][2] = i;
        return this;
    }
}
