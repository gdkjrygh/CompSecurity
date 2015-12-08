// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            y

final class cy
{

    private static final Object a;
    private static final Object b[][];
    private static final Object c[][];
    private static final Object d[][];
    private static final Object e[][];

    private static String a(int i, int j, String s)
        throws y
    {
        if (s.length() < i)
        {
            throw y.a();
        }
        String s1 = s.substring(0, i);
        if (s.length() < i + j)
        {
            throw y.a();
        } else
        {
            String s2 = s.substring(i, i + j);
            s = s.substring(i + j);
            return (new StringBuilder("(")).append(s1).append(')').append(s2).append(a(s)).toString();
        }
    }

    static String a(String s)
        throws y
    {
        if (s.length() == 0)
        {
            return "";
        }
        if (s.length() < 2)
        {
            throw y.a();
        }
        String s1 = s.substring(0, 2);
        for (int i = 0; i < b.length; i++)
        {
            if (b[i][0].equals(s1))
            {
                if (b[i][1] == a)
                {
                    return b(2, ((Integer)b[i][2]).intValue(), s);
                } else
                {
                    return a(2, ((Integer)b[i][1]).intValue(), s);
                }
            }
        }

        if (s.length() < 3)
        {
            throw y.a();
        }
        s1 = s.substring(0, 3);
        for (int j = 0; j < c.length; j++)
        {
            if (c[j][0].equals(s1))
            {
                if (c[j][1] == a)
                {
                    return b(3, ((Integer)c[j][2]).intValue(), s);
                } else
                {
                    return a(3, ((Integer)c[j][1]).intValue(), s);
                }
            }
        }

        for (int k = 0; k < d.length; k++)
        {
            if (d[k][0].equals(s1))
            {
                if (d[k][1] == a)
                {
                    return b(4, ((Integer)d[k][2]).intValue(), s);
                } else
                {
                    return a(4, ((Integer)d[k][1]).intValue(), s);
                }
            }
        }

        if (s.length() < 4)
        {
            throw y.a();
        }
        s1 = s.substring(0, 4);
        for (int l = 0; l < e.length; l++)
        {
            if (e[l][0].equals(s1))
            {
                if (e[l][1] == a)
                {
                    return b(4, ((Integer)e[l][2]).intValue(), s);
                } else
                {
                    return a(4, ((Integer)e[l][1]).intValue(), s);
                }
            }
        }

        throw y.a();
    }

    private static String b(int i, int j, String s)
        throws y
    {
        String s1 = s.substring(0, i);
        String s2;
        if (s.length() < i + j)
        {
            j = s.length();
        } else
        {
            j = i + j;
        }
        s2 = s.substring(i, j);
        s = s.substring(j);
        return (new StringBuilder("(")).append(s1).append(')').append(s2).append(a(s)).toString();
    }

    static 
    {
        a = new Object();
        Object obj = new Integer(18);
        Integer integer = new Integer(14);
        Object aobj12[] = {
            "02", new Integer(14)
        };
        Object obj1 = a;
        Object obj2 = new Integer(20);
        Object obj3 = new Integer(6);
        Integer integer1 = new Integer(6);
        Object obj4 = new Integer(6);
        Integer integer2 = new Integer(6);
        Object obj5 = new Integer(6);
        Integer integer3 = new Integer(2);
        Object obj6 = a;
        Object obj7 = new Integer(20);
        Object obj8 = a;
        Integer integer4 = new Integer(29);
        Object obj9 = a;
        Object obj10 = new Integer(8);
        Object obj11 = a;
        Integer integer5 = new Integer(8);
        Object obj12 = a;
        Integer integer6 = new Integer(30);
        Object obj13 = a;
        Integer integer7 = new Integer(30);
        Object obj14 = a;
        Integer integer8 = new Integer(30);
        Object obj15 = a;
        Integer integer9 = new Integer(30);
        Object obj16 = a;
        Integer integer10 = new Integer(30);
        Object obj17 = a;
        Integer integer11 = new Integer(30);
        Object obj18 = a;
        Integer integer12 = new Integer(30);
        Object obj19 = a;
        Integer integer13 = new Integer(30);
        Object obj20 = a;
        Integer integer14 = new Integer(30);
        Object obj21 = a;
        Object obj22 = new Integer(30);
        b = (new Object[][] {
            new Object[] {
                "00", obj
            }, new Object[] {
                "01", integer
            }, aobj12, new Object[] {
                "10", obj1, obj2
            }, new Object[] {
                "11", obj3
            }, new Object[] {
                "12", integer1
            }, new Object[] {
                "13", obj4
            }, new Object[] {
                "15", integer2
            }, new Object[] {
                "17", obj5
            }, new Object[] {
                "20", integer3
            }, new Object[] {
                "21", obj6, obj7
            }, new Object[] {
                "22", obj8, integer4
            }, new Object[] {
                "30", obj9, obj10
            }, new Object[] {
                "37", obj11, integer5
            }, new Object[] {
                "90", obj12, integer6
            }, new Object[] {
                "91", obj13, integer7
            }, new Object[] {
                "92", obj14, integer8
            }, new Object[] {
                "93", obj15, integer9
            }, new Object[] {
                "94", obj16, integer10
            }, new Object[] {
                "95", obj17, integer11
            }, new Object[] {
                "96", obj18, integer12
            }, new Object[] {
                "97", obj19, integer13
            }, new Object[] {
                "98", obj20, integer14
            }, new Object[] {
                "99", obj21, obj22
            }
        });
        Object aobj[] = {
            "240", a, new Integer(30)
        };
        Object aobj1[] = {
            "241", a, new Integer(30)
        };
        obj = a;
        integer = new Integer(6);
        Object aobj2[] = {
            "250", a, new Integer(30)
        };
        obj1 = a;
        obj2 = new Integer(30);
        Object aobj3[] = {
            "253", a, new Integer(17)
        };
        Object aobj4[] = {
            "254", a, new Integer(20)
        };
        obj3 = a;
        integer1 = new Integer(30);
        obj4 = a;
        integer2 = new Integer(30);
        Object aobj5[] = {
            "402", new Integer(17)
        };
        Object aobj6[] = {
            "403", a, new Integer(30)
        };
        Object aobj7[] = {
            "410", new Integer(13)
        };
        obj5 = new Integer(13);
        integer3 = new Integer(13);
        obj6 = new Integer(13);
        Object aobj8[] = {
            "414", new Integer(13)
        };
        obj7 = a;
        obj8 = new Integer(20);
        Object aobj9[] = {
            "421", a, new Integer(15)
        };
        Object aobj10[] = {
            "422", new Integer(3)
        };
        Object aobj11[] = {
            "423", a, new Integer(15)
        };
        integer4 = new Integer(3);
        obj9 = new Integer(3);
        obj10 = new Integer(3);
        c = (new Object[][] {
            aobj, aobj1, new Object[] {
                "242", obj, integer
            }, aobj2, new Object[] {
                "251", obj1, obj2
            }, aobj3, aobj4, new Object[] {
                "400", obj3, integer1
            }, new Object[] {
                "401", obj4, integer2
            }, aobj5, 
            aobj6, aobj7, new Object[] {
                "411", obj5
            }, new Object[] {
                "412", integer3
            }, new Object[] {
                "413", obj6
            }, aobj8, new Object[] {
                "420", obj7, obj8
            }, aobj9, aobj10, aobj11, 
            new Object[] {
                "424", integer4
            }, new Object[] {
                "425", obj9
            }, new Object[] {
                "426", obj10
            }
        });
        obj = new Integer(6);
        Object aobj13[] = {
            "311", new Integer(6)
        };
        Object aobj14[] = {
            "312", new Integer(6)
        };
        integer = new Integer(6);
        Object aobj15[] = {
            "314", new Integer(6)
        };
        Object aobj16[] = {
            "315", new Integer(6)
        };
        obj1 = new Integer(6);
        obj2 = new Integer(6);
        obj3 = new Integer(6);
        integer1 = new Integer(6);
        obj4 = new Integer(6);
        Object aobj17[] = {
            "324", new Integer(6)
        };
        integer2 = new Integer(6);
        obj5 = new Integer(6);
        integer3 = new Integer(6);
        Object aobj18[] = {
            "328", new Integer(6)
        };
        obj6 = new Integer(6);
        obj7 = new Integer(6);
        obj8 = new Integer(6);
        integer4 = new Integer(6);
        obj9 = new Integer(6);
        obj10 = new Integer(6);
        aobj = new Integer(6);
        Object aobj19[] = {
            "336", new Integer(6)
        };
        Object aobj20[] = {
            "340", new Integer(6)
        };
        Object aobj21[] = {
            "341", new Integer(6)
        };
        aobj1 = new Integer(6);
        aobj2 = new Integer(6);
        aobj3 = new Integer(6);
        aobj4 = new Integer(6);
        aobj5 = new Integer(6);
        aobj6 = new Integer(6);
        aobj7 = new Integer(6);
        aobj8 = new Integer(6);
        Object aobj22[] = {
            "350", new Integer(6)
        };
        Object aobj23[] = {
            "351", new Integer(6)
        };
        Object aobj24[] = {
            "352", new Integer(6)
        };
        aobj9 = new Integer(6);
        aobj10 = new Integer(6);
        aobj11 = new Integer(6);
        obj17 = new Integer(6);
        integer11 = new Integer(6);
        Object aobj25[] = {
            "360", new Integer(6)
        };
        obj18 = new Integer(6);
        Object aobj26[] = {
            "362", new Integer(6)
        };
        Object aobj27[] = {
            "363", new Integer(6)
        };
        integer12 = new Integer(6);
        obj19 = new Integer(6);
        integer13 = new Integer(6);
        obj20 = new Integer(6);
        integer14 = new Integer(6);
        obj21 = new Integer(6);
        Object aobj28[] = {
            "390", a, new Integer(15)
        };
        Object aobj29[] = {
            "391", a, new Integer(18)
        };
        obj22 = a;
        Integer integer15 = new Integer(15);
        Object obj23 = a;
        Integer integer16 = new Integer(18);
        Object obj24 = a;
        Integer integer17 = new Integer(30);
        d = (new Object[][] {
            new Object[] {
                "310", obj
            }, aobj13, aobj14, new Object[] {
                "313", integer
            }, aobj15, aobj16, new Object[] {
                "316", obj1
            }, new Object[] {
                "320", obj2
            }, new Object[] {
                "321", obj3
            }, new Object[] {
                "322", integer1
            }, new Object[] {
                "323", obj4
            }, aobj17, new Object[] {
                "325", integer2
            }, new Object[] {
                "326", obj5
            }, new Object[] {
                "327", integer3
            }, aobj18, new Object[] {
                "329", obj6
            }, new Object[] {
                "330", obj7
            }, new Object[] {
                "331", obj8
            }, new Object[] {
                "332", integer4
            }, new Object[] {
                "333", obj9
            }, new Object[] {
                "334", obj10
            }, new Object[] {
                "335", aobj
            }, aobj19, aobj20, aobj21, new Object[] {
                "342", aobj1
            }, new Object[] {
                "343", aobj2
            }, new Object[] {
                "344", aobj3
            }, new Object[] {
                "345", aobj4
            }, new Object[] {
                "346", aobj5
            }, new Object[] {
                "347", aobj6
            }, new Object[] {
                "348", aobj7
            }, new Object[] {
                "349", aobj8
            }, aobj22, aobj23, aobj24, new Object[] {
                "353", aobj9
            }, new Object[] {
                "354", aobj10
            }, new Object[] {
                "355", aobj11
            }, new Object[] {
                "356", obj17
            }, new Object[] {
                "357", integer11
            }, aobj25, new Object[] {
                "361", obj18
            }, aobj26, aobj27, new Object[] {
                "364", integer12
            }, new Object[] {
                "365", obj19
            }, new Object[] {
                "366", integer13
            }, new Object[] {
                "367", obj20
            }, new Object[] {
                "368", integer14
            }, new Object[] {
                "369", obj21
            }, aobj28, aobj29, new Object[] {
                "392", obj22, integer15
            }, new Object[] {
                "393", obj23, integer16
            }, new Object[] {
                "703", obj24, integer17
            }
        });
        obj = new Integer(13);
        aobj1 = (new Object[] {
            "7002", a, new Integer(30)
        });
        integer = new Integer(10);
        obj1 = new Integer(14);
        aobj2 = (new Object[] {
            "8002", a, new Integer(20)
        });
        aobj3 = (new Object[] {
            "8003", a, new Integer(30)
        });
        obj2 = a;
        obj3 = new Integer(30);
        aobj4 = (new Object[] {
            "8005", new Integer(6)
        });
        integer1 = new Integer(18);
        obj4 = a;
        integer2 = new Integer(30);
        obj5 = a;
        integer3 = new Integer(12);
        obj6 = new Integer(18);
        obj7 = a;
        obj8 = new Integer(25);
        integer4 = new Integer(6);
        obj9 = new Integer(10);
        aobj5 = (new Object[] {
            "8102", new Integer(2)
        });
        obj10 = a;
        aobj = new Integer(30);
        e = (new Object[][] {
            new Object[] {
                "7001", obj
            }, aobj1, new Object[] {
                "7003", integer
            }, new Object[] {
                "8001", obj1
            }, aobj2, aobj3, new Object[] {
                "8004", obj2, obj3
            }, aobj4, new Object[] {
                "8006", integer1
            }, new Object[] {
                "8007", obj4, integer2
            }, new Object[] {
                "8008", obj5, integer3
            }, new Object[] {
                "8018", obj6
            }, new Object[] {
                "8020", obj7, obj8
            }, new Object[] {
                "8100", integer4
            }, new Object[] {
                "8101", obj9
            }, aobj5, new Object[] {
                "8110", obj10, aobj
            }
        });
    }
}
