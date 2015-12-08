// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;


// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment

private class <init>
{

    private boolean ccDone;
    private boolean gcDone;
    private boolean mUpdated;
    final MobilePaySettingsFragment this$0;

    private void checkIfDone()
    {
        if (ccDone && gcDone)
        {
            MobilePaySettingsFragment.access$1200(MobilePaySettingsFragment.this, com.walmartlabs.android.payment.t);
            ((this._cls0)MobilePaySettingsFragment.access$1300(MobilePaySettingsFragment.this)).onDone(mUpdated);
        }
    }

    public void setCcDone(boolean flag)
    {
        ccDone = true;
        mUpdated = mUpdated | flag;
        checkIfDone();
    }

    public void setGcDone(boolean flag)
    {
        gcDone = true;
        mUpdated = mUpdated | flag;
        checkIfDone();
    }

    private ()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
