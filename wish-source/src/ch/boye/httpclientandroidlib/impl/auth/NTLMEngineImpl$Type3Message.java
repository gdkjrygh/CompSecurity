// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import java.io.UnsupportedEncodingException;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            NTLMEngineImpl, NTLMEngineException

static class  extends 
{

    protected byte domainBytes[];
    protected byte hostBytes[];
    protected byte lmResp[];
    protected byte ntResp[];
    protected int type2Flags;
    protected byte userBytes[];

    String getResponse()
    {
        int i = ntResp.length;
        int j = lmResp.length;
        int k = domainBytes.length;
        int l = hostBytes.length;
        int i1 = userBytes.length;
        int j1 = 64 + j;
        int k1 = j1 + i;
        int l1 = k1 + k;
        int i2 = l1 + i1;
        int j2 = i2 + l + 0;
        prepareResponse(j2, 3);
        addUShort(j);
        addUShort(j);
        addULong(64);
        addUShort(i);
        addUShort(i);
        addULong(j1);
        addUShort(k);
        addUShort(k);
        addULong(k1);
        addUShort(i1);
        addUShort(i1);
        addULong(l1);
        addUShort(l);
        addUShort(l);
        addULong(i2);
        addULong(0);
        addULong(j2);
        addULong(0x20000205 | type2Flags & 0x80000 | type2Flags & 0x10 | type2Flags & 0x20 | type2Flags & 0x40000000 | type2Flags & 0x8000);
        addBytes(lmResp);
        addBytes(ntResp);
        addBytes(domainBytes);
        addBytes(userBytes);
        addBytes(hostBytes);
        return super.etResponse();
    }

    (String s, String s1, String s2, String s3, byte abyte0[], int i, String s4, 
            byte abyte1[])
        throws NTLMEngineException
    {
        type2Flags = i;
        s1 = NTLMEngineImpl.access$400(s1);
        s = NTLMEngineImpl.access$500(s);
        if (abyte1 == null || s4 == null) goto _L2; else goto _L1
_L1:
        try
        {
            byte abyte2[] = NTLMEngineImpl.access$600();
            ntResp = NTLMEngineImpl.getNTLMv2Response(s4, s2, s3, abyte0, abyte2, abyte1);
            lmResp = NTLMEngineImpl.getLMv2Response(s4, s2, s3, abyte0, abyte2);
        }
        // Misplaced declaration of an exception variable
        catch (String s4)
        {
            ntResp = new byte[0];
            lmResp = NTLMEngineImpl.getLMResponse(s3, abyte0);
        }
_L3:
        try
        {
            domainBytes = s.toUpperCase().getBytes("UnicodeLittleUnmarked");
            hostBytes = s1.getBytes("UnicodeLittleUnmarked");
            userBytes = s2.getBytes("UnicodeLittleUnmarked");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NTLMEngineException((new StringBuilder()).append("Unicode not supported: ").append(s.getMessage()).toString(), s);
        }
_L2:
        if ((0x80000 & i) == 0)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        s4 = NTLMEngineImpl.access$700();
        ntResp = NTLMEngineImpl.getNTLM2SessionResponse(s3, abyte0, s4);
        lmResp = s4;
        break MISSING_BLOCK_LABEL_69;
        ntResp = NTLMEngineImpl.getNTLMResponse(s3, abyte0);
        lmResp = NTLMEngineImpl.getLMResponse(s3, abyte0);
          goto _L3
    }
}
