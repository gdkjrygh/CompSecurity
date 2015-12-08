// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;

// Referenced classes of package com.adobe.mobile:
//            ReferrerHandler, Lifecycle

static final class val.referrerFields
    implements Runnable
{

    final HashMap val$referrerFields;

    public void run()
    {
        Lifecycle.addReferralDataToSavedLifecycle(val$referrerFields);
    }

    (HashMap hashmap)
    {
        val$referrerFields = hashmap;
        super();
    }
}
