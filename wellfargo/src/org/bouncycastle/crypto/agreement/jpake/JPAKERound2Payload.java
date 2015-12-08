// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.jpake;

import java.io.Serializable;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.agreement.jpake:
//            JPAKEUtil

public class JPAKERound2Payload
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final BigInteger a;
    private final BigInteger knowledgeProofForX2s[];
    private final String participantId;

    public JPAKERound2Payload(String s, BigInteger biginteger, BigInteger abiginteger[])
    {
        JPAKEUtil.validateNotNull(s, "participantId");
        JPAKEUtil.validateNotNull(biginteger, "a");
        JPAKEUtil.validateNotNull(abiginteger, "knowledgeProofForX2s");
        participantId = s;
        a = biginteger;
        knowledgeProofForX2s = Arrays.copyOf(abiginteger, abiginteger.length);
    }

    public BigInteger getA()
    {
        return a;
    }

    public BigInteger[] getKnowledgeProofForX2s()
    {
        return Arrays.copyOf(knowledgeProofForX2s, knowledgeProofForX2s.length);
    }

    public String getParticipantId()
    {
        return participantId;
    }
}
