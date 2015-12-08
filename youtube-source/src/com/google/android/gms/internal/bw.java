// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.n;

// Referenced classes of package com.google.android.gms.internal:
//            do, bp, bs, bn, 
//            bv, bm

public final class bw extends e
{

    private static final bw a = new bw();

    private bw()
    {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static bm a(Activity activity)
    {
        Intent intent;
        try
        {
            intent = activity.getIntent();
            if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar"))
            {
                throw new a("Ad overlay requires the useClientJar flag in intent extras.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.internal.do.d(activity.getMessage());
            return null;
        }
        if (intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false))
        {
            com.google.android.gms.internal.do.a("Using AdOverlay from the client jar.");
            return new bp(activity);
        }
        activity = a.b(activity);
        return activity;
    }

    private bm b(Activity activity)
    {
        try
        {
            com.google.android.gms.dynamic.k k = n.a(activity);
            activity = bn.a(((bs)a(activity)).a(k));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.internal.do.a("Could not create remote AdOverlay.", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.gms.internal.do.a("Could not create remote AdOverlay.", activity);
            return null;
        }
        return activity;
    }

    protected final Object a(IBinder ibinder)
    {
        return bv.a(ibinder);
    }


    private class a extends Exception
    {

        public a(String s)
        {
            super(s);
        }
    }

}
