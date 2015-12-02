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
//            App, VerifySms, bj, asw

class Receiver extends BroadcastReceiver
{

    private static final String z[];
    final VerifySms a;
    private boolean b;

    public void onReceive(Context context, Intent intent)
    {
        int k = App.am;
        Log.i(z[2]);
        if (!b) goto _L2; else goto _L1
_L1:
        Log.i(z[12]);
_L27:
        return;
        context;
        throw context;
_L2:
        if (a.J)
        {
            break; /* Loop/switch isn't completed */
        }
        context = intent.getExtras();
        if (context == null) goto _L4; else goto _L3
_L3:
        Object aobj[] = (Object[])(Object[])context.get(z[21]);
        if (aobj == null) goto _L6; else goto _L5
_L5:
        int i;
        Log.i((new StringBuilder()).append(z[4]).append(aobj.length).toString());
        i = 0;
_L31:
        if (i >= aobj.length) goto _L8; else goto _L7
_L7:
        char c;
        Object obj;
        Object obj1;
        Context context1;
        int j;
        try
        {
            intent = SmsMessage.createFromPdu((byte[])(byte[])aobj[i]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e((new StringBuilder()).append(z[10]).append(context.toString()).toString());
            intent = null;
        }
        if (intent == null) goto _L10; else goto _L9
_L9:
        context = intent.getMessageBody();
        Log.i((new StringBuilder()).append(z[5]).append(context).toString());
        Log.i((new StringBuilder()).append(z[7]).append(intent.getDisplayMessageBody()).toString());
        Log.i((new StringBuilder()).append(z[17]).append(intent.getDisplayOriginatingAddress()).toString());
        Log.i((new StringBuilder()).append(z[19]).append(intent.getEmailBody()).toString());
        Log.i((new StringBuilder()).append(z[3]).append(intent.getEmailFrom()).toString());
        Log.i((new StringBuilder()).append(z[9]).append(intent.getOriginatingAddress()).toString());
        Log.i((new StringBuilder()).append(z[22]).append(intent.getPseudoSubject()).toString());
        Log.i((new StringBuilder()).append(z[18]).append(intent.getServiceCenterAddress()).toString());
        context1 = context;
_L28:
        if (intent == null || context1 == null) goto _L12; else goto _L11
_L11:
        Log.i((new StringBuilder()).append(z[20]).append(context1).toString());
        context = z[0];
        j = context1.indexOf(context);
        if (j < 0) goto _L14; else goto _L13
_L13:
        intent = "";
        obj = intent;
        j = context.length() + j;
_L32:
        context = intent;
        obj = intent;
        if (j >= context1.length()) goto _L16; else goto _L15
_L15:
        obj = intent;
        c = context1.charAt(j);
        obj = intent;
        obj1 = intent;
        if (!Character.isDigit(c)) goto _L18; else goto _L17
_L17:
        obj = intent;
        obj1 = (new StringBuilder()).append(intent).append(c).toString();
        context = ((Context) (obj1));
        if (k == 0) goto _L19; else goto _L18
_L16:
        obj = context;
        intent = context;
        if (context.length() <= 0) goto _L21; else goto _L20
_L20:
        obj = context;
        j = Integer.parseInt(context);
_L29:
        if (j != -1)
        {
            try
            {
                b = true;
                abortBroadcast();
                VerifySms.d(a, context);
                asw.a(new bj(a), new String[] {
                    context, z[11]
                });
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_612;
            }
        }
        Log.w(z[1]);
        a.g(z[15]);
        if (k == 0) goto _L22; else goto _L14
_L14:
        try
        {
            Log.w(z[8]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L22:
        if (k == 0) goto _L23; else goto _L12
_L12:
        try
        {
            Log.i(z[14]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L23:
        if (k == 0) goto _L24; else goto _L8
_L8:
        if (k == 0) goto _L25; else goto _L6
_L6:
        try
        {
            Log.i(z[16]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L25:
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        try
        {
            Log.i(z[13]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (k == 0) goto _L27; else goto _L26
_L26:
        try
        {
            Log.i(z[24]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj;
        context = null;
_L30:
        Log.a(z[23], ((Throwable) (obj)));
        context1 = context;
          goto _L28
        context;
        Log.w((new StringBuilder()).append(z[6]).append(context.toString()).toString());
        intent = ((Intent) (obj));
_L21:
        j = -1;
        context = intent;
          goto _L29
        obj;
          goto _L30
_L24:
        i++;
          goto _L31
_L10:
        context1 = null;
          goto _L28
_L18:
        context = ((Context) (obj1));
        if (c == '-')
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj1));
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L16; else goto _L19
_L19:
        j++;
        intent = context;
        if (k == 0) goto _L32; else goto _L16
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[25];
        obj = "/W\002s19O\023'!\027[\006'";
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
                obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021(,\027\022\000h&\035";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLs'\000KLn,\fZ\rs";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\016Z\021n$\001L\016tm\035R\002n.>M\fjb";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLw&\rLNk'\026X\027om";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\016Z\021n$\001L\016tm\037Z\027J'\013L\002`':P\007~b";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021('\nM\fub";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "\016Z\021n$\001L\016tm\034V\020w.\031F.b1\013^\004b\000\027[\032'";
                byte0 = 6;
                i = 7;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021(,\027K<t/\013`\025b0\021Y\nd#\fV\fi";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\016Z\021n$\001L\016tm\037Z\027H0\021X\ni#\fV\r`\003\034[\021b1\013\037";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\016Z\021n$\001L\016tm\fZ\033sm\027J\027*-\036\022\016b/\027M\032'";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\031J\027h";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLf.\nZ\002c;XM\006d'\021I\006c";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLe7\026[\017bo\026J\017k";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLj'\013L\002`'UQ\026k.";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\013Z\021q'\n\022\020b,\034\022\016n1\025^\027d*UZ\016w6\001";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLw&\rLNi7\024S";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\016Z\021n$\001L\016tm\034V\020w.\031F,u+\037V\rf6\021Q\004F&\034M\006t1X";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\016Z\021n$\001L\016tm\037Z\027T'\nI\nd';Z\rs'\n~\007c0\035L\020'";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\016Z\021n$\001L\016tm\035R\002n.:P\007~b";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\016Z\021n$\001L\016tm\fZ\033so\nZ\000b+\016Z\021(";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\b[\026t";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\016Z\021n$\001L\016tm\037Z\027W1\035J\007h\021\r]\tb!\f\037";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\016Z\021n$\001L\016t";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\016Z\021n$\001L\016tm\nZ\000b+\016Z\007*0\035\\\006n4\035MLc'\013K\021h;\035[";
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
        byte byte1 = 66;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 120;
          goto _L9
_L5:
        byte1 = 63;
          goto _L9
_L6:
        byte1 = 99;
          goto _L9
        byte1 = 7;
          goto _L9
    }

    r(VerifySms verifysms)
    {
        a = verifysms;
        super();
    }
}
