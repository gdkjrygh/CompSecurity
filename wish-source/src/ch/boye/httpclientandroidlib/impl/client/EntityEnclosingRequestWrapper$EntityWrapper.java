// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.entity.HttpEntityWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            EntityEnclosingRequestWrapper

class this._cls0 extends HttpEntityWrapper
{

    final EntityEnclosingRequestWrapper this$0;

    public void consumeContent()
        throws IOException
    {
        EntityEnclosingRequestWrapper.access$002(EntityEnclosingRequestWrapper.this, true);
        super.consumeContent();
    }

    public InputStream getContent()
        throws IOException
    {
        EntityEnclosingRequestWrapper.access$002(EntityEnclosingRequestWrapper.this, true);
        return super.getContent();
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        EntityEnclosingRequestWrapper.access$002(EntityEnclosingRequestWrapper.this, true);
        super.writeTo(outputstream);
    }

    (HttpEntity httpentity)
    {
        this$0 = EntityEnclosingRequestWrapper.this;
        super(httpentity);
    }
}
