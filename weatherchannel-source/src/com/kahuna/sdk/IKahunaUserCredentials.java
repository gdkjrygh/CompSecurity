// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import java.util.Map;

// Referenced classes of package com.kahuna.sdk:
//            KahunaUserCredentials

public interface IKahunaUserCredentials
{

    public abstract void add(String s, String s1);

    public abstract boolean areCredentialsEqual(KahunaUserCredentials kahunausercredentials);

    public abstract Map getCredentialsAsMap();

    public abstract boolean isEmpty();
}
