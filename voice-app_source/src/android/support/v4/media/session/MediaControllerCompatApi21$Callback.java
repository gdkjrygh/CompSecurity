// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompatApi21

public static interface 
{

    public abstract void onMetadataChanged(Object obj);

    public abstract void onPlaybackStateChanged(Object obj);

    public abstract void onSessionDestroyed();

    public abstract void onSessionEvent(String s, Bundle bundle);
}
