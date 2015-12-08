// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.integration;

import android.content.Context;
import com.walmartlabs.android.photo.util.PhotoLogger;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.walmartlabs.android.photo.util.integration:
//            IntegrationLoader, AppIntegration, IntegrationProvider

public class AppIntegrationFactory
{

    private static final String TAG = com/walmartlabs/android/photo/util/integration/AppIntegrationFactory.getSimpleName();
    private static Map sFlyweightMap = new HashMap();

    public AppIntegrationFactory()
    {
    }

    public static AppIntegration create(Context context)
    {
        return createIntegrationFromProvider(IntegrationLoader.get().getIntegrationProviderClass(), context.getApplicationContext());
    }

    public static AppIntegration createIntegrationFromProvider(Class class1, Context context)
    {
        com/walmartlabs/android/photo/util/integration/AppIntegrationFactory;
        JVM INSTR monitorenter ;
        Object obj;
        obj = class1;
        if (class1 != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        String s = context.getString(com.walmartlabs.android.photo.R.string.photo_integration_provider_class);
        obj = Class.forName(s);
        class1 = ((Class) (obj));
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Loaded fallback: ").append(((Class) (obj)).getName()).toString());
        class1 = ((Class) (obj));
_L1:
        obj = class1;
        if (class1 != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        throw new IllegalArgumentException("providerClass may not be null");
        class1;
        com/walmartlabs/android/photo/util/integration/AppIntegrationFactory;
        JVM INSTR monitorexit ;
        throw class1;
        obj;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Failed to load fallback integration provider class: ").append(s).toString());
          goto _L1
        if (!sFlyweightMap.containsKey(((Class) (obj)).getName())) goto _L3; else goto _L2
_L2:
        class1 = (AppIntegration)sFlyweightMap.get(((Class) (obj)).getName());
_L5:
        com/walmartlabs/android/photo/util/integration/AppIntegrationFactory;
        JVM INSTR monitorexit ;
        return class1;
_L3:
        class1 = ((IntegrationProvider)((Class) (obj)).newInstance()).getIntegration(context);
        if (class1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        sFlyweightMap.put(((Class) (obj)).getName(), class1);
        continue; /* Loop/switch isn't completed */
        class1;
        class1.printStackTrace();
        break MISSING_BLOCK_LABEL_195;
        class1;
        class1.printStackTrace();
        class1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
