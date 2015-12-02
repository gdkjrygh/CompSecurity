// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package com.whatsapp:
//            t6, dv, ui, App

public class jo
{

    private static jo f;
    private static final String z[];
    private Handler a;
    private t6 b;
    private boolean c;
    private Runnable d;
    private Stack e;

    private jo()
    {
        b = new t6(this, null);
        e = new Stack();
        a = new Handler();
        d = new dv(this);
        b.setPriority(1);
        b.start();
    }

    public static jo a()
    {
        com/whatsapp/jo;
        JVM INSTR monitorenter ;
        jo jo1;
        if (f == null)
        {
            f = new jo();
        }
        jo1 = f;
        com/whatsapp/jo;
        JVM INSTR monitorexit ;
        return jo1;
        Exception exception;
        exception;
        throw exception;
    }

    static Stack a(jo jo1)
    {
        return jo1.e;
    }

    public void a(c4 c4_1)
    {
        if (c4_1.w != 0 && com.whatsapp.ui.a(c4_1, true, null) == null)
        {
            return;
        }
        synchronized (e)
        {
            Log.i((new StringBuilder()).append(z[1]).append(c4_1.l).toString());
            e.add(c4_1);
            if (!c)
            {
                e.notifyAll();
            }
        }
        return;
        c4_1;
        stack;
        JVM INSTR monitorexit ;
        throw c4_1;
    }

    public void a(boolean flag)
    {
        Stack stack = e;
        stack;
        JVM INSTR monitorenter ;
        Log.i((new StringBuilder()).append(z[2]).append(flag).toString());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        a.removeCallbacks(d);
        a.postDelayed(d, 15000L);
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (c)
        {
            e.notifyAll();
        }
        c = flag;
        stack;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        stack;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        int i = App.am;
        Stack stack = e;
        stack;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        Iterator iterator;
        int j;
        Log.i((new StringBuilder()).append(z[3]).append(e.size()).toString());
        j = App.G();
        arraylist = new ArrayList();
        iterator = e.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        c4 c4_1 = (c4)iterator.next();
        if (!com.whatsapp.App.a(j, c4_1))
        {
            arraylist.add(c4_1);
        }
          goto _L3
_L2:
        e.removeAll(arraylist);
        stack;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        stack;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        if (i == 0) goto _L4; else goto _L2
    }

    public void b(c4 c4_1)
    {
        int i = App.am;
        Stack stack = e;
        stack;
        JVM INSTR monitorenter ;
        Iterator iterator = e.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        c4 c4_2 = (c4)iterator.next();
        if (!c4_1.y.equals(c4_2.y)) goto _L4; else goto _L3
_L3:
        Log.i((new StringBuilder()).append(z[0]).append(c4_1.l).toString());
        e.remove(c4_2);
        if (i == 0) goto _L2; else goto _L4
_L2:
        stack;
        JVM INSTR monitorexit ;
        return;
        c4_1;
        stack;
        JVM INSTR monitorexit ;
        throw c4_1;
_L4:
        if (i == 0) goto _L5; else goto _L2
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "^VV\017\036RFF\t\033\\D\\\n\020RW\035\005\036]PW\n_";
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
                obj = "^VV\017\036RFF\t\033\\D\\\n\020RW\035\027\nVFWF";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "^VV\017\036RFF\t\033\\D\\\n\020RW\035\023\017WRF\003\fGRF\003_";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "^VV\017\036RFF\t\033\\D\\\n\020RW\035\023\017WRF\003\016FVG\003_";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 127;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 51;
          goto _L9
_L5:
        byte0 = 51;
          goto _L9
_L6:
        byte0 = 50;
          goto _L9
        byte0 = 102;
          goto _L9
    }
}
