// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.utils.tessera.tessera30.settings;

import android.util.Log;
import com.wsi.android.framework.settings.helpers.ConfigInfo;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.wsi.android.framework.wxdata.utils.tessera.tessera30.settings:
//            TesseraLayerSettings, TesseraLayerType

public class TesseraLayerSettingsPool
{

    protected String TAG;
    private int nextTesseraLayerSettingsIndex;
    private List tesseraLayerSettingsPool;

    public TesseraLayerSettingsPool(int i)
    {
        TAG = getClass().getSimpleName();
        nextTesseraLayerSettingsIndex = -1;
        if (ConfigInfo.DEBUG)
        {
            Log.d(TAG, (new StringBuilder()).append("TesseraLayerSettingsPool: creating Tessera layer settings pool; size = ").append(i).toString());
        }
        tesseraLayerSettingsPool = new ArrayList(i);
        for (int j = 0; j < i; j++)
        {
            tesseraLayerSettingsPool.add(new TesseraLayerSettings());
        }

    }

    protected TesseraLayerSettings getTesseraLayerSettings()
    {
        this;
        JVM INSTR monitorenter ;
        TesseraLayerSettings tesseralayersettings;
        int i = nextTesseraLayerSettingsIndex + 1;
        nextTesseraLayerSettingsIndex = i;
        if (i == tesseraLayerSettingsPool.size())
        {
            tesseraLayerSettingsPool.add(new TesseraLayerSettings());
            if (ConfigInfo.DEBUG)
            {
                Log.d(TAG, (new StringBuilder()).append("getTesseraLayerSettings: increased Tessera layer settings pool size to ").append(tesseraLayerSettingsPool.size()).toString());
            }
        }
        tesseralayersettings = (TesseraLayerSettings)tesseraLayerSettingsPool.get(nextTesseraLayerSettingsIndex);
        this;
        JVM INSTR monitorexit ;
        return tesseralayersettings;
        Exception exception;
        exception;
        throw exception;
    }

    public TesseraLayerSettings getTesseraLayerSettings(TesseraLayerType tesseralayertype, String s, String s1, int i)
    {
        TesseraLayerSettings tesseralayersettings = getTesseraLayerSettings();
        tesseralayersettings.setType(tesseralayertype);
        tesseralayersettings.setId(s);
        tesseralayersettings.setLabel(s1);
        tesseralayersettings.setMaxZoom(i);
        return tesseralayersettings;
    }

    public void resetNextTesseraLayerSettingsIndex()
    {
        nextTesseraLayerSettingsIndex = -1;
    }
}
