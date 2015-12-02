// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Binder;

// Referenced classes of package com.whatsapp.messaging:
//            MessageService

public final class bb extends Binder
{

    final MessageService a;

    public bb(MessageService messageservice)
    {
        a = messageservice;
        super();
    }

    public final MessageService a()
    {
        return a;
    }
}
