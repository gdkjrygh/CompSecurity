// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, GraphResponse, LoggingBehavior

class llback
    implements llback
{

    final GraphRequest this$0;
    private final llback val$callback;

    public void onCompleted(GraphResponse graphresponse)
    {
        JSONArray jsonarray;
        int i;
        JSONObject jsonobject = graphresponse.getJSONObject();
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optJSONObject("__debug__");
        } else
        {
            jsonobject = null;
        }
        if (jsonobject != null)
        {
            jsonarray = jsonobject.optJSONArray("messages");
        } else
        {
            jsonarray = null;
        }
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L5:
        if (i < jsonarray.length()) goto _L3; else goto _L2
_L2:
        if (val$callback != null)
        {
            val$callback.onCompleted(graphresponse);
        }
        return;
_L3:
        Object obj = jsonarray.optJSONObject(i);
        String s;
        String s1;
        if (obj != null)
        {
            s = ((JSONObject) (obj)).optString("message");
        } else
        {
            s = null;
        }
        if (obj != null)
        {
            s1 = ((JSONObject) (obj)).optString("type");
        } else
        {
            s1 = null;
        }
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).optString("link");
        } else
        {
            obj = null;
        }
        if (s != null && s1 != null)
        {
            LoggingBehavior loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
            if (s1.equals("warning"))
            {
                loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
            }
            s1 = s;
            if (!Utility.isNullOrEmpty(((String) (obj))))
            {
                s1 = (new StringBuilder(String.valueOf(s))).append(" Link: ").append(((String) (obj))).toString();
            }
            Logger.log(loggingbehavior, GraphRequest.TAG, s1);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    llback()
    {
        this$0 = final_graphrequest;
        val$callback = llback.this;
        super();
    }
}
