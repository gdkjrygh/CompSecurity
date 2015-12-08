// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            v, dm, dl, ak

public final class do
{
    public static final class a
    {

        private final int a;
        private final int b;

        public final int a()
        {
            return a;
        }

        public final int b()
        {
            return b;
        }

        a(int i, int j)
        {
            a = i;
            b = j;
        }
    }

    public static final class b
    {

        private final int a;
        private final a b[];

        public final int a()
        {
            return a;
        }

        public final a[] b()
        {
            return b;
        }

        b(int i, a a1)
        {
            a = i;
            b = (new a[] {
                a1
            });
        }

        b(int i, a a1, a a2)
        {
            a = i;
            b = (new a[] {
                a1, a2
            });
        }
    }


    private static final int a[] = {
        31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 0x10b78, 
        0x1145d, 0x12a17, 0x13532, 0x149a6, 0x15683, 0x168c9, 0x177ec, 0x18ec4, 0x191e1, 0x1afab, 
        0x1b08e, 0x1cc1a, 0x1d33f, 0x1ed75, 0x1f250, 0x209d5, 0x216f0, 0x228ba, 0x2379f, 0x24b0b, 
        0x2542e, 0x26a64, 0x27541, 0x28c69
    };
    private static final do b[];
    private final int c;
    private final int d[];
    private final b e[];
    private final int f;

    private do(int i, int ai[], b b1, b b2, b b3, b b4)
    {
        boolean flag = false;
        super();
        c = i;
        d = ai;
        e = (new b[] {
            b1, b2, b3, b4
        });
        int l = b1.a();
        ai = b1.b();
        int j = 0;
        for (i = ((flag) ? 1 : 0); i < ai.length; i++)
        {
            b1 = ai[i];
            int k = b1.a();
            j += (b1.b() + l) * k;
        }

        f = j;
    }

    public static do a(int i)
        throws v
    {
        if (i % 4 != 1)
        {
            throw v.a();
        }
        do do1;
        try
        {
            do1 = b(i - 17 >> 2);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw v.a();
        }
        return do1;
    }

    public static do b(int i)
    {
        if (i <= 0 || i > 40)
        {
            throw new IllegalArgumentException();
        } else
        {
            return b[i - 1];
        }
    }

    static do c(int i)
    {
        int j = 0;
        int k = 0x7fffffff;
        int i1 = 0;
        while (j < a.length) 
        {
            int l = a[j];
            if (l == i)
            {
                return b(j + 7);
            }
            int j1 = dm.a(i, l);
            l = k;
            if (j1 < k)
            {
                i1 = j + 7;
                l = j1;
            }
            j++;
            k = l;
        }
        if (k <= 3)
        {
            return b(i1);
        } else
        {
            return null;
        }
    }

    public final int a()
    {
        return c;
    }

    public final b a(dl dl1)
    {
        return e[dl1.a()];
    }

    public final int[] b()
    {
        return d;
    }

    public final int c()
    {
        return f;
    }

    public final int d()
    {
        return c * 4 + 17;
    }

    final ak e()
    {
        int k = d();
        ak ak1 = new ak(k);
        ak1.a(0, 0, 9, 9);
        ak1.a(k - 8, 0, 8, 9);
        ak1.a(0, k - 8, 9, 8);
        int l = d.length;
        for (int i = 0; i < l; i++)
        {
            int i1 = d[i];
            for (int j = 0; j < l; j++)
            {
                if ((i != 0 || j != 0 && j != l - 1) && (i != l - 1 || j != 0))
                {
                    ak1.a(d[j] - 2, i1 - 2, 5, 5);
                }
            }

        }

        ak1.a(6, 9, 1, k - 17);
        ak1.a(9, 6, k - 17, 1);
        if (c > 6)
        {
            ak1.a(k - 11, 0, 3, 6);
            ak1.a(0, k - 11, 6, 3);
        }
        return ak1;
    }

    public final String toString()
    {
        return String.valueOf(c);
    }

    static 
    {
        Object obj = new b(7, new a(1, 19));
        Object obj1 = new b(10, new a(1, 16));
        Object obj2 = new b(13, new a(1, 13));
        Object obj3 = new b(17, new a(1, 9));
        obj = new do(1, new int[0], ((b) (obj)), ((b) (obj1)), ((b) (obj2)), ((b) (obj3)));
        obj1 = new b(10, new a(1, 34));
        obj2 = new b(16, new a(1, 28));
        obj3 = new b(22, new a(1, 22));
        Object obj4 = new b(28, new a(1, 16));
        obj1 = new do(2, new int[] {
            6, 18
        }, ((b) (obj1)), ((b) (obj2)), ((b) (obj3)), ((b) (obj4)));
        obj2 = new b(15, new a(1, 55));
        obj3 = new b(26, new a(1, 44));
        obj4 = new b(18, new a(2, 17));
        Object obj5 = new b(22, new a(2, 13));
        obj2 = new do(3, new int[] {
            6, 22
        }, ((b) (obj2)), ((b) (obj3)), ((b) (obj4)), ((b) (obj5)));
        obj3 = new b(20, new a(1, 80));
        obj4 = new b(18, new a(2, 32));
        obj5 = new b(26, new a(2, 24));
        Object obj6 = new b(16, new a(4, 9));
        obj3 = new do(4, new int[] {
            6, 26
        }, ((b) (obj3)), ((b) (obj4)), ((b) (obj5)), ((b) (obj6)));
        obj4 = new b(26, new a(1, 108));
        obj5 = new b(24, new a(2, 43));
        obj6 = new b(18, new a(2, 15), new a(2, 16));
        Object obj7 = new b(22, new a(2, 11), new a(2, 12));
        obj4 = new do(5, new int[] {
            6, 30
        }, ((b) (obj4)), ((b) (obj5)), ((b) (obj6)), ((b) (obj7)));
        obj5 = new b(18, new a(2, 68));
        obj6 = new b(16, new a(4, 27));
        obj7 = new b(24, new a(4, 19));
        Object obj8 = new b(28, new a(4, 15));
        obj5 = new do(6, new int[] {
            6, 34
        }, ((b) (obj5)), ((b) (obj6)), ((b) (obj7)), ((b) (obj8)));
        obj6 = new b(20, new a(2, 78));
        obj7 = new b(18, new a(4, 31));
        obj8 = new b(18, new a(2, 14), new a(4, 15));
        Object obj9 = new b(26, new a(4, 13), new a(1, 14));
        obj6 = new do(7, new int[] {
            6, 22, 38
        }, ((b) (obj6)), ((b) (obj7)), ((b) (obj8)), ((b) (obj9)));
        obj7 = new b(24, new a(2, 97));
        obj8 = new b(22, new a(2, 38), new a(2, 39));
        obj9 = new b(22, new a(4, 18), new a(2, 19));
        Object obj10 = new b(26, new a(4, 14), new a(2, 15));
        obj7 = new do(8, new int[] {
            6, 24, 42
        }, ((b) (obj7)), ((b) (obj8)), ((b) (obj9)), ((b) (obj10)));
        obj8 = new b(30, new a(2, 116));
        obj9 = new b(22, new a(3, 36), new a(2, 37));
        obj10 = new b(20, new a(4, 16), new a(4, 17));
        Object obj11 = new b(24, new a(4, 12), new a(4, 13));
        obj8 = new do(9, new int[] {
            6, 26, 46
        }, ((b) (obj8)), ((b) (obj9)), ((b) (obj10)), ((b) (obj11)));
        obj9 = new b(18, new a(2, 68), new a(2, 69));
        obj10 = new b(26, new a(4, 43), new a(1, 44));
        obj11 = new b(24, new a(6, 19), new a(2, 20));
        Object obj12 = new b(28, new a(6, 15), new a(2, 16));
        obj9 = new do(10, new int[] {
            6, 28, 50
        }, ((b) (obj9)), ((b) (obj10)), ((b) (obj11)), ((b) (obj12)));
        obj10 = new b(20, new a(4, 81));
        obj11 = new b(30, new a(1, 50), new a(4, 51));
        obj12 = new b(28, new a(4, 22), new a(4, 23));
        Object obj13 = new b(24, new a(3, 12), new a(8, 13));
        obj10 = new do(11, new int[] {
            6, 30, 54
        }, ((b) (obj10)), ((b) (obj11)), ((b) (obj12)), ((b) (obj13)));
        obj11 = new b(24, new a(2, 92), new a(2, 93));
        obj12 = new b(22, new a(6, 36), new a(2, 37));
        obj13 = new b(26, new a(4, 20), new a(6, 21));
        Object obj14 = new b(28, new a(7, 14), new a(4, 15));
        obj11 = new do(12, new int[] {
            6, 32, 58
        }, ((b) (obj11)), ((b) (obj12)), ((b) (obj13)), ((b) (obj14)));
        obj12 = new b(26, new a(4, 107));
        obj13 = new b(22, new a(8, 37), new a(1, 38));
        obj14 = new b(24, new a(8, 20), new a(4, 21));
        Object obj15 = new b(22, new a(12, 11), new a(4, 12));
        obj12 = new do(13, new int[] {
            6, 34, 62
        }, ((b) (obj12)), ((b) (obj13)), ((b) (obj14)), ((b) (obj15)));
        obj13 = new b(30, new a(3, 115), new a(1, 116));
        obj14 = new b(24, new a(4, 40), new a(5, 41));
        obj15 = new b(20, new a(11, 16), new a(5, 17));
        Object obj16 = new b(24, new a(11, 12), new a(5, 13));
        obj13 = new do(14, new int[] {
            6, 26, 46, 66
        }, ((b) (obj13)), ((b) (obj14)), ((b) (obj15)), ((b) (obj16)));
        obj14 = new b(22, new a(5, 87), new a(1, 88));
        obj15 = new b(24, new a(5, 41), new a(5, 42));
        obj16 = new b(30, new a(5, 24), new a(7, 25));
        Object obj17 = new b(24, new a(11, 12), new a(7, 13));
        obj14 = new do(15, new int[] {
            6, 26, 48, 70
        }, ((b) (obj14)), ((b) (obj15)), ((b) (obj16)), ((b) (obj17)));
        obj15 = new b(24, new a(5, 98), new a(1, 99));
        obj16 = new b(28, new a(7, 45), new a(3, 46));
        obj17 = new b(24, new a(15, 19), new a(2, 20));
        Object obj18 = new b(30, new a(3, 15), new a(13, 16));
        obj15 = new do(16, new int[] {
            6, 26, 50, 74
        }, ((b) (obj15)), ((b) (obj16)), ((b) (obj17)), ((b) (obj18)));
        obj16 = new b(28, new a(1, 107), new a(5, 108));
        obj17 = new b(28, new a(10, 46), new a(1, 47));
        obj18 = new b(28, new a(1, 22), new a(15, 23));
        Object obj19 = new b(28, new a(2, 14), new a(17, 15));
        obj16 = new do(17, new int[] {
            6, 30, 54, 78
        }, ((b) (obj16)), ((b) (obj17)), ((b) (obj18)), ((b) (obj19)));
        obj17 = new b(30, new a(5, 120), new a(1, 121));
        obj18 = new b(26, new a(9, 43), new a(4, 44));
        obj19 = new b(28, new a(17, 22), new a(1, 23));
        Object obj20 = new b(28, new a(2, 14), new a(19, 15));
        obj17 = new do(18, new int[] {
            6, 30, 56, 82
        }, ((b) (obj17)), ((b) (obj18)), ((b) (obj19)), ((b) (obj20)));
        obj18 = new b(28, new a(3, 113), new a(4, 114));
        obj19 = new b(26, new a(3, 44), new a(11, 45));
        obj20 = new b(26, new a(17, 21), new a(4, 22));
        Object obj21 = new b(26, new a(9, 13), new a(16, 14));
        obj18 = new do(19, new int[] {
            6, 30, 58, 86
        }, ((b) (obj18)), ((b) (obj19)), ((b) (obj20)), ((b) (obj21)));
        obj19 = new b(28, new a(3, 107), new a(5, 108));
        obj20 = new b(26, new a(3, 41), new a(13, 42));
        obj21 = new b(30, new a(15, 24), new a(5, 25));
        Object obj22 = new b(28, new a(15, 15), new a(10, 16));
        obj19 = new do(20, new int[] {
            6, 34, 62, 90
        }, ((b) (obj19)), ((b) (obj20)), ((b) (obj21)), ((b) (obj22)));
        obj20 = new b(28, new a(4, 116), new a(4, 117));
        obj21 = new b(26, new a(17, 42));
        obj22 = new b(28, new a(17, 22), new a(6, 23));
        Object obj23 = new b(30, new a(19, 16), new a(6, 17));
        obj20 = new do(21, new int[] {
            6, 28, 50, 72, 94
        }, ((b) (obj20)), ((b) (obj21)), ((b) (obj22)), ((b) (obj23)));
        obj21 = new b(28, new a(2, 111), new a(7, 112));
        obj22 = new b(28, new a(17, 46));
        obj23 = new b(30, new a(7, 24), new a(16, 25));
        Object obj24 = new b(24, new a(34, 13));
        obj21 = new do(22, new int[] {
            6, 26, 50, 74, 98
        }, ((b) (obj21)), ((b) (obj22)), ((b) (obj23)), ((b) (obj24)));
        obj22 = new b(30, new a(4, 121), new a(5, 122));
        obj23 = new b(28, new a(4, 47), new a(14, 48));
        obj24 = new b(30, new a(11, 24), new a(14, 25));
        Object obj25 = new b(30, new a(16, 15), new a(14, 16));
        obj22 = new do(23, new int[] {
            6, 30, 54, 78, 102
        }, ((b) (obj22)), ((b) (obj23)), ((b) (obj24)), ((b) (obj25)));
        obj23 = new b(30, new a(6, 117), new a(4, 118));
        obj24 = new b(28, new a(6, 45), new a(14, 46));
        obj25 = new b(30, new a(11, 24), new a(16, 25));
        Object obj26 = new b(30, new a(30, 16), new a(2, 17));
        obj23 = new do(24, new int[] {
            6, 28, 54, 80, 106
        }, ((b) (obj23)), ((b) (obj24)), ((b) (obj25)), ((b) (obj26)));
        obj24 = new b(26, new a(8, 106), new a(4, 107));
        obj25 = new b(28, new a(8, 47), new a(13, 48));
        obj26 = new b(30, new a(7, 24), new a(22, 25));
        Object obj27 = new b(30, new a(22, 15), new a(13, 16));
        obj24 = new do(25, new int[] {
            6, 32, 58, 84, 110
        }, ((b) (obj24)), ((b) (obj25)), ((b) (obj26)), ((b) (obj27)));
        obj25 = new b(28, new a(10, 114), new a(2, 115));
        obj26 = new b(28, new a(19, 46), new a(4, 47));
        obj27 = new b(28, new a(28, 22), new a(6, 23));
        Object obj28 = new b(30, new a(33, 16), new a(4, 17));
        obj25 = new do(26, new int[] {
            6, 30, 58, 86, 114
        }, ((b) (obj25)), ((b) (obj26)), ((b) (obj27)), ((b) (obj28)));
        obj26 = new b(30, new a(8, 122), new a(4, 123));
        obj27 = new b(28, new a(22, 45), new a(3, 46));
        obj28 = new b(30, new a(8, 23), new a(26, 24));
        Object obj29 = new b(30, new a(12, 15), new a(28, 16));
        obj26 = new do(27, new int[] {
            6, 34, 62, 90, 118
        }, ((b) (obj26)), ((b) (obj27)), ((b) (obj28)), ((b) (obj29)));
        obj27 = new b(30, new a(3, 117), new a(10, 118));
        obj28 = new b(28, new a(3, 45), new a(23, 46));
        obj29 = new b(30, new a(4, 24), new a(31, 25));
        Object obj30 = new b(30, new a(11, 15), new a(31, 16));
        obj27 = new do(28, new int[] {
            6, 26, 50, 74, 98, 122
        }, ((b) (obj27)), ((b) (obj28)), ((b) (obj29)), ((b) (obj30)));
        obj28 = new b(30, new a(7, 116), new a(7, 117));
        obj29 = new b(28, new a(21, 45), new a(7, 46));
        obj30 = new b(30, new a(1, 23), new a(37, 24));
        Object obj31 = new b(30, new a(19, 15), new a(26, 16));
        obj28 = new do(29, new int[] {
            6, 30, 54, 78, 102, 126
        }, ((b) (obj28)), ((b) (obj29)), ((b) (obj30)), ((b) (obj31)));
        obj29 = new b(30, new a(5, 115), new a(10, 116));
        obj30 = new b(28, new a(19, 47), new a(10, 48));
        obj31 = new b(30, new a(15, 24), new a(25, 25));
        Object obj32 = new b(30, new a(23, 15), new a(25, 16));
        obj29 = new do(30, new int[] {
            6, 26, 52, 78, 104, 130
        }, ((b) (obj29)), ((b) (obj30)), ((b) (obj31)), ((b) (obj32)));
        obj30 = new b(30, new a(13, 115), new a(3, 116));
        obj31 = new b(28, new a(2, 46), new a(29, 47));
        obj32 = new b(30, new a(42, 24), new a(1, 25));
        Object obj33 = new b(30, new a(23, 15), new a(28, 16));
        obj30 = new do(31, new int[] {
            6, 30, 56, 82, 108, 134
        }, ((b) (obj30)), ((b) (obj31)), ((b) (obj32)), ((b) (obj33)));
        obj31 = new b(30, new a(17, 115));
        obj32 = new b(28, new a(10, 46), new a(23, 47));
        obj33 = new b(30, new a(10, 24), new a(35, 25));
        Object obj34 = new b(30, new a(19, 15), new a(35, 16));
        obj31 = new do(32, new int[] {
            6, 34, 60, 86, 112, 138
        }, ((b) (obj31)), ((b) (obj32)), ((b) (obj33)), ((b) (obj34)));
        obj32 = new b(30, new a(17, 115), new a(1, 116));
        obj33 = new b(28, new a(14, 46), new a(21, 47));
        obj34 = new b(30, new a(29, 24), new a(19, 25));
        Object obj35 = new b(30, new a(11, 15), new a(46, 16));
        obj32 = new do(33, new int[] {
            6, 30, 58, 86, 114, 142
        }, ((b) (obj32)), ((b) (obj33)), ((b) (obj34)), ((b) (obj35)));
        obj33 = new b(30, new a(13, 115), new a(6, 116));
        obj34 = new b(28, new a(14, 46), new a(23, 47));
        obj35 = new b(30, new a(44, 24), new a(7, 25));
        Object obj36 = new b(30, new a(59, 16), new a(1, 17));
        obj33 = new do(34, new int[] {
            6, 34, 62, 90, 118, 146
        }, ((b) (obj33)), ((b) (obj34)), ((b) (obj35)), ((b) (obj36)));
        obj34 = new b(30, new a(12, 121), new a(7, 122));
        obj35 = new b(28, new a(12, 47), new a(26, 48));
        obj36 = new b(30, new a(39, 24), new a(14, 25));
        Object obj37 = new b(30, new a(22, 15), new a(41, 16));
        obj34 = new do(35, new int[] {
            6, 30, 54, 78, 102, 126, 150
        }, ((b) (obj34)), ((b) (obj35)), ((b) (obj36)), ((b) (obj37)));
        obj35 = new b(30, new a(6, 121), new a(14, 122));
        obj36 = new b(28, new a(6, 47), new a(34, 48));
        obj37 = new b(30, new a(46, 24), new a(10, 25));
        Object obj38 = new b(30, new a(2, 15), new a(64, 16));
        obj35 = new do(36, new int[] {
            6, 24, 50, 76, 102, 128, 154
        }, ((b) (obj35)), ((b) (obj36)), ((b) (obj37)), ((b) (obj38)));
        obj36 = new b(30, new a(17, 122), new a(4, 123));
        obj37 = new b(28, new a(29, 46), new a(14, 47));
        obj38 = new b(30, new a(49, 24), new a(10, 25));
        b b1 = new b(30, new a(24, 15), new a(46, 16));
        obj36 = new do(37, new int[] {
            6, 28, 54, 80, 106, 132, 158
        }, ((b) (obj36)), ((b) (obj37)), ((b) (obj38)), b1);
        obj37 = new b(30, new a(4, 122), new a(18, 123));
        obj38 = new b(28, new a(13, 46), new a(32, 47));
        b1 = new b(30, new a(48, 24), new a(14, 25));
        b b2 = new b(30, new a(42, 15), new a(32, 16));
        obj37 = new do(38, new int[] {
            6, 32, 58, 84, 110, 136, 162
        }, ((b) (obj37)), ((b) (obj38)), b1, b2);
        obj38 = new b(30, new a(20, 117), new a(4, 118));
        b1 = new b(28, new a(40, 47), new a(7, 48));
        b2 = new b(30, new a(43, 24), new a(22, 25));
        b b3 = new b(30, new a(10, 15), new a(67, 16));
        obj38 = new do(39, new int[] {
            6, 26, 54, 82, 110, 138, 166
        }, ((b) (obj38)), b1, b2, b3);
        b1 = new b(30, new a(19, 118), new a(6, 119));
        b2 = new b(28, new a(18, 47), new a(31, 48));
        b3 = new b(30, new a(34, 24), new a(34, 25));
        b b4 = new b(30, new a(20, 15), new a(61, 16));
        b = (new do[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
            obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, 
            obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, new do(40, new int[] {
                6, 30, 58, 86, 114, 142, 170
            }, b1, b2, b3, b4)
        });
    }
}
