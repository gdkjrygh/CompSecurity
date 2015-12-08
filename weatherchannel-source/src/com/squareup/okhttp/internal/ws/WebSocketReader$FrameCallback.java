// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.ws;

import java.io.IOException;
import okio.Buffer;

// Referenced classes of package com.squareup.okhttp.internal.ws:
//            WebSocketReader

public static interface 
{

    public abstract void onClose(Buffer buffer)
        throws IOException;

    public abstract void onPing(Buffer buffer);
}
