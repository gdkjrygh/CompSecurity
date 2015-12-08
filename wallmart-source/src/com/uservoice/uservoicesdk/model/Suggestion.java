// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel, Category, Forum, ClientConfig, 
//            Comment

public class Suggestion extends BaseModel
{

    private String adminResponseAvatarUrl;
    private Date adminResponseCreatedAt;
    private String adminResponseText;
    private String adminResponseUserName;
    private Category category;
    private Date createdAt;
    private String creatorName;
    private int forumId;
    private String forumName;
    private int numberOfComments;
    private int numberOfSubscribers;
    private String status;
    private String statusColor;
    private boolean subscribed;
    private String text;
    private String title;

    public Suggestion()
    {
    }

    public static void createSuggestion(Forum forum, Category category1, String s, String s1, int i, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("suggestion[votes]", String.valueOf(i));
        hashmap.put("suggestion[title]", s);
        hashmap.put("suggestion[text]", s1);
        if (category1 != null)
        {
            hashmap.put("suggestion[category_id]", String.valueOf(category1.getId()));
        }
        doPost(apiPath("/forums/%d/suggestions.json", new Object[] {
            Integer.valueOf(forum.getId())
        }), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "suggestion", com/uservoice/uservoicesdk/model/Suggestion));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void loadSuggestions(Forum forum, int i, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page", String.valueOf(i));
        hashmap.put("per_page", "20");
        hashmap.put("filter", "public");
        hashmap.put("sort", getClientConfig().getSuggestionSort());
        doGet(apiPath("/forums/%d/suggestions.json", new Object[] {
            Integer.valueOf(forum.getId())
        }), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeList(jsonobject, "suggestions", com/uservoice/uservoicesdk/model/Suggestion));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static RestTask searchSuggestions(Forum forum, String s, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("query", s);
        return doGet(apiPath("/forums/%d/suggestions/search.json", new Object[] {
            Integer.valueOf(forum.getId())
        }), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeList(jsonobject, "suggestions", com/uservoice/uservoicesdk/model/Suggestion));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public void commentPosted(Comment comment)
    {
        numberOfComments = numberOfComments + 1;
    }

    public String getAdminResponseAvatarUrl()
    {
        return adminResponseAvatarUrl;
    }

    public Date getAdminResponseCreatedAt()
    {
        return adminResponseCreatedAt;
    }

    public String getAdminResponseText()
    {
        return adminResponseText;
    }

    public String getAdminResponseUserName()
    {
        return adminResponseUserName;
    }

    public Category getCategory()
    {
        return category;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getCreatorName()
    {
        return creatorName;
    }

    public int getForumId()
    {
        return forumId;
    }

    public String getForumName()
    {
        return forumName;
    }

    public int getNumberOfComments()
    {
        return numberOfComments;
    }

    public int getNumberOfSubscribers()
    {
        return numberOfSubscribers;
    }

    public String getStatus()
    {
        return status;
    }

    public String getStatusColor()
    {
        return statusColor;
    }

    public String getText()
    {
        return text;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isSubscribed()
    {
        return subscribed;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        title = getString(jsonobject, "title");
        text = getString(jsonobject, "formatted_text");
        createdAt = getDate(jsonobject, "created_at");
        forumId = jsonobject.getJSONObject("topic").getJSONObject("forum").getInt("id");
        forumName = jsonobject.getJSONObject("topic").getJSONObject("forum").getString("name");
        boolean flag;
        if (jsonobject.has("subscribed") && jsonobject.getBoolean("subscribed"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        subscribed = flag;
        if (!jsonobject.isNull("category"))
        {
            category = (Category)deserializeObject(jsonobject, "category", com/uservoice/uservoicesdk/model/Category);
        }
        numberOfComments = jsonobject.getInt("comments_count");
        numberOfSubscribers = jsonobject.getInt("subscriber_count");
        if (!jsonobject.isNull("creator"))
        {
            creatorName = getString(jsonobject.getJSONObject("creator"), "name");
        }
        if (!jsonobject.isNull("status"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("status");
            status = getString(jsonobject1, "name");
            statusColor = getString(jsonobject1, "hex_color");
        }
        if (!jsonobject.isNull("response"))
        {
            jsonobject = jsonobject.getJSONObject("response");
            adminResponseText = getString(jsonobject, "formatted_text");
            adminResponseCreatedAt = getDate(jsonobject, "created_at");
            jsonobject = jsonobject.getJSONObject("creator");
            adminResponseUserName = getString(jsonobject, "name");
            adminResponseAvatarUrl = getString(jsonobject, "avatar_url");
        }
    }

    public void subscribe(final Callback final_callback1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("subscribe", "true");
        doPost(apiPath("/forums/%d/suggestions/%d/watch.json", new Object[] {
            Integer.valueOf(forumId), Integer.valueOf(id)
        }), hashmap, new RestTaskCallback(final_callback1) {

            final Suggestion this$0;
            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VOTE_IDEA, getId());
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.SUBSCRIBE_IDEA, getId());
                load(jsonobject.getJSONObject("suggestion"));
                callback.onModel(Suggestion.this);
            }

            
            {
                this$0 = Suggestion.this;
                callback = callback2;
                super(final_callback1);
            }
        });
    }

    public void unsubscribe(final Callback final_callback1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("subscribe", "false");
        doPost(apiPath("/forums/%d/suggestions/%d/watch.json", new Object[] {
            Integer.valueOf(forumId), Integer.valueOf(id)
        }), hashmap, new RestTaskCallback(final_callback1) {

            final Suggestion this$0;
            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                load(jsonobject.getJSONObject("suggestion"));
                callback.onModel(Suggestion.this);
            }

            
            {
                this$0 = Suggestion.this;
                callback = callback2;
                super(final_callback1);
            }
        });
    }
}
