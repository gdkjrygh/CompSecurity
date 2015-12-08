// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import io.wecloud.message.e.b;
import io.wecloud.message.e.c;
import io.wecloud.message.h.a;
import io.wecloud.message.h.g;

// Referenced classes of package io.wecloud.message:
//            j

public class PushServiceReceiver extends BroadcastReceiver
{

    private static final String a = io/wecloud/message/PushServiceReceiver.getSimpleName();
    private Boolean b;

    public PushServiceReceiver()
    {
    }

    private void a(Context context, boolean flag, int i)
    {
        if (g.a(context) && !j.e(context))
        {
            io.wecloud.message.j.b(context, flag);
            io.wecloud.message.e.b.a(context).a(io.wecloud.message.e.a.a(flag, (new StringBuilder(String.valueOf(io.wecloud.message.h.a.c(context, context.getPackageName())))).append(":").append(i).toString()));
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (b == null)
        {
            b = Boolean.valueOf(false);
        }
        if (intent == null) goto _L2; else goto _L1
_L1:
        Object obj = intent.getAction();
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (!((String) (obj)).equals("io.wecloud.message.action.METHOD")) goto _L5; else goto _L4
_L4:
        intent.getIntExtra("method_key", -1);
        JVM INSTR lookupswitch 3: default 80
    //                   1004: 81
    //                   1006: 133
    //                   1014: 142;
           goto _L2 _L6 _L7 _L8
_L2:
        return;
_L6:
        if ((intent = intent.getStringExtra("pkg")) != null && intent.equals(context.getPackageName()))
        {
            c.b("PushServiceReceiver", "\u5FC3\u8DF3\u95F9\u949F\uFF0Cacquire wake lock --->");
            if (j.e(context))
            {
                io.wecloud.message.j.a(context, 112);
                io.wecloud.message.j.b(context);
                io.wecloud.message.j.a(context, intent);
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        a(context, false, 102);
        return;
_L8:
        c.b(a, "METHOD_ON_CLEAR_NOTIFICTION");
        obj = intent.getStringExtra("mypkg");
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && context.getPackageName().equals(obj))
        {
            obj = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
            ((Intent) (obj)).putExtra("action", "io.wecloud.message.action.METHOD");
            ((Intent) (obj)).setPackage(context.getPackageName());
            ((Intent) (obj)).putExtras(intent.getExtras());
            ((Intent) (obj)).putExtra("method_key", 1023);
            context.startService(((Intent) (obj)));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (((String) (obj)).equals("android.intent.action.BOOT_COMPLETED"))
        {
            c.b("CSH", "\u5F00\u673A");
            intent = (AlarmManager)context.getSystemService("alarm");
            obj = new Intent("io.wecloud.message.action.METHOD");
            ((Intent) (obj)).putExtra("method_key", 1006);
            intent.set(0, System.currentTimeMillis() + 0x2bf20L, PendingIntent.getBroadcast(context, 0, ((Intent) (obj)), 0x10000000));
            return;
        }
        if (((String) (obj)).equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            io.wecloud.message.j.c(context, b.booleanValue());
            return;
        }
        if (((String) (obj)).equals("android.intent.action.USER_PRESENT"))
        {
            a(context, true, 104);
            return;
        }
        if (true) goto _L2; else goto _L9
_L9:
    }

}
