// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.OCREventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            OCRResults

public class OCRAppStatsClient extends AppStatsClient
{

    private static final String a = "OCRClient";
    private OCREventDao b;

    public OCRAppStatsClient(AppStatsInstanceType appstatsinstancetype)
    {
        b = null;
    }

    public OCRAppStatsClient(String s, AppStatsInstanceType appstatsinstancetype, boolean flag)
    {
        b = null;
    }

    private void a(OCRResults ocrresults)
    {
        ArrayList arraylist = new ArrayList();
        Log.e("OCRClient", "STEP2::APPSTATS::END OCR ");
        if (b == null)
        {
            throw new NullPointerException("OCREventDao property is null");
        } else
        {
            b = b.clone();
            b.setStopTime(System.currentTimeMillis());
            b.setResultCode(ocrresults.getResultCode());
            b.setEventType(ocrresults.getEventType());
            b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
            arraylist.add(b);
            logAppStats((AppStatsDao[])arraylist.toArray(new AppStatsDao[arraylist.size()]));
            Log.i("OCRClient", (new StringBuilder()).append("OCR STOP = StopTime = ").append(b.getStopTime()).append(" RC = ").append(b.getResultCode()).append(" eventType = ").append(b.getEventType()).toString());
            b = null;
            return;
        }
    }

    private void a(String s)
    {
        Log.e("OCRClient", "STEP1::APPSTATS::START OCR ");
        b = new OCREventDao();
        b.setInstanceId(instanceId);
        b.setStartTime(asFriend.currentEventTime());
        b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        b.setImageID(s);
        b.setSessionKey(b.getAppStatsSessionKey());
        Log.i("OCRClient", (new StringBuilder()).append("OCR START = InstanceID = ").append(b.getInstanceId()).append(" SK = ").append(b.getAppStatsSessionKey()).append(" startTime = ").append(b.getStartTime()).append(" ImageID = ").append(s).toString());
        logAppStats(new AppStatsDao[] {
            b
        });
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, OCRResults ocrresults)
    {
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, String s)
    {
    }
}
