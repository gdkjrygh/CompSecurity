// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsData

public interface SettingsJsonTransform
{

    public abstract SettingsData buildFromJson(CurrentTimeProvider currenttimeprovider, JSONObject jsonobject)
        throws JSONException;

    public abstract JSONObject toJson(SettingsData settingsdata)
        throws JSONException;
}
