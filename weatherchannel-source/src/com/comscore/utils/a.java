// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


// Referenced classes of package com.comscore.utils:
//            ConnectivityChangeReceiver

class a
    implements Runnable
{

    final ConnectivityChangeReceiver a;

    a(ConnectivityChangeReceiver connectivitychangereceiver)
    {
        a = connectivitychangereceiver;
        super();
    }

    public void run()
    {
        a.b(false);
    }
}
