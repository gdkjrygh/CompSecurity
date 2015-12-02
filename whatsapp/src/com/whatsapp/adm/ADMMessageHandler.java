// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.adm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.c2dm.a;
import com.whatsapp.c2dm.b;
import com.whatsapp.util.Log;

public class ADMMessageHandler extends ADMMessageHandlerBase
{

    public static int a;
    private static final String z[];
    private final Context b;
    private final ADM c;
    private final a d;

    public ADMMessageHandler()
    {
        this(((Context) (App.au)));
    }

    public ADMMessageHandler(Context context)
    {
        int i = a;
        super(z[7]);
        b = context;
        c = new ADM(context);
        d = new a(context);
        if (DialogToastActivity.g != 0)
        {
            a = i + 1;
        }
    }

    private void a()
    {
        if (c.getRegistrationId() == null)
        {
            c.startRegister();
        }
    }

    private void a(String s)
    {
        App.a(s, z[13]);
    }

    public void b(String s)
    {
label0:
        {
            int i = a;
            if (c.getRegistrationId() == null)
            {
                Log.i(z[0]);
                a();
                if (i == 0)
                {
                    break label0;
                }
            }
            if (s == null || !s.equals(c.getRegistrationId()))
            {
                Log.i(z[2]);
                a(c.getRegistrationId());
                if (i == 0)
                {
                    break label0;
                }
            }
            Log.i(z[1]);
        }
    }

    protected void onMessage(Intent intent)
    {
        int i = a;
        Bundle bundle = intent.getExtras();
        bundle.getString(z[6]);
        bundle.getString(z[4]);
        bundle.getString(z[5]);
        bundle.getBoolean(z[3]);
        com.whatsapp.c2dm.b.a(b, intent, false);
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    protected void onRegistered(String s)
    {
        if (s == null)
        {
            return;
        }
        int i = d.h();
        Log.b(z[14], null, new Object[] {
            s, Integer.valueOf(i)
        });
        d.c();
        if (d.i() == null)
        {
            Log.i(z[15]);
            App.a(this, 0);
        }
        d.a(s);
        if (i > 0)
        {
            d.a(i);
        }
        a(s);
    }

    protected void onRegistrationError(String s)
    {
label0:
        {
            if (s.equals(z[8]))
            {
                Log.b(z[9], null, new Object[] {
                    s
                });
                d.e();
                a();
                if (a == 0)
                {
                    break label0;
                }
            }
            if (s.equals(z[10]) || s.equals(z[11]))
            {
                Log.a(z[12], null, new Object[] {
                    s
                });
                d.g();
                d.d();
            }
        }
    }

    protected void onUnregistered(String s)
    {
        d.g();
        d.d();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[16];
        obj = "\024?\031\f\0070\n!I\006!\022:KU'\036&I\022<\b ^\024!\022;B[";
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
                obj = "\024?\031\f\034&[&I\022<\b I\0070\037tM\0331[\003D\024!\b\025\\\005u\b1^\0030\t'\f\0354\r1\f\026:\t&I\026![&I\022<\b ^\024!\022;BU\034?tJ\032'[\025h8{";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\024?\031\f\0060\0250E\0332[8M\0010\b \f4\0216t^\0202\022'X\0074\017=C\033\034\037tX\032u,<M\001&:$\\U%\016'DU&\036&Z\020'\bz";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "4\0278C\002\n\036,\\\034'\0360";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "<\013";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "9\017";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "<\037";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "6\0249\002\002=\032 _\024%\013zM\0218U\025h8\030\036'_\0242\036\034M\0331\0271^";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\006>\006z<\026>\013b:\001$\025z4\0347\025n9\020";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\024?\031\003\0070\034=_\001'\032 E\032;T1^\007:\t{\t\006";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\0345\002m9\034?\013\1770\033?\021~";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\024.\000d0\033/\035o4\0012\033b*\023:\035`0\021";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\024?\031\003\0070\034=_\001'\032 E\032;T1^\007:\t{\t\006";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "4\0379";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\024?\031\003\0070\034=_\0010\t1HZp\btM\005%-1^\006<\024:\021P1";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\024?\031\003\0070\034=_\0010\t1HZ;\036#";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 432
    //                   0 455
    //                   1 462
    //                   2 469
    //                   3 476;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_476;
_L3:
        byte byte1 = 117;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 85;
          goto _L9
_L5:
        byte1 = 123;
          goto _L9
_L6:
        byte1 = 84;
          goto _L9
        byte1 = 44;
          goto _L9
    }
}
