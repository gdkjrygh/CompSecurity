// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.net.Uri;
import bolts.AppLink;
import com.facebook.model.GraphObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookAppLinkResolver, Response, FacebookRequestError

class val.urisToRequest
    implements val.urisToRequest
{

    final FacebookAppLinkResolver this$0;
    final Map val$appLinkResults;
    final bolts.lver val$taskCompletionSource;
    final HashSet val$urisToRequest;

    public void onCompleted(Response response)
    {
        Object obj;
        obj = response.getError();
        if (obj != null)
        {
            val$taskCompletionSource.setError(((FacebookRequestError) (obj)).getException());
            return;
        }
        response = response.getGraphObject();
        if (response != null)
        {
            response = response.getInnerJSONObject();
        } else
        {
            response = null;
        }
        if (response == null)
        {
            val$taskCompletionSource.setResult(val$appLinkResults);
            return;
        }
        obj = val$urisToRequest.iterator();
_L2:
        Uri uri;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        uri = (Uri)((Iterator) (obj)).next();
        if (!response.has(uri.toString()))
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject;
        Object obj1;
        ArrayList arraylist;
        int j;
        jsonobject = response.getJSONObject(uri.toString()).getJSONObject("app_links");
        obj1 = jsonobject.getJSONArray("android");
        j = ((JSONArray) (obj1)).length();
        arraylist = new ArrayList(j);
        JSONException jsonexception;
        bolts.r r;
        for (int i = 0; i >= j; i++)
        {
            break MISSING_BLOCK_LABEL_178;
        }

        r = FacebookAppLinkResolver.access$000(((JSONArray) (obj1)).getJSONObject(i));
        if (r == null)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        arraylist.add(r);
        break MISSING_BLOCK_LABEL_263;
        obj1 = new AppLink(uri, arraylist, FacebookAppLinkResolver.access$100(uri, jsonobject));
        val$appLinkResults.put(uri, obj1);
        synchronized (FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this))
        {
            FacebookAppLinkResolver.access$200(FacebookAppLinkResolver.this).put(uri, obj1);
        }
        continue; /* Loop/switch isn't completed */
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        if (true) goto _L2; else goto _L1
_L1:
        val$taskCompletionSource.setResult(val$appLinkResults);
        return;
    }

    ()
    {
        this$0 = final_facebookapplinkresolver;
        val$taskCompletionSource = lver;
        val$appLinkResults = map;
        val$urisToRequest = HashSet.this;
        super();
    }
}
