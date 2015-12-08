// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.UAStringUtil;
import com.urbanairship.util.UriUtils;
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
        if (super.acceptsArguments(actionarguments))
        {
    /* anonymous class not found */
    class _anm3 {}

            switch (_cls3..SwitchMap.com.urbanairship.actions.Situation[actionarguments.getSituation().ordinal()])
            {
            default:
                return false;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                break;
            }
            if (parseUri(actionarguments) != null)
            {
                return true;
            }
        }
        return false;
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

    public ActionResult perform(String s, ActionArguments actionarguments)
    {
        s = parseUri(actionarguments);
        _cls3..SwitchMap.com.urbanairship.actions.Situation[actionarguments.getSituation().ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 85;
           goto _L1 _L2
_L1:
        s = (new Intent("com.urbanairship.actions.SHOW_LANDING_PAGE_INTENT_ACTION", s)).addFlags(0x30000000).setPackage(UAirship.getPackageName());
        (new Handler(Looper.getMainLooper())).post(new _cls2(s));
_L4:
        return ActionResult.newEmptyResult();
_L2:
        if (shouldCacheOnReceive(actionarguments))
        {
            (new Handler(Looper.getMainLooper())).postAtFrontOfQueue(new _cls1(s));
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

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
