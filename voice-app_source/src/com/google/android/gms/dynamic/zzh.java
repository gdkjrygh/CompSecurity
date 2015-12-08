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

    private Fragment zzZX;

    private zzh(Fragment fragment)
    {
        zzZX = fragment;
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
        return zzZX.getArguments();
    }

    public int getId()
    {
        return zzZX.getId();
    }

    public boolean getRetainInstance()
    {
        return zzZX.getRetainInstance();
    }

    public String getTag()
    {
        return zzZX.getTag();
    }

    public int getTargetRequestCode()
    {
        return zzZX.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return zzZX.getUserVisibleHint();
    }

    public zzd getView()
    {
        return zze.zzw(zzZX.getView());
    }

    public boolean isAdded()
    {
        return zzZX.isAdded();
    }

    public boolean isDetached()
    {
        return zzZX.isDetached();
    }

    public boolean isHidden()
    {
        return zzZX.isHidden();
    }

    public boolean isInLayout()
    {
        return zzZX.isInLayout();
    }

    public boolean isRemoving()
    {
        return zzZX.isRemoving();
    }

    public boolean isResumed()
    {
        return zzZX.isResumed();
    }

    public boolean isVisible()
    {
        return zzZX.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        zzZX.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        zzZX.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        zzZX.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        zzZX.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        zzZX.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        zzZX.startActivityForResult(intent, i);
    }

    public void zzl(zzd zzd)
    {
        zzd = (View)zze.zzn(zzd);
        zzZX.registerForContextMenu(zzd);
    }

    public void zzm(zzd zzd)
    {
        zzd = (View)zze.zzn(zzd);
        zzZX.unregisterForContextMenu(zzd);
    }

    public zzd zzqk()
    {
        return zze.zzw(zzZX.getActivity());
    }

    public zzc zzql()
    {
        return zza(zzZX.getParentFragment());
    }

    public zzd zzqm()
    {
        return zze.zzw(zzZX.getResources());
    }

    public zzc zzqn()
    {
        return zza(zzZX.getTargetFragment());
    }
}
