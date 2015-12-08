// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.walmart.android.app.qr:
//            QRDataHandler

class this._cls0
    implements RedirectHandler
{

    final QRDataHandler this$0;

    public URI getLocationURI(HttpResponse httpresponse, HttpContext httpcontext)
        throws ProtocolException
    {
        return null;
    }

    public boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return QRDataHandler.access$200(QRDataHandler.this, httpresponse);
    }

    ()
    {
        this$0 = QRDataHandler.this;
        super();
    }
}
