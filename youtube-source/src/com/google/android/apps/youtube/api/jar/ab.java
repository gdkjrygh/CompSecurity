// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            aa

final class ab
    implements android.os.Handler.Callback
{

    final aa a;

    private ab(aa aa1)
    {
        a = aa1;
        super();
    }

    ab(aa aa1, byte byte0)
    {
        this(aa1);
    }

    public final boolean handleMessage(Message message)
    {
        aa.a(a);
        return true;
    }
}
