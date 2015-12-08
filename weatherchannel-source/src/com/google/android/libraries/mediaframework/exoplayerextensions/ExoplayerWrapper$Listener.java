// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;


// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ExoplayerWrapper

public static interface 
{

    public abstract void onError(Exception exception);

    public abstract void onStateChanged(boolean flag, int i);

    public abstract void onVideoSizeChanged(int i, int j, int k, float f);
}
