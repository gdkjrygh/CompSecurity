// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.android.adm;

import java.util.HashMap;
import java.util.Map;

public final class BuildConfig
{

    public static final int ADM_CLIENT_VERSION = 177;
    public static final String APPLICATION_ID = "com.amazon.android.adm";
    public static final String BUILD_TYPE = "release";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final Map REQUIRED_PACKAGE_VERSIONS = new HashMap() {

            
            {
                put("com.amazon.device.messaging", Integer.valueOf(0x1f651c));
                put("com.amazon.device.messaging.sdk.library", Integer.valueOf(0x1fa84c));
                put("com.amazon.application.compatibility.enforcer.sdk.library", Integer.valueOf(19000));
            }
    };
    public static final int VERSION_CODE = -1;
    public static final String VERSION_NAME = "";

    public BuildConfig()
    {
    }

}
