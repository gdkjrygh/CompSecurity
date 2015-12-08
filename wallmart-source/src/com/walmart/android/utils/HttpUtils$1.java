// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.walmart.android.utils:
//            HttpUtils

static final class  extends ThreadLocal
{

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected SimpleDateFormat initialValue()
    {
        return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    }

    ()
    {
    }
}
