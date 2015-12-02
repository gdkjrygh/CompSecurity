// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.ae;
import com.whatsapp.fieldstats.z;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import org.whispersystems.P;
import org.whispersystems.aZ;
import org.whispersystems.a_;
import org.whispersystems.ak;
import org.whispersystems.an;
import org.whispersystems.b9;
import org.whispersystems.bL;
import org.whispersystems.bY;
import org.whispersystems.bn;
import org.whispersystems.c;
import org.whispersystems.h;

// Referenced classes of package com.whatsapp:
//            ast, App, a8g, tt, 
//            an, a15, sq, og, 
//            a9n

class a3
    implements Runnable
{

    private static final String z[];
    final com.whatsapp.an a;
    final og b;
    final a9n c;
    final String d;
    final c4 e;

    a3(com.whatsapp.an an1, c4 c4_1, a9n a9n, String s, og og)
    {
        a = an1;
        e = c4_1;
        c = a9n;
        d = s;
        b = og;
        super();
    }

    public void run()
    {
        Object obj1 = new ast(this);
        int i;
        if (e.D != 4)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = App.u;
        Object obj;
        ak ak1;
        long l;
        boolean flag;
        if (i == 1)
        {
            try
            {
                com.whatsapp.App.a(z[11], false, a8g.CRASH, null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        obj = new a5();
        flag = e.y.a.equals((new StringBuilder()).append(App.k()).append(z[8]).toString());
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj.b = Double.valueOf(i);
        Log.i((new StringBuilder()).append(z[2]).append(flag).append(z[12]).append(e.y).append(z[13]).append(e.D).append(z[9]).append(e.s).toString());
        obj.a = Double.valueOf(e.D);
        obj.c = e.s;
        try
        {
            l = com.whatsapp.tt.a(e.y.a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.whatsapp.an.a(a).ab().post(new a15(this, com.whatsapp.an.a(a).aq));
            return;
        }
        ak1 = new ak(com.whatsapp.an.a(a).aq, com.whatsapp.an.a(a).aq, com.whatsapp.an.a(a).aq.f(), com.whatsapp.an.a(a).aq, l, 0);
        obj.d = Double.valueOf(1.0D);
        i = e.d();
        if (i != 0) goto _L2; else goto _L1
_L1:
        ak1.a(new bn(e.b()), ((org.whispersystems.aL) (obj1)));
_L3:
        com.whatsapp.fieldstats.z.a(com.whatsapp.an.a(a), ((com.whatsapp.fieldstats.aq) (obj)));
        com.whatsapp.an.a(a).ab().post(new a15(this, com.whatsapp.an.a(a).aq));
        return;
        obj;
        throw obj;
        obj1;
        Object obj2;
        an an1;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.c(z[4], ((Throwable) (obj1)));
            e.a(true);
            obj.d = Double.valueOf(0.0D);
            obj.e = Double.valueOf(ae.INVALID_MESSAGE.getCode());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.c(z[1], ((Throwable) (obj)));
            com.whatsapp.an.a(a).ab().post(new sq(this));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            Log.c(z[3], ((Throwable) (obj2)));
            obj.d = Double.valueOf(0.0D);
            obj.e = Double.valueOf(ae.LEGACY_MESSAGE.getCode());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            Log.c(z[7], ((Throwable) (obj2)));
            obj.d = Double.valueOf(0.0D);
            obj.e = Double.valueOf(ae.INVALID_VERSION.getCode());
        }
          goto _L3
        an1;
        Log.c(z[0], an1);
        e.a(true);
        obj.d = Double.valueOf(0.0D);
        obj.e = Double.valueOf(ae.NO_SESSION_AVAILABLE.getCode());
        i = App.am;
        if (i == 0) goto _L3; else goto _L2
_L2:
        ak1.a(new h(e.b()), ((org.whispersystems.aL) (obj1)));
          goto _L3
        obj2;
        Log.c(z[10], ((Throwable) (obj2)));
        e.a(true);
        obj.d = Double.valueOf(0.0D);
        obj.e = Double.valueOf(ae.PRE_KEY_MESSAGE_MISSING_PRE_KEY.getCode());
          goto _L3
        obj2;
        throw obj2;
        obj2;
        Log.c(z[6], ((Throwable) (obj2)));
        obj.d = Double.valueOf(0.0D);
        obj.e = Double.valueOf(ae.UNTRUSTED_IDENTITY.getCode());
          goto _L3
        obj2;
        Log.c(z[5], ((Throwable) (obj2)));
        e.a(true);
        obj.d = Double.valueOf(0.0D);
        obj.e = Double.valueOf(ae.PRE_KEY_MESSAGE_INVALID_KEY.getCode());
          goto _L3
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[14];
        obj = "t:UJ\na.";
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
                obj = "t:UJ\na.";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "t:UJ\na.\032O\02651_J\00350_E\000|4SH\002)";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "t:UJ\na.";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "t:UJ\na.";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "t:UJ\na.";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "t:UJ\na.";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "t:UJ\na.";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "U1\024Q\rt6IG\025elTC\021";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "5$HI\b5#JV\t|![R\fz,\032P\000g1SI\0135";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "t:UJ\na.";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "t:UJ\na.\032E\027|6SE\004y+N_Ep4_H\021/bHC\006p+LC";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "+bUHEx'IU\004r'\032";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "55SR\r50_R\027lbYI\020{6\032";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 388
    //                   0 411
    //                   1 418
    //                   2 425
    //                   3 432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_432;
_L3:
        byte byte1 = 101;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 21;
          goto _L9
_L5:
        byte1 = 66;
          goto _L9
_L6:
        byte1 = 58;
          goto _L9
        byte1 = 38;
          goto _L9
    }
}
