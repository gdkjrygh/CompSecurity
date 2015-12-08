// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import ch.boye.httpclientandroidlib.conn.scheme.SchemeRegistry;
import ch.boye.httpclientandroidlib.params.HttpParams;

// Referenced classes of package ch.boye.httpclientandroidlib.conn:
//            ClientConnectionManager

public interface ClientConnectionManagerFactory
{

    public abstract ClientConnectionManager newInstance(HttpParams httpparams, SchemeRegistry schemeregistry);
}
