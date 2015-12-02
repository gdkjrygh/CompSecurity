// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Build;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            fj, f0, f4

public abstract class fm
{

    public static int a;
    private static final String z[];
    protected int b;
    protected File c;

    public fm()
    {
    }

    public static fm a(String s, String s1)
    {
        if (z[8].equals(s1))
        {
            return new fj((new StringBuilder()).append(s).append(z[3]).toString());
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && Build.MANUFACTURER.equals(z[1]) && !Build.MODEL.equals(z[0]) && !Build.MODEL.equals(z[2]))
        {
            s = new f0(s);
            s.b(5);
            return s;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && Build.MANUFACTURER.equals(z[4]) && Build.MODEL.contains(z[7]) && !Build.MODEL.equals(z[5]) && !Build.MODEL.equals(z[6]))
        {
            return new f0(s);
        } else
        {
            return new f4(s, s1);
        }
    }

    public abstract void a();

    public abstract void b();

    public File c()
    {
        return c;
    }

    public int d()
    {
        return b;
    }

    public abstract void e();

    public abstract void f();

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "8\026*d8";
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
                obj = "(Ku-";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "8\026*d9";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "UKk!\177";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\bEv'y\025C";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "(i6\0325K\024";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "(i6\0325K\024+";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "(i6\0325K\024";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\032Q\177=cTK|37[Gt0i\030W&;|\016W";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 12;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 123;
          goto _L9
_L5:
        byte1 = 36;
          goto _L9
_L6:
        byte1 = 27;
          goto _L9
        byte1 = 84;
          goto _L9
    }
}
