// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.util.Log;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import java.util.HashMap;
import java.util.Map;
import org.a.a.a.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            QuickAnalysisFeedback

public class OPERATION
{

    final QuickAnalysisFeedback this$0;

    public String getMetadata()
    {
        return QuickAnalysisFeedback.access$200(QuickAnalysisFeedback.this);
    }

    public void setMetadata(String s)
    {
        Log.i(QuickAnalysisFeedback.access$000(QuickAnalysisFeedback.this), (new StringBuilder()).append("metadata from EVRS = ").append(s).toString());
        QuickAnalysisFeedback.access$100(QuickAnalysisFeedback.this);
        QuickAnalysisFeedback.access$202(QuickAnalysisFeedback.this, s);
        if (QuickAnalysisFeedback.access$200(QuickAnalysisFeedback.this) == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        s = new JSONObject(s);
        if (QuickAnalysisFeedback.access$300(QuickAnalysisFeedback.this) != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        QuickAnalysisFeedback.access$302(QuickAnalysisFeedback.this, new HashMap());
_L2:
        QuickAnalysisFeedback.access$400(QuickAnalysisFeedback.this, s, QuickAnalysisFeedback.access$300(QuickAnalysisFeedback.this));
        QuickAnalysisFeedback.access$500(QuickAnalysisFeedback.this, QuickAnalysisFeedback.access$300(QuickAnalysisFeedback.this));
        return;
        QuickAnalysisFeedback.access$300(QuickAnalysisFeedback.this).clear();
        if (true) goto _L2; else goto _L1
_L1:
        s;
        Log.e(QuickAnalysisFeedback.access$000(QuickAnalysisFeedback.this), "Exception:: ");
        s.printStackTrace();
    }

    public void setViewBoundariesImage(Bitmap bitmap)
    {
        QuickAnalysisFeedback.access$602(QuickAnalysisFeedback.this, bitmap);
    }

    public (String s)
    {
        this$0 = QuickAnalysisFeedback.this;
        super();
        if (!b.c(s, "com.kofax"))
        {
            throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        } else
        {
            return;
        }
    }
}
