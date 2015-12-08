// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.ForwardingSource;
import okio.Source;

// Referenced classes of package com.squareup.okhttp:
//            Cache

class val.snapshot extends ForwardingSource
{

    final shot.close this$0;
    final com.squareup.okhttp.internal.e val$snapshot;

    public void close()
        throws IOException
    {
        val$snapshot.e();
        super.close();
    }

    shot(com.squareup.okhttp.internal. )
    {
        this$0 = final_shot;
        val$snapshot = ;
        super(Source.this);
    }
}
