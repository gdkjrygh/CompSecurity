// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel, Suggestion

public class Comment extends BaseModel
{

    private String avatarUrl;
    private Date createdAt;
    private String text;
    private String userName;

    public Comment()
    {
    }

    public static void createComment(Suggestion suggestion, String s, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("comment[text]", s);
        doPost(apiPath("/forums/%d/suggestions/%d/comments.json", new Object[] {
            Integer.valueOf(suggestion.getForumId()), Integer.valueOf(suggestion.getId())
        }), hashmap, new RestTaskCallback(callback, suggestion, callback) {

            final Callback val$callback;
            final Suggestion val$suggestion;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.COMMENT_IDEA, suggestion.getId());
                callback.onModel(BaseModel.deserializeObject(jsonobject, "comment", com/uservoice/uservoicesdk/model/Comment));
            }

            
            {
                suggestion = suggestion1;
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void loadComments(Suggestion suggestion, int i, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("page", String.valueOf(i));
        doGet(apiPath("/forums/%d/suggestions/%d/comments.json", new Object[] {
            Integer.valueOf(suggestion.getForumId()), Integer.valueOf(suggestion.getId())
        }), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeList(jsonobject, "comments", com/uservoice/uservoicesdk/model/Comment));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public String getAvatarUrl()
    {
        return avatarUrl;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getText()
    {
        return text;
    }

    public String getUserName()
    {
        return userName;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        text = getString(jsonobject, "formatted_text");
        JSONObject jsonobject1 = jsonobject.getJSONObject("creator");
        userName = getString(jsonobject1, "name");
        avatarUrl = getString(jsonobject1, "avatar_url");
        createdAt = getDate(jsonobject, "created_at");
    }
}
