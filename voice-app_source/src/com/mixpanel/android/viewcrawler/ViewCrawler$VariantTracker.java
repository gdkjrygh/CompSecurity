// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.mixpanel.android.mpmetrics.SuperPropertyUpdate;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewCrawler

private static class mMixpanel
{

    private final MixpanelAPI mMixpanel;

    public void trackVariants(Set set)
    {
        final JSONObject variantObject;
        if (set.size() == 0)
        {
            return;
        }
        variantObject = new JSONObject();
        set = set.iterator();
_L3:
        boolean flag = set.hasNext();
        if (flag) goto _L2; else goto _L1
_L1:
        mMixpanel.getPeople().mMixpanel("$experiments", variantObject);
        mMixpanel.updateSuperProperties(new SuperPropertyUpdate() {

            final ViewCrawler.VariantTracker this$1;
            private final JSONObject val$variantObject;

            public JSONObject update(JSONObject jsonobject)
            {
                try
                {
                    jsonobject.put("$experiments", variantObject);
                }
                catch (JSONException jsonexception)
                {
                    Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception);
                    return jsonobject;
                }
                return jsonobject;
            }

            
            {
                this$1 = ViewCrawler.VariantTracker.this;
                variantObject = jsonobject;
                super();
            }
        });
        return;
_L2:
        Object obj = (Pair)set.next();
        int i = ((Integer)((Pair) (obj)).first).intValue();
        int j = ((Integer)((Pair) (obj)).second).intValue();
        obj = new JSONObject();
        ((JSONObject) (obj)).put("$experiment_id", i);
        ((JSONObject) (obj)).put("$variant_id", j);
        mMixpanel.track("$experiment_started", ((JSONObject) (obj)));
        variantObject.put(Integer.toString(i), j);
          goto _L3
        set;
        Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", set);
          goto _L1
    }

    public _cls1.val.variantObject(MixpanelAPI mixpanelapi)
    {
        mMixpanel = mixpanelapi;
    }
}
