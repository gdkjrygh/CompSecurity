// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.youtube.player.YouTubeInitializationResult;
import java.util.ArrayList;

// Referenced classes of package com.google.android.youtube.player.internal:
//            aj, as, am

final class al extends Handler
{

    final aj a;

    al(aj aj1)
    {
        a = aj1;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 3)
        {
            a.a((YouTubeInitializationResult)message.obj);
        } else
        {
            if (message.what == 4)
            {
                synchronized (aj.a(a))
                {
                    if (aj.b(a) && a.f() && aj.a(a).contains(message.obj))
                    {
                        ((as)message.obj).a();
                    }
                }
                return;
            }
            if ((message.what != 2 || a.f()) && (message.what == 2 || message.what == 1))
            {
                ((am)message.obj).a();
                return;
            }
        }
    }
}
