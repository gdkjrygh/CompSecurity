// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ci;
import com.whatsapp.protocol.cj;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            auc, App, mk, aoz

public class wc
    implements ci, cj, Runnable
{

    private static Timer b;
    private static final String z[];
    public String a;
    public boolean c;
    public int d;
    public Vector e;
    public c3 f;
    private boolean g;
    public String h;
    private auc i;

    public wc(String s, String s1, Vector vector, int j)
    {
        boolean flag = false;
        super();
        c = false;
        g = false;
        if (s != null)
        {
            flag = true;
        }
        Log.b(flag);
        h = s;
        a = s1;
        e = vector;
        d = j;
        i = new auc(this);
        b.schedule(i, 20000L);
    }

    public wc(String s, String s1, Vector vector, int j, c3 c3)
    {
        this(s, s1, vector, j);
        f = c3;
    }

    private void a()
    {
        int j;
        j = App.am;
        Log.i((new StringBuilder()).append(z[3]).append(d).toString());
        c = true;
        d;
        JVM INSTR lookupswitch 7: default 108
    //                   12: 121
    //                   13: 147
    //                   14: 199
    //                   28: 160
    //                   89: 173
    //                   90: 186
    //                   91: 211;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        App.d(h, false);
        b();
        return;
_L2:
        App.ah.g(mk.a(h, a, e, 3));
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        mk.a(6, h);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        mk.a(7, h);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        mk.a(9, h);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        mk.a(10, h);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        mk.a(5, h);
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        mk.a(8, h);
        if (true) goto _L1; else goto _L9
_L9:
    }

    static boolean a(wc wc1)
    {
        return wc1.g;
    }

    static void b(wc wc1)
    {
        wc1.a();
    }

    public void a(int j)
    {
        int k;
        k = App.am;
        Log.e((new StringBuilder()).append(z[0]).append(j).append(z[2]).append(h).append(z[1]).append(d).toString());
        i.cancel();
        d;
        JVM INSTR lookupswitch 8: default 144
    //                   12: 157
    //                   13: 270
    //                   14: 390
    //                   15: 219
    //                   28: 310
    //                   89: 350
    //                   90: 350
    //                   91: 422;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L8
_L1:
        App.d(h, false);
        b();
        return;
_L2:
        j;
        JVM INSTR lookupswitch 2: default 184
    //                   406: 444
    //                   500: 431;
           goto _L9 _L10 _L11
_L9:
        mk.a(11, a);
_L32:
        App.ah.g(mk.a(h, a, e, 3));
        if (k == 0) goto _L1; else goto _L5
_L5:
        j;
        JVM INSTR tableswitch 401 406: default 260
    //                   401 460
    //                   402 260
    //                   403 470
    //                   404 480
    //                   405 260
    //                   406 490;
           goto _L12 _L13 _L12 _L14 _L15 _L12 _L16
_L16:
        break; /* Loop/switch isn't completed */
_L15:
        break; /* Loop/switch isn't completed */
_L14:
        break; /* Loop/switch isn't completed */
_L12:
        mk.a(14, null);
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        j;
        JVM INSTR tableswitch 401 404: default 300
    //                   401 506
    //                   402 300
    //                   403 516
    //                   404 526;
           goto _L17 _L18 _L17 _L19 _L20
_L20:
        break; /* Loop/switch isn't completed */
_L19:
        break; /* Loop/switch isn't completed */
_L17:
        mk.a(19, null);
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L6:
        j;
        JVM INSTR tableswitch 401 404: default 340
    //                   401 539
    //                   402 340
    //                   403 549
    //                   404 559;
           goto _L21 _L22 _L21 _L23 _L24
_L24:
        break; /* Loop/switch isn't completed */
_L23:
        break; /* Loop/switch isn't completed */
_L21:
        mk.a(23, null);
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        j;
        JVM INSTR tableswitch 401 404: default 380
    //                   401 572
    //                   402 380
    //                   403 582
    //                   404 592;
           goto _L25 _L26 _L25 _L27 _L28
_L28:
        break; /* Loop/switch isn't completed */
_L27:
        break; /* Loop/switch isn't completed */
_L25:
        mk.a(27, null);
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        j;
        JVM INSTR tableswitch 403 404: default 412
    //                   403 605
    //                   404 615;
           goto _L29 _L30 _L31
_L31:
        break; /* Loop/switch isn't completed */
_L29:
        mk.a(31, null);
        if (k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L8:
        mk.a(34, null);
        break; /* Loop/switch isn't completed */
_L11:
        mk.a(12, a);
        if (k == 0) goto _L32; else goto _L10
_L10:
        mk.a(13, a);
        if (k == 0) goto _L32; else goto _L9
_L13:
        mk.a(15, null);
        if (k == 0) goto _L34; else goto _L33
_L34:
        break; /* Loop/switch isn't completed */
_L33:
        mk.a(16, null);
        if (k == 0) goto _L36; else goto _L35
_L36:
        break; /* Loop/switch isn't completed */
_L35:
        mk.a(17, null);
        if (k == 0) goto _L38; else goto _L37
_L38:
        break; /* Loop/switch isn't completed */
_L37:
        mk.a(18, a);
        if (k == 0) goto _L39; else goto _L12
_L39:
        break; /* Loop/switch isn't completed */
_L18:
        mk.a(20, null);
        if (k == 0) goto _L41; else goto _L40
_L41:
        break; /* Loop/switch isn't completed */
_L40:
        mk.a(21, null);
        if (k == 0) goto _L43; else goto _L42
_L43:
        break; /* Loop/switch isn't completed */
_L42:
        mk.a(22, null);
        if (k == 0) goto _L44; else goto _L17
_L44:
        break; /* Loop/switch isn't completed */
_L22:
        mk.a(24, null);
        if (k == 0) goto _L46; else goto _L45
_L46:
        break; /* Loop/switch isn't completed */
_L45:
        mk.a(25, null);
        if (k == 0) goto _L48; else goto _L47
_L48:
        break; /* Loop/switch isn't completed */
_L47:
        mk.a(26, null);
        if (k == 0) goto _L49; else goto _L21
_L49:
        break; /* Loop/switch isn't completed */
_L26:
        mk.a(28, null);
        if (k == 0) goto _L51; else goto _L50
_L51:
        break; /* Loop/switch isn't completed */
_L50:
        mk.a(29, null);
        if (k == 0) goto _L53; else goto _L52
_L53:
        break; /* Loop/switch isn't completed */
_L52:
        mk.a(30, null);
        if (k == 0) goto _L54; else goto _L25
_L54:
        break; /* Loop/switch isn't completed */
_L30:
        mk.a(32, null);
        if (k == 0) goto _L56; else goto _L55
_L56:
        break; /* Loop/switch isn't completed */
_L55:
        mk.a(33, null);
        if (k == 0) goto _L1; else goto _L29
    }

    public void a(String s)
    {
        i.cancel();
        g = true;
        Log.i((new StringBuilder()).append(z[5]).append(s).append(z[6]).append(d).toString());
        App.d(h, false);
        b();
    }

    public void b()
    {
    }

    public void run()
    {
        i.cancel();
        Log.i((new StringBuilder()).append(z[4]).append(d).toString());
        b();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[7];
        obj = "PG37\030ZR.m\032RD)'\033C\025:#\001[P8bR\027";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\027I|";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\027I|";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "PG37\030ZR.m\017EZ)27EP-7\rDAs6\001ZP37\034\030A%2\r\r";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "PG37\030ZR.m\032RD)'\033C\025/7\013TP/1G";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "PG37\030ZR.m\032RD)'\033C\025/7\013TP/1H\r\025";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "\027I|";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                z = as;
                b = new Timer();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 267
    //                   1 274
    //                   2 281
    //                   3 288;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_288;
_L3:
        byte byte1 = 104;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 55;
          goto _L9
_L5:
        byte1 = 53;
          goto _L9
_L6:
        byte1 = 92;
          goto _L9
        byte1 = 66;
          goto _L9
    }
}
