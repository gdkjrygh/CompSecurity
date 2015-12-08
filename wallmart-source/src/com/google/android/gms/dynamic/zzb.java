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

    private Fragment zzamZ;

    private zzb(Fragment fragment)
    {
        zzamZ = fragment;
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
        return zzamZ.getArguments();
    }

    public int getId()
    {
        return zzamZ.getId();
    }

    public boolean getRetainInstance()
    {
        return zzamZ.getRetainInstance();
    }

    public String getTag()
    {
        return zzamZ.getTag();
    }

    public int getTargetRequestCode()
    {
        return zzamZ.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return zzamZ.getUserVisibleHint();
    }

    public zzd getView()
    {
        return zze.zzx(zzamZ.getView());
    }

    public boolean isAdded()
    {
        return zzamZ.isAdded();
    }

    public boolean isDetached()
    {
        return zzamZ.isDetached();
    }

    public boolean isHidden()
    {
        return zzamZ.isHidden();
    }

    public boolean isInLayout()
    {
        return zzamZ.isInLayout();
    }

    public boolean isRemoving()
    {
        return zzamZ.isRemoving();
    }

    public boolean isResumed()
    {
        return zzamZ.isResumed();
    }

    public boolean isVisible()
    {
        return zzamZ.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        zzamZ.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        zzamZ.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        zzamZ.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        zzamZ.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        zzamZ.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        zzamZ.startActivityForResult(intent, i);
    }

    public void zzn(zzd zzd)
    {
        zzd = (View)zze.zzp(zzd);
        zzamZ.registerForContextMenu(zzd);
    }

    public void zzo(zzd zzd)
    {
        zzd = (View)zze.zzp(zzd);
        zzamZ.unregisterForContextMenu(zzd);
    }

    public zzd zzro()
    {
        return zze.zzx(zzamZ.getActivity());
    }

    public zzc zzrp()
    {
        return zza(zzamZ.getParentFragment());
    }

    public zzd zzrq()
    {
        return zze.zzx(zzamZ.getResources());
    }

    public zzc zzrr()
    {
        return zza(zzamZ.getTargetFragment());
    }
}
