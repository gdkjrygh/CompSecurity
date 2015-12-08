// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventMetadata

class SessionMetadataCollector
{

    private final Context context;
    private final IdManager idManager;
    private final String versionCode;
    private final String versionName;

    public SessionMetadataCollector(Context context1, IdManager idmanager, String s, String s1)
    {
        context = context1;
        idManager = idmanager;
        versionCode = s;
        versionName = s1;
    }

    public SessionEventMetadata getMetadata()
    {
        Object obj = idManager.getDeviceIdentifiers();
        String s = context.getPackageName();
        String s1 = idManager.getAppInstallIdentifier();
        String s2 = (String)((Map) (obj)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.ANDROID_ID);
        String s3 = (String)((Map) (obj)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.ANDROID_ADVERTISING_ID);
        Boolean boolean1 = idManager.isLimitAdTrackingEnabled();
        obj = (String)((Map) (obj)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN);
        String s4 = CommonUtils.resolveBuildId(context);
        String s5 = idManager.getOsVersionString();
        String s6 = idManager.getModelName();
        return new SessionEventMetadata(s, UUID.randomUUID().toString(), s1, s2, s3, boolean1, ((String) (obj)), s4, s5, s6, versionCode, versionName);
    }
}
