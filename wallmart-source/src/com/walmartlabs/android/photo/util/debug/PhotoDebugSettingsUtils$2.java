// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.debug;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.android.photo.util.debug:
//            PhotoDebugSettingsUtils, PhotoDebugSettings

static final class val.context
    implements android.content.tener
{

    final Context val$context;
    final int val$selectedIndex;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != val$selectedIndex)
        {
            PhotoDebugSettings.get(val$context).setDebugServerType(PhotoDebugSettingsUtils.access$100()[i]);
        }
        dialoginterface.dismiss();
    }

    (int i, Context context1)
    {
        val$selectedIndex = i;
        val$context = context1;
        super();
    }
}
