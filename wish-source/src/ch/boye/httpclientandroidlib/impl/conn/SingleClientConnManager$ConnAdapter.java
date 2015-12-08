// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.conn;

import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.conn:
//            AbstractPooledConnAdapter, SingleClientConnManager

protected class ute extends AbstractPooledConnAdapter
{

    final SingleClientConnManager this$0;

    protected ( , HttpRoute httproute)
    {
        this$0 = SingleClientConnManager.this;
        super(SingleClientConnManager.this, );
        markReusable();
        .ute = httproute;
    }
}
