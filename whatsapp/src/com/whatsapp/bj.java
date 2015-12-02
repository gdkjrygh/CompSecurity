// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            _r, VerifySms, afk, ou, 
//            ve, _5, af9, App, 
//            o4, a3d, m7

public class bj extends AsyncTask
{

    private static final String z[];
    af9 a;
    final VerifySms b;

    protected bj(VerifySms verifysms)
    {
        b = verifysms;
        super();
    }

    private _r a(String s)
    {
label0:
        {
            try
            {
                if (!z[1].equals(s))
                {
                    break label0;
                }
                s = _r.TAPPED_LINK;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }
label1:
        {
            try
            {
                if (!z[0].equals(s))
                {
                    break label1;
                }
                s = _r.RETRIED;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return s;
        }
        return _r.AUTO_DETECTED;
    }

    private void a()
    {
        boolean flag;
        try
        {
            VerifySms.c(3);
            VerifySms.t(b);
            VerifySms.s(b);
            flag = b.j;
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (!b.isFinishing())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        b.d();
        return;
    }

    private void b(String s)
    {
        int i = VerifySms.f(b);
        Log.i((new StringBuilder()).append(z[2]).append(i).toString());
        s = VerifySms.q(b).obtainMessage(1, s);
        VerifySms.q(b).sendMessageDelayed(s, i);
    }

    protected ou a(String as[])
    {
        Log.i((new StringBuilder()).append(z[4]).append(as[0]).toString());
        ou ou1 = ou.ERROR_UNSPECIFIED;
        int i;
        a = ve.a(VerifySms.a(b), VerifySms.m(b), as[0], a(as[1]));
        i = _5.a[a.i.ordinal()];
        i;
        JVM INSTR tableswitch 1 2: default 100
    //                   1 123
    //                   2 123;
           goto _L1 _L2 _L2
_L1:
        App.e(App.au, a.c);
        as = a.i;
        return as;
_L2:
        App.d(App.au, a.b);
          goto _L1
        as;
        try
        {
            throw as;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.e((new StringBuilder()).append(z[3]).append(as.toString()).toString());
            return ou.ERROR_CONNECTIVITY;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.e((new StringBuilder()).append(z[5]).append(as.toString()).toString());
        }
        return ou.ERROR_UNSPECIFIED;
    }

    protected void a(ou ou1)
    {
        int i = App.am;
        if (ou1 == ou.YES)
        {
            Log.i(z[7]);
            o4.c(a.g, a.c);
            Object obj;
            ou ou2;
            boolean flag;
            try
            {
                m7.a(a3d.WHATSAPP_INITIATED, 1000L * a.a);
            }
            catch (NumberFormatException numberformatexception)
            {
                Log.e(z[9]);
            }
            try
            {
                VerifySms.B(b);
                VerifySms.l(b);
                VerifySms.a(b, true);
            }
            // Misplaced declaration of an exception variable
            catch (ou ou1)
            {
                try
                {
                    throw ou1;
                }
                // Misplaced declaration of an exception variable
                catch (ou ou1)
                {
                    throw ou1;
                }
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_606;
            }
        }
        if (ou1 != ou.FAIL_MISMATCH)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        Log.i(z[10]);
        b.g(z[15]);
        VerifySms.c(3);
        VerifySms.t(b);
        VerifySms.B(b);
        VerifySms.l(b);
        b.e(34);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        obj = VerifySms.b(b);
        ou2 = ou.ERROR_CONNECTIVITY;
        if (ou1 != ou2)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        Log.w(z[27]);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        Log.e(z[20]);
        VerifySms.B(b);
        VerifySms.c(4);
        VerifySms.t(b);
        b.e(21);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        b(((String) (obj)));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        ou2 = ou.FAIL_GUESSED_TOO_FAST;
        if (ou1 != ou2)
        {
            break MISSING_BLOCK_LABEL_297;
        }
        Log.e(z[26]);
        b.g(z[23]);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        Log.e(z[19]);
        a();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        b(((String) (obj)));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        ou2 = ou.FAIL_TEMPORARILY_UNAVAILABLE;
        if (ou1 != ou2)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        Log.e(z[17]);
        b.g(z[8]);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        Log.e(z[14]);
        a();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        b(((String) (obj)));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        VerifySms.B(b);
        VerifySms.l(b);
        obj = ou.FAIL_MISSING;
        if (ou1 != obj)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        Log.e(z[18]);
        b.g(z[6]);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        obj = ou.FAIL_TOO_MANY_GUESSES;
        if (ou1 != obj)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        Log.e(z[16]);
        b.g(z[24]);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        obj = ou.ERROR_UNSPECIFIED;
        if (ou1 != obj)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        Log.e(z[25]);
        b.g(z[11]);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        try
        {
            if (ou1 == ou.FAIL_STALE)
            {
                Log.e(z[12]);
                b.g(z[22]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            throw ou1;
        }
        obj = ou.FAIL_BLOCKED;
        if (ou1 != obj)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        Log.e(z[21]);
        VerifySms.c(12);
        VerifySms.t(b);
        b.g(z[13]);
        VerifySms.A(b);
        flag = b.j;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_590;
        }
        flag = b.isFinishing();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        try
        {
            b.d();
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            throw ou1;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        a();
        return;
        ou1;
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        throw ou1;
        ou1;
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        try
        {
            throw ou1;
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1) { }
        throw ou1;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ou)obj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[28];
        obj = "b\013\0206lu\n";
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
                obj = "d\017\0244`t";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*c\r\f!ae\002\001iwu\032\026=*";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*y\001\0016w\177\034D";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*s\001\000!*";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*u\034\026+w0";
                byte0 = 4;
                i = 5;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "c\013\0262`bC\027!ktC\t-vc\007\n#";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*f\013\026-cy\013\0";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "c\013\0262`bC\027!ktC\0016w\177\034I0`}\036\0136db\007\b=(e\000\0052dy\002\005&iu";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "b\013\003-vd\013\026kux\001\n!*v\017\r(`tC\020+(e\036\000%quC\001<uy\034\0050l\177\0";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*e\000\0051qx\001\026-\177u\n";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "c\013\0262`bC\027!ktC\0016w\177\034I1kc\036\001'lv\007\001 ";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*c\032\005(`";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "c\013\0262`bC\027!ktC\006(js\005\001 ";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*u\034\026+w?\032\001)u=\033\n%sq\007\bkvq\030\001 (s\001\000!(y\035I*p|\002";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "c\013\0262`bC\027!ktC\t-v}\017\020'm";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*d\001\013ihq\000\035ibe\013\0277`c";
                byte0 = 15;
                i = 16;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*u\034\026+w=\032\001)u\177\034\0056l|\027I1kq\030\005-iq\f\b!";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*}\007\0277l~\t";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*u\034\026+w?\032\013+(v\017\0270*c\017\022!a=\r\013 `=\007\027ike\002\b";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*u\034\026+w?\r\013*ku\r\020-sy\032\035kvq\030\001 (s\001\000!(y\035I*p|\002";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*r\002\013'nu\n";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "c\013\0262`bC\027!ktC\0016w\177\034I7qq\002\001";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "c\013\0262`bC\027!ktC\0031`c\035\001 (d\001\013icq\035\020";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "c\013\0262`bC\027!ktC\020+j=\003\005*|=\t\021!vc\013\027";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*u\034\026+w";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*w\033\0017vu\nI0j\177C\002%vd";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "f\013\026-ci\035\t7*f\013\026-ci\035\t7*s\001\n*`s\032\r2ld\027";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 696
    //                   0 718
    //                   1 725
    //                   2 732
    //                   3 739;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_739;
_L3:
        byte byte1 = 5;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 16;
          goto _L9
_L5:
        byte1 = 110;
          goto _L9
_L6:
        byte1 = 100;
          goto _L9
        byte1 = 68;
          goto _L9
    }
}
