// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.content.SharedPreferences;
import android.text.Html;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.rest.RestMethod;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            Suggestion, Article, ClientConfig

public class BaseModel
{

    protected int id;

    public BaseModel()
    {
    }

    protected static transient String apiPath(String s, Object aobj[])
    {
        return (new StringBuilder()).append("/api/v1").append(String.format(s, aobj)).toString();
    }

    protected static List deserializeHeterogenousList(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.has(s)) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L4:
        return jsonobject;
_L2:
        JSONArray jsonarray;
        int i;
        jsonarray = jsonobject.getJSONArray(s);
        s = new ArrayList(jsonarray.length());
        i = 0;
_L7:
        jsonobject = s;
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject1;
        jsonobject1 = jsonarray.getJSONObject(i);
        jsonobject = jsonobject1.getString("type");
        if (!jsonobject.equals("suggestion")) goto _L6; else goto _L5
_L5:
        jsonobject = new Suggestion();
_L10:
        jsonobject.load(jsonobject1);
        s.add(jsonobject);
_L9:
        i++;
          goto _L7
_L6:
        if (!jsonobject.equals("article")) goto _L9; else goto _L8
_L8:
        jsonobject = new Article();
          goto _L10
    }

    protected static List deserializeList(JSONObject jsonobject, String s, Class class1)
        throws JSONException
    {
        if (jsonobject.has(s)) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L4:
        return jsonobject;
_L2:
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = jsonobject.getJSONArray(s);
            s = new ArrayList(jsonarray.length());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to instantiate ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        i = 0;
        jsonobject = s;
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        jsonobject = (BaseModel)class1.newInstance();
        jsonobject.load(jsonarray.getJSONObject(i));
        s.add(jsonobject);
        i++;
        break MISSING_BLOCK_LABEL_33;
    }

    protected static BaseModel deserializeObject(JSONObject jsonobject, String s, Class class1)
        throws JSONException
    {
        if (!jsonobject.has(s))
        {
            return null;
        }
        try
        {
            s = jsonobject.getJSONObject(s);
            BaseModel basemodel = (BaseModel)class1.newInstance();
            basemodel.load(s);
            s = (BaseModel)class1.cast(basemodel);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException((new StringBuilder()).append("JSON deserialization failure for ").append(class1).append(" ").append(s.getMessage()).append(" JSON: ").append(jsonobject.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to instantiate ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        return s;
    }

    protected static RestTask doDelete(String s, RestTaskCallback resttaskcallback)
    {
        return doDelete(s, null, resttaskcallback);
    }

    protected static RestTask doDelete(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.DELETE, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static RestTask doGet(String s, RestTaskCallback resttaskcallback)
    {
        return doGet(s, null, resttaskcallback);
    }

    protected static RestTask doGet(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.GET, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static RestTask doPost(String s, RestTaskCallback resttaskcallback)
    {
        return doPost(s, null, resttaskcallback);
    }

    protected static RestTask doPost(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.POST, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static RestTask doPut(String s, RestTaskCallback resttaskcallback)
    {
        return doPut(s, null, resttaskcallback);
    }

    protected static RestTask doPut(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.PUT, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static ClientConfig getClientConfig()
    {
        return getSession().getClientConfig();
    }

    protected static Config getConfig()
    {
        return getSession().getConfig();
    }

    protected static Session getSession()
    {
        return Session.getInstance();
    }

    public static BaseModel load(SharedPreferences sharedpreferences, String s, String s1, Class class1)
    {
        try
        {
            sharedpreferences = deserializeObject(new JSONObject(sharedpreferences.getString(s, "{}")), s1, class1);
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            return null;
        }
        return sharedpreferences;
    }

    protected Date getDate(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = getString(jsonobject, s);
        s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z");
        try
        {
            s = s.parse(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException((new StringBuilder()).append("Could not parse date: ").append(jsonobject).toString());
        }
        return s;
    }

    protected String getHtml(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return jsonobject.getString(s);
        }
    }

    public int getId()
    {
        return id;
    }

    protected String getString(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return Html.fromHtml(jsonobject.getString(s)).toString().trim();
        }
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        id = jsonobject.getInt("id");
    }

    public boolean persist(SharedPreferences sharedpreferences, String s, String s1)
    {
        JSONObject jsonobject1 = new JSONObject();
        JSONObject jsonobject = new JSONObject();
        try
        {
            save(jsonobject1);
            jsonobject.put(s1, jsonobject1);
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            return false;
        }
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.putString(s, jsonobject.toString());
        sharedpreferences.apply();
        return true;
    }

    public void save(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject.put("id", id);
    }
}
