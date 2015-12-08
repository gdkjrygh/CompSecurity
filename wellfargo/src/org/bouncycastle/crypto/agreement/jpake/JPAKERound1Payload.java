// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.jpake;

import java.io.Serializable;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.agreement.jpake:
//            JPAKEUtil

public class JPAKERound1Payload
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final BigInteger gx1;
    private final BigInteger gx2;
    private final BigInteger knowledgeProofForX1[];
    private final BigInteger knowledgeProofForX2[];
    private final String participantId;

    public JPAKERound1Payload(String s, BigInteger biginteger, BigInteger biginteger1, BigInteger abiginteger[], BigInteger abiginteger1[])
    {
        JPAKEUtil.validateNotNull(s, "participantId");
        JPAKEUtil.validateNotNull(biginteger, "gx1");
        JPAKEUtil.validateNotNull(biginteger1, "gx2");
        JPAKEUtil.validateNotNull(abiginteger, "knowledgeProofForX1");
        JPAKEUtil.validateNotNull(abiginteger1, "knowledgeProofForX2");
        participantId = s;
        gx1 = biginteger;
        gx2 = biginteger1;
        knowledgeProofForX1 = Arrays.copyOf(abiginteger, abiginteger.length);
        knowledgeProofForX2 = Arrays.copyOf(abiginteger1, abiginteger1.length);
    }

    public BigInteger getGx1()
    {
        return gx1;
    }

    public BigInteger getGx2()
    {
        return gx2;
    }

    public BigInteger[] getKnowledgeProofForX1()
    {
        return Arrays.copyOf(knowledgeProofForX1, knowledgeProofForX1.length);
    }

    public BigInteger[] getKnowledgeProofForX2()
    {
        return Arrays.copyOf(knowledgeProofForX2, knowledgeProofForX2.length);
    }

    public String getParticipantId()
    {
        return participantId;
    }
}
