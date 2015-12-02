// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

final class fht
    implements Comparator
{

    private PackageManager a;
    private List b;
    private Collator c;

    public fht(PackageManager packagemanager, String s)
    {
        c = Collator.getInstance();
        a = packagemanager;
        c.setStrength(0);
        b = new ArrayList(fhs.d());
        packagemanager = (List)fhs.e().get(dcg.a(s));
        if (packagemanager != null)
        {
            b.addAll(0, packagemanager);
        }
    }

    private int a(ResolveInfo resolveinfo, ResolveInfo resolveinfo1)
    {
        Object obj = resolveinfo.activityInfo.packageName;
        Object obj1 = resolveinfo1.activityInfo.packageName;
        if (b.contains(obj) && b.contains(obj1))
        {
            return Integer.valueOf(b.indexOf(obj)).compareTo(Integer.valueOf(b.indexOf(obj1)));
        }
        if (b.contains(obj) && !b.contains(obj1))
        {
            return -1;
        }
        if (!b.contains(obj) && b.contains(obj1))
        {
            return 1;
        }
        obj1 = resolveinfo.loadLabel(a);
        obj = obj1;
        if (obj1 == null)
        {
            obj = resolveinfo.activityInfo.name;
        }
        obj1 = resolveinfo1.loadLabel(a);
        resolveinfo = ((ResolveInfo) (obj1));
        if (obj1 == null)
        {
            resolveinfo = resolveinfo1.activityInfo.name;
        }
        return c.compare(((CharSequence) (obj)).toString(), resolveinfo.toString());
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((ResolveInfo)obj, (ResolveInfo)obj1);
    }
}
