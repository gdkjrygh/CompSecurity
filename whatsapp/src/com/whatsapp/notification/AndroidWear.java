// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.RemoteInput;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.aoz;
import com.whatsapp.fieldstats.j;
import com.whatsapp.fieldstats.z;
import com.whatsapp.k;
import com.whatsapp.og;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp.notification:
//            p, PopupNotification, s

public final class AndroidWear extends IntentService
{

    private static final String z[];

    public AndroidWear()
    {
        super(z[2]);
    }

    private static Notification a()
    {
        return (new android.support.v4.app.NotificationCompat.WearableExtender()).setHintShowBackgroundOnly(true).extend(new android.support.v4.app.NotificationCompat.Builder(App.au)).build();
    }

    private static Notification a(Context context, og og1)
    {
        Object obj;
        Object obj1;
        Cursor cursor;
        obj = "";
        cursor = App.ah.a(og1.a, 20, null);
        obj1 = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        obj1 = obj;
        if (!cursor.moveToLast()) goto _L2; else goto _L1
_L1:
        if (App.ah.h(og1.a))
        {
            obj = TextUtils.concat(new CharSequence[] {
                "", "\u2026"
            });
        }
_L3:
        CharSequence charsequence = p.a(context, App.ah.a(cursor, og1.a), og1, false, true);
        obj1 = obj;
        if (charsequence == "")
        {
            break MISSING_BLOCK_LABEL_143;
        }
        obj1 = obj;
        if (obj == "")
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj1 = TextUtils.concat(new CharSequence[] {
            obj, z[3]
        });
        obj1 = TextUtils.concat(new CharSequence[] {
            obj1, charsequence
        });
        boolean flag = cursor.moveToPrevious();
        obj = obj1;
        if (flag) goto _L3; else goto _L2
_L2:
        cursor.close();
        return (new android.support.v4.app.NotificationCompat.Builder(App.au)).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (obj1)))).extend((new android.support.v4.app.NotificationCompat.WearableExtender()).setStartScrollBottom(true)).build();
        context;
        cursor.close();
        throw context;
    }

    public static android.support.v4.app.NotificationCompat.WearableExtender a(Context context, og og1, boolean flag, c4 c4_1, boolean flag1, Bitmap bitmap)
    {
        android.support.v4.app.NotificationCompat.WearableExtender wearableextender = new android.support.v4.app.NotificationCompat.WearableExtender();
        if (flag && c4_1 != null && c4_1.w == 1 && c4_1.B != null)
        {
            wearableextender.addPage(a());
        }
        if (!App.a())
        {
            wearableextender.addPage(a(context, og1));
        }
        wearableextender.addAction(b(context, og1));
        if (flag1)
        {
            wearableextender.setBackground(bitmap);
        }
        return wearableextender;
    }

    private static void a(String s1)
    {
label0:
        {
            boolean flag = PopupNotification.q;
            String as[] = App.au.getResources().getStringArray(0x7f070000);
            if (s1.equals(as[0]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_SMILEEMOJI, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[1]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_YES, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[2]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_NO, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[3]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_ONMYWAY, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[4]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_OK, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[5]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_SEEYOUSOON, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[6]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_HAHA, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[7]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_LOL, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[8]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_NICE, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[9]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_SORRYCANTTALK, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[10]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_SADEMOJI, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            if (s1.equals(as[11]))
            {
                com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_THANKS, Integer.valueOf(1));
                if (!flag)
                {
                    break label0;
                }
            }
            com.whatsapp.fieldstats.z.a(App.au, j.ANDROID_WEAR_RESPONSE_VOICE, Integer.valueOf(1));
        }
    }

    private static android.support.v4.app.NotificationCompat.Action b(Context context, og og1)
    {
        String s1 = context.getString(0x7f0e035f, new Object[] {
            og1.a(context)
        });
        String as[] = context.getResources().getStringArray(0x7f070000);
        RemoteInput remoteinput = (new android.support.v4.app.RemoteInput.Builder(z[0])).setLabel(s1).setChoices(as).build();
        return (new android.support.v4.app.NotificationCompat.Action.Builder(0x7f02052e, s1, PendingIntent.getService(context, 0, new Intent(null, og1.r(), context, com/whatsapp/notification/AndroidWear), 0x8000000))).addRemoteInput(remoteinput).build();
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 18;
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        if (intent != null)
        {
            if ((obj = RemoteInput.getResultsFromIntent(intent)) != null)
            {
                intent = App.az.a(intent.getData());
                obj = ((Bundle) (obj)).getCharSequence(z[1]).toString();
                App.au.ab().post(new s(this, intent, ((String) (obj))));
                a(((String) (obj)));
                return;
            }
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "I\007f\020XA\r]\025RI\033]\024XA\ng=^F\031w\026";
        byte1 = -1;
        i = 0;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "I\007f\020XA\r]\025RI\033]\024XA\ng=^F\031w\026";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "i\007f\020XA\rU\007VZ";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "\"c";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 55;
_L9:
        obj[l] = (char)(byte0 ^ c);
        l++;
          goto _L8
_L4:
        byte0 = 40;
          goto _L9
_L5:
        byte0 = 105;
          goto _L9
_L6:
        byte0 = 2;
          goto _L9
        byte0 = 98;
          goto _L9
    }
}
