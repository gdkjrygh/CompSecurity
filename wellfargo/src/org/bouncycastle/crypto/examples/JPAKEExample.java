// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.examples;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroup;
import org.bouncycastle.crypto.agreement.jpake.JPAKEPrimeOrderGroups;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound1Payload;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound2Payload;
import org.bouncycastle.crypto.agreement.jpake.JPAKERound3Payload;
import org.bouncycastle.crypto.digests.SHA256Digest;

public class JPAKEExample
{

    public JPAKEExample()
    {
    }

    private static BigInteger deriveSessionKey(BigInteger biginteger)
    {
        SHA256Digest sha256digest = new SHA256Digest();
        biginteger = biginteger.toByteArray();
        byte abyte0[] = new byte[sha256digest.getDigestSize()];
        sha256digest.update(biginteger, 0, biginteger.length);
        sha256digest.doFinal(abyte0, 0);
        return new BigInteger(abyte0);
    }

    public static void main(String args[])
    {
        Object obj = JPAKEPrimeOrderGroups.NIST_3072;
        args = ((JPAKEPrimeOrderGroup) (obj)).getP();
        Object obj1 = ((JPAKEPrimeOrderGroup) (obj)).getQ();
        Object obj2 = ((JPAKEPrimeOrderGroup) (obj)).getG();
        System.out.println("********* Initialization **********");
        System.out.println("Public parameters for the cyclic group:");
        System.out.println((new StringBuilder()).append("p (").append(args.bitLength()).append(" bits): ").append(args.toString(16)).toString());
        System.out.println((new StringBuilder()).append("q (").append(((BigInteger) (obj1)).bitLength()).append(" bits): ").append(((BigInteger) (obj1)).toString(16)).toString());
        System.out.println((new StringBuilder()).append("g (").append(args.bitLength()).append(" bits): ").append(((BigInteger) (obj2)).toString(16)).toString());
        System.out.println((new StringBuilder()).append("p mod q = ").append(args.mod(((BigInteger) (obj1))).toString(16)).toString());
        System.out.println((new StringBuilder()).append("g^{q} mod p = ").append(((BigInteger) (obj2)).modPow(((BigInteger) (obj1)), args).toString(16)).toString());
        System.out.println("");
        System.out.println((new StringBuilder()).append("(Secret passwords used by Alice and Bob: \"").append("password").append("\" and \"").append("password").append("\")\n").toString());
        obj1 = new SHA256Digest();
        obj2 = new SecureRandom();
        args = new JPAKEParticipant("alice", "password".toCharArray(), ((JPAKEPrimeOrderGroup) (obj)), ((org.bouncycastle.crypto.Digest) (obj1)), ((SecureRandom) (obj2)));
        obj = new JPAKEParticipant("bob", "password".toCharArray(), ((JPAKEPrimeOrderGroup) (obj)), ((org.bouncycastle.crypto.Digest) (obj1)), ((SecureRandom) (obj2)));
        obj1 = args.createRound1PayloadToSend();
        obj2 = ((JPAKEParticipant) (obj)).createRound1PayloadToSend();
        System.out.println("************ Round 1 **************");
        System.out.println("Alice sends to Bob: ");
        System.out.println((new StringBuilder()).append("g^{x1}=").append(((JPAKERound1Payload) (obj1)).getGx1().toString(16)).toString());
        System.out.println((new StringBuilder()).append("g^{x2}=").append(((JPAKERound1Payload) (obj1)).getGx2().toString(16)).toString());
        System.out.println((new StringBuilder()).append("KP{x1}={").append(((JPAKERound1Payload) (obj1)).getKnowledgeProofForX1()[0].toString(16)).append("};{").append(((JPAKERound1Payload) (obj1)).getKnowledgeProofForX1()[1].toString(16)).append("}").toString());
        System.out.println((new StringBuilder()).append("KP{x2}={").append(((JPAKERound1Payload) (obj1)).getKnowledgeProofForX2()[0].toString(16)).append("};{").append(((JPAKERound1Payload) (obj1)).getKnowledgeProofForX2()[1].toString(16)).append("}").toString());
        System.out.println("");
        System.out.println("Bob sends to Alice: ");
        System.out.println((new StringBuilder()).append("g^{x3}=").append(((JPAKERound1Payload) (obj2)).getGx1().toString(16)).toString());
        System.out.println((new StringBuilder()).append("g^{x4}=").append(((JPAKERound1Payload) (obj2)).getGx2().toString(16)).toString());
        System.out.println((new StringBuilder()).append("KP{x3}={").append(((JPAKERound1Payload) (obj2)).getKnowledgeProofForX1()[0].toString(16)).append("};{").append(((JPAKERound1Payload) (obj2)).getKnowledgeProofForX1()[1].toString(16)).append("}").toString());
        System.out.println((new StringBuilder()).append("KP{x4}={").append(((JPAKERound1Payload) (obj2)).getKnowledgeProofForX2()[0].toString(16)).append("};{").append(((JPAKERound1Payload) (obj2)).getKnowledgeProofForX2()[1].toString(16)).append("}").toString());
        System.out.println("");
        args.validateRound1PayloadReceived(((JPAKERound1Payload) (obj2)));
        System.out.println("Alice checks g^{x4}!=1: OK");
        System.out.println("Alice checks KP{x3}: OK");
        System.out.println("Alice checks KP{x4}: OK");
        System.out.println("");
        ((JPAKEParticipant) (obj)).validateRound1PayloadReceived(((JPAKERound1Payload) (obj1)));
        System.out.println("Bob checks g^{x2}!=1: OK");
        System.out.println("Bob checks KP{x1},: OK");
        System.out.println("Bob checks KP{x2},: OK");
        System.out.println("");
        obj1 = args.createRound2PayloadToSend();
        obj2 = ((JPAKEParticipant) (obj)).createRound2PayloadToSend();
        System.out.println("************ Round 2 **************");
        System.out.println("Alice sends to Bob: ");
        System.out.println((new StringBuilder()).append("A=").append(((JPAKERound2Payload) (obj1)).getA().toString(16)).toString());
        System.out.println((new StringBuilder()).append("KP{x2*s}={").append(((JPAKERound2Payload) (obj1)).getKnowledgeProofForX2s()[0].toString(16)).append("},{").append(((JPAKERound2Payload) (obj1)).getKnowledgeProofForX2s()[1].toString(16)).append("}").toString());
        System.out.println("");
        System.out.println("Bob sends to Alice");
        System.out.println((new StringBuilder()).append("B=").append(((JPAKERound2Payload) (obj2)).getA().toString(16)).toString());
        System.out.println((new StringBuilder()).append("KP{x4*s}={").append(((JPAKERound2Payload) (obj2)).getKnowledgeProofForX2s()[0].toString(16)).append("},{").append(((JPAKERound2Payload) (obj2)).getKnowledgeProofForX2s()[1].toString(16)).append("}").toString());
        System.out.println("");
        args.validateRound2PayloadReceived(((JPAKERound2Payload) (obj2)));
        System.out.println("Alice checks KP{x4*s}: OK\n");
        ((JPAKEParticipant) (obj)).validateRound2PayloadReceived(((JPAKERound2Payload) (obj1)));
        System.out.println("Bob checks KP{x2*s}: OK\n");
        obj1 = args.calculateKeyingMaterial();
        obj2 = ((JPAKEParticipant) (obj)).calculateKeyingMaterial();
        System.out.println("********* After round 2 ***********");
        System.out.println((new StringBuilder()).append("Alice computes key material \t K=").append(((BigInteger) (obj1)).toString(16)).toString());
        System.out.println((new StringBuilder()).append("Bob computes key material \t K=").append(((BigInteger) (obj2)).toString(16)).toString());
        System.out.println();
        deriveSessionKey(((BigInteger) (obj1)));
        deriveSessionKey(((BigInteger) (obj2)));
        JPAKERound3Payload jpakeround3payload = args.createRound3PayloadToSend(((BigInteger) (obj1)));
        JPAKERound3Payload jpakeround3payload1 = ((JPAKEParticipant) (obj)).createRound3PayloadToSend(((BigInteger) (obj2)));
        System.out.println("************ Round 3 **************");
        System.out.println("Alice sends to Bob: ");
        System.out.println((new StringBuilder()).append("MacTag=").append(jpakeround3payload.getMacTag().toString(16)).toString());
        System.out.println("");
        System.out.println("Bob sends to Alice: ");
        System.out.println((new StringBuilder()).append("MacTag=").append(jpakeround3payload1.getMacTag().toString(16)).toString());
        System.out.println("");
        args.validateRound3PayloadReceived(jpakeround3payload1, ((BigInteger) (obj1)));
        System.out.println("Alice checks MacTag: OK\n");
        ((JPAKEParticipant) (obj)).validateRound3PayloadReceived(jpakeround3payload, ((BigInteger) (obj2)));
        System.out.println("Bob checks MacTag: OK\n");
        System.out.println();
        System.out.println("MacTags validated, therefore the keying material matches.");
    }
}
