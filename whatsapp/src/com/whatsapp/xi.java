// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.q;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            EnterPhoneNumber, App, i, ve, 
//            a9p, ak5, mw, o4, 
//            a3d, m7, VerifyNumber, bd, 
//            asw, a8z, iz

public class xi extends AsyncTask
{

    private static final String z[];
    final EnterPhoneNumber a;
    private int b;
    private String c;
    private Runnable d;
    private byte e[];
    private Runnable f;
    private String g;
    private long h;
    private int i;
    private String j;

    protected xi(EnterPhoneNumber enterphonenumber, Runnable runnable, Runnable runnable1)
    {
        a = enterphonenumber;
        super();
        d = runnable1;
        f = runnable;
    }

    protected Integer a(byte abyte0[][])
    {
        long l = SystemClock.elapsedRealtime();
        if (l < EnterPhoneNumber.s)
        {
            j = (new StringBuilder()).append((EnterPhoneNumber.s - l) / 1000L).append("").toString();
            return Integer.valueOf(11);
        }
        i k = com.whatsapp.i.a(App.au, new String(abyte0[1]));
        abyte0 = ve.a(abyte0[0], abyte0[1], abyte0[2], k.toString());
        if (((a9p) (abyte0)).j != ak5.OK)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        c = ((a9p) (abyte0)).g;
        e = ((a9p) (abyte0)).l;
        h = ((a9p) (abyte0)).a;
        g = ((a9p) (abyte0)).b;
        return Integer.valueOf(1);
        mw mw1;
        if (((a9p) (abyte0)).j != ak5.FAIL)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        i = ((a9p) (abyte0)).e;
        b = ((a9p) (abyte0)).h;
        mw1 = ((a9p) (abyte0)).c;
        if (mw1 != null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        return Integer.valueOf(4);
        abyte0;
        throw abyte0;
        abyte0;
        abyte0 = abyte0.toString();
        try
        {
            Log.e((new StringBuilder()).append(z[0]).append(abyte0).toString());
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[][])
        {
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                throw abyte0;
            }
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        if (abyte0.contains(z[2]))
        {
            return Integer.valueOf(4);
        }
        break MISSING_BLOCK_LABEL_403;
        if (((a9p) (abyte0)).c == mw.BLOCKED)
        {
            return Integer.valueOf(5);
        }
        if (((a9p) (abyte0)).c == mw.LENGTH_LONG)
        {
            return Integer.valueOf(6);
        }
        if (((a9p) (abyte0)).c == mw.LENGTH_SHORT)
        {
            return Integer.valueOf(7);
        }
        if (((a9p) (abyte0)).c == mw.FORMAT_WRONG)
        {
            return Integer.valueOf(8);
        }
        if (((a9p) (abyte0)).c == mw.TEMPORARILY_UNAVAILABLE)
        {
            j = ((a9p) (abyte0)).i;
            return Integer.valueOf(9);
        }
        if (((a9p) (abyte0)).c == mw.OLD_VERSION)
        {
            return Integer.valueOf(12);
        }
        if (((a9p) (abyte0)).c == mw.ERROR_BAD_TOKEN)
        {
            return Integer.valueOf(14);
        } else
        {
            return Integer.valueOf(2);
        }
        if (((a9p) (abyte0)).j != ak5.EXPIRED)
        {
            break MISSING_BLOCK_LABEL_418;
        }
        c = ((a9p) (abyte0)).g;
        e = ((a9p) (abyte0)).l;
        h = ((a9p) (abyte0)).a;
        g = ((a9p) (abyte0)).b;
        return Integer.valueOf(10);
        return Integer.valueOf(3);
        abyte0;
        Log.a(z[1], abyte0);
        return Integer.valueOf(4);
    }

    protected void a(Integer integer)
    {
        Object obj;
        int k;
        k = App.am;
        int l;
        long l1;
        boolean flag;
        try
        {
            if (i != 0)
            {
                App.b(App.au, i);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            throw integer;
        }
        try
        {
            if (b != 0)
            {
                App.e(App.au, b);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            throw integer;
        }
        if (integer.intValue() == 4)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        l = integer.intValue();
        if (l != 3)
        {
            try
            {
                a.v = false;
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        }
        if (integer.intValue() != 1) goto _L2; else goto _L1
_L1:
        a.g();
        Log.i(z[11]);
        obj = f;
        if (obj != null)
        {
            try
            {
                f.run();
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        }
        App.e(App.au, c);
        App.c(App.au, 1);
        App.d(App.au, g);
        o4.c(e, c);
        try
        {
            m7.a(a3d.WHATSAPP_INITIATED, h * 1000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(z[5], ((Throwable) (obj)));
        }
        a.b(false);
        if (k == 0) goto _L3; else goto _L2
_L2:
        l = integer.intValue();
        if (l != 10) goto _L5; else goto _L4
_L4:
        a.g();
        Log.i(z[20]);
        obj = f;
        if (obj != null)
        {
            try
            {
                f.run();
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        }
        App.e(App.au, c);
        App.c(App.au, 2);
        App.d(App.au, g);
        o4.c(e, c);
        try
        {
            m7.a(a3d.WHATSAPP_INITIATED, h * 1000L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(z[6]);
        }
        a.b(false);
        if (k == 0) goto _L3; else goto _L5
_L5:
        l = integer.intValue();
        if (l != 2) goto _L7; else goto _L6
_L6:
        Log.i(z[16]);
        App.c(App.au, 0);
        a.g(VerifyNumber.k);
        flag = a.c();
        if (!flag) goto _L9; else goto _L8
_L8:
        asw.a(new bd(a, f, d), new String[0]);
        if (k == 0) goto _L3; else goto _L9
_L9:
        a.g();
        EnterPhoneNumber.y = 15;
        a.f();
        obj = f;
        if (obj != null)
        {
            try
            {
                f.run();
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        }
        if (d == null) goto _L3; else goto _L10
_L10:
        d.run();
        if (k == 0) goto _L3; else goto _L7
_L7:
        l = integer.intValue();
        if (l != 5) goto _L12; else goto _L11
_L11:
        Log.e(z[4]);
        a.v = true;
        a.g();
        flag = a.j;
        if (flag) goto _L3; else goto _L13
_L13:
        flag = a.isFinishing();
        if (flag) goto _L3; else goto _L14
_L14:
        a.showDialog(23);
        if (k == 0) goto _L3; else goto _L12
_L12:
        l = integer.intValue();
        if (l != 4) goto _L16; else goto _L15
_L15:
        a.g();
        Log.i(z[12]);
        flag = a.j;
        if (flag) goto _L3; else goto _L17
_L17:
        flag = a.isFinishing();
        if (flag) goto _L3; else goto _L18
_L18:
        a.showDialog(109);
        if (k == 0) goto _L3; else goto _L16
_L16:
        l = integer.intValue();
        if (l != 3) goto _L20; else goto _L19
_L19:
        a.g();
        Log.i(z[8]);
        a.d(a.getString(0x7f0e0317, new Object[] {
            a.getString(0x7f0e00c6)
        }));
        if (k == 0) goto _L3; else goto _L20
_L20:
        l = integer.intValue();
        if (l != 6) goto _L22; else goto _L21
_L21:
        a.g();
        Log.i(z[3]);
        obj = a.u.d;
        if (obj == null)
        {
            try
            {
                obj = a.u.a;
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        } else
        {
            obj = a.u.d.getText().toString();
        }
        a.d(a.getString(0x7f0e0314, new Object[] {
            obj
        }));
        if (k == 0) goto _L3; else goto _L22
_L22:
        l = integer.intValue();
        if (l != 7) goto _L24; else goto _L23
_L23:
        a.g();
        Log.i(z[13]);
        obj = a.u.d;
        if (obj == null)
        {
            try
            {
                obj = a.u.a;
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        } else
        {
            obj = a.u.d.getText().toString();
        }
        a.d(a.getString(0x7f0e0315, new Object[] {
            obj
        }));
        if (k == 0) goto _L3; else goto _L24
_L24:
        l = integer.intValue();
        if (l != 8) goto _L26; else goto _L25
_L25:
        a.g();
        Log.i(z[7]);
        obj = a.u.d;
        if (obj == null)
        {
            try
            {
                obj = a.u.a;
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
        } else
        {
            obj = a.u.d.getText().toString();
        }
        a.d((new StringBuilder()).append(iz.a((new StringBuilder()).append("+").append(a.u.b.getText()).append(" ").append(a.u.c.getText()).toString())).append("\n").append(a.getString(0x7f0e0312, new Object[] {
            obj
        })).toString());
        if (k == 0) goto _L3; else goto _L26
_L26:
        l = integer.intValue();
        if (l != 9) goto _L28; else goto _L27
_L27:
        a.g();
        Log.i(z[9]);
        obj = j;
        if (obj != null) goto _L30; else goto _L29
_L29:
        try
        {
            a.d(a.getString(0x7f0e033a));
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            throw integer;
        }
        if (k == 0) goto _L3; else goto _L30
_L30:
        l1 = Long.parseLong(j) * 1000L;
        EnterPhoneNumber.s = SystemClock.elapsedRealtime() + l1;
        App.au.b(l1);
        a.d(a.getString(0x7f0e033b, new Object[] {
            q.i(a, l1)
        }));
_L3:
        return;
        integer;
        throw integer;
        integer;
        throw integer;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        NumberFormatException numberformatexception;
        numberformatexception;
        a.d(a.getString(0x7f0e033a));
        if (k == 0) goto _L3; else goto _L28
_L28:
        int i1 = integer.intValue();
        if (i1 != 12)
        {
            break; /* Loop/switch isn't completed */
        }
        a.g();
        Log.i(z[17]);
        App.O = true;
        a.f(114);
        if (k == 0) goto _L3; else goto _L31
_L31:
        i1 = integer.intValue();
label0:
        {
            if (i1 != 14)
            {
                break; /* Loop/switch isn't completed */
            }
            String s;
            long l2;
            try
            {
                a.g();
                Log.i(z[15]);
                i1 = App.u;
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
            if (i1 == 2)
            {
                s = a.getString(0x7f0e032e);
                if (k == 0)
                {
                    break label0;
                }
            }
            try
            {
                i1 = App.u;
            }
            // Misplaced declaration of an exception variable
            catch (Integer integer)
            {
                throw integer;
            }
            if (i1 == 0)
            {
                s = a.getString(0x7f0e032f);
                if (k == 0)
                {
                    break label0;
                }
            }
            s = a.getString(0x7f0e0330, new Object[] {
                z[18]
            });
        }
        a.d(s);
        if (k == 0) goto _L3; else goto _L32
_L32:
        i1 = integer.intValue();
        if (i1 != 11) goto _L3; else goto _L33
_L33:
        try
        {
            a.g();
            Log.w(z[10]);
            integer = j;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            throw integer;
        }
        if (integer == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            l2 = Long.parseLong(j) * 1000L;
            EnterPhoneNumber.s = SystemClock.elapsedRealtime() + l2;
            App.au.b(l2);
            a.d(a.getString(0x7f0e033e, new Object[] {
                q.i(a, l2)
            }));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            Log.w(z[19]);
            a.d(a.getString(0x7f0e033f));
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            throw integer;
        }
        if (k == 0) goto _L3; else goto _L34
_L34:
        Log.w(z[14]);
        a.d(a.getString(0x7f0e033f));
        return;
        integer;
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        try
        {
            throw integer;
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer) { }
        throw integer;
        integer;
        throw integer;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((byte[][])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(9);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int k;
        as = new String[21];
        obj = "\001\031\022_\035\024\037\tT\nK\024\016_\f\017\005\003S\001\027\003\007V\003\001\023IS\000\001\005\024U\035D";
        byte0 = -1;
        k = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "\001\031\022_\035\024\037\tT\nK\024\016_\f\017\005\003S\001\027\003\007V\003\001\023I_\035\026\030\024";
                k = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "D\005\003\\\032\027\022\002";
                k = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "\001\031\022_\035\024\037\tT\nK\007\016U\001\001Z\bO\002\006\022\024\027\033\013\030KV\000\n\020";
                k = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[k] = ((String) (obj));
                obj = "\001\031\022_\035\024\037\tT\nK\025\nU\f\017\022\002";
                k = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "\001\031\022_\035\024\037\tT\nK\021\007S\003\001\023KN\000I\002\026^\016\020\022K_\027\024\036\024[\033\r\030\b";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "\001\031\022_\035\024\037\tT\nK\021\007S\003\001\023KN\000I\002\026^\016\020\022K_\027\024\036\024[\033\r\030\b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "\001\031\022_\035\024\037\tT\nK\007\016U\001\001Z\bO\002\006\022\024\027\r\005\023K\\\000\026\032\007N";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[k] = ((String) (obj));
                k = 8;
                obj = "\001\031\022_\035\024\037\tT\nK\022\024H\000\026Z\005U\001\n\022\005N\006\022\036\022C";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[k] = ((String) (obj));
                k = 9;
                obj = "\001\031\022_\035\024\037\tT\nK\003\003W\037\013\005\007H\006\b\016KO\001\005\001\007S\003\005\025\n_";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[k] = ((String) (obj));
                k = 10;
                obj = "\001\031\022_\035\024\037\tT\nK\003\tUB\026\022\005_\001\020";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[k] = ((String) (obj));
                k = 11;
                obj = "\001\031\022_\035\024\037\tT\nK\005\003S\001\027\003\007V\003\001\023";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[k] = ((String) (obj));
                k = 12;
                obj = "\001\031\022_\035\024\037\tT\nK\022\024H\000\026Z\023T\034\024\022\005S\t\r\022\002";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[k] = ((String) (obj));
                k = 13;
                obj = "\001\031\022_\035\024\037\tT\nK\007\016U\001\001Z\bO\002\006\022\024\027\033\013\030KI\007\013\005\022";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[k] = ((String) (obj));
                k = 14;
                obj = "\001\031\022_\035\024\037\tT\nK\003\tUB\026\022\005_\001\020X\022S\002\001Z\bU\033I\036\bN";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[k] = ((String) (obj));
                k = 15;
                obj = "\001\031\022_\035\024\037\tT\nK\025\007^B\020\030\r_\001";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[k] = ((String) (obj));
                k = 16;
                obj = "\001\031\022_\035\024\037\tT\nK\031\003MB\r\031\025N\016\b\033\007N\006\013\031";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[k] = ((String) (obj));
                k = 17;
                obj = "\001\031\022_\035\024\037\tT\nK\030\n^B\022\022\024I\006\013\031";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[k] = ((String) (obj));
                k = 18;
                obj = "\f\003\022J\034^XIM\007\005\003\025[\037\024Y\005U\002K\026\b^\035\013\036\002";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[k] = ((String) (obj));
                k = 19;
                obj = "\001\031\022_\035\024\037\tT\nK\003\tUB\026\022\005_\001\020X\022S\002\001Z\bU\033I\036\bN";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[k] = ((String) (obj));
                k = 20;
                obj = "\001\031\022_\035\024\037\tT\nK\022\036J\006\026\022\002";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[k] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 544
    //                   0 567
    //                   1 574
    //                   2 581
    //                   3 588;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_588;
_L3:
        byte byte1 = 111;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 100;
          goto _L9
_L5:
        byte1 = 119;
          goto _L9
_L6:
        byte1 = 102;
          goto _L9
        byte1 = 58;
          goto _L9
    }
}
