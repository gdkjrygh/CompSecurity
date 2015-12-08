// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameReader, ErrorCode, HeadersMode, Settings

public static interface 
{

    public abstract void ackSettings();

    public abstract void alternateService(int i, String s, ByteString bytestring, String s1, int j, long l);

    public abstract void data(boolean flag, int i, BufferedSource bufferedsource, int j)
        throws IOException;

    public abstract void goAway(int i, ErrorCode errorcode, ByteString bytestring);

    public abstract void headers(boolean flag, boolean flag1, int i, int j, List list, HeadersMode headersmode);

    public abstract void ping(boolean flag, int i, int j);

    public abstract void priority(int i, int j, int k, boolean flag);

    public abstract void pushPromise(int i, int j, List list)
        throws IOException;

    public abstract void rstStream(int i, ErrorCode errorcode);

    public abstract void settings(boolean flag, Settings settings1);

    public abstract void windowUpdate(int i, long l);
}
