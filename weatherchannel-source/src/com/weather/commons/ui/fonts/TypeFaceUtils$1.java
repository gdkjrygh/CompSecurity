// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.fonts;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

// Referenced classes of package com.weather.commons.ui.fonts:
//            TypeFaceUtils

static final class val.name
    implements Callable
{

    final Context val$context;
    final String val$name;

    public Typeface call()
    {
        return Typeface.createFromAsset(val$context.getAssets(), (new StringBuilder()).append("fonts/").append(val$name).toString());
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    (Context context1, String s)
    {
        val$context = context1;
        val$name = s;
        super();
    }
}
