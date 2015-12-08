// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcs, zzcl

public class zzct
    implements NativeCustomTemplateAd
{

    private final zzcs zzvP;

    public zzct(zzcs zzcs1)
    {
        zzvP = zzcs1;
    }

    public List getAvailableAssetNames()
    {
        List list;
        try
        {
            list = zzvP.getAvailableAssetNames();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get available asset names.", remoteexception);
            return null;
        }
        return list;
    }

    public String getCustomTemplateId()
    {
        String s;
        try
        {
            s = zzvP.getCustomTemplateId();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get custom template id.", remoteexception);
            return null;
        }
        return s;
    }

    public com.google.android.gms.ads.formats.NativeAd.Image getImage(String s)
    {
        s = zzvP.zzR(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        s = new zzcl(s);
        return s;
        s;
        zzb.zzb("Failed to get image.", s);
        return null;
    }

    public CharSequence getText(String s)
    {
        try
        {
            s = zzvP.zzQ(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Failed to get string.", s);
            return null;
        }
        return s;
    }

    public void performClick(String s)
    {
        try
        {
            zzvP.performClick(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Failed to perform click.", s);
        }
    }

    public void recordImpression()
    {
        try
        {
            zzvP.recordImpression();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to record impression.", remoteexception);
        }
    }
}
