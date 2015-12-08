// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import android.app.Activity;

// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

public static interface 
{

    public abstract Activity getActivityForErrorResolution();

    public abstract void onFailure();

    public abstract void onSilentFailure();

    public abstract void onSuccess();
}
