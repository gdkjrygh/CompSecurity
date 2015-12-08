// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsRequest

public interface SettingsSpiCall
{

    public abstract JSONObject invoke(SettingsRequest settingsrequest);
}
