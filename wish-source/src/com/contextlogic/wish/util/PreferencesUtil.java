// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

public class PreferencesUtil
{

    public PreferencesUtil()
    {
    }

    public static ArrayList getIntegerArray(SharedPreferences sharedpreferences, String s)
    {
        s = sharedpreferences.getString(s, null);
        sharedpreferences = new ArrayList();
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            s = new JSONArray(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        sharedpreferences.add(Integer.valueOf(s.optInt(i)));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return sharedpreferences;
    }

    public static ArrayList getLongArray(SharedPreferences sharedpreferences, String s)
    {
        s = sharedpreferences.getString(s, null);
        sharedpreferences = new ArrayList();
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            s = new JSONArray(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        sharedpreferences.add(Long.valueOf(s.optLong(i)));
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        return sharedpreferences;
    }

    public static ArrayList getStringArray(SharedPreferences sharedpreferences, String s)
    {
        s = sharedpreferences.getString(s, null);
        sharedpreferences = new ArrayList();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s = new JSONArray(s);
        int i = 0;
_L1:
        String s1;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s1 = s.optString(i);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        sharedpreferences.add(s1);
        i++;
          goto _L1
        s;
        return sharedpreferences;
    }

    public static void setIntegerArray(SharedPreferences sharedpreferences, String s, ArrayList arraylist)
    {
        sharedpreferences = sharedpreferences.edit();
        JSONArray jsonarray = new JSONArray();
        for (int i = 0; i < arraylist.size(); i++)
        {
            jsonarray.put(arraylist.get(i));
        }

        if (!arraylist.isEmpty())
        {
            sharedpreferences.putString(s, jsonarray.toString());
        } else
        {
            sharedpreferences.putString(s, null);
        }
        sharedpreferences.commit();
    }

    public static void setLongArray(SharedPreferences sharedpreferences, String s, ArrayList arraylist)
    {
        sharedpreferences = sharedpreferences.edit();
        JSONArray jsonarray = new JSONArray();
        for (int i = 0; i < arraylist.size(); i++)
        {
            jsonarray.put(arraylist.get(i));
        }

        if (!arraylist.isEmpty())
        {
            sharedpreferences.putString(s, jsonarray.toString());
        } else
        {
            sharedpreferences.putString(s, null);
        }
        sharedpreferences.commit();
    }

    public static void setStringArray(SharedPreferences sharedpreferences, String s, ArrayList arraylist)
    {
        sharedpreferences = sharedpreferences.edit();
        JSONArray jsonarray = new JSONArray();
        for (int i = 0; i < arraylist.size(); i++)
        {
            jsonarray.put(arraylist.get(i));
        }

        if (!arraylist.isEmpty())
        {
            sharedpreferences.putString(s, jsonarray.toString());
        } else
        {
            sharedpreferences.putString(s, null);
        }
        sharedpreferences.commit();
    }
}
