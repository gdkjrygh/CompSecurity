// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import java.util.concurrent.Callable;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaUserCredentials, KahunaPreferences, IKahunaUserCredentials

class this._cls0
    implements Callable
{

    final KahunaCommon this$0;

    public IKahunaUserCredentials call()
    {
        return new KahunaUserCredentials(KahunaPreferences.getUserCredentialsNew(KahunaCommon.access$000(KahunaCommon.this)));
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    entials()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
