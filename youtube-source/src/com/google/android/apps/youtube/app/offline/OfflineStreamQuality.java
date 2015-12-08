// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.util.SparseArray;
import com.google.android.youtube.p;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            q

public final class OfflineStreamQuality extends Enum
{

    private static final OfflineStreamQuality $VALUES[];
    public static final OfflineStreamQuality AMODO_ONLY;
    public static final OfflineStreamQuality HD;
    public static final OfflineStreamQuality SD;
    private final com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type formatType;
    private final int settingStringId;

    private OfflineStreamQuality(String s, int i, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type, int j)
    {
        super(s, i);
        formatType = type;
        settingStringId = j;
    }

    public static OfflineStreamQuality getOfflineStreamQualityForFormatType(com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type type)
    {
        return (OfflineStreamQuality)q.a().get(type);
    }

    public static OfflineStreamQuality getOfflineStreamQualityForQualityValue(int i)
    {
        return (OfflineStreamQuality)q.b().get(i);
    }

    public static OfflineStreamQuality valueOf(String s)
    {
        return (OfflineStreamQuality)Enum.valueOf(com/google/android/apps/youtube/app/offline/OfflineStreamQuality, s);
    }

    public static OfflineStreamQuality[] values()
    {
        return (OfflineStreamQuality[])$VALUES.clone();
    }

    public final com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type getFormatType()
    {
        return formatType;
    }

    public final int getQualityValue()
    {
        return formatType.getQualityValue();
    }

    public final int getSettingStringId()
    {
        return settingStringId;
    }

    static 
    {
        AMODO_ONLY = new OfflineStreamQuality("AMODO_ONLY", 0, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type.AMODO_ONLY, 0);
        SD = new OfflineStreamQuality("SD", 1, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type.SD, p.du);
        HD = new OfflineStreamQuality("HD", 2, com.google.android.apps.youtube.datalib.innertube.model.Offlineability.Format.Type.HD, p.dv);
        $VALUES = (new OfflineStreamQuality[] {
            AMODO_ONLY, SD, HD
        });
    }

}
