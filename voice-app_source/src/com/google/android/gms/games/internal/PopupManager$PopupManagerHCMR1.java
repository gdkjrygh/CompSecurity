// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.zzlk;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, GamesClientImpl, GamesLog

private static final class zzaoV extends PopupManager
    implements android.view.r, android.view.Listener
{

    private boolean zzaoV;
    private WeakReference zzaqx;

    private void zzp(View view)
    {
        int j = -1;
        int i = j;
        if (zzlk.zzoW())
        {
            Display display = view.getDisplay();
            i = j;
            if (display != null)
            {
                i = display.getDisplayId();
            }
        }
        android.os.IBinder ibinder = view.getWindowToken();
        int ai[] = new int[2];
        view.getLocationInWindow(ai);
        j = view.getWidth();
        int k = view.getHeight();
        zzaqu.zzaqw = i;
        zzaqu.zzaqv = ibinder;
        zzaqu.left = ai[0];
        zzaqu.top = ai[1];
        zzaqu.right = ai[0] + j;
        zzaqu.bottom = ai[1] + k;
        if (zzaoV)
        {
            zztd();
            zzaoV = false;
        }
    }

    public void onGlobalLayout()
    {
        View view;
        if (zzaqx != null)
        {
            if ((view = (View)zzaqx.get()) != null)
            {
                zzp(view);
                return;
            }
        }
    }

    public void onViewAttachedToWindow(View view)
    {
        zzp(view);
    }

    public void onViewDetachedFromWindow(View view)
    {
        zzaqt.zzsR();
        view.removeOnAttachStateChangeListener(this);
    }

    protected void zzfF(int i)
    {
        zzaqu = new <init>(i, null, null);
    }

    public void zzo(View view)
    {
        zzaqt.zzsR();
        if (zzaqx != null)
        {
            View view1 = (View)zzaqx.get();
            android.content.Context context1 = zzaqt.getContext();
            Object obj = view1;
            if (view1 == null)
            {
                obj = view1;
                if (context1 instanceof Activity)
                {
                    obj = ((Activity)context1).getWindow().getDecorView();
                }
            }
            if (obj != null)
            {
                ((View) (obj)).removeOnAttachStateChangeListener(this);
                obj = ((View) (obj)).getViewTreeObserver();
                android.content.Context context;
                if (zzlk.zzoV())
                {
                    ((ViewTreeObserver) (obj)).removeOnGlobalLayoutListener(this);
                } else
                {
                    ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                }
            }
        }
        zzaqx = null;
        context = zzaqt.getContext();
        obj = view;
        if (view == null)
        {
            obj = view;
            if (context instanceof Activity)
            {
                obj = ((Activity)context).findViewById(0x1020002);
                view = ((View) (obj));
                if (obj == null)
                {
                    view = ((Activity)context).getWindow().getDecorView();
                }
                GamesLog.zzu("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                obj = view;
            }
        }
        if (obj != null)
        {
            zzp(((View) (obj)));
            zzaqx = new WeakReference(obj);
            ((View) (obj)).addOnAttachStateChangeListener(this);
            ((View) (obj)).getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        } else
        {
            GamesLog.zzv("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
    }

    public void zztd()
    {
        if (zzaqu.zzaqv != null)
        {
            super.zztd();
            return;
        }
        boolean flag;
        if (zzaqx != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzaoV = flag;
    }

    protected (GamesClientImpl gamesclientimpl, int i)
    {
        super(gamesclientimpl, i, null);
        zzaoV = false;
    }
}
