// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.tasks;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import net.hockeyapp.android.utils.Util;
import net.hockeyapp.android.utils.VersionCache;
import org.json.JSONArray;

// Referenced classes of package net.hockeyapp.android.tasks:
//            CheckUpdateTaskWithUI

class val.updateInfo
    implements android.content.istener
{

    final CheckUpdateTaskWithUI this$0;
    final JSONArray val$updateInfo;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (getCachingEnabled())
        {
            VersionCache.setVersionInfo(CheckUpdateTaskWithUI.access$000(CheckUpdateTaskWithUI.this), "[]");
        }
        dialoginterface = new WeakReference(CheckUpdateTaskWithUI.access$000(CheckUpdateTaskWithUI.this));
        if (Util.fragmentsSupported().booleanValue() && Util.runsOnTablet(dialoginterface).booleanValue())
        {
            CheckUpdateTaskWithUI.access$100(CheckUpdateTaskWithUI.this, val$updateInfo);
            return;
        } else
        {
            CheckUpdateTaskWithUI.access$200(CheckUpdateTaskWithUI.this, val$updateInfo, Boolean.valueOf(false));
            return;
        }
    }

    _cls9()
    {
        this$0 = final_checkupdatetaskwithui;
        val$updateInfo = JSONArray.this;
        super();
    }
}
