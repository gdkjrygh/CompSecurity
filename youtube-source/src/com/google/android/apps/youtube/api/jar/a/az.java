// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.google.android.youtube.player.internal.b.d;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ba

public final class az extends ContextWrapper
{

    private static final Class a[] = {
        android/content/Context, android/util/AttributeSet
    };
    private final Resources b;
    private final LayoutInflater c;
    private final android.content.res.Resources.Theme d;
    private final AssetManager e;

    public az(Context context, Resources resources, ClassLoader classloader, android.content.res.Resources.Theme theme)
    {
        super(context);
        b = (Resources)com.google.android.youtube.player.internal.b.d.a(resources, "resources cannot be null");
        d = (android.content.res.Resources.Theme)com.google.android.youtube.player.internal.b.d.a(theme, "theme cannot be null");
        e = resources.getAssets();
        context = ((LayoutInflater)super.getSystemService("layout_inflater")).cloneInContext(this);
        context.setFactory(new ba(classloader));
        c = context;
    }

    static Class[] a()
    {
        return a;
    }

    public final Context getApplicationContext()
    {
        return super.getApplicationContext();
    }

    public final AssetManager getAssets()
    {
        return e;
    }

    public final Context getBaseContext()
    {
        return super.getBaseContext();
    }

    public final Resources getResources()
    {
        return b;
    }

    public final Object getSystemService(String s)
    {
        if ("layout_inflater".equals(s))
        {
            return c;
        } else
        {
            return super.getSystemService(s);
        }
    }

    public final android.content.res.Resources.Theme getTheme()
    {
        return d;
    }

}
