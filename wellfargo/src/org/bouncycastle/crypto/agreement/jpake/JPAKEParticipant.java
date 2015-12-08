// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.agreement.jpake:
//            JPAKEPrimeOrderGroups, JPAKEUtil, JPAKEPrimeOrderGroup, JPAKERound1Payload, 
//            JPAKERound2Payload, JPAKERound3Payload

public class JPAKEParticipant
{

    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;
    private BigInteger b;
    private final Digest digest;
    private final BigInteger g;
    private BigInteger gx1;
    private BigInteger gx2;
    private BigInteger gx3;
    private BigInteger gx4;
    private final BigInteger p;
    private final String participantId;
    private String partnerParticipantId;
    private char password[];
    private final BigInteger q;
    private final SecureRandom random;
    private int state;
    private BigInteger x1;
    private BigInteger x2;

    public JPAKEParticipant(String s, char ac[])
    {
        this(s, ac, JPAKEPrimeOrderGroups.NIST_3072);
    }

    public JPAKEParticipant(String s, char ac[], JPAKEPrimeOrderGroup jpakeprimeordergroup)
    {
        this(s, ac, jpakeprimeordergroup, ((Digest) (new SHA256Digest())), new SecureRandom());
    }

    public JPAKEParticipant(String s, char ac[], JPAKEPrimeOrderGroup jpakeprimeordergroup, Digest digest1, SecureRandom securerandom)
    {
        JPAKEUtil.validateNotNull(s, "participantId");
        JPAKEUtil.validateNotNull(ac, "password");
        JPAKEUtil.validateNotNull(jpakeprimeordergroup, "p");
        JPAKEUtil.validateNotNull(digest1, "digest");
        JPAKEUtil.validateNotNull(securerandom, "random");
        if (ac.length == 0)
        {
            throw new IllegalArgumentException("Password must not be empty.");
        } else
        {
            participantId = s;
            password = Arrays.copyOf(ac, ac.length);
            p = jpakeprimeordergroup.getP();
            q = jpakeprimeordergroup.getQ();
            g = jpakeprimeordergroup.getG();
            digest = digest1;
            random = securerandom;
            state = 0;
            return;
        }
    }

    public BigInteger calculateKeyingMaterial()
    {
        if (state >= 50)
        {
            throw new IllegalStateException((new StringBuilder()).append("Key already calculated for ").append(participantId).toString());
        }
        if (state < 40)
        {
            throw new IllegalStateException((new StringBuilder()).append("Round2 payload must be validated prior to creating key for ").append(participantId).toString());
        } else
        {
            BigInteger biginteger = JPAKEUtil.calculateS(password);
            Arrays.fill(password, '\0');
            password = null;
            biginteger = JPAKEUtil.calculateKeyingMaterial(p, q, gx4, x2, biginteger, b);
            x1 = null;
            x2 = null;
            b = null;
            state = 50;
            return biginteger;
        }
    }

    public JPAKERound1Payload createRound1PayloadToSend()
    {
        if (state >= 10)
        {
            throw new IllegalStateException((new StringBuilder()).append("Round1 payload already created for ").append(participantId).toString());
        } else
        {
            x1 = JPAKEUtil.generateX1(q, random);
            x2 = JPAKEUtil.generateX2(q, random);
            gx1 = JPAKEUtil.calculateGx(p, g, x1);
            gx2 = JPAKEUtil.calculateGx(p, g, x2);
            BigInteger abiginteger[] = JPAKEUtil.calculateZeroKnowledgeProof(p, q, g, gx1, x1, participantId, digest, random);
            BigInteger abiginteger1[] = JPAKEUtil.calculateZeroKnowledgeProof(p, q, g, gx2, x2, participantId, digest, random);
            state = 10;
            return new JPAKERound1Payload(participantId, gx1, gx2, abiginteger, abiginteger1);
        }
    }

    public JPAKERound2Payload createRound2PayloadToSend()
    {
        if (state >= 30)
        {
            throw new IllegalStateException((new StringBuilder()).append("Round2 payload already created for ").append(participantId).toString());
        }
        if (state < 20)
        {
            throw new IllegalStateException((new StringBuilder()).append("Round1 payload must be validated prior to creating Round2 payload for ").append(participantId).toString());
        } else
        {
            BigInteger biginteger = JPAKEUtil.calculateGA(p, gx1, gx3, gx4);
            BigInteger biginteger1 = JPAKEUtil.calculateS(password);
            BigInteger biginteger2 = JPAKEUtil.calculateX2s(q, x2, biginteger1);
            biginteger1 = JPAKEUtil.calculateA(p, q, biginteger, biginteger2);
            BigInteger abiginteger[] = JPAKEUtil.calculateZeroKnowledgeProof(p, q, biginteger, biginteger1, biginteger2, participantId, digest, random);
            state = 30;
            return new JPAKERound2Payload(participantId, biginteger1, abiginteger);
        }
    }

    public JPAKERound3Payload createRound3PayloadToSend(BigInteger biginteger)
    {
        if (state >= 60)
        {
            throw new IllegalStateException((new StringBuilder()).append("Round3 payload already created for ").append(participantId).toString());
        }
        if (state < 50)
        {
            throw new IllegalStateException((new StringBuilder()).append("Keying material must be calculated prior to creating Round3 payload for ").append(participantId).toString());
        } else
        {
            biginteger = JPAKEUtil.calculateMacTag(participantId, partnerParticipantId, gx1, gx2, gx3, gx4, biginteger, digest);
            state = 60;
            return new JPAKERound3Payload(participantId, biginteger);
        }
    }

    public int getState()
    {
        return state;
    }

    public void validateRound1PayloadReceived(JPAKERound1Payload jpakeround1payload)
    {
        if (state >= 20)
        {
            throw new IllegalStateException((new StringBuilder()).append("Validation already attempted for round1 payload for").append(participantId).toString());
        } else
        {
            partnerParticipantId = jpakeround1payload.getParticipantId();
            gx3 = jpakeround1payload.getGx1();
            gx4 = jpakeround1payload.getGx2();
            BigInteger abiginteger[] = jpakeround1payload.getKnowledgeProofForX1();
            BigInteger abiginteger1[] = jpakeround1payload.getKnowledgeProofForX2();
            JPAKEUtil.validateParticipantIdsDiffer(participantId, jpakeround1payload.getParticipantId());
            JPAKEUtil.validateGx4(gx4);
            JPAKEUtil.validateZeroKnowledgeProof(p, q, g, gx3, abiginteger, jpakeround1payload.getParticipantId(), digest);
            JPAKEUtil.validateZeroKnowledgeProof(p, q, g, gx4, abiginteger1, jpakeround1payload.getParticipantId(), digest);
            state = 20;
            return;
        }
    }

    public void validateRound2PayloadReceived(JPAKERound2Payload jpakeround2payload)
    {
        if (state >= 40)
        {
            throw new IllegalStateException((new StringBuilder()).append("Validation already attempted for round2 payload for").append(participantId).toString());
        }
        if (state < 20)
        {
            throw new IllegalStateException((new StringBuilder()).append("Round1 payload must be validated prior to validating Round2 payload for ").append(participantId).toString());
        } else
        {
            BigInteger biginteger = JPAKEUtil.calculateGA(p, gx3, gx1, gx2);
            b = jpakeround2payload.getA();
            BigInteger abiginteger[] = jpakeround2payload.getKnowledgeProofForX2s();
            JPAKEUtil.validateParticipantIdsDiffer(participantId, jpakeround2payload.getParticipantId());
            JPAKEUtil.validateParticipantIdsEqual(partnerParticipantId, jpakeround2payload.getParticipantId());
            JPAKEUtil.validateGa(biginteger);
            JPAKEUtil.validateZeroKnowledgeProof(p, q, biginteger, b, abiginteger, jpakeround2payload.getParticipantId(), digest);
            state = 40;
            return;
        }
    }

    public void validateRound3PayloadReceived(JPAKERound3Payload jpakeround3payload, BigInteger biginteger)
    {
        if (state >= 70)
        {
            throw new IllegalStateException((new StringBuilder()).append("Validation already attempted for round3 payload for").append(participantId).toString());
        }
        if (state < 50)
        {
            throw new IllegalStateException((new StringBuilder()).append("Keying material must be calculated validated prior to validating Round3 payload for ").append(participantId).toString());
        } else
        {
            JPAKEUtil.validateParticipantIdsDiffer(participantId, jpakeround3payload.getParticipantId());
            JPAKEUtil.validateParticipantIdsEqual(partnerParticipantId, jpakeround3payload.getParticipantId());
            JPAKEUtil.validateMacTag(participantId, partnerParticipantId, gx1, gx2, gx3, gx4, biginteger, digest, jpakeround3payload.getMacTag());
            gx1 = null;
            gx2 = null;
            gx3 = null;
            gx4 = null;
            state = 70;
            return;
        }
    }
}
