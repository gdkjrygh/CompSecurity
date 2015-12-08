// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.wear;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.wear:
//            f, c

class d extends Handler
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void handleMessage(Message message)
    {
        f.a("--------------------------------------------------------------------");
        f.a("\u65F6\u95F4\u5230\uFF0C\u8FDB\u5165\u53D1\u9001\u5361\u7247\u903B\u8F91");
        a.a();
    }
}
