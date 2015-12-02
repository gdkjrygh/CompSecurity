// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, c4, c_, cb, 
//            cu, bb

class t extends c
{

    private static final String z[];
    final cu a;
    final String b;
    final int c;

    t(cu cu1, String s, int i)
    {
        a = cu1;
        b = s;
        c = i;
        super();
    }

    private int a(cb acb[], int i, c_ c_1)
    {
        int j = 1;
        int i1 = c4.F;
        c_ ac_[] = c_1.a;
        if (ac_ == null)
        {
            return 0;
        }
        int k;
        int l;
        if (!c_.a(c_1, z[1]) || i1 != 0)
        {
            if (!c_.a(c_1, z[2]) || i1 != 0)
            {
                c_.b(c_1, z[3]);
                j = 2;
            }
        } else
        {
            j = 0;
        }
        k = 0;
        do
        {
            l = k;
            if (k >= ac_.length)
            {
                break;
            }
            c_1 = ac_[k];
            c_.b(c_1, z[0]);
            cb cb1 = new cb();
            cb1.c = c_1.d(z[4]);
            cb1.a = c_1.a();
            cb1.b = j;
            acb[i + k] = cb1;
            l = k + 1;
            k = l;
        } while (i1 == 0);
        return l;
    }

    private void a(c_ c_1, cb acb[])
    {
        cu.d(a).a(b, c, acb);
        if (z[5].equals(c_1.d(z[6])))
        {
            acb = c_1.d(z[7]);
            c_1 = c_1.d(z[8]);
            long l = -1L;
            if (c_1 != null)
            {
                l = Long.parseLong(c_1) * 1000L;
            }
            cu.d(a).b(b, acb, l);
        }
    }

    public void a(int i)
    {
        cu.d(a).a(b, c, i, 0L);
    }

    public void a(c_ c_1)
    {
        int i;
        int j;
        long l;
        c_1 = c_1.a(z[10]);
        j = 0;
        i = 0;
        l = -1L;
        if (c_1 == null) goto _L2; else goto _L1
_L1:
        String s = c_1.d(z[9]);
        if (s != null)
        {
            i = Integer.parseInt(s);
        }
        c_1 = c_1.d(z[11]);
        j = i;
        if (c_1 == null) goto _L2; else goto _L3
_L3:
        l = 1000L * Long.parseLong(c_1);
_L5:
        cu.d(a).a(b, c, i, l);
        return;
_L2:
        i = j;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(c_ c_1, String s)
    {
        boolean flag = false;
        int i1 = c4.F;
        c_1 = c_1.a(z[12]);
        if (c_1 == null)
        {
            return;
        }
        s = c_1.a;
        cb acb[];
        int i;
        int j;
        int k;
        int l;
        if (s != null)
        {
            k = s.length;
        } else
        {
            k = 0;
        }
        l = 0;
        i = 0;
        do
        {
            j = i;
            if (l >= k)
            {
                break;
            }
            j = i;
            if (((c_) (s[l])).a != null)
            {
                j = i + ((c_) (s[l])).a.length;
            }
            l++;
            i = j;
        } while (i1 == 0);
        acb = new cb[j];
        j = 0;
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= k)
            {
                break;
            }
            j += a(acb, j, s[i]);
            i++;
        } while (i1 == 0);
        a(c_1, acb);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[13];
        obj = "\b\023oC";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\024\016";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\022\025~";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\024\016|PM\024\004";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\027\tn";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\t\022\177T";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\021\001yE";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\013\005xBH\022\016";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\n\001cE";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\036\017nT";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "\030\022x^S";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\037\001iZN\033\006";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\016\031dR";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 368
    //                   0 391
    //                   1 398
    //                   2 405
    //                   3 412;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_412;
_L3:
        byte byte1 = 33;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 125;
          goto _L9
_L5:
        byte1 = 96;
          goto _L9
_L6:
        byte1 = 10;
          goto _L9
        byte1 = 49;
          goto _L9
    }
}
