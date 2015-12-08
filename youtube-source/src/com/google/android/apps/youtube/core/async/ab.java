// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            a, GDataRequestFactory, af, GDataRequest

public final class ab extends a
{

    public ab(GDataRequestFactory gdatarequestfactory, af af, af af1)
    {
        super(gdatarequestfactory, af, af1);
    }

    protected final GDataRequest a(Object obj, Uri uri)
    {
        return a.g(uri);
    }

    protected final volatile String a(Object obj)
    {
        return (String)obj;
    }

    protected final GDataRequest b(Object obj, Uri uri)
    {
        return a.h(uri);
    }
}
