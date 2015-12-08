// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface;

import android.util.Log;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandlerFactory;

public class j
{

    private MainActivity a;

    public j(MainActivity mainactivity)
    {
        a = mainactivity;
    }

    public String execute(String s, String s1, String s2)
    {
        s = BridgeExecuteHandlerFactory.getInstance(s1, a);
        if (s != null)
        {
            return s.execute(s2);
        } else
        {
            Log.e("QuickBalanceJavaScrInt", (new StringBuilder()).append("no handler found for commandKey ").append(s1).toString());
            return "";
        }
    }
}
