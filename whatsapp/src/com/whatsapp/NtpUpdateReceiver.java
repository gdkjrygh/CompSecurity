// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.x;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            App, al1, d

public final class NtpUpdateReceiver extends BroadcastReceiver
{

    private static final String z[];
    private final String a;

    public NtpUpdateReceiver(Context context)
    {
        int i = Resources.getSystem().getIdentifier(z[3], null, null);
        if (i == 0)
        {
            String s;
            int j;
            try
            {
                a = z[4];
                j = App.am;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_80;
            }
        }
        s = context.getResources().getString(i);
        context = s;
        try
        {
            if (TextUtils.isEmpty(s))
            {
                Log.w(z[6]);
                context = z[7];
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.c(z[5], context);
            context = z[2];
        }
        a = context;
    }

    static String a(NtpUpdateReceiver ntpupdatereceiver)
    {
        return ntpupdatereceiver.a;
    }

    public void a()
    {
        x.a(new al1(this));
    }

    public void a(Context context)
    {
        PendingIntent pendingintent = PendingIntent.getBroadcast(context, 0, (new Intent(z[8])).setPackage(z[10]), 0);
        ((AlarmManager)context.getSystemService(z[9])).setInexactRepeating(3, 0L, 0x2932e00L, pendingintent);
    }

    public void b(Context context)
    {
        context.registerReceiver(this, new IntentFilter(z[0]), z[1], null);
        g.a().b(new d());
    }

    public void onReceive(Context context, Intent intent)
    {
        a();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = "U!:c5^/#>#F>y,.W<:c\fb\036\b\030\022r\017\003\b";
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
                obj = "U!:c5^/#>#F>y='D#>>1_!9c\000d\001\026\t\001w\035\003";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\004`6#&D!>)lF!8!lX:'c-D)";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "W 3?-_*m>6D'9*mU!9++Q\021992e+%;'D";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\004`6#&D!>)lF!8!lX:'c-D)";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "C %(1Y\"!, Z+w#6Fn$(0@+%m!Y 1$%C<69+Y ";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "S#'9;\026 #=bE+%;'Dn4\",P'080W:>\",";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\004`6#&D!>)lF!8!lX:'c-D)";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "U!:c5^/#>#F>y,.W<:c\fb\036\b\030\022r\017\003\b";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "W\"6?/";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "U!:c5^/#>#F>";
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
        byte byte1 = 66;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 54;
          goto _L9
_L5:
        byte1 = 78;
          goto _L9
_L6:
        byte1 = 87;
          goto _L9
        byte1 = 77;
          goto _L9
    }
}
