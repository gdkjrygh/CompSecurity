// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client.cache:
//            CombinedEntity

class this._cls0 extends FilterInputStream
{

    final CombinedEntity this$0;

    public void close()
        throws IOException
    {
        super.close();
        CombinedEntity.access$000(CombinedEntity.this);
        return;
        Exception exception;
        exception;
        CombinedEntity.access$000(CombinedEntity.this);
        throw exception;
    }

    protected (InputStream inputstream)
    {
        this$0 = CombinedEntity.this;
        super(inputstream);
    }
}
