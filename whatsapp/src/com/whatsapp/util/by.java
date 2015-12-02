// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.text.format.Formatter;
import com.whatsapp.App;
import com.whatsapp.Main;

// Referenced classes of package com.whatsapp.util:
//            Log

public class by
{

    private static final String z[];

    public static void a(Context context)
    {
        a(context, context.getString(0x7f0e0167, new Object[] {
            Formatter.formatFileSize(context, App.aY())
        }));
    }

    public static void a(Context context, int i)
    {
label0:
        {
            long l = App.aY();
            String s = null;
            if (l < 0xa00000L)
            {
                s = Formatter.formatFileSize(context, l);
                Log.i((new StringBuilder()).append(z[0]).append(s).toString());
            }
            if (s != null)
            {
                a(context, (new StringBuilder()).append(context.getString(i)).append(" ").append(context.getString(0x7f0e0165, new Object[] {
                    s
                })).toString());
                if (!Log.f)
                {
                    break label0;
                }
            }
            a(context, context.getString(i));
        }
    }

    public static void a(Context context, String s)
    {
        Log.i(z[2]);
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setCategory(z[1]);
        builder.setPriority(1);
        String s1 = context.getString(0x7f0e0161);
        String s2 = context.getString(0x7f0e0162);
        builder.setSmallIcon(0x7f0205db);
        builder.setTicker(s1);
        builder.setContentTitle(s2);
        builder.setContentText(s);
        builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, com/whatsapp/Main), 0x10000000));
        s = builder.getNotification();
        NotificationManagerCompat.from(context).notify(2, s);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "1E$Z$&R&Z$ R$\0322=D=\\9{S?F='G7V3t";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "1E$";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "1E$Z$&R&Z$ R$\032$1G9G\"1E$Z$";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 86;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 84;
          goto _L9
_L5:
        byte0 = 55;
          goto _L9
_L6:
        byte0 = 86;
          goto _L9
        byte0 = 53;
          goto _L9
    }
}
