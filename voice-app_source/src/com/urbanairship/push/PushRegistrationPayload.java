// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PushRegistrationPayload
{

    public static final String ALIAS_KEY = "alias";
    public static final String GCM_ID_KEY = "gcm_registration_id";
    public static final String TAGS_KEY = "tags";
    private String alias;
    private String gcmRegistrationId;
    private Set tags;

    public PushRegistrationPayload(String s, String s1)
    {
        this(s, s1, (Set)null);
    }

    public PushRegistrationPayload(String s, String s1, Set set)
    {
        alias = s;
        tags = set;
        gcmRegistrationId = s1;
    }

    public JSONObject asJSON()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("alias", alias);
        if (tags != null)
        {
            jsonobject.put("tags", new JSONArray(tags));
        }
        jsonobject.put("gcm_registration_id", gcmRegistrationId);
        return jsonobject;
    }

    public String getAlias()
    {
        return alias;
    }

    public String getGcmRegistrationId()
    {
        return gcmRegistrationId;
    }

    public Set getTags()
    {
        return tags;
    }
}
