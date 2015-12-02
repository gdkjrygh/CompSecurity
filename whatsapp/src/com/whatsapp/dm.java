// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import org.apache.http.entity.ContentProducer;
import org.apache.http.entity.EntityTemplate;

// Referenced classes of package com.whatsapp:
//            gc

class dm extends EntityTemplate
{

    long a;
    final gc b;

    public dm(gc gc, ContentProducer contentproducer, long l)
    {
        b = gc;
        super(contentproducer);
        a = l;
    }

    public long getContentLength()
    {
        return a;
    }
}
