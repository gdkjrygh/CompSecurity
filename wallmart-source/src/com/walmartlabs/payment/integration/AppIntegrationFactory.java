// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.integration;

import android.content.Context;
import com.walmartlabs.utils.WLog;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.walmartlabs.payment.integration:
//            IntegrationLoader, AppIntegration, IntegrationProvider

public class AppIntegrationFactory
{

    private static final String TAG = com/walmartlabs/payment/integration/AppIntegrationFactory.getSimpleName();
    private static final Map sFlyweightMap = new HashMap();

    public AppIntegrationFactory()
    {
    }

    public static AppIntegration create(Context context)
    {
        return createIntegrationFromProvider(IntegrationLoader.get().getIntegrationProviderClass(), context.getApplicationContext());
    }

    public static AppIntegration createIntegrationFromProvider(Class class1, Context context)
    {
        com/walmartlabs/payment/integration/AppIntegrationFactory;
        JVM INSTR monitorenter ;
        if (class1 != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new NullPointerException("providerClass may not be null");
        class1;
        com/walmartlabs/payment/integration/AppIntegrationFactory;
        JVM INSTR monitorexit ;
        throw class1;
        if (!sFlyweightMap.containsKey(class1.getName())) goto _L2; else goto _L1
_L1:
        class1 = (AppIntegration)sFlyweightMap.get(class1.getName());
_L4:
        com/walmartlabs/payment/integration/AppIntegrationFactory;
        JVM INSTR monitorexit ;
        return class1;
_L2:
        context = ((IntegrationProvider)class1.newInstance()).getIntegration(context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        sFlyweightMap.put(class1.getName(), context);
        class1 = context;
        continue; /* Loop/switch isn't completed */
        class1;
        WLog.e(TAG, "Could not create app integration", class1);
        break MISSING_BLOCK_LABEL_119;
        class1;
        WLog.e(TAG, "Could not create app integration", class1);
        class1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
