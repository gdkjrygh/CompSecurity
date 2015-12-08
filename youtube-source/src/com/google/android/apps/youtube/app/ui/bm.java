// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bq, bp, bo, bn

public final class bm
{

    private static final Uri a = Uri.parse("http://m.youtube.com/merge_identity");
    private static final Uri b = Uri.parse("http://m.youtube.com/create_channel");

    public static Dialog a(Activity activity, ak ak, l l1, UserProfile userprofile, bc bc)
    {
        c.a(activity);
        c.a(l1.b());
        c.a(userprofile);
        c.a(bc);
        if (userprofile.isLightweight)
        {
            return (new aa(activity)).setMessage(p.ae).setPositiveButton(p.cd, new bq(bc, activity)).setNegativeButton(p.ao, new bp()).create();
        }
        if (TextUtils.isEmpty(userprofile.plusUserId))
        {
            return (new aa(activity)).setMessage(p.ap).setPositiveButton(p.aq, new bo(bc, activity, ak)).setNegativeButton(p.ao, new bn()).create();
        } else
        {
            return null;
        }
    }

    static Uri a()
    {
        return a;
    }

    static Uri b()
    {
        return b;
    }

}
