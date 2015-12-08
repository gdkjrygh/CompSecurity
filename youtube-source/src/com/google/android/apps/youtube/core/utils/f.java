// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            e

final class f
    implements ServiceConnection
{

    final Activity a;

    f(Activity activity)
    {
        a = activity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Bitmap bitmap;
        try
        {
            componentname = Parcel.obtain();
            bitmap = e.b(a);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            L.a("Error connecting to bug report service", componentname);
            return;
        }
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        bitmap.writeToParcel(componentname, 0);
        ibinder.transact(1, componentname, null, 0);
        return;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }
}
