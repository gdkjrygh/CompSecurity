// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, AccountInfoActivity, k, ov, 
//            abl, og

class atz extends Handler
{

    private static final String z[];
    final AccountInfoActivity a;

    atz(AccountInfoActivity accountinfoactivity)
    {
        a = accountinfoactivity;
        super();
    }

    public void handleMessage(Message message)
    {
        int i = App.am;
        message.what;
        JVM INSTR tableswitch 0 11: default 838
    //                   0 72
    //                   1 838
    //                   2 838
    //                   3 297
    //                   4 326
    //                   5 544
    //                   6 129
    //                   7 204
    //                   8 101
    //                   9 512
    //                   10 680
    //                   11 580;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L2:
        Log.e(z[9]);
        a.c();
        a.showDialog(2);
        if (i == 0) goto _L1; else goto _L8
_L8:
        android.content.IntentSender.SendIntentException sendintentexception;
        int j;
        try
        {
            Log.e(z[1]);
            a.c();
            a.showDialog(4);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0) goto _L1; else goto _L6
_L6:
        AccountInfoActivity.j(a).removeMessages(8);
        a.c();
        PendingIntent pendingintent = (PendingIntent)message.obj;
        a.startIntentSenderForResult(pendingintent.getIntentSender(), 10001, new Intent(), 0, 0, 0);
        return;
        sendintentexception;
        Log.a(z[3], sendintentexception);
        a.showDialog(4);
        if (i == 0) goto _L1; else goto _L7
_L7:
        AccountInfoActivity.j(a).removeMessages(8);
        a.c();
        j = message.arg1;
        j;
        JVM INSTR lookupswitch 2: default 256
    //                   1: 786
    //                   7: 765;
           goto _L12 _L13 _L14
_L12:
        String s;
        String s1;
        int l;
        boolean flag;
        try
        {
            Log.i((new StringBuilder()).append(z[2]).append(message.arg1).toString());
            a.showDialog(4);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        a.b(0x7f0e030e);
        AccountInfoActivity.j(a).sendEmptyMessageDelayed(0, 32000L);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
label0:
        {
            s1 = (String)message.obj;
            l = message.arg1;
            AccountInfoActivity.j(a).removeMessages(0);
            a.c();
            if (App.Z.jabber_id.equals(s1))
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj = App.az.e((new StringBuilder()).append(s1).append(z[7]).toString());
            if (obj == null)
            {
                try
                {
                    obj = ov.a(s1);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    throw message;
                }
            } else
            {
                obj = ((og) (obj)).a(a);
            }
            if (l > 0)
            {
                s = String.format(App.j.a(0x7f0d0000, l), new Object[] {
                    Integer.valueOf(l), obj
                });
                if (i == 0)
                {
                    break label0;
                }
            }
            s = a.getString(0x7f0e0016, new Object[] {
                obj
            });
        }
        a.f(s);
        Log.i((new StringBuilder()).append(z[8]).append(s1).toString());
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L9:
        AccountInfoActivity.j(a).removeMessages(0);
        a.c();
        a.showDialog(119);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        flag = App.Z.jabber_id.equals(AccountInfoActivity.c(a));
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        AccountInfoActivity.b(a);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L11:
        try
        {
            if (App.Z.jabber_id.equals(AccountInfoActivity.c(a)))
            {
                AccountInfoActivity.b(a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        obj = message.obj;
        if (obj == null) goto _L16; else goto _L15
_L15:
        a.f((String)(String)message.obj);
        Log.i((new StringBuilder()).append(z[6]).append(message.obj).toString());
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L16:
        try
        {
            Log.e(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L10:
        Log.e(z[10]);
        AccountInfoActivity.j(a).removeMessages(10);
        a.c();
        a.f(a.getString(0x7f0e0317, new Object[] {
            a.getString(0x7f0e00c6)
        }));
        return;
        message;
        throw message;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
_L14:
        Log.i(z[4]);
        a.showDialog(5);
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L13:
        Log.i(z[5]);
        if (i == 0) goto _L1; else goto _L12
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
_L1:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "1%\006F\n>2H@\0216)JA\036>\"\tLR3.\004G\0305k\001\\\032}2\n\004\0309 \021\t\021?f\bL\f#'\002L";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "1%\006F\n>2H@\0216)JE\036%(\006AR6'\fE\0324i\000Q\01794\000M";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "1%\006F\n>2H@\0216)JA\036>\"\tLR<'\020G\0348k\003H\026<#\001\t\r55\025F\021##X";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "1%\006F\n>2H@\0216)JA\036>\"\tLR<'\020G\0348k\026\\\0343#\026ZP5>\006L\017$/\nG";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "1%\006F\n>2H@\0216)JE\036%(\006AR6'\fE\0324i\004E\r5'\001PR?1\013L\033";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "1%\006F\n>2H@\0216)JE\036%(\006AR6'\fE\0324i\006H\0213#\tE\0324";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "1%\006F\n>2H@\0216)JM\0261*\nNP7/\003]_";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\0205K^\02712\026H\017 h\013L\013";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "1%\006F\n>2H@\0216)JM\0261*\nNP7'\023LR##\027_\0263#E";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "1%\006F\n>2H@\0216)J]\026=#\n\\\013\177#\035Y\026\"#\001";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "1%\006F\n>2H@\0216)J]\026=#\n\\\013\177#\t@\0309$\fE\026$?";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 127;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 80;
          goto _L9
_L5:
        byte1 = 70;
          goto _L9
_L6:
        byte1 = 101;
          goto _L9
        byte1 = 41;
          goto _L9
    }
}
