// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.a:
//            a

public abstract class b
{

    public b()
    {
    }

    protected static Enum a(JSONObject jsonobject, String s, Class class1)
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return Enum.valueOf(class1, jsonobject.getString(s));
        }
    }

    protected static String a(JSONObject jsonobject, String s)
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return jsonobject.getString(s);
        }
    }

    public static List a(JSONArray jsonarray)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(jsonarray);
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < jsonarray.length()) 
        {
            a a1;
            if (jsonarray.isNull(i))
            {
                a1 = null;
            } else
            {
                a1 = b(jsonarray.getJSONObject(i));
            }
            arraylist.add(a1);
            i++;
        }
        return arraylist;
    }

    public static final JSONArray a(List list)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        JSONArray jsonarray = new JSONArray();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = (a)iterator.next();
            if (list == null)
            {
                list = ((List) (JSONObject.NULL));
            } else
            {
                list = list.getConverter().b();
            }
            jsonarray.put(list);
        }
        return jsonarray;
    }

    protected static void a(JSONObject jsonobject, String s, a a1)
    {
        if (a1 == null)
        {
            a1 = ((a) (JSONObject.NULL));
        } else
        {
            a1 = a1.getConverter().b();
        }
        jsonobject.put(s, a1);
    }

    protected static void a(JSONObject jsonobject, String s, Enum enum)
    {
        if (enum == null)
        {
            enum = ((Enum) (JSONObject.NULL));
        } else
        {
            enum = enum.name();
        }
        jsonobject.put(s, enum);
    }

    protected static void a(JSONObject jsonobject, String s, Object obj)
    {
        if (obj == null)
        {
            obj = JSONObject.NULL;
        } else
        {
            obj = obj.toString();
        }
        jsonobject.put(s, obj);
    }

    protected static void a(JSONObject jsonobject, String s, List list)
    {
        if (list == null)
        {
            jsonobject.put(s, JSONObject.NULL);
            return;
        } else
        {
            jsonobject.put(s, a(list));
            return;
        }
    }

    public static a b(JSONObject jsonobject)
    {
        String s = jsonobject.optString("__class__");
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        try
        {
            int i = jsonobject.getInt("__version__");
            jsonobject = ((b)Class.forName(s).getConstructor(new Class[0]).newInstance(new Object[0])).a(jsonobject, Integer.valueOf(i).intValue());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("ClassCastException");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("IllegalArgumentException");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("InstantiationException");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("IllegalAccessException");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("InvocationTargetException");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("NoSuchMethodException");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("fromJson", jsonobject);
            throw new JSONException("ClassNotFoundException");
        }
        return jsonobject;
    }

    protected static a b(JSONObject jsonobject, String s)
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return b(jsonobject.getJSONObject(s));
        }
    }

    protected static List b(JSONObject jsonobject, String s, Class class1)
    {
        new ArrayList();
        return a(jsonobject.getJSONArray(s));
    }

    protected static void b(JSONObject jsonobject, String s, List list)
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(((Uri)list.next()).toString())) { }
        jsonobject.put(s, jsonarray);
    }

    protected static Uri c(JSONObject jsonobject, String s)
    {
        if (jsonobject.isNull(s))
        {
            return null;
        }
        try
        {
            jsonobject = p.b(jsonobject.getString(s));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            L.a("Malformed URL", jsonobject);
            throw new JSONException("Malformed URL Exception");
        }
        return jsonobject;
    }

    protected static List d(JSONObject jsonobject, String s)
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray(s);
        int i = 0;
        do
        {
            if (i >= jsonobject.length())
            {
                break;
            }
            try
            {
                arraylist.add(p.b(jsonobject.getString(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                L.a("Malformed URL", jsonobject);
                throw new JSONException("Malformed URL Exception");
            }
            i++;
        } while (true);
        return arraylist;
    }

    protected abstract int a();

    protected abstract a a(JSONObject jsonobject, int i);

    protected abstract void a(JSONObject jsonobject);

    public final JSONObject b()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("__class__", getClass().getName());
            jsonobject.put("__version__", a());
            a(jsonobject);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return jsonobject;
    }
}
