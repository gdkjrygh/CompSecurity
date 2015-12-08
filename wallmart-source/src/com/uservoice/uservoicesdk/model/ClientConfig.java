// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.content.SharedPreferences;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel, CustomField

public class ClientConfig extends BaseModel
{

    private String accountName;
    private List customFields;
    private int defaultForumId;
    private String defaultSort;
    private boolean feedbackEnabled;
    private String key;
    private String secret;
    private String subdomainId;
    private boolean ticketsEnabled;
    private boolean whiteLabel;

    public ClientConfig()
    {
    }

    public static void loadClientConfig(Callback callback)
    {
        String s;
        String s1;
        SharedPreferences sharedpreferences;
        ClientConfig clientconfig;
        if (Session.getInstance().getConfig().getKey() == null)
        {
            s = "/clients/default.json";
        } else
        {
            s = "/client.json";
        }
        s1 = String.format("uv-client-%s-%s", new Object[] {
            Session.getInstance().getConfig().getSite(), Session.getInstance().getConfig().getKey()
        });
        sharedpreferences = Session.getInstance().getSharedPreferences();
        clientconfig = (ClientConfig)load(sharedpreferences, s1, "client", com/uservoice/uservoicesdk/model/ClientConfig);
        if (clientconfig != null)
        {
            callback.onModel(clientconfig);
            doGet(apiPath(s, new Object[0]), new RestTaskCallback(callback, sharedpreferences, s1) {

                final String val$cacheKey;
                final SharedPreferences val$prefs;

                public void onComplete(JSONObject jsonobject)
                    throws JSONException
                {
                    ((ClientConfig)BaseModel.deserializeObject(jsonobject, "client", com/uservoice/uservoicesdk/model/ClientConfig)).persist(prefs, cacheKey, "client");
                }

            
            {
                prefs = sharedpreferences;
                cacheKey = s;
                super(callback);
            }
            });
            return;
        } else
        {
            doGet(apiPath(s, new Object[0]), new RestTaskCallback(callback, sharedpreferences, s1, callback) {

                final String val$cacheKey;
                final Callback val$callback;
                final SharedPreferences val$prefs;

                public void onComplete(JSONObject jsonobject)
                    throws JSONException
                {
                    jsonobject = (ClientConfig)BaseModel.deserializeObject(jsonobject, "client", com/uservoice/uservoicesdk/model/ClientConfig);
                    jsonobject.persist(prefs, cacheKey, "client");
                    callback.onModel(jsonobject);
                }

            
            {
                prefs = sharedpreferences;
                cacheKey = s;
                callback = callback2;
                super(callback1);
            }
            });
            return;
        }
    }

    public String getAccountName()
    {
        return accountName;
    }

    public List getCustomFields()
    {
        return customFields;
    }

    public int getDefaultForumId()
    {
        return defaultForumId;
    }

    public String getKey()
    {
        return key;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getSubdomainId()
    {
        return subdomainId;
    }

    public String getSuggestionSort()
    {
        if (defaultSort.equals("new"))
        {
            return "newest";
        }
        if (defaultSort.equals("hot"))
        {
            return "hot";
        } else
        {
            return "votes";
        }
    }

    public boolean isFeedbackEnabled()
    {
        return feedbackEnabled;
    }

    public boolean isTicketSystemEnabled()
    {
        return ticketsEnabled;
    }

    public boolean isWhiteLabel()
    {
        return whiteLabel;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        ticketsEnabled = jsonobject.getBoolean("tickets_enabled");
        feedbackEnabled = jsonobject.getBoolean("feedback_enabled");
        whiteLabel = jsonobject.getBoolean("white_label");
        defaultForumId = jsonobject.getJSONObject("forum").getInt("id");
        customFields = deserializeList(jsonobject, "custom_fields", com/uservoice/uservoicesdk/model/CustomField);
        defaultSort = getString(jsonobject.getJSONObject("subdomain"), "default_sort");
        subdomainId = getString(jsonobject.getJSONObject("subdomain"), "id");
        accountName = getString(jsonobject.getJSONObject("subdomain"), "name");
        key = jsonobject.getString("key");
        if (jsonobject.has("secret"))
        {
            jsonobject = jsonobject.getString("secret");
        } else
        {
            jsonobject = null;
        }
        secret = jsonobject;
    }

    public void save(JSONObject jsonobject)
        throws JSONException
    {
        super.save(jsonobject);
        jsonobject.put("tickets_enabled", ticketsEnabled);
        jsonobject.put("feedback_enabled", feedbackEnabled);
        jsonobject.put("white_label", whiteLabel);
        Object obj = new JSONObject();
        ((JSONObject) (obj)).put("id", defaultForumId);
        jsonobject.put("forum", obj);
        obj = new JSONArray();
        JSONObject jsonobject1;
        for (Iterator iterator = customFields.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(jsonobject1))
        {
            CustomField customfield = (CustomField)iterator.next();
            jsonobject1 = new JSONObject();
            customfield.save(jsonobject1);
        }

        jsonobject.put("custom_fields", obj);
        obj = new JSONObject();
        ((JSONObject) (obj)).put("id", subdomainId);
        ((JSONObject) (obj)).put("default_sort", defaultSort);
        ((JSONObject) (obj)).put("name", accountName);
        jsonobject.put("subdomain", obj);
        jsonobject.put("key", key);
        if (secret != null)
        {
            jsonobject.put("secret", secret);
        }
    }
}
