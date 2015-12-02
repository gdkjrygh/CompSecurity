// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.contact.b;
import com.whatsapp.contact.j;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.whatsapp:
//            s2, App, k, s3, 
//            ov

public class sf
{

    private static final Runnable a;
    private static Thread b;
    private static AtomicBoolean c;
    private static final String z[];

    public static boolean a()
    {
        return c.get();
    }

    static AtomicBoolean b()
    {
        return c;
    }

    public static boolean c()
    {
        return b != null && b.isAlive();
    }

    static boolean d()
    {
        return e();
    }

    private static boolean e()
    {
        try
        {
            Log.i(z[0]);
            if (com.whatsapp.contact.b.a());
            com.whatsapp.App.j();
            App.az.d();
            int l = App.az.a();
            com.whatsapp.contact.b.d(App.au, j.REGISTRATION_FULL);
            App.S.sendEmptyMessage(1);
            if (com.whatsapp.contact.b.c());
            App.ay.c(true);
            App.ay.a(l);
        }
        catch (Exception exception)
        {
            Log.a(z[1], exception);
            return false;
        }
        return true;
    }

    public static void f()
    {
        c.set(false);
    }

    public static void g()
    {
        c.set(true);
    }

    public static void h()
    {
label0:
        {
            boolean flag = ov.e;
            if (c())
            {
                Log.i(z[3]);
                if (!flag)
                {
                    break label0;
                }
            }
            if (c.get())
            {
                Log.i(z[2]);
                if (!flag)
                {
                    break label0;
                }
            }
            b = new Thread(a);
            b.start();
        }
    }

    public static boolean i()
    {
        if (c())
        {
            b.join();
        }
        return c.get();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int l;
        as = new String[4];
        obj = "\032\004]Iw\027\002[InQ\fGAn\032\007";
        byte1 = -1;
        l = 0;
_L2:
        String as1[];
        int i1;
        int j1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L8:
label0:
        {
            if (j1 > i1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[l] = ((String) (obj));
                obj = "\027\013@\\^<JLZh\021\027";
                l = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "\032\004]I:\023\fNZ{\n\fFF:\037\t[M{\032\034\t[o\035\006L[i\030\020E";
                l = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                l = 3;
                obj = "\032\004]I:\023\fNZ{\n\fFF:\037\t[M{\032\034\tZo\020\013@F}";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                z = as;
                c = new AtomicBoolean();
                a = new s2();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 196
    //                   0 217
    //                   1 223
    //                   2 229
    //                   3 235;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_235;
_L3:
        byte byte0 = 26;
_L9:
        obj[i1] = (char)(byte0 ^ c1);
        i1++;
          goto _L8
_L4:
        byte0 = 126;
          goto _L9
_L5:
        byte0 = 101;
          goto _L9
_L6:
        byte0 = 41;
          goto _L9
        byte0 = 40;
          goto _L9
    }
}
