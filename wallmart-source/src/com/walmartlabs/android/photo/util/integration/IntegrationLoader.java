// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.integration;

import com.walmartlabs.android.photo.util.PhotoLogger;

public class IntegrationLoader
{

    private static final String TAG = com/walmartlabs/android/photo/util/integration/IntegrationLoader.getSimpleName();
    private static IntegrationLoader sInstance;
    private Class mIntegrationProviderClass;

    private IntegrationLoader()
    {
    }

    public static IntegrationLoader get()
    {
        com/walmartlabs/android/photo/util/integration/IntegrationLoader;
        JVM INSTR monitorenter ;
        IntegrationLoader integrationloader;
        if (sInstance == null)
        {
            sInstance = new IntegrationLoader();
        }
        integrationloader = sInstance;
        com/walmartlabs/android/photo/util/integration/IntegrationLoader;
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

    public void setIntegrationProviderClass(String s)
    {
        try
        {
            mIntegrationProviderClass = Class.forName(s);
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Loaded integration provider class: ").append(mIntegrationProviderClass.getName()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

}
