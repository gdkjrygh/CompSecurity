// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.app.Activity;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.zzlk;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl, GamesLog

public class PopupManager
{
    public static final class PopupLocationInfo
    {

        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder zzaqv;
        public int zzaqw;

        public Bundle zztc()
        {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", gravity);
            bundle.putInt("popupLocationInfo.displayId", zzaqw);
            bundle.putInt("popupLocationInfo.left", left);
            bundle.putInt("popupLocationInfo.top", top);
            bundle.putInt("popupLocationInfo.right", right);
            bundle.putInt("popupLocationInfo.bottom", bottom);
            return bundle;
        }

        private PopupLocationInfo(int i, IBinder ibinder)
        {
            zzaqw = -1;
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
            gravity = i;
            zzaqv = ibinder;
        }

    }

    private static final class PopupManagerHCMR1 extends PopupManager
        implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
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
            IBinder ibinder = view.getWindowToken();
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
            zzaqu = new PopupLocationInfo(i, null);
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
                zztd();
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

        protected PopupManagerHCMR1(GamesClientImpl gamesclientimpl, int i)
        {
            super(gamesclientimpl, i, null);
            zzaoV = false;
        }
    }


    protected GamesClientImpl zzaqt;
    protected PopupLocationInfo zzaqu;

    private PopupManager(GamesClientImpl gamesclientimpl, int i)
    {
        zzaqt = gamesclientimpl;
        zzfF(i);
    }


    public static PopupManager zza(GamesClientImpl gamesclientimpl, int i)
    {
        if (zzlk.zzoS())
        {
            return new PopupManagerHCMR1(gamesclientimpl, i);
        } else
        {
            return new PopupManager(gamesclientimpl, i);
        }
    }

    public void setGravity(int i)
    {
        zzaqu.gravity = i;
    }

    protected void zzfF(int i)
    {
        zzaqu = new PopupLocationInfo(i, new Binder());
    }

    public void zzo(View view)
    {
    }

    public void zztd()
    {
        zzaqt.zza(zzaqu.zzaqv, zzaqu.zztc());
    }

    public Bundle zzte()
    {
        return zzaqu.zztc();
    }

    public IBinder zztf()
    {
        return zzaqu.zzaqv;
    }

    public PopupLocationInfo zztg()
    {
        return zzaqu;
    }
}
