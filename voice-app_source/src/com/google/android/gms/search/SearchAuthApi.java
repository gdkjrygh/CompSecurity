// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.search;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.search:
//            GoogleNowAuthState

public interface SearchAuthApi
{
    public static interface GoogleNowAuthResult
        extends Result
    {

        public abstract GoogleNowAuthState getGoogleNowAuthState();
    }


    public abstract PendingResult getGoogleNowAuth(GoogleApiClient googleapiclient, String s);
}
