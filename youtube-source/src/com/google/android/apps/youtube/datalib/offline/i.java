// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.common.database.BasicKeyValueStore;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;

public final class i extends BasicKeyValueStore
{

    public i(SQLiteOpenHelper sqliteopenhelper)
    {
        super(sqliteopenhelper, "OfflineHttpRequestProto");
    }

    private static c b(byte abyte0[])
    {
        try
        {
            abyte0 = c.a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return new c();
        }
        return abyte0;
    }

    protected final Object a(byte abyte0[])
    {
        return b(abyte0);
    }

    protected final byte[] a(Object obj)
    {
        return ((c)obj).s();
    }

    protected final long b(Object obj)
    {
        obj = (c)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(((c) (obj)).j(), "Must have stored time set");
        return ((c) (obj)).i();
    }
}
