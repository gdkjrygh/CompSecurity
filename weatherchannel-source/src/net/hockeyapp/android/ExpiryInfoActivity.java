// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import net.hockeyapp.android.views.ExpiryInfoView;

// Referenced classes of package net.hockeyapp.android:
//            UpdateManager, Strings

public class ExpiryInfoActivity extends Activity
{

    public ExpiryInfoActivity()
    {
    }

    protected View getLayoutView()
    {
        return new ExpiryInfoView(this, getStringResource(769));
    }

    protected String getStringResource(int i)
    {
        return Strings.get(UpdateManager.getLastListener(), i);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(getStringResource(768));
        setContentView(getLayoutView());
    }
}
