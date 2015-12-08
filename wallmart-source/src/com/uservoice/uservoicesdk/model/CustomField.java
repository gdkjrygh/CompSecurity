// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class CustomField extends BaseModel
{

    private String name;
    private List predefinedValues;
    private boolean required;

    public CustomField()
    {
    }

    public String getName()
    {
        return name;
    }

    public List getPredefinedValues()
    {
        return predefinedValues;
    }

    public boolean isPredefined()
    {
        return predefinedValues.size() > 0;
    }

    public boolean isRequired()
    {
        return required;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        name = getString(jsonobject, "name");
        boolean flag;
        if (!jsonobject.getBoolean("allow_blank"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        required = flag;
        predefinedValues = new ArrayList();
        if (jsonobject.has("possible_values"))
        {
            jsonobject = jsonobject.getJSONArray("possible_values");
            for (int i = 0; i < jsonobject.length(); i++)
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(i);
                predefinedValues.add(getString(jsonobject1, "value"));
            }

        }
    }

    public void save(JSONObject jsonobject)
        throws JSONException
    {
        super.save(jsonobject);
        jsonobject.put("name", name);
        JSONArray jsonarray;
        boolean flag;
        if (!required)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsonobject.put("allow_blank", flag);
        jsonarray = new JSONArray();
        JSONObject jsonobject1;
        for (Iterator iterator = predefinedValues.iterator(); iterator.hasNext(); jsonarray.put(jsonobject1))
        {
            String s = (String)iterator.next();
            jsonobject1 = new JSONObject();
            jsonobject1.put("value", s);
        }

        jsonobject.put("possible_values", jsonarray);
    }
}
