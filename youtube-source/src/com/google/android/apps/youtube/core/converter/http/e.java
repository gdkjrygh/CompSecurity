// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.apps.youtube.datalib.legacy.model.ArtistSnippet;
import com.google.android.apps.youtube.datalib.legacy.model.MusicVideo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            bj

public final class e extends bj
{

    public e()
    {
    }

    protected final Object a(JSONObject jsonobject)
    {
        boolean flag = false;
        String s = jsonobject.getString("id");
        String s1 = jsonobject.getString("name");
        String s2 = jsonobject.getString("bio");
        Object obj = jsonobject.getJSONArray("musicVideos");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(i);
            arraylist.add(new MusicVideo(jsonobject1.getString("id"), s, s1, jsonobject1.getString("name"), jsonobject1.getInt("length")));
        }

        jsonobject = jsonobject.getJSONArray("relatedArtists");
        obj = new ArrayList(jsonobject.length());
        for (int j = ((flag) ? 1 : 0); j < jsonobject.length(); j++)
        {
            JSONObject jsonobject2 = jsonobject.getJSONObject(j);
            ((List) (obj)).add(new ArtistSnippet(jsonobject2.getString("id"), jsonobject2.getString("name")));
        }

        return new Artist(s, s1, s2, arraylist, ((List) (obj)));
    }
}
