// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            ou, VerifySms, _r, ve, 
//            _5, af9, App, o4, 
//            a3d, m7

public class abk extends AsyncTask
{

    private static final String z[];
    af9 a;
    final VerifySms b;

    protected abk(VerifySms verifysms)
    {
        b = verifysms;
        super();
    }

    protected ou a(String as[])
    {
        ou ou1;
        Log.i((new StringBuilder()).append(z[21]).append(as[0]).toString());
        ou1 = ou.ERROR_UNSPECIFIED;
        int i;
        a = ve.a(VerifySms.a(b), VerifySms.m(b), as[0], _r.TYPED);
        i = _5.a[a.i.ordinal()];
        i;
        JVM INSTR tableswitch 1 2: default 96
    //                   1 119
    //                   2 119;
           goto _L1 _L2 _L2
_L1:
        App.e(App.au, a.c);
        as = a.i;
_L4:
        return as;
_L2:
        App.d(App.au, a.b);
        continue; /* Loop/switch isn't completed */
        as;
        throw as;
        as;
        as = as.toString();
        boolean flag;
        try
        {
            Log.w((new StringBuilder()).append(z[20]).append(as).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw as;
        }
        if (as == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = as.contains(z[23]);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        as = ou.ERROR_UNSPECIFIED;
        if (App.am == 0) goto _L4; else goto _L3
_L3:
        return ou.ERROR_CONNECTIVITY;
        as;
        Log.e((new StringBuilder()).append(z[22]).append(as.toString()).toString());
        return ou1;
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void a(ou ou1)
    {
        int i;
        i = App.am;
        b.removeDialog(24);
        if (ou1 != ou.YES) goto _L2; else goto _L1
_L1:
        Log.i(z[17]);
        o4.c(a.g, a.c);
        Object obj;
        int j;
        try
        {
            m7.a(a3d.WHATSAPP_INITIATED, a.a * 1000L);
        }
        catch (NumberFormatException numberformatexception)
        {
            Log.e(z[14]);
        }
        try
        {
            VerifySms.c(3);
            VerifySms.a(b, true);
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            throw ou1;
        }
        if (i == 0) goto _L3; else goto _L2
_L2:
        obj = ou.EXPIRED;
        if (ou1 != obj) goto _L5; else goto _L4
_L4:
        Log.i(z[7]);
        o4.c(a.g, a.c);
        try
        {
            m7.a(a3d.WHATSAPP_INITIATED, a.a * 1000L);
        }
        catch (NumberFormatException numberformatexception1)
        {
            Log.e(z[0]);
        }
        VerifySms.c(3);
        VerifySms.a(b, true);
        if (i == 0) goto _L3; else goto _L5
_L5:
        obj = ou.FAIL_MISMATCH;
        if (ou1 != obj) goto _L7; else goto _L6
_L6:
        try
        {
            Log.i(z[11]);
            VerifySms.p(b).setText("");
            j = VerifySms.s();
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            throw ou1;
        }
        if (j != 13) goto _L9; else goto _L8
_L8:
        VerifySms.c(3);
        b.d(b.getString(0x7f0e046f, new Object[] {
            b.getString(0x7f0e0469)
        }));
        ((InputMethodManager)App.au.getSystemService(z[15])).hideSoftInputFromWindow(VerifySms.p(b).getWindowToken(), 0);
        if (i == 0) goto _L3; else goto _L9
_L9:
        VerifySms.c(10);
        long l2 = 60000L;
        long l = l2;
        if (a.e != null)
        {
            try
            {
                l = Long.parseLong(a.e);
            }
            catch (NumberFormatException numberformatexception2)
            {
                Log.w(z[13]);
                l = l2;
                continue; /* Loop/switch isn't completed */
            }
            l *= 1000L;
        }
_L20:
        j = VerifySms.M();
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        b.d(b.getString(0x7f0e0349, new Object[] {
            q.i(b, l), Integer.valueOf(VerifySms.x())
        }));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        b.d(b.getString(0x7f0e0348, new Object[] {
            Integer.valueOf(VerifySms.x())
        }));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        try
        {
            b.d(b.getString(0x7f0e0346));
            VerifySms.c(3);
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            throw ou1;
        }
        VerifySms.e(b, l);
        if (i == 0) goto _L3; else goto _L7
_L7:
        obj = ou.ERROR_UNSPECIFIED;
        if (ou1 != obj) goto _L11; else goto _L10
_L10:
        Log.e(z[18]);
        VerifySms.c(11);
        b.f(109);
        if (i == 0) goto _L3; else goto _L11
_L11:
        obj = ou.FAIL_MISSING;
        if (ou1 != obj) goto _L13; else goto _L12
_L12:
        Log.e(z[4]);
        com.whatsapp.App.q(z[6]);
        VerifySms.c(3);
        b.d(b.getString(0x7f0e046f, new Object[] {
            b.getString(0x7f0e0469)
        }));
        if (i == 0) goto _L3; else goto _L13
_L13:
        obj = ou.FAIL_TOO_MANY_GUESSES;
        if (ou1 != obj) goto _L15; else goto _L14
_L14:
        Log.e(z[8]);
        VerifySms.c(3);
        obj = a.e;
        if (obj != null) goto _L17; else goto _L16
_L16:
        try
        {
            b.d(b.getString(0x7f0e033c));
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            throw ou1;
        }
        if (i == 0) goto _L3; else goto _L17
_L17:
        l = Long.parseLong(a.e) * 1000L;
        App.au.b(l);
        b.d(b.getString(0x7f0e033e, new Object[] {
            q.i(b, l)
        }));
        VerifySms.c(10);
        VerifySms.e(b, l);
_L3:
        VerifySms.t(b);
        VerifySms.u(b);
        return;
        ou1;
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
        throw ou1;
        NumberFormatException numberformatexception3;
        numberformatexception3;
        Log.w(z[16]);
        b.d(b.getString(0x7f0e033c));
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L15:
        Object obj1 = ou.FAIL_GUESSED_TOO_FAST;
        if (ou1 != obj1)
        {
            break MISSING_BLOCK_LABEL_964;
        }
        Log.e(z[12]);
        VerifySms.c(3);
        obj1 = a.e;
        if (obj1 == null)
        {
            NumberFormatException numberformatexception4;
            ou ou2;
            long l1;
            try
            {
                b.d(b.getString(0x7f0e033a));
            }
            // Misplaced declaration of an exception variable
            catch (ou ou1)
            {
                throw ou1;
            }
            if (i == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        try
        {
            l1 = Long.parseLong(a.e) * 1000L;
            App.au.b(l1);
            b.d(b.getString(0x7f0e033b, new Object[] {
                q.i(b, l1)
            }));
            VerifySms.c(10);
            VerifySms.e(b, l1);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (NumberFormatException numberformatexception4) { }
        Log.w(z[1]);
        b.d(b.getString(0x7f0e033a));
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ou2 = ou.ERROR_CONNECTIVITY;
        if (ou1 != ou2)
        {
            break MISSING_BLOCK_LABEL_1025;
        }
        Log.e(z[2]);
        VerifySms.c(11);
        b.d(b.getString(0x7f0e0317, new Object[] {
            b.getString(0x7f0e00c6)
        }));
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ou2 = ou.FAIL_BLOCKED;
        if (ou1 != ou2)
        {
            break MISSING_BLOCK_LABEL_1060;
        }
        Log.e(z[9]);
        VerifySms.c(12);
        VerifySms.A(b);
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ou2 = ou.FAIL_STALE;
        if (ou1 != ou2)
        {
            break MISSING_BLOCK_LABEL_1097;
        }
        Log.w(z[10]);
        VerifySms.c(3);
        b.d(0x7f0e0338);
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        ou2 = ou.FAIL_TEMPORARILY_UNAVAILABLE;
        if (ou1 != ou2)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w(z[5]);
        b.g(z[19]);
        VerifySms.c(3);
        ou1 = a.e;
        if (ou1 != null)
        {
            break MISSING_BLOCK_LABEL_1165;
        }
        b.d(b.getString(0x7f0e033a));
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            l1 = Long.parseLong(a.e) * 1000L;
            App.au.b(l1);
            b.d(b.getString(0x7f0e033b, new Object[] {
                q.i(b, l1)
            }));
            VerifySms.c(10);
            VerifySms.e(b, l1);
        }
        // Misplaced declaration of an exception variable
        catch (ou ou1)
        {
            Log.w(z[3]);
            b.d(b.getString(0x7f0e033a));
        }
        if (true) goto _L3; else goto _L18
_L18:
        ou1;
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
        catch (ou ou1)
        {
            throw ou1;
        }
        if (true) goto _L20; else goto _L19
_L19:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ou)obj);
    }

    protected void onPreExecute()
    {
        try
        {
            Log.i(z[24]);
            if (!b.isFinishing())
            {
                b.showDialog(24);
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[25];
        obj = "\001W\036.%\007W\013h&\033]\027\"y\025S\020+3\027\037\r({\006B\035&\"\026\037\034?&\032@\0303?\034\\";
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
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h#\035S\033+3^F\026j&\022@\n\"{\001W\r5/2T\r\"$";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265{\020]\027)3\020F\0201?\007K";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h#\035S\033+3^F\026j&\022@\n\"{\001W\r5/2T\r\"$";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265{\036[\n4?\035U";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h\"\026_\t($\022@\020+/^G\027& \022[\025&4\037W";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\026@\013($S_\0204%\032\\\036";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h \026@\020!?\026VT%#\007\037\034?&\032@\034#";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265{\007]\026j;\022\\\000j1\006W\n43\0";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265{\021^\026$=\026V";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h%\007S\025\"";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h?\035Q\0265$\026Q\r";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265{\024G\0344%\026VT39\034\037\037&%\007";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h$\026F\013>7\025F\0345v\025S\020+3\027\022\r(v\003S\01343";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\001W\036.%\007W\013h&\033]\027\"y\025S\020+3\027\037\r({\006B\035&\"\026\037\034?&\032@\0303?\034\\";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\032\\\t2\",_\0343>\034V";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h#\035S\033+3^F\026j&\022@\n\"{\001W\r5/2T\r\"$";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h \026@\020!?\026V";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\005]\020$3^F\034*&\034@\0305?\037KT28\022D\030.:\022P\025\"";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h?\034W\01359\001\022";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h5\034V\034h";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034h3\001@\0265v";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\001W\0372%\026V";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\005W\013.0\nD\026.5\026\035\017\"$\032T\00019\032Q\034";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 632
    //                   0 655
    //                   1 662
    //                   2 669
    //                   3 676;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_676;
_L3:
        byte byte1 = 86;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 115;
          goto _L9
_L5:
        byte1 = 50;
          goto _L9
_L6:
        byte1 = 121;
          goto _L9
        byte1 = 71;
          goto _L9
    }
}
