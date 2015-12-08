// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.debug;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.StoredPreferences;

// Referenced classes of package com.walmartlabs.android.photo.util.debug:
//            PhotoDebugSettingsUtils, PhotoDebugSettings

static final class val.displayUploadSpeed
    implements android.content.tener
{

    final Context val$context;
    final boolean val$displayUploadSpeed;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            PhotoDebugSettingsUtils.showSelectServerDialog(val$context);
            return;

        case 1: // '\001'
            PhotoLogger.get().d(PhotoDebugSettingsUtils.access$000(), "Clearing settings...");
            StoredPreferences.get(val$context).clearAll();
            return;

        case 2: // '\002'
            PhotoDebugSettingsUtils.showUploadOptionsDialog(val$context);
            return;

        case 3: // '\003'
            dialoginterface = new Intent();
            dialoginterface.setAction("com.google.android.c2dm.intent.RECEIVE");
            dialoginterface.addCategory("com.walmart.android");
            dialoginterface.putExtra("photo-message", "{ \"title\" : \"GCM Test Title\", \"message\" : \"GCM Test Message\" }");
            val$context.sendOrderedBroadcast(dialoginterface, null);
            return;

        case 4: // '\004'
            dialoginterface = PhotoDebugSettings.get(val$context);
            break;
        }
        boolean flag;
        if (!val$displayUploadSpeed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dialoginterface.setDisplayUploadSpeed(flag);
    }

    (Context context1, boolean flag)
    {
        val$context = context1;
        val$displayUploadSpeed = flag;
        super();
    }
}
