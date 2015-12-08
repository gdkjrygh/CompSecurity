// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.applinks;

import android.net.Uri;
import bolts.AppLink;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.applinks:
//            FacebookAppLinkResolver

class val.urisToRequest
    implements com.facebook.solver._cls2
{

    final FacebookAppLinkResolver this$0;
    private final Map val$appLinkResults;
    private final bolts.pLinkResolver val$taskCompletionSource;
    private final HashSet val$urisToRequest;

    public void onCompleted(GraphResponse graphresponse)
    {
        Object obj;
        obj = graphresponse.getError();
        if (obj != null)
        {
            val$taskCompletionSource.setError(((FacebookRequestError) (obj)).getException());
            return;
        }
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse == null)
        {
            val$taskCompletionSource.setResult(val$appLinkResults);
            return;
        }
        obj = val$urisToRequest.iterator();
_L4:
        Uri uri;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                val$taskCompletionSource.setResult(val$appLinkResults);
                return;
            }
            uri = (Uri)((Iterator) (obj)).next();
        } while (!graphresponse.has(uri.toString()));
        JSONObject jsonobject;
        Object obj1;
        ArrayList arraylist;
        int j;
        jsonobject = graphresponse.getJSONObject(uri.toString()).getJSONObject("app_links");
        obj1 = jsonobject.getJSONArray("android");
        j = ((JSONArray) (obj1)).length();
        arraylist = new ArrayList(j);
        int i = 0;
_L2:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj1 = new AppLink(uri, arraylist, FacebookAppLinkResolver.access$1(uri, jsonobject));
        val$appLinkResults.put(uri, obj1);
        synchronized (FacebookAppLinkResolver.access$2(FacebookAppLinkResolver.this))
        {
            FacebookAppLinkResolver.access$2(FacebookAppLinkResolver.this).put(uri, obj1);
        }
        continue; /* Loop/switch isn't completed */
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        bolts.pLinkResolver plinkresolver = FacebookAppLinkResolver.access$0(((JSONArray) (obj1)).getJSONObject(i));
        if (plinkresolver == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        arraylist.add(plinkresolver);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        JSONException jsonexception;
        jsonexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = final_facebookapplinkresolver;
        val$taskCompletionSource = plinkresolver;
        val$appLinkResults = map;
        val$urisToRequest = HashSet.this;
        super();
    }
}
