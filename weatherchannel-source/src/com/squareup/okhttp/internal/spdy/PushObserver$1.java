// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            PushObserver, ErrorCode

static final class 
    implements PushObserver
{

    public boolean onData(int i, BufferedSource bufferedsource, int j, boolean flag)
        throws IOException
    {
        bufferedsource.skip(j);
        return true;
    }

    public boolean onHeaders(int i, List list, boolean flag)
    {
        return true;
    }

    public boolean onRequest(int i, List list)
    {
        return true;
    }

    public void onReset(int i, ErrorCode errorcode)
    {
    }

    ()
    {
    }
}
