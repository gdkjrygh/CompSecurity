// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.content.Intent;
import java.util.ArrayList;

// Referenced classes of package com.braintreepayments.api:
//            BraintreeBroadcastManager

private static class receivers
{

    final Intent intent;
    final ArrayList receivers;

    I(Intent intent1, ArrayList arraylist)
    {
        intent = intent1;
        receivers = arraylist;
    }
}
