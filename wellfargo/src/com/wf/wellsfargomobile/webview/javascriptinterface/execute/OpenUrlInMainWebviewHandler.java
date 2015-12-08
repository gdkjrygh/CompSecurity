// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import android.content.Intent;
import com.wf.wellsfargomobile.WebViewActivity;
import java.util.Map;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler

public class OpenUrlInMainWebviewHandler extends BridgeExecuteHandler
{

    private static final String TAG = "OpnUrlInMnWebviewHndlr";
    private Activity activity;

    public OpenUrlInMainWebviewHandler(Activity activity1)
    {
        super(activity1);
        activity = activity1;
    }

    protected String calculateReturn()
    {
        return null;
    }

    protected void executeInternal()
    {
        String s = (String)((Map)payload.getData()).get("url");
        if (s != null)
        {
            Intent intent = new Intent(activity, com/wf/wellsfargomobile/WebViewActivity);
            intent.putExtra("unauth_browse", true);
            intent.putExtra("unauth_browse_goto", s);
            activity.startActivityForResult(intent, 5);
        }
    }
}
