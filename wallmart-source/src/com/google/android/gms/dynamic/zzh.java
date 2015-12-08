// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//            zze, zzd, zzc

public final class zzh extends zzc.zza
{

    private Fragment zzadh;

    private zzh(Fragment fragment)
    {
        zzadh = fragment;
    }

    public static zzh zza(Fragment fragment)
    {
        if (fragment != null)
        {
            return new zzh(fragment);
        } else
        {
            return null;
        }
    }

    public Bundle getArguments()
    {
        return zzadh.getArguments();
    }

    public int getId()
    {
        return zzadh.getId();
    }

    public boolean getRetainInstance()
    {
        return zzadh.getRetainInstance();
    }

    public String getTag()
    {
        return zzadh.getTag();
    }

    public int getTargetRequestCode()
    {
        return zzadh.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return zzadh.getUserVisibleHint();
    }

    public zzd getView()
    {
        return zze.zzx(zzadh.getView());
    }

    public boolean isAdded()
    {
        return zzadh.isAdded();
    }

    public boolean isDetached()
    {
        return zzadh.isDetached();
    }

    public boolean isHidden()
    {
        return zzadh.isHidden();
    }

    public boolean isInLayout()
    {
        return zzadh.isInLayout();
    }

    public boolean isRemoving()
    {
        return zzadh.isRemoving();
    }

    public boolean isResumed()
    {
        return zzadh.isResumed();
    }

    public boolean isVisible()
    {
        return zzadh.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        zzadh.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        zzadh.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        zzadh.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        zzadh.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        zzadh.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        zzadh.startActivityForResult(intent, i);
    }

    public void zzn(zzd zzd)
    {
        zzd = (View)zze.zzp(zzd);
        zzadh.registerForContextMenu(zzd);
    }

    public void zzo(zzd zzd)
    {
        zzd = (View)zze.zzp(zzd);
        zzadh.unregisterForContextMenu(zzd);
    }

    public zzd zzro()
    {
        return zze.zzx(zzadh.getActivity());
    }

    public zzc zzrp()
    {
        return zza(zzadh.getParentFragment());
    }

    public zzd zzrq()
    {
        return zze.zzx(zzadh.getResources());
    }

    public zzc zzrr()
    {
        return zza(zzadh.getTargetFragment());
    }
}
