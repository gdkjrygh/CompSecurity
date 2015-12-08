// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.wecloud.message.e.c;
import io.wecloud.message.h.a;
import io.wecloud.message.h.g;
import java.util.Timer;

// Referenced classes of package io.wecloud.message:
//            ClientService, f

class e extends BroadcastReceiver
{

    final ClientService a;

    private e(ClientService clientservice)
    {
        a = clientservice;
        super();
    }

    e(ClientService clientservice, e e1)
    {
        this(clientservice);
    }

    static ClientService a(e e1)
    {
        return e1.a;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        intent = intent.getAction();
        if (!intent.equals("android.intent.action.TIME_TICK")) goto _L4; else goto _L3
_L3:
        c.b("CSH", "ACTION_TIME_TICK");
        if (!g.a(a.getApplicationContext())) goto _L6; else goto _L5
_L5:
        if (io.wecloud.message.ClientService.c(a) != null)
        {
            io.wecloud.message.ClientService.c(a).a(1, "");
        }
_L2:
        return;
_L6:
        ClientService.d(a);
        c.b("CSH", "ACTION_TIME_TICK -- \u7F51\u7EDC\u4E0D\u53EF\u7528\uFF0C\u505C\u6B62\u670D\u52A1");
        return;
_L4:
        if (intent.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            try
            {
                intent = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
                intent.setPackage(context.getPackageName());
                intent.putExtra("action", "io.wecloud.message.action.METHOD");
                intent.putExtra("method_key", 1007);
                intent.putExtra("pkg", context.getPackageName());
                context.startService(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
        if (intent.equals("android.intent.action.SCREEN_OFF"))
        {
            io.wecloud.message.f.a.a(context).b();
            return;
        }
        if (intent.equals("android.intent.action.SCREEN_ON"))
        {
            context = new f(this);
            (new Timer()).schedule(context, 10000L);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}
