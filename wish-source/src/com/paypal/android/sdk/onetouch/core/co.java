// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            AuthorizationRequest

final class co extends SimpleDateFormat
{

    co(AuthorizationRequest authorizationrequest)
    {
        super("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    }
}
