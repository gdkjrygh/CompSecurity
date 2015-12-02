// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, adi, aoz, k, 
//            og, MediaData, w5, Conversation, 
//            abl, Main

public class VideoTranscodeService extends Service
{

    private static final HashMap d;
    private static final String z[];
    private int a;
    private boolean b;
    private String c;

    public VideoTranscodeService()
    {
        b = false;
        a = -1;
    }

    public static void a()
    {
        App.ah.a(new adi());
    }

    static HashMap b()
    {
        return d;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        try
        {
            if (b)
            {
                b = false;
                stopForeground(true);
            }
            return;
        }
        catch (SecurityException securityexception)
        {
            throw securityexception;
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        int l = App.am;
        if (!d.isEmpty()) goto _L2; else goto _L1
_L1:
        stopSelf();
        if (l == 0) goto _L3; else goto _L2
_L2:
        android.support.v4.app.NotificationCompat.Builder builder;
        boolean flag2;
        flag2 = b;
        b = true;
        builder = new android.support.v4.app.NotificationCompat.Builder(App.au);
        builder.setCategory(z[1]);
        builder.setSmallIcon(0x1080088);
        builder.setWhen(System.currentTimeMillis());
        builder.setContentTitle(getString(0x7f0e0047));
        j = -1;
        i = j;
        if (d.size() != 1) goto _L5; else goto _L4
_L4:
        Object obj;
        Object obj1;
        obj1 = (c4)d.values().iterator().next();
        obj = App.az.e(((c4) (obj1)).y.a);
        intent = getString(0x7f0e037b, new Object[] {
            com.whatsapp.util.c.b(((og) (obj)).a(this))
        });
        i = j;
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L7; else goto _L6
_L6:
        obj1 = (MediaData)((c4) (obj1)).B;
        i = j;
        if (obj1 == null) goto _L7; else goto _L8
_L8:
        j = (int)((MediaData) (obj1)).progress;
        i = j;
        if (((MediaData) (obj1)).transcoder == null) goto _L7; else goto _L9
_L9:
        boolean flag = ((MediaData) (obj1)).transcoder.h();
        i = j;
        if (!flag) goto _L7; else goto _L10
_L10:
        try
        {
            obj1 = ((MediaData) (obj1)).uploader;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        i = j / 2;
        if (l == 0) goto _L7; else goto _L13
_L13:
        i = i / 2 + 50;
_L7:
        obj = com.whatsapp.Conversation.a(((og) (obj)));
        if (l == 0) goto _L14; else goto _L5
_L5:
        intent = new HashSet();
        obj = d.values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            intent.add(((c4)((Iterator) (obj)).next()).y.a);
        } while (l == 0);
        if (intent.size() == 1)
        {
            obj = App.az.e((String)intent.iterator().next());
            intent = String.format(App.j.a(0x7f0d0028, d.size()), new Object[] {
                Integer.valueOf(d.size()), com.whatsapp.util.c.b(((og) (obj)).a(this))
            });
            obj = com.whatsapp.Conversation.a(((og) (obj)));
        } else
        {
            obj = new Intent(this, Main.g());
            intent = String.format(App.j.a(0x7f0d0029, d.size()), new Object[] {
                Integer.valueOf(d.size())
            });
        }
_L14:
        if (i >= 0)
        {
            boolean flag1;
            if (i == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            builder.setProgress(100, i, flag1);
        }
        try
        {
            builder.setContentText(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        builder.setTicker(intent);
        obj = PendingIntent.getActivity(this, 0, ((Intent) (obj)), 0);
        builder.setContentIntent(((PendingIntent) (obj)));
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        startForeground(4, builder.build());
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_516;
        }
        j = a;
        if (j == i)
        {
            try
            {
                flag1 = TextUtils.equals(intent, c);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_516;
            }
        }
        NotificationManagerCompat.from(this).notify(4, builder.build());
_L16:
        a = i;
        c = intent;
_L3:
        return 2;
        intent;
        throw intent;
        intent;
        throw intent;
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
        SecurityException securityexception;
        securityexception;
        if (securityexception.toString().contains(z[0])) goto _L16; else goto _L15
_L15:
        throw securityexception;
        intent;
        throw intent;
_L12:
        i = j;
        if (true) goto _L13; else goto _L17
_L17:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ":\024\0346H2\036V4B)\027\0217T2\025\026jr\013>9\020b\004;(\024x\024*+\033t\017;,\027";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "+\b\027#U>\t\013";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                d = new HashMap();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 144
    //                   0 165
    //                   1 171
    //                   2 177
    //                   3 183;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_183;
_L3:
        byte byte0 = 39;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 91;
          goto _L9
_L5:
        byte0 = 122;
          goto _L9
_L6:
        byte0 = 120;
          goto _L9
        byte0 = 68;
          goto _L9
    }
}
