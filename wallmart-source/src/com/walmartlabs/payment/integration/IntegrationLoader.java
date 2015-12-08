// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.integration;

import com.walmartlabs.utils.WLog;

public class IntegrationLoader
{

    private static final String TAG = com/walmartlabs/payment/integration/IntegrationLoader.getSimpleName();
    private static IntegrationLoader sInstance;
    private Class mIntegrationProviderClass;

    private IntegrationLoader()
    {
    }

    public static IntegrationLoader get()
    {
        com/walmartlabs/payment/integration/IntegrationLoader;
        JVM INSTR monitorenter ;
        IntegrationLoader integrationloader;
        if (sInstance == null)
        {
            sInstance = new IntegrationLoader();
        }
        integrationloader = sInstance;
        com/walmartlabs/payment/integration/IntegrationLoader;
        JVM INSTR monitorexit ;
        return integrationloader;
        Exception exception;
        exception;
        throw exception;
    }

    public Class getIntegrationProviderClass()
    {
        return mIntegrationProviderClass;
    }

    public void setIntegrationProviderClass(Class class1)
    {
        mIntegrationProviderClass = class1;
        WLog.d(TAG, (new StringBuilder()).append("Loaded integration provider class: ").append(mIntegrationProviderClass.getName()).toString());
    }

    public void setIntegrationProviderClass(String s)
    {
        try
        {
            setIntegrationProviderClass(Class.forName(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

}
