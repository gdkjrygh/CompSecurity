// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.jpake;

import java.io.Serializable;
import java.math.BigInteger;

public class JPAKERound3Payload
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final BigInteger macTag;
    private final String participantId;

    public JPAKERound3Payload(String s, BigInteger biginteger)
    {
        participantId = s;
        macTag = biginteger;
    }

    public BigInteger getMacTag()
    {
        return macTag;
    }

    public String getParticipantId()
    {
        return participantId;
    }
}
