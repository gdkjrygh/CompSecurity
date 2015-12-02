// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            nz, bx, App, z4

public class s3 extends ContentObserver
{

    private static boolean a;
    private static int d;
    private static int e;
    private static final String z[];
    private final Runnable b = new nz(this);
    private final Runnable c = new bx(this);
    private final Handler f;

    public s3()
    {
        super(null);
        HandlerThread handlerthread = new HandlerThread(z[0], 10);
        handlerthread.start();
        f = new Handler(handlerthread.getLooper());
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        f.removeCallbacks(c);
        f.post(c);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(s3 s3_1)
    {
        s3_1.a();
    }

    private void a(boolean flag, boolean flag1)
    {
        Object obj;
        boolean flag2;
        int i;
        flag2 = false;
        i = App.am;
        obj = z[12];
        obj = App.au.getSharedPreferences(((String) (obj)), 0);
        if (obj == null) goto _L2; else goto _L1
_L1:
        int j = ((SharedPreferences) (obj)).getInt(z[10], 0);
        if (!flag1) goto _L4; else goto _L3
_L3:
        j;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 99
    //                   1 109
    //                   2 100;
           goto _L5 _L2 _L6 _L7
_L5:
        byte byte0 = 1;
_L12:
        if (i == 0) goto _L8; else goto _L4
_L4:
        if (flag && i == 0) goto _L10; else goto _L9
_L9:
        if (j != 1) goto _L11; else goto _L2
_L2:
        return;
_L7:
        byte0 = flag2;
        if (i == 0) goto _L12; else goto _L6
_L6:
        if (!flag) goto _L2; else goto _L13
_L13:
        byte0 = flag2;
        if (i != 0)
        {
            return;
        }
          goto _L12
_L11:
        byte0 = 2;
_L8:
        if (((SharedPreferences) (obj)).edit().putInt(z[8], byte0).commit()) goto _L2; else goto _L14
_L14:
        Log.e((new StringBuilder()).append(z[11]).append(byte0).append(z[9]).toString());
        return;
_L10:
        byte0 = 1;
          goto _L8
    }

    static Runnable b(s3 s3_1)
    {
        return s3_1.b;
    }

    public void a(int i)
    {
        int j = b();
        Log.i((new StringBuilder()).append(z[5]).append(i).append(z[4]).append(j).append(")").toString());
        if (j != i)
        {
            e = i;
            android.content.SharedPreferences.Editor editor = App.au.getSharedPreferences(z[3], 0).edit();
            editor.putInt(z[6], i);
            if (!editor.commit())
            {
                Log.e(z[7]);
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        a(flag, false);
    }

    public int b()
    {
        if (e == -1)
        {
            String s = z[2];
            e = App.au.getSharedPreferences(s, 0).getInt(z[1], 0);
        }
        return e;
    }

    public void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (d == 0)
        {
            a = true;
            App.au.getContentResolver().unregisterContentObserver(this);
        }
        d++;
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        d--;
        if (d == 0)
        {
            a = false;
            App.au.ab().postDelayed(new z4(this), 5000L);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(boolean flag)
    {
        a(flag, true);
    }

    public void onChange(boolean flag)
    {
label0:
        {
            if (App.Z != null)
            {
                if (!a)
                {
                    break label0;
                }
                Log.i(z[13]);
            }
            return;
        }
        a();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[14];
        i = 0;
        obj = "GZ&2";
        byte0 = -1;
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
                obj = "WL&%\033WW\027'\037FP!>\024";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "WL%\177\r\\B<\"\033DS\027!\bQE-#\037Z@-\"";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "WL%\177\r\\B<\"\033DS\027!\bQE-#\037Z@-\"";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\024\0138#\037B\036";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "WL&%\033WWg>\030GF:'\037F\f;4\016BF:\"\023[Mu";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "WL&%\033WW\027'\037FP!>\024";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "WL&%\033WWg>\030GF:'\037F\f;4\016BF:\"\023[M;$\027\033E)8\026QG";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "GZ&2%ZF-5\037P";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\024E)8\026QG";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "GZ&2%ZF-5\037P";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "DQ-7\t\033P1?\031AS,0\016Q\003";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "WL%\177\r\\B<\"\033DS\027!\bQE-#\037Z@-\"";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "WL&%\033WWg>\030GF:'\037F\f;:\023D\f >\026Pt 8\026Qb+2\025AM<\002\003Z@";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                e = -1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 392
    //                   0 415
    //                   1 422
    //                   2 429
    //                   3 436;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_436;
_L3:
        byte byte1 = 122;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 52;
          goto _L9
_L5:
        byte1 = 35;
          goto _L9
_L6:
        byte1 = 72;
          goto _L9
        byte1 = 81;
          goto _L9
    }
}
