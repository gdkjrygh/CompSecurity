// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp:
//            App

public class ExternalMediaManager extends Service
{

    private static final String z[];

    public ExternalMediaManager()
    {
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (App.aC || !App.ae)
        {
            App.aC = false;
            App.ae = true;
            Log.i(z[0]);
            App.h(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (App.aC || App.ae)
        {
            App.aC = false;
            App.ae = false;
            Log.i(z[4]);
            App.h(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!App.aC)
        {
            App.aC = true;
            App.ae = true;
            Log.i((new StringBuilder()).append(z[1]).append(Environment.getExternalStorageState()).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
label0:
        {
            i = App.am;
            intent = Environment.getExternalStorageState();
            if (intent.equals(z[3]))
            {
                b();
                c1.b();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (intent.equals(z[2]))
            {
                a();
                c1.b();
                if (i == 0)
                {
                    break label0;
                }
            }
            c();
        }
        return 2;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\005\030\tM\034\016\001\021w\003\005\004\024IA\022\005\034LC\017\016\021Q";
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
                obj = "\005\030\tM\034\016\001\021w\003\005\004\024IA\025\016\034^\017\t\f\034J\002\005@";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\r\017\bF\032\005\004\"Z\001";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\r\017\bF\032\005\004";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\005\030\tM\034\016\001\021w\003\005\004\024IA\001\026\034A\002\001\002\021M";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 110;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 96;
          goto _L9
_L5:
        byte1 = 96;
          goto _L9
_L6:
        byte1 = 125;
          goto _L9
        byte1 = 40;
          goto _L9
    }
}
