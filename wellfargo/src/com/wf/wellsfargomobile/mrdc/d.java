// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.app.Activity;
import android.content.Intent;
import com.wf.wellsfargomobile.BaseWebViewActivity;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            ImageModeType, ImageCaptureType

public interface d
{

    public abstract void a();

    public abstract void a(Activity activity, ImageModeType imagemodetype);

    public abstract void a(Activity activity, ImageModeType imagemodetype, String s);

    public abstract boolean a(int i, int j, Intent intent, BaseWebViewActivity basewebviewactivity);

    public abstract byte[] a(Intent intent);

    public abstract String b(Intent intent);

    public abstract void b(Activity activity, ImageModeType imagemodetype);

    public abstract ImageCaptureType c(Intent intent);

    public abstract void c(Activity activity, ImageModeType imagemodetype);
}
