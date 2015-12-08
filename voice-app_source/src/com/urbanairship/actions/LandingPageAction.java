// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.UAStringUtil;
import com.urbanairship.util.UriUtils;
import com.urbanairship.widget.UAWebView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

// Referenced classes of package com.urbanairship.actions:
//            Action, ActionArguments, Situation, ActionResult

public class LandingPageAction extends Action
{

    public static final String CACHE_ON_RECEIVE_KEY = "cache_on_receive";
    public static final String DEFAULT_REGISTRY_NAME = "landing_page_action";
    public static final String DEFAULT_REGISTRY_SHORT_NAME = "^p";
    public static final String SHOW_LANDING_PAGE_INTENT_ACTION = "com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION";
    public static final String URL_KEY = "url";

    public LandingPageAction()
    {
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        while (!super.acceptsArguments(actionarguments) || parseUri(actionarguments) == null) 
        {
            return false;
        }
        return true;
    }

    protected Uri parseUri(ActionArguments actionarguments)
    {
        Object obj;
        if (actionarguments.getValue() instanceof Map)
        {
            actionarguments = ((ActionArguments) (((Map)actionarguments.getValue()).get("url")));
        } else
        {
            actionarguments = ((ActionArguments) (actionarguments.getValue()));
        }
        if (actionarguments == null)
        {
            obj = null;
        } else
        {
            obj = UriUtils.parse(actionarguments);
            if (UAStringUtil.isEmpty(((Uri) (obj)).toString()))
            {
                return null;
            }
            actionarguments = ((ActionArguments) (obj));
            if ("u".equals(((Uri) (obj)).getScheme()))
            {
                try
                {
                    actionarguments = URLEncoder.encode(((Uri) (obj)).getSchemeSpecificPart(), "UTF-8");
                }
                // Misplaced declaration of an exception variable
                catch (ActionArguments actionarguments)
                {
                    Logger.warn((new StringBuilder()).append("Unable to decode ").append(((Uri) (obj)).getSchemeSpecificPart()).toString());
                    return null;
                }
                obj = UAirship.shared().getAirshipConfigOptions();
                actionarguments = Uri.parse((new StringBuilder()).append(((AirshipConfigOptions) (obj)).landingPageContentURL).append(((AirshipConfigOptions) (obj)).getAppKey()).append("/").append(actionarguments).toString());
            }
            obj = actionarguments;
            if (UAStringUtil.isEmpty(actionarguments.getScheme()))
            {
                return Uri.parse((new StringBuilder()).append("https://").append(actionarguments.toString()).toString());
            }
        }
        return ((Uri) (obj));
    }

    public ActionResult perform(final String uri, ActionArguments actionarguments)
    {
        uri = parseUri(actionarguments);
        static class _cls2
        {

            static final int $SwitchMap$com$urbanairship$actions$Situation[];

            static 
            {
                $SwitchMap$com$urbanairship$actions$Situation = new int[Situation.values().length];
                try
                {
                    $SwitchMap$com$urbanairship$actions$Situation[Situation.PUSH_RECEIVED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls2..SwitchMap.com.urbanairship.actions.Situation[actionarguments.getSituation().ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 72;
           goto _L1 _L2
_L1:
        uri = (new Intent("com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION", uri)).addFlags(0x30000000).setPackage(UAirship.getPackageName());
        UAirship.shared().getApplicationContext().startActivity(uri);
_L4:
        return ActionResult.newEmptyResult();
_L2:
        if (shouldCacheOnReceive(actionarguments))
        {
            (new Handler(Looper.getMainLooper())).postAtFrontOfQueue(new Runnable() {

                final LandingPageAction this$0;
                final Uri val$uri;

                public void run()
                {
                    (new UAWebView(UAirship.shared().getApplicationContext())).loadUrl(uri.toString());
                }

            
            {
                this$0 = LandingPageAction.this;
                uri = uri1;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean shouldCacheOnReceive(ActionArguments actionarguments)
    {
        if (actionarguments.getValue() instanceof Map)
        {
            actionarguments = ((ActionArguments) (((Map)actionarguments.getValue()).get("cache_on_receive")));
            if (actionarguments != null && (actionarguments instanceof Boolean))
            {
                return ((Boolean)actionarguments).booleanValue();
            }
        }
        return false;
    }
}
