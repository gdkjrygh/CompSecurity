// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.intent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.collect.BiMap;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IntentUtils
{

    private IntentUtils()
    {
    }

    public static Intent getExplicitIntent(Intent intent, Intent intent1, String s, String s1, int i, int j)
    {
        if (intent1 == null)
        {
            intent1 = intent;
        }
        if (i > 0 || j > 0)
        {
            intent = new LabeledIntent(intent1, s, i, j);
        } else
        {
            intent = new Intent(intent1);
        }
        if (!TextUtils.isEmpty(s1))
        {
            intent.setClassName(s, s1);
            return intent;
        } else
        {
            intent.setPackage(s);
            return intent;
        }
    }

    public static Intent getFilteredChooser(Context context, CharSequence charsequence, Intent intent, BiMap bimap, Collection collection, Iterable iterable)
    {
        java.util.LinkedHashMap linkedhashmap = Maps.newLinkedHashMap();
        Object obj = context.getPackageManager().queryIntentActivities(intent, 0);
        for (Iterator iterator = iterable.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Iterator iterator1 = ((List) (obj)).iterator();
            while (iterator1.hasNext()) 
            {
                ResolveInfo resolveinfo1 = (ResolveInfo)iterator1.next();
                String s3 = resolveinfo1.activityInfo.packageName;
                String s4 = resolveinfo1.activityInfo.name;
                if (!collection.contains(s3) && !collection.contains(s4) && (s.equals(s3) || s.equals(s4)))
                {
                    iterable = (Intent)bimap.get(s3);
                    context = iterable;
                    if (iterable == null)
                    {
                        context = (Intent)bimap.get(s4);
                    }
                    linkedhashmap.put(s4, getExplicitIntent(intent, context, s3, s4, resolveinfo1.labelRes, resolveinfo1.activityInfo.applicationInfo.icon));
                }
            }
        }

        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            String s1 = resolveinfo.activityInfo.packageName;
            String s2 = resolveinfo.activityInfo.name;
            if (!collection.contains(s1) && !collection.contains(s2))
            {
                iterable = (Intent)bimap.get(s1);
                context = iterable;
                if (iterable == null)
                {
                    context = (Intent)bimap.get(s2);
                }
                linkedhashmap.put(s2, getExplicitIntent(intent, context, s1, s2, resolveinfo.labelRes, resolveinfo.activityInfo.applicationInfo.icon));
            }
        } while (true);
        if (!linkedhashmap.isEmpty())
        {
            intent = linkedhashmap.values();
            bimap = intent.iterator();
            for (context = (Intent)bimap.next(); bimap.hasNext(); context = (Intent)bimap.next()) { }
            intent.remove(context);
            context = Intent.createChooser(context, charsequence);
            context.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])intent.toArray(new Parcelable[intent.size()]));
            return context;
        } else
        {
            return intent;
        }
    }

    public static Intent getInstallIntent(String s)
    {
        return new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
    }

    public static boolean isInstalled(Context context, String s)
    {
        return context.getPackageManager().getLaunchIntentForPackage(s) != null;
    }

    public static boolean launchOrInstall(Context context, String s, Intent intent)
    {
        Intent intent1;
        boolean flag1;
        flag1 = true;
        intent1 = context.getPackageManager().getLaunchIntentForPackage(s);
        if (intent1 != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        s = getInstallIntent(s);
        flag = false;
_L4:
        context.startActivity(s);
        return flag;
_L2:
        s = intent1;
        flag = flag1;
        if (intent != null)
        {
            s = intent;
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void showFilteredChooser(Context context, Activity activity, int i, CharSequence charsequence, Intent intent, BiMap bimap, Collection collection, Iterable iterable)
    {
        charsequence = getFilteredChooser(context, charsequence, intent, bimap, collection, iterable);
        if (activity == null)
        {
            context.startActivity(charsequence);
            return;
        } else
        {
            activity.startActivityForResult(charsequence, i);
            return;
        }
    }

    public static void showFilteredChooser(Context context, CharSequence charsequence, Intent intent, BiMap bimap, Collection collection, Iterable iterable)
    {
        showFilteredChooser(context, null, -1, charsequence, intent, bimap, collection, iterable);
    }
}
