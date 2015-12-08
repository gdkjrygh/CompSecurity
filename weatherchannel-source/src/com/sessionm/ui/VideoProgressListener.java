// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            SessionMVideoView

public interface VideoProgressListener
{

    public abstract void onVideoCompleted(SessionMVideoView sessionmvideoview);

    public abstract void onVideoProgress(SessionMVideoView sessionmvideoview, int i);

    public abstract void onVideoStarted(SessionMVideoView sessionmvideoview);
}
