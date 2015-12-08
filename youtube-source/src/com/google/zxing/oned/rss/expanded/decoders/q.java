// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;

final class q
{

    private static final Object a;
    private static final Object b[][];
    private static final Object c[][];
    private static final Object d[][];
    private static final Object e[][];

    private static String a(int i, int j, String s)
    {
        if (s.length() < i)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        String s1 = s.substring(0, i);
        if (s.length() < i + j)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        String s2 = s.substring(i, i + j);
        s = s.substring(i + j);
        s1 = (new StringBuilder("(")).append(s1).append(')').append(s2).toString();
        s = a(s);
        if (s == null)
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s1).append(s).toString();
        }
    }

    static String a(String s)
    {
        if (s.isEmpty())
        {
            return null;
        }
        if (s.length() < 2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        String s1 = s.substring(0, 2);
        Object aobj[][] = b;
        int i1 = aobj.length;
        for (int i = 0; i < i1; i++)
        {
            Object aobj1[] = aobj[i];
            if (aobj1[0].equals(s1))
            {
                if (aobj1[1] == a)
                {
                    return b(2, ((Integer)aobj1[2]).intValue(), s);
                } else
                {
                    return a(2, ((Integer)aobj1[1]).intValue(), s);
                }
            }
        }

        if (s.length() < 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        s1 = s.substring(0, 3);
        aobj = c;
        i1 = aobj.length;
        for (int j = 0; j < i1; j++)
        {
            Object aobj2[] = aobj[j];
            if (aobj2[0].equals(s1))
            {
                if (aobj2[1] == a)
                {
                    return b(3, ((Integer)aobj2[2]).intValue(), s);
                } else
                {
                    return a(3, ((Integer)aobj2[1]).intValue(), s);
                }
            }
        }

        aobj = d;
        i1 = aobj.length;
        for (int k = 0; k < i1; k++)
        {
            Object aobj3[] = aobj[k];
            if (aobj3[0].equals(s1))
            {
                if (aobj3[1] == a)
                {
                    return b(4, ((Integer)aobj3[2]).intValue(), s);
                } else
                {
                    return a(4, ((Integer)aobj3[1]).intValue(), s);
                }
            }
        }

        if (s.length() < 4)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        s1 = s.substring(0, 4);
        aobj = e;
        i1 = aobj.length;
        for (int l = 0; l < i1; l++)
        {
            Object aobj4[] = aobj[l];
            if (aobj4[0].equals(s1))
            {
                if (aobj4[1] == a)
                {
                    return b(4, ((Integer)aobj4[2]).intValue(), s);
                } else
                {
                    return a(4, ((Integer)aobj4[1]).intValue(), s);
                }
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    private static String b(int i, int j, String s)
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
        s1 = (new StringBuilder("(")).append(s1).append(')').append(s2).toString();
        s = a(s);
        if (s == null)
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s1).append(s).toString();
        }
    }

    static 
    {
        a = new Object();
        Object aobj[] = {
            "00", Integer.valueOf(18)
        };
        Object aobj1[] = {
            "01", Integer.valueOf(14)
        };
        Object aobj2[] = {
            "02", Integer.valueOf(14)
        };
        Object aobj3[] = {
            "10", a, Integer.valueOf(20)
        };
        Object aobj4[] = {
            "11", Integer.valueOf(6)
        };
        Object aobj5[] = {
            "12", Integer.valueOf(6)
        };
        Object aobj6[] = {
            "13", Integer.valueOf(6)
        };
        Object aobj7[] = {
            "17", Integer.valueOf(6)
        };
        Object aobj8[] = {
            "21", a, Integer.valueOf(20)
        };
        Object aobj9[] = {
            "22", a, Integer.valueOf(29)
        };
        Object aobj10[] = {
            "30", a, Integer.valueOf(8)
        };
        Object aobj11[] = {
            "37", a, Integer.valueOf(8)
        };
        Object aobj12[] = {
            "90", a, Integer.valueOf(30)
        };
        Object aobj13[] = {
            "91", a, Integer.valueOf(30)
        };
        Object aobj14[] = {
            "92", a, Integer.valueOf(30)
        };
        Object aobj15[] = {
            "93", a, Integer.valueOf(30)
        };
        Object aobj16[] = {
            "94", a, Integer.valueOf(30)
        };
        Object aobj17[] = {
            "95", a, Integer.valueOf(30)
        };
        Object aobj18[] = {
            "96", a, Integer.valueOf(30)
        };
        Object aobj19[] = {
            "97", a, Integer.valueOf(30)
        };
        Object aobj20[] = {
            "98", a, Integer.valueOf(30)
        };
        Object aobj21[] = {
            "99", a, Integer.valueOf(30)
        };
        b = (new Object[][] {
            aobj, aobj1, aobj2, aobj3, aobj4, aobj5, aobj6, new Object[] {
                "15", Integer.valueOf(6)
            }, aobj7, new Object[] {
                "20", Integer.valueOf(2)
            }, 
            aobj8, aobj9, aobj10, aobj11, aobj12, aobj13, aobj14, aobj15, aobj16, aobj17, 
            aobj18, aobj19, aobj20, aobj21
        });
        aobj2 = (new Object[] {
            "240", a, Integer.valueOf(30)
        });
        Object obj = a;
        aobj3 = (new Object[] {
            "242", a, Integer.valueOf(6)
        });
        aobj4 = (new Object[] {
            "250", a, Integer.valueOf(30)
        });
        aobj5 = (new Object[] {
            "251", a, Integer.valueOf(30)
        });
        aobj6 = (new Object[] {
            "253", a, Integer.valueOf(17)
        });
        aobj7 = (new Object[] {
            "254", a, Integer.valueOf(20)
        });
        aobj8 = (new Object[] {
            "400", a, Integer.valueOf(30)
        });
        Object obj1 = a;
        aobj9 = (new Object[] {
            "403", a, Integer.valueOf(30)
        });
        aobj10 = (new Object[] {
            "410", Integer.valueOf(13)
        });
        aobj11 = (new Object[] {
            "411", Integer.valueOf(13)
        });
        aobj12 = (new Object[] {
            "412", Integer.valueOf(13)
        });
        aobj13 = (new Object[] {
            "413", Integer.valueOf(13)
        });
        aobj14 = (new Object[] {
            "414", Integer.valueOf(13)
        });
        aobj15 = (new Object[] {
            "420", a, Integer.valueOf(20)
        });
        aobj16 = (new Object[] {
            "421", a, Integer.valueOf(15)
        });
        aobj17 = (new Object[] {
            "422", Integer.valueOf(3)
        });
        aobj18 = (new Object[] {
            "423", a, Integer.valueOf(15)
        });
        aobj19 = (new Object[] {
            "424", Integer.valueOf(3)
        });
        aobj20 = (new Object[] {
            "425", Integer.valueOf(3)
        });
        aobj21 = (new Object[] {
            "426", Integer.valueOf(3)
        });
        c = (new Object[][] {
            aobj2, new Object[] {
                "241", obj, Integer.valueOf(30)
            }, aobj3, aobj4, aobj5, aobj6, aobj7, aobj8, new Object[] {
                "401", obj1, Integer.valueOf(30)
            }, new Object[] {
                "402", Integer.valueOf(17)
            }, 
            aobj9, aobj10, aobj11, aobj12, aobj13, aobj14, aobj15, aobj16, aobj17, aobj18, 
            aobj19, aobj20, aobj21
        });
        obj1 = ((Object) (new Object[] {
            "310", Integer.valueOf(6)
        }));
        aobj2 = (new Object[] {
            "311", Integer.valueOf(6)
        });
        aobj3 = (new Object[] {
            "312", Integer.valueOf(6)
        });
        aobj4 = (new Object[] {
            "313", Integer.valueOf(6)
        });
        aobj5 = (new Object[] {
            "314", Integer.valueOf(6)
        });
        aobj6 = (new Object[] {
            "315", Integer.valueOf(6)
        });
        aobj7 = (new Object[] {
            "316", Integer.valueOf(6)
        });
        aobj8 = (new Object[] {
            "320", Integer.valueOf(6)
        });
        aobj9 = (new Object[] {
            "321", Integer.valueOf(6)
        });
        aobj10 = (new Object[] {
            "322", Integer.valueOf(6)
        });
        aobj11 = (new Object[] {
            "323", Integer.valueOf(6)
        });
        aobj12 = (new Object[] {
            "324", Integer.valueOf(6)
        });
        aobj13 = (new Object[] {
            "325", Integer.valueOf(6)
        });
        aobj14 = (new Object[] {
            "326", Integer.valueOf(6)
        });
        aobj15 = (new Object[] {
            "327", Integer.valueOf(6)
        });
        aobj16 = (new Object[] {
            "328", Integer.valueOf(6)
        });
        aobj17 = (new Object[] {
            "329", Integer.valueOf(6)
        });
        aobj18 = (new Object[] {
            "330", Integer.valueOf(6)
        });
        aobj19 = (new Object[] {
            "331", Integer.valueOf(6)
        });
        aobj20 = (new Object[] {
            "332", Integer.valueOf(6)
        });
        aobj21 = (new Object[] {
            "333", Integer.valueOf(6)
        });
        Object aobj22[] = {
            "334", Integer.valueOf(6)
        };
        Object aobj23[] = {
            "335", Integer.valueOf(6)
        };
        Object aobj24[] = {
            "336", Integer.valueOf(6)
        };
        Object aobj25[] = {
            "340", Integer.valueOf(6)
        };
        Object aobj26[] = {
            "342", Integer.valueOf(6)
        };
        Object aobj27[] = {
            "343", Integer.valueOf(6)
        };
        Object aobj28[] = {
            "344", Integer.valueOf(6)
        };
        Object aobj29[] = {
            "345", Integer.valueOf(6)
        };
        Object aobj30[] = {
            "346", Integer.valueOf(6)
        };
        Object aobj31[] = {
            "347", Integer.valueOf(6)
        };
        Object aobj32[] = {
            "349", Integer.valueOf(6)
        };
        Object aobj33[] = {
            "350", Integer.valueOf(6)
        };
        Object aobj34[] = {
            "351", Integer.valueOf(6)
        };
        Object aobj35[] = {
            "352", Integer.valueOf(6)
        };
        Object aobj36[] = {
            "353", Integer.valueOf(6)
        };
        Object aobj37[] = {
            "354", Integer.valueOf(6)
        };
        Object aobj38[] = {
            "355", Integer.valueOf(6)
        };
        Object aobj39[] = {
            "356", Integer.valueOf(6)
        };
        Object aobj40[] = {
            "357", Integer.valueOf(6)
        };
        Object aobj41[] = {
            "360", Integer.valueOf(6)
        };
        Object aobj42[] = {
            "361", Integer.valueOf(6)
        };
        Object aobj43[] = {
            "362", Integer.valueOf(6)
        };
        Object aobj44[] = {
            "363", Integer.valueOf(6)
        };
        Object aobj45[] = {
            "364", Integer.valueOf(6)
        };
        Object aobj46[] = {
            "365", Integer.valueOf(6)
        };
        Object aobj47[] = {
            "366", Integer.valueOf(6)
        };
        Object aobj48[] = {
            "367", Integer.valueOf(6)
        };
        Object aobj49[] = {
            "368", Integer.valueOf(6)
        };
        Object aobj50[] = {
            "369", Integer.valueOf(6)
        };
        Object aobj51[] = {
            "390", a, Integer.valueOf(15)
        };
        Object aobj52[] = {
            "391", a, Integer.valueOf(18)
        };
        Object aobj53[] = {
            "392", a, Integer.valueOf(15)
        };
        Object aobj54[] = {
            "393", a, Integer.valueOf(18)
        };
        obj = a;
        d = (new Object[][] {
            obj1, aobj2, aobj3, aobj4, aobj5, aobj6, aobj7, aobj8, aobj9, aobj10, 
            aobj11, aobj12, aobj13, aobj14, aobj15, aobj16, aobj17, aobj18, aobj19, aobj20, 
            aobj21, aobj22, aobj23, aobj24, aobj25, new Object[] {
                "341", Integer.valueOf(6)
            }, aobj26, aobj27, aobj28, aobj29, 
            aobj30, aobj31, new Object[] {
                "348", Integer.valueOf(6)
            }, aobj32, aobj33, aobj34, aobj35, aobj36, aobj37, aobj38, 
            aobj39, aobj40, aobj41, aobj42, aobj43, aobj44, aobj45, aobj46, aobj47, aobj48, 
            aobj49, aobj50, aobj51, aobj52, aobj53, aobj54, new Object[] {
                "703", obj, Integer.valueOf(30)
            }
        });
        aobj3 = (new Object[] {
            "7001", Integer.valueOf(13)
        });
        aobj4 = (new Object[] {
            "7002", a, Integer.valueOf(30)
        });
        aobj5 = (new Object[] {
            "7003", Integer.valueOf(10)
        });
        aobj6 = (new Object[] {
            "8001", Integer.valueOf(14)
        });
        obj = a;
        obj1 = a;
        aobj7 = (new Object[] {
            "8004", a, Integer.valueOf(30)
        });
        aobj8 = (new Object[] {
            "8005", Integer.valueOf(6)
        });
        aobj9 = (new Object[] {
            "8006", Integer.valueOf(18)
        });
        aobj10 = (new Object[] {
            "8007", a, Integer.valueOf(30)
        });
        aobj11 = (new Object[] {
            "8008", a, Integer.valueOf(12)
        });
        Object obj2 = a;
        aobj12 = (new Object[] {
            "8100", Integer.valueOf(6)
        });
        aobj13 = (new Object[] {
            "8101", Integer.valueOf(10)
        });
        aobj14 = (new Object[] {
            "8110", a, Integer.valueOf(70)
        });
        aobj15 = (new Object[] {
            "8200", a, Integer.valueOf(70)
        });
        e = (new Object[][] {
            aobj3, aobj4, aobj5, aobj6, new Object[] {
                "8002", obj, Integer.valueOf(20)
            }, new Object[] {
                "8003", obj1, Integer.valueOf(30)
            }, aobj7, aobj8, aobj9, aobj10, 
            aobj11, new Object[] {
                "8018", Integer.valueOf(18)
            }, new Object[] {
                "8020", obj2, Integer.valueOf(25)
            }, aobj12, aobj13, new Object[] {
                "8102", Integer.valueOf(2)
            }, aobj14, aobj15
        });
    }
}
