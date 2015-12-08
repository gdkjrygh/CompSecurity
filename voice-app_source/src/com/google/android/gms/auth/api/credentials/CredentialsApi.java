// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            Credential, CredentialRequest

public interface CredentialsApi
{

    public abstract PendingResult delete(GoogleApiClient googleapiclient, Credential credential);

    public abstract PendingResult disableAutoSignIn(GoogleApiClient googleapiclient);

    public abstract PendingResult request(GoogleApiClient googleapiclient, CredentialRequest credentialrequest);

    public abstract PendingResult save(GoogleApiClient googleapiclient, Credential credential);
}
