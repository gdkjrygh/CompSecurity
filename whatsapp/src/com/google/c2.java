// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            dV, bG, gd, fJ, 
//            dQ, d6, gh

public final class c2
{

    private static final int a[] = {
        31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 0x10b78, 
        0x1145d, 0x12a17, 0x13532, 0x149a6, 0x15683, 0x168c9, 0x177ec, 0x18ec4, 0x191e1, 0x1afab, 
        0x1b08e, 0x1cc1a, 0x1d33f, 0x1ed75, 0x1f250, 0x209d5, 0x216f0, 0x228ba, 0x2379f, 0x24b0b, 
        0x2542e, 0x26a64, 0x27541, 0x28c69
    };
    private static final c2 f[] = f();
    public static boolean g;
    private final dV b[];
    private final int c;
    private final int d;
    private final int e[];

    private c2(int i, int ai[], dV adv[])
    {
        boolean flag = false;
        super();
        d = i;
        e = ai;
        b = adv;
        int l = adv[0].b();
        ai = adv[0].a();
        int i1 = ai.length;
        int j = 0;
        for (i = ((flag) ? 1 : 0); i < i1; i++)
        {
            adv = ai[i];
            int k = adv.b();
            j += (adv.a() + l) * k;
        }

        c = j;
    }

    public static c2 a(int i)
    {
        if (i < 1 || i > 40)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        } else
        {
            return f[i - 1];
        }
    }

    public static c2 b(int i)
    {
        if (i % 4 != 1)
        {
            try
            {
                throw gd.a();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        c2 c2_1;
        try
        {
            c2_1 = a((i - 17) / 4);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            throw gd.a();
        }
        return c2_1;
    }

    static c2 c(int i)
    {
        int j1 = 0;
        boolean flag = g;
        int j = 0x7fffffff;
        int k = 0;
        int l;
        int i1;
        do
        {
            l = k;
            i1 = j;
            if (j1 >= a.length)
            {
                break;
            }
            l = a[j1];
            if (l == i)
            {
                c2 c2_1;
                try
                {
                    c2_1 = a(j1 + 7);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
                return c2_1;
            }
            int k1 = fJ.b(i, l);
            l = k;
            i1 = j;
            if (k1 < j)
            {
                l = j1 + 7;
                i1 = k1;
            }
            j1++;
            k = l;
            j = i1;
        } while (!flag);
        if (i1 <= 3)
        {
            c2 c2_2;
            try
            {
                c2_2 = a(l);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return c2_2;
        } else
        {
            return null;
        }
    }

    private static c2[] f()
    {
        Object obj = new dV(7, new bG[] {
            new bG(1, 19)
        });
        Object obj1 = new dV(10, new bG[] {
            new bG(1, 16)
        });
        Object obj2 = new dV(13, new bG[] {
            new bG(1, 13)
        });
        Object obj3 = new dV(17, new bG[] {
            new bG(1, 9)
        });
        obj = new c2(1, new int[0], new dV[] {
            obj, obj1, obj2, obj3
        });
        obj1 = new dV(10, new bG[] {
            new bG(1, 34)
        });
        obj2 = new dV(16, new bG[] {
            new bG(1, 28)
        });
        obj3 = new dV(22, new bG[] {
            new bG(1, 22)
        });
        Object obj4 = new dV(28, new bG[] {
            new bG(1, 16)
        });
        obj1 = new c2(2, new int[] {
            6, 18
        }, new dV[] {
            obj1, obj2, obj3, obj4
        });
        obj2 = new dV(15, new bG[] {
            new bG(1, 55)
        });
        obj3 = new dV(26, new bG[] {
            new bG(1, 44)
        });
        obj4 = new dV(18, new bG[] {
            new bG(2, 17)
        });
        Object obj5 = new dV(22, new bG[] {
            new bG(2, 13)
        });
        obj2 = new c2(3, new int[] {
            6, 22
        }, new dV[] {
            obj2, obj3, obj4, obj5
        });
        obj3 = new dV(20, new bG[] {
            new bG(1, 80)
        });
        obj4 = new dV(18, new bG[] {
            new bG(2, 32)
        });
        obj5 = new dV(26, new bG[] {
            new bG(2, 24)
        });
        Object obj6 = new dV(16, new bG[] {
            new bG(4, 9)
        });
        obj3 = new c2(4, new int[] {
            6, 26
        }, new dV[] {
            obj3, obj4, obj5, obj6
        });
        obj4 = new dV(26, new bG[] {
            new bG(1, 108)
        });
        obj5 = new dV(24, new bG[] {
            new bG(2, 43)
        });
        obj6 = new dV(18, new bG[] {
            new bG(2, 15), new bG(2, 16)
        });
        Object obj7 = new dV(22, new bG[] {
            new bG(2, 11), new bG(2, 12)
        });
        obj4 = new c2(5, new int[] {
            6, 30
        }, new dV[] {
            obj4, obj5, obj6, obj7
        });
        obj5 = new dV(18, new bG[] {
            new bG(2, 68)
        });
        obj6 = new dV(16, new bG[] {
            new bG(4, 27)
        });
        obj7 = new dV(24, new bG[] {
            new bG(4, 19)
        });
        Object obj8 = new dV(28, new bG[] {
            new bG(4, 15)
        });
        obj5 = new c2(6, new int[] {
            6, 34
        }, new dV[] {
            obj5, obj6, obj7, obj8
        });
        obj6 = new dV(20, new bG[] {
            new bG(2, 78)
        });
        obj7 = new dV(18, new bG[] {
            new bG(4, 31)
        });
        obj8 = new dV(18, new bG[] {
            new bG(2, 14), new bG(4, 15)
        });
        Object obj9 = new dV(26, new bG[] {
            new bG(4, 13), new bG(1, 14)
        });
        obj6 = new c2(7, new int[] {
            6, 22, 38
        }, new dV[] {
            obj6, obj7, obj8, obj9
        });
        obj7 = new dV(24, new bG[] {
            new bG(2, 97)
        });
        obj8 = new dV(22, new bG[] {
            new bG(2, 38), new bG(2, 39)
        });
        obj9 = new dV(22, new bG[] {
            new bG(4, 18), new bG(2, 19)
        });
        Object obj10 = new dV(26, new bG[] {
            new bG(4, 14), new bG(2, 15)
        });
        obj7 = new c2(8, new int[] {
            6, 24, 42
        }, new dV[] {
            obj7, obj8, obj9, obj10
        });
        obj8 = new dV(30, new bG[] {
            new bG(2, 116)
        });
        obj9 = new dV(22, new bG[] {
            new bG(3, 36), new bG(2, 37)
        });
        obj10 = new dV(20, new bG[] {
            new bG(4, 16), new bG(4, 17)
        });
        Object obj11 = new dV(24, new bG[] {
            new bG(4, 12), new bG(4, 13)
        });
        obj8 = new c2(9, new int[] {
            6, 26, 46
        }, new dV[] {
            obj8, obj9, obj10, obj11
        });
        obj9 = new dV(18, new bG[] {
            new bG(2, 68), new bG(2, 69)
        });
        obj10 = new dV(26, new bG[] {
            new bG(4, 43), new bG(1, 44)
        });
        obj11 = new dV(24, new bG[] {
            new bG(6, 19), new bG(2, 20)
        });
        Object obj12 = new dV(28, new bG[] {
            new bG(6, 15), new bG(2, 16)
        });
        obj9 = new c2(10, new int[] {
            6, 28, 50
        }, new dV[] {
            obj9, obj10, obj11, obj12
        });
        obj10 = new dV(20, new bG[] {
            new bG(4, 81)
        });
        obj11 = new dV(30, new bG[] {
            new bG(1, 50), new bG(4, 51)
        });
        obj12 = new dV(28, new bG[] {
            new bG(4, 22), new bG(4, 23)
        });
        Object obj13 = new dV(24, new bG[] {
            new bG(3, 12), new bG(8, 13)
        });
        obj10 = new c2(11, new int[] {
            6, 30, 54
        }, new dV[] {
            obj10, obj11, obj12, obj13
        });
        obj11 = new dV(24, new bG[] {
            new bG(2, 92), new bG(2, 93)
        });
        obj12 = new dV(22, new bG[] {
            new bG(6, 36), new bG(2, 37)
        });
        obj13 = new dV(26, new bG[] {
            new bG(4, 20), new bG(6, 21)
        });
        Object obj14 = new dV(28, new bG[] {
            new bG(7, 14), new bG(4, 15)
        });
        obj11 = new c2(12, new int[] {
            6, 32, 58
        }, new dV[] {
            obj11, obj12, obj13, obj14
        });
        obj12 = new dV(26, new bG[] {
            new bG(4, 107)
        });
        obj13 = new dV(22, new bG[] {
            new bG(8, 37), new bG(1, 38)
        });
        obj14 = new dV(24, new bG[] {
            new bG(8, 20), new bG(4, 21)
        });
        Object obj15 = new dV(22, new bG[] {
            new bG(12, 11), new bG(4, 12)
        });
        obj12 = new c2(13, new int[] {
            6, 34, 62
        }, new dV[] {
            obj12, obj13, obj14, obj15
        });
        obj13 = new dV(30, new bG[] {
            new bG(3, 115), new bG(1, 116)
        });
        obj14 = new dV(24, new bG[] {
            new bG(4, 40), new bG(5, 41)
        });
        obj15 = new dV(20, new bG[] {
            new bG(11, 16), new bG(5, 17)
        });
        Object obj16 = new dV(24, new bG[] {
            new bG(11, 12), new bG(5, 13)
        });
        obj13 = new c2(14, new int[] {
            6, 26, 46, 66
        }, new dV[] {
            obj13, obj14, obj15, obj16
        });
        obj14 = new dV(22, new bG[] {
            new bG(5, 87), new bG(1, 88)
        });
        obj15 = new dV(24, new bG[] {
            new bG(5, 41), new bG(5, 42)
        });
        obj16 = new dV(30, new bG[] {
            new bG(5, 24), new bG(7, 25)
        });
        Object obj17 = new dV(24, new bG[] {
            new bG(11, 12), new bG(7, 13)
        });
        obj14 = new c2(15, new int[] {
            6, 26, 48, 70
        }, new dV[] {
            obj14, obj15, obj16, obj17
        });
        obj15 = new dV(24, new bG[] {
            new bG(5, 98), new bG(1, 99)
        });
        obj16 = new dV(28, new bG[] {
            new bG(7, 45), new bG(3, 46)
        });
        obj17 = new dV(24, new bG[] {
            new bG(15, 19), new bG(2, 20)
        });
        Object obj18 = new dV(30, new bG[] {
            new bG(3, 15), new bG(13, 16)
        });
        obj15 = new c2(16, new int[] {
            6, 26, 50, 74
        }, new dV[] {
            obj15, obj16, obj17, obj18
        });
        obj16 = new dV(28, new bG[] {
            new bG(1, 107), new bG(5, 108)
        });
        obj17 = new dV(28, new bG[] {
            new bG(10, 46), new bG(1, 47)
        });
        obj18 = new dV(28, new bG[] {
            new bG(1, 22), new bG(15, 23)
        });
        Object obj19 = new dV(28, new bG[] {
            new bG(2, 14), new bG(17, 15)
        });
        obj16 = new c2(17, new int[] {
            6, 30, 54, 78
        }, new dV[] {
            obj16, obj17, obj18, obj19
        });
        obj17 = new dV(30, new bG[] {
            new bG(5, 120), new bG(1, 121)
        });
        obj18 = new dV(26, new bG[] {
            new bG(9, 43), new bG(4, 44)
        });
        obj19 = new dV(28, new bG[] {
            new bG(17, 22), new bG(1, 23)
        });
        Object obj20 = new dV(28, new bG[] {
            new bG(2, 14), new bG(19, 15)
        });
        obj17 = new c2(18, new int[] {
            6, 30, 56, 82
        }, new dV[] {
            obj17, obj18, obj19, obj20
        });
        obj18 = new dV(28, new bG[] {
            new bG(3, 113), new bG(4, 114)
        });
        obj19 = new dV(26, new bG[] {
            new bG(3, 44), new bG(11, 45)
        });
        obj20 = new dV(26, new bG[] {
            new bG(17, 21), new bG(4, 22)
        });
        Object obj21 = new dV(26, new bG[] {
            new bG(9, 13), new bG(16, 14)
        });
        obj18 = new c2(19, new int[] {
            6, 30, 58, 86
        }, new dV[] {
            obj18, obj19, obj20, obj21
        });
        obj19 = new dV(28, new bG[] {
            new bG(3, 107), new bG(5, 108)
        });
        obj20 = new dV(26, new bG[] {
            new bG(3, 41), new bG(13, 42)
        });
        obj21 = new dV(30, new bG[] {
            new bG(15, 24), new bG(5, 25)
        });
        Object obj22 = new dV(28, new bG[] {
            new bG(15, 15), new bG(10, 16)
        });
        obj19 = new c2(20, new int[] {
            6, 34, 62, 90
        }, new dV[] {
            obj19, obj20, obj21, obj22
        });
        obj20 = new dV(28, new bG[] {
            new bG(4, 116), new bG(4, 117)
        });
        obj21 = new dV(26, new bG[] {
            new bG(17, 42)
        });
        obj22 = new dV(28, new bG[] {
            new bG(17, 22), new bG(6, 23)
        });
        Object obj23 = new dV(30, new bG[] {
            new bG(19, 16), new bG(6, 17)
        });
        obj20 = new c2(21, new int[] {
            6, 28, 50, 72, 94
        }, new dV[] {
            obj20, obj21, obj22, obj23
        });
        obj21 = new dV(28, new bG[] {
            new bG(2, 111), new bG(7, 112)
        });
        obj22 = new dV(28, new bG[] {
            new bG(17, 46)
        });
        obj23 = new dV(30, new bG[] {
            new bG(7, 24), new bG(16, 25)
        });
        Object obj24 = new dV(24, new bG[] {
            new bG(34, 13)
        });
        obj21 = new c2(22, new int[] {
            6, 26, 50, 74, 98
        }, new dV[] {
            obj21, obj22, obj23, obj24
        });
        obj22 = new dV(30, new bG[] {
            new bG(4, 121), new bG(5, 122)
        });
        obj23 = new dV(28, new bG[] {
            new bG(4, 47), new bG(14, 48)
        });
        obj24 = new dV(30, new bG[] {
            new bG(11, 24), new bG(14, 25)
        });
        Object obj25 = new dV(30, new bG[] {
            new bG(16, 15), new bG(14, 16)
        });
        obj22 = new c2(23, new int[] {
            6, 30, 54, 78, 102
        }, new dV[] {
            obj22, obj23, obj24, obj25
        });
        obj23 = new dV(30, new bG[] {
            new bG(6, 117), new bG(4, 118)
        });
        obj24 = new dV(28, new bG[] {
            new bG(6, 45), new bG(14, 46)
        });
        obj25 = new dV(30, new bG[] {
            new bG(11, 24), new bG(16, 25)
        });
        Object obj26 = new dV(30, new bG[] {
            new bG(30, 16), new bG(2, 17)
        });
        obj23 = new c2(24, new int[] {
            6, 28, 54, 80, 106
        }, new dV[] {
            obj23, obj24, obj25, obj26
        });
        obj24 = new dV(26, new bG[] {
            new bG(8, 106), new bG(4, 107)
        });
        obj25 = new dV(28, new bG[] {
            new bG(8, 47), new bG(13, 48)
        });
        obj26 = new dV(30, new bG[] {
            new bG(7, 24), new bG(22, 25)
        });
        Object obj27 = new dV(30, new bG[] {
            new bG(22, 15), new bG(13, 16)
        });
        obj24 = new c2(25, new int[] {
            6, 32, 58, 84, 110
        }, new dV[] {
            obj24, obj25, obj26, obj27
        });
        obj25 = new dV(28, new bG[] {
            new bG(10, 114), new bG(2, 115)
        });
        obj26 = new dV(28, new bG[] {
            new bG(19, 46), new bG(4, 47)
        });
        obj27 = new dV(28, new bG[] {
            new bG(28, 22), new bG(6, 23)
        });
        Object obj28 = new dV(30, new bG[] {
            new bG(33, 16), new bG(4, 17)
        });
        obj25 = new c2(26, new int[] {
            6, 30, 58, 86, 114
        }, new dV[] {
            obj25, obj26, obj27, obj28
        });
        obj26 = new dV(30, new bG[] {
            new bG(8, 122), new bG(4, 123)
        });
        obj27 = new dV(28, new bG[] {
            new bG(22, 45), new bG(3, 46)
        });
        obj28 = new dV(30, new bG[] {
            new bG(8, 23), new bG(26, 24)
        });
        Object obj29 = new dV(30, new bG[] {
            new bG(12, 15), new bG(28, 16)
        });
        obj26 = new c2(27, new int[] {
            6, 34, 62, 90, 118
        }, new dV[] {
            obj26, obj27, obj28, obj29
        });
        obj27 = new dV(30, new bG[] {
            new bG(3, 117), new bG(10, 118)
        });
        obj28 = new dV(28, new bG[] {
            new bG(3, 45), new bG(23, 46)
        });
        obj29 = new dV(30, new bG[] {
            new bG(4, 24), new bG(31, 25)
        });
        Object obj30 = new dV(30, new bG[] {
            new bG(11, 15), new bG(31, 16)
        });
        obj27 = new c2(28, new int[] {
            6, 26, 50, 74, 98, 122
        }, new dV[] {
            obj27, obj28, obj29, obj30
        });
        obj28 = new dV(30, new bG[] {
            new bG(7, 116), new bG(7, 117)
        });
        obj29 = new dV(28, new bG[] {
            new bG(21, 45), new bG(7, 46)
        });
        obj30 = new dV(30, new bG[] {
            new bG(1, 23), new bG(37, 24)
        });
        Object obj31 = new dV(30, new bG[] {
            new bG(19, 15), new bG(26, 16)
        });
        obj28 = new c2(29, new int[] {
            6, 30, 54, 78, 102, 126
        }, new dV[] {
            obj28, obj29, obj30, obj31
        });
        obj29 = new dV(30, new bG[] {
            new bG(5, 115), new bG(10, 116)
        });
        obj30 = new dV(28, new bG[] {
            new bG(19, 47), new bG(10, 48)
        });
        obj31 = new dV(30, new bG[] {
            new bG(15, 24), new bG(25, 25)
        });
        Object obj32 = new dV(30, new bG[] {
            new bG(23, 15), new bG(25, 16)
        });
        obj29 = new c2(30, new int[] {
            6, 26, 52, 78, 104, 130
        }, new dV[] {
            obj29, obj30, obj31, obj32
        });
        obj30 = new dV(30, new bG[] {
            new bG(13, 115), new bG(3, 116)
        });
        obj31 = new dV(28, new bG[] {
            new bG(2, 46), new bG(29, 47)
        });
        obj32 = new dV(30, new bG[] {
            new bG(42, 24), new bG(1, 25)
        });
        Object obj33 = new dV(30, new bG[] {
            new bG(23, 15), new bG(28, 16)
        });
        obj30 = new c2(31, new int[] {
            6, 30, 56, 82, 108, 134
        }, new dV[] {
            obj30, obj31, obj32, obj33
        });
        obj31 = new dV(30, new bG[] {
            new bG(17, 115)
        });
        obj32 = new dV(28, new bG[] {
            new bG(10, 46), new bG(23, 47)
        });
        obj33 = new dV(30, new bG[] {
            new bG(10, 24), new bG(35, 25)
        });
        Object obj34 = new dV(30, new bG[] {
            new bG(19, 15), new bG(35, 16)
        });
        obj31 = new c2(32, new int[] {
            6, 34, 60, 86, 112, 138
        }, new dV[] {
            obj31, obj32, obj33, obj34
        });
        obj32 = new dV(30, new bG[] {
            new bG(17, 115), new bG(1, 116)
        });
        obj33 = new dV(28, new bG[] {
            new bG(14, 46), new bG(21, 47)
        });
        obj34 = new dV(30, new bG[] {
            new bG(29, 24), new bG(19, 25)
        });
        Object obj35 = new dV(30, new bG[] {
            new bG(11, 15), new bG(46, 16)
        });
        obj32 = new c2(33, new int[] {
            6, 30, 58, 86, 114, 142
        }, new dV[] {
            obj32, obj33, obj34, obj35
        });
        obj33 = new dV(30, new bG[] {
            new bG(13, 115), new bG(6, 116)
        });
        obj34 = new dV(28, new bG[] {
            new bG(14, 46), new bG(23, 47)
        });
        obj35 = new dV(30, new bG[] {
            new bG(44, 24), new bG(7, 25)
        });
        Object obj36 = new dV(30, new bG[] {
            new bG(59, 16), new bG(1, 17)
        });
        obj33 = new c2(34, new int[] {
            6, 34, 62, 90, 118, 146
        }, new dV[] {
            obj33, obj34, obj35, obj36
        });
        obj34 = new dV(30, new bG[] {
            new bG(12, 121), new bG(7, 122)
        });
        obj35 = new dV(28, new bG[] {
            new bG(12, 47), new bG(26, 48)
        });
        obj36 = new dV(30, new bG[] {
            new bG(39, 24), new bG(14, 25)
        });
        Object obj37 = new dV(30, new bG[] {
            new bG(22, 15), new bG(41, 16)
        });
        obj34 = new c2(35, new int[] {
            6, 30, 54, 78, 102, 126, 150
        }, new dV[] {
            obj34, obj35, obj36, obj37
        });
        obj35 = new dV(30, new bG[] {
            new bG(6, 121), new bG(14, 122)
        });
        obj36 = new dV(28, new bG[] {
            new bG(6, 47), new bG(34, 48)
        });
        obj37 = new dV(30, new bG[] {
            new bG(46, 24), new bG(10, 25)
        });
        Object obj38 = new dV(30, new bG[] {
            new bG(2, 15), new bG(64, 16)
        });
        obj35 = new c2(36, new int[] {
            6, 24, 50, 76, 102, 128, 154
        }, new dV[] {
            obj35, obj36, obj37, obj38
        });
        obj36 = new dV(30, new bG[] {
            new bG(17, 122), new bG(4, 123)
        });
        obj37 = new dV(28, new bG[] {
            new bG(29, 46), new bG(14, 47)
        });
        obj38 = new dV(30, new bG[] {
            new bG(49, 24), new bG(10, 25)
        });
        dV dv = new dV(30, new bG[] {
            new bG(24, 15), new bG(46, 16)
        });
        obj36 = new c2(37, new int[] {
            6, 28, 54, 80, 106, 132, 158
        }, new dV[] {
            obj36, obj37, obj38, dv
        });
        obj37 = new dV(30, new bG[] {
            new bG(4, 122), new bG(18, 123)
        });
        obj38 = new dV(28, new bG[] {
            new bG(13, 46), new bG(32, 47)
        });
        dv = new dV(30, new bG[] {
            new bG(48, 24), new bG(14, 25)
        });
        dV dv1 = new dV(30, new bG[] {
            new bG(42, 15), new bG(32, 16)
        });
        obj37 = new c2(38, new int[] {
            6, 32, 58, 84, 110, 136, 162
        }, new dV[] {
            obj37, obj38, dv, dv1
        });
        obj38 = new dV(30, new bG[] {
            new bG(20, 117), new bG(4, 118)
        });
        dv = new dV(28, new bG[] {
            new bG(40, 47), new bG(7, 48)
        });
        dv1 = new dV(30, new bG[] {
            new bG(43, 24), new bG(22, 25)
        });
        dV dv2 = new dV(30, new bG[] {
            new bG(10, 15), new bG(67, 16)
        });
        obj38 = new c2(39, new int[] {
            6, 26, 54, 82, 110, 138, 166
        }, new dV[] {
            obj38, dv, dv1, dv2
        });
        dv = new dV(30, new bG[] {
            new bG(19, 118), new bG(6, 119)
        });
        dv1 = new dV(28, new bG[] {
            new bG(18, 47), new bG(31, 48)
        });
        dv2 = new dV(30, new bG[] {
            new bG(34, 24), new bG(34, 25)
        });
        dV dv3 = new dV(30, new bG[] {
            new bG(20, 15), new bG(61, 16)
        });
        return (new c2[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
            obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, 
            obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, new c2(40, new int[] {
                6, 30, 58, 86, 114, 142, 170
            }, new dV[] {
                dv, dv1, dv2, dv3
            })
        });
    }

    public dV a(dQ dq)
    {
        return b[dq.ordinal()];
    }

    public int[] a()
    {
        return e;
    }

    d6 b()
    {
        boolean flag = false;
        boolean flag1 = g;
        int k = c();
        d6 d6_1 = new d6(k);
        d6_1.a(0, 0, 9, 9);
        d6_1.a(k - 8, 0, 8, 9);
        d6_1.a(0, k - 8, 9, 8);
        int l = e.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < l)
                {
                    int i1 = e[i];
                    int j = 0;
                    do
                    {
                        if (j >= l)
                        {
                            break;
                        }
                        if ((i != 0 || j != 0 && j != l - 1) && (i != l - 1 || j != 0 || flag1))
                        {
                            try
                            {
                                d6_1.a(e[j] - 2, i1 - 2, 5, 5);
                            }
                            catch (IllegalArgumentException illegalargumentexception)
                            {
                                throw illegalargumentexception;
                            }
                        }
                        j++;
                    } while (!flag1);
                    if (!flag1)
                    {
                        break label0;
                    }
                }
                try
                {
                    d6_1.a(6, 9, 1, k - 17);
                    d6_1.a(9, 6, k - 17, 1);
                    if (d > 6)
                    {
                        d6_1.a(k - 11, 0, 3, 6);
                        d6_1.a(0, k - 11, 6, 3);
                    }
                }
                catch (IllegalArgumentException illegalargumentexception1)
                {
                    throw illegalargumentexception1;
                }
                try
                {
                    i = gh.a;
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    try
                    {
                        throw illegalargumentexception2;
                    }
                    catch (IllegalArgumentException illegalargumentexception3)
                    {
                        throw illegalargumentexception3;
                    }
                }
                if (i != 0)
                {
                    if (!flag1)
                    {
                        flag = true;
                    }
                    g = flag;
                }
                return d6_1;
            }
            i++;
        } while (true);
    }

    public int c()
    {
        return d * 4 + 17;
    }

    public int d()
    {
        return d;
    }

    public int e()
    {
        return c;
    }

    public String toString()
    {
        return String.valueOf(d);
    }

}
