// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class Article extends BaseModel
{

    private String html;
    private String title;
    private String topicName;

    public Article()
    {
    }

    public static void loadAll(Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("sort", "ordered");
        doGet(apiPath("/articles.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeList(jsonobject, "articles", com/uservoice/uservoicesdk/model/Article));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void loadForTopic(int i, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("sort", "ordered");
        doGet(apiPath("/topics/%d/articles.json", new Object[] {
            Integer.valueOf(i)
        }), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeList(jsonobject, "articles", com/uservoice/uservoicesdk/model/Article));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static RestTask loadInstantAnswers(String s, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("per_page", "3");
        hashmap.put("forum_id", String.valueOf(getConfig().getForumId()));
        hashmap.put("query", s);
        if (getConfig().getTopicId() != -1)
        {
            hashmap.put("topic_id", String.valueOf(getConfig().getTopicId()));
        }
        return doGet(apiPath("/instant_answers/search.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeHeterogenousList(jsonobject, "instant_answers"));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public String getHtml()
    {
        return html;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        title = getString(jsonobject, "question");
        html = getHtml(jsonobject, "answer_html");
        if (!jsonobject.isNull("topic"))
        {
            topicName = jsonobject.getJSONObject("topic").getString("name");
        }
    }
}
