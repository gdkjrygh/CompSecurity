// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.b.a;

import android.text.TextUtils;
import com.jiubang.commerce.utils.e;
import com.jiubang.commerce.utils.p;
import org.json.JSONException;
import org.json.JSONObject;

public class j
{

    private String a;
    private String b;

    public j()
    {
        a = "";
        b = "";
    }

    public static j a(int i, JSONObject jsonobject)
    {
        if (jsonobject == null || jsonobject.length() <= 0)
        {
            jsonobject = null;
        } else
        {
            j j1 = new j();
            jsonobject = jsonobject.optJSONObject("uflag");
            if (jsonobject != null)
            {
                j1.b(jsonobject.optString("user", ""));
                j1.a(jsonobject.optString("buychanneltype", ""));
            }
            jsonobject = j1;
            if (com.jiubang.commerce.utils.j.a)
            {
                com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]BaseResponseBean(mUser=").append(j1.b()).append(" mBuychanneltype=").append(j1.a()).append(")").toString());
                return j1;
            }
        }
        return jsonobject;
    }

    public static String b(int i)
    {
        return (new StringBuilder()).append("BaseResponseBean-").append(i).toString();
    }

    public static j c(int i)
    {
        Object obj;
        obj = e.a(b(i), true);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = a(i, new JSONObject(((String) (obj))));
        return ((j) (obj));
        Exception exception;
        exception;
        exception.printStackTrace();
        return null;
    }

    public String a()
    {
        return b;
    }

    public void a(String s)
    {
        b = s;
    }

    public boolean a(int i)
    {
        if (!TextUtils.isEmpty(a) || !TextUtils.isEmpty(b)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        JSONObject jsonobject1 = new JSONObject();
        JSONObject jsonobject;
        jsonobject1.put("user", a);
        jsonobject1.put("buychanneltype", b);
        jsonobject = new JSONObject();
        jsonobject.put("uflag", jsonobject1);
        jsonobject.put("saveDataTime", System.currentTimeMillis());
_L4:
        JSONException jsonexception;
        if (jsonobject != null && jsonobject.length() >= 1)
        {
            boolean flag;
            try
            {
                flag = e.a(b(i), p.d(jsonobject), true);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return false;
            }
            return flag;
        }
        if (true) goto _L1; else goto _L3
_L3:
        jsonexception;
        jsonobject = null;
_L5:
        jsonexception.printStackTrace();
          goto _L4
        jsonexception;
          goto _L5
    }

    public String b()
    {
        return a;
    }

    public void b(String s)
    {
        a = s;
    }

    public boolean c()
    {
        return "1".equals(b);
    }
}
