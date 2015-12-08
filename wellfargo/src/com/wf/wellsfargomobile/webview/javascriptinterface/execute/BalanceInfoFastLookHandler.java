// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.a.a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler, BridgeExecuteHandlerException

public class BalanceInfoFastLookHandler extends BridgeExecuteHandler
{

    private static final String TAG = "BalanceInfoFstLookHndlr";
    private MainActivity mainActivity;

    public BalanceInfoFastLookHandler(Activity activity)
    {
        super(activity);
        mainActivity = (MainActivity)activity;
    }

    protected String calculateReturn()
    {
        return null;
    }

    protected void executeInternal()
    {
        String s;
        Object obj;
        String s2;
        s2 = (String)((Map)payload.getData()).get("url");
        if (s2 == null)
        {
            throw new BridgeExecuteHandlerException("partialUrl ==  null");
        }
        if (s2.trim().isEmpty())
        {
            throw new BridgeExecuteHandlerException("partialUrl is  Empty");
        }
        obj = null;
        s = ((String) (obj));
        URI uri = new URI(a.a());
        s = ((String) (obj));
        String s1 = (new StringBuilder()).append(uri.getScheme()).append("://").append(uri.getHost()).toString();
        obj = s1;
        s = s1;
        if (uri.getPort() > 0)
        {
            s = s1;
            try
            {
                obj = (new StringBuilder()).append(s1).append(":").append(uri.getPort()).toString();
            }
            catch (URISyntaxException urisyntaxexception)
            {
                urisyntaxexception = s;
            }
        }
        if (obj != null)
        {
            mainActivity.b((new StringBuilder()).append(((String) (obj))).append(s2.trim()).toString());
        }
        return;
    }
}
