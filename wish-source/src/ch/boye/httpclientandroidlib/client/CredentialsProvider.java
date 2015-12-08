// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client;

import ch.boye.httpclientandroidlib.auth.AuthScope;
import ch.boye.httpclientandroidlib.auth.Credentials;

public interface CredentialsProvider
{

    public abstract void clear();

    public abstract Credentials getCredentials(AuthScope authscope);

    public abstract void setCredentials(AuthScope authscope, Credentials credentials);
}
