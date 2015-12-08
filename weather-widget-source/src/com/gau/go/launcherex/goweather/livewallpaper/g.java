// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.goweather.livewallpaper.b.e;
import com.jiubang.core.a.i;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            f

class g extends Handler
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            ((i)message.obj).j();
            break;
        }
        f.b(a).a(f.a(a));
    }
}
