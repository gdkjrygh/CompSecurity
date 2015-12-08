// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GcmPubSub
{

    private static GcmPubSub zzazJ;
    private static final Pattern zzazL = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    private InstanceID zzazK;

    private GcmPubSub(Context context)
    {
        zzazK = InstanceID.getInstance(context);
    }

    public static GcmPubSub getInstance(Context context)
    {
        com/google/android/gms/gcm/GcmPubSub;
        JVM INSTR monitorenter ;
        if (zzazJ == null)
        {
            zzazJ = new GcmPubSub(context);
        }
        context = zzazJ;
        com/google/android/gms/gcm/GcmPubSub;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void subscribe(String s, String s1, Bundle bundle)
        throws IOException
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid appInstanceToken: ").append(s).toString());
        }
        if (s1 == null || !zzazL.matcher(s1).matches())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid topic name: ").append(s1).toString());
        }
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putString("gcm.topic", s1);
        zzazK.getToken(s, s1, bundle1);
    }

    public void unsubscribe(String s, String s1)
        throws IOException
    {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", s1);
        zzazK.zzb(s, s1, bundle);
    }

}
