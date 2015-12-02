// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            an, App, tt, ie, 
//            ey

class ys
    implements Runnable
{

    private static final String z[];
    final int a;
    final long b;
    final a c;
    final int d;
    final an e;

    ys(an an1, int i, a a1, long l, int j)
    {
        e = an1;
        a = i;
        c = a1;
        b = l;
        d = j;
        super();
    }

    public void run()
    {
        int i = com.whatsapp.an.a(e).aq.b();
        if (i == d)
        {
            Log.i((new StringBuilder()).append(z[1]).append(i).append(z[3]).append(d).append(z[4]).toString());
            com.whatsapp.an.a(e).ab().post(new ie(this, com.whatsapp.an.a(e).aq.g(), i, com.whatsapp.an.a(e).aq.a(), com.whatsapp.an.a(e).aq.f().b(), false));
            return;
        }
        boolean flag = com.whatsapp.an.a(e).aq.e();
        Log.i((new StringBuilder()).append(z[2]).append(flag).toString());
        if (!com.whatsapp.an.a(e).aq.b())
        {
            Log.i(z[0]);
            com.whatsapp.an.a(e).aq.h();
        }
        com.whatsapp.an.a(e).ab().post(new ie(this, com.whatsapp.an.a(e).aq.g(), i, com.whatsapp.an.a(e).aq.a(), com.whatsapp.an.a(e).aq.f().b(), true));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\fTd\032Q\031@+\020Q\030BoVP\002\f{\004[\006Ir\005\036\fZj\037R\fNg\023\036\031C+\005[\003H+\002QMXc\023\036\036Iy\000[\037";
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
                obj = "\fTd\032Q\031@+\032Q\016MgVL\bKb\005J\037M\177\037Q\003\fb\022\036";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\fTd\032Q\031@+\033_\037Gn\022\036\036Cf\023\036\035^n\035[\024_+\006L\bZb\031K\036@rVM\bB\177V_\036\f~\030M\bB\177L\036";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "MAj\002]\005IoVM\b^}\023LM^n\021W\036Xy\027J\004CeVW\t\f";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "MEeVL\bFn\025J\bH+\004[\031^r";
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
        char c1 = obj[j];
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
        byte byte1 = 62;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 109;
          goto _L9
_L5:
        byte1 = 44;
          goto _L9
_L6:
        byte1 = 11;
          goto _L9
        byte1 = 118;
          goto _L9
    }
}
