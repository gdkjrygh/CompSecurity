// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.content.SharedPreferences;
import io.fabric.sdk.android.Kit;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//            PreferenceStore

public class PreferenceStoreImpl
    implements PreferenceStore
{

    private final Context context;
    private final String preferenceName;
    private final SharedPreferences sharedPreferences;

    public PreferenceStoreImpl(Context context1, String s)
    {
        if (context1 == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            context = context1;
            preferenceName = s;
            sharedPreferences = context.getSharedPreferences(preferenceName, 0);
            return;
        }
    }

    public PreferenceStoreImpl(Kit kit)
    {
        this(kit.getContext(), kit.getClass().getName());
    }

    public android.content.SharedPreferences.Editor edit()
    {
        return sharedPreferences.edit();
    }

    public SharedPreferences get()
    {
        return sharedPreferences;
    }

    public boolean save(android.content.SharedPreferences.Editor editor)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            editor.apply();
            return true;
        } else
        {
            return editor.commit();
        }
    }
}
