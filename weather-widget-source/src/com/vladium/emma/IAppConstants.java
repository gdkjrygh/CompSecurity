// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.app.IAppVersion;
import com.vladium.jcd.lib.Types;

public interface IAppConstants
    extends IAppVersion
{

    public static final String APP_COPYRIGHT = "(C) Vladimir Roubtsov";
    public static final String APP_NAME = "EMMA";
    public static final String APP_NAME_LC = "emma";
    public static final String APP_PACKAGE = Types.getClassPackageName(com/vladium/emma/IAppConstants);
    public static final String APP_THROWABLE_BUILD_ID = "[EMMA v0.0.0 (unsupported private build)]";
    public static final String APP_USAGE_BUILD_ID = "[EMMA v0.0, build 0 (unsupported private build)]";
    public static final String APP_USAGE_PREFIX = "EMMA usage: ";
    public static final String APP_VERBOSE_BUILD_ID = "[EMMA v0.0, build 0 (unsupported private build) (unknown)]";
    public static final long DATA_FORMAT_VERSION = 32L;

}
