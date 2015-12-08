// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.d;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class j
{

    private int a;

    public j()
    {
    }

    public int a()
    {
        return a;
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        a = (new JSONObject(s)).optInt("status", 0);
        return;
        s;
        s.printStackTrace();
        return;
    }
}
