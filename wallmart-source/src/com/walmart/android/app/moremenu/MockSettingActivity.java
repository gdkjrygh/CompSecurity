// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.os.Bundle;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.test.MockServiceListPresenter;
import com.walmart.android.ui.PresenterStack;

public class MockSettingActivity extends FullScreenActivity
{

    public MockSettingActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getPresenterStack().pushPresenter(new MockServiceListPresenter(this), false);
    }
}
