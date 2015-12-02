// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.ci;
import com.whatsapp.util.Log;
import java.util.HashSet;

// Referenced classes of package com.whatsapp:
//            oq, App

public class a8c
    implements Runnable, ci
{

    private static final HashSet a;
    private static final String z[];
    private final Runnable b = new oq(this);
    public String c;

    public a8c(String s)
    {
        c = s;
        Log.b(a.add(s));
        App.au.ab().postDelayed(b, 20000L);
    }

    public void a()
    {
        Log.e(z[2]);
        a.remove(c);
    }

    public void a(int i)
    {
        Log.e((new StringBuilder()).append(z[1]).append(i).toString());
        App.au.ab().removeCallbacks(b);
        a.remove(c);
    }

    public void run()
    {
        Log.i(z[0]);
        App.au.ab().removeCallbacks(b);
        a.remove(c);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "W\020\032f\003R\020\027t\037Z\r\020i\020I\032\nw\030U\f\034o\026U\033\025b\005\024\f\fd\024^\f\n";
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
                obj = "W\020\032f\003R\020\027t\037Z\r\020i\020I\032\nw\030U\f\034o\026U\033\025b\005\024\032\013u\030I_";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "W\020\032f\003R\020\027t\037Z\r\020i\020I\032\nw\030U\f\034o\026U\033\025b\005\024\013\020j\022T\n\r";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                a = new HashSet();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 168
    //                   0 189
    //                   1 195
    //                   2 201
    //                   3 207;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_207;
_L3:
        byte byte0 = 119;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 59;
          goto _L9
_L5:
        byte0 = 127;
          goto _L9
_L6:
        byte0 = 121;
          goto _L9
        byte0 = 7;
          goto _L9
    }
}
