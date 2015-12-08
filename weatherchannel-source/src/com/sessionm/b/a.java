// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.b;

import android.util.Log;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
{

    public static final String TAG = "SessionM.JSON";
    private final JSONObject fJ;

    private a(JSONObject jsonobject)
    {
        fJ = jsonobject;
    }

    public static a A(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = new a(new JSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("SessionM.JSON", 3))
            {
                Log.d("SessionM.JSON", s.toString());
            }
            s = null;
        }
        return s;
    }

    private Object[] a(JSONArray jsonarray, Class class1)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        int i;
        try
        {
            arraylist = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            if (Log.isLoggable("SessionM.JSON", 3))
            {
                Log.e("SessionM.JSON", jsonarray.toString());
            }
            return null;
        }
        i = 0;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = jsonarray.get(i);
        obj = obj1;
        if (class1 != com/sessionm/b/a)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj = obj1;
        if (obj1 instanceof JSONObject)
        {
            obj = A(obj1.toString());
        }
        arraylist.add(obj);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_12;
_L1:
        jsonarray = ((JSONArray) (arraylist.toArray((Object[])(Object[])Array.newInstance(class1, 0))));
        return jsonarray;
    }

    public static a aJ()
    {
        return new a(new JSONObject());
    }

    public a B(String s)
    {
        try
        {
            s = new a(fJ.getJSONObject(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("SessionM.JSON", 3))
            {
                Log.e("SessionM.JSON", s.toString());
            }
            return null;
        }
        return s;
    }

    public Long C(String s)
    {
        s = ((String) (fJ.opt(s)));
        if (s instanceof Long)
        {
            return (Long)s;
        } else
        {
            return null;
        }
    }

    public Object D(String s)
    {
        return fJ.optJSONArray(s);
    }

    public void a(Map map)
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                put((String)entry.getKey(), entry.getValue());
            }
        }
    }

    public Object[] a(String s, Class class1)
    {
        try
        {
            s = ((String) (a(fJ.getJSONArray(s), class1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("SessionM.JSON", 3))
            {
                Log.e("SessionM.JSON", s.toString());
            }
            return null;
        }
        return s;
    }

    public String[] aK()
    {
        return (String[])a(fJ.names(), java/lang/String);
    }

    public JSONObject aL()
    {
        return fJ;
    }

    public boolean getBoolean(String s)
    {
        return fJ.optBoolean(s);
    }

    public int getInt(String s)
    {
        return fJ.optInt(s);
    }

    public Integer getInteger(String s)
    {
        s = ((String) (fJ.opt(s)));
        if (s instanceof Integer)
        {
            return (Integer)s;
        } else
        {
            return null;
        }
    }

    public long getLong(String s)
    {
        return fJ.optLong(s);
    }

    public Object getObject(String s)
    {
        return fJ.opt(s);
    }

    public String getString(String s)
    {
        return fJ.optString(s, null);
    }

    public boolean has(String s)
    {
        return fJ.has(s);
    }

    public boolean isNull(String s)
    {
        return fJ.isNull(s);
    }

    public Iterator keys()
    {
        return fJ.keys();
    }

    public void put(String s, float f)
    {
        fJ.put(s, f);
_L1:
        return;
        s;
        if (Log.isLoggable("SessionM.JSON", 3))
        {
            Log.e("SessionM.JSON", s.toString());
            return;
        }
          goto _L1
    }

    public void put(String s, int i)
    {
        fJ.put(s, i);
_L1:
        return;
        s;
        if (Log.isLoggable("SessionM.JSON", 3))
        {
            Log.e("SessionM.JSON", s.toString());
            return;
        }
          goto _L1
    }

    public void put(String s, long l)
    {
        fJ.put(s, l);
_L1:
        return;
        s;
        if (Log.isLoggable("SessionM.JSON", 3))
        {
            Log.e("SessionM.JSON", s.toString());
            return;
        }
          goto _L1
    }

    public void put(String s, Object obj)
    {
        if (obj instanceof a)
        {
            fJ.put(s, ((a)obj).aL());
            return;
        }
        try
        {
            fJ.put(s, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (Log.isLoggable("SessionM.JSON", 3))
        {
            Log.e("SessionM.JSON", s.toString());
        }
        return;
    }

    public void put(String s, String s1)
    {
        fJ.put(s, s1);
_L1:
        return;
        s;
        if (Log.isLoggable("SessionM.JSON", 3))
        {
            Log.e("SessionM.JSON", s.toString());
            return;
        }
          goto _L1
    }

    public void put(String s, boolean flag)
    {
        fJ.put(s, flag);
_L1:
        return;
        s;
        if (Log.isLoggable("SessionM.JSON", 3))
        {
            Log.e("SessionM.JSON", s.toString());
            return;
        }
          goto _L1
    }

    public String toString()
    {
        return fJ.toString();
    }
}
