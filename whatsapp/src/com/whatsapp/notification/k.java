// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import com.whatsapp.App;

final class k
    implements Runnable
{

    final String a;

    k(String s)
    {
        a = s;
        super();
    }

    public void run()
    {
        App.B(a);
    }
}
