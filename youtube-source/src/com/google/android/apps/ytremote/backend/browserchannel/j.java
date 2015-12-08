// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.browserchannel;

import java.io.ByteArrayOutputStream;
import java.util.Map;

public final class j
{

    private final byte a[];
    private final int b;
    private final ByteArrayOutputStream c;
    private final Map d;
    private final Map e;
    private final boolean f;

    j(ByteArrayOutputStream bytearrayoutputstream, boolean flag, int i, byte abyte0[], Map map, Map map1)
    {
        c = bytearrayoutputstream;
        f = flag;
        b = i;
        a = abyte0;
        e = map;
        d = map1;
    }

    public final byte[] a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }
}
