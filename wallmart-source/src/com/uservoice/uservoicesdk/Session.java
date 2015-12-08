// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.Comment;
import com.uservoice.uservoicesdk.model.CustomField;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

// Referenced classes of package com.uservoice.uservoicesdk:
//            Config

public class Session
{

    private static Session instance;
    private AccessToken accessToken;
    private Article article;
    private List articles;
    private ClientConfig clientConfig;
    private Comment comment;
    private Config config;
    private Context context;
    private CustomField customField;
    private Map externalIds;
    private Forum forum;
    private OAuthConsumer oauthConsumer;
    private RequestToken requestToken;
    private Runnable signinListener;
    private Suggestion suggestion;
    private Topic topic;
    private List topics;
    private User user;

    private Session()
    {
        externalIds = new HashMap();
    }

    public static Session getInstance()
    {
        if (instance == null)
        {
            instance = new Session();
        }
        return instance;
    }

    public static void reset()
    {
        instance = null;
    }

    public AccessToken getAccessToken()
    {
        return accessToken;
    }

    public Article getArticle()
    {
        return article;
    }

    public List getArticles()
    {
        return articles;
    }

    public ClientConfig getClientConfig()
    {
        return clientConfig;
    }

    public Comment getComment()
    {
        return comment;
    }

    public Config getConfig()
    {
        return config;
    }

    public Context getContext()
    {
        return context;
    }

    public CustomField getCustomField()
    {
        return customField;
    }

    public String getEmail()
    {
        if (user != null)
        {
            return user.getEmail();
        } else
        {
            return null;
        }
    }

    public Map getExternalIds()
    {
        return externalIds;
    }

    public Forum getForum()
    {
        return forum;
    }

    public String getName()
    {
        if (user != null)
        {
            return user.getName();
        } else
        {
            return null;
        }
    }

    public OAuthConsumer getOAuthConsumer()
    {
        if (oauthConsumer != null) goto _L2; else goto _L1
_L1:
        if (config.getKey() == null) goto _L4; else goto _L3
_L3:
        oauthConsumer = new CommonsHttpOAuthConsumer(config.getKey(), config.getSecret());
_L2:
        return oauthConsumer;
_L4:
        if (clientConfig != null)
        {
            oauthConsumer = new CommonsHttpOAuthConsumer(clientConfig.getKey(), clientConfig.getSecret());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public RequestToken getRequestToken()
    {
        return requestToken;
    }

    public SharedPreferences getSharedPreferences()
    {
        return context.getSharedPreferences((new StringBuilder()).append("uv_").append(config.getSite().replaceAll("\\W", "_")).toString(), 0);
    }

    public Suggestion getSuggestion()
    {
        return suggestion;
    }

    public Topic getTopic()
    {
        return topic;
    }

    public List getTopics()
    {
        return topics;
    }

    public User getUser()
    {
        return user;
    }

    public void setAccessToken(Context context1, AccessToken accesstoken)
    {
        accessToken = accesstoken;
        accesstoken.persist(getSharedPreferences(), "access_token", "access_token");
        if (signinListener != null)
        {
            signinListener.run();
        }
    }

    public void setAccessToken(AccessToken accesstoken)
    {
        accessToken = accesstoken;
    }

    public void setArticle(Article article1)
    {
        article = article1;
    }

    public void setArticles(List list)
    {
        articles = list;
    }

    public void setClientConfig(ClientConfig clientconfig)
    {
        clientConfig = clientconfig;
        Babayaga.flush();
    }

    public void setComment(Comment comment1)
    {
        comment = comment1;
    }

    public void setConfig(Config config1)
    {
        config = config1;
        if (config1.getEmail() == null)
        {
            getSharedPreferences().edit().remove("access_token").apply();
        }
    }

    public void setContext(Context context1)
    {
        context = context1;
    }

    public void setCustomField(CustomField customfield)
    {
        customField = customfield;
    }

    public void setExternalId(String s, String s1)
    {
        externalIds.put(s, s1);
    }

    public void setForum(Forum forum1)
    {
        forum = forum1;
    }

    public void setRequestToken(RequestToken requesttoken)
    {
        requestToken = requesttoken;
    }

    public void setSignInListener(Runnable runnable)
    {
        signinListener = runnable;
    }

    public void setSuggestion(Suggestion suggestion1)
    {
        suggestion = suggestion1;
    }

    public void setTopic(Topic topic1)
    {
        topic = topic1;
    }

    public void setTopics(List list)
    {
        topics = list;
    }

    public void setUser(User user1)
    {
        user = user1;
    }
}
