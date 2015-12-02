// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.contact.b;
import com.whatsapp.contact.g;
import com.whatsapp.contact.i;
import com.whatsapp.contact.j;
import com.whatsapp.contact.n;
import com.whatsapp.util.Log;
import com.whatsapp.util.a3;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, k, RegisterName, s3, 
//            hy, og

class aky extends Thread
{

    private static final String z[];
    private boolean a;
    final RegisterName b;
    private Handler c;
    private int d;
    private boolean e;

    public aky(RegisterName registername, Handler handler)
    {
        b = registername;
        super();
        e = false;
        a = false;
        d = 0;
        c = handler;
        start();
    }

    static boolean a(aky aky1)
    {
        return aky1.e;
    }

    static int b(aky aky1)
    {
        return aky1.d;
    }

    static boolean c(aky aky1)
    {
        return aky1.a;
    }

    public void a()
    {
        if (c != null)
        {
            c.removeMessages(0);
            c = null;
        }
    }

    public void a(Handler handler)
    {
        if (e)
        {
            handler.sendEmptyMessage(0);
        }
        c = handler;
    }

    public void run()
    {
        int k1 = App.am;
        if (!com.whatsapp.contact.b.a())
        {
            Log.w(z[7]);
        }
        int l1 = App.az.a();
        int l = 1001;
        int i1 = i.b(g.BOTH).intValue();
        l = i1;
_L16:
        Object obj = b;
        boolean flag;
        if (l <= 1000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        App.c(((android.content.Context) (obj)), flag);
        Log.i((new StringBuilder()).append(z[21]).append(l).append(z[3]).append(App.u(b)).append(")").toString());
        com.whatsapp.contact.b.c(b.getApplicationContext());
        obj = com.whatsapp.contact.b.d(b.getApplicationContext(), j.REGISTRATION_FULL);
        Log.i((new StringBuilder()).append(z[22]).append(obj).toString());
        if (obj != n.NETWORK_UNAVAILABLE) goto _L2; else goto _L1
_L1:
        d = 1;
        e = true;
        Log.i(z[1]);
        if (c != null)
        {
            c.sendEmptyMessage(0);
        }
        if (!com.whatsapp.contact.b.c())
        {
            Log.w(z[5]);
        }
_L4:
        return;
        obj;
        throw obj;
        obj;
        Object obj1;
        Object obj2;
        try
        {
            e = true;
            Log.i(z[0]);
            if (c != null)
            {
                c.sendEmptyMessage(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (com.whatsapp.contact.b.c()) goto _L4; else goto _L3
_L3:
        Log.w(z[16]);
        return;
        obj;
        throw obj;
        obj;
        Log.a(z[17], ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        d = 3;
        Log.a(z[20], ((Throwable) (obj)));
        e = true;
        Log.i(z[13]);
        if (c != null)
        {
            c.sendEmptyMessage(0);
        }
        if (com.whatsapp.contact.b.c()) goto _L4; else goto _L5
_L5:
        Log.w(z[10]);
        return;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        try
        {
            e = true;
            Log.i(z[11]);
            if (c != null)
            {
                c.sendEmptyMessage(0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (!com.whatsapp.contact.b.c())
        {
            Log.w(z[14]);
        }
        throw obj;
        obj;
        throw obj;
_L2:
        if (obj != n.FAILED)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        d = 3;
        e = true;
        Log.i(z[4]);
        if (c != null)
        {
            c.sendEmptyMessage(0);
        }
        if (com.whatsapp.contact.b.c()) goto _L4; else goto _L6
_L6:
        Log.w(z[2]);
        return;
        obj;
        throw obj;
        if (obj != n.DELAYED)
        {
            break MISSING_BLOCK_LABEL_542;
        }
        Log.e(z[8]);
        d = 3;
        e = true;
        Log.i(z[19]);
        if (c != null)
        {
            c.sendEmptyMessage(0);
        }
        if (com.whatsapp.contact.b.c()) goto _L4; else goto _L7
_L7:
        Log.w(z[15]);
        return;
        obj;
        throw obj;
        if (obj != n.USER_IS_EXPIRED)
        {
            App.ay.c(true);
            App.au.a(System.currentTimeMillis());
            PerformSyncManager.b(b);
        }
        Log.i(z[9]);
        App.f(true);
        if (obj != n.USER_IS_EXPIRED)
        {
            PerformSyncManager.d(b);
        }
        obj2 = n.USER_IS_EXPIRED;
        if (obj == obj2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new hy(this, flag);
        ((Thread) (obj)).setPriority(1);
        ((Thread) (obj)).start();
        ((Thread) (obj)).join();
        Log.i(z[6]);
        App.a(App.au, true);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_879;
        }
        App.T();
        App.aj();
        obj = App.az.i().iterator();
        l = 0;
_L9:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (og)((Iterator) (obj)).next();
        if (!((og) (obj2)).t)
        {
            continue; /* Loop/switch isn't completed */
        }
        App.a(((og) (obj2)).a, 0, 2);
        int j1 = l + 1;
        l = j1;
        if (j1 <= 250)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = j1;
        if (k1 == 0) goto _L9; else goto _L8
_L8:
        obj = App.az.b().iterator();
_L11:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (og)((Iterator) (obj)).next();
        if (!((og) (obj2)).p())
        {
            App.a(((og) (obj2)).a, 0, 2);
        }
        if (k1 == 0) goto _L11; else goto _L10
_L10:
        if (com.whatsapp.RegisterName.j(b).u == 0)
        {
            App.a(com.whatsapp.RegisterName.j(b).a, 0, 1);
        }
        l = 0;
_L12:
        flag = App.at.a();
        if (flag || l >= 20000)
        {
            break; /* Loop/switch isn't completed */
        }
        l += 200;
        Thread.sleep(200L);
          goto _L12
        obj1;
        ((InterruptedException) (obj1)).printStackTrace();
        if (k1 == 0) goto _L12; else goto _L13
_L13:
        App.ay.a(l1);
        App.S.sendEmptyMessage(1);
        a = true;
        App.d(b, 3);
        e = true;
        Log.i(z[12]);
        if (c != null)
        {
            c.sendEmptyMessage(0);
        }
        if (com.whatsapp.contact.b.c()) goto _L4; else goto _L14
_L14:
        Log.w(z[18]);
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int l;
        as = new String[23];
        obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[l] = ((String) (obj));
                obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
                l = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[l] = ((String) (obj));
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                l = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[l] = ((String) (obj));
                obj = "Jl";
                l = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[l] = ((String) (obj));
                obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
                l = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[l] = ((String) (obj));
                l = 5;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[l] = ((String) (obj));
                l = 6;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037+\0051\034\b1\017\"\002\t0\002(\031\0377\031";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[l] = ((String) (obj));
                l = 7;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:57\004\r1\036!\024";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[l] = ((String) (obj));
                l = 8;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'_\b&\006%\t\t'";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[l] = ((String) (obj));
                l = 9;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037&\036'\037\002-\017'\004\005,\004k\021\0177\0032\025";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[l] = ((String) (obj));
                l = 10;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[l] = ((String) (obj));
                l = 11;
                obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[l] = ((String) (obj));
                l = 12;
                obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[l] = ((String) (obj));
                l = 13;
                obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[l] = ((String) (obj));
                l = 14;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[l] = ((String) (obj));
                l = 15;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[l] = ((String) (obj));
                l = 16;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[l] = ((String) (obj));
                l = 17;
                obj = "\030!\027\0050\036!\002\002\"\007!_\t1\030+\002";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[l] = ((String) (obj));
                l = 18;
                obj = "\030!\027\0050\036!\002\002\"\007!_\037:\004'/\r/\030!\021\b:5!\036\b&\016";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[l] = ((String) (obj));
                l = 19;
                obj = "\030!\027\0050\036!\002\002\"\007!_\n*\004k\024\003-\017";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[l] = ((String) (obj));
                l = 20;
                obj = "\030!\027\0050\036!\002\002\"\007!_\013&\004k\025\0361\0056";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[l] = ((String) (obj));
                l = 21;
                obj = "\030!\027\0050\036!\002\002\"\007!_\017,\0040\021\0177\031k\023\0036\0040P";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[l] = ((String) (obj));
                l = 22;
                obj = "\030!\027\0050\036!\002\002\"\007!_\005-\0030\031\r/\003>\025\036l\031=\036\017l\016+\036\tc\030!\003\031/\036y";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[l] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 588
    //                   0 611
    //                   1 618
    //                   2 625
    //                   3 632;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_632;
_L3:
        byte byte1 = 67;
_L9:
        obj[i1] = (char)(byte1 ^ c1);
        i1++;
          goto _L8
_L4:
        byte1 = 106;
          goto _L9
_L5:
        byte1 = 68;
          goto _L9
_L6:
        byte1 = 112;
          goto _L9
        byte1 = 108;
          goto _L9
    }
}
