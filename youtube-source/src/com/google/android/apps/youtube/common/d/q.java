// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.d;

import com.google.android.apps.youtube.a.a.g;
import com.google.android.apps.youtube.common.database.BasicKeyValueStore;
import com.google.android.apps.youtube.common.database.c;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;

public final class q extends BasicKeyValueStore
{

    public q(c c)
    {
        super(c, "ScheduledTaskProto");
    }

    private static g b(byte abyte0[])
    {
        try
        {
            abyte0 = (g)(new g()).b(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    protected final Object a(byte abyte0[])
    {
        return b(abyte0);
    }

    protected final byte[] a(Object obj)
    {
        return ((g)obj).s();
    }

    protected final volatile long b(Object obj)
    {
        return 0L;
    }
}
