// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.g;

public final class o
{

    private final boolean a = true;

    o(boolean flag)
    {
    }

    public final void a(g ag[])
    {
        if (!a || ag == null || ag.length < 3)
        {
            return;
        } else
        {
            g g = ag[0];
            ag[0] = ag[2];
            ag[2] = g;
            return;
        }
    }
}
