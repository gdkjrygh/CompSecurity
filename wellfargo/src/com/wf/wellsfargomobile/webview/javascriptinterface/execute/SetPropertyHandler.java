// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.util.v;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class SetPropertyHandler extends BridgeExecuteHandler
{

    private static final String FAST_LOOK_TOKENS = "fastlookTokens";
    private static final String TAG = "SetPropertyHandler";

    public SetPropertyHandler(Activity activity)
    {
        super(activity);
    }

    protected String calculateReturn()
    {
        return null;
    }

    protected void executeInternal()
    {
        Map map = (Map)payload.getData();
        if (((String)map.get("key")).equalsIgnoreCase("fastlookTokens"))
        {
            map = (Map)map.get("value");
            String s;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); v.a(s, map.get(s).toString()))
            {
                s = (String)iterator.next();
            }

        }
    }
}
