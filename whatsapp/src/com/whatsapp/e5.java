// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.messaging.o;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.bd;
import com.whatsapp.util.Log;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            ah, App, ch, a_6, 
//            a90, ud, vs

final class e5
    implements o
{

    private static final String z[];
    private final App a;

    public e5(App app)
    {
        a = app;
    }

    static App a(e5 e5_1)
    {
        return e5_1.a;
    }

    private void a(b3 b3)
    {
        a.c(new ah(this, b3));
    }

    public void a()
    {
        Log.i(z[11]);
        a.c(new ch(this));
    }

    public void a(int i)
    {
        Log.i((new StringBuilder()).append(z[0]).append(i).toString());
        if (i < 32)
        {
            a(((b3) (null)));
        }
    }

    public void a(b3 b3, int i)
    {
        Log.i((new StringBuilder()).append(z[6]).append(i).toString());
        a(b3);
    }

    public void a(String s)
    {
        Log.i((new StringBuilder()).append(z[3]).append(s).append(z[4]).toString());
        a.c(new a_6(this, s));
    }

    public void a(String s, int i)
    {
        Log.i((new StringBuilder()).append(z[8]).append(s).append(z[7]).append(i).toString());
        a.c.remove(s);
    }

    public void a(String s, byte abyte0[], byte abyte1[], byte byte0, bd bd, bd bd1)
    {
        Log.i((new StringBuilder()).append(z[1]).append(s).append(z[2]).toString());
        a.c(new a90(this, s, abyte0, byte0, bd, bd1, abyte1));
    }

    public void a(byte abyte0[], byte byte0, byte abyte1[], byte abyte2[][], byte abyte3[])
    {
        Log.i(z[10]);
    }

    public void b()
    {
        Log.i(z[5]);
        a.c(new ud(this));
    }

    public void b(int i)
    {
label0:
        {
            if (i == 406)
            {
                Log.e((new StringBuilder()).append(z[15]).append(i).append(z[13]).toString());
                a.c(new vs(this));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Log.e((new StringBuilder()).append(z[16]).append(i).append(z[14]).toString());
            a.c.remove((new StringBuilder()).append(App.k()).append(z[12]).toString());
        }
    }

    public void c()
    {
        Log.i(z[9]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = "\004E_OG\021Q\020SZ\000\035[FQE^_VF\021\035TL_\013\035DL\b";
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
                obj = "\004E_OG\021Q\020SZ\000\035[FQEOUR]\000ND\003N\nO\020";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "EJQP\b\026HS@M\026NVVD^\035YMA\021TQWA\013Z\020BP\nQ_WDENUP[\fR^";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\004E_OG\021Q\020SZ\000\035[FQEOUR]\000ND\003N\nO\020";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "EJQP\b\013R^F";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\004E_OG\021Q\020SZ\000\035[FQEYYDM\026I\020MG\013X";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\004E_OG\021Q\020SZ\000\035[FQE^_VF\021\035BVF\013T^D\b\tRG\031\b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "E[QJD\000Y\020TA\021U\020FZ\027RB\003K\nYU\003";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\004E_OG\021Q\020SZ\000\035[FQEOUR]\000ND\003N\nO\020";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\004E_OG\021Q\020SZ\000\035[FQEYYDM\026I\020PM\027KUQ\b\000OBLZ";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\004E_OG\021Q\020SZ\000\035[FQEYYDM\026I";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\004E_OG\021Q\020SZ\000\035[FQENE@K\000NCE]\tQI\003[\000I";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "%N\036T@\004ICBX\025\023^F\\";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "L\006\020QM\002X^FZ\004IYMOEVUZ[";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "L\006\020TA\tQ\020WZ\034\035QDI\fS\020LFESU[\\EE]SXE^_MF\000^D";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\004E_OG\021Q\020WZ\fXT\003\\\n\035CF\\EH^BK\006X@WI\007QU\003X\027X\020HM\034N\020\013M\027O_Qk\nYU\036";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\004E_OG\021Q\020EI\fQUG\b\021R\020PM\021\035@QMEVUZ\bMXBQG\027~_GMX";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 40;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 101;
          goto _L9
_L5:
        byte1 = 61;
          goto _L9
_L6:
        byte1 = 48;
          goto _L9
        byte1 = 35;
          goto _L9
    }
}
