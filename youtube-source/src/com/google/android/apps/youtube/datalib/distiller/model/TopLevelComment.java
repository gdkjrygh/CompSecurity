// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.distiller.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.distiller.model:
//            c, b

public class TopLevelComment extends c
{

    private final String a;
    private final String b;
    private final boolean c;
    private final AclType d;
    private List e;
    private int f;
    private String g;
    private final boolean h;
    private final boolean i;
    private boolean j;

    public TopLevelComment(JSONObject jsonobject)
    {
        super(jsonobject);
        a = jsonobject.getString("id");
        Object obj = jsonobject.getJSONObject("object");
        c = ((JSONObject) (obj)).getJSONObject("statusForViewer").getBoolean("canComment");
        obj = ((JSONObject) (obj)).getJSONObject("replies");
        f = ((JSONObject) (obj)).getInt("totalItems");
        e = new ArrayList();
        if (((JSONObject) (obj)).has("items"))
        {
            obj = ((JSONObject) (obj)).getJSONArray("items");
            for (int i1 = 0; i1 < ((JSONArray) (obj)).length(); i1++)
            {
                e.add(new b(((JSONArray) (obj)).getJSONObject(i1), this));
            }

        }
        JSONObject jsonobject1;
        if (jsonobject.has("provider"))
        {
            h = TextUtils.equals("Youtube", jsonobject.getJSONObject("provider").getString("title"));
        } else
        {
            h = true;
        }
        jsonobject1 = jsonobject.getJSONObject("access");
        if (jsonobject1.has("description"))
        {
            obj = jsonobject1.getString("description");
        } else
        {
            obj = null;
        }
        b = ((String) (obj));
        d = b(jsonobject1);
        i = jsonobject.getString("verb").equals("post");
    }

    private static AclType b(JSONObject jsonobject)
    {
        if (jsonobject.has("items"))
        {
            jsonobject = jsonobject.getJSONArray("items");
            for (int i1 = 0; i1 < jsonobject.length(); i1++)
            {
                Object obj = jsonobject.getJSONObject(i1);
                if (!((JSONObject) (obj)).has("type"))
                {
                    return AclType.PRIVATE;
                }
                obj = ((JSONObject) (obj)).getString("type");
                if (TextUtils.equals("private", ((CharSequence) (obj))) || TextUtils.equals("limited", ((CharSequence) (obj))))
                {
                    return AclType.PRIVATE;
                }
                if (TextUtils.equals("public", ((CharSequence) (obj))))
                {
                    return AclType.PUBLIC;
                }
                if (TextUtils.equals("extendedCircles", ((CharSequence) (obj))))
                {
                    return AclType.EXTENDED_CIRCLES;
                }
                if (TextUtils.equals("domain", ((CharSequence) (obj))))
                {
                    return AclType.DOMAIN;
                }
                if (TextUtils.equals("square", ((CharSequence) (obj))))
                {
                    return AclType.SQUARE;
                }
            }

        }
        return AclType.OTHER;
    }

    public final void a(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.getJSONArray("items");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int i1 = jsonarray.length() - 1; i1 >= 0; i1--)
        {
            arraylist.add(new b(jsonarray.getJSONObject(i1), this));
        }

        if (g != null)
        {
            arraylist.addAll(e);
        }
        e = arraylist;
        if (jsonobject.has("nextPageToken"))
        {
            g = jsonobject.getString("nextPageToken");
            return;
        } else
        {
            g = null;
            f = e.size();
            return;
        }
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final boolean a()
    {
        while (g != null || f > e.size()) 
        {
            return true;
        }
        return false;
    }

    public final String b()
    {
        return g;
    }

    public final String k()
    {
        return a;
    }

    public final List l()
    {
        return Collections.unmodifiableList(e);
    }

    public final boolean m()
    {
        return j;
    }

    public final AclType n()
    {
        return d;
    }

    public final boolean o()
    {
        return c;
    }

    public final boolean p()
    {
        return i;
    }

    public final boolean q()
    {
        return h;
    }

    private class AclType extends Enum
    {

        private static final AclType $VALUES[];
        public static final AclType DOMAIN;
        public static final AclType EXTENDED_CIRCLES;
        public static final AclType OTHER;
        public static final AclType PRIVATE;
        public static final AclType PUBLIC;
        public static final AclType SQUARE;

        public static AclType valueOf(String s)
        {
            return (AclType)Enum.valueOf(com/google/android/apps/youtube/datalib/distiller/model/TopLevelComment$AclType, s);
        }

        public static AclType[] values()
        {
            return (AclType[])$VALUES.clone();
        }

        static 
        {
            OTHER = new AclType("OTHER", 0);
            PRIVATE = new AclType("PRIVATE", 1);
            PUBLIC = new AclType("PUBLIC", 2);
            EXTENDED_CIRCLES = new AclType("EXTENDED_CIRCLES", 3);
            SQUARE = new AclType("SQUARE", 4);
            DOMAIN = new AclType("DOMAIN", 5);
            $VALUES = (new AclType[] {
                OTHER, PRIVATE, PUBLIC, EXTENDED_CIRCLES, SQUARE, DOMAIN
            });
        }

        private AclType(String s, int i1)
        {
            super(s, i1);
        }
    }

}
