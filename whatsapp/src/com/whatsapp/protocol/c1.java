// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.IOException;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            cl, c_, cq, c4, 
//            cu, bq, b9, bp, 
//            b0, bt, c8, bo

public final class c1 extends cl
{

    private static final String z[];
    public byte l[];

    public c1(b9 b9_1, bt bt1, bo bo, byte abyte0[])
    {
        super(bo, b9_1, bt1);
        l = abyte0;
    }

    private void a(c_ c_1)
    {
label0:
        {
            Object obj = c_1.a(z[37]);
            String s = ((c_) (obj)).d(z[38]);
            if (s == null)
            {
                c_1 = new cq(0);
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            cq cq1 = new cq(2);
            try
            {
                cq1.g = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw new IOException((new StringBuilder()).append(z[35]).append(s).toString());
            }
            c_1 = ((c_) (obj)).d(z[40]);
            try
            {
                cq1.a = Integer.parseInt(c_1);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new IOException((new StringBuilder()).append(z[39]).append(c_1).toString());
            }
            obj = ((c_) (obj)).d(z[36]);
            c_1 = cq1;
            if (obj != null)
            {
                try
                {
                    cq1.b = Integer.parseInt(((String) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (c_ c_1)
                {
                    throw new IOException((new StringBuilder()).append(z[34]).append(s).toString());
                }
                c_1 = cq1;
            }
        }
        throw c_1;
    }

    private void a(byte abyte0[])
    {
        a.g = a.E.a(a.t, abyte0);
        g.a(a.g);
    }

    private byte[] a()
    {
        Object obj;
        boolean flag;
        boolean flag1;
        int i;
        flag = false;
        i = c4.F;
        try
        {
            obj = a.H;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
_L2:
        boolean flag2;
label0:
        {
            obj = g.c();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_189;
            }
            try
            {
                if (!c_.a(((c_) (obj)), z[10]))
                {
                    break label0;
                }
                obj = ((c_) (obj)).b;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return ((byte []) (obj));
        }
        flag2 = flag;
        if (c_.a(((c_) (obj)), z[7]))
        {
            b(((c_) (obj)));
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_212;
            }
            flag2 = true;
        }
        boolean flag3 = c_.a(((c_) (obj)), z[11]);
        if (flag3)
        {
            if (flag1 && !flag2)
            {
                try
                {
                    throw new bp(z[8], g.d());
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            } else
            {
                c(((c_) (obj)));
                return null;
            }
        }
        break MISSING_BLOCK_LABEL_160;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        flag = flag2;
        if (!c_.a(((c_) (obj)), z[12]))
        {
            continue; /* Loop/switch isn't completed */
        }
        a(((c_) (obj)));
        flag = flag2;
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        throw new bp(z[9], g.d());
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b()
    {
        try
        {
            if (a.H != null)
            {
                bt bt1 = e;
                String s = z[4];
                b0 b0_1 = new b0(z[6], z[5]);
                String s1 = a.H;
                bt1.a(new c_(s, new b0[] {
                    b0_1
                }, s1), false);
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
    }

    private void b(c_ c_1)
    {
        c_.b(c_1, z[31]);
        c_1 = c_1.a(z[33]);
        if (c_1 != null)
        {
            c_1 = c_1.d(z[32]);
            int i = 500;
            if (c_1 != null)
            {
                i = Integer.parseInt(c_1);
            }
            a.b.c(a.H, i);
        }
    }

    private void b(boolean flag)
    {
        Object obj;
        b0 ab0[];
        String s;
        if (l != null)
        {
            a(l);
            obj = a(l);
        } else
        {
            obj = null;
        }
        try
        {
            s = z[47];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        ab0 = new b0[2];
        ab0[0] = new b0(z[41], a.M);
        ab0[1] = new b0(z[42], z[45]);
_L4:
        obj = new c_(s, ab0, ((byte []) (obj)));
        e.a(((c_) (obj)));
        return;
_L2:
        ab0 = new b0[3];
        ab0[0] = new b0(z[43], a.M);
        ab0[1] = new b0(z[44], z[49]);
        ab0[2] = new b0(z[46], z[48]);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        c_ c_1 = g.c();
        try
        {
            if (c_.a(c_1, z[0]))
            {
                a(c_1);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        c(c_1);
    }

    private void c(c_ c_1)
    {
        int i = c4.F;
        c_.b(c_1, z[18]);
        String s = c_1.d("t");
        String s1;
        boolean flag;
        if (s != null)
        {
            try
            {
                a.x = Long.parseLong(s);
                a.o = System.currentTimeMillis() / 1000L;
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw new IOException((new StringBuilder()).append(z[19]).append(s).toString());
            }
        }
        s = c_1.d(z[24]);
        if (s != null)
        {
            try
            {
                a.w = Long.parseLong(s);
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw new IOException((new StringBuilder()).append(z[27]).append(s).toString());
            }
        }
        s1 = c_1.d(z[28]);
        if (s1 != null)
        {
            try
            {
                a.c = new Integer(Integer.parseInt(s1));
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw new IOException((new StringBuilder()).append(z[23]).append(s1).toString());
            }
        }
        s1 = c_1.d(z[21]);
        flag = z[25].equals(s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        a.G = 1;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        flag = z[22].equals(s1);
        if (flag)
        {
            try
            {
                a.G = 0;
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw c_1;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_190;
            }
        }
        a.G = -1;
        s1 = c_1.d(z[26]);
        flag = z[29].equals(s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        a.v = 1;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        flag = z[20].equals(s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_394;
        }
        try
        {
            a.v = 0;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        throw new IOException(z[30]);
        c_1;
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        throw c_1;
        c_1;
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        throw c_1;
        a.G = -1;
        l = c_1.b;
        return;
    }

    private void c(byte abyte0[])
    {
        abyte0 = a(abyte0);
        abyte0 = new c_(z[50], null, abyte0);
        e.a(abyte0);
    }

    private void d()
    {
        Object obj;
        if (a.H == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = g.c();
        boolean flag = c_.a(((c_) (obj)), z[1]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        int i;
        a(((c_) (obj)));
        i = c4.F;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        try
        {
            if (!c_.a(((c_) (obj)), z[3]))
            {
                throw new bp(z[2], g.d());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        break MISSING_BLOCK_LABEL_90;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        b(((c_) (obj)));
    }

    private void e()
    {
        Object obj = new Vector();
        c_ ac_[];
        String s;
        int i;
        try
        {
            if (a.n)
            {
                ((Vector) (obj)).addElement(new c_(z[14], null));
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        try
        {
            if (a.B)
            {
                ((Vector) (obj)).addElement(new c_(z[16], null));
            }
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
        try
        {
            if (a.A)
            {
                ((Vector) (obj)).addElement(new c_(z[15], null));
            }
        }
        catch (NumberFormatException numberformatexception2)
        {
            throw numberformatexception2;
        }
        try
        {
            if (a.J)
            {
                ((Vector) (obj)).addElement(new c_(z[13], null));
            }
        }
        catch (NumberFormatException numberformatexception3)
        {
            throw numberformatexception3;
        }
        ac_ = new c_[((Vector) (obj)).size()];
        try
        {
            ((Vector) (obj)).copyInto(ac_);
            obj = e;
            s = z[17];
            i = ac_.length;
        }
        catch (NumberFormatException numberformatexception4)
        {
            throw numberformatexception4;
        }
        if (i == 0)
        {
            ac_ = null;
        }
        ((bt) (obj)).a(new c_(s, null, (c_[])ac_), false);
    }

    public void a(boolean flag)
    {
        try
        {
            if (a.t == null)
            {
                throw new cq(0);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
        e.a(a.d, a.I);
        e();
        b();
        b(flag);
        g.a();
        byte abyte0[] = a();
        if (abyte0 != null)
        {
            try
            {
                a(abyte0);
                c(abyte0);
                d();
                c();
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        g.b();
        e.a(a.g);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[51];
        obj = "Wpu}sCt";
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
                i = 1;
                obj = "Wpu}sCt";
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "TilteEtx1qTs<ccA}e=&Sdh1kXboxhV=<xh\021cypbft~";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "Ft~";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "Ft~";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\001?/";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "Gtnbo^\177";
                byte0 = 5;
                i = 6;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "Ft~";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "TilteEtx1qTs<ccA}e=&Sdh1kXboxhV=<xh\021cypbwt}esCtoPhURtpj]trvc";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "Wtp}&^dh1iW1p~iA1u\177&Ct}u@TphdtTb]\177bry}}jT\177{t";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "Ry}}jT\177{t";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "Bd\177rcBb";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "Wpu}sCt";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "Acybc_ry";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "AcuggRh";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "VcsdvBNj#";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "Ct}utTryxvEb";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                obj = "Bentg\\+ztgEdntu";
                byte0 = 16;
                i = 17;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "Bd\177rcBb";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "X\177jpjXu<bcCgyc&Exqt<\021";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "PrhxpT";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "Zxru";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "Wcyt";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "X\177jpjXu<at^ao1pTcoxi_+<";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "TilxtPeu~h";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "Apuu";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "Be}esB";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "X\177jpjXu<t~Axnt&Upht<\021";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                obj = "Acsau";
                byte0 = 27;
                i = 28;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "TilxtTu";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "PrhxpT1}re^dre&Fxhy&_~<t~AxnprX~r";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "Ft~";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "R~xt";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "Tcn~t";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "X\177jpjXu<ccEce+&";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "X\177jpjXu<t~Axnt&Exqt&^dh+&";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "Cthc\177";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "_~h<gDet~tXkyu";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "TilxtT";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "X\177jpjXu<riUt&1";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "R~xt";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "Dbyc";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "\\t\177yg_xo|";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "Dbyc";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "ApoboGt";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "fPIEN\034#";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "\\t\177yg_xo|";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                i = 47;
                obj = "Pdhy";
                byte0 = 46;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "fPIEN\034#";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                obj = "Ecit";
                byte0 = 48;
                i = 49;
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "Ctoai_by";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1204
    //                   0 1227
    //                   1 1234
    //                   2 1241
    //                   3 1248;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1248;
_L3:
        byte byte1 = 6;
_L9:
        obj[j] = (char)(byte1 ^ c2);
        j++;
          goto _L8
_L4:
        byte1 = 49;
          goto _L9
_L5:
        byte1 = 17;
          goto _L9
_L6:
        byte1 = 28;
          goto _L9
        byte1 = 17;
          goto _L9
    }
}
