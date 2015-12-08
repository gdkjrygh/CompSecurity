// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.model.plus.Person;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bj

public final class by extends bj
{

    public by()
    {
    }

    protected final Object a(JSONObject jsonobject)
    {
        String s = jsonobject.getString("id");
        String s1 = jsonobject.getString("displayName");
        String s2 = jsonobject.getString("url");
        String s3 = jsonobject.getJSONObject("image").getString("url");
        jsonobject = null;
        if (TextUtils.isEmpty(s))
        {
            jsonobject = "id";
        } else
        if (TextUtils.isEmpty(s1))
        {
            jsonobject = "displayName";
        } else
        if (TextUtils.isEmpty(s2))
        {
            jsonobject = "url";
        } else
        if (TextUtils.isEmpty(s3))
        {
            jsonobject = "image->url";
        }
        if (jsonobject != null)
        {
            throw new ConverterException((new StringBuilder("Response missing required field: ")).append(jsonobject).toString());
        } else
        {
            return new Person(s, s1, Uri.parse(s2), Uri.parse(s3));
        }
    }
}
