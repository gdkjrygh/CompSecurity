// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.urbanairship.actions:
//            Action, ActionArguments, Situation, ActionResult

public class ShareAction extends Action
{

    public static final String DEFAULT_REGISTRY_NAME = "share_action";
    public static final String DEFAULT_REGISTRY_SHORT_NAME = "^s";
    private static final List ignoredPackages = new _cls1();

    public ShareAction()
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
                break;
            }
            if (actionarguments.getValue() != null && (actionarguments.getValue() instanceof String))
            {
                return true;
            }
        }
        return false;
    }

    protected boolean excludePackage(String s)
    {
        return ignoredPackages.contains(s);
    }

    public ActionResult perform(String s, ActionArguments actionarguments)
    {
        Logger.info((new StringBuilder()).append("Running share action: ").append(actionarguments).toString());
        Context context = UAirship.getApplicationContext();
        s = (new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", (String)actionarguments.getValue());
        actionarguments = new ArrayList();
        List list = UAirship.getPackageManager().queryIntentActivities(s, 0);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            String s1 = ((ResolveInfo)list.get(i)).activityInfo.packageName;
            if (!excludePackage(s1) && !arraylist.contains(s1))
            {
                arraylist.add(s1);
                Intent intent = new Intent(s);
                intent.setPackage(s1);
                actionarguments.add(intent);
            }
        }

        if (actionarguments.isEmpty())
        {
            s = Intent.createChooser(s.setPackage(""), context.getString(com.urbanairship.R.string.ua_share_dialog_title)).setFlags(0x10000000);
        } else
        {
            s = Intent.createChooser((Intent)actionarguments.remove(0), context.getString(com.urbanairship.R.string.ua_share_dialog_title)).putExtra("android.intent.extra.INITIAL_INTENTS", (android.os.Parcelable[])actionarguments.toArray(new Intent[actionarguments.size()])).setFlags(0x10000000);
        }
        (new Handler(Looper.getMainLooper())).post(new _cls2(context, s));
        return ActionResult.newEmptyResult();
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
