// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.messaging.h;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            App

final class aov extends Handler
{

    private final HashMap a = new HashMap();

    aov()
    {
    }

    private void a(String s, boolean flag)
    {
        if (!hasMessages(0, s) && !hasMessages(3, s))
        {
            if (!hasMessages(5, s) && App.aQ() && flag)
            {
                App.H().c(h.j(s));
            }
            removeMessages(1, s);
            removeMessages(2, s);
        }
    }

    private void a(String s, boolean flag, int i)
    {
label0:
        {
label1:
            {
                Object obj1 = null;
                if (hasMessages(1, s) || hasMessages(4, s))
                {
                    break label0;
                }
                removeMessages(0, s);
                if (!hasMessages(2, s) && !hasMessages(5, s))
                {
                    if (!App.aQ())
                    {
                        break label1;
                    }
                    MessageService messageservice = App.H();
                    Object obj;
                    long l;
                    if (flag)
                    {
                        obj = s;
                    } else
                    {
                        obj = null;
                    }
                    messageservice.c(h.c(((String) (obj)), i));
                    a.put(s, Long.valueOf(System.currentTimeMillis()));
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                obj = (Long)a.get(s);
                l = System.currentTimeMillis();
                if (obj != null && l - ((Long) (obj)).longValue() > 10000L && App.aQ())
                {
                    messageservice = App.H();
                    obj = obj1;
                    if (flag)
                    {
                        obj = s;
                    }
                    messageservice.c(h.c(((String) (obj)), i));
                    a.put(s, Long.valueOf(l));
                }
            }
            removeMessages(2, s);
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            sendMessageDelayed(obtainMessage(2, i, 0, s), 2000L);
        }
    }

    private void a(String s, boolean flag, boolean flag1)
    {
        if (!hasMessages(0, s) && !hasMessages(3, s))
        {
            if (!hasMessages(2, s) && App.aQ() && flag && (flag1 || hasMessages(5, s)))
            {
                App.H().c(h.j(s));
            }
            removeMessages(4, s);
            removeMessages(5, s);
        }
    }

    private void b(String s, boolean flag, int i)
    {
        if (!hasMessages(1, s) && !hasMessages(4, s))
        {
            if (!hasMessages(2, s) && App.aQ())
            {
                MessageService messageservice = App.H();
                String s1;
                if (flag)
                {
                    s1 = s;
                } else
                {
                    s1 = null;
                }
                messageservice.c(h.c(s1, i));
            }
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            sendMessageDelayed(obtainMessage(5, i, 0, s), 30000L);
        }
    }

    public void handleMessage(Message message)
    {
        int i;
        boolean flag1;
        flag1 = false;
        i = App.am;
        message.what;
        JVM INSTR tableswitch 0 5: default 48
    //                   0 49
    //                   1 117
    //                   2 117
    //                   3 83
    //                   4 147
    //                   5 178;
           goto _L1 _L2 _L3 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        boolean flag;
        String s = (String)message.obj;
        if (message.arg1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(s, flag, message.arg2);
        if (i == 0) goto _L1; else goto _L4
_L4:
        s = (String)message.obj;
        if (message.arg1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(s, flag, message.arg2);
        if (i == 0) goto _L1; else goto _L3
_L3:
        s = (String)message.obj;
        if (message.arg1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(s, flag);
        if (i == 0) goto _L1; else goto _L5
_L5:
        s = (String)message.obj;
        if (message.arg1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(s, flag, false);
        if (i == 0) goto _L1; else goto _L6
_L6:
        s = (String)message.obj;
        flag = flag1;
        if (message.arg1 == 1)
        {
            flag = true;
        }
        a(s, flag, true);
        return;
    }
}
