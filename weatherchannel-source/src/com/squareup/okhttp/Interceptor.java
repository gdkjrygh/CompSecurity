// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;

// Referenced classes of package com.squareup.okhttp:
//            Response, Connection, Request

public interface Interceptor
{
    public static interface Chain
    {

        public abstract Connection connection();

        public abstract Response proceed(Request request1)
            throws IOException;

        public abstract Request request();
    }


    public abstract Response intercept(Chain chain)
        throws IOException;
}
