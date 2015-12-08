// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.a.a.a.b;

public class SendAndForgetRequestService extends IntentService
{

    public SendAndForgetRequestService()
    {
        super("SendAndForgetRequestSvc");
    }

    public void onHandleIntent(Intent intent)
    {
        String s = intent.getStringExtra("KEY_SEND_FORGET_URL");
        if (!b.a(s))
        {
            HashMap hashmap = new HashMap();
            String s1 = intent.getStringExtra("KEY_SEND_FORGET_MODE");
            c c1 = c.a;
            boolean flag;
            if ("POST".equals(s1))
            {
                c1 = c.b;
                Object obj = intent.getBundleExtra("KEY_SEND_FORGET_PARAM_BUNDLE");
                if (obj != null)
                {
                    intent = ((Bundle) (obj)).getStringArrayList("KEY_SEND_FORGET_PARAM_NAMES");
                    obj = ((Bundle) (obj)).getStringArrayList("KEY_SEND_FORGET_PARAM_VALUES");
                    if (intent != null && obj != null)
                    {
                        if (intent.size() == ((ArrayList) (obj)).size())
                        {
                            for (int i = 0; i < intent.size(); i++)
                            {
                                hashmap.put(intent.get(i), ((ArrayList) (obj)).get(i));
                            }

                            flag = false;
                            intent = c1;
                        } else
                        {
                            intent = c1;
                            flag = true;
                        }
                    } else
                    {
                        intent = c1;
                        flag = true;
                    }
                } else
                {
                    flag = false;
                    intent = c1;
                }
            } else
            {
                flag = false;
                intent = c1;
            }
            if (!flag)
            {
                (new a(intent, s, hashmap, null, getApplicationContext())).a();
            }
        }
    }
}
