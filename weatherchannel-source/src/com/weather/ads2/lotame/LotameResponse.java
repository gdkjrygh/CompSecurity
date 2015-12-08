// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.lotame;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.weather.dal2.eventlog.logs.EventLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class LotameResponse
{
    private static final class Audience
    {

        private final String abbr;
        private final String id;

        public String toString()
        {
            return (new StringBuilder()).append("Audience{id='").append(id).append('\'').append(", abbr='").append(abbr).append('\'').append('}').toString();
        }


        Audience(String s, String s1)
        {
            id = s;
            abbr = s1;
        }
    }


    private static final Function ID_FUNCTION = new Function() {

        public volatile Object apply(Object obj)
        {
            return apply((Audience)obj);
        }

        public String apply(Audience audience)
        {
            if (audience == null)
            {
                return "";
            } else
            {
                return audience.id;
            }
        }

    };
    private static final String KEY_ABBR = "abbr";
    private static final String KEY_AUDIENCE = "Audience";
    private static final String KEY_AUDIENCES = "Audiences";
    private static final String KEY_ID = "id";
    private static final String KEY_PID = "pid";
    private static final String KEY_PROFILE = "Profile";
    private static final String KEY_TPID = "tpid";
    private static final int MAX_SEGMENTS = 0x7fffffff;
    private static final String TAG = "LotameResponse";
    private final List audiences;
    private final String lpid;
    private final String tpid;

    public LotameResponse(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ImmutableList immutablelist;
        obj = "";
        obj1 = "";
        immutablelist = ImmutableList.of();
        obj2 = obj1;
        obj3 = obj;
        s = new JSONObject(s);
        obj2 = obj1;
        obj3 = obj;
        if (!s.has("Profile")) goto _L2; else goto _L1
_L1:
        obj2 = obj1;
        obj3 = obj;
        JSONObject jsonobject = s.getJSONObject("Profile");
_L7:
        obj2 = obj1;
        obj3 = obj;
        Object obj5 = jsonobject.opt("tpid");
        s = ((String) (obj));
        obj2 = obj1;
        obj3 = obj;
        if (!(obj5 instanceof String))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj2 = obj1;
        obj3 = obj;
        s = (String)obj5;
        obj2 = obj1;
        obj3 = s;
        obj5 = jsonobject.opt("pid");
        obj = obj1;
        obj2 = obj1;
        obj3 = s;
        if (!(obj5 instanceof String))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        obj2 = obj1;
        obj3 = s;
        obj = (String)obj5;
        String s1;
        obj1 = immutablelist;
        obj5 = obj;
        s1 = s;
        obj2 = obj;
        obj3 = s;
        if (!jsonobject.has("Audiences")) goto _L4; else goto _L3
_L3:
        obj2 = obj;
        obj3 = s;
        obj5 = jsonobject.getJSONObject("Audiences").getJSONArray("Audience");
        if (obj5 != null) goto _L6; else goto _L5
_L5:
        obj2 = obj;
        obj3 = s;
        obj1 = ImmutableList.of();
        s1 = s;
        obj5 = obj;
_L4:
        s = s1;
        if (s1.isEmpty())
        {
            s = "nl";
        }
        tpid = s;
        s = ((String) (obj5));
        if (((String) (obj5)).isEmpty())
        {
            s = "nl";
        }
        lpid = s;
        audiences = ((List) (obj1));
        return;
_L2:
        obj2 = obj1;
        obj3 = obj;
        jsonobject = new JSONObject();
          goto _L7
        obj1;
        s = ((String) (obj3));
        obj = obj2;
        obj2 = obj1;
        obj1 = immutablelist;
_L10:
        EventLog.w("LotameResponse", ((JSONException) (obj2)).getMessage(), ((Throwable) (obj2)));
        obj5 = obj;
        s1 = s;
          goto _L4
_L6:
        obj2 = obj;
        obj3 = s;
        int j = Math.min(((JSONArray) (obj5)).length(), 0x7fffffff);
        obj2 = obj;
        obj3 = s;
        obj1 = new ArrayList(j);
        int i = 0;
_L9:
        if (i >= ((JSONArray) (obj5)).length() || ((List) (obj1)).size() >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj4 = ((JSONArray) (obj5)).getJSONObject(i);
        obj2 = ((JSONObject) (obj4)).optString("id", "");
        obj4 = ((JSONObject) (obj4)).optString("abbr", "");
        if (!Strings.isNullOrEmpty(((String) (obj2))) && !Strings.isNullOrEmpty(((String) (obj4))))
        {
            ((List) (obj1)).add(new Audience(((String) (obj2)), ((String) (obj4))));
        }
        i++;
        if (true) goto _L9; else goto _L8
        obj2;
          goto _L10
_L8:
        obj5 = obj;
        s1 = s;
          goto _L4
    }

    public String getAudienceIds()
    {
        if (audiences.isEmpty())
        {
            return "nl";
        } else
        {
            return Joiner.on(",").join(Collections2.transform(audiences, ID_FUNCTION));
        }
    }

    public String getLpid()
    {
        return lpid;
    }

    public String getTpid()
    {
        return tpid;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LotameResponse [tpid=").append(tpid).append(", lpid=").append(lpid).append(", audiences=").append(audiences).append(']').toString();
    }

}
