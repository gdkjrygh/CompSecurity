// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            y, bx, aj, ad, 
//            q, ab, ac

final class bw
{

    private static final int a[] = {
        1, 1, 2
    };
    private static final int b[] = {
        24, 20, 18, 17, 12, 6, 3, 10, 9, 5
    };
    private final int c[] = new int[4];
    private final StringBuffer d = new StringBuffer();

    bw()
    {
    }

    final ab a(int i, aj aj1, int j)
        throws y
    {
        int ai1[];
        String s;
        StringBuffer stringbuffer;
        int j2;
        int i3;
        int j3;
label0:
        {
            ai1 = bx.a(aj1, j, false, a);
            stringbuffer = d;
            stringbuffer.setLength(0);
            int ai[] = c;
            ai[0] = 0;
            ai[1] = 0;
            ai[2] = 0;
            ai[3] = 0;
            j3 = aj1.b;
            j = ai1[1];
            int k = 0;
            int i2;
            for (int l2 = 0; l2 < 5 && j < j3; j = i2)
            {
                int k3 = bx.a(aj1, ai, j, bx.e);
                stringbuffer.append((char)(k3 % 10 + 48));
                for (int l1 = 0; l1 < ai.length; l1++)
                {
                    j += ai[l1];
                }

                if (k3 >= 10)
                {
                    k |= 1 << 4 - l2;
                }
                i2 = j;
                if (l2 != 4)
                {
                    i2 = j;
                    do
                    {
                        j = i2;
                        if (i2 >= j3)
                        {
                            break;
                        }
                        j = i2;
                        if (aj1.a(i2))
                        {
                            break;
                        }
                        i2++;
                    } while (true);
                    do
                    {
                        i2 = j;
                        if (j >= j3)
                        {
                            break;
                        }
                        i2 = j;
                        if (!aj1.a(j))
                        {
                            break;
                        }
                        j++;
                    } while (true);
                }
                l2++;
            }

            if (stringbuffer.length() != 5)
            {
                throw y.a();
            }
            j2 = 0;
            do
            {
                if (j2 >= 10)
                {
                    break;
                }
                if (k == b[j2])
                {
                    aj1 = stringbuffer.toString();
                    j3 = aj1.length();
                    i3 = 0;
                    for (int l = j3 - 2; l >= 0; l -= 2)
                    {
                        i3 += aj1.charAt(l) - 48;
                    }

                    break label0;
                }
                j2++;
            } while (true);
            throw y.a();
        }
        i3 *= 3;
        for (int i1 = j3 - 1; i1 >= 0; i1 -= 2)
        {
            i3 += aj1.charAt(i1) - 48;
        }

        if ((i3 * 3) % 10 != j2)
        {
            throw y.a();
        }
        s = stringbuffer.toString();
        s.length();
        JVM INSTR tableswitch 2 5: default 428
    //                   2 516
    //                   3 428
    //                   4 428
    //                   5 536;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        aj1 = null;
_L4:
        int j1 = ai1[0];
        Object obj = new ad((float)(ai1[1] + j1) / 2.0F, i);
        ad ad1 = new ad(j, i);
        q q1 = q.p;
        obj = new ab(s, null, new ad[] {
            obj, ad1
        }, q1);
        if (aj1 != null)
        {
            ((ab) (obj)).a(aj1);
        }
        return ((ab) (obj));
_L2:
        Object obj1;
        obj1 = ac.e;
        aj1 = Integer.valueOf(s);
_L9:
        ac ac1;
        if (aj1 == null)
        {
            aj1 = null;
        } else
        {
            Hashtable hashtable = new Hashtable(1);
            hashtable.put(obj1, aj1);
            aj1 = hashtable;
        }
          goto _L4
_L3:
        ac1 = ac.f;
        s.charAt(0);
        JVM INSTR lookupswitch 3: default 580
    //                   48: 674
    //                   53: 680
    //                   57: 686;
           goto _L5 _L6 _L7 _L8
_L5:
        aj1 = "";
_L10:
        int k2 = Integer.parseInt(s.substring(1));
        int k1 = k2 / 100;
        k2 %= 100;
        if (k2 < 10)
        {
            obj1 = (new StringBuilder("0")).append(k2).toString();
        } else
        {
            obj1 = String.valueOf(k2);
        }
        aj1 = (new StringBuilder()).append(aj1).append(String.valueOf(k1)).append('.').append(((String) (obj1))).toString();
_L13:
        obj1 = ac1;
          goto _L9
_L6:
        aj1 = "\243";
          goto _L10
_L7:
        aj1 = "$";
          goto _L10
_L8:
        if (!"90000".equals(s)) goto _L12; else goto _L11
_L11:
        aj1 = null;
          goto _L13
_L12:
        if (!"99991".equals(s)) goto _L15; else goto _L14
_L14:
        aj1 = "0.00";
          goto _L13
_L15:
        if (!"99990".equals(s)) goto _L17; else goto _L16
_L16:
        aj1 = "Used";
          goto _L13
_L17:
        aj1 = "";
          goto _L10
    }

}
