// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

// Referenced classes of package com.facebook.ads.a:
//            e, g, ag

public class h
{

    public static Collection a(JSONArray jsonarray)
    {
        if (jsonarray == null || jsonarray.length() == 0)
        {
            return null;
        }
        HashSet hashset = new HashSet();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            hashset.add(jsonarray.optString(i));
        }

        return hashset;
    }

    public static boolean a(Context context, e e1)
    {
        g g1;
        boolean flag1;
        flag1 = true;
        g1 = e1.a();
        if (g1 != null && g1 != g.a) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        if ((e1 = e1.b()) == null || e1.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        e1 = e1.iterator();
        do
        {
            if (!e1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
        } while (!a(context, (String)e1.next()));
        flag = true;
_L4:
        if (g1 == g.b)
        {
            return flag;
        }
        if (g1 == g.c)
        {
            if (!flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            return flag;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean a(Context context, String s)
    {
        if (ag.a(s))
        {
            return false;
        }
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }
}
