// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.windforecast;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.home.windforecast:
//            WindInfoBase

class f extends Handler
{

    final WindInfoBase a;

    f(WindInfoBase windinfobase)
    {
        a = windinfobase;
        super();
    }

    public void handleMessage(Message message)
    {
        WindInfoBase.a(a);
    }
}
