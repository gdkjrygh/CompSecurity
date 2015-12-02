// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            b0, c_

public class b3
{

    private static final String z[];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public b3()
    {
    }

    public b3(b3 b3_1)
    {
        a = b3_1.a;
        b = b3_1.b;
        d = b3_1.d;
        c = b3_1.c;
        e = b3_1.e;
    }

    public c_ a()
    {
        return null;
    }

    public Vector b()
    {
        String s1 = a;
        String s2 = b;
        Object obj = c;
        String s3 = d;
        String s4 = e;
        String s = ((String) (obj));
        if (z[3].equals(s2))
        {
            s = ((String) (obj));
            if (z[4].equals(obj))
            {
                s = null;
            }
        }
        obj = new Vector(10);
        ((Vector) (obj)).addElement(new b0(z[0], s1));
        ((Vector) (obj)).addElement(new b0(z[5], s2));
        if (s != null)
        {
            ((Vector) (obj)).addElement(new b0(z[1], s));
        }
        ((Vector) (obj)).addElement(new b0(z[6], s3));
        if (s4 != null && s4.length() > 0)
        {
            ((Vector) (obj)).addElement(new b0(z[2], s4));
        }
        return ((Vector) (obj));
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (b3)obj;
        if (b == null)
        {
            if (((b3) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((b3) (obj)).b))
        {
            return false;
        }
        if (a == null)
        {
            if (((b3) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((b3) (obj)).a))
        {
            return false;
        }
        if (d == null)
        {
            if (((b3) (obj)).d != null)
            {
                return false;
            }
        } else
        if (!d.equals(((b3) (obj)).d))
        {
            return false;
        }
        if (e == null)
        {
            if (((b3) (obj)).e != null)
            {
                return false;
            }
        } else
        if (!e.equals(((b3) (obj)).e))
        {
            return false;
        }
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((b3) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (c.equals(((b3) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.hashCode();
        }
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.hashCode();
        }
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.hashCode();
        }
        if (c != null)
        {
            i1 = c.hashCode();
        }
        return (l + (k + (j + (i + 31) * 31) * 31) * 31) * 31 + i1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(z[8]);
        String s;
        if (a == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(z[9]).append(a).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (b == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(z[10]).append(b).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (d == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(z[7]).append(d).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (c == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(z[11]).append(c).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (e == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(z[12]).append(e).toString();
        }
        return stringbuilder.append(s).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[13];
        obj = "s\030";
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
                obj = "s\016Z%";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "w\026X4\016d\036Z!\ts";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "u\022I%\016w\003";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "c\022F)\021b\005S";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "d\033K3\024";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "n\023";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "'\036N}";
                byte0 = 6;
                i = 7;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\\$^!\t}\026a%\036";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "'\021X/\n:";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "'\024F3Z";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "'\003S0\002:";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "'\007K2\023n\024C0\006i\003\027";
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
        byte byte1 = 103;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 7;
          goto _L9
_L5:
        byte1 = 119;
          goto _L9
_L6:
        byte1 = 42;
          goto _L9
        byte1 = 64;
          goto _L9
    }
}
