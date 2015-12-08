// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//            zze, zzd, zzc

public final class zzb extends zzc.zza
{

    private Fragment zzajt;

    private zzb(Fragment fragment)
    {
        zzajt = fragment;
    }

    public static zzb zza(Fragment fragment)
    {
        if (fragment != null)
        {
            return new zzb(fragment);
        } else
        {
            return null;
        }
    }

    public Bundle getArguments()
    {
        return zzajt.getArguments();
    }

    public int getId()
    {
        return zzajt.getId();
    }

    public boolean getRetainInstance()
    {
        return zzajt.getRetainInstance();
    }

    public String getTag()
    {
        return zzajt.getTag();
    }

    public int getTargetRequestCode()
    {
        return zzajt.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return zzajt.getUserVisibleHint();
    }

    public zzd getView()
    {
        return zze.zzw(zzajt.getView());
    }

    public boolean isAdded()
    {
        return zzajt.isAdded();
    }

    public boolean isDetached()
    {
        return zzajt.isDetached();
    }

    public boolean isHidden()
    {
        return zzajt.isHidden();
    }

    public boolean isInLayout()
    {
        return zzajt.isInLayout();
    }

    public boolean isRemoving()
    {
        return zzajt.isRemoving();
    }

    public boolean isResumed()
    {
        return zzajt.isResumed();
    }

    public boolean isVisible()
    {
        return zzajt.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        zzajt.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        zzajt.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        zzajt.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        zzajt.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        zzajt.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        zzajt.startActivityForResult(intent, i);
    }

    public void zzl(zzd zzd)
    {
        zzd = (View)zze.zzn(zzd);
        zzajt.registerForContextMenu(zzd);
    }

    public void zzm(zzd zzd)
    {
        zzd = (View)zze.zzn(zzd);
        zzajt.unregisterForContextMenu(zzd);
    }

    public zzd zzqk()
    {
        return zze.zzw(zzajt.getActivity());
    }

    public zzc zzql()
    {
        return zza(zzajt.getParentFragment());
    }

    public zzd zzqm()
    {
        return zze.zzw(zzajt.getResources());
    }

    public zzc zzqn()
    {
        return zza(zzajt.getTargetFragment());
    }
}
