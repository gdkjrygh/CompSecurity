// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            i, z, n

class l extends Handler
{

    WeakReference a;

    public l(i j)
    {
        a = new WeakReference(j);
    }

    public void handleMessage(Message message)
    {
        i j;
        super.handleMessage(message);
        j = (i)a.get();
        if (j != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (message.what != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        message = ((Message) ((Object[])(Object[])message.obj));
        String s = (String)message[0];
        z z1 = (z)message[1];
        if (((Integer)message[2]).intValue() == i.a(j))
        {
            j.a.remove(s);
            j.b.put(s, z1);
            if (i.b(j) == j.b.size())
            {
                j.a.clear();
                j.a.putAll(j.b);
                j.b.clear();
                if (i.c(j))
                {
                    i.a(j, 5);
                    i.a(j, false);
                }
                i.d(j).sendBroadcast(new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_LOADING_FINISH"));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (message.what != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        message = ((Message) ((Object[])(Object[])message.obj));
        String s1 = (String)message[0];
        z z2 = (z)message[1];
        if (((Integer)message[2]).intValue() == i.a(j))
        {
            j.a.put(s1, z2);
            message = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_ONE_RELOAD_DONE");
            i.d(j).sendBroadcast(message);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (message.what == 0)
        {
            message = i.b(j, i.e(j));
            i.b(j, message.size());
            i.c(j, 0);
            String s2;
            ExecutorService executorservice;
            for (Iterator iterator = message.iterator(); iterator.hasNext(); executorservice.execute(new n(j, i.d(j), s2, i.a(j), true, false)))
            {
                s2 = (String)iterator.next();
                executorservice = i.f(j);
                j.getClass();
            }

            message.clear();
            return;
        }
        if (message.what == 3)
        {
            message = i.b(j, i.e(j));
            i.b(j, message.size());
            i.c(j, 3);
            String s3;
            ExecutorService executorservice1;
            for (Iterator iterator1 = message.iterator(); iterator1.hasNext(); executorservice1.execute(new n(j, i.d(j), s3, i.a(j), true, true)))
            {
                s3 = (String)iterator1.next();
                executorservice1 = i.f(j);
                j.getClass();
            }

            message.clear();
            return;
        }
        if (message.what == 4)
        {
            Object aobj[] = (Object[])(Object[])message.obj;
            message = (String)aobj[0];
            z z3 = (z)aobj[1];
            if (((Integer)aobj[2]).intValue() == i.a(j))
            {
                j.b.put(message, z3);
                j.a.remove(message);
                Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_BACKGROUND_CHANGE_FINISH");
                intent.putExtra("extra_background_loaded", message);
                i.d(j).sendBroadcast(intent);
                if (i.b(j) == j.b.size())
                {
                    j.a.clear();
                    j.a.putAll(j.b);
                    j.b.clear();
                    message = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE");
                    i.d(j).sendBroadcast(message);
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
