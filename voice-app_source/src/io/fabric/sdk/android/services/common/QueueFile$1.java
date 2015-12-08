// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            QueueFile

class first
    implements ementReader
{

    boolean first;
    final QueueFile this$0;
    final StringBuilder val$builder;

    public void read(InputStream inputstream, int i)
        throws IOException
    {
        if (first)
        {
            first = false;
        } else
        {
            val$builder.append(", ");
        }
        val$builder.append(i);
    }

    ementReader()
    {
        this$0 = final_queuefile;
        val$builder = StringBuilder.this;
        super();
        first = true;
    }
}
