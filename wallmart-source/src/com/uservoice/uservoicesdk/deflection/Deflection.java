// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.deflection;

import android.util.Log;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestMethod;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class Deflection
{

    private static int interactionIdentifier = Integer.parseInt(String.valueOf((new Date()).getTime()).substring(4));
    private static String searchText;

    public Deflection()
    {
    }

    private static Map deflectionParams()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("uvts", Babayaga.getUvts());
        hashmap.put("channel", "android");
        hashmap.put("search_term", searchText);
        hashmap.put("interaction_identifier", String.valueOf(interactionIdentifier));
        return hashmap;
    }

    private static RestTaskCallback getCallback()
    {
        return new RestTaskCallback(null) {

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                Log.d("UV", jsonobject.toString());
            }

            public void onError(RestResult restresult)
            {
                Log.e("UV", (new StringBuilder()).append("Failed sending deflection: ").append(restresult.getMessage()).toString());
            }

        };
    }

    public static void setSearchText(String s)
    {
        if (s.equals(searchText))
        {
            return;
        } else
        {
            searchText = s;
            interactionIdentifier++;
            return;
        }
    }

    public static void trackDeflection(String s, BaseModel basemodel)
    {
        Map map = deflectionParams();
        map.put("kind", s);
        map.put("deflector_id", String.valueOf(basemodel.getId()));
        if (basemodel instanceof Article)
        {
            s = "Faq";
        } else
        {
            s = "Suggestion";
        }
        map.put("deflector_type", s);
        (new RestTask(RestMethod.GET, "/clients/omnibox/deflections/upsert.json", map, getCallback())).execute(new String[0]);
    }

    public static void trackSearchDeflection(List list)
    {
        Object obj = deflectionParams();
        ((Map) (obj)).put("kind", "list");
        obj = RestTask.paramsToList(((Map) (obj)));
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            BaseModel basemodel = (BaseModel)list.next();
            if (basemodel instanceof Suggestion)
            {
                ((List) (obj)).add(new BasicNameValuePair("suggestion_ids[]", String.valueOf(basemodel.getId())));
            } else
            if (basemodel instanceof Article)
            {
                ((List) (obj)).add(new BasicNameValuePair("faq_ids[]", String.valueOf(basemodel.getId())));
            }
        } while (true);
        (new RestTask(RestMethod.GET, "/clients/omnibox/deflections/list_view.json", ((List) (obj)), getCallback())).execute(new String[0]);
    }

}
