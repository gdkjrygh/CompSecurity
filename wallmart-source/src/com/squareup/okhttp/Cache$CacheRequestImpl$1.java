// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.ForwardingSink;
import okio.Sink;

// Referenced classes of package com.squareup.okhttp:
//            Cache

class val.editor extends ForwardingSink
{

    final tor.commit this$1;
    final com.squareup.okhttp.internal.t val$editor;
    final Cache val$this$0;

    public void close()
        throws IOException
    {
label0:
        {
            synchronized (_fld0)
            {
                if (!cess._mth700(this._cls1.this))
                {
                    break label0;
                }
            }
            return;
        }
        cess._mth702(this._cls1.this, true);
        Cache.access$808(_fld0);
        cache;
        JVM INSTR monitorexit ;
        super.close();
        val$editor.t();
        return;
        exception;
        cache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    tor(com.squareup.okhttp.internal. )
    {
        this$1 = final_tor;
        val$this$0 = Cache.this;
        val$editor = ;
        super(final_sink);
    }
}
