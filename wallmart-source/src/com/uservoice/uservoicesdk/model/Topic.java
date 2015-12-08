// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class Topic extends BaseModel
{

    public static Topic ALL_ARTICLES = new Topic() {

            
            {
                name = Session.getInstance().getContext().getString(com.uservoice.uservoicesdk.R.string.uv_all_articles);
            }
    };
    protected String name;
    private int numberOfArticles;

    public Topic()
    {
    }

    public static void loadTopic(int i, Callback callback)
    {
        doGet(apiPath("/topics/%d.json", new Object[] {
            Integer.valueOf(i)
        }), new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "topic", com/uservoice/uservoicesdk/model/Topic));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void loadTopics(Callback callback)
    {
        doGet(apiPath("/topics.json", new Object[0]), new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                Object obj = BaseModel.deserializeList(jsonobject, "topics", com/uservoice/uservoicesdk/model/Topic);
                jsonobject = new ArrayList(((List) (obj)).size());
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Topic topic = (Topic)((Iterator) (obj)).next();
                    if (topic.getNumberOfArticles() > 0)
                    {
                        jsonobject.add(topic);
                    }
                } while (true);
                callback.onModel(jsonobject);
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public String getName()
    {
        return name;
    }

    public int getNumberOfArticles()
    {
        return numberOfArticles;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        name = getString(jsonobject, "name");
        numberOfArticles = jsonobject.getInt("article_count");
    }

    public String toString()
    {
        return name;
    }

}
