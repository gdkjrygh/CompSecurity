// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


public class a
{

    private static final String z[];
    public final String a;
    public final boolean b;
    public final String c;

    public a(String s, boolean flag, String s1)
    {
        a = s;
        b = flag;
        c = s1;
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
        obj = (a)obj;
        if (b != ((a) (obj)).b)
        {
            return false;
        }
        if (c == null)
        {
            if (((a) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((a) (obj)).c))
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((a) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((a) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        char c1;
        int i;
        if (b)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        if (a != null)
        {
            j = a.hashCode();
        }
        return (i + (c1 + 31) * 31) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[0]).append(c).append(z[1]).append(b).append(z[2]).append(a).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "N\000\000\017^aX";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = ")E\037&Xh:\0241\n";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = ")E\0131Zj\021\034\013]l\001D";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 182
    //                   2 188
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 55;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 5;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 121;
          goto _L9
        byte0 = 84;
          goto _L9
    }
}
