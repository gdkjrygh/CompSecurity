// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Intent;

// Referenced classes of package com.facebook.login:
//            LoginManager

class this._cls0
    implements com.facebook.internal.Impl.Callback
{

    final LoginManager this$0;

    public boolean onActivityResult(int i, Intent intent)
    {
        return LoginManager.this.onActivityResult(i, intent);
    }

    gerImpl.Callback()
    {
        this$0 = LoginManager.this;
        super();
    }
}
