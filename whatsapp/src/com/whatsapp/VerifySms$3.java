// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, VerifySms, VerifyNumber, o4, 
//            bj, asw

class Receiver extends BroadcastReceiver
{

    private static final String z[];
    final VerifySms a;

    public void onReceive(Context context, Intent intent)
    {
        int k;
        k = App.am;
        Log.i(z[27]);
        if (a.J) goto _L2; else goto _L1
_L1:
        context = intent.getExtras();
        if (context == null) goto _L4; else goto _L3
_L3:
        Object obj;
        Object aobj[];
        int i;
        aobj = (Object[])(Object[])context.get(z[2]);
        Log.i((new StringBuilder()).append(z[26]).append(aobj.length).toString());
        intent = "";
        context = "";
        obj = null;
        i = 0;
_L22:
        Object obj1;
        Object obj2;
        Object obj3;
        obj3 = obj;
        obj1 = context;
        obj2 = intent;
        if (i >= aobj.length) goto _L6; else goto _L5
_L5:
        obj1 = SmsMessage.createFromPdu((byte[])(byte[])aobj[i]);
        Object obj5;
        if (i == 0)
        {
            obj = obj1;
        }
        obj5 = obj1;
        obj3 = obj;
_L18:
        String s;
        obj1 = context;
        obj2 = intent;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_640;
        }
        s = "";
        obj1 = context;
        obj2 = intent;
        byte abyte0[] = ((SmsMessage) (obj5)).getUserData();
        Object obj4;
        int j;
        obj4 = s;
        obj = intent;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        j = 0;
        obj = s;
_L8:
        obj4 = obj;
        obj1 = context;
        obj2 = intent;
        if (j >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = context;
        obj2 = intent;
        obj4 = (new StringBuilder()).append(((String) (obj))).append(Character.toString((char)abyte0[j])).toString();
        j++;
        obj = obj4;
        if (k == 0) goto _L8; else goto _L7
_L7:
        obj1 = context;
        obj2 = intent;
        obj = (new StringBuilder()).append(intent).append(((String) (obj4))).toString();
        obj1 = context;
        obj2 = obj;
        s = ((SmsMessage) (obj5)).getDisplayMessageBody();
        intent = context;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        obj1 = context;
        obj2 = obj;
        intent = (new StringBuilder()).append(context).append(s).toString();
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[4]).append(((String) (obj4))).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[6]).append(s).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[17]).append(((SmsMessage) (obj5)).getDisplayOriginatingAddress()).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[20]).append(((SmsMessage) (obj5)).getEmailBody()).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[5]).append(((SmsMessage) (obj5)).getEmailFrom()).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[7]).append(((SmsMessage) (obj5)).getOriginatingAddress()).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[22]).append(((SmsMessage) (obj5)).getPseudoSubject()).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[18]).append(((SmsMessage) (obj5)).getTimestampMillis()).toString());
        obj1 = intent;
        obj2 = obj;
        Log.i((new StringBuilder()).append(z[1]).append(((SmsMessage) (obj5)).getServiceCenterAddress()).toString());
        obj2 = obj;
        obj1 = intent;
_L19:
        if (k == 0) goto _L9; else goto _L6
_L6:
        boolean flag;
        try
        {
            i = ((String) (obj2)).length();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (i > 0) goto _L11; else goto _L10
_L10:
        i = ((String) (obj1)).length();
        if (i <= 0) goto _L12; else goto _L11
_L11:
        Log.i((new StringBuilder()).append(z[25]).append(((String) (obj2))).toString());
        Log.i((new StringBuilder()).append(z[15]).append(((String) (obj1))).toString());
        if (((String) (obj2)).contains(VerifySms.r())) goto _L14; else goto _L13
_L13:
        flag = ((String) (obj1)).contains(VerifySms.r());
        if (!flag) goto _L15; else goto _L14
_L14:
        obj = a.b(VerifySms.a(a), VerifySms.m(a));
        obj1 = ((SmsMessage) (obj3)).getOriginatingAddress();
        VerifySms.B(a);
        if (obj == null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_821;
        }
        i = ((String) (obj)).length();
        if (i < 6)
        {
            break MISSING_BLOCK_LABEL_821;
        }
        i = ((String) (obj1)).length();
        if (i >= 6)
        {
            break MISSING_BLOCK_LABEL_873;
        }
        try
        {
            Log.i((new StringBuilder()).append(z[28]).append(((String) (obj1))).toString());
            a.g(z[14]);
            VerifySms.j(a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        flag = ((String) (obj)).substring(((String) (obj)).length() - 6, ((String) (obj)).length()).equals(((String) (obj1)).substring(((String) (obj1)).length() - 6, ((String) (obj1)).length()));
        if (flag)
        {
            Log.i(z[29]);
            intent = VerifyNumber.a(App.i(App.au));
            context = intent;
            if (App.l != 3)
            {
                context = o4.f(intent);
            }
            try
            {
                asw.a(new bj(a), new String[] {
                    context, z[8]
                });
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_1046;
            }
        }
        Log.i((new StringBuilder()).append(z[30]).append(((String) (obj))).append(z[9]).append(((String) (obj1))).toString());
        a.g(z[21]);
        VerifySms.j(a);
_L20:
        if (k == 0) goto _L16; else goto _L4
_L4:
        try
        {
            Log.i(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L16:
        if (k == 0) goto _L17; else goto _L2
_L2:
        Log.i(z[13]);
_L17:
        return;
        obj1;
        Log.e((new StringBuilder()).append(z[12]).append(((OutOfMemoryError) (obj1)).toString()).toString());
        obj5 = null;
        obj3 = obj;
          goto _L18
        context;
        Log.a(z[16], context);
          goto _L19
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
_L15:
        flag = ((String) (obj2)).contains(z[10]);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1192;
        }
        flag = ((String) (obj1)).contains(z[24]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1253;
        }
        flag = VerifySms.B().startsWith(z[19]);
        if (flag)
        {
            try
            {
                if (!VerifySms.B().startsWith(z[3]))
                {
                    VerifySms.B(a);
                    VerifySms.c(6);
                    VerifySms.t(a);
                    a.e(4);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        try
        {
            Log.i(z[11]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (k == 0) goto _L20; else goto _L12
_L12:
        Log.i(z[23]);
          goto _L20
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context;
_L9:
        i++;
        obj = obj3;
        context = ((Context) (obj1));
        intent = ((Intent) (obj2));
        if (true) goto _L22; else goto _L21
_L21:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[31];
        obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ5A2{\0312\0312j\031;";
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
                obj = "*z\007>R%l\030$\033;z\001\004Q.i\0344Q\037z\033#Q.^\0213F9l\006w";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",{\000$";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "w*Gf";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "*z\007>R%l\030$\033;z\001\032Q/l\0240Q\036p\021.\024";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "*z\007>R%l\030$\0339r\024>X\032m\032:\024";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "*z\007>R%l\030$\0338v\006'X=f82G/~\0222v3{\fw";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "*z\007>R%l\030$\033;z\001\030F5x\0349U(v\0330u8{\0072G/?";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "=j\0018";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "|m\0204Q5i\0203\t";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\030z\006#]2pU>Z?p\007%Q?k\032";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:]/l\0349Sq|\0356X0z\0330Q";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "*z\007>R%l\030$\0333j\001z[:2\0302Y3m\fw";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ3Q/k\0078M9{";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "/z\0311\031/z\0333\0311v\006:U(|\035zD4p\0332";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mU";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "*z\007>R%l\030$";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "*z\007>R%l\030$\0338v\006'X=f:%];v\0336@5q\022\026P8m\020$G|";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "*z\007>R%l\030$\033;z\001\004Q.i\0344Q\037z\033#Q.K\034:Q/k\024:D|";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "w*G";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "*z\007>R%l\030$\0339r\024>X\036p\021.\024";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "/z\0311\031/z\0333\0311v\006:U(|\035zD4p\0332";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "*z\007>R%l\030$\033;z\001\007G9j\0218g)}\0372W(?";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:Q/l\0240Qqq\000;X";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\030z\006#]2pU>Z?p\007%Q?k\032";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mU";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ'P)lX;Q2x\001?\033";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ3U(~Z>Z(z\033#";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:]/r\024#W40\006?[.kU";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ!Q.v\023>Q8";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "*z\007>R%l\030$\033.z\0262]*z\021zF9|\020>B9mZ:]/r\024#W40\0036X)zU9A1}\020%\t";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 764
    //                   0 787
    //                   1 794
    //                   2 801
    //                   3 808;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_808;
_L3:
        byte byte1 = 52;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 92;
          goto _L9
_L5:
        byte1 = 31;
          goto _L9
_L6:
        byte1 = 117;
          goto _L9
        byte1 = 87;
          goto _L9
    }

    r(VerifySms verifysms)
    {
        a = verifysms;
        super();
    }
}
