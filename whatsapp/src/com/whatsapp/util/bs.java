// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.os.Message;

public class bs
    implements android.os.Handler.Callback
{

    private boolean a;

    public bs()
    {
        a = true;
    }

    public void a()
    {
        a = false;
    }

    public void b()
    {
        a = true;
    }

    public boolean handleMessage(Message message)
    {
        if (!a);
        return a;
    }
}
