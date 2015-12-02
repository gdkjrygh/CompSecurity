// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


public class cr
{

    public static int a;
    public static int b;
    public static float j;
    private static final String z[];
    public float c;
    public double d;
    public double e;
    public int f;
    public String g;
    public int h;
    public long i;

    public cr()
    {
        f = b;
        c = j;
        h = a;
    }

    public boolean a()
    {
        return i > 0L;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z[6]).append(g).append(z[3]).append(e).append(z[4]).append(d).append(z[2]).append(f).append(z[0]).append(c).append(z[1]).append(h).append(z[5]).append(i).append("]").toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[7];
        k = 0;
        obj = "05h\005yt{";
        byte0 = -1;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "0$}\001ny(\177]";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "0'{\003ib'{\031!";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "0*y\024ud3|\005!";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                k = 4;
                obj = "0*w\016{y2m\004y-";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "02q\ryc2y\rl-";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "K\023k\005n\\){\001hy)v@vy\"%";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                z = as;
                b = -1;
                j = -1F;
                a = -1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 248
    //                   0 271
    //                   1 278
    //                   2 285
    //                   3 292;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_292;
_L3:
        byte byte1 = 28;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 70;
          goto _L9
_L6:
        byte1 = 24;
          goto _L9
        byte1 = 96;
          goto _L9
    }
}
