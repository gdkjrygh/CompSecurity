// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            an, ao, ak

class al extends Handler
{

    final ak a;

    al(ak ak1)
    {
        a = ak1;
        super();
    }

    public void handleMessage(Message message)
    {
        message = (an)message.obj;
        (new ao(a)).execute(new Object[] {
            message, ak.a(a).getContentResolver()
        });
    }
}
