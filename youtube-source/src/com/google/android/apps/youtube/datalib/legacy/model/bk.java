// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.legacy.a.a;
import com.google.android.apps.youtube.datalib.legacy.a.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            VmapAdBreak, VastAd, TrackingPingAuthenticationSettings

public final class bk extends b
{

    private VmapAdBreak a;

    public bk()
    {
    }

    public bk(VmapAdBreak vmapadbreak)
    {
        a = vmapadbreak;
    }

    public final int a()
    {
        return 1;
    }

    protected final a a(JSONObject jsonobject, int i)
    {
        if (i != 1)
        {
            throw new JSONException("Unsupported version");
        } else
        {
            return new VmapAdBreak((VmapAdBreak.OffsetType)a(jsonobject, "offsetType", com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak$OffsetType), jsonobject.getInt("offsetValue"), jsonobject.getBoolean("isLinearAdAllowed"), jsonobject.getBoolean("isNonlinearAdAllowed"), jsonobject.getBoolean("isDisplayAdAllowed"), a(jsonobject, "adBreakId"), a(jsonobject, "originalVideoId"), b(jsonobject, "ads", com/google/android/apps/youtube/datalib/legacy/model/VastAd), d(jsonobject, "startEvents"), d(jsonobject, "endEvents"), d(jsonobject, "errorEvents"), (TrackingPingAuthenticationSettings)b(jsonobject, "trackingDecoration"), jsonobject.getBoolean("isForOffline"), null);
        }
    }

    protected final void a(JSONObject jsonobject)
    {
        a(jsonobject, "offsetType", ((Enum) (a.getOffsetType())));
        jsonobject.put("offsetValue", a.getOffsetValue());
        jsonobject.put("isLinearAdAllowed", a.isLinearAdAllowed());
        jsonobject.put("isNonlinearAdAllowed", a.isNonlinearAdAllowed());
        jsonobject.put("isDisplayAdAllowed", a.isDisplayAdAllowed());
        a(jsonobject, "adBreakId", a.getAdBreakId());
        a(jsonobject, "originalVideoId", a.getOriginalVideoId());
        a(jsonobject, "ads", a.getAds());
        b(jsonobject, "startEvents", a.getBreakStartPingUris());
        b(jsonobject, "endEvents", a.getBreakEndPingUris());
        b(jsonobject, "errorEvents", a.getErrorPingUris());
        a(jsonobject, "trackingDecoration", ((a) (a.getTrackingDecoration())));
        jsonobject.put("isForOffline", a.isForOffline());
    }
}
