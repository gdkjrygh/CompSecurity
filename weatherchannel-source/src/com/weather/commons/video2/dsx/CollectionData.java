// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.google.common.base.Preconditions;
import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.video2.dsx:
//            VideoValidation

class CollectionData
{

    private static final String FIELD_NAME_DESCRIPTION = "description";
    private static final String FIELD_NAME_ID = "id";
    private static final String FIELD_NAME_TITLE = "title";
    private static final String FIELD_NAME_URL = "url";
    private final String description;
    private final String id;
    private final boolean isPlaylist;
    private final String title;
    private final String url;

    private CollectionData(String s, boolean flag, String s1, String s2, String s3)
        throws ValidationException
    {
        id = VideoValidation.validateCollectionId("id", (String)Preconditions.checkNotNull(s));
        isPlaylist = flag;
        title = Validation.validateLength(1, 100, "title", (String)Preconditions.checkNotNull(s1));
        description = Validation.validateLength(0, 500, "description", (String)Preconditions.checkNotNull(s2));
        url = Validation.validatePathFragment("url", Validation.validateLength(1, 150, "url", (String)Preconditions.checkNotNull(s3)));
    }

    public static CollectionData fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        boolean flag = true;
        Validation.validateClass(java/lang/String, "id", jsonobject.get("id"));
        Validation.validateClass(java/lang/String, "title", jsonobject.get("title"));
        Validation.validateClass(java/lang/String, "description", jsonobject.get("description"));
        Validation.validateClass(java/lang/String, "url", jsonobject.get("url"));
        String s = jsonobject.getString("id");
        if (jsonobject.getInt("isPlaylist") != 1)
        {
            flag = false;
        }
        return new CollectionData(s, flag, jsonobject.getString("title"), jsonobject.getString("description"), jsonobject.getString("url"));
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isPlaylist()
    {
        return isPlaylist;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CollectionData{id='").append(id).append('\'').append(", isPlaylist=").append(isPlaylist).append(", title='").append(title).append('\'').append(", description='").append(description).append('\'').append(", url='").append(url).append('\'').append('}').toString();
    }
}
