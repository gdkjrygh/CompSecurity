// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import java.io.UnsupportedEncodingException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            NTLMEngineImpl, NTLMEngineException

static class domainBytes extends domainBytes
{

    protected byte domainBytes[];
    protected byte hostBytes[];

    String getResponse()
    {
        prepareResponse(hostBytes.length + 32 + domainBytes.length, 1);
        addULong(0x20080235);
        addUShort(domainBytes.length);
        addUShort(domainBytes.length);
        addULong(hostBytes.length + 32);
        addUShort(hostBytes.length);
        addUShort(hostBytes.length);
        addULong(32);
        addBytes(hostBytes);
        addBytes(domainBytes);
        return super.etResponse();
    }

    (String s, String s1)
        throws NTLMEngineException
    {
        try
        {
            s1 = NTLMEngineImpl.access$400(s1);
            s = NTLMEngineImpl.access$500(s);
            hostBytes = s1.getBytes("UnicodeLittleUnmarked");
            domainBytes = s.toUpperCase().getBytes("UnicodeLittleUnmarked");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NTLMEngineException((new StringBuilder()).append("Unicode unsupported: ").append(s.getMessage()).toString(), s);
        }
    }
}
