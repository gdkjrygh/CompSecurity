// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso:
//            AbstractBoxParser

class this._cls0 extends ThreadLocal
{

    final AbstractBoxParser this$0;

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected ByteBuffer initialValue()
    {
        return ByteBuffer.allocate(32);
    }

    ()
    {
        this$0 = AbstractBoxParser.this;
        super();
    }
}
