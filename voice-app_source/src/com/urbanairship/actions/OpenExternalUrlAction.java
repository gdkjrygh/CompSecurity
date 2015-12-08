// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.UriUtils;

// Referenced classes of package com.urbanairship.actions:
//            Action, Situation, ActionArguments, ActionResult

public class OpenExternalUrlAction extends Action
{

    public static final String DEFAULT_REGISTRY_NAME = "open_external_url_action";
    public static final String DEFAULT_REGISTRY_SHORT_NAME = "^u";

    public OpenExternalUrlAction()
    {
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        return Situation.PUSH_RECEIVED != actionarguments.getSituation() && UriUtils.parse(actionarguments.getValue()) != null;
    }

    public ActionResult perform(String s, ActionArguments actionarguments)
    {
        s = UriUtils.parse(actionarguments.getValue());
        Logger.info((new StringBuilder()).append("Opening ").append(s).toString());
        actionarguments = new Intent("android.intent.action.VIEW", s);
        actionarguments.addFlags(0x10000000);
        UAirship.shared().getApplicationContext().startActivity(actionarguments);
        return ActionResult.newResult(s);
    }
}
