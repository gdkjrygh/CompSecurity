// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;

// Referenced classes of package com.whatsapp:
//            a9n, DialogToastActivity

public final class qt
{

    private static final String z[];
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public qt(Intent intent)
    {
        boolean flag = a9n.a;
        super();
        if (!z[4].equals(intent.getAction()))
        {
            throw new IllegalArgumentException(z[3]);
        }
        c = intent.getIntExtra(z[0], 1);
        d = intent.getIntExtra(z[5], -1);
        a = intent.getIntExtra(z[2], 0);
        b = intent.getIntExtra(z[1], -1);
        if (flag)
        {
            DialogToastActivity.g++;
        }
    }

    private String b()
    {
        boolean flag = a9n.a;
        c;
        JVM INSTR tableswitch 1 7: default 52
    //                   1 86
    //                   2 97
    //                   3 108
    //                   4 119
    //                   5 130
    //                   6 141
    //                   7 152;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        String s = (new StringBuilder()).append(z[10]).append(c).append(')').toString();
_L9:
        return s;
_L2:
        s = z[11];
        if (!flag) goto _L9; else goto _L3
_L3:
        s = z[12];
        if (!flag) goto _L9; else goto _L4
_L4:
        s = z[6];
        if (!flag) goto _L9; else goto _L5
_L5:
        s = z[9];
        if (!flag) goto _L9; else goto _L6
_L6:
        s = z[7];
        if (!flag) goto _L9; else goto _L7
_L7:
        s = z[13];
        if (!flag) goto _L9; else goto _L8
_L8:
        s = z[8];
        if (!flag) goto _L9; else goto _L1
    }

    public boolean a()
    {
        int i;
        try
        {
            i = a;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return i != 0;
    }

    public boolean c()
    {
        double d1 = d();
        boolean flag;
        try
        {
            flag = a();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                try
                {
                    throw illegalargumentexception1;
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    throw illegalargumentexception2;
                }
            }
        }
        return flag || d1 != (0.0D / 0.0D) && d1 > 20D;
    }

    public double d()
    {
        int i = d;
        IllegalArgumentException illegalargumentexception;
        if (i >= 0)
        {
            try
            {
                if (b > 0)
                {
                    return ((double)d * 100D) / (double)b;
                }
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        break MISSING_BLOCK_LABEL_38;
        illegalargumentexception;
        throw illegalargumentexception;
        return (0.0D / 0.0D);
    }

    public String toString()
    {
        boolean flag = a9n.a;
        String s;
        int i;
        try
        {
            s = (new StringBuilder()).append(z[14]).append(b()).append(z[15]).append(d).append(z[17]).append(a).append(z[18]).append(b).append(z[16]).append(d()).append('}').toString();
            i = DialogToastActivity.g;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            try
            {
                throw illegalargumentexception;
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (i != 0)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            a9n.a = flag;
        }
        return s;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[19];
        obj = "6\0018?56";
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
                obj = "-\0078?$";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ".\b,4&;\0";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\027\n-6/*D4&2*D;6a?\n=!.7\000w:/*\0017'o?\007-:.0J\033\022\025\n!\013\n\036\035,\030\035\006\033 ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "?\n=!.7\000w:/*\0017'o?\007-:.0J\033\022\025\n!\013\n\036\035,\030\035\006\033 ";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "2\001/6-";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "1\022<!);\005-";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "1\022<!\036(\0135' 9\001";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "=\01357";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ":\00187";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "1\020163v";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "+\n2=.)\n";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "9\01367";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "+\n*#$=\r?:$:;?2(2\021+6";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\034\005-'$,\035\032; 0\003<();\0055')c";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "rD567;\bd";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "rD)63=\0017'|";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "rD)?49\003<7|";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "rD*0 2\001d";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 500
    //                   0 523
    //                   1 530
    //                   2 537
    //                   3 544;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_544;
_L3:
        byte byte1 = 65;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 94;
          goto _L9
_L5:
        byte1 = 100;
          goto _L9
_L6:
        byte1 = 89;
          goto _L9
        byte1 = 83;
          goto _L9
    }
}
