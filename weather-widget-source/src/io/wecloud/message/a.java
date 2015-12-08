// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.os.Handler;
import android.os.Message;
import io.wecloud.message.bean.EventInfo;
import io.wecloud.message.e.b;
import io.wecloud.message.e.c;
import io.wecloud.message.g.e;

// Referenced classes of package io.wecloud.message:
//            ClientService

class a extends Handler
{

    final ClientService a;
    private EventInfo b;

    a(ClientService clientservice)
    {
        a = clientservice;
        super();
        b = new EventInfo();
    }

    public void dispatchMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 272 273: default 28
    //                   272 34
    //                   273 334;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
        return;
_L2:
        Object obj = ClientService.a(a);
        obj;
        JVM INSTR monitorenter ;
        c.d(io.wecloud.message.ClientService.c(), (new StringBuilder("dispath message, context pkgName = ")).append(a.getPackageName()).toString());
        b = (EventInfo)message.obj;
        message = b;
        if (message != null) goto _L5; else goto _L4
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
_L5:
        if (!io.wecloud.message.ClientService.b(a).equals(b.c())) goto _L7; else goto _L6
_L6:
        ClientService.a(a, b);
        if (io.wecloud.message.ClientService.c(a) != null && io.wecloud.message.ClientService.c(a).n())
        {
            io.wecloud.message.ClientService.c(a).a(b.a());
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L7:
        c.b(io.wecloud.message.ClientService.c(), (new StringBuilder("appkey \u4E0D\u5339\u914D\uFF01 \u5E94\u7528\u7684appkey = ")).append(io.wecloud.message.ClientService.b(a)).append(", \u6D88\u606F\u6307\u5B9A\u7684appkey = ").append(b.c()).toString());
_L8:
        obj;
        JVM INSTR monitorexit ;
        return;
        message;
        message.printStackTrace();
        message = new StringBuffer();
        message.append((new StringBuilder(String.valueOf(io.wecloud.message.ClientService.b(a)))).append(":").append(0).toString());
        io.wecloud.message.e.b.a(a.getApplicationContext()).a(io.wecloud.message.e.a.c(message.toString()));
        io.wecloud.message.e.b.a(a.getApplicationContext()).a(io.wecloud.message.e.a.a(10, Long.toString(b.a())));
          goto _L8
        message;
        message.printStackTrace();
          goto _L8
        message;
        message.printStackTrace();
          goto _L8
_L3:
        ClientService.a(a, (String)message.obj);
        return;
    }
}
