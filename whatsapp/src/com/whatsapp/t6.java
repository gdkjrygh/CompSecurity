// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.Stack;

// Referenced classes of package com.whatsapp:
//            App, jo, Voip, au2, 
//            MediaData, ui, go, ws, 
//            a_l, aoz, dv

final class t6 extends Thread
{

    private static final String z[];
    final jo a;

    private t6(jo jo1)
    {
        a = jo1;
        super(z[5]);
    }

    t6(jo jo1, dv dv)
    {
        this(jo1);
    }

    public void run()
    {
        int i = App.am;
_L13:
        if (jo.a(a).size() == 0)
        {
            synchronized (jo.a(a))
            {
                jo.a(a).wait();
            }
        }
        Thread.sleep(1000L);
        Voip.c();
        if (jo.a(a).size() == 0) goto _L2; else goto _L1
_L1:
        synchronized (jo.a(a))
        {
            obj1 = (c4)jo.a(a).pop();
            Log.i((new StringBuilder()).append(z[0]).append(((c4) (obj1)).l).toString());
        }
        if (((c4) (obj1)).w == 0) goto _L4; else goto _L3
_L3:
        long l2;
        long l3;
        l2 = App.A();
        l3 = App.az();
        long l1 = 0L;
        int j;
        if (((c4) (obj1)).w == 3)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        j = ((c4) (obj1)).w;
        long l;
        l = l1;
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        j = ((c4) (obj1)).n;
        l = l1;
        if (j == 1)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        l = Math.max(au2.q * 1024 * 1024, Math.min(0x8000000L, l3 / 10L));
        l1 = l;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_586;
        }
        j = ((c4) (obj1)).w;
        l1 = l;
        if (j != 1)
        {
            break MISSING_BLOCK_LABEL_586;
        }
        l = Math.max(au2.q * 512 * 1024, Math.min(0x2000000L, l3 / 20L));
_L15:
        if (l2 <= l) goto _L6; else goto _L5
_L5:
        ui ui1;
        Object obj2;
        obj2 = (MediaData)((c4) (obj1)).B;
        ui1 = ((MediaData) (obj2)).downloader;
        if (ui1.isCancelled()) goto _L8; else goto _L7
_L7:
        boolean flag = ui1.a();
        if (!flag) goto _L8; else goto _L9
_L9:
        obj = ui1.a(new Void[0]);
_L14:
        if (ui1.isCancelled()) goto _L8; else goto _L10
_L10:
        obj2 = ((MediaData) (obj2)).downloader;
        if (ui1 != obj2) goto _L8; else goto _L11
_L11:
        ui1.a(((go) (obj)));
_L8:
        if (i == 0) goto _L2; else goto _L6
_L6:
        Log.e((new StringBuilder()).append(z[4]).append(l3).append(z[2]).append(l2).append(z[3]).append(l).toString());
        ((MediaData)((c4) (obj1)).B).downloader.b();
_L2:
        flag = Thread.interrupted();
        if (!flag) goto _L13; else goto _L12
_L12:
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        obj = jo.a(a);
        obj;
        JVM INSTR monitorenter ;
        do
        {
            if (jo.a(a).isEmpty())
            {
                break;
            }
            obj1 = (MediaData)((c4)jo.a(a).pop()).B;
            obj1.transferring = false;
            obj1.progress = 0L;
        } while (i == 0);
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        Exception exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        exception;
        throw exception;
        Exception exception1;
        exception1;
        exception = new go(ws.FAILED_GENERIC);
        Log.e((new StringBuilder()).append(z[1]).append(exception1.toString()).toString());
          goto _L14
        exception;
        throw exception;
        exception;
        throw exception;
_L4:
        obj1.B = a_l.a(((c4) (obj1)).e());
        if (((c4) (obj1)).B != null)
        {
            App.ah.e(((c4) (obj1)));
        }
          goto _L2
        exception;
        throw exception;
        l = l1;
          goto _L15
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "9$,o\03654<i\033;6&j\0205%gb\020#/$i\0360a";
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
                obj = "9$,o\03654<i\033;6&j\0205%gb\020#/$i\0360a.g\0268$,&";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "t':c\032n";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "t/-c\033n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "9$,o\03654<i\033;6&j\0205%gh\020'1)e\032t5'r\0368{";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\031$,o\036\030.)b\032&";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 127;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 84;
          goto _L9
_L5:
        byte1 = 65;
          goto _L9
_L6:
        byte1 = 72;
          goto _L9
        byte1 = 6;
          goto _L9
    }
}
