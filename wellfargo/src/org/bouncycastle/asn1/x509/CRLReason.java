// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Integers;

public class CRLReason extends ASN1Object
{

    public static final int AA_COMPROMISE = 10;
    public static final int AFFILIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final int PRIVILEGE_WITHDRAWN = 9;
    public static final int REMOVE_FROM_CRL = 8;
    public static final int SUPERSEDED = 4;
    public static final int UNSPECIFIED = 0;
    public static final int aACompromise = 10;
    public static final int affiliationChanged = 3;
    public static final int cACompromise = 2;
    public static final int certificateHold = 6;
    public static final int cessationOfOperation = 5;
    public static final int keyCompromise = 1;
    public static final int privilegeWithdrawn = 9;
    private static final String reasonString[] = {
        "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
        "aACompromise"
    };
    public static final int removeFromCRL = 8;
    public static final int superseded = 4;
    private static final Hashtable table = new Hashtable();
    public static final int unspecified = 0;
    private ASN1Enumerated value;

    private CRLReason(int i)
    {
        value = new ASN1Enumerated(i);
    }

    public static CRLReason getInstance(Object obj)
    {
        if (obj instanceof CRLReason)
        {
            return (CRLReason)obj;
        }
        if (obj != null)
        {
            return lookup(ASN1Enumerated.getInstance(obj).getValue().intValue());
        } else
        {
            return null;
        }
    }

    public static CRLReason lookup(int i)
    {
        Integer integer = Integers.valueOf(i);
        if (!table.containsKey(integer))
        {
            table.put(integer, new CRLReason(i));
        }
        return (CRLReason)table.get(integer);
    }

    public BigInteger getValue()
    {
        return value.getValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return value;
    }

    public String toString()
    {
        int i = getValue().intValue();
        String s;
        if (i < 0 || i > 10)
        {
            s = "invalid";
        } else
        {
            s = reasonString[i];
        }
        return (new StringBuilder()).append("CRLReason: ").append(s).toString();
    }

}
