// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.googleplus;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.contextlogic.wish.googleplus:
//            GooglePlusManager

private class <init>
    implements com.google.android.gms.common.api.init>, com.google.android.gms.common.api.init>
{

    final GooglePlusManager this$0;

    public void onConnected(Bundle bundle)
    {
        GooglePlusManager.access$502(GooglePlusManager.this, GooglePlusManager.access$600(GooglePlusManager.this));
        GooglePlusManager.access$602(GooglePlusManager.this, null);
        if (GooglePlusManager.access$700(GooglePlusManager.this) != null)
        {
            GooglePlusManager.access$700(GooglePlusManager.this).lletClientLoaded(GooglePlusManager.access$500(GooglePlusManager.this));
            clearWalletClientCallback();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        GooglePlusManager.access$502(GooglePlusManager.this, null);
        GooglePlusManager.access$602(GooglePlusManager.this, null);
        if (GooglePlusManager.access$700(GooglePlusManager.this) != null)
        {
            GooglePlusManager.access$700(GooglePlusManager.this).lletClientLoadFailed(connectionresult.getErrorCode());
            clearWalletClientCallback();
        }
    }

    public void onConnectionSuspended(int i)
    {
        GooglePlusManager.access$502(GooglePlusManager.this, null);
        GooglePlusManager.access$602(GooglePlusManager.this, null);
        if (GooglePlusManager.access$700(GooglePlusManager.this) != null)
        {
            GooglePlusManager.access$700(GooglePlusManager.this).lletClientLoadFailed(413);
            clearWalletClientCallback();
        }
    }

    private ()
    {
        this$0 = GooglePlusManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
