// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.cookie;

import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.cookie:
//            DateUtils

static final class  extends ThreadLocal
{

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected SoftReference initialValue()
    {
        return new SoftReference(new HashMap());
    }

    ()
    {
    }
}
